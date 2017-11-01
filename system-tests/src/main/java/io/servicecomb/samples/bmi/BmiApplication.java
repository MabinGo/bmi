/*
 *  Copyright 2017 Huawei Technologies Co., Ltd
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.servicecomb.samples.bmi;

import static java.lang.Thread.sleep;

import org.springframework.web.client.RestTemplate;


public class BmiApplication {

  public static void main(String[] args) throws InterruptedException {
    sleep(10000);
    runTests();
    BmiResultMgr.summary();
  }

  private static void runTests() {

    String addr = System.getProperty("webserver.address", "http://10.229.40.113:8888");

    RestTemplate template = new RestTemplate();

    try {
      String response = template.getForObject(addr + "/calculator/bmi?height=170&weight=68", String.class);
      BmiResultMgr.check("23.5", response);
    } catch (Exception e) {
      e.printStackTrace();
      BmiResultMgr.check(true, false);
    }
  }

}
