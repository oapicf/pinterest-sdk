package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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
import org.joda.time.LocalDate;
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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-03-14T23:04:18.835425768Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public interface AdAccountsApiService {
      public Response adAccountAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adAccountTargetingAnalyticsGet(String adAccountId, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, SecurityContext securityContext);
      @Deprecated public Response adAccountsCatalogsProductGroupsList(String adAccountId, String feedProfileId, SecurityContext securityContext);
      public Response adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest, SecurityContext securityContext);
      public Response adAccountsGet(String adAccountId, SecurityContext securityContext);
      public Response adAccountsList(String bookmark, Integer pageSize, Boolean includeSharedAccounts, SecurityContext securityContext);
      public Response adAccountsSubscriptionsDelById(String adAccountId, String subscriptionId, SecurityContext securityContext);
      public Response adAccountsSubscriptionsGetById(String adAccountId, String subscriptionId, SecurityContext securityContext);
      public Response adAccountsSubscriptionsGetList(String adAccountId, Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response adAccountsSubscriptionsPost(String adAccountId, AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest, SecurityContext securityContext);
      public Response adGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adGroupsAudienceSizing(String adAccountId, AdGroupAudienceSizingRequest adGroupAudienceSizingRequest, SecurityContext securityContext);
      public Response adGroupsBidFloorGet(String adAccountId, BidFloorRequest bidFloorRequest, SecurityContext securityContext);
      public Response adGroupsCreate(String adAccountId, List<AdGroupCreateRequest> adGroupCreateRequest, SecurityContext securityContext);
      public Response adGroupsGet(String adAccountId, String adGroupId, SecurityContext securityContext);
      public Response adGroupsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, Boolean translateInterestsToNames, SecurityContext securityContext);
      public Response adGroupsTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, SecurityContext securityContext);
      public Response adGroupsUpdate(String adAccountId, List<AdGroupUpdateRequest> adGroupUpdateRequest, SecurityContext securityContext);
      public Response adPreviewsCreate(String adAccountId, AdPreviewRequest adPreviewRequest, SecurityContext securityContext);
      public Response adTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> adIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, SecurityContext securityContext);
      public Response adsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")String> adIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response adsCreate(String adAccountId, List<AdCreateRequest> adCreateRequest, SecurityContext securityContext);
      public Response adsCreditRedeem(String adAccountId, AdsCreditRedeemRequest adsCreditRedeemRequest, SecurityContext securityContext);
      public Response adsCreditsDiscountsGet(String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response adsGet(String adAccountId, String adId, SecurityContext securityContext);
      public Response adsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<@Pattern(regexp = "^\\d+$")String> adGroupIds, List<@Pattern(regexp = "^\\d+$")String> adIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response adsUpdate(String adAccountId, List<AdUpdateRequest> adUpdateRequest, SecurityContext securityContext);
      public Response analyticsCreateMmmReport(String adAccountId, CreateMMMReportRequest createMMMReportRequest, SecurityContext securityContext);
      public Response analyticsCreateReport(String adAccountId, AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest, SecurityContext securityContext);
      public Response analyticsCreateTemplateReport(String adAccountId, String templateId, LocalDate startDate, LocalDate endDate, Granularity granularity, SecurityContext securityContext);
      public Response analyticsGetMmmReport(String adAccountId, String token, SecurityContext securityContext);
      public Response analyticsGetReport(String adAccountId, String token, SecurityContext securityContext);
      public Response audienceInsightsGet(String adAccountId, AudienceInsightType audienceInsightType, SecurityContext securityContext);
      public Response audienceInsightsScopeAndTypeGet(String adAccountId, SecurityContext securityContext);
      public Response audiencesCreate(String adAccountId, AudienceCreateRequest audienceCreateRequest, SecurityContext securityContext);
      public Response audiencesCreateCustom(String adAccountId, AudienceCreateCustomRequest audienceCreateCustomRequest, SecurityContext securityContext);
      public Response audiencesGet(String adAccountId, String audienceId, SecurityContext securityContext);
      public Response audiencesList(String adAccountId, String bookmark, String order, Integer pageSize, String ownershipType, SecurityContext securityContext);
      public Response audiencesUpdate(String adAccountId, String audienceId, AudienceUpdateRequest audienceUpdateRequest, SecurityContext securityContext);
      public Response billingProfilesGet(String adAccountId, Boolean isActive, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response bulkDownloadCreate(String adAccountId, BulkDownloadRequest bulkDownloadRequest, SecurityContext securityContext);
      public Response bulkRequestGet(String adAccountId, String bulkRequestId, Boolean includeDetails, SecurityContext securityContext);
      public Response bulkUpsertCreate(String adAccountId, BulkUpsertRequest bulkUpsertRequest, SecurityContext securityContext);
      public Response campaignTargetingAnalyticsGet(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, LocalDate startDate, LocalDate endDate, List<AdsAnalyticsTargetingType> targetingTypes, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, ConversionReportAttributionType attributionTypes, SecurityContext securityContext);
      public Response campaignsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response campaignsCreate(String adAccountId, List<@Valid CampaignCreateRequest> campaignCreateRequest, SecurityContext securityContext);
      public Response campaignsGet(String adAccountId, String campaignId, SecurityContext securityContext);
      public Response campaignsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds, List<String> entityStatuses, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response campaignsUpdate(String adAccountId, List<@Valid CampaignUpdateRequest> campaignUpdateRequest, SecurityContext securityContext);
      public Response conversionTagsCreate(String adAccountId, ConversionTagCreate conversionTagCreate, SecurityContext securityContext);
      public Response conversionTagsGet(String adAccountId, String conversionTagId, SecurityContext securityContext);
      public Response conversionTagsList(String adAccountId, Boolean filterDeleted, SecurityContext securityContext);
      public Response countryKeywordsMetricsGet(String adAccountId, String countryCode, List<String> keywords, SecurityContext securityContext);
      public Response customerListsCreate(String adAccountId, CustomerListRequest customerListRequest, SecurityContext securityContext);
      public Response customerListsGet(String adAccountId, String customerListId, SecurityContext securityContext);
      public Response customerListsList(String adAccountId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response customerListsUpdate(String adAccountId, String customerListId, CustomerListUpdateRequest customerListUpdateRequest, SecurityContext securityContext);
      public Response eventsCreate(String adAccountId, ConversionEvents conversionEvents, Boolean test, SecurityContext securityContext);
      public Response keywordsCreate(String adAccountId, KeywordsRequest keywordsRequest, SecurityContext securityContext);
      public Response keywordsGet(String adAccountId, String campaignId, String adGroupId, List<MatchType> matchTypes, Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response keywordsUpdate(String adAccountId, KeywordUpdateBody keywordUpdateBody, SecurityContext securityContext);
      public Response leadFormGet(String adAccountId, String leadFormId, SecurityContext securityContext);
      public Response leadFormTestCreate(String adAccountId, String leadFormId, LeadFormTestRequest leadFormTestRequest, SecurityContext securityContext);
      public Response leadFormsList(String adAccountId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response ocpmEligibleConversionTagsGet(String adAccountId, SecurityContext securityContext);
      public Response orderLinesGet(String adAccountId, String orderLineId, SecurityContext securityContext);
      public Response orderLinesList(String adAccountId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response pageVisitConversionTagsGet(String adAccountId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response productGroupPromotionsCreate(String adAccountId, ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest, SecurityContext securityContext);
      public Response productGroupPromotionsGet(String adAccountId, String productGroupPromotionId, SecurityContext securityContext);
      public Response productGroupPromotionsList(String adAccountId, List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds, List<String> entityStatuses, String adGroupId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response productGroupPromotionsUpdate(String adAccountId, ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest, SecurityContext securityContext);
      public Response productGroupsAnalytics(String adAccountId, LocalDate startDate, LocalDate endDate, List<@Pattern(regexp = "^\\d+$")String> productGroupIds, List<String> columns, Granularity granularity, Integer clickWindowDays, Integer engagementWindowDays, Integer viewWindowDays, String conversionReportTime, SecurityContext securityContext);
      public Response sandboxDelete(String adAccountId, SecurityContext securityContext);
      public Response ssioAccountsGet(String adAccountId, SecurityContext securityContext);
      public Response ssioInsertionOrderCreate(String adAccountId, SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest, SecurityContext securityContext);
      public Response ssioInsertionOrderEdit(String adAccountId, SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest, SecurityContext securityContext);
      public Response ssioInsertionOrdersStatusGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId, String pinOrderId, SecurityContext securityContext);
      public Response ssioOrderLinesGetByAdAccount(String adAccountId, String bookmark, Integer pageSize, String pinOrderId, SecurityContext securityContext);
      public Response templatesList(String adAccountId, Integer pageSize, String order, String bookmark, SecurityContext securityContext);
      public Response termsOfServiceGet(String adAccountId, Boolean includeHtml, String tosType, SecurityContext securityContext);
}