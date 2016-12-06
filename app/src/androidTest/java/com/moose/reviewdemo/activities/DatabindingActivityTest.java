package com.moose.reviewdemo.activities;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.action.ViewActions.*;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;

import com.moose.reviewdemo.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
//import static org.junit.Assert.*;

/**
 * Created by yangshunfa on 2016/11/24.
 * tips:
 */
@RunWith(AndroidJUnit4.class)
public class DatabindingActivityTest{
    @Rule
    public ActivityTestRule rule = new ActivityTestRule<>(DatabindingActivity.class);
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void onCreate() throws Exception {
//        onView(withId(R.id.moose_btn_toast)).check(ViewAssertions.matches(isDisplayed()));
//        onView(withId(R.id.moose_btn_toast)).perform(ViewActions.click());
        onView(withId(R.id.moose_btn_name)).check(matches(withText("")));
    }

    @Test
    public void addUser(){
        String name1 = "fsiojiocjviojawe";
        String name2 = "yangshunfa";
        String psw1 = "jjdifsidfjoiweiuiodjvosd";
        createItem(name1, psw1);
        createItem(name2, "1993yangshunfa0929");

        onView(withId(R.id.moose_ll_textcontainer)).check(matches(isDisplayed()));
//        onView(withText(name2)).check(matches(isDisplayed()));

    }

    private void createItem(String name, String psw){
        onView(withId(R.id.moose_btn_name)).perform(typeText(name), closeSoftKeyboard());
        onView(withId(R.id.moose_btn_password)).perform(typeText(psw), closeSoftKeyboard());
        onView(withId(R.id.moose_btn_toast)).perform(click());
    }

}