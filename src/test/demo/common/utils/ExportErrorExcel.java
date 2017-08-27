package common.utils;

import entity.ErrorInfo;
import org.apache.poi.hssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MrSpin on 2017/8/22.
 */
public class ExportErrorExcel {

    public static void main(String[] args) {
        //第一步创建workbook
        HSSFWorkbook wb = new HSSFWorkbook();

        //第二步创建sheet
        HSSFSheet sheet = wb.createSheet("身份证错误信息");

        //第三步创建行row:添加表头0行
        HSSFRow row = sheet.createRow(0);
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  //居中


        //第四步创建单元格
        HSSFCell cell = row.createCell(0);         //第一个单元格
        cell.setCellValue("编号");                  //设定值
        cell.setCellStyle(style);                   //内容居中

         row.createCell(1);         //第一个单元格
        cell.setCellValue("姓名");                  //设定值
        cell.setCellStyle(style);                   //内容居中

        cell = row.createCell(2);
        cell.setCellValue("身份证");
        cell.setCellStyle(style);

        cell = row.createCell(3);
        cell.setCellValue("错误状态");
        cell.setCellStyle(style);

        cell = row.createCell(4);
        cell.setCellValue("错误信息");
        cell.setCellStyle(style);

        //第五步插入数据
        List<ErrorInfo> list = ExportErrorExcel.getErrorCondition();
        for (int i = 0; i < list.size(); i++) {
            ErrorInfo errorCondition = list.get(i);
            //创建行
            row = sheet.createRow(i+1);
            //创建单元格并且添加数据
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue(errorCondition.getName());
            row.createCell(2).setCellValue(errorCondition.getIdCard());
            row.createCell(3).setCellValue(errorCondition.getStatus());
            row.createCell(4).setCellValue(errorCondition.getMessage());
        }

        //第六步将生成excel文件保存到指定路径下
        try {
            FileOutputStream fout = new FileOutputStream("E:\\testFiles\\errorCondition.xls");
            wb.write(fout);
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel文件生成成功...");
    }

    public static List<ErrorInfo> getErrorCondition(){
        List<ErrorInfo> list = new ArrayList<ErrorInfo>();
        for (int i=0;i<20000;i++){
            String status = "L";
            String errReason = "长度错误";
            if (i/3==1){
                errReason = "校验错误";
                status = "X";
            }
            if (i/3==2){
                errReason = "身份证信息为空";
                status = "N";
            }
            ErrorInfo r1 = new ErrorInfo("UserName_"+i, "4306821989021611"+i, status, errReason);
            list.add(r1);

        }

        return list;
    }
}
