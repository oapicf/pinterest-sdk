package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.RelatedTerms;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for TermsApi
 */
@MicronautTest
public class TermsApiTest {

    @Inject
    TermsApi api;

    
    /**
     * List related terms
     *
     * Get a list of terms logically related to each input term. &lt;p/&gt; Example: the term &#39;workout&#39; would list related terms like &#39;one song workout&#39;, &#39;yoga workout&#39;, &#39;workout motivation&#39;, etc.
     */
    @Test
    @Disabled("Not Implemented")
    public void termsRelatedListTest() {
        // given
        List<String> terms = Arrays.asList("example");

        // when
        RelatedTerms body = api.termsRelatedList(terms).block();

        // then
        // TODO implement the termsRelatedListTest()
    }

    
    /**
     * List suggested terms
     *
     * Get popular search terms that begin with your input term. &lt;p/&gt; Example: &#39;sport&#39; would return popular terms like &#39;sports bar&#39; and &#39;sportswear&#39;, but not &#39;motor sports&#39; since the phrase does not begin with the given term.
     */
    @Test
    @Disabled("Not Implemented")
    public void termsSuggestedListTest() {
        // given
        String term = "sports";
        Integer limit = 4;

        // when
        List<String> body = api.termsSuggestedList(term, limit).block();

        // then
        // TODO implement the termsSuggestedListTest()
    }

    
}
