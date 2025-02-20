/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.pinterestsdk.api;

import com.github.oapicf.pinterestsdk.ApiException;
import com.github.oapicf.pinterestsdk.model.Error;
import com.github.oapicf.pinterestsdk.model.TermsOfService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TermsOfServiceApi
 */
@Disabled
public class TermsOfServiceApiTest {

    private final TermsOfServiceApi api = new TermsOfServiceApi();

    /**
     * Get terms of service
     *
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void termsOfServiceGetTest() throws ApiException {
        String adAccountId = null;
        Boolean includeHtml = null;
        String tosType = null;
        TermsOfService response = api.termsOfServiceGet(adAccountId, includeHtml, tosType);
        // TODO: test validations
    }

}
