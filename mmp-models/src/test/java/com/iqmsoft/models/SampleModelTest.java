package com.iqmsoft.models;

import com.iqmsoft.test_config.ModelsTestConfig;


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Test;
import org.junit.Assert;

/**
 * A sample test for a sample model
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ModelsTestConfig.class)
public class SampleModelTest {

    // Add utils methods tests here...

    @Test
    public void dummyTest() {
        Assert.assertTrue("Must be true!", true);
    }

}