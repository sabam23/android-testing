package com.example.testing

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.testing.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun button2Click() {
        onView(withId(R.id.button_2)).perform(click())

        onView(withId(R.id.message_textview)).check(matches(withText("2")))
    }

    @Test
    fun button3Click() {
        onView(withId(R.id.button_3)).perform(click())

        onView(withId(R.id.message_textview)).check(matches(withText("3")))
    }
}