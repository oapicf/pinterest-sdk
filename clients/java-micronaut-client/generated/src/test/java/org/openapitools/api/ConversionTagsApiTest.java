package org.openapitools.api;

import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.Error;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;
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
 * API tests for ConversionTagsApi
 */
@MicronautTest
public class ConversionTagsApiTest {

    @Inject
    ConversionTagsApi api;

    
    /**
     * Create conversion tag
     *
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionTagsCreateTest() {
        // given
        String adAccountId = "example";
        ConversionTagCreate conversionTagCreate = new ConversionTagCreate("ACME Checkout Test Tag");

        // when
        ConversionTag body = api.conversionTagsCreate(adAccountId, conversionTagCreate).block();

        // then
        // TODO implement the conversionTagsCreateTest()
    }

    
    /**
     * Get conversion tag
     *
     * Get information about an existing conversion tag.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionTagsGetTest() {
        // given
        String adAccountId = "example";
        String conversionTagId = "2617998078212";

        // when
        ConversionTag body = api.conversionTagsGet(adAccountId, conversionTagId).block();

        // then
        // TODO implement the conversionTagsGetTest()
    }

    
    /**
     * List conversion tags
     *
     * List conversion tags associated with an ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionTagsListTest() {
        // given
        String adAccountId = "example";
        Boolean filterDeleted = false;

        // when
        ConversionTagsList200Response body = api.conversionTagsList(adAccountId, filterDeleted).block();

        // then
        // TODO implement the conversionTagsListTest()
    }

    
    /**
     * Get Ocpm eligible conversion tags
     *
     * Get Ocpm eligible conversion tag events for an ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void ocpmEligibleConversionTagsGetTest() {
        // given
        String adAccountId = "example";

        // when
        Map<String, List<ConversionEventResponse>> body = api.ocpmEligibleConversionTagsGet(adAccountId).block();

        // then
        // TODO implement the ocpmEligibleConversionTagsGetTest()
    }

    
    /**
     * Get page visit conversion tags
     *
     * Get all page visit conversion tag events for an ad account.
     */
    @Test
    @Disabled("Not Implemented")
    public void pageVisitConversionTagsGetTest() {
        // given
        String adAccountId = "example";
        Integer pageSize = 25;
        String order = "ASCENDING";
        String bookmark = "example";

        // when
        PageVisitConversionTagsGet200Response body = api.pageVisitConversionTagsGet(adAccountId, pageSize, order, bookmark).block();

        // then
        // TODO implement the pageVisitConversionTagsGetTest()
    }

    
}
