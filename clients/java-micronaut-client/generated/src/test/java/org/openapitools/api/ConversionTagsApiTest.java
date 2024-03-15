package org.openapitools.api;

import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.Error;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
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
     * Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;
     */
    @Test
    @Disabled("Not Implemented")
    public void conversionTagsCreateTest() {
        // given
        String adAccountId = "example";
        ConversionTagCreate conversionTagCreate = new ConversionTagCreate("ACME Tools Tag");

        // when
        ConversionTagResponse body = api.conversionTagsCreate(adAccountId, conversionTagCreate).block();

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
        ConversionTagResponse body = api.conversionTagsGet(adAccountId, conversionTagId).block();

        // then
        // TODO implement the conversionTagsGetTest()
    }

    
    /**
     * Get conversion tags
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
        ConversionTagListResponse body = api.conversionTagsList(adAccountId, filterDeleted).block();

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
