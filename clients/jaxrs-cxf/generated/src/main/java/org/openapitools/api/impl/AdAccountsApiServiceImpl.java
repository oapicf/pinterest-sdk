package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsItems;
import org.openapitools.model.AdAccountCreate;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import java.math.BigDecimal;
import org.openapitools.model.ConversionProductReport;
import org.openapitools.model.ConversionProductReportCreate;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.Granularity;
import org.joda.time.LocalDate;
import org.openapitools.model.MMMReport;
import org.openapitools.model.MMMReportCreate;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.TemplateBasedReport;
import org.openapitools.model.TemplatesList200Response;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


/**
 * Pinterest REST API
 *
 * <p>Pinterest's REST API
 *
 */
public class AdAccountsApiServiceImpl implements AdAccountsApi {
    /**
     * Get ad account analytics
     *
     *   Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     *
     */
    public List<AdAccountAnalyticsItems> adAccountAnalytics(LocalDate startDate, LocalDate endDate, List<ReportingColumnSync> columns, Granularity granularity, String adAccountId, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, ReportingTimeZone reportingTimezone) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get targeting analytics for an ad account
     *
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     */
    public MetricsResponse adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsAccountTargetingType> targetingTypes, List<ReportingColumnSync> columns, Granularity granularity, BigDecimal clickWindowDays, BigDecimal engagementWindowDays, BigDecimal viewWindowDays, String conversionReportTime, List<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create ad account
     *
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     *
     */
    public AdAccount adAccountsCreate(AdAccountCreate adAccountCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get ad account
     *
     * Get an ad account
     *
     */
    public AdAccount adAccountsGet(String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List ad accounts
     *
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     *
     */
    public AdAccountsList200Response adAccountsList(Boolean includeSharedAccounts, String bookmark, Integer pageSize) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a request for a brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     *
     */
    public ConversionProductReport analyticsCreateConversionProductReport(String adAccountId, ConversionProductReportCreate conversionProductReportCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     *
     *     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
     *
     */
    public MMMReport analyticsCreateMmmReport(String adAccountId, MMMReportCreate mmMReportCreate) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create async request for an account analytics report
     *
     *   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     *
     */
    public AdsAnalyticsCreateAsyncResponse analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest) {
        // TODO: Implement...

        return null;
    }

    /**
     * Create async request for an analytics report using a template
     *
     *   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     *
     */
    public TemplateBasedReport analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get advertiser brand, category, SKU report
     *
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     *
     */
    public ConversionProductReport analyticsGetConversionProductReport(String adAccountId, String token) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     *
     *     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
     *
     */
    public MMMReport analyticsGetMmmReport(String adAccountId, String token) {
        // TODO: Implement...

        return null;
    }

    /**
     * Get the account analytics report created by the async call
     *
     *   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     *
     */
    public AdsAnalyticsGetAsyncResponse analyticsGetReport(String adAccountId, String token) {
        // TODO: Implement...

        return null;
    }

    /**
     * Delete ads data for ad account in API Sandbox
     *
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     *
     */
    public String sandboxDelete(String adAccountId) {
        // TODO: Implement...

        return null;
    }

    /**
     * List templates
     *
     * Gets all Templates associated with an ad account ID.
     *
     */
    public TemplatesList200Response templatesList(String adAccountId, String bookmark, Integer pageSize, PinterestLibPaginationOrder order) {
        // TODO: Implement...

        return null;
    }

}
