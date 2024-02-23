/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.rpc.common.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:zhanggeng.zg@antfin.com">GengZhang</a>
 */
public class TestReflect {
    private static String f4 = "";
    private final String f3 = "";
    /*--- not ok field -- */
    public String f1;
    private int s;
    private String name;
    private boolean b;
    private String f2;
    private List f5 = new ArrayList() {
    };

    public static String get2() {
        return null;
    }

    public static void set2(int s) {
    }

    public int getS() {
        return s;
    }

    public TestReflect setS(int s) {
        this.s = s;
        return this;
    }

    public String getName() {
        return name;
    }

    public TestReflect setName(String name) {
        this.name = name;
        return this;
    }

    public boolean isB() {
        return b;
    }

    public TestReflect setB(boolean b) {
        this.b = b;
        return this;
    }

    /*--- not ok methods -- */
    public String get() {
        return null;
    }

    public String is() {
        return null;
    }

    private void get1() {
    }

    public void get3() {
    }

    public String get4(String s) {
        return null;
    }

    public String aget5() {
        return null;
    }

    public String ais5() {
        return null;
    }

    public void set(int s) {
    }

    private void set1(int s) {
    }

    public void set3(int s, int s2) {
    }

    public void aset4(int s) {
    }

}