package com.baidu.common.test.base.utils.hadoop;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HDFSUtils {

    /**
     * 从HDFS上读取文件
     * 
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void readFromHdfs() throws FileNotFoundException, IOException {
        String dst = "hdfs://yq01-wutai-hdfs.dmop.baidu.com:54310/app/ecom/cm/offline_dc/tmp/hello.txt";
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(URI.create(dst), conf);
        FSDataInputStream hdfsInStream = fs.open(new Path(dst));

        OutputStream out = new FileOutputStream("d:/qq-hdfs.txt");
        byte[] ioBuffer = new byte[1024];
        int readLen = hdfsInStream.read(ioBuffer);

        while (-1 != readLen) {
            out.write(ioBuffer, 0, readLen);
            readLen = hdfsInStream.read(ioBuffer);
        }
        out.close();
        hdfsInStream.close();
        fs.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        readFromHdfs();
    }

}
