/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
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
     * <p>  Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link AdAccountAnalyticsItems}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountAnalytics();

    /**
     * <p>Get targeting analytics for an ad account</p>
     *
     * <p>Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/targeting_analytics" (<i>privileged: true</i>)</p>
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
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>targeting_types</b>"
     * <p>Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AdsAnalyticsAccountTargetingType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
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
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>attribution_types</b>"
     * <p>List of types of attribution for the conversion report</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ConversionReportAttributionType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountTargetingAnalyticsGet();

    /**
     * <p>Create ad account</p>
     *
     * <p>Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdAccountCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsCreate();

    /**
     * <p>Get ad account</p>
     *
     * <p>Get an ad account</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsGet();

    /**
     * <p>List ad accounts</p>
     *
     * <p>Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsList();

    /**
     * <p>Create a request for a brand, category, SKU report</p>
     *
     * <p>  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ConversionProductReportCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionProductReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsCreateConversionProductReport();

    /**
     * <p>Create a request for a Marketing Mix Modeling (MMM) report</p>
     *
     * <p>    This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/mmm_reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link MMMReportCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MMMReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsCreateMmmReport();

    /**
     * <p>Create async request for an account analytics report</p>
     *
     * <p>  This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdsAnalyticsCreateAsyncRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsAnalyticsCreateAsyncResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsCreateReport();

    /**
     * <p>Create async request for an analytics report using a template</p>
     *
     * <p>  This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>template_id</b>"
     * <p>Unique identifier of a template.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TemplateBasedReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsCreateTemplateReport();

    /**
     * <p>Get advertiser brand, category, SKU report</p>
     *
     * <p>  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/reports/brand_category_sku" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionProductReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsGetConversionProductReport();

    /**
     * <p>Get advertiser Marketing Mix Modeling (MMM) report.</p>
     *
     * <p>    Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/mmm_reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MMMReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsGetMmmReport();

    /**
     * <p>Get the account analytics report created by the async call</p>
     *
     * <p>  This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsAnalyticsGetAsyncResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler analyticsGetReport();

    /**
     * <p>Delete ads data for ad account in API Sandbox</p>
     *
     * <p>Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/sandbox" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler sandboxDelete();

    /**
     * <p>List templates</p>
     *
     * <p>Gets all Templates associated with an ad account ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/templates" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TemplatesList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler templatesList();

    /**
     * <p>Get ad group analytics</p>
     *
     * <p>Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
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
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>aggregate_report_rows</b>"
     * <p>Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link AdGroupsAnalyticsMetrics}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsAnalytics();

    /**
     * <p>Get audience sizing</p>
     *
     * <p>Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdGroupAudienceSizingCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroupAudienceSizing}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsAudienceSizing();

    /**
     * <p>Get bid floors</p>
     *
     * <p>List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/bid_floor" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BidFloorCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BidFloor}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsBidFloorGet();

    /**
     * <p>Create ad groups</p>
     *
     * <p>Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ad_groups" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link AdGroupCreateCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroupsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsCreate();

    /**
     * <p>Get dynamic titles CSV download URL</p>
     *
     * <p>Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DynamicTitlesDownloadCSV}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsDynamicTitlesDownloadCsv();

    /**
     * <p>Get dynamic titles status</p>
     *
     * <p>Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DynamicTitlesGetStatus}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsDynamicTitlesGetStatus();

    /**
     * <p>Get dynamic titles upload URL</p>
     *
     * <p>Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DynamicTitlesUploadURL}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsDynamicTitlesGetUploadUrl();

    /**
     * <p>Process dynamic titles CSV</p>
     *
     * <p>Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link DynamicTitlesProcessCSVCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DynamicTitlesProcessCSV}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsDynamicTitlesProcessCsv();

    /**
     * <p>Get ad group</p>
     *
     * <p>Get a specific ad group given the ad group ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group ID.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsGet();

    /**
     * <p>List ad groups</p>
     *
     * <p>List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * <p>List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.</p>
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
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;EntityStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ACTIVE,PAUSED</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroupsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsList();

    /**
     * <p>Get targeting analytics for ad groups</p>
     *
     * <p>Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_group_ids</b>"
     * <p>List of Ad group Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>targeting_types</b>"
     * <p>Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AdsAnalyticsAdGroupTargetingType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
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
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>attribution_types</b>"
     * <p>List of types of attribution for the conversion report</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ConversionReportAttributionType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_columns</b>"
     * <p>Sort Columns.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_ascending</b>"
     * <p>Sort ascending.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsTargetingAnalyticsGet();

    /**
     * <p>Update ad groups</p>
     *
     * <p>Update multiple existing ad groups.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/ad_groups" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link AdGroupUpdateBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroupsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adGroupsUpdate();

    /**
     * <p>List of ad groups using promotions IDs.</p>
     *
     * <p>  Get a list of ad groups that are associated with those promotion ids</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/promotion_applied_entities" (<i>privileged: true</i>)</p>
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
     * <p>"<b>promotion_ids</b>"
     * <p>List of Promotion IDs to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdGroupsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getAdGroupsByPromotionIdsList();

    /**
     * <p>Create ad preview with pin or image</p>
     *
     * <p>Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ad_previews" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdPreviewRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdPreviewURLResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adPreviewsCreate();

    /**
     * <p>Get targeting analytics for ads</p>
     *
     * <p>Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics" (<i>privileged: true</i>)</p>
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
     * <p>"<b>ad_ids</b>"
     * <p>List of Ad Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>targeting_types</b>"
     * <p>Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AdsAnalyticsAdTargetingType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
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
     * - Parameter type: <b>{@link ConversionAttributionWindowDays}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link ConversionAttributionWindowDays}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link ConversionAttributionWindowDays}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>conversion_report_time</b>"
     * <p>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</p>
     * <p>
     * - Parameter type: <b>{@link ConversionReportTimeType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>attribution_types</b>"
     * <p>List of types of attribution for the conversion report</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ConversionReportAttributionType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_columns</b>"
     * <p>Sort Columns.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_ascending</b>"
     * <p>Sort ascending.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adTargetingAnalyticsGet();

    /**
     * <p>Get ad analytics</p>
     *
     * <p>    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>pin_ids</b>"
     * <p>List of Pin IDs.</p>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link AdsAnalytics}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsAnalytics();

    /**
     * <p>Create ads</p>
     *
     * <p>Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ads" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link AdCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdBatchWriteResponseModel}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsCreate();

    /**
     * <p>Get ad</p>
     *
     * <p>Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads/{ad_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_id</b>"
     * <p>The ID of this ad.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Ad}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsGet();

    /**
     * <p>List ads</p>
     *
     * <p>List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * <p>List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.</p>
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
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;EntityStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ACTIVE,PAUSED</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsList();

    /**
     * <p>Update ads</p>
     *
     * <p>Update multiple existing ads</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/ads" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link AdBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdBatchWriteResponseModel}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsUpdate();

    /**
     * <p>Create ad preview records for one or more ad groups</p>
     *
     * <p>Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/campaign_ad_preview" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link CampaignAdPreviewCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CampaignAdPreviewCreate200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignAdPreviewCreate();

    /**
     * <p>Delete ad preview records for one or more ad groups</p>
     *
     * <p>Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/campaign_ad_preview" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CampaignAdPreviewDelete200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignAdPreviewDelete();

    /**
     * <p>Fetch ad preview records for one or more ad groups</p>
     *
     * <p>Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaign_ad_preview" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CampaignAdPreview}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignAdPreviewRead();

    /**
     * <p>Get item bid options (POST)</p>
     *
     * <p>Get the bid options for a batch of retail catalog items.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/advanced_auction/items/get" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdvancedAuctionItemsGetRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvancedAuctionItems}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>500 (server error)</b>: The server encountered an unexpected condition that prevented it from fulfilling the request.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advancedAuctionItemsGetPost();

    /**
     * <p>Operate on item level bid options</p>
     *
     * <p>This endpoint supports multiple operations on a set of one or more bid options (bid price and bid adjustments for targeting categories) for retail catalog items. These advanced auction settings are applied in campaigns using objective_type `CATALOG_SALES` and ad groups using bid_strategy_type `MAX_BID`.  The catalog must be owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/modify-items-in-batch/) By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: `Owner`, `Admin`.  This endpoint is not available to all users.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/advanced_auction/items/submit" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdvancedAuctionItemsSubmitRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvancedAuctionProcessedItems}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>206 (success)</b>: Successful</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>500 (server error)</b>: The server encountered an unexpected condition that prevented it from fulfilling the request.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advancedAuctionItemsSubmitPost();

    /**
     * <p>Get audience insights</p>
     *
     * <p>Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/audience_insights" (<i>privileged: true</i>)</p>
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
     * <p>"<b>audience_insight_type</b>"
     * <p>Type of audience insights.</p>
     * <p>
     * - Parameter type: <b>{@link AudienceInsightType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AudienceInsights}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audienceInsightsGet();

    /**
     * <p>Get audience insights scope and type</p>
     *
     * <p>Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/insights/audiences" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AudienceInsightsScopeAndTypeGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audienceInsightsScopeAndTypeGet();

    /**
     * <p>List accounts with access to an audience owned by an ad account</p>
     *
     * <p>List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>audience_id</b>"
     * <p>Unique identifier of the audience to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>account_type</b>"
     * <p>Filter accounts by account type.</p>
     * <p>
     * - Parameter type: <b>{@link AudienceAccountType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsAudiencesSharedAccountsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsAudiencesSharedAccountsList();

    /**
     * <p>List accounts with access to an audience owned by a business</p>
     *
     * <p>List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/audiences/shared/accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>audience_id</b>"
     * <p>Unique identifier of the audience to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>account_type</b>"
     * <p>Filter accounts by account type.</p>
     * <p>
     * - Parameter type: <b>{@link AudienceAccountType}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsAudiencesSharedAccountsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessAccountAudiencesSharedAccountsList();

    /**
     * <p>List received audiences for a business</p>
     *
     * <p>Get a list of received audiences for the given business.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/audiences" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link Order}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SharedAudiencesForBusinessList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler sharedAudiencesForBusinessList();

    /**
     * <p>Update audience sharing between ad accounts</p>
     *
     * <p>From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountToAdAccountSharedAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateAdAccountToAdAccountSharedAudience();

    /**
     * <p>Update audience sharing from an ad account to businesses</p>
     *
     * <p>From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdAccountToBusinessSharedAudienceUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountToBusinessSharedAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateAdAccountToBusinessSharedAudience();

    /**
     * <p>Update audience sharing from a business to ad accounts</p>
     *
     * <p>From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/audiences/ad_accounts/shared" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BusinessToAdAccountSharedAudienceUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessToAdAccountSharedAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateBusinessToAdAccountSharedAudience();

    /**
     * <p>Update audience sharing between businesses</p>
     *
     * <p>From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/audiences/businesses/shared" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BusinessToBusinessSharedAudienceUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessToBusinessSharedAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateBusinessToBusinessSharedAudience();

    /**
     * <p>Create audience</p>
     *
     * <p>Create a new audience for the ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/audiences" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdAccountsAudienceCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audiencesCreate();

    /**
     * <p>Get audience</p>
     *
     * <p>Get a specific audience given the audience ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>audience_id</b>"
     * <p>Audience ID.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audiencesGet();

    /**
     * <p>List audiences</p>
     *
     * <p>Get list of audiences for the ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/audiences" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ownership_type</b>"
     * <p>
     * - Parameter type: <b>{@link AudienceOwnershipType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>exclude_nca</b>"
     * <p>When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all).</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AudiencesList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audiencesList();

    /**
     * <p>Update audience</p>
     *
     * <p>Update an existing audience for the ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>audience_id</b>"
     * <p>Audience ID.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdAccountsAudienceUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsAudience}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler audiencesUpdate();

    /**
     * <p>Redeem ad credits</p>
     *
     * <p>Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdsCreditRedeemCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsCreditRedeem}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsCreditRedeem();

    /**
     * <p>Get ads credit discounts</p>
     *
     * <p>Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdsCreditsDiscountsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adsCreditsDiscountsGet();

    /**
     * <p>Get download url for a billing invoice</p>
     *
     * <p>Get download url for a billing invoice.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download" (<i>privileged: true</i>)</p>
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
     * <p>"<b>billing_invoice_id</b>"
     * <p>Unique identifier of a billing invoice.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BillingInvoiceDownloadResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler billingInvoiceDownloadGet();

    /**
     * <p>Get billing invoices</p>
     *
     * <p>Get billing invoices in the advertiser account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/billing_invoices" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort</b>"
     * <p>Field of which to sort billing invoices</p>
     * <p>
     * - Parameter type: <b>{@link BillingInvoiceSortField}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>DUE_DATE</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>status</b>"
     * <p>Status of billing invoices to filter by</p>
     * <p>
     * - Parameter type: <b>{@link BillingInvoiceStatus}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>document_type</b>"
     * <p>Document type of billing invoices to filter by</p>
     * <p>
     * - Parameter type: <b>{@link BillingInvoiceDocumentType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_due_date</b>"
     * <p>Starting point for due dates when searching for invoices. Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_due_date</b>"
     * <p>Ending point for due dates when searching for invoices. Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BillingInvoicesGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler billingInvoicesGet();

    /**
     * <p>Get billing profiles</p>
     *
     * <p>Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/billing_profiles" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>is_active</b>"
     * <p>Return active billing profiles, if false return all billing profiles.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BillingProfilesGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler billingProfilesGet();

    /**
     * <p>Get Salesforce account details including bill-to information.</p>
     *
     * <p>  Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ssio/accounts" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SSIOAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioAccountsGet();

    /**
     * <p>Create insertion order through SSIO.</p>
     *
     * <p>  Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link SSIOInsertionOrderCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SSIOInsertionOrder}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioInsertionOrderCreate();

    /**
     * <p>Edit insertion order through SSIO.</p>
     *
     * <p>  Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link SSIOInsertionOrderUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SSIOInsertionOrder}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioInsertionOrderEdit();

    /**
     * <p>Get insertion order status by ad account id.</p>
     *
     * <p>  Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SsioInsertionOrdersStatusGetByAdAccount200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioInsertionOrdersStatusGetByAdAccount();

    /**
     * <p>Get insertion order status by pin order id.</p>
     *
     * <p>  Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status" (<i>privileged: true</i>)</p>
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
     * <p>"<b>pin_order_id</b>"
     * <p>The pin order id associated with the ssio insertion order</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SSIOInsertionOrderStatusResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioInsertionOrdersStatusGetByPinOrderId();

    /**
     * <p>Get Salesforce order lines by ad account id.</p>
     *
     * <p>  Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/ssio/order_lines" (<i>privileged: true</i>)</p>
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
     * <p>"<b>pin_order_id</b>"
     * <p>The pin order id associated with the SSIO insertion order</p>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SsioOrderLinesGetByAdAccount200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ssioOrderLinesGetByAdAccount();

    /**
     * <p>Create board section</p>
     *
     * <p>Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardSectionCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSection}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsCreate();

    /**
     * <p>Delete board section</p>
     *
     * <p>Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSection}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsDelete();

    /**
     * <p>List board sections</p>
     *
     * <p>Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSectionsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsList();

    /**
     * <p>List Pins on board section</p>
     *
     * <p>Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardsListPins200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsListPins();

    /**
     * <p>Update board section</p>
     *
     * <p>Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardSectionUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardSection}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardSectionsUpdate();

    /**
     * <p>Create board</p>
     *
     * <p>Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/boards" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsCreate();

    /**
     * <p>Delete board</p>
     *
     * <p>Delete a board owned by the \"operation user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsDelete();

    /**
     * <p>Get board</p>
     *
     * <p>Get a board owned by the operation user_account - or a group board that has been shared with this account. * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Board}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsGet();

    /**
     * <p>List boards</p>
     *
     * <p>Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. * If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/boards" (<i>privileged: true</i>)</p>
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
     * <li>
     * <p>"<b>privacy</b>"
     * <p>The privacy level of the board</p>
     * <p>
     * - Parameter type: <b>{@link BoardPrivacyFilter}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsList();

    /**
     * <p>List Pins on board</p>
     *
     * <p>Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.</p>
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
     * <p>"<b>creative_types</b>"
     * <p>Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;CreativeType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <li>
     * <p>"<b>pin_metrics</b>"
     * <p>Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardsListPins200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsListPins();

    /**
     * <p>Update board</p>
     *
     * <p>Update a board owned by the \"operating user_account\". * Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". * By default, the \"operation user_account\" is the token user_account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/boards/{board_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>board_id</b>"
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BoardWithUpdatePrivacyUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardWithUpdatePrivacy}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsUpdate();

    /**
     * <p>Get advertiser entities in bulk</p>
     *
     * <p>Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/bulk/download" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BulkDownloadCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BulkDownload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler bulkDownloadCreate();

    /**
     * <p>Download advertiser entities in bulk</p>
     *
     * <p>Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>bulk_request_id</b>"
     * <p>Bulk request ID that is from one of the entities bulk endpoints</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_details</b>"
     * <p>If set to True then attach the errors/details to all the requests</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BulkJobData}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler bulkRequestGet();

    /**
     * <p>Create/update ad entities in bulk</p>
     *
     * <p>Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/bulk/upsert" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BulkUpsertRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BulkUpsertResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler bulkUpsertCreate();

    /**
     * <p>Create a new asset group.</p>
     *
     * <p>Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/businesses/{business_id}/asset_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AssetGroupInputCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssetGroupInput}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler assetGroupCreate();

    /**
     * <p>Delete asset groups.</p>
     *
     * <p>Delete a batch of asset groups.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/asset_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AssetGroupDeletionDelete} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssetGroupDeletion}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler assetGroupDelete();

    /**
     * <p>Update asset groups.</p>
     *
     * <p>Update a batch of asset groups with the specified parameters.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/asset_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AssetGroupModificationReadOrUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AssetGroupModification}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler assetGroupUpdate();

    /**
     * <p>Get members with access to asset</p>
     *
     * <p>Get all the members the requesting business has granted access to on the given asset.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/assets/{asset_id}/members" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_id</b>"
     * <p>Unique identifier of a business asset.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>fetch_system_users</b>"
     * <p>Fetches system users if True. Fetches regular user employees if False.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessAssetMembersGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessAssetMembersGet();

    /**
     * <p>Get partners with access to asset</p>
     *
     * <p>Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/assets/{asset_id}/partners" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_id</b>"
     * <p>Unique identifier of a business asset.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessAssetMembersGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessAssetPartnersGet();

    /**
     * <p>List business assets</p>
     *
     * <p>Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/assets" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>permissions</b>"
     * <p>A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;PermissionsWithOwner&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>child_asset_id</b>"
     * <p>A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_group_id</b>"
     * <p>An asset group unique identifier. Used to fetch assets contained within the specified asset group.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_type</b>"
     * <p>A resource type to filter the assets by. Only assets of the specified type will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>AD_ACCOUNT</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessAssetsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessAssetsGet();

    /**
     * <p>Get assets assigned to a member</p>
     *
     * <p>Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/members/{member_id}/assets" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>member_id</b>"
     * <p>The member id to fetch assets for.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_type</b>"
     * <p>A resource type to filter the assets by. Only assets of the specified type will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>AD_ACCOUNT</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_by</b>"
     * <p>The field to sort member assets by</p>
     * <p>
     * - Parameter type: <b>{@link AssetSortBy}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_ascending</b>"
     * <p>Sort assets in ascending order</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_by</b>"
     * <p>The field to search member assets by</p>
     * <p>
     * - Parameter type: <b>{@link AssetSearchBy}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_value</b>"
     * <p>The value to search for</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_permission_type</b>"
     * <p>The type of asset permission to filter by</p>
     * <p>
     * - Parameter type: <b>{@link AssetPermissionType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_account_statuses</b>"
     * <p>A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;NonDraftEntityStatus&gt;}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessMemberAssetsGetResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessMemberAssetsGet();

    /**
     * <p>Delete member access to asset</p>
     *
     * <p>Terminate multiple members' access to an asset.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/members/assets/access" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BusinessMembersAssetAccessDeleteBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteMemberAccessResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessMembersAssetAccessDelete();

    /**
     * <p>Assign/Update member asset permissions</p>
     *
     * <p>Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/members/assets/access" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link UpdateMemberAssetAccessBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UpdateMemberAssetsResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessMembersAssetAccessUpdate();

    /**
     * <p>Get assets assigned to a partner or assets assigned by a partner</p>
     *
     * <p>Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/partners/{partner_id}/assets" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>partner_id</b>"
     * <p>The partner id to be bound to the Business</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>partner_type</b>"
     * <p>Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>INTERNAL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>asset_type</b>"
     * <p>A resource type to filter the assets by. Only assets of the specified type will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>AD_ACCOUNT</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_by</b>"
     * <p>The field to sort member assets by</p>
     * <p>
     * - Parameter type: <b>{@link AssetSortBy}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_ascending</b>"
     * <p>Sort assets in ascending order</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_by</b>"
     * <p>The field to search member assets by</p>
     * <p>
     * - Parameter type: <b>{@link AssetSearchBy}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_value</b>"
     * <p>The value to search for</p>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BusinessPartnerAssetAccessGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler businessPartnerAssetAccessGet();

    /**
     * <p>Delete partner access to asset</p>
     *
     * <p>Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/partners/assets" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link DeletePartnerAssetAccessBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeletePartnerAssetAccessResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deletePartnerAssetAccessHandlerImpl();

    /**
     * <p>Assign/Update partner asset permissions</p>
     *
     * <p>Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/partners/assets" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link UpdatePartnerAssetAccessBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UpdatePartnerAssetsResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updatePartnerAssetAccessHandlerImpl();

    /**
     * <p>Create a request to access an existing partner's assets.</p>
     *
     * <p>Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/businesses/{business_id}/requests/assets/access" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateAssetAccessRequestBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateAssetAccessRequestResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler assetAccessRequestsCreate();

    /**
     * <p>Cancel invites/requests</p>
     *
     * <p>Cancel membership/partnership invites and/or requests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/invites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CancelInvitesRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CancelInvitesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler cancelInvitesOrRequests();

    /**
     * <p>Update invite/request with an asset permission</p>
     *
     * <p>Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/businesses/{business_id}/invites/assets/access" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateAssetInvitesRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UpdateInvitesResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createAssetInvites();

    /**
     * <p>Create invites or requests</p>
     *
     * <p>Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/businesses/{business_id}/invites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CreateMembershipOrPartnershipInvitesBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CreateInvitesResultsResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler createMembershipOrPartnershipInvites();

    /**
     * <p>Get invites/requests</p>
     *
     * <p>Get the membership/partnership invites and/or requests for the authorized user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/invites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>is_member</b>"
     * <p>A boolean field to indicate whether the invite is to create a partnership or a membership.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>invite_status</b>"
     * <p>A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;InviteFilterStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>invite_type</b>"
     * <p>Invite type to filter invites by. Only invites of the specified type will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link InviteType}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GetInvites200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getInvites();

    /**
     * <p>Accept or decline an invite/request</p>
     *
     * <p>Accept or decline invites or requests.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/invites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AuthRespondInvitesBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RespondToInvitesResponseArray}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler respondBusinessAccessInvites();

    /**
     * <p>Create a Brand Account</p>
     *
     * <p>Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_hierarchy_id</b>"
     * <p>business hierarchy node id</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BrandAccountCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BrandAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler brandAccountsCreate();

    /**
     * <p>Update a Brand Account</p>
     *
     * <p>Update an existing Brand Account</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>brand_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>business_hierarchy_id</b>"
     * <p>business hierarchy node id</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link BrandAccountUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BrandAccount}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>409 (client error)</b>: The request could not be processed because of a conflict in the current state of the resource.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler brandAccountsUpdate();

    /**
     * <p>Terminate business memberships</p>
     *
     * <p>Terminate memberships between the specified members and your business.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/members" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Business id</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link DeleteBusinessMembershipBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteBusinessMembership200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteBusinessMembership();

    /**
     * <p>Terminate business partnerships</p>
     *
     * <p>Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/businesses/{business_id}/partners" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link DeleteBusinessPartnersDelete} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeleteBusinessPartners}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deleteBusinessPartners();

    /**
     * <p>List business employers for user</p>
     *
     * <p>Get all of the viewing user's business employers.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/employers" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>assets_summary</b>"
     * <p>Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>true</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GetBusinessEmployers200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getBusinessEmployers();

    /**
     * <p>Get business members</p>
     *
     * <p>Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/members" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>fetch_system_users</b>"
     * <p>Fetches system users if True. Fetches regular user employees if False.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>assets_summary</b>"
     * <p>Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>business_roles</b>"
     * <p>A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;MemberBusinessRole&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>member_ids</b>"
     * <p>A list of business members ids separated by comma.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GetBusinessEmployers200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getBusinessMembers();

    /**
     * <p>Get business partners</p>
     *
     * <p>Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/businesses/{business_id}/partners" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>assets_summary</b>"
     * <p>Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>partner_type</b>"
     * <p>Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.</p>
     * <p>
     * - Parameter type: <b>{@link PartnerType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>partner_ids</b>"
     * <p>A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_index</b>"
     * <p>An index to start fetching the results from. Only the results starting from this index will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>0</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_ascending</b>"
     * <p>Sort ascending.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link GetBusinessEmployers200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getBusinessPartners();

    /**
     * <p>Update a system user information.</p>
     *
     * <p>Update a system user information such as name.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/system_users/{system_user_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Unique identifier of the requesting business.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>system_user_id</b>"
     * <p>Unique identifier of a system user.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link SystemUserUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler systemUserUpdate();

    /**
     * <p>Update member's business role</p>
     *
     * <p>Update a member's business role within the business.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/businesses/{business_id}/members" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>business_id</b>"
     * <p>Business id</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link BusinessMembershipMember} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UpdateBusinessMembershipsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler updateBusinessMemberships();

    /**
     * <p>Get pins analytics</p>
     *
     * <p>Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/pins/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>campaign_id</b>"
     * <p>Campaign Id to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pin_ids</b>"
     * <p>List of Pin IDs.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link AdPinAnalytics}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adPinsAnalytics();

    /**
     * <p>Get targeting analytics for campaigns</p>
     *
     * <p>Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics" (<i>privileged: true</i>)</p>
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
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>targeting_types</b>"
     * <p>Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AdsAnalyticsCampaignTargetingType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>columns</b>"
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
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
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>attribution_types</b>"
     * <p>List of types of attribution for the conversion report</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ConversionReportAttributionType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignTargetingAnalyticsGet();

    /**
     * <p>Get campaign analytics</p>
     *
     * <p>Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaigns/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
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
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>aggregate_report_rows</b>"
     * <p>Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CampaignsAnalyticsMetrics}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsAnalytics();

    /**
     * <p>Create campaigns</p>
     *
     * <p>Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/campaigns" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link CampaignCreateItem} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CampaignBatchWriteResponseModel}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsCreate();

    /**
     * <p>Get campaign</p>
     *
     * <p>Get a specific campaign given the campaign ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>campaign_id</b>"
     * <p>Campaign ID, must be associated with the ad account ID provided in the path.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Campaign}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsGet();

    /**
     * <p>List campaigns</p>
     *
     * <p>Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
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
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;EntityStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ACTIVE,PAUSED</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CampaignsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsList();

    /**
     * <p>Update campaigns</p>
     *
     * <p>Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/campaigns" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link CampaignBatchUpdateItem} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CampaignBatchWriteResponseModel}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler campaignsUpdate();

    /**
     * <p>Get campaign delivery estimates</p>
     *
     * <p>Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/campaigns/delivery_estimates" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link CampaignDeliveryEstimatesCampaign} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CampaignDeliveryEstimatesResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>503 (server error)</b>: The service is temporarily unavailable.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getCampaignDeliveryEstimates();

    /**
     * <p>List feed processing results</p>
     *
     * <p>Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds/{feed_id}/processing_results" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed.</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FeedProcessingResultsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedProcessingResultsList();

    /**
     * <p>Create feed</p>
     *
     * <p>Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/feeds" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsFeedCreateRequestSchema} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsCreate();

    /**
     * <p>Delete feed</p>
     *
     * <p>Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsDelete();

    /**
     * <p>Get feed</p>
     *
     * <p>Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsGet();

    /**
     * <p>Ingest feed items</p>
     *
     * <p>Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/feeds/{feed_id}/ingest" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeedIngestion}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsIngest();

    /**
     * <p>List feeds</p>
     *
     * <p>Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/feeds" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Filter entities for a given catalog_id. If not given, all catalogs are considered.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FeedsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsList();

    /**
     * <p>Update feed</p>
     *
     * <p>Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/catalogs/feeds/{feed_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Unique identifier of a feed.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsFeedUpdateRequestSchema} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsFeed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler feedsUpdate();

    /**
     * <p>List item issues</p>
     *
     * <p>List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/processing_results/{processing_result_id}/item_issues" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>processing_result_id</b>"
     * <p>Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>item_numbers</b>"
     * <p>Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>item_validation_issue</b>"
     * <p>Filter item validation issues that have a given type of item validation issue.</p>
     * <p>
     * - Parameter type: <b>{@link CatalogsItemValidationIssue}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemsIssuesList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsIssuesList();

    /**
     * <p>Get item batch status</p>
     *
     * <p>Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsItemsBatch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsBatchGet();

    /**
     * <p>Operate on item batch</p>
     *
     * <p>This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/items/batch" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsItemsBatchPostRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsItemsBatch}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsBatchPost();

    /**
     * <p>Get catalogs items (POST)</p>
     *
     * <p>Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/items" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsItemsRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ItemsPost200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler itemsPost();

    /**
     * <p>List products by product group</p>
     *
     * <p>Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/product_groups/{product_group_id}/products" (<i>privileged: true</i>)</p>
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
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>Unique identifier of an ad account.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pin_metrics</b>"
     * <p>Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsProductGroupPinsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupPinsList();

    /**
     * <p>Create product group</p>
     *
     * <p>Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/product_groups" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsProductGroupsCreateRequestSchema} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsVerticalProductGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsCreate();

    /**
     * <p>Create product groups</p>
     *
     * <p>Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/product_groups/multiple" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link CatalogsProductGroupsCreateManyRequestItems} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: The request has succeeded and a new resource has been created as a result.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsCreateMany();

    /**
     * <p>Delete product group</p>
     *
     * <p>Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsVerticalProductGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsDelete();

    /**
     * <p>Delete product groups</p>
     *
     * <p>Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/catalogs/product_groups/multiple" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>Comma-separated list of product group ids</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsDeleteMany();

    /**
     * <p>Get product group</p>
     *
     * <p>Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/product_groups/{product_group_id}" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsVerticalProductGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsGet();

    /**
     * <p>List product groups</p>
     *
     * <p>Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/product_groups" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>Comma-separated list of product group ids</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;Integer&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Filter entities for a given feed_id. If not given, all feeds are considered.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Filter entities for a given catalog_id. If not given, all catalogs are considered.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsProductGroupsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsList();

    /**
     * <p>Get product counts</p>
     *
     * <p>Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/product_groups/{product_group_id}/product_counts" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsProductGroupProductCountsVertical}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsProductCountsGet();

    /**
     * <p>Update single product group</p>
     *
     * <p>Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsProductGroupsUpdateRequestSchema} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsVerticalProductGroup}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsProductGroupsUpdate();

    /**
     * <p>List products by filter</p>
     *
     * <p>List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/products/get_by_product_group_filters" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
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
     * <li>
     * <p>"<b>pin_metrics</b>"
     * <p>Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsListProductsByFilterRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsProductGroupPinsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productsByProductGroupFilterList();

    /**
     * <p>Build catalogs report</p>
     *
     * <p>Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/reports" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogsReportParameters} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsCreateReportResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler reportsCreate();

    /**
     * <p>Get catalogs report</p>
     *
     * <p>This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/reports" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>token</b>"
     * <p>Token returned from the post request creation call</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsReport}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler reportsGet();

    /**
     * <p>List report stats</p>
     *
     * <p>List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/reports/stats" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>parameters</b>"
     * <p>Contains the parameters for report identification.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.Map Map} of {@link CatalogsReportStatsParameters}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ReportsStats200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler reportsStats();

    /**
     * <p>Operate on local inventory item batch</p>
     *
     * <p>Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/{catalog_id}/local_inventory_items/batch" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LocalInventoryItemsBatchCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SupplementalItemsBatchResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalInventoryItemsBatchOperate();

    /**
     * <p>Get local inventory items (POST)</p>
     *
     * <p>Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/{catalog_id}/local_inventory_items/query" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LocalInventoryItemsGetCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LocalInventoryItemsGet}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalInventoryItemsPost();

    /**
     * <p>Create local stores</p>
     *
     * <p>Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs/{catalog_id}/local_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link LocalStoreCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CatalogsLocalStoresCreate200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalStoresCreate();

    /**
     * <p>Delete local stores</p>
     *
     * <p>  Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/catalogs/{catalog_id}/local_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ids</b>"
     * <p>List of local store IDs to filter by.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CatalogsLocalStoresDelete200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalStoresDelete();

    /**
     * <p>List local stores</p>
     *
     * <p>Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/{catalog_id}/local_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ids</b>"
     * <p>List of local store IDs to filter by.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsLocalStoresList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalStoresList();

    /**
     * <p>Update local stores</p>
     *
     * <p>  Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/catalogs/{catalog_id}/local_stores" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link LocalStoreBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link CatalogsLocalStoresCreate200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsLocalStoresUpdate();

    /**
     * <p>Get supplemental items batch status</p>
     *
     * <p>Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/{catalog_id}/supplemental_items/batch/{batch_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Unique identifier of a catalog.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>batch_id</b>"
     * <p>Unique identifier of an items batch operation.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SupplementalItemsBatchResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsSupplementalItemsBatchGet();

    /**
     * <p>List available filter values</p>
     *
     * <p>Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs/available_filter_values" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>catalog_id</b>"
     * <p>Filter entities for a given catalog_id.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>feed_id</b>"
     * <p>Filter entities for a given feed_id. If not given, all feeds are considered.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>country</b>"
     * <p>Country for the Catalogs Items</p>
     * <p>
     * - Parameter type: <b>{@link Country}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>language</b>"
     * <p>Language for the Catalogs Items</p>
     * <p>
     * - Parameter type: <b>{@link CatalogsLocale}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsAvailableFilterValues}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsAvailableFilterValues();

    /**
     * <p>Create catalog</p>
     *
     * <p>Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/catalogs" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CatalogCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Catalog}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsCreate();

    /**
     * <p>List catalogs</p>
     *
     * <p>Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/catalogs" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CatalogsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler catalogsList();

    /**
     * <p>Create a conversion deletion request</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ConversionDeletionRequestCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionDeletionRequest}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionDeletionRequestCreate();

    /**
     * <p>Delete a conversion deletion request</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>request_id</b>"
     * <p>Unique identifier of the conversion deletion request</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionDeletionRequest}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionDeletionRequestDelete();

    /**
     * <p>Get a single conversion deletion request</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>request_id</b>"
     * <p>Unique identifier of the conversion deletion request</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionDeletionRequest}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionDeletionRequestGet();

    /**
     * <p>List conversion deletion requests</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_deletion_requests" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionDeletionRequestList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionDeletionRequestList();

    /**
     * <p>Get event quality score (EQS)</p>
     *
     * <p>Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_eqs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>lookback_period</b>"
     * <p>Lookback window (number of days).</p>
     * <p>
     * - Parameter type: <b>{@link LookbackPeriodOptions}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>source_platform</b>"
     * <p>Source platform of event.</p>
     * <p>
     * - Parameter type: <b>{@link SourcePlatformOptions}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ingestion_source</b>"
     * <p>Ingestion source of event.</p>
     * <p>
     * - Parameter type: <b>{@link IngestionSourceOptions}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link EventQualityScore}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionEqsList();

    /**
     * <p>Send conversions</p>
     *
     * <p>The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their `ad_account_id`. The request body should be a JSON object. - This endpoint requires an `access_token` be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is `Authorization: Bearer <access_token>`). - The token's `user_account` must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/events" (<i>privileged: true</i>)</p>
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
     * <p>"<b>test</b>"
     * <p>Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ConversionEventsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionEvents}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>422 (client error)</b>: The request was well-formed but was unable to be followed due to semantic errors.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>503 (server error)</b>: The server is currently unable to handle the request due to a temporary overload or scheduled maintenance.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler eventsCreate();

    /**
     * <p>Create conversion tag</p>
     *
     * <p>Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/conversion_tags" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ConversionTagCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionTag}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionTagsCreate();

    /**
     * <p>Get conversion tag</p>
     *
     * <p>Get information about an existing conversion tag.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>conversion_tag_id</b>"
     * <p>Id of the conversion tag.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionTag}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionTagsGet();

    /**
     * <p>List conversion tags</p>
     *
     * <p>List conversion tags associated with an ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_tags" (<i>privileged: true</i>)</p>
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
     * <p>"<b>filter_deleted</b>"
     * <p>Filter by deleted status</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionTagsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler conversionTagsList();

    /**
     * <p>Get Ocpm eligible conversion tags</p>
     *
     * <p>Get Ocpm eligible conversion tag events for an ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link List}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler ocpmEligibleConversionTagsGet();

    /**
     * <p>Get page visit conversion tags</p>
     *
     * <p>Get all page visit conversion tag events for an ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PageVisitConversionTagsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pageVisitConversionTagsGet();

    /**
     * <p>Create advertiser defined events</p>
     *
     * <p>Map advertiser defined events to standard events for the given ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/advertiser_defined_events" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdvertiserDefinedEventsCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvertiserDefinedEventsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advertiserDefinedEventsCreate();

    /**
     * <p>Delete advertiser defined events</p>
     *
     * <p>Untrack advertiser defined events for the given ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/advertiser_defined_events" (<i>privileged: true</i>)</p>
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
     * <p>"<b>event_names</b>"
     * <p>List of event names to delete</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvertiserDefinedEventsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advertiserDefinedEventsDelete();

    /**
     * <p>Get advertiser defined events</p>
     *
     * <p>Get advertiser defined events for the given ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/advertiser_defined_events" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvertiserDefinedEventsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advertiserDefinedEventsGet();

    /**
     * <p>Update advertiser defined events</p>
     *
     * <p>Update advertiser defined event names or mappings for the given ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/advertiser_defined_events" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link AdvertiserDefinedEventsCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdvertiserDefinedEventsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler advertiserDefinedEventsUpdate();

    /**
     * <p>Create customer list upload</p>
     *
     * <p>Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_id</b>"
     * <p>Customer list ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CustomerListUploadCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerListUploadCreateResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListUploadsCreate();

    /**
     * <p>Get customer list upload</p>
     *
     * <p>Get the metadata for a given upload by its ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_id</b>"
     * <p>Customer list ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_upload_id</b>"
     * <p>Customer List Upload ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerListUpload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListUploadsGet();

    /**
     * <p>Run customer list upload</p>
     *
     * <p>Begin processing a customer list upload.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_id</b>"
     * <p>Customer list ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_upload_id</b>"
     * <p>Customer List Upload ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerListUpload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListUploadsRun();

    /**
     * <p>Create customer lists</p>
     *
     * <p>Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/customer_lists" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CustomerListCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListsCreate();

    /**
     * <p>Get customer list</p>
     *
     * <p>Gets a specific customer list given the customer list ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_id</b>"
     * <p>Customer list ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListsGet();

    /**
     * <p>Get customer lists</p>
     *
     * <p>Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/customer_lists" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>exclude_nca</b>"
     * <p>When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerListsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListsList();

    /**
     * <p>Update customer list</p>
     *
     * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>customer_list_id</b>"
     * <p>Customer list ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CustomerListUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerList}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerListsUpdate();

    /**
     * <p>Create customer segments</p>
     *
     * <p>Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/customer_segments" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CustomerSegmentCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerSegment}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerSegmentCreate();

    /**
     * <p>List customer segments</p>
     *
     * <p>Get a list of the customer segments in the specified `ad_account_id`.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/customer_segments" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_sizing</b>"
     * <p>Include audience sizing in result or not</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_query</b>"
     * <p>Search query. Can contain pin description keywords or comma-separated pin IDs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link CustomerSegmentList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerSegmentList();

    /**
     * <p>Update customer segments</p>
     *
     * <p>Update the customer segment given advertiser ID and customer segment ID</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/customer_segments" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link CustomerSegmentUpdateRequestUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler customerSegmentUpdate();

    /**
     * <p>Delete commerce integration</p>
     *
     * <p>Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/integrations/commerce/{external_business_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>external_business_id</b>"
     * <p>External business ID for the integration.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationMetadata}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsCommerceDel();

    /**
     * <p>Get commerce integration</p>
     *
     * <p>Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/integrations/commerce/{external_business_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>external_business_id</b>"
     * <p>External business ID for the integration.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationMetadata}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsCommerceGet();

    /**
     * <p>Update commerce integration</p>
     *
     * <p>Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/integrations/commerce/{external_business_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>external_business_id</b>"
     * <p>External business ID for the integration.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link IntegrationMetadataUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationMetadata}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsCommercePatch();

    /**
     * <p>Create commerce integration</p>
     *
     * <p>Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/integrations/commerce" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link IntegrationMetadataCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationMetadata}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsCommercePost();

    /**
     * <p>Get integration metadata</p>
     *
     * <p>Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/integrations/{id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>id</b>"
     * <p>Integration record ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationRecord}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsGetById();

    /**
     * <p>Get integration metadata list</p>
     *
     * <p>Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/integrations" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationsGetList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsGetList();

    /**
     * <p>Receives batched logs from integration applications.</p>
     *
     * <p>This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/integrations/logs" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link IntegrationLogsRequestCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link IntegrationLogsSuccessResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The server could not understand the request due to invalid syntax.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler integrationsLogsPost();

    /**
     * <p>Get country's keyword metrics</p>
     *
     * <p>  See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \"Get delivery metrics definitions\"   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/keywords/metrics" (<i>privileged: true</i>)</p>
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
     * <p>"<b>country_code</b>"
     * <p>Two letter country code (ISO 3166-1 alpha-2)</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>keywords</b>"
     * <p>Comma-separated keywords</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link KeywordsMetricsArrayResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler countryKeywordsMetricsGet();

    /**
     * <p>Create keywords</p>
     *
     * <p>  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:     ```json     {       \"keywords\": [],       \"errors\": [         {           \"data\": {             \"archived\": null,             \"match_type\": \"EXACT\",             \"parent_type\": null,             \"value\": \"foobar\",             \"parent_id\": null,             \"type\": \"keyword\",             \"id\": null           },           \"error_messages\": [             \"Advertisers and Campaigns only accept excluded targeting attributes.\"           ]         }       ]     }</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/keywords" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link KeywordsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Keywords}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler keywordsCreate();

    /**
     * <p>Get keywords</p>
     *
     * <p>    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:       ```json       {         \"keywords\": [],         \"errors\": [           {             \"data\": {               \"archived\": null,               \"match_type\": \"EXACT\",               \"parent_type\": null,               \"value\": \"foobar\",               \"parent_id\": null,               \"type\": \"keyword\",               \"id\": null             },             \"error_messages\": [               \"Advertisers and Campaigns only accept excluded targeting attributes.\"             ]           }         ]       }</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/keywords" (<i>privileged: true</i>)</p>
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
     * <p>"<b>campaign_id</b>"
     * <p>Campaign Id to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group Id.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_ids</b>"
     * <p>List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>match_types</b>"
     * <p>Keyword [match type](/docs/api-features/targeting-overview/)</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;MatchType&gt;}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link KeywordsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler keywordsGet();

    /**
     * <p>Update keywords</p>
     *
     * <p>  Update one or more keywords' bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity's keywords list.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/keywords" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link KeywordsUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Keywords}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler keywordsUpdate();

    /**
     * <p>List trending keywords</p>
     *
     * <p>Get the top trending search keywords among the Pinterest user audience.  Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.  Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.  For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/trends/keywords/{region}/top/{trend_type}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>region</b>"
     * <p>  The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia</p>
     * <p>
     * - Parameter type: <b>{@link TrendsSupportedRegion}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>trend_type</b>"
     * <p>  The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)</p>
     * <p>
     * - Parameter type: <b>{@link TrendType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>interests</b>"
     * <p>  The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;TrendsL1Interest&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>genders</b>"
     * <p>If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;TrendsGenderFilter&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ages</b>"
     * <p>If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;TrendsAgeBucket&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_keywords</b>"
     * <p>If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>normalize_against_group</b>"
     * <p> Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>50</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_demographics</b>"
     * <p>Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TrendingKeywordsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler trendingKeywordsList();

    /**
     * <p>Apply label to entity</p>
     *
     * <p>  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/labels/{label_id}/apply" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>label_id</b>"
     * <p>Label ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LabeledEntitiesCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LabeledEntities}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler labelsApply();

    /**
     * <p>Create labels</p>
     *
     * <p>[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/labels" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LabelCreateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LabelsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler labelsCreate();

    /**
     * <p>List labels</p>
     *
     * <p>[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/labels" (<i>privileged: true</i>)</p>
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
     * <p>"<b>label_ids</b>"
     * <p>List of Label Ids to use to filter the results.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>entity_statuses</b>"
     * <p>Label entity status</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QueryLabelEntityStatusesItems&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ACTIVE</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>label_types</b>"
     * <p>Label type.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QueryLabelTypesItems&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>BRAND,CUSTOM</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LabelsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler labelsList();

    /**
     * <p>Remove label from entities</p>
     *
     * <p>  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/labels/{label_id}/remove" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>label_id</b>"
     * <p>Label ID.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LabeledEntitiesCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LabeledEntities}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler labelsRemove();

    /**
     * <p>Update labels</p>
     *
     * <p>[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/labels" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LabelUpdateRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LabelsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler labelsUpdate();

    /**
     * <p>Delete lead ads subscription</p>
     *
     * <p>Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>subscription_id</b>"
     * <p>Unique identifier of a subscription.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadSubscription}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsSubscriptionsDelById();

    /**
     * <p>Get lead ads subscription by ID</p>
     *
     * <p>Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>subscription_id</b>"
     * <p>Unique identifier of a subscription.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadSubscription}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsSubscriptionsGetById();

    /**
     * <p>Get lead ads subscriptions</p>
     *
     * <p>Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/leads/subscriptions" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountsSubscriptionsGetList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsSubscriptionsGetList();

    /**
     * <p>Create lead ads subscription</p>
     *
     * <p>Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/leads/subscriptions" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LeadSubscriptionPostParamsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadSubscription}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountsSubscriptionsPost();

    /**
     * <p>Get lead form by id</p>
     *
     * <p>**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>lead_form_id</b>"
     * <p>The ID of this lead form</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadForm}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormGet();

    /**
     * <p>Create lead form test data</p>
     *
     * <p>Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>lead_form_id</b>"
     * <p>Unique identifier of a lead form.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LeadFormTestCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadFormTest}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormTestCreate();

    /**
     * <p>Create lead forms</p>
     *
     * <p>**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/lead_forms" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link LeadFormCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadFormsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormsCreate();

    /**
     * <p>List lead forms</p>
     *
     * <p>**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/lead_forms" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadFormsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormsList();

    /**
     * <p>Update lead forms</p>
     *
     * <p>**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/lead_forms" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link LeadFormBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadFormsCreate200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormsUpdate();

    /**
     * <p>Create a request to export leads collected from a lead ad</p>
     *
     * <p>**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/leads_export" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link LeadsExportsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadsExports}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadsExportCreate();

    /**
     * <p>Get the lead export from the lead export create call</p>
     *
     * <p>**This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>leads_export_id</b>"
     * <p>lead_export_id token returned from the create a lead export endpoint</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link LeadsExportResponseData}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadsExportGet();

    /**
     * <p>Register media upload</p>
     *
     * <p>Register your intent to upload media.  The response includes all of the information needed to upload the media to Pinterest.  To upload the media, make an HTTP POST request (using `curl`, for example) to `upload_url` using the `Content-Type` header value. Send the media file's contents as the request's `file` parameter and also include all of the parameters from `upload_parameters`.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/media" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link MediaUploadCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MediaUpload}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaCreate();

    /**
     * <p>Get media upload details</p>
     *
     * <p>Get details for a registered media upload, including its current status.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/media/{media_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>media_id</b>"
     * <p>Unique identifier for this media upload. Used to track status and for attaching during Pin creation.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Media}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaGet();

    /**
     * <p>List media uploads</p>
     *
     * <p>List media uploads filtered by given parameters.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link MediaList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler mediaList();

    /**
     * <p>Send Measurement Source Of Truth (MSOT) attributed conversion events</p>
     *
     * <p>**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/msot/events" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ConversionMSOTEventsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler msotEventsCreate();

    /**
     * <p>Receive notifications from external partners.</p>
     *
     * <p>Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/notifications" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link NotificationPostRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link NotificationResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler notificationPost();

    /**
     * <p>Generate OAuth access token for conversion API</p>
     *
     * <p>Generate a new and long-lived OAuth access token dedicated for sending conversions using a valid access token.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/oauth/conversion_token" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ConversionAccessToken}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler oauthConversionToken();

    /**
     * <p>Generate OAuth access token</p>
     *
     * <p>Generate a new OAuth access token using an authorization code; or refresh an existing one using a continuous refresh token.  Follow the complete steps for [requesting and refreshing tokens](/docs/getting-started/set-up-authentication-and-authorization/).  **Note:** If your app was created **before September 25, 2025**, make sure to set the `continuous_refresh` parameter to `true` to use the continuous refresh token (60-day expiration, refreshable indefinitely). Pinterest no longer supports the legacy refresh token (365-day expiration, hard limit).  Disregard this note if your app was activated on or after September 25, 2025. You are automatically using the continuous refresh token.  Use [Token Debugger](/docs/developer-tools/token-debugger/) to validate and inspect your access token. </p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/oauth/token" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>grant_type</b>"
     * <p>
     * - Parameter type: <b>{@link TokenGrantType}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>code</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>continuous_refresh</b>"
     * <p>  If your app was created before **September 25, 2025**, set to `true` to generate a [continuous refresh token](/docs/getting-started/set-up-authentication-and-authorization/#exchange-the-default-refresh-token-for-a-continuous-refresh-token), which has a 60-day expiration window. We no longer support the legacy refresh token, which has a 365-day expiration window.    If your app was created on or after **September 25, 2025**, ignore this parameter. You automatically receive a continuous refresh token when you request an access token.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>redirect_uri</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>refresh_token</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>scope</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/x-www-form-urlencoded}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OauthAccessToken}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler oauthToken();

    /**
     * <p>Revoke a token</p>
     *
     * <p>Revokes an access or refresh token. Only tokens issued for system users are currently supported. Revoked tokens become immediately invalid and unusable.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/oauth/token/revoke" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>token</b>"
     * <p>The token to revoke.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>token_type_hint</b>"
     * <p>The type of the token to revoke. Please refer to [our developer guide for more information](https://developers.pinterest.com/docs/getting-started/set-up-authentication-and-authorization/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link TokenTypeHint}</b><br/>
     * - Appears in: <b>{@link io.undertow.server.handlers.form.FormDataParser Form}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{mediaType=application/x-www-form-urlencoded}]</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler tokenRevoke();

    /**
     * <p>Get order line</p>
     *
     * <p>Get a specific existing order line associated with an ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>order_line_id</b>"
     * <p>Order line ID.</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OrderLine}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler orderLinesGet();

    /**
     * <p>Get order lines.</p>
     *
     * <p>List existing order lines associated with an ad account.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/order_lines" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link OrderLinesList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler orderLinesList();

    /**
     * <p>Get multiple Pin analytics</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_ids</b>"
     * <p>List of Pin IDs.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Pin metric types to get data for.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;MultiPinsAnalyticsMetricTypesItem&gt;}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link Map}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler multiPinsAnalytics();

    /**
     * <p>Get Pin analytics</p>
     *
     * <p>Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
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
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QuerypinanalyticsmetrictypesItems&gt;}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link PinAnalyticsMetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsAnalytics();

    /**
     * <p>Create Pin</p>
     *
     * <p> Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/pins" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link PinCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsCreate();

    /**
     * <p>Delete Pin</p>
     *
     * <p>  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/pins/{pin_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsDelete();

    /**
     * <p>Get Pin</p>
     *
     * <p>  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins/{pin_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
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
     * <li>
     * <p>"<b>pin_metrics</b>"
     * <p>Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsGet();

    /**
     * <p>List Pins</p>
     *
     * <p>    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_filter</b>"
     * <p>The filter to apply to the pins</p>
     * <p>
     * - Parameter type: <b>{@link PinFilter}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pin_metrics</b>"
     * <p>Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_protected_pins</b>"
     * <p>Whether to include protected pins in the results</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>pin_type</b>"
     * <p>The type of pins to return, currently only enabled for private pins</p>
     * <p>
     * - Parameter type: <b>{@link PinType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>creative_types</b>"
     * <p>Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;CreativeType&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <li>
     * <p>"<b>domain</b>"
     * <p>Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins).</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>domains</b>"
     * <p>Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`).</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_product_tag_obj</b>"
     * <p>Include product tag objects in the response with their associated links.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PinsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsList();

    /**
     * <p>Save Pin</p>
     *
     * <p>Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/pins/{pin_id}/save" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link PinsSaveRequestCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>201 (success)</b>: The request has succeeded and a new resource has been created as a result.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsSave();

    /**
     * <p>Update Pin</p>
     *
     * <p>Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/pins/{pin_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link PinUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Pin}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler pinsUpdate();

    /**
     * <p>Create product group promotions</p>
     *
     * <p>Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/product_group_promotions" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProductGroupPromotionsCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductGroupPromotions}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupPromotionsCreate();

    /**
     * <p>Get a product group promotion by id</p>
     *
     * <p>Get a product group promotion by id</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}" (<i>privileged: true</i>)</p>
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
     * <p>"<b>product_group_promotion_id</b>"
     * <p>Unique identifier of a product group promotion</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductGroupPromotion}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupPromotionsGet();

    /**
     * <p>Get product group promotions</p>
     *
     * <p>List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/product_group_promotions" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>product_group_promotion_ids</b>"
     * <p>List of Product group promotion Ids.</p>
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
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;EntityStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ACTIVE,PAUSED</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ad_group_id</b>"
     * <p>Ad group Id.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductGroupPromotionsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupPromotionsList();

    /**
     * <p>Update product group promotions</p>
     *
     * <p>Update multiple existing Product Group Promotions (by product_group_id)</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/product_group_promotions" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProductGroupPromotionsUpdateWithRequiredBody} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductGroupPromotions}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupPromotionsUpdate();

    /**
     * <p>Get product group analytics</p>
     *
     * <p>Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/product_groups/analytics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
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
     * <p>Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ReportingColumnSync&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>granularity</b>"
     * <p>  TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly</p>
     * <p>
     * - Parameter type: <b>{@link Granularity}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
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
     * <p>"<b>click_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>30</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>view_window_days</b>"
     * <p>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
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
     * <li>
     * <p>"<b>reporting_timezone</b>"
     * <p>Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.</p>
     * <p>
     * - Parameter type: <b>{@link ReportingTimeZone}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link ProductGroupAnalyticsItems}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productGroupsAnalytics();

    /**
     * <p>Add product tags to pin</p>
     *
     * <p>Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/pins/{pin_id}/product_tags" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of the hero pin that will receive product tags.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProductTagsBulkAddRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductTagsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request contains ineligible product tags.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productTagsBulkAdd();

    /**
     * <p>Delete product tags from pin</p>
     *
     * <p>Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/pins/{pin_id}/product_tags/bulk-delete" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of the hero pin that will receive product tags.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link ProductTagsBulkDeleteRequest} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productTagsBulkDelete();

    /**
     * <p>Get product tags for pin</p>
     *
     * <p>Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/pins/{pin_id}/product_tags" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>pin_id</b>"
     * <p>Unique identifier of the hero pin that will receive product tags.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link ProductTagsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler productTagsList();

    /**
     * <p>Create promotions</p>
     *
     * <p>Create multiple new promotions.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/promotions" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link PromotionCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PromotionsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler promotionsCreate();

    /**
     * <p>Delete promotion by id</p>
     *
     * <p>Delete a promotion within Pinterest.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>promotion_id</b>"
     * <p>Promotion ID</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Promotion}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler promotionsDelete();

    /**
     * <p>Get promotion by id</p>
     *
     * <p>Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/promotions/{promotion_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>promotion_id</b>"
     * <p>Promotion ID</p>
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
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Promotion}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler promotionsGet();

    /**
     * <p>Get promotions</p>
     *
     * <p>Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/promotions" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PromotionsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler promotionsList();

    /**
     * <p>Update promotions</p>
     *
     * <p>Update multiple promotions.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/promotions" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link PromotionBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PromotionsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler promotionsUpdate();

    /**
     * <p>Get ad accounts countries</p>
     *
     * <p>Get Ad Accounts countries</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/ad_account_countries" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link AdAccountCountriesGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler adAccountCountriesGet();

    /**
     * <p>Get available metrics' definitions</p>
     *
     * <p>Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/delivery_metrics" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>report_type</b>"
     * <p>Report type.</p>
     * <p>
     * - Parameter type: <b>{@link ReportType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link DeliveryMetricsGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler deliveryMetricsGet();

    /**
     * <p>Get interest details</p>
     *
     * <p>Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/targeting/interests/{interest_id}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>interest_id</b>"
     * <p>Unique identifier of an interest.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SingleInterestTargetingOption}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler interestTargetingOptionsGet();

    /**
     * <p>Get lead form questions</p>
     *
     * <p>Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/lead_form_questions" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler leadFormQuestionsGet();

    /**
     * <p>Get metrics ready state</p>
     *
     * <p>Learn whether conversion or non-conversion metrics are finalized and ready to query.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/metrics_ready_state" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>date</b>"
     * <p>Analytics reports request date (UTC). Format: YYYY-MM-DD</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BookClosed}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler metricsReadyStateGet();

    /**
     * <p>Get targeting options</p>
     *
     * <p>    You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/resources/targeting/{targeting_type}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>targeting_type</b>"
     * <p>Public targeting type</p>
     * <p>
     * - Parameter type: <b>{@link PublicTargetingType}</b><br/>
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
     * <li>
     * <p>"<b>client_id</b>"
     * <p>Client ID</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>oauth_signature</b>"
     * <p>Oauth signature</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>timestamp</b>"
     * <p>Timestamp.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link Object}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler targetingOptionsGet();

    /**
     * <p>Create schedules</p>
     *
     * <p>Batch create schedules</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/schedules" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link ScheduleCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link SchedulesCreate200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler schedulesCreate();

    /**
     * <p>Get Schedules</p>
     *
     * <p>Get schedules for a specific advertiser</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/schedules" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>entity_ids</b>"
     * <p>List of Entity IDs, must be associated with the Ad Accound ID provided in the path.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>schedule_statuses</b>"
     * <p>Filter schedules by status (one or more)</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ScheduleStatus&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>schedule_type</b>"
     * <p>Filter schedules by a type</p>
     * <p>
     * - Parameter type: <b>{@link ScheduleType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SchedulesList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler schedulesList();

    /**
     * <p>Update schedules</p>
     *
     * <p>Update one or more schedules</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/schedules" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>ad_account_id</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link java.util.List List} of {@link ScheduleBatchUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link SchedulesCreate200ResponseInner}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler schedulesUpdate();

    /**
     * <p>Search pins by a given search term</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get the top 10 Pins by a given search term.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/search/partner/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>term</b>"
     * <p>Search term to look up pins.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>country_code</b>"
     * <p>Two letter country code (ISO 3166-1 alpha-2)</p>
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
     * <p>"<b>locale</b>"
     * <p>Search locale.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Max search result size</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>10</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link SearchPartnerPins200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler searchPartnerPins();

    /**
     * <p>Search user's boards</p>
     *
     * <p>Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/search/boards" (<i>privileged: true</i>)</p>
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
     * <li>
     * <p>"<b>query</b>"
     * <p>Search query. Can contain pin description keywords or comma-separated pin IDs.</p>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler searchUserBoardsGet();

    /**
     * <p>Search user's Pins</p>
     *
     * <p>Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/search/pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>query</b>"
     * <p>Search query. Can contain pin description keywords or comma-separated pin IDs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link PinsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler searchUserPinsList();

    /**
     * <p>Create targeting templates</p>
     *
     * <p>Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/ad_accounts/{ad_account_id}/targeting_templates" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link TargetingTemplateCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TargetingTemplate}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler targetingTemplateCreate();

    /**
     * <p>List targeting templates</p>
     *
     * <p>Get a list of the targeting templates in the specified `ad_account_id`</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/targeting_templates" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>order</b>"
     * <p>The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.</p>
     * <p>
     * - Parameter type: <b>{@link PinterestLibPaginationOrder}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>include_sizing</b>"
     * <p>Include audience sizing in result or not</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>search_query</b>"
     * <p>Search query. Can contain pin description keywords or comma-separated pin IDs.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TargetingTemplateList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler targetingTemplateList();

    /**
     * <p>Update targeting templates</p>
     *
     * <p>Update the targeting template given advertiser ID and targeting template ID</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#PATCH PATCH} "/v5/ad_accounts/{ad_account_id}/targeting_templates" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link TargetingTemplateUpdateRequestReadOrUpdate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler targetingTemplateUpdate();

    /**
     * <p>List related terms</p>
     *
     * <p>Get a list of terms logically related to each input term.  Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/terms/related" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>terms</b>"
     * <p>List of input terms.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;String&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link RelatedTerms}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler termsRelatedList();

    /**
     * <p>List suggested terms</p>
     *
     * <p>Get popular search terms that begin with your input term.  Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/terms/suggested" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>term</b>"
     * <p>Input term.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>limit</b>"
     * <p>Max suggested terms to return.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>4</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link String}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler termsSuggestedList();

    /**
     * <p>Get terms of service</p>
     *
     * <p>Get the text of the terms of service and see whether the advertiser has accepted the terms of service.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/ad_accounts/{ad_account_id}/terms_of_service" (<i>privileged: true</i>)</p>
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
     * <p>"<b>include_html</b>"
     * <p>Return HTML in TOS text.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>tos_type</b>"
     * <p>Request type.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TermsOfService}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler termsOfServiceGet();

    /**
     * <p>Returns editorial articles for a given region</p>
     *
     * <p>  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/trends/editorial_articles" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>region</b>"
     * <p>     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoryRegion}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link TrendsEditorial}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler trendsEditorialArticlesList();

    /**
     * <p>Get featured topics</p>
     *
     * <p>  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/trends/topics/featured" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>region</b>"
     * <p>     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoryRegion}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>interest</b>"
     * <p>Interest to filter by</p>
     * <p>
     * - Parameter type: <b>{@link InterestsEnum}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link FeaturedTrend}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler trendsFeaturedTopicsList();

    /**
     * <p>Get product category details</p>
     *
     * <p>  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/trends/product_categories/details" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>product_categories</b>"
     * <p>List of product categories</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;ProductCategoryEnum&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>region</b>"
     * <p>     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoryRegion}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>lookback_window</b>"
     * <p>  Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years)</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoryDetailLookbackWindow}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_type</b>"
     * <p>    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoriesEngagementType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link ProductCategoryDetails}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler trendsProductCategoriesDetailsList();

    /**
     * <p>Get a list of growing Shopping Product Categories</p>
     *
     * <p>  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/trends/product_categories/trending" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>region</b>"
     * <p>     The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoryRegion}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>verticals</b>"
     * <p>List of verticals to filter by</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;VerticalProductCategory&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>ages</b>"
     * <p>Age to filter by. If not provided, the results will be filtered by all ages.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;AgeTrendsBucket&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>genders</b>"
     * <p>Gender to filter by, If not provided, the results will be filtered by all genders.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;GenderBucket&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>engagement_type</b>"
     * <p>    Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves</p>
     * <p>
     * - Parameter type: <b>{@link ProductCategoriesEngagementType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link TrendingProductCategory}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler trendsProductCategoriesTrendingList();

    /**
     * <p>List following boards</p>
     *
     * <p>Get a list of the boards a user follows. The request returns a board summary object array.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/following/boards" (<i>privileged: true</i>)</p>
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
     * <li>
     * <p>"<b>explicit_following</b>"
     * <p>Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link BoardsList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler boardsUserFollowsList();

    /**
     * <p>Follow user</p>
     *
     * <p>**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Use this request, as a signed-in user, to follow another user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/user_account/following/{username}" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>A valid username</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link FollowUserCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FollowUser}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler followUserUpdate();

    /**
     * <p>List followers</p>
     *
     * <p>Get a list of your followers.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/followers" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FollowersList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler followersList();

    /**
     * <p>List linked businesses</p>
     *
     * <p>Get a list of your linked business accounts.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/businesses" (<i>privileged: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.List List} of {@link LinkedBusiness}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler linkedBusinessAccountsGet();

    /**
     * <p>Unverify website</p>
     *
     * <p>Unverify a website verified by the signed-in user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#DELETE DELETE} "/v5/user_account/websites" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>website</b>"
     * <p>Website with path or domain only</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserWebsite}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>204 (success)</b>: Resource deleted successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler unverifyWebsiteDelete();

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
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
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
     * <p>"<b>content_type</b>"
     * <p>Filter to paid or organic data. Default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>source</b>"
     * <p>Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Metric types to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QuerymetrictypesItems&gt;}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link java.util.Map Map} of {@link AnalyticsMetricsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountAnalytics();

    /**
     * <p>Get user account top pins analytics</p>
     *
     * <p>Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/analytics/top_pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_by</b>"
     * <p>Specify sorting order for metrics</p>
     * <p>
     * - Parameter type: <b>{@link TopPinsSortBy}</b><br/>
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
     * <p>"<b>content_type</b>"
     * <p>Filter to paid or organic data. Default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>source</b>"
     * <p>Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Metric types to get data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QuerymetrictypesItems&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>num_of_pins</b>"
     * <p>Number of pins to include, default is 10. Max is 50.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>10</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>created_in_last_n_days</b>"
     * <p>Get metrics for pins created in the last \"n\" days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TopPinsAnalyticsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountAnalyticsTopPins();

    /**
     * <p>Get user account top video pins analytics</p>
     *
     * <p>Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/analytics/top_video_pins" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>start_date</b>"
     * <p>Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>end_date</b>"
     * <p>Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</p>
     * <p>
     * - Parameter type: <b>{@link Date}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>sort_by</b>"
     * <p>Specify sorting order for video metrics</p>
     * <p>
     * - Parameter type: <b>{@link TopVideoPinsSortBy}</b><br/>
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
     * <p>"<b>content_type</b>"
     * <p>Filter to paid or organic data. Default is all.</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>source</b>"
     * <p>Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts</p>
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>metric_types</b>"
     * <p>Metric types to get video data for, default is all.</p>
     * <p>
     * - Parameter type: <b>{@link java.util.List List} of {@link List&lt;QueryvideopinmetrictypesItems&gt;}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>num_of_pins</b>"
     * <p>Number of pins to include, default is 10. Max is 50.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>10</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>created_in_last_n_days</b>"
     * <p>Get metrics for pins created in the last \"n\" days.</p>
     * <p>
     * - Parameter type: <b>{@link BigDecimal}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link TopVideoPinsAnalyticsResponse}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountAnalyticsTopVideoPins();

    /**
     * <p>List following interests</p>
     *
     * <p>Get a list of a user's following interests in one place.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/users/{username}/interests/follow" (<i>privileged: true</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>username</b>"
     * <p>A valid username</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserAccountFollowedInterests200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The server could not understand the request due to invalid syntax.</li>
     * <li><b>401 (client error)</b>: Access is unauthorized.</li>
     * <li><b>404 (client error)</b>: The server cannot find the requested resource.</li>
     * <li><b>Default</b>: Unexpected error</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountFollowedInterests();

    /**
     * <p>Get user account</p>
     *
     * <p>Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  [Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ \"Understanding Business Access\" If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See [Understanding Business Access] for more information.</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link Account}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userAccountGet();

    /**
     * <p>List following</p>
     *
     * <p>Get a list of who a certain user follows.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/following" (<i>privileged: true</i>)</p>
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
     * <li>
     * <p>"<b>explicit_following</b>"
     * <p>Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.</p>
     * <p>
     * - Parameter type: <b>{@link Boolean}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>false</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>feed_type</b>"
     * <p>Thrift param specifying what type of followees will be kept. Default to include all followees.</p>
     * <p>
     * - Parameter type: <b>{@link UserFollowingFeedType}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>ALL</b><br/>
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
     * <p>"<b>page_size</b>"
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link FollowersList200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userFollowingGet();

    /**
     * <p>Get user websites</p>
     *
     * <p>Get user websites, claimed or not</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/websites" (<i>privileged: true</i>)</p>
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
     * <p>Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.</p>
     * <p>
     * - Parameter type: <b>{@link Integer}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getQueryParameters Query}</b><br/>
     * - Default value: <b>25</b><br/>
     * - Required: <b>false</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserWebsitesGet200Response}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler userWebsitesGet();

    /**
     * <p>Verify website</p>
     *
     * <p>Verify a website as a signed-in user.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#POST POST} "/v5/user_account/websites" (<i>privileged: true</i>)</p>
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
     * <p><b>Consumes</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Payload</b>: {@link UserWebsiteCreate} (<i>required: true</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserWebsite}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>201 (success)</b>: Resource create operation completed successfully.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler verifyWebsiteUpdate();

    /**
     * <p>Get user verification code for website claiming</p>
     *
     * <p>Get verification code for user to install on the website to claim it.</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v5/user_account/websites/verification" (<i>privileged: true</i>)</p>
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
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link UserWebsiteVerification}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: The request has succeeded.</li>
     * <li><b>400 (client error)</b>: The request could not be understood by the server due to unexpected data.</li>
     * <li><b>401 (client error)</b>: Authentication is required and has either failed or not been provided.</li>
     * <li><b>403 (client error)</b>: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource.</li>
     * <li><b>404 (client error)</b>: The requested resource could not be found on this server.</li>
     * <li><b>429 (client error)</b>: The user has sent too many requests in a given amount of time and is being rate limited.</li>
     * <li><b>Default</b>: An unexpected error response.</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler websiteVerificationGet();
}
