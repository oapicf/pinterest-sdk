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
import java.time.LocalDate;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsAnalyticsMetricTypesParameterInner;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequest;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Client("${openapi-micronaut-client-base-path}")
public interface PinsApi {
    /**
     * Get multiple Pin analytics
     * &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     *
     * @param pinIds List of Pin IDs. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param metricTypes Pin metric types to get data for. (required)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map&lt;String, Map&lt;String, PinAnalyticsMetricsResponse&gt;&gt;
     */
    @Get(uri="/pins/analytics")
    @Consumes({"application/json"})
    Mono<Map<String, Map<String, PinAnalyticsMetricsResponse>>> multiPinsAnalytics(
        @QueryValue(value="pin_ids") @NotNull @Size(min=1, max=100) List<@Pattern(regexp = "^\\d+$")String> pinIds, 
        @QueryValue(value="start_date") @NotNull @Format("yyyy-MM-dd") LocalDate startDate, 
        @QueryValue(value="end_date") @NotNull @Format("yyyy-MM-dd") LocalDate endDate, 
        @QueryValue(value="metric_types") @NotNull List<PinsAnalyticsMetricTypesParameterInner> metricTypes, 
        @QueryValue(value="app_types", defaultValue="ALL") @Nullable String appTypes, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * Get Pin analytics
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;\&quot;/docs/api/v5/#operation/ad_accounts/list\&quot;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param metricTypes Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &lt;code&gt;NO_SPLIT&lt;/code&gt;. (required)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map&lt;String, PinAnalyticsMetricsResponse&gt;
     */
    @Get(uri="/pins/{pin_id}/analytics")
    @Consumes({"application/json"})
    Mono<Map<String, PinAnalyticsMetricsResponse>> pinsAnalytics(
        @PathVariable(name="pin_id") @NotNull String pinId, 
        @QueryValue(value="start_date") @NotNull @Format("yyyy-MM-dd") LocalDate startDate, 
        @QueryValue(value="end_date") @NotNull @Format("yyyy-MM-dd") LocalDate endDate, 
        @QueryValue(value="metric_types") @NotNull List<PinsAnalyticsMetricTypesParameterInner> metricTypes, 
        @QueryValue(value="app_types", defaultValue="ALL") @Nullable String appTypes, 
        @QueryValue(value="split_field", defaultValue="NO_SPLIT") @Nullable String splitField, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * Create Pin
     * Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.  Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our &lt;a href&#x3D;&#39;/docs/web-features/add-ons-overview/&#39;&gt;Save button&lt;/a&gt; instead. For more tips on creating fresh content for Pinterest, review our &lt;a href&#x3D;&#39;/docs/api-features/content-overview/&#39;&gt;Content App Solutions Guide&lt;/a&gt;.  &lt;strong&gt;&lt;a href&#x3D;&#39;/docs/api-features/creating-boards-and-pins/#creating-video-pins&#39;&gt;Learn more&lt;/a&gt;&lt;/strong&gt; about video Pin creation.
     *
     * @param pinCreate Create a new Pin. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    @Post(uri="/pins")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Pin> pinsCreate(
        @Body @Nullable @Valid PinCreate pinCreate, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * Delete Pin
     * Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     */
    @Delete(uri="/pins/{pin_id}")
    @Consumes({"application/json"})
    Mono<Void> pinsDelete(
        @PathVariable(name="pin_id") @NotNull String pinId, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * Get Pin
     * Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    @Get(uri="/pins/{pin_id}")
    @Consumes({"application/json"})
    Mono<Pin> pinsGet(
        @PathVariable(name="pin_id") @NotNull String pinId, 
        @QueryValue(value="pin_metrics", defaultValue="false") @Nullable Boolean pinMetrics, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * List Pins
     * Get a list of the Pins owned by the \&quot;operation user_account\&quot;.   - By default, the \&quot;operation user_account\&quot; is the token user_account.   - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \&quot;operation user_account\&quot;.  Disclaimer: there are known performance issues when filtering by field &lt;code&gt;creative_type&lt;/code&gt; and including protected pins. If your request is timing out in this scenario we encourage you to use &lt;a href&#x3D;&#39;/docs/api/v5/#operation/boards/list_pins&#39;&gt;GET List Pins on Board&lt;/a&gt;.
     *
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 25)
     * @param pinFilter Pin filter. (optional)
     * @param includeProtectedPins Specify if return pins from protected boards (optional, default to false)
     * @param pinType The type of pins to return, currently only enabled for private pins (optional)
     * @param creativeTypes Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @return PinsList200Response
     */
    @Get(uri="/pins")
    @Consumes({"application/json"})
    Mono<PinsList200Response> pinsList(
        @QueryValue(value="bookmark") @Nullable String bookmark, 
        @QueryValue(value="page_size", defaultValue="25") @Nullable @Min(1) @Max(250) Integer pageSize, 
        @QueryValue(value="pin_filter") @Nullable String pinFilter, 
        @QueryValue(value="include_protected_pins", defaultValue="false") @Nullable Boolean includeProtectedPins, 
        @QueryValue(value="pin_type") @Nullable String pinType, 
        @QueryValue(value="creative_types") @Nullable List<String> creativeTypes, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId, 
        @QueryValue(value="pin_metrics", defaultValue="false") @Nullable Boolean pinMetrics
    );

    /**
     * Save Pin
     * Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param pinsSaveRequest Request object used to save an existing pin (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    @Post(uri="/pins/{pin_id}/save")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Pin> pinsSave(
        @PathVariable(name="pin_id") @NotNull String pinId, 
        @Body @NotNull @Valid PinsSaveRequest pinsSaveRequest, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

    /**
     * Update Pin
     * Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &lt;code&gt;ad_account_id&lt;/code&gt; (obtained via &lt;a href&#x3D;&#39;/docs/api/v5/#operation/ad_accounts/list&#39;&gt;List ad accounts&lt;/a&gt;) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt; roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/getting-started/beta-and-advanced-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param pinUpdate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    @Patch(uri="/pins/{pin_id}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<Pin> pinsUpdate(
        @PathVariable(name="pin_id") @NotNull String pinId, 
        @Body @Nullable @Valid PinUpdate pinUpdate, 
        @QueryValue(value="ad_account_id") @Nullable @Pattern(regexp="^\\d+$") @Size(max=18) String adAccountId
    );

}
