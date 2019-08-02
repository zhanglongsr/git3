/**
 * Copyright (C) 2011-2021 liepin Inc.All Rights Reserved.
 * 
 * FileName:ApiMain.java
 *
 * Description：简要描述本文件的内容
 *
 * History：
 * 版本号           作者                  日期               简要介绍相关操作
 *  1.0  DELL  2019年8月1日
 *
 */
package com.liepin.h.web.common.util;

import com.liepin.hcommon.util.generator.webapi.WebAPIGenerator;

/**
 * @author DELL
 *
 */
public class ApiMain {
    public static void main(String[] args) {

        try {
            String api = WebAPIGenerator.genWebApi(null);
            System.out.println(api);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
