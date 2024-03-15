package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreateRequest;
import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsCatalogsProductGroupsList200Response;
import org.openapitools.model.AdAccountsList200Response;
import org.openapitools.model.AdAccountsSubscriptionsGetList200Response;
import org.openapitools.model.AdArrayResponse;
import org.openapitools.model.AdCreateRequest;
import org.openapitools.model.AdGroupArrayResponse;
import org.openapitools.model.AdGroupAudienceSizingRequest;
import org.openapitools.model.AdGroupAudienceSizingResponse;
import org.openapitools.model.AdGroupCreateRequest;
import org.openapitools.model.AdGroupResponse;
import org.openapitools.model.AdGroupUpdateRequest;
import org.openapitools.model.AdGroupsAnalyticsResponseInner;
import org.openapitools.model.AdGroupsList200Response;
import org.openapitools.model.AdPreviewRequest;
import org.openapitools.model.AdPreviewURLResponse;
import org.openapitools.model.AdResponse;
import org.openapitools.model.AdUpdateRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequest;
import org.openapitools.model.AdsAnalyticsCreateAsyncResponse;
import org.openapitools.model.AdsAnalyticsGetAsyncResponse;
import org.openapitools.model.AdsAnalyticsResponseInner;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.AdsCreditRedeemRequest;
import org.openapitools.model.AdsCreditRedeemResponse;
import org.openapitools.model.AdsCreditsDiscountsGet200Response;
import org.openapitools.model.AdsList200Response;
import org.openapitools.model.Audience;
import org.openapitools.model.AudienceCreateCustomRequest;
import org.openapitools.model.AudienceCreateRequest;
import org.openapitools.model.AudienceDefinitionResponse;
import org.openapitools.model.AudienceInsightType;
import org.openapitools.model.AudienceInsightsResponse;
import org.openapitools.model.AudienceUpdateRequest;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.BidFloor;
import org.openapitools.model.BidFloorRequest;
import org.openapitools.model.BillingProfilesGet200Response;
import org.openapitools.model.BulkDownloadRequest;
import org.openapitools.model.BulkDownloadResponse;
import org.openapitools.model.BulkUpsertRequest;
import org.openapitools.model.BulkUpsertResponse;
import org.openapitools.model.BulkUpsertStatusResponse;
import org.openapitools.model.CampaignCreateRequest;
import org.openapitools.model.CampaignCreateResponse;
import org.openapitools.model.CampaignResponse;
import org.openapitools.model.CampaignUpdateRequest;
import org.openapitools.model.CampaignUpdateResponse;
import org.openapitools.model.CampaignsAnalyticsResponseInner;
import org.openapitools.model.CampaignsList200Response;
import org.openapitools.model.ConversionApiResponse;
import org.openapitools.model.ConversionEventResponse;
import org.openapitools.model.ConversionEvents;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionTagCreate;
import org.openapitools.model.ConversionTagListResponse;
import org.openapitools.model.ConversionTagResponse;
import org.openapitools.model.CreateMMMReportRequest;
import org.openapitools.model.CreateMMMReportResponse;
import org.openapitools.model.CustomerList;
import org.openapitools.model.CustomerListRequest;
import org.openapitools.model.CustomerListUpdateRequest;
import org.openapitools.model.CustomerListsList200Response;
import java.util.Date;
import org.openapitools.model.DetailedError;
import org.openapitools.model.Error;
import org.openapitools.model.GetMMMReportResponse;
import org.openapitools.model.Granularity;
import org.openapitools.model.KeywordUpdateBody;
import org.openapitools.model.KeywordsGet200Response;
import org.openapitools.model.KeywordsMetricsArrayResponse;
import org.openapitools.model.KeywordsRequest;
import org.openapitools.model.KeywordsResponse;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormsList200Response;
import java.util.List;
import java.util.Map;
import org.openapitools.model.MatchType;
import org.openapitools.model.MetricsResponse;
import org.openapitools.model.OrderLine;
import org.openapitools.model.OrderLinesList200Response;
import org.openapitools.model.PageVisitConversionTagsGet200Response;
import org.openapitools.model.ProductGroupAnalyticsResponseInner;
import org.openapitools.model.ProductGroupPromotionCreateRequest;
import org.openapitools.model.ProductGroupPromotionResponse;
import org.openapitools.model.ProductGroupPromotionUpdateRequest;
import org.openapitools.model.ProductGroupPromotionsList200Response;
import org.openapitools.model.SSIOAccountResponse;
import org.openapitools.model.SSIOCreateInsertionOrderRequest;
import org.openapitools.model.SSIOCreateInsertionOrderResponse;
import org.openapitools.model.SSIOEditInsertionOrderRequest;
import org.openapitools.model.SSIOEditInsertionOrderResponse;
import org.openapitools.model.SSIOInsertionOrderStatusResponse;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class AdAccountsApiService {
    public abstract Response adAccountAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adAccountTargetingAnalyticsGet(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<AdsAnalyticsTargetingType> targetingTypes
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ,ConversionReportAttributionType attributionTypes
 ) throws NotFoundException;
    public abstract Response adAccountsCatalogsProductGroupsList(String adAccountId
 ,String feedProfileId
 ) throws NotFoundException;
    public abstract Response adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest
 ) throws NotFoundException;
    public abstract Response adAccountsGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response adAccountsList(String bookmark
 ,Integer pageSize
 ,Boolean includeSharedAccounts
 ) throws NotFoundException;
    public abstract Response adAccountsSubscriptionsDelById(String adAccountId
 ,String subscriptionId
 ) throws NotFoundException;
    public abstract Response adAccountsSubscriptionsGetById(String adAccountId
 ,String subscriptionId
 ) throws NotFoundException;
    public abstract Response adAccountsSubscriptionsGetList(String adAccountId
 ,Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response adAccountsSubscriptionsPost(String adAccountId
 ,AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest
 ) throws NotFoundException;
    public abstract Response adGroupsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adGroupsAudienceSizing(String adAccountId
 ,AdGroupAudienceSizingRequest adGroupAudienceSizingRequest
 ) throws NotFoundException;
    public abstract Response adGroupsBidFloorGet(String adAccountId
 ,BidFloorRequest bidFloorRequest
 ) throws NotFoundException;
    public abstract Response adGroupsCreate(String adAccountId
 ,List<AdGroupCreateRequest> adGroupCreateRequest
 ) throws NotFoundException;
    public abstract Response adGroupsGet(String adAccountId
 ,String adGroupId
 ) throws NotFoundException;
    public abstract Response adGroupsList(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
 ,List<@Pattern(regexp = "^\\d+$")String> adGroupIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ,Boolean translateInterestsToNames
 ) throws NotFoundException;
    public abstract Response adGroupsTargetingAnalyticsGet(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds
 ,Date startDate
 ,Date endDate
 ,List<AdsAnalyticsTargetingType> targetingTypes
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ,ConversionReportAttributionType attributionTypes
 ) throws NotFoundException;
    public abstract Response adGroupsUpdate(String adAccountId
 ,List<AdGroupUpdateRequest> adGroupUpdateRequest
 ) throws NotFoundException;
    public abstract Response adPreviewsCreate(String adAccountId
 ,AdPreviewRequest adPreviewRequest
 ) throws NotFoundException;
    public abstract Response adTargetingAnalyticsGet(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")String> adIds
 ,Date startDate
 ,Date endDate
 ,List<AdsAnalyticsTargetingType> targetingTypes
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ,ConversionReportAttributionType attributionTypes
 ) throws NotFoundException;
    public abstract Response adsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<@Pattern(regexp = "^\\d+$")String> adIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response adsCreate(String adAccountId
 ,List<AdCreateRequest> adCreateRequest
 ) throws NotFoundException;
    public abstract Response adsCreditRedeem(String adAccountId
 ,AdsCreditRedeemRequest adsCreditRedeemRequest
 ) throws NotFoundException;
    public abstract Response adsCreditsDiscountsGet(String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response adsGet(String adAccountId
 ,String adId
 ) throws NotFoundException;
    public abstract Response adsList(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
 ,List<@Pattern(regexp = "^\\d+$")String> adGroupIds
 ,List<@Pattern(regexp = "^\\d+$")String> adIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response adsUpdate(String adAccountId
 ,List<AdUpdateRequest> adUpdateRequest
 ) throws NotFoundException;
    public abstract Response analyticsCreateMmmReport(String adAccountId
 ,CreateMMMReportRequest createMMMReportRequest
 ) throws NotFoundException;
    public abstract Response analyticsCreateReport(String adAccountId
 ,AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
 ) throws NotFoundException;
    public abstract Response analyticsCreateTemplateReport(String adAccountId
 ,String templateId
 ,Date startDate
 ,Date endDate
 ,Granularity granularity
 ) throws NotFoundException;
    public abstract Response analyticsGetMmmReport(String adAccountId
 ,String token
 ) throws NotFoundException;
    public abstract Response analyticsGetReport(String adAccountId
 ,String token
 ) throws NotFoundException;
    public abstract Response audienceInsightsGet(String adAccountId
 ,AudienceInsightType audienceInsightType
 ) throws NotFoundException;
    public abstract Response audienceInsightsScopeAndTypeGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response audiencesCreate(String adAccountId
 ,AudienceCreateRequest audienceCreateRequest
 ) throws NotFoundException;
    public abstract Response audiencesCreateCustom(String adAccountId
 ,AudienceCreateCustomRequest audienceCreateCustomRequest
 ) throws NotFoundException;
    public abstract Response audiencesGet(String adAccountId
 ,String audienceId
 ) throws NotFoundException;
    public abstract Response audiencesList(String adAccountId
 ,String bookmark
 ,String order
 ,Integer pageSize
 ,String ownershipType
 ) throws NotFoundException;
    public abstract Response audiencesUpdate(String adAccountId
 ,String audienceId
 ,AudienceUpdateRequest audienceUpdateRequest
 ) throws NotFoundException;
    public abstract Response billingProfilesGet(String adAccountId
 ,Boolean isActive
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response bulkDownloadCreate(String adAccountId
 ,BulkDownloadRequest bulkDownloadRequest
 ) throws NotFoundException;
    public abstract Response bulkRequestGet(String adAccountId
 ,String bulkRequestId
 ,Boolean includeDetails
 ) throws NotFoundException;
    public abstract Response bulkUpsertCreate(String adAccountId
 ,BulkUpsertRequest bulkUpsertRequest
 ) throws NotFoundException;
    public abstract Response campaignTargetingAnalyticsGet(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
 ,Date startDate
 ,Date endDate
 ,List<AdsAnalyticsTargetingType> targetingTypes
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ,ConversionReportAttributionType attributionTypes
 ) throws NotFoundException;
    public abstract Response campaignsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response campaignsCreate(String adAccountId
 ,List<@Valid CampaignCreateRequest> campaignCreateRequest
 ) throws NotFoundException;
    public abstract Response campaignsGet(String adAccountId
 ,String campaignId
 ) throws NotFoundException;
    public abstract Response campaignsList(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds
 ,List<String> entityStatuses
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response campaignsUpdate(String adAccountId
 ,List<@Valid CampaignUpdateRequest> campaignUpdateRequest
 ) throws NotFoundException;
    public abstract Response conversionTagsCreate(String adAccountId
 ,ConversionTagCreate conversionTagCreate
 ) throws NotFoundException;
    public abstract Response conversionTagsGet(String adAccountId
 ,String conversionTagId
 ) throws NotFoundException;
    public abstract Response conversionTagsList(String adAccountId
 ,Boolean filterDeleted
 ) throws NotFoundException;
    public abstract Response countryKeywordsMetricsGet(String adAccountId
 ,String countryCode
 ,List<String> keywords
 ) throws NotFoundException;
    public abstract Response customerListsCreate(String adAccountId
 ,CustomerListRequest customerListRequest
 ) throws NotFoundException;
    public abstract Response customerListsGet(String adAccountId
 ,String customerListId
 ) throws NotFoundException;
    public abstract Response customerListsList(String adAccountId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response customerListsUpdate(String adAccountId
 ,String customerListId
 ,CustomerListUpdateRequest customerListUpdateRequest
 ) throws NotFoundException;
    public abstract Response eventsCreate(String adAccountId
 ,ConversionEvents conversionEvents
 ,Boolean test
 ) throws NotFoundException;
    public abstract Response keywordsCreate(String adAccountId
 ,KeywordsRequest keywordsRequest
 ) throws NotFoundException;
    public abstract Response keywordsGet(String adAccountId
 ,String campaignId
 ,String adGroupId
 ,List<MatchType> matchTypes
 ,Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response keywordsUpdate(String adAccountId
 ,KeywordUpdateBody keywordUpdateBody
 ) throws NotFoundException;
    public abstract Response leadFormGet(String adAccountId
 ,String leadFormId
 ) throws NotFoundException;
    public abstract Response leadFormTestCreate(String adAccountId
 ,String leadFormId
 ,LeadFormTestRequest leadFormTestRequest
 ) throws NotFoundException;
    public abstract Response leadFormsList(String adAccountId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response ocpmEligibleConversionTagsGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response orderLinesGet(String adAccountId
 ,String orderLineId
 ) throws NotFoundException;
    public abstract Response orderLinesList(String adAccountId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response pageVisitConversionTagsGet(String adAccountId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response productGroupPromotionsCreate(String adAccountId
 ,ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest
 ) throws NotFoundException;
    public abstract Response productGroupPromotionsGet(String adAccountId
 ,String productGroupPromotionId
 ) throws NotFoundException;
    public abstract Response productGroupPromotionsList(String adAccountId
 ,List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds
 ,List<String> entityStatuses
 ,String adGroupId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response productGroupPromotionsUpdate(String adAccountId
 ,ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest
 ) throws NotFoundException;
    public abstract Response productGroupsAnalytics(String adAccountId
 ,Date startDate
 ,Date endDate
 ,List<@Pattern(regexp = "^\\d+$")String> productGroupIds
 ,List<String> columns
 ,Granularity granularity
 ,Integer clickWindowDays
 ,Integer engagementWindowDays
 ,Integer viewWindowDays
 ,String conversionReportTime
 ) throws NotFoundException;
    public abstract Response sandboxDelete(String adAccountId
 ) throws NotFoundException;
    public abstract Response ssioAccountsGet(String adAccountId
 ) throws NotFoundException;
    public abstract Response ssioInsertionOrderCreate(String adAccountId
 ,SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest
 ) throws NotFoundException;
    public abstract Response ssioInsertionOrderEdit(String adAccountId
 ,SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest
 ) throws NotFoundException;
    public abstract Response ssioInsertionOrdersStatusGetByAdAccount(String adAccountId
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId
 ,String pinOrderId
 ) throws NotFoundException;
    public abstract Response ssioOrderLinesGetByAdAccount(String adAccountId
 ,String bookmark
 ,Integer pageSize
 ,String pinOrderId
 ) throws NotFoundException;
    public abstract Response templatesList(String adAccountId
 ,Integer pageSize
 ,String order
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response termsOfServiceGet(String adAccountId
 ,Boolean includeHtml
 ,String tosType
 ) throws NotFoundException;
}
