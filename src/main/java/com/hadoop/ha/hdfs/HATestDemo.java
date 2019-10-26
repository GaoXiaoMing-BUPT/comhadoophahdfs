/**
 * Created with IntelliJ IDEA.
 * User: gxm
 * Date: 2019/10/26
 * Time: 9:43
 * To change this template use File | Settings | File Templates.
 * Description:
 **/
package com.hadoop.ha.hdfs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.net.URISyntaxException;

public class HATestDemo {
    private static final Log logger = LogFactory.getLog(HATestDemo.class);

    public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
        HdfsUtilHA utilHA = new HdfsUtilHA();
        utilHA.listFiles("/", true);
/*        if (utilHA.mkdir("/MRInput")) {
            logger.info(" create dict success");
        } else {
            logger.error("create dict fail");
            System.exit(1);
        }*/
        utilHA.upload(System.getProperty("user.dir") + "\\data\\log.txt","/MRInput");
        //utilHA.upload(System.getProperty("user.dir") + "\\data\\temperature.txt","/src");
    }
}
