package com.udacity.gradle.builditbigger;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.IsNot.not;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifyResponse() throws InterruptedException {

        Thread.sleep(3000);
        onView(withId(R.id.bt_tell_joke)).perform(click());

        Thread.sleep(3000);
        // close interstitial ad
        ViewInteraction imageButton = onView(
                allOf(withContentDescription("Interstitial close button"),
                        isDisplayed()));
        imageButton.perform(click());

        Thread.sleep(5000);
        // check if joke is displayed correctly
        onView(withId(R.id.tv_display_joke)).check(matches(isDisplayed()));
        onView(allOf(withId(R.id.tv_display_joke), not(withText(""))));
    }
}