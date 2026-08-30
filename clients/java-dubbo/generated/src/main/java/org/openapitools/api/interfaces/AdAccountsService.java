package org.openapitools.api.interfaces;

import org.openapitools.model.Ad;
import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsItems;
import org.openapitools.model.AdAccountCreate;
import org.openapitools.model.AdAccountToAdAccountSharedAudience;
import org.openapitools.model.AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountToBusinessSharedAudience;
import org.openapitools.model.AdAccountToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.AdAccountsAudience;
import org.openapitools.model.AdAccountsAudienceCreate;
import org.openapitools.model.AdAccountsAudienceUpdate;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.AdBatchUpdate;
import org.openapitools.model.AdBatchWriteResponseModel;
import org.openapitools.model.AdCreate;
import org.openapitools.model.AdGroup;
import org.openapitools.model.AdGroupAudienceSizing;
import org.openapitools.model.AdGroupAudienceSizingCreate;
import org.openapitools.model.AdGroupCreateCreate;
import org.openapitools.model.AdGroupUpdateBatchUpdate;
import org.openapitools.model.AdGroupsAnalyticsMetrics;
import org.openapitools.model.AdGroupsCreate200Response;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdPinAnalytics;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdsAnalytics;
import org.openapitools.model.AdsAnalyticsAccountTargetingType;
import org.openapitools.model.AdsAnalyticsAdGroupTargetingType;
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsCreditRedeem;
import org.openapitools.model.AdsCreditRedeemCreate;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreate200Response;
import org.openapitools.model.AdvertiserDefinedEventsCreateRequest;
import org.openapitools.model.AdvertiserDefinedEventsGet200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsights;
import org.openapitools.model.AudienceInsightsScopeAndTypeGet200Response;
import org.openapitools.model.AudienceOwnershipType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorCreate;
import java.math.BigDecimal;
import org.openapitools.model.BillingInvoiceDocumentType;
import org.openapitools.model.BillingInvoiceDownloadResponse;
import org.openapitools.model.BillingInvoiceSortField;
import org.openapitools.model.BillingInvoiceStatus;
import org.openapitools.model.BillingInvoicesGet200Response;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownload;
import org.openapitools.model.BulkDownloadCreate;
import org.openapitools.model.BulkJobData;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.Campaign;
import org.openapitools.model.CampaignAdPreview;
import org.openapitools.model.CampaignAdPreviewCreate;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInner;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInner;
import org.openapitools.model.CampaignBatchUpdateItem;
import org.openapitools.model.CampaignBatchWriteResponseModel;
import org.openapitools.model.CampaignCreateItem;
import org.openapitools.model.CampaignDeliveryEstimatesCampaign;
import org.openapitools.model.CampaignDeliveryEstimatesResponse;
import org.openapitools.model.CampaignsAnalyticsMetrics;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionDeletionRequest;
import org.openapitools.model.ConversionDeletionRequestCreate;
import org.openapitools.model.ConversionDeletionRequestList200Response;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionEventsCreate;
import org.openapitools.model.ConversionMSOTEventsCreate;
import org.openapitools.model.ConversionProductReport;
import org.openapitools.model.ConversionProductReportCreate;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.ConversionTag;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagsList200Response;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListCreate;
import org.openapitools.model.CustomerListUpdateWithRequiredBody;
import org.openapitools.model.CustomerListUpload;
import org.openapitools.model.CustomerListUploadCreateRequest;
import org.openapitools.model.CustomerListUploadCreateResponse;
import org.openapitools.model.CustomerListsList200Response;
import org.openapitools.model.CustomerSegment;
import org.openapitools.model.CustomerSegmentCreate;
import org.openapitools.model.CustomerSegmentList200Response;
import org.openapitools.model.CustomerSegmentUpdateRequestUpdateWithRequiredBody;
import org.openapitools.model.DetailedError;
import org.openapitools.model.DynamicTitlesDownloadCSV;
import org.openapitools.model.DynamicTitlesGetStatus;
import org.openapitools.model.DynamicTitlesProcessCSV;
import org.openapitools.model.DynamicTitlesProcessCSVCreate;
import org.openapitools.model.DynamicTitlesUploadURL;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.EventQualityScore;
import org.openapitools.model.Granularity;
import org.openapitools.model.IngestionSourceOptions;
import org.openapitools.model.Keywords;
import org.openapitools.model.KeywordsCreate;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsUpdate;
import org.openapitools.model.LabelCreateRequest;
import org.openapitools.model.LabelUpdateRequest;
import org.openapitools.model.LabeledEntities;
import org.openapitools.model.LabeledEntitiesCreate;
import org.openapitools.model.LabelsList200Response;
import org.openapitools.model.LabelsResponse;
import org.openapitools.model.LeadForm;
import org.openapitools.model.LeadFormBatchUpdate;
import org.openapitools.model.LeadFormCreate;
import org.openapitools.model.LeadFormTest;
import org.openapitools.model.LeadFormTestCreate;
import org.openapitools.model.LeadFormsCreate200Response;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.LeadSubscription;
import org.openapitools.model.LeadSubscriptionPostParamsCreate;
import org.openapitools.model.LeadsExportResponseData;
import org.openapitools.model.LeadsExports;
import org.openapitools.model.LeadsExportsCreate;
import java.time.LocalDate;
import org.openapitools.model.LookbackPeriodOptions;
import org.openapitools.model.MMMReport;
import org.openapitools.model.MMMReportCreate;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.PinterestLibPaginationOrder;
import org.openapitools.model.ProductGroupAnalyticsItems;
import org.openapitools.model.ProductGroupPromotion;
import org.openapitools.model.ProductGroupPromotions;
import org.openapitools.model.ProductGroupPromotionsCreate;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.ProductGroupPromotionsUpdateWithRequiredBody;
import org.openapitools.model.Promotion;
import org.openapitools.model.PromotionBatchUpdate;
import org.openapitools.model.PromotionCreate;
import org.openapitools.model.PromotionsList200Response;
import org.openapitools.model.PromotionsResponse;
import org.openapitools.model.QueryLabelEntityStatusesItems;
import org.openapitools.model.QueryLabelTypesItems;
import org.openapitools.model.ReportingColumnSync;
import org.openapitools.model.ReportingTimeZone;
import org.openapitools.model.SSIOAccount;
import org.openapitools.model.SSIOInsertionOrder;
import org.openapitools.model.SSIOInsertionOrderCreate;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SSIOInsertionOrderUpdate;
import org.openapitools.model.Schedule;
import org.openapitools.model.ScheduleBatchUpdate;
import org.openapitools.model.ScheduleCreate;
import org.openapitools.model.ScheduleStatus;
import org.openapitools.model.ScheduleType;
import org.openapitools.model.SchedulesCreate200ResponseInner;
import org.openapitools.model.SchedulesList200Response;
import org.openapitools.model.SourcePlatformOptions;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TargetingTemplate;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequestReadOrUpdate;
import org.openapitools.model.TemplateBasedReport;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface AdAccountsService {

    /**
     * Get ad account analytics
     *   Get analytics for the specified &#x60;ad_account_id&#x60;, filtered by the specified options.    - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return List<AdAccountAnalyticsItems>
     */
    List<AdAccountAnalyticsItems> adAccountAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Get targeting analytics for an ad account
     * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt;  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param attributionTypes List of types of attribution for the conversion report (optional)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return MetricsResponse
     */
    MetricsResponse adAccountTargetingAnalyticsGet(
        String adAccountId,
        LocalDate startDate,
        LocalDate endDate,
        List<AdsAnalyticsAccountTargetingType> targetingTypes,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        List<ConversionReportAttributionType> attributionTypes,
        ReportingTimeZone reportingTimezone
    );

    /**
     * List accounts with access to an audience owned by an ad account
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.
     *
     * @param audienceId Unique identifier of the audience to use to filter the results. (required)
     * @param accountType Filter accounts by account type. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return AdAccountsAudiencesSharedAccountsList200Response
     */
    AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(
        String audienceId,
        AudienceAccountType accountType,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Create ad account
     * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
     *
     * @param adAccountCreate  (required)
     * @return AdAccount
     */
    AdAccount adAccountsCreate(
        AdAccountCreate adAccountCreate
    );

    /**
     * Get ad account
     * Get an ad account
     *
     * @param adAccountId  (required)
     * @return AdAccount
     */
    AdAccount adAccountsGet(
        String adAccountId
    );

    /**
     * List ad accounts
     * Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
     *
     * @param includeSharedAccounts Include shared ad accounts (optional, default to true)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return AdAccountsList200Response
     */
    AdAccountsList200Response adAccountsList(
        Boolean includeSharedAccounts,
        String bookmark,
        Integer pageSize
    );

    /**
     * Delete lead ads subscription
     * Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param subscriptionId Unique identifier of a subscription. (required)
     * @return LeadSubscription
     */
    LeadSubscription adAccountsSubscriptionsDelById(
        String adAccountId,
        String subscriptionId
    );

    /**
     * Get lead ads subscription by ID
     * Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param subscriptionId Unique identifier of a subscription. (required)
     * @return LeadSubscription
     */
    LeadSubscription adAccountsSubscriptionsGetById(
        String adAccountId,
        String subscriptionId
    );

    /**
     * Get lead ads subscriptions
     * Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return AdAccountsSubscriptionsGetList200Response
     */
    AdAccountsSubscriptionsGetList200Response adAccountsSubscriptionsGetList(
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Create lead ads subscription
     * Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadSubscriptionPostParamsCreate  (required)
     * @return LeadSubscription
     */
    LeadSubscription adAccountsSubscriptionsPost(
        String adAccountId,
        LeadSubscriptionPostParamsCreate leadSubscriptionPostParamsCreate
    );

    /**
     * Get ad group analytics
     * Get analytics for the specified ad groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional, default to false)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return List<AdGroupsAnalyticsMetrics>
     */
    List<AdGroupsAnalyticsMetrics> adGroupsAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        List<String> adGroupIds,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        Boolean aggregateReportRows,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Get audience sizing
     * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupAudienceSizingCreate  (required)
     * @return AdGroupAudienceSizing
     */
    AdGroupAudienceSizing adGroupsAudienceSizing(
        String adAccountId,
        AdGroupAudienceSizingCreate adGroupAudienceSizingCreate
    );

    /**
     * Get bid floors
     * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  * $1 &#x3D; 1,000,000 microdollars * 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bidFloorCreate  (required)
     * @return BidFloor
     */
    BidFloor adGroupsBidFloorGet(
        String adAccountId,
        BidFloorCreate bidFloorCreate
    );

    /**
     * Create ad groups
     * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - &#x60;bid_in_micro_currency&#x60; and &#x60;budget_in_micro_currency&#x60; should be expressed in microcurrency amounts based on the currency field set in the advertiser&#39;s profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency: - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set &#x60;start_time&#x60; and &#x60;end_time&#x60; at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: &#x60;TRAFFIC&#x60;, &#x60;AWARENESS&#x60;, &#x60;WEB_CONVERSIONS&#x60;, and &#x60;CATALOG_SALES&#x60;. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupCreateCreate  (required)
     * @return AdGroupsCreate200Response
     */
    AdGroupsCreate200Response adGroupsCreate(
        String adAccountId,
        List<AdGroupCreateCreate> adGroupCreateCreate
    );

    /**
     * Get dynamic titles CSV download URL
     * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupId Ad group ID. (required)
     * @return DynamicTitlesDownloadCSV
     */
    DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv(
        String adAccountId,
        String adGroupId
    );

    /**
     * Get dynamic titles status
     * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupId Ad group ID. (required)
     * @return DynamicTitlesGetStatus
     */
    DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus(
        String adAccountId,
        String adGroupId
    );

    /**
     * Get dynamic titles upload URL
     * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupId Ad group ID. (required)
     * @return DynamicTitlesUploadURL
     */
    DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl(
        String adAccountId,
        String adGroupId
    );

    /**
     * Process dynamic titles CSV
     * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupId Ad group ID. (required)
     * @param dynamicTitlesProcessCSVCreate  (required)
     * @return DynamicTitlesProcessCSV
     */
    DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv(
        String adAccountId,
        String adGroupId,
        DynamicTitlesProcessCSVCreate dynamicTitlesProcessCSVCreate
    );

    /**
     * Get ad group
     * Get a specific ad group given the ad group ID.
     *
     * @param adGroupId Ad group ID. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return AdGroup
     */
    AdGroup adGroupsGet(
        String adGroupId,
        String adAccountId
    );

    /**
     * List ad groups
     * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs. (optional, default to false)
     * @return AdGroupsList200Response
     */
    AdGroupsList200Response adGroupsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        List<String> campaignIds,
        List<String> adGroupIds,
        List<EntityStatus> entityStatuses,
        Boolean translateInterestsToNames
    );

    /**
     * Get targeting analytics for ad groups
     * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param attributionTypes List of types of attribution for the conversion report (optional)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @param sortColumns Sort Columns. (optional)
     * @param sortAscending Sort ascending. (optional)
     * @return MetricsResponse
     */
    MetricsResponse adGroupsTargetingAnalyticsGet(
        String adAccountId,
        List<String> adGroupIds,
        LocalDate startDate,
        LocalDate endDate,
        List<AdsAnalyticsAdGroupTargetingType> targetingTypes,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        List<ConversionReportAttributionType> attributionTypes,
        ReportingTimeZone reportingTimezone,
        List<String> sortColumns,
        Boolean sortAscending
    );

    /**
     * Update ad groups
     * Update multiple existing ad groups.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adGroupUpdateBatchUpdate  (required)
     * @return AdGroupsCreate200Response
     */
    AdGroupsCreate200Response adGroupsUpdate(
        String adAccountId,
        List<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate
    );

    /**
     * Get pins analytics
     * Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
     *
     * @param campaignId Campaign Id to use to filter the results. (required)
     * @param pinIds List of Pin IDs. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @return List<AdPinAnalytics>
     */
    List<AdPinAnalytics> adPinsAnalytics(
        String campaignId,
        List<String> pinIds,
        LocalDate startDate,
        LocalDate endDate,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime
    );

    /**
     * Create ad preview with pin or image
     * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adPreviewRequest  (required)
     * @return AdPreviewURLResponse
     */
    AdPreviewURLResponse adPreviewsCreate(
        String adAccountId,
        AdPreviewRequest adPreviewRequest
    );

    /**
     * Get targeting analytics for ads
     * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adIds List of Ad Ids to use to filter the results. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
     * @param attributionTypes List of types of attribution for the conversion report (optional)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @param sortColumns Sort Columns. (optional)
     * @param sortAscending Sort ascending. (optional)
     * @return MetricsResponse
     */
    MetricsResponse adTargetingAnalyticsGet(
        String adAccountId,
        List<String> adIds,
        LocalDate startDate,
        LocalDate endDate,
        List<AdsAnalyticsAdTargetingType> targetingTypes,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        ConversionAttributionWindowDays clickWindowDays,
        ConversionAttributionWindowDays engagementWindowDays,
        ConversionAttributionWindowDays viewWindowDays,
        ConversionReportTimeType conversionReportTime,
        List<ConversionReportAttributionType> attributionTypes,
        ReportingTimeZone reportingTimezone,
        List<String> sortColumns,
        Boolean sortAscending
    );

    /**
     * Get ad analytics
     *     Get analytics for the specified ads in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.     - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pinIds List of Pin IDs. (optional)
     * @param adIds List of Ad Ids to use to filter the results. (optional)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return List<AdsAnalytics>
     */
    List<AdsAnalytics> adsAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        List<String> pinIds,
        List<String> adIds,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        List<String> campaignIds,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Create ads
     * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adCreate  (required)
     * @return AdBatchWriteResponseModel
     */
    AdBatchWriteResponseModel adsCreate(
        String adAccountId,
        List<AdCreate> adCreate
    );

    /**
     * Redeem ad credits
     * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adsCreditRedeemCreate  (required)
     * @return AdsCreditRedeem
     */
    AdsCreditRedeem adsCreditRedeem(
        String adAccountId,
        AdsCreditRedeemCreate adsCreditRedeemCreate
    );

    /**
     * Get ads credit discounts
     * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return AdsCreditsDiscountsGet200Response
     */
    AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet(
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get ad
     * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
     *
     * @param adId The ID of this ad. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return Ad
     */
    Ad adsGet(
        String adId,
        String adAccountId
    );

    /**
     * List ads
     * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only &#x60;campaign_id&#x60; or &#x60;ad_group_id&#x60; or &#x60;ad_id&#x60;. Do not provide more than one type.  Review status is provided for each ad; if &#x60;review_status&#x60; is &#x60;REJECTED&#x60;, the &#x60;rejected_reasons&#x60; field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
     * @param adIds List of Ad Ids to use to filter the results. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @return AdsList200Response
     */
    AdsList200Response adsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        List<String> campaignIds,
        List<String> adGroupIds,
        List<String> adIds,
        List<EntityStatus> entityStatuses
    );

    /**
     * Update ads
     * Update multiple existing ads
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adBatchUpdate  (required)
     * @return AdBatchWriteResponseModel
     */
    AdBatchWriteResponseModel adsUpdate(
        String adAccountId,
        List<AdBatchUpdate> adBatchUpdate
    );

    /**
     * Create advertiser defined events
     * Map advertiser defined events to standard events for the given ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param advertiserDefinedEventsCreateRequest  (required)
     * @return AdvertiserDefinedEventsCreate200Response
     */
    AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate(
        String adAccountId,
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
    );

    /**
     * Delete advertiser defined events
     * Untrack advertiser defined events for the given ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param eventNames List of event names to delete (required)
     * @return AdvertiserDefinedEventsCreate200Response
     */
    AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete(
        String adAccountId,
        List<String> eventNames
    );

    /**
     * Get advertiser defined events
     * Get advertiser defined events for the given ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return AdvertiserDefinedEventsGet200Response
     */
    AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet(
        String adAccountId
    );

    /**
     * Update advertiser defined events
     * Update advertiser defined event names or mappings for the given ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param advertiserDefinedEventsCreateRequest  (required)
     * @return AdvertiserDefinedEventsCreate200Response
     */
    AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate(
        String adAccountId,
        AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest
    );

    /**
     * Create a request for a brand, category, SKU report
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionProductReportCreate  (required)
     * @return ConversionProductReport
     */
    ConversionProductReport analyticsCreateConversionProductReport(
        String adAccountId,
        ConversionProductReportCreate conversionProductReportCreate
    );

    /**
     * Create a request for a Marketing Mix Modeling (MMM) report
     *     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it&#39;s in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we&#39;ll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
     *
     * @param adAccountId  (required)
     * @param mmMReportCreate  (required)
     * @return MMMReport
     */
    MMMReport analyticsCreateMmmReport(
        String adAccountId,
        MMMReportCreate mmMReportCreate
    );

    /**
     * Create async request for an account analytics report
     *   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adsAnalyticsCreateAsyncRequest  (required)
     * @return AdsAnalyticsCreateAsyncResponse
     */
    AdsAnalyticsCreateAsyncResponse analyticsCreateReport(
        String adAccountId,
        AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
    );

    /**
     * Create async request for an analytics report using a template
     *   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
     *
     * @param adAccountId  (required)
     * @param templateId Unique identifier of a template. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (optional)
     * @return TemplateBasedReport
     */
    TemplateBasedReport analyticsCreateTemplateReport(
        String adAccountId,
        String templateId,
        LocalDate startDate,
        LocalDate endDate,
        Granularity granularity
    );

    /**
     * Get advertiser brand, category, SKU report
     *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param token Token returned from the post request creation call (required)
     * @return ConversionProductReport
     */
    ConversionProductReport analyticsGetConversionProductReport(
        String adAccountId,
        String token
    );

    /**
     * Get advertiser Marketing Mix Modeling (MMM) report.
     *     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
     *
     * @param adAccountId  (required)
     * @param token Token returned from the post request creation call (required)
     * @return MMMReport
     */
    MMMReport analyticsGetMmmReport(
        String adAccountId,
        String token
    );

    /**
     * Get the account analytics report created by the async call
     *   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param token Token returned from the post request creation call (required)
     * @return AdsAnalyticsGetAsyncResponse
     */
    AdsAnalyticsGetAsyncResponse analyticsGetReport(
        String adAccountId,
        String token
    );

    /**
     * Get audience insights
     * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account&#39;s engaged audience on Pinterest, the ad account&#39;s total audience on Pinterest and Pinterest&#39;s total audience.  [Learn more about Audience Insights](https://help.pinterest.com/en/business/article/audience-insights).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param audienceInsightType Type of audience insights. (required)
     * @return AudienceInsights
     */
    AudienceInsights audienceInsightsGet(
        String adAccountId,
        AudienceInsightType audienceInsightType
    );

    /**
     * Get audience insights scope and type
     * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return AudienceInsightsScopeAndTypeGet200Response
     */
    AudienceInsightsScopeAndTypeGet200Response audienceInsightsScopeAndTypeGet(
        String adAccountId
    );

    /**
     * Create audience
     * Create a new audience for the ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adAccountsAudienceCreate  (required)
     * @return AdAccountsAudience
     */
    AdAccountsAudience audiencesCreate(
        String adAccountId,
        AdAccountsAudienceCreate adAccountsAudienceCreate
    );

    /**
     * Get audience
     * Get a specific audience given the audience ID.
     *
     * @param audienceId Audience ID. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return AdAccountsAudience
     */
    AdAccountsAudience audiencesGet(
        String audienceId,
        String adAccountId
    );

    /**
     * List audiences
     * Get list of audiences for the ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param ownershipType  (optional)
     * @param excludeNca When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional, default to false)
     * @return AudiencesList200Response
     */
    AudiencesList200Response audiencesList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        AudienceOwnershipType ownershipType,
        Boolean excludeNca
    );

    /**
     * Update audience
     * Update an existing audience for the ad account.
     *
     * @param audienceId Audience ID. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adAccountsAudienceUpdate  (required)
     * @return AdAccountsAudience
     */
    AdAccountsAudience audiencesUpdate(
        String audienceId,
        String adAccountId,
        AdAccountsAudienceUpdate adAccountsAudienceUpdate
    );

    /**
     * Get download url for a billing invoice
     * Get download url for a billing invoice.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param billingInvoiceId Unique identifier of a billing invoice. (required)
     * @return BillingInvoiceDownloadResponse
     */
    BillingInvoiceDownloadResponse billingInvoiceDownloadGet(
        String adAccountId,
        String billingInvoiceId
    );

    /**
     * Get billing invoices
     * Get billing invoices in the advertiser account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param sort Field of which to sort billing invoices (optional, default to DUE_DATE)
     * @param status Status of billing invoices to filter by (optional)
     * @param documentType Document type of billing invoices to filter by (optional)
     * @param startDueDate Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
     * @param endDueDate Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional)
     * @return BillingInvoicesGet200Response
     */
    BillingInvoicesGet200Response billingInvoicesGet(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        BillingInvoiceSortField sort,
        BillingInvoiceStatus status,
        BillingInvoiceDocumentType documentType,
        LocalDate startDueDate,
        LocalDate endDueDate
    );

    /**
     * Get billing profiles
     * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
     *
     * @param isActive Return active billing profiles, if false return all billing profiles. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BillingProfilesGet200Response
     */
    BillingProfilesGet200Response billingProfilesGet(
        Boolean isActive,
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get advertiser entities in bulk
     * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkDownloadCreate  (required)
     * @return BulkDownload
     */
    BulkDownload bulkDownloadCreate(
        String adAccountId,
        BulkDownloadCreate bulkDownloadCreate
    );

    /**
     * Download advertiser entities in bulk
     * Get the status of a bulk request by &#x60;request_id&#x60;, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkRequestId Bulk request ID that is from one of the entities bulk endpoints (required)
     * @param includeDetails If set to True then attach the errors/details to all the requests (optional, default to false)
     * @return BulkJobData
     */
    BulkJobData bulkRequestGet(
        String adAccountId,
        String bulkRequestId,
        Boolean includeDetails
    );

    /**
     * Create/update ad entities in bulk
     * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a &lt;code&gt;request_id&lt;/code&gt; that can be used to obtain the status of the request.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bulkUpsertRequest Parameters to get create/update ad entities in bulk (required)
     * @return BulkUpsertResponse
     */
    BulkUpsertResponse bulkUpsertCreate(
        String adAccountId,
        BulkUpsertRequest bulkUpsertRequest
    );

    /**
     * Create ad preview records for one or more ad groups
     * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignAdPreviewCreate  (required)
     * @return List<CampaignAdPreviewCreate200ResponseInner>
     */
    List<CampaignAdPreviewCreate200ResponseInner> campaignAdPreviewCreate(
        String adAccountId,
        List<CampaignAdPreviewCreate> campaignAdPreviewCreate
    );

    /**
     * Delete ad preview records for one or more ad groups
     * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
     *
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return List<CampaignAdPreviewDelete200ResponseInner>
     */
    List<CampaignAdPreviewDelete200ResponseInner> campaignAdPreviewDelete(
        List<String> adGroupIds,
        String adAccountId
    );

    /**
     * Fetch ad preview records for one or more ad groups
     * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
     *
     * @param adGroupIds List of Ad group Ids to use to filter the results. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return List<CampaignAdPreview>
     */
    List<CampaignAdPreview> campaignAdPreviewRead(
        List<String> adGroupIds,
        String adAccountId
    );

    /**
     * Get targeting analytics for campaigns
     * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignIds List of Campaign Ids to use to filter the results. (required)
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param attributionTypes List of types of attribution for the conversion report (optional)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return MetricsResponse
     */
    MetricsResponse campaignTargetingAnalyticsGet(
        String adAccountId,
        List<String> campaignIds,
        LocalDate startDate,
        LocalDate endDate,
        List<AdsAnalyticsCampaignTargetingType> targetingTypes,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        List<ConversionReportAttributionType> attributionTypes,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Get campaign analytics
     * Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param campaignIds List of Campaign Ids to use to filter the results. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. (optional, default to false)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return List<CampaignsAnalyticsMetrics>
     */
    List<CampaignsAnalyticsMetrics> campaignsAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        List<String> campaignIds,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        Boolean aggregateReportRows,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Create campaigns
     * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignCreateItem  (required)
     * @return CampaignBatchWriteResponseModel
     */
    CampaignBatchWriteResponseModel campaignsCreate(
        String adAccountId,
        List<CampaignCreateItem> campaignCreateItem
    );

    /**
     * Get campaign
     * Get a specific campaign given the campaign ID.
     *
     * @param campaignId Campaign ID, must be associated with the ad account ID provided in the path. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return Campaign
     */
    Campaign campaignsGet(
        String campaignId,
        String adAccountId
    );

    /**
     * List campaigns
     * Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @return CampaignsList200Response
     */
    CampaignsList200Response campaignsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        List<String> campaignIds,
        List<EntityStatus> entityStatuses
    );

    /**
     * Update campaigns
     * Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignBatchUpdateItem  (required)
     * @return CampaignBatchWriteResponseModel
     */
    CampaignBatchWriteResponseModel campaignsUpdate(
        String adAccountId,
        List<CampaignBatchUpdateItem> campaignBatchUpdateItem
    );

    /**
     * Create a conversion deletion request
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified &#x60;ad_account_id&#x60;. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionDeletionRequestCreate  (required)
     * @return ConversionDeletionRequest
     */
    ConversionDeletionRequest conversionDeletionRequestCreate(
        String adAccountId,
        ConversionDeletionRequestCreate conversionDeletionRequestCreate
    );

    /**
     * Delete a conversion deletion request
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;. This will cancel the request and prevent it from being processed. This can only be done if the request is in the &#x60;PENDING&#x60; status and before the 72 hours mark.
     *
     * @param requestId Unique identifier of the conversion deletion request (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return ConversionDeletionRequest
     */
    ConversionDeletionRequest conversionDeletionRequestDelete(
        String requestId,
        String adAccountId
    );

    /**
     * Get a single conversion deletion request
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from &#x60;ad_account_id&#x60; with &#x60;request_id&#x60;.
     *
     * @param requestId Unique identifier of the conversion deletion request (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return ConversionDeletionRequest
     */
    ConversionDeletionRequest conversionDeletionRequestGet(
        String requestId,
        String adAccountId
    );

    /**
     * List conversion deletion requests
     * **This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified &#x60;ad_account_id&#x60;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return ConversionDeletionRequestList200Response
     */
    ConversionDeletionRequestList200Response conversionDeletionRequestList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Get event quality score (EQS)
     * Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
     *
     * @param lookbackPeriod Lookback window (number of days). (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param sourcePlatform Source platform of event. (optional)
     * @param ingestionSource Ingestion source of event. (optional)
     * @return List<EventQualityScore>
     */
    List<EventQualityScore> conversionEqsList(
        LookbackPeriodOptions lookbackPeriod,
        String adAccountId,
        SourcePlatformOptions sourcePlatform,
        IngestionSourceOptions ingestionSource
    );

    /**
     * Create conversion tag
     * Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionTagCreate  (required)
     * @return ConversionTag
     */
    ConversionTag conversionTagsCreate(
        String adAccountId,
        ConversionTagCreate conversionTagCreate
    );

    /**
     * Get conversion tag
     * Get information about an existing conversion tag.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionTagId Id of the conversion tag. (required)
     * @return ConversionTag
     */
    ConversionTag conversionTagsGet(
        String adAccountId,
        String conversionTagId
    );

    /**
     * List conversion tags
     * List conversion tags associated with an ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param filterDeleted Filter by deleted status (optional, default to false)
     * @return ConversionTagsList200Response
     */
    ConversionTagsList200Response conversionTagsList(
        String adAccountId,
        Boolean filterDeleted
    );

    /**
     * Get country&#39;s keyword metrics
     *   See keyword metrics for a specified country, aggregated across all of Pinterest.   (Definitions are available from the \&quot;Get delivery metrics definitions\&quot;   [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param countryCode Two letter country code (ISO 3166-1 alpha-2) (required)
     * @param keywords Comma-separated keywords (required)
     * @return KeywordsMetricsArrayResponse
     */
    KeywordsMetricsArrayResponse countryKeywordsMetricsGet(
        String adAccountId,
        String countryCode,
        List<String> keywords
    );

    /**
     * Create customer list upload
     * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
     *
     * @param adAccountId  (required)
     * @param customerListId Customer list ID. (required)
     * @param customerListUploadCreateRequest  (required)
     * @return CustomerListUploadCreateResponse
     */
    CustomerListUploadCreateResponse customerListUploadsCreate(
        String adAccountId,
        String customerListId,
        CustomerListUploadCreateRequest customerListUploadCreateRequest
    );

    /**
     * Get customer list upload
     * Get the metadata for a given upload by its ID.
     *
     * @param adAccountId  (required)
     * @param customerListId Customer list ID. (required)
     * @param customerListUploadId Customer List Upload ID. (required)
     * @return CustomerListUpload
     */
    CustomerListUpload customerListUploadsGet(
        String adAccountId,
        String customerListId,
        String customerListUploadId
    );

    /**
     * Run customer list upload
     * Begin processing a customer list upload.
     *
     * @param adAccountId  (required)
     * @param customerListId Customer list ID. (required)
     * @param customerListUploadId Customer List Upload ID. (required)
     * @return CustomerListUpload
     */
    CustomerListUpload customerListUploadsRun(
        String adAccountId,
        String customerListId,
        String customerListUploadId
    );

    /**
     * Create customer lists
     * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the &#x60;CUSTOMER_LIST&#x60; audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
     *
     * @param adAccountId  (required)
     * @param customerListCreate  (required)
     * @return CustomerList
     */
    CustomerList customerListsCreate(
        String adAccountId,
        CustomerListCreate customerListCreate
    );

    /**
     * Get customer list
     * Gets a specific customer list given the customer list ID.
     *
     * @param adAccountId  (required)
     * @param customerListId Customer list ID. (required)
     * @return CustomerList
     */
    CustomerList customerListsGet(
        String adAccountId,
        String customerListId
    );

    /**
     * Get customer lists
     * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     *
     * @param adAccountId  (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param excludeNca When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (optional, default to false)
     * @return CustomerListsList200Response
     */
    CustomerListsList200Response customerListsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        Boolean excludeNca
    );

    /**
     * Update customer list
     * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \&quot;CUSTOMER_LIST\&quot; audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
     *
     * @param adAccountId  (required)
     * @param customerListId Customer list ID. (required)
     * @param customerListUpdateWithRequiredBody  (required)
     * @return CustomerList
     */
    CustomerList customerListsUpdate(
        String adAccountId,
        String customerListId,
        CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody
    );

    /**
     * Create customer segments
     * Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param customerSegmentCreate  (required)
     * @return CustomerSegment
     */
    CustomerSegment customerSegmentCreate(
        String adAccountId,
        CustomerSegmentCreate customerSegmentCreate
    );

    /**
     * List customer segments
     * Get a list of the customer segments in the specified &#x60;ad_account_id&#x60;.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param includeSizing Include audience sizing in result or not (optional, default to false)
     * @param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
     * @return CustomerSegmentList200Response
     */
    CustomerSegmentList200Response customerSegmentList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        Boolean includeSizing,
        String searchQuery
    );

    /**
     * Update customer segments
     * Update the customer segment given advertiser ID and customer segment ID
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param customerSegmentUpdateRequestUpdateWithRequiredBody  (required)
     * @return void
     */
    void customerSegmentUpdate(
        String adAccountId,
        CustomerSegmentUpdateRequestUpdateWithRequiredBody customerSegmentUpdateRequestUpdateWithRequiredBody
    );

    /**
     * Send conversions
     * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object. - This endpoint requires an &#x60;access_token&#x60; be generated through Ads Manager. Review the [Conversions Guide](/docs/api-features/conversion-overview/) for more details. (Note that the authorization header required is &#x60;Authorization: Bearer &lt;access_token&gt;&#x60;). - The token&#39;s &#x60;user_account&#x60; must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Audience, Campaign. (Note that the token can be used across multiple ad accounts under an user ID.) - This endpoint has a rate limit of 5,000 calls per minute per ad account. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionEventsCreate  (required)
     * @param test Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request. (optional)
     * @return ConversionEvents
     */
    ConversionEvents eventsCreate(
        String adAccountId,
        ConversionEventsCreate conversionEventsCreate,
        Boolean test
    );

    /**
     * List of ad groups using promotions IDs.
     *   Get a list of ad groups that are associated with those promotion ids
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param promotionIds List of Promotion IDs to use to filter the results. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return AdGroupsList200Response
     */
    AdGroupsList200Response getAdGroupsByPromotionIdsList(
        String adAccountId,
        List<String> promotionIds,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Get campaign delivery estimates
     * Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignDeliveryEstimatesCampaign  (required)
     * @return CampaignDeliveryEstimatesResponse
     */
    CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(
        String adAccountId,
        List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign
    );

    /**
     * Create keywords
     *   Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).    **Notes:**   - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).   - All keyword match types are available for ad groups.    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).    **Returns:**   - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.   - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:     &#x60;&#x60;&#x60;json     {       \&quot;keywords\&quot;: [],       \&quot;errors\&quot;: [         {           \&quot;data\&quot;: {             \&quot;archived\&quot;: null,             \&quot;match_type\&quot;: \&quot;EXACT\&quot;,             \&quot;parent_type\&quot;: null,             \&quot;value\&quot;: \&quot;foobar\&quot;,             \&quot;parent_id\&quot;: null,             \&quot;type\&quot;: \&quot;keyword\&quot;,             \&quot;id\&quot;: null           },           \&quot;error_messages\&quot;: [             \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;           ]         }       ]     }
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param keywordsCreate  (required)
     * @return Keywords
     */
    Keywords keywordsCreate(
        String adAccountId,
        KeywordsCreate keywordsCreate
    );

    /**
     * Get keywords
     *     Get a list of keywords based on the filters provided. If no filter is provided, it will default to the &#x60;ad_account_id&#x60; filter, which means it will only return keywords that specifically have &#x60;parent_id&#x60; set to the &#x60;ad_account_id&#x60;. Note: Keywords can have &#x60;ad_account_ids&#x60;, &#x60;campaign_ids&#x60;, and &#x60;ad_group_ids&#x60; set as their &#x60;parent_ids&#x60;. Keywords created through Ads Manager will have their &#x60;parent_id&#x60; set to an &#x60;ad_group_id&#x60;, not &#x60;ad_account_id&#x60;.      For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).      **Notes:**     - Advertisers and campaigns can only be assigned keywords with excluding (&#x60;_NEGATIVE&#x60;).     - All keyword match types are available for ad groups.      For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).      **Returns:**     - A successful call returns an object containing an array of new keyword objects and an empty &#x60;errors&#x60; object array.     - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the &#x60;errors&#x60; object array:       &#x60;&#x60;&#x60;json       {         \&quot;keywords\&quot;: [],         \&quot;errors\&quot;: [           {             \&quot;data\&quot;: {               \&quot;archived\&quot;: null,               \&quot;match_type\&quot;: \&quot;EXACT\&quot;,               \&quot;parent_type\&quot;: null,               \&quot;value\&quot;: \&quot;foobar\&quot;,               \&quot;parent_id\&quot;: null,               \&quot;type\&quot;: \&quot;keyword\&quot;,               \&quot;id\&quot;: null             },             \&quot;error_messages\&quot;: [               \&quot;Advertisers and Campaigns only accept excluded targeting attributes.\&quot;             ]           }         ]       }
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignId Campaign Id to use to filter the results. (optional)
     * @param adGroupId Ad group Id. (optional)
     * @param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
     * @param matchTypes Keyword [match type](/docs/api-features/targeting-overview/) (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return KeywordsGet200Response
     */
    KeywordsGet200Response keywordsGet(
        String adAccountId,
        String campaignId,
        String adGroupId,
        List<String> adGroupIds,
        List<MatchType> matchTypes,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update keywords
     *   Update one or more keywords&#39; bid and archived fields. Archiving   a keyword effectively deletes it - keywords no longer receive metrics and   are no longer visible within the parent entity&#39;s keywords list.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param keywordsUpdate  (required)
     * @return Keywords
     */
    Keywords keywordsUpdate(
        String adAccountId,
        KeywordsUpdate keywordsUpdate
    );

    /**
     * Apply label to entity
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
     *
     * @param adAccountId  (required)
     * @param labelId Label ID. (required)
     * @param labeledEntitiesCreate  (required)
     * @return LabeledEntities
     */
    LabeledEntities labelsApply(
        String adAccountId,
        String labelId,
        LabeledEntitiesCreate labeledEntitiesCreate
    );

    /**
     * Create labels
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param labelCreateRequest  (required)
     * @return LabelsResponse
     */
    LabelsResponse labelsCreate(
        String adAccountId,
        LabelCreateRequest labelCreateRequest
    );

    /**
     * List labels
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param campaignIds List of Campaign Ids to use to filter the results. (optional)
     * @param labelIds List of Label Ids to use to filter the results. (optional)
     * @param entityStatuses Label entity status (optional, default to ACTIVE)
     * @param labelTypes Label type. (optional, default to BRAND,CUSTOM)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return LabelsList200Response
     */
    LabelsList200Response labelsList(
        String adAccountId,
        List<String> campaignIds,
        List<String> labelIds,
        List<QueryLabelEntityStatusesItems> entityStatuses,
        List<QueryLabelTypesItems> labelTypes,
        String bookmark,
        Integer pageSize
    );

    /**
     * Remove label from entities
     *   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
     *
     * @param adAccountId  (required)
     * @param labelId Label ID. (required)
     * @param labeledEntitiesCreate  (required)
     * @return LabeledEntities
     */
    LabeledEntities labelsRemove(
        String adAccountId,
        String labelId,
        LabeledEntitiesCreate labeledEntitiesCreate
    );

    /**
     * Update labels
     * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param labelUpdateRequest  (required)
     * @return LabelsResponse
     */
    LabelsResponse labelsUpdate(
        String adAccountId,
        LabelUpdateRequest labelUpdateRequest
    );

    /**
     * Get lead form by id
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param leadFormId The ID of this lead form (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return LeadForm
     */
    LeadForm leadFormGet(
        String leadFormId,
        String adAccountId
    );

    /**
     * Create lead form test data
     * Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.
     *
     * @param adAccountId  (required)
     * @param leadFormId Unique identifier of a lead form. (required)
     * @param leadFormTestCreate  (required)
     * @return LeadFormTest
     */
    LeadFormTest leadFormTestCreate(
        String adAccountId,
        String leadFormId,
        LeadFormTestCreate leadFormTestCreate
    );

    /**
     * Create lead forms
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormCreate  (required)
     * @return LeadFormsCreate200Response
     */
    LeadFormsCreate200Response leadFormsCreate(
        String adAccountId,
        List<LeadFormCreate> leadFormCreate
    );

    /**
     * List lead forms
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return LeadFormsList200Response
     */
    LeadFormsList200Response leadFormsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Update lead forms
     * **This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadFormBatchUpdate  (required)
     * @return LeadFormsCreate200Response
     */
    LeadFormsCreate200Response leadFormsUpdate(
        String adAccountId,
        List<LeadFormBatchUpdate> leadFormBatchUpdate
    );

    /**
     * Create a request to export leads collected from a lead ad
     * **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a &#x60;leads_export_id&#x60; token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadsExportsCreate  (required)
     * @return LeadsExports
     */
    LeadsExports leadsExportCreate(
        String adAccountId,
        LeadsExportsCreate leadsExportsCreate
    );

    /**
     * Get the lead export from the lead export create call
     * **This feature is currently in beta and not available to all apps. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param leadsExportId lead_export_id token returned from the create a lead export endpoint (required)
     * @return LeadsExportResponseData
     */
    LeadsExportResponseData leadsExportGet(
        String adAccountId,
        String leadsExportId
    );

    /**
     * Send Measurement Source Of Truth (MSOT) attributed conversion events
     * **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param conversionMSOTEventsCreate  (required)
     * @return void
     */
    void msotEventsCreate(
        String adAccountId,
        ConversionMSOTEventsCreate conversionMSOTEventsCreate
    );

    /**
     * Get Ocpm eligible conversion tags
     * Get Ocpm eligible conversion tag events for an ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return Map<String, List<ConversionEventResponse>>
     */
    Map<String, List<ConversionEventResponse>> ocpmEligibleConversionTagsGet(
        String adAccountId
    );

    /**
     * Get order line
     * Get a specific existing order line associated with an ad account.
     *
     * @param orderLineId Order line ID. (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return OrderLine
     */
    OrderLine orderLinesGet(
        String orderLineId,
        String adAccountId
    );

    /**
     * Get order lines.
     * List existing order lines associated with an ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return OrderLinesList200Response
     */
    OrderLinesList200Response orderLinesList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Get page visit conversion tags
     * Get all page visit conversion tag events for an ad account.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return PageVisitConversionTagsGet200Response
     */
    PageVisitConversionTagsGet200Response pageVisitConversionTagsGet(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Create product group promotions
     * Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a &#39;product group promotion.&#39;)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionsCreate  (required)
     * @return ProductGroupPromotions
     */
    ProductGroupPromotions productGroupPromotionsCreate(
        String adAccountId,
        ProductGroupPromotionsCreate productGroupPromotionsCreate
    );

    /**
     * Get a product group promotion by id
     * Get a product group promotion by id
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionId Unique identifier of a product group promotion (required)
     * @return ProductGroupPromotion
     */
    ProductGroupPromotion productGroupPromotionsGet(
        String adAccountId,
        String productGroupPromotionId
    );

    /**
     * Get product group promotions
     * List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param productGroupPromotionIds List of Product group promotion Ids. (optional)
     * @param entityStatuses Entity status (optional, default to ACTIVE,PAUSED)
     * @param adGroupId Ad group Id. (optional)
     * @return ProductGroupPromotionsList200Response
     */
    ProductGroupPromotionsList200Response productGroupPromotionsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        List<String> productGroupPromotionIds,
        List<EntityStatus> entityStatuses,
        String adGroupId
    );

    /**
     * Update product group promotions
     * Update multiple existing Product Group Promotions (by product_group_id)
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param productGroupPromotionsUpdateWithRequiredBody  (required)
     * @return ProductGroupPromotions
     */
    ProductGroupPromotions productGroupPromotionsUpdate(
        String adAccountId,
        ProductGroupPromotionsUpdateWithRequiredBody productGroupPromotionsUpdateWithRequiredBody
    );

    /**
     * Get product group analytics
     * Get analytics for the specified product groups in the specified &#x60;ad_account_id&#x60;, filtered by the specified options.  - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
     *
     * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. (required)
     * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. (required)
     * @param productGroupIds List of Product group Ids to use to filter the results. (required)
     * @param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. (required)
     * @param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 30)
     * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional, default to 30)
     * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 1)
     * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to TIME_OF_AD_ACTION)
     * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
     * @return List<ProductGroupAnalyticsItems>
     */
    List<ProductGroupAnalyticsItems> productGroupsAnalytics(
        LocalDate startDate,
        LocalDate endDate,
        List<String> productGroupIds,
        List<ReportingColumnSync> columns,
        Granularity granularity,
        String adAccountId,
        BigDecimal clickWindowDays,
        BigDecimal engagementWindowDays,
        BigDecimal viewWindowDays,
        String conversionReportTime,
        ReportingTimeZone reportingTimezone
    );

    /**
     * Create promotions
     * Create multiple new promotions.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param promotionCreate  (required)
     * @return PromotionsResponse
     */
    PromotionsResponse promotionsCreate(
        String adAccountId,
        List<PromotionCreate> promotionCreate
    );

    /**
     * Delete promotion by id
     * Delete a promotion within Pinterest.
     *
     * @param promotionId Promotion ID (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return Promotion
     */
    Promotion promotionsDelete(
        String promotionId,
        String adAccountId
    );

    /**
     * Get promotion by id
     * Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.
     *
     * @param promotionId Promotion ID (required)
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return Promotion
     */
    Promotion promotionsGet(
        String promotionId,
        String adAccountId
    );

    /**
     * Get promotions
     * Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return PromotionsList200Response
     */
    PromotionsList200Response promotionsList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Update promotions
     * Update multiple promotions.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param promotionBatchUpdate  (required)
     * @return PromotionsResponse
     */
    PromotionsResponse promotionsUpdate(
        String adAccountId,
        List<PromotionBatchUpdate> promotionBatchUpdate
    );

    /**
     * Delete ads data for ad account in API Sandbox
     * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return String
     */
    String sandboxDelete(
        String adAccountId
    );

    /**
     * Create schedules
     * Batch create schedules
     *
     * @param adAccountId  (required)
     * @param scheduleCreate  (required)
     * @return List<SchedulesCreate200ResponseInner>
     */
    List<SchedulesCreate200ResponseInner> schedulesCreate(
        String adAccountId,
        List<ScheduleCreate> scheduleCreate
    );

    /**
     * Get Schedules
     * Get schedules for a specific advertiser
     *
     * @param adAccountId  (required)
     * @param entityIds List of Entity IDs, must be associated with the Ad Accound ID provided in the path. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param scheduleStatuses Filter schedules by status (one or more) (optional)
     * @param scheduleType Filter schedules by a type (optional)
     * @return SchedulesList200Response
     */
    SchedulesList200Response schedulesList(
        String adAccountId,
        List<String> entityIds,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        List<ScheduleStatus> scheduleStatuses,
        ScheduleType scheduleType
    );

    /**
     * Update schedules
     * Update one or more schedules
     *
     * @param adAccountId  (required)
     * @param scheduleBatchUpdate  (required)
     * @return List<SchedulesCreate200ResponseInner>
     */
    List<SchedulesCreate200ResponseInner> schedulesUpdate(
        String adAccountId,
        List<ScheduleBatchUpdate> scheduleBatchUpdate
    );

    /**
     * Get Salesforce account details including bill-to information.
     *   Get Salesforce account details including bill-to information to be used in insertion orders process for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @return SSIOAccount
     */
    SSIOAccount ssioAccountsGet(
        String adAccountId
    );

    /**
     * Create insertion order through SSIO.
     *   Create insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param ssIOInsertionOrderCreate  (required)
     * @return SSIOInsertionOrder
     */
    SSIOInsertionOrder ssioInsertionOrderCreate(
        String adAccountId,
        SSIOInsertionOrderCreate ssIOInsertionOrderCreate
    );

    /**
     * Edit insertion order through SSIO.
     *   Edit insertion order through SSIO for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param ssIOInsertionOrderUpdate  (required)
     * @return SSIOInsertionOrder
     */
    SSIOInsertionOrder ssioInsertionOrderEdit(
        String adAccountId,
        SSIOInsertionOrderUpdate ssIOInsertionOrderUpdate
    );

    /**
     * Get insertion order status by ad account id.
     *   Get insertion order status for &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return SsioInsertionOrdersStatusGetByAdAccount200Response
     */
    SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount(
        String adAccountId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get insertion order status by pin order id.
     *   Get insertion order status for &#x60;pin_order_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pinOrderId The pin order id associated with the ssio insertion order (required)
     * @return SSIOInsertionOrderStatusResponse
     */
    SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId(
        String adAccountId,
        String pinOrderId
    );

    /**
     * Get Salesforce order lines by ad account id.
     *   Get Salesforce order lines for account id &#x60;ad_account_id&#x60;.   - The token&#39;s &#x60;user_account&#x60; must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param pinOrderId The pin order id associated with the SSIO insertion order (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return SsioOrderLinesGetByAdAccount200Response
     */
    SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount(
        String adAccountId,
        String pinOrderId,
        String bookmark,
        Integer pageSize
    );

    /**
     * Create targeting templates
     * Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param targetingTemplateCreate  (required)
     * @return TargetingTemplate
     */
    TargetingTemplate targetingTemplateCreate(
        String adAccountId,
        TargetingTemplateCreate targetingTemplateCreate
    );

    /**
     * List targeting templates
     * Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param includeSizing Include audience sizing in result or not (optional, default to false)
     * @param searchQuery Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
     * @return TargetingTemplateList200Response
     */
    TargetingTemplateList200Response targetingTemplateList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order,
        Boolean includeSizing,
        String searchQuery
    );

    /**
     * Update targeting templates
     * Update the targeting template given advertiser ID and targeting template ID
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param targetingTemplateUpdateRequestReadOrUpdate  (required)
     * @return void
     */
    void targetingTemplateUpdate(
        String adAccountId,
        TargetingTemplateUpdateRequestReadOrUpdate targetingTemplateUpdateRequestReadOrUpdate
    );

    /**
     * List templates
     * Gets all Templates associated with an ad account ID.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @return TemplatesList200Response
     */
    TemplatesList200Response templatesList(
        String adAccountId,
        String bookmark,
        Integer pageSize,
        PinterestLibPaginationOrder order
    );

    /**
     * Get terms of service
     * Get the text of the terms of service and see whether the advertiser has accepted the terms of service.
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param includeHtml Return HTML in TOS text. (optional, default to false)
     * @param tosType Request type. (optional)
     * @return TermsOfService
     */
    TermsOfService termsOfServiceGet(
        String adAccountId,
        Boolean includeHtml,
        String tosType
    );

    /**
     * Update audience sharing between ad accounts
     * From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adAccountToAdAccountSharedAudienceUpdateWithRequiredBody  (required)
     * @return AdAccountToAdAccountSharedAudience
     */
    AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(
        String adAccountId,
        AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    );

    /**
     * Update audience sharing from an ad account to businesses
     * From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     *
     * @param adAccountId Unique identifier of an ad account. (required)
     * @param adAccountToBusinessSharedAudienceUpdateWithRequiredBody  (required)
     * @return AdAccountToBusinessSharedAudience
     */
    AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(
        String adAccountId,
        AdAccountToBusinessSharedAudienceUpdateWithRequiredBody adAccountToBusinessSharedAudienceUpdateWithRequiredBody
    );
}
