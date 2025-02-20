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
import org.openapitools.model.Error;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface TargetingTemplateApi {
    /**
     * Create targeting templates
     * &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param targetingTemplateCreate targeting template creation entity (required)
     * @return TargetingTemplateGetResponseData
     */
    @Post(uri="/ad_accounts/{ad_account_id}/targeting_templates")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<TargetingTemplateGetResponseData> targetingTemplateCreate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid TargetingTemplateCreate targetingTemplateCreate
    );

    /**
     * List targeting templates
     * Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param includeSizing Include audience sizing in result or not (optional, default to false)
     * @param searchQuery Search keyword for targeting templates (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @return TargetingTemplateList200Response
     */
    @Get(uri="/ad_accounts/{ad_account_id}/targeting_templates")
    @Consumes({"application/json"})
    Mono<TargetingTemplateList200Response> targetingTemplateList(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="order") @Nullable String order, 
        @QueryValue(value="include_sizing", defaultValue="false") @Nullable Boolean includeSizing, 
        @QueryValue(value="search_query") @Nullable String searchQuery, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="bookmark") @Nullable String bookmark
    );

    /**
     * Update targeting templates
     * &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param targetingTemplateUpdateRequest Operation type and targeting template ID (required)
     */
    @Patch(uri="/ad_accounts/{ad_account_id}/targeting_templates")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Void> targetingTemplateUpdate(
        @PathVariable(name="ad_account_id") @NotNull @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @Body @NotNull @Valid TargetingTemplateUpdateRequest targetingTemplateUpdateRequest
    );

}
