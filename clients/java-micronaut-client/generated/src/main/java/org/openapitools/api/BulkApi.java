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

package org.openapitools.api;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.*;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.core.convert.format.Format;
import reactor.core.publisher.Mono;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.Error;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface BulkApi {
    /**
     * Get advertiser entities in bulk
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadRequest Parameters to get ad entities in bulk (required)
     * @return BulkDownloadResponse
     */
    @Post(uri="/ad_accounts/{ad_account_id}/bulk/download")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<BulkDownloadResponse> bulkDownloadCreate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid BulkDownloadRequest bulkDownloadRequest
    );

    /**
     * Download advertiser entities in bulk
     * Get the status of a bulk request by &lt;code&gt;request_id&lt;/code&gt;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Unique identifier of a bulk upsert request. (required)
     * @param includeDetails if set to True then attach the errors/details to all the requests (optional, default to false)
     * @return BulkUpsertStatusResponse
     */
    @Get(uri="/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}")
    @Consumes({"application/json"})
    Mono<BulkUpsertStatusResponse> bulkRequestGet(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @PathVariable(name="bulk_request_id") @NotNull String bulkRequestId, 
        @QueryValue(value="include_details", defaultValue="false") @Nullable Boolean includeDetails
    );

    /**
     * Create/update ad entities in bulk
     * Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @return BulkUpsertResponse
     */
    @Post(uri="/ad_accounts/{ad_account_id}/bulk/upsert")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<BulkUpsertResponse> bulkUpsertCreate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid BulkUpsertRequest bulkUpsertRequest
    );

}
