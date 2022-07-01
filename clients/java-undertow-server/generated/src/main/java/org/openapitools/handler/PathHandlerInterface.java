/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: blah@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Get ad account analytics</p>
     *
     * <p>Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>Granularity</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>TIME_OF_AD_ACTION</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountAnalytics();

    /**
     * <p>List ad accounts</p>
     *
     * <p>Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_shared_accounts</b>"
     * <p>Include shared ad accounts</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsList();

    /**
     * <p>Get ad group analytics</p>
     *
     * <p>Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_ids</b>"
     * <p>List of Ad group Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>Granularity</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>TIME_OF_AD_ACTION</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account group analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsAnalytics();

    /**
     * <p>List ad groups</p>
     *
     * <p>Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>campaign_ids</b>"
     * <p>List of Campaign Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_ids</b>"
     * <p>List of Ad group Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>entity_statuses</b>"
     * <p>Entity status</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>translate_interests_to_names</b>"
     * <p>Return interests as text names (if value is true) rather than topic IDs.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account group parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsList();

    /**
     * <p>Get ad analytics</p>
     *
     * <p>Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_ids</b>"
     * <p>List of Ad Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>Granularity</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>TIME_OF_AD_ACTION</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account ads analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsAnalytics();

    /**
     * <p>List ads</p>
     *
     * <p>Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>campaign_ids</b>"
     * <p>List of Campaign Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_ids</b>"
     * <p>List of Ad group Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_ids</b>"
     * <p>List of Ad Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>entity_statuses</b>"
     * <p>Entity status</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account ads parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsList();

    /**
     * <p>Create async request for an account analytics report</p>
     *
     * <p>This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdsAnalyticsCreateAsyncRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsAnalyticsCreateAsyncResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account ads analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsCreateReport();

    /**
     * <p>Get the account analytics report created by the async call</p>
     *
     * <p>This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>token</b>"
     * <p>Token returned from the post request creation call</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsAnalyticsGetAsyncResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account ads analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsGetReport();

    /**
     * <p>Get campaign analytics</p>
     *
     * <p>Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaigns/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>campaign_ids</b>"
     * <p>List of Campaign Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>Granularity</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>TIME_OF_AD_ACTION</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account campaign analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsAnalytics();

    /**
     * <p>List campaigns</p>
     *
     * <p>Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaigns" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>campaign_ids</b>"
     * <p>List of Campaign Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>entity_statuses</b>"
     * <p>Entity status</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account campaign parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsList();

    /**
     * <p>Get product group analytics</p>
     *
     * <p>Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/product_groups/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>product_group_ids</b>"
     * <p>List of Product group Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>Granularity</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>1</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>TIME_OF_AD_ACTION</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid ad account ads analytics parameters.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupsAnalytics();

    /**
     * <p>Create board section</p>
     *
     * <p>Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/boards/{board_id}/sections" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardSection} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSection}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: response</li>
     * <li><b>400 (client error)</b>: Invalid board section parameters.</li>
     * <li><b>403 (client error)</b>: Not authorized to create board sections.</li>
     * <li><b>409 (client error)</b>: Could not get exclusive access to the board to create a new section.</li>
     * <li><b>500 (server error)</b>: Could not create a new board section.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsCreate();

    /**
     * <p>Delete board section</p>
     *
     * <p>Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/boards/{board_id}/sections/{section_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>section_id</b>"
     * <p>Unique identifier of a board section.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Board section deleted successfully</li>
     * <li><b>403 (client error)</b>: Not authorized to delete board section.</li>
     * <li><b>404 (client error)</b>: Board section not found.</li>
     * <li><b>409 (client error)</b>: Board section conflict.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsDelete();

    /**
     * <p>List board sections</p>
     *
     * <p>Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards/{board_id}/sections" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsList();

    /**
     * <p>List Pins on board section</p>
     *
     * <p>Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards/{board_id}/sections/{section_id}/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>section_id</b>"
     * <p>Unique identifier of a board section.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>403 (client error)</b>: Not authorized to access Pins on board section.</li>
     * <li><b>404 (client error)</b>: Board or section not found.</li>
     * <li><b>409 (client error)</b>: Board section conflict.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsListPins();

    /**
     * <p>Update board section</p>
     *
     * <p>Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/boards/{board_id}/sections/{section_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>section_id</b>"
     * <p>Unique identifier of a board section.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardSection} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSection}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>400 (client error)</b>: Invalid board section parameters.</li>
     * <li><b>403 (client error)</b>: Not authorized to update board section.</li>
     * <li><b>409 (client error)</b>: Board section conflict.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsUpdate();

    /**
     * <p>Create board</p>
     *
     * <p>Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/boards" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link Board} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: response</li>
     * <li><b>400 (client error)</b>: The board name is invalid or duplicated.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsCreate();

    /**
     * <p>Delete board</p>
     *
     * <p>Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Board deleted successfully</li>
     * <li><b>403 (client error)</b>: Not authorized to delete the board.</li>
     * <li><b>404 (client error)</b>: Board not found.</li>
     * <li><b>409 (client error)</b>: Could not get exclusive access to delete the board.</li>
     * <li><b>429 (client error)</b>: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsDelete();

    /**
     * <p>Get board</p>
     *
     * <p>Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>404 (client error)</b>: Board not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsGet();

    /**
     * <p>List boards</p>
     *
     * <p>Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>privacy</b>"
     * <p>Privacy setting for a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsList();

    /**
     * <p>List Pins on board</p>
     *
     * <p>Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards/{board_id}/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>404 (client error)</b>: Board not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsListPins();

    /**
     * <p>Update board</p>
     *
     * <p>Update a board owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
     * <p>Unique identifier of a board.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>400 (client error)</b>: Invalid board parameters.</li>
     * <li><b>403 (client error)</b>: Not authorized to update the board.</li>
     * <li><b>429 (client error)</b>: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsUpdate();

    /**
     * <p>Create product group</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/product_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsProductGroupCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Object}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid body.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>403 (client error)</b>: Forbidden. Account not approved for feed mutations yet.</li>
     * <li><b>409 (client error)</b>: Conflict. Can't create this catalogs product group with this value.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsCreate();

    /**
     * <p>Delete product group</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/catalogs/product_groups/{product_group_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>product_group_id</b>"
     * <p>Unique identifier of a product group</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Catalogs Product Group deleted successfully.</li>
     * <li><b>400 (client error)</b>: Invalid catalogs product group id parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>403 (client error)</b>: Forbidden. Account not approved for feed mutations yet.</li>
     * <li><b>404 (client error)</b>: Catalogs product group not found.</li>
     * <li><b>409 (client error)</b>: Conflict. Can't delete this catalogs product group.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsDelete();

    /**
     * <p>Get product groups list</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/product_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid feed parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>403 (client error)</b>: Forbidden. Account not approved for feed mutations yet.</li>
     * <li><b>404 (client error)</b>: Data feed not found.</li>
     * <li><b>409 (client error)</b>: Conflict. Can't create this catalogs product group with this value.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsList();

    /**
     * <p>Update product group</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/catalogs/product_groups/{product_group_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>product_group_id</b>"
     * <p>Unique identifier of a product group</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsProductGroupUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsProductGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>404 (client error)</b>: Catalogs product group not found.</li>
     * <li><b>409 (client error)</b>: Conflict. Can't update this catalogs product group to this value.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsUpdate();

    /**
     * <p>List processing results for a given feed</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds/{feed_id}/processing_results" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>404 (client error)</b>: Feed not found.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedProcessingResultsList();

    /**
     * <p>Create feed</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/feeds" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsFeedsCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid feed parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>403 (client error)</b>: Business account required.</li>
     * <li><b>409 (client error)</b>: User website required.</li>
     * <li><b>422 (client error)</b>: Unique feed name is required.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsCreate();

    /**
     * <p>Delete feed</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Feed deleted successfully.</li>
     * <li><b>400 (client error)</b>: Invalid feed parameters.</li>
     * <li><b>403 (client error)</b>: Forbidden. Account not approved for feed mutations yet.</li>
     * <li><b>404 (client error)</b>: Data feed not found.</li>
     * <li><b>409 (client error)</b>: Conflict. Can't delete a feed with active promotions.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsDelete();

    /**
     * <p>Get feed</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid feed parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>404 (client error)</b>: Data feed not found.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsGet();

    /**
     * <p>List feeds</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid parameters.</li>
     * <li><b>401 (client error)</b>: Unauthorized access.</li>
     * <li><b>Default</b>: Unexpected error.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsList();

    /**
     * <p>Update feed</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsFeedsUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>400 (client error)</b>: Invalid feed parameters.</li>
     * <li><b>403 (client error)</b>: Forbidden. Account not approved for feed mutations yet.</li>
     * <li><b>404 (client error)</b>: Data feed not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsUpdate();

    /**
     * <p>Get catalogs items batch</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/items/batch/{batch_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>Id of a catalogs items batch to fetch</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsItemsBatch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Response containing the requested catalogs items batch</li>
     * <li><b>401 (client error)</b>: Not authorized to access catalogs items batch</li>
     * <li><b>403 (client error)</b>: Not authorized to access catalogs items batch</li>
     * <li><b>404 (client error)</b>: Catalogs items batch not found</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsBatchGet();

    /**
     * <p>Perform an operation on an item batch</p>
     *
     * <p><strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/items/batch" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsItemsBatchRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsItemsBatch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Response containing the requested catalogs items batch</li>
     * <li><b>401 (client error)</b>: Not authorized to post catalogs items</li>
     * <li><b>403 (client error)</b>: Not authorized to post catalogs items</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsBatchPost();

    /**
     * <p>Get catalogs items</p>
     *
     * <p>Get the items of the catalog created by the \"operating user_account\"</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/items" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>country</b>"
     * <p>Country for the Catalogs Items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>item_ids</b>"
     * <p>Catalos Item ids</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>language</b>"
     * <p>Language for the Catalogs Items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsItems}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Response containing the requested catalogs items</li>
     * <li><b>401 (client error)</b>: Not authorized to access catalogs items</li>
     * <li><b>403 (client error)</b>: Not authorized to access catalogs items</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsGet();

    /**
     * <p>Register media upload</p>
     *
     * <p>Register your intent to upload media  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using <tt>curl</tt>, for example) to <tt>upload_url</tt> using the <tt>Content-Type</tt> header value. Send the media file's contents as the request's <tt>file</tt> parameter and also include all of the parameters from <tt>upload_parameters</tt>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/media" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link MediaUploadRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MediaUpload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaCreate();

    /**
     * <p>Get media upload details</p>
     *
     * <p>Get details for a registered media upload, including its current status.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/media/{media_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>media_id</b>"
     * <p>Media identifier</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MediaUploadDetails}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>404 (client error)</b>: Media upload not found</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaGet();

    /**
     * <p>List media uploads</p>
     *
     * <p>List media uploads filtered by given parameters.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/media" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>bookmark</b>"
     * <p>Cursor used to fetch the next page of items</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Paginated}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaList();

    /**
     * <p>Generate OAuth access token</p>
     *
     * <p>Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/oauth/token" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>grant_type</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/x-www-form-urlencoded}]</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OauthAccessTokenResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler oauthToken();

    /**
     * <p>Get Pin analytics</p>
     *
     * <p>Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins/{pin_id}/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of a Pin.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Pin metric types to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>app_types</b>"
     * <p>Apps or devices to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>split_field</b>"
     * <p>How to split the data into groups. Not including this param means data won't be split.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>NO_SPLIT</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link AnalyticsMetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>403 (client error)</b>: Not authorized to access board or Pin.</li>
     * <li><b>404 (client error)</b>: Pin not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsAnalytics();

    /**
     * <p>Create Pin</p>
     *
     * <p>Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/solutions/content-apps'>Content App Solutions Guide</a>.  <strong><a href='/docs/solutions/content-apps/#creatingvideopins'>Learn more</a></strong> about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link Pin} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: Successful pin creation.</li>
     * <li><b>400 (client error)</b>: Invalid Pin parameters response</li>
     * <li><b>403 (client error)</b>: The Pin's image is too small, too large or is broken</li>
     * <li><b>404 (client error)</b>: Board or section not found</li>
     * <li><b>429 (client error)</b>: This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsCreate();

    /**
     * <p>Delete Pin</p>
     *
     * <p>Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/pins/{pin_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of a Pin.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Successfully deleted Pin</li>
     * <li><b>403 (client error)</b>: Not authorized to access board or Pin.</li>
     * <li><b>404 (client error)</b>: Pin not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsDelete();

    /**
     * <p>Get Pin</p>
     *
     * <p>Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins/{pin_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of a Pin.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>403 (client error)</b>: Not authorized to access board or Pin.</li>
     * <li><b>404 (client error)</b>: Pin not found.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsGet();

    /**
     * <p>Get user account analytics</p>
     *
     * <p>Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>from_claimed_content</b>"
     * <p>Filter on Pins that match your claimed domain.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>BOTH</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pin_format</b>"
     * <p>Pin formats to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>app_types</b>"
     * <p>Apps or devices to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Metric types to get data for, default is all. </p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>split_field</b>"
     * <p>How to split the data into groups. Not including this param means data won't be split.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>NO_SPLIT</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link AnalyticsMetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Success</li>
     * <li><b>403 (client error)</b>: Not authorized to access the user account analytics.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountAnalytics();

    /**
     * <p>Get user account</p>
     *
     * <p>Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Account}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: response</li>
     * <li><b>403 (client error)</b>: Not authorized to access the user account.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountGet();
}
