package cn.ylcto.test;

import cn.ylcto.util.MD5Code;

/**
 * Created by jigao on 2018/2/2.
 */
public class TestMD5Code {
    public static void main(String[] args) {
        String name = "Top";
        String name2 = "ylcto@163.com";
        String password = "Top";
        String password2 = "ylcto";
        MD5Code md5Code =new MD5Code();
        System.out.println(md5Code.getMD5ofStr(name+password));
        System.out.println(md5Code.getMD5ofStr(name2+password2));
        System.out.println(md5Code.getMD5ofStr(password2+name2));

        String num="123456";
        System.out.println(md5Code.getMD5ofStr(num));
    }
}
