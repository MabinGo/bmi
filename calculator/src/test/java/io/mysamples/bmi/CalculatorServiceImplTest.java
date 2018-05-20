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

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorServiceImplTest {

  @Test
  public void testCalculate() throws Exception {

    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    try {
      calculatorService.calculate(-170, 68);
      Assert.fail("Expect exception but not");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(true, true);
    }

    try {
      calculatorService.calculate(170, -68);
      Assert.fail("Expect exception but not");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(true, true);
    }

    try {
      calculatorService.calculate(0, 68);
      Assert.fail("Expect exception but not");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(true, true);
    }

    try {
      calculatorService.calculate(170, 0);
      Assert.fail("Expect exception but not");
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(true, true);
    }

    try {
      Assert.assertThat(calculatorService.calculate(170, 68),is(23.5));
    } catch (IllegalArgumentException e) {
      Assert.assertEquals(true, false);
    }

  }

}