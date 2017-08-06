package test.demo;

import java.io.File;
import java.util.Iterator;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
    public class ExifDemo {
        public static void main(String[] args) throws Exception {
            File jpegFile = new File("E:\\家人\\丽丽\\LiLi2.jpg");
            Metadata metadata = JpegMetadataReader.readMetadata(jpegFile);
            Iterable<Directory> dis = metadata.getDirectories();
            for (Directory directory : metadata.getDirectories()) {
                for (Tag tag : directory.getTags()) {
                    System.out.println(tag);
                }
            }
// Iterator tags = (Iterator) metadata.getDirectories();
//            while (dis.iterator().hasNext()) {
//            }
        }
    }
