/**
 * Copyright © 2010-2011 Nokia
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.restdriver.matchers;

import java.util.regex.Pattern;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class MatchesRegex extends TypeSafeMatcher<String> {
    
    private final Pattern pattern;
    
    public MatchesRegex(Pattern pattern) {
        this.pattern = pattern;
    }
    
    @Override
    public final void describeTo(Description description) {
        description.appendText("A string matching the regular expression: " + pattern.toString());
    }
    
    @Override
    protected boolean matchesSafely(String item) {
        return pattern.matcher(item).matches();
    }
    
}
