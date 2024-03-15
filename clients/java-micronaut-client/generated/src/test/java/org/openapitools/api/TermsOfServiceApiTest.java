package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.TermsOfService;
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
 * API tests for TermsOfServiceApi
 */
@MicronautTest
public class TermsOfServiceApiTest {

    @Inject
    TermsOfServiceApi api;

    
    /**
     * Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     */
    @Test
    @Disabled("Not Implemented")
    public void termsOfServiceGetTest() {
        // given
        String adAccountId = "example";
        Boolean includeHtml = false;
        String tosType = "example";

        // when
        TermsOfService body = api.termsOfServiceGet(adAccountId, includeHtml, tosType).block();

        // then
        // TODO implement the termsOfServiceGetTest()
    }

    
}
