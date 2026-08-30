package org.openapitools.api.interfaces;

import org.openapitools.model.CreativeType;
import java.time.LocalDate;
import org.openapitools.model.MultiPinsAnalyticsMetricTypesItem;
import org.openapitools.model.Pin;
import org.openapitools.model.PinAnalyticsMetricsResponse;
import org.openapitools.model.PinCreate;
import org.openapitools.model.PinFilter;
import org.openapitools.model.PinType;
import org.openapitools.model.PinUpdate;
import org.openapitools.model.PinsList200Response;
import org.openapitools.model.PinsSaveRequestCreate;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.ProductTagsBulkAddRequest;
import org.openapitools.model.ProductTagsBulkDeleteRequest;
import org.openapitools.model.ProductTagsError;
import org.openapitools.model.ProductTagsResponse;
import org.openapitools.model.QuerypinanalyticsmetrictypesItems;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface PinsService {

    /**
     * Get multiple Pin analytics
     * **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     *
     * @param pinIds List of Pin IDs. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param metricTypes Pin metric types to get data for. (required)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map<String, Map<String, PinAnalyticsMetricsResponse>>
     */
    Map<String, Map<String, PinAnalyticsMetricsResponse>> multiPinsAnalytics(
        List<String> pinIds,
        LocalDate startDate,
        LocalDate endDate,
        List<MultiPinsAnalyticsMetricTypesItem> metricTypes,
        String appTypes,
        String adAccountId
    );

    /**
     * Get Pin analytics
     * Get analytics for a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param metricTypes Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. (required)
     * @param appTypes Apps or devices to get data for, default is all. (optional, default to ALL)
     * @param splitField How to split the data into groups. Not including this param means data won&#39;t be split. (optional, default to NO_SPLIT)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Map<String, PinAnalyticsMetricsResponse>
     */
    Map<String, PinAnalyticsMetricsResponse> pinsAnalytics(
        String pinId,
        LocalDate startDate,
        LocalDate endDate,
        List<QuerypinanalyticsmetrictypesItems> metricTypes,
        String appTypes,
        String splitField,
        String adAccountId
    );

    /**
     * Create Pin
     *  Create a Pin on a board or board section owned by the \&quot;operation user_account\&quot;.   Note: If the current \&quot;operation user_account\&quot; (defined by the access token) has access to another user&#39;s Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account&#39;s permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id&#x3D;12345&amp;...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called &#39;curated content&#39;, please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.
     *
     * @param pinCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    Pin pinsCreate(
        PinCreate pinCreate,
        String adAccountId
    );

    /**
     * Delete Pin
     *   Delete a Pins owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     *
     * @param pinId  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    Pin pinsDelete(
        String pinId,
        String adAccountId
    );

    /**
     * Get Pin
     *   Get a Pin owned by the \&quot;operation user_account\&quot; - or on a group board that has been shared with this account.   - By default, the \&quot;operation user_account\&quot; is the token user_account.    Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.
     *
     * @param pinId  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @return Pin
     */
    Pin pinsGet(
        String pinId,
        String adAccountId,
        Boolean pinMetrics
    );

    /**
     * List Pins
     *     Get a list of the Pins owned by the \&quot;operation user_account\&quot;.     - By default, the \&quot;operation user_account\&quot; is the token user_account.     - All Pins owned by the \&quot;operation user_account\&quot; are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an &#x60;ad_account_id&#x60; to use the owner of that ad_account as the \&quot;operation user_account\&quot;.      Disclaimer: There are known performance issues when filtering by field &#x60;creative_type&#x60; and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).
     *
     * @param pinFilter The filter to apply to the pins (optional)
     * @param pinMetrics Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional, default to false)
     * @param includeProtectedPins Whether to include protected pins in the results (optional, default to false)
     * @param pinType The type of pins to return, currently only enabled for private pins (optional)
     * @param creativeTypes Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (optional)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @param domain Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins). (optional)
     * @param domains Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). (optional)
     * @param includeProductTagObj Include product tag objects in the response with their associated links. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return PinsList200Response
     */
    PinsList200Response pinsList(
        PinFilter pinFilter,
        Boolean pinMetrics,
        Boolean includeProtectedPins,
        PinType pinType,
        List<CreativeType> creativeTypes,
        String adAccountId,
        String domain,
        List<String> domains,
        Boolean includeProductTagObj,
        String bookmark,
        Integer pageSize
    );

    /**
     * Save Pin
     * Save a Pin on a board or board section owned by the \&quot;operation user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account. Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.
     *
     * @param pinId Unique identifier of a Pin. (required)
     * @param pinsSaveRequestCreate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    Pin pinsSave(
        String pinId,
        PinsSaveRequestCreate pinsSaveRequestCreate,
        String adAccountId
    );

    /**
     * Update Pin
     * Update a pin owned by the \&quot;operating user_account\&quot;. - By default, the \&quot;operation user_account\&quot; is the token user_account.  Optional: Business Access: Specify an &#x60;ad_account_id&#x60; (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \&quot;operation user_account\&quot;. In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * @param pinId  (required)
     * @param pinUpdate  (required)
     * @param adAccountId Unique identifier of an ad account. (optional)
     * @return Pin
     */
    Pin pinsUpdate(
        String pinId,
        PinUpdate pinUpdate,
        String adAccountId
    );

    /**
     * Add product tags to pin
     * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
     *
     * @param pinId Unique identifier of the hero pin that will receive product tags. (required)
     * @param productTagsBulkAddRequest  (required)
     * @return ProductTagsResponse
     */
    ProductTagsResponse productTagsBulkAdd(
        String pinId,
        ProductTagsBulkAddRequest productTagsBulkAddRequest
    );

    /**
     * Delete product tags from pin
     * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
     *
     * @param pinId Unique identifier of the hero pin that will receive product tags. (required)
     * @param productTagsBulkDeleteRequest  (required)
     * @return void
     */
    void productTagsBulkDelete(
        String pinId,
        ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest
    );

    /**
     * Get product tags for pin
     * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
     *
     * @param pinId Unique identifier of the hero pin that will receive product tags. (required)
     * @return ProductTagsResponse
     */
    ProductTagsResponse productTagsList(
        String pinId
    );
}
