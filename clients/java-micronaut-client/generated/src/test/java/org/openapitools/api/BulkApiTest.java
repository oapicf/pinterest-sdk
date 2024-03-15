package org.openapitools.api;

import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.Error;
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
 * API tests for BulkApi
 */
@MicronautTest
public class BulkApiTest {

    @Inject
    BulkApi api;

    
    /**
     * Get advertiser entities in bulk
     *
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     */
    @Test
    @Disabled("Not Implemented")
    public void bulkDownloadCreateTest() {
        // given
        String adAccountId = "example";
        BulkDownloadRequest bulkDownloadRequest = new BulkDownloadRequest();

        // when
        BulkDownloadResponse body = api.bulkDownloadCreate(adAccountId, bulkDownloadRequest).block();

        // then
        // TODO implement the bulkDownloadCreateTest()
    }

    
    /**
     * Download advertiser entities in bulk
     *
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     */
    @Test
    @Disabled("Not Implemented")
    public void bulkRequestGetTest() {
        // given
        String adAccountId = "example";
        String bulkRequestId = "example";
        Boolean includeDetails = false;

        // when
        BulkUpsertStatusResponse body = api.bulkRequestGet(adAccountId, bulkRequestId, includeDetails).block();

        // then
        // TODO implement the bulkRequestGetTest()
    }

    
    /**
     * Create/update ad entities in bulk
     *
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     */
    @Test
    @Disabled("Not Implemented")
    public void bulkUpsertCreateTest() {
        // given
        String adAccountId = "example";
        BulkUpsertRequest bulkUpsertRequest = new BulkUpsertRequest();

        // when
        BulkUpsertResponse body = api.bulkUpsertCreate(adAccountId, bulkUpsertRequest).block();

        // then
        // TODO implement the bulkUpsertCreateTest()
    }

    
}
