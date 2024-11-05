package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.AdAccount;
import org.openapitools.model.AdAccountAnalyticsResponseInner;
import org.openapitools.model.AdAccountCreateRequest;
import org.openapitools.model.AdAccountCreateSubscriptionRequest;
import org.openapitools.model.AdAccountCreateSubscriptionResponse;
import org.openapitools.model.AdAccountGetSubscriptionResponse;
import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
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
import org.openapitools.model.AdsAnalyticsAdTargetingType;
import org.openapitools.model.AdsAnalyticsCampaignTargetingType;
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
import org.openapitools.model.AudienceAccountType;
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
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
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
import org.openapitools.model.LeadFormArrayResponse;
import org.openapitools.model.LeadFormCreateRequest;
import org.openapitools.model.LeadFormResponse;
import org.openapitools.model.LeadFormTestRequest;
import org.openapitools.model.LeadFormTestResponse;
import org.openapitools.model.LeadFormUpdateRequest;
import org.openapitools.model.LeadFormsList200Response;
import org.openapitools.model.LeadsExportCreateRequest;
import org.openapitools.model.LeadsExportCreateResponse;
import org.openapitools.model.LeadsExportResponseData;
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
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
import org.openapitools.model.SsioInsertionOrdersStatusGetByAdAccount200Response;
import org.openapitools.model.SsioOrderLinesGetByAdAccount200Response;
import org.openapitools.model.TargetingTemplateCreate;
import org.openapitools.model.TargetingTemplateGetResponseData;
import org.openapitools.model.TargetingTemplateList200Response;
import org.openapitools.model.TargetingTemplateUpdateRequest;
import org.openapitools.model.TemplatesList200Response;
import org.openapitools.model.TermsOfService;

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-11-05T02:20:54.377772266Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AdAccountsApiServiceImpl implements AdAccountsApi {
      public Response adAccountAnalytics(String adAccountId,Date startDate,Date endDate,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountTargetingAnalyticsGet(String adAccountId,Date startDate,Date endDate,List<AdsAnalyticsTargetingType> targetingTypes,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,ConversionReportAttributionType attributionTypes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsAudiencesSharedAccountsList(String adAccountId,String audienceId,AudienceAccountType accountType,Integer pageSize,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsCreate(AdAccountCreateRequest adAccountCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsGet(String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsList(String bookmark,Integer pageSize,Boolean includeSharedAccounts,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsSubscriptionsDelById(String adAccountId,String subscriptionId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsSubscriptionsGetById(String adAccountId,String subscriptionId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsSubscriptionsGetList(String adAccountId,Integer pageSize,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adAccountsSubscriptionsPost(String adAccountId,AdAccountCreateSubscriptionRequest adAccountCreateSubscriptionRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsAudienceSizing(String adAccountId,AdGroupAudienceSizingRequest adGroupAudienceSizingRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsBidFloorGet(String adAccountId,BidFloorRequest bidFloorRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsCreate(String adAccountId,List<@Valid AdGroupCreateRequest> adGroupCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsGet(String adAccountId,String adGroupId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsList(String adAccountId,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,List<@Pattern(regexp = "^\\d+$")String> adGroupIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,Boolean translateInterestsToNames,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsTargetingAnalyticsGet(String adAccountId,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> adGroupIds,Date startDate,Date endDate,List<AdsAnalyticsTargetingType> targetingTypes,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,ConversionReportAttributionType attributionTypes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adGroupsUpdate(String adAccountId,List<@Valid AdGroupUpdateRequest> adGroupUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adPreviewsCreate(String adAccountId,AdPreviewRequest adPreviewRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adTargetingAnalyticsGet(String adAccountId,List<@Pattern(regexp = "^\\d+$")String> adIds,Date startDate,Date endDate,List<AdsAnalyticsAdTargetingType> targetingTypes,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,ConversionReportAttributionType attributionTypes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsAnalytics(String adAccountId,Date startDate,Date endDate,List<String> columns,Granularity granularity,List<@Pattern(regexp = "^\\d+$")String> adIds,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,List<@Pattern(regexp = "^\\d+$")String> pinIds,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsCreate(String adAccountId,List<@Valid AdCreateRequest> adCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsCreditRedeem(String adAccountId,AdsCreditRedeemRequest adsCreditRedeemRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsCreditsDiscountsGet(String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsGet(String adAccountId,String adId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsList(String adAccountId,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,List<@Pattern(regexp = "^\\d+$")String> adGroupIds,List<@Pattern(regexp = "^\\d+$")String> adIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response adsUpdate(String adAccountId,List<@Valid AdUpdateRequest> adUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsCreateMmmReport(String adAccountId,CreateMMMReportRequest createMMMReportRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsCreateReport(String adAccountId,AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsCreateTemplateReport(String adAccountId,String templateId,Date startDate,Date endDate,Granularity granularity,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsGetMmmReport(String adAccountId,String token,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response analyticsGetReport(String adAccountId,String token,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audienceInsightsGet(String adAccountId,AudienceInsightType audienceInsightType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audienceInsightsScopeAndTypeGet(String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audiencesCreate(String adAccountId,AudienceCreateRequest audienceCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audiencesCreateCustom(String adAccountId,AudienceCreateCustomRequest audienceCreateCustomRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audiencesGet(String adAccountId,String audienceId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audiencesList(String adAccountId,String bookmark,String order,Integer pageSize,String ownershipType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response audiencesUpdate(String adAccountId,String audienceId,AudienceUpdateRequest audienceUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response billingProfilesGet(String adAccountId,Boolean isActive,String bookmark,Integer pageSize,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response bulkDownloadCreate(String adAccountId,BulkDownloadRequest bulkDownloadRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response bulkRequestGet(String adAccountId,String bulkRequestId,Boolean includeDetails,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response bulkUpsertCreate(String adAccountId,BulkUpsertRequest bulkUpsertRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignTargetingAnalyticsGet(String adAccountId,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,Date startDate,Date endDate,List<AdsAnalyticsCampaignTargetingType> targetingTypes,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,ConversionReportAttributionType attributionTypes,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsAnalytics(String adAccountId,Date startDate,Date endDate,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsCreate(String adAccountId,List<@Valid CampaignCreateRequest> campaignCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsGet(String adAccountId,String campaignId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsList(String adAccountId,List<@Pattern(regexp = "^\\d+$")@Size(max = 18)String> campaignIds,List<String> entityStatuses,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response campaignsUpdate(String adAccountId,List<@Valid CampaignUpdateRequest> campaignUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response conversionTagsCreate(String adAccountId,ConversionTagCreate conversionTagCreate,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response conversionTagsGet(String adAccountId,String conversionTagId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response conversionTagsList(String adAccountId,Boolean filterDeleted,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response countryKeywordsMetricsGet(String adAccountId,String countryCode,List<String> keywords,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response customerListsCreate(String adAccountId,CustomerListRequest customerListRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response customerListsGet(String adAccountId,String customerListId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response customerListsList(String adAccountId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response customerListsUpdate(String adAccountId,String customerListId,CustomerListUpdateRequest customerListUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response eventsCreate(String adAccountId,ConversionEvents conversionEvents,Boolean test,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response keywordsCreate(String adAccountId,KeywordsRequest keywordsRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response keywordsGet(String adAccountId,String campaignId,String adGroupId,List<MatchType> matchTypes,Integer pageSize,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response keywordsUpdate(String adAccountId,KeywordUpdateBody keywordUpdateBody,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadFormGet(String adAccountId,String leadFormId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadFormTestCreate(String adAccountId,String leadFormId,LeadFormTestRequest leadFormTestRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadFormsCreate(String adAccountId,List<@Valid LeadFormCreateRequest> leadFormCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadFormsList(String adAccountId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadFormsUpdate(String adAccountId,List<@Valid LeadFormUpdateRequest> leadFormUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadsExportCreate(String adAccountId,LeadsExportCreateRequest leadsExportCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response leadsExportGet(String adAccountId,String leadsExportId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ocpmEligibleConversionTagsGet(String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response orderLinesGet(String adAccountId,String orderLineId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response orderLinesList(String adAccountId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response pageVisitConversionTagsGet(String adAccountId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupPromotionsCreate(String adAccountId,ProductGroupPromotionCreateRequest productGroupPromotionCreateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupPromotionsGet(String adAccountId,String productGroupPromotionId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupPromotionsList(String adAccountId,List<@Pattern(regexp = "^\\d+$")String> productGroupPromotionIds,List<String> entityStatuses,String adGroupId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupPromotionsUpdate(String adAccountId,ProductGroupPromotionUpdateRequest productGroupPromotionUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response productGroupsAnalytics(String adAccountId,Date startDate,Date endDate,List<@Pattern(regexp = "^\\d+$")String> productGroupIds,List<String> columns,Granularity granularity,Integer clickWindowDays,Integer engagementWindowDays,Integer viewWindowDays,String conversionReportTime,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response sandboxDelete(String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioAccountsGet(String adAccountId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioInsertionOrderCreate(String adAccountId,SSIOCreateInsertionOrderRequest ssIOCreateInsertionOrderRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioInsertionOrderEdit(String adAccountId,SSIOEditInsertionOrderRequest ssIOEditInsertionOrderRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioInsertionOrdersStatusGetByAdAccount(String adAccountId,String bookmark,Integer pageSize,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioInsertionOrdersStatusGetByPinOrderId(String adAccountId,String pinOrderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response ssioOrderLinesGetByAdAccount(String adAccountId,String bookmark,Integer pageSize,String pinOrderId,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response targetingTemplateCreate(String adAccountId,TargetingTemplateCreate targetingTemplateCreate,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response targetingTemplateList(String adAccountId,String order,Boolean includeSizing,String searchQuery,Integer pageSize,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response targetingTemplateUpdate(String adAccountId,TargetingTemplateUpdateRequest targetingTemplateUpdateRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response templatesList(String adAccountId,Integer pageSize,String order,String bookmark,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response termsOfServiceGet(String adAccountId,Boolean includeHtml,String tosType,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateAdAccountToAdAccountSharedAudience(String adAccountId,SharedAudience sharedAudience,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response updateAdAccountToBusinessSharedAudience(String adAccountId,BusinessSharedAudience businessSharedAudience,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
