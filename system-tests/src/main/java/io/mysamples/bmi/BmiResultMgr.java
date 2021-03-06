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

package io.mysamples.bmi;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BmiResultMgr {
  private static final Logger LOGGER = LoggerFactory.getLogger(BmiResultMgr.class);

//  private static final ArrayList<Throwable> errorList = new ArrayList<>();
  private static final List<Throwable> errorList = new ArrayList<Throwable>();

  static void check(Object expect, Object real) {
    String strExpect = String.valueOf(expect);
    String strReal = String.valueOf(real);

    if (!strExpect.equals(strReal)) {
      errorList.add(new Error("Expect " + strExpect + ", but " + strReal));
    }
  }

  static void summary() {
    if (errorList.isEmpty()) {
      LOGGER.info("............. test finished ............");
      return;
    }

    LOGGER.info("............. test not finished ............");
    for (Throwable e : errorList) {
      LOGGER.info("", e);
    }
  }
}
