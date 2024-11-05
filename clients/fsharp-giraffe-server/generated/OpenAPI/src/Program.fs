namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open AdAccountsApiHandlerParams
open AdGroupsApiHandlerParams
open AdsApiHandlerParams
open AdvancedAuctionApiHandlerParams
open AudienceInsightsApiHandlerParams
open AudienceSharingApiHandlerParams
open AudiencesApiHandlerParams
open BillingApiHandlerParams
open BoardsApiHandlerParams
open BulkApiHandlerParams
open BusinessAccessAssetsApiHandlerParams
open BusinessAccessInviteApiHandlerParams
open BusinessAccessRelationshipsApiHandlerParams
open CampaignsApiHandlerParams
open CatalogsApiHandlerParams
open ConversionEventsApiHandlerParams
open ConversionTagsApiHandlerParams
open CustomerListsApiHandlerParams
open IntegrationsApiHandlerParams
open KeywordsApiHandlerParams
open LeadAdsApiHandlerParams
open LeadFormsApiHandlerParams
open LeadsExportApiHandlerParams
open MediaApiHandlerParams
open OauthApiHandlerParams
open OrderLinesApiHandlerParams
open PinsApiHandlerParams
open ProductGroupPromotionsApiHandlerParams
open ResourcesApiHandlerParams
open SearchApiHandlerParams
open TargetingTemplateApiHandlerParams
open TermsApiHandlerParams
open TermsOfServiceApiHandlerParams
open UserAccountApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpGet >=> routeBind<AdAccountAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountAnalytics x);
      HttpGet >=> routeBind<AdAccountTargetingAnalyticsGetPathParams> "/v5/ad_accounts/{ad_account_id}/targeting_analytics"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountTargetingAnalyticsGet x);
      HttpPost >=> route "/v5/ad_accounts" >=> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountsCreate;
      HttpGet >=> routeBind<AdAccountsGetPathParams> "/v5/ad_accounts/{ad_account_id}"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountsGet x);
      HttpGet >=> route "/v5/ad_accounts" >=> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AdAccountsList;
      HttpPost >=> routeBind<AnalyticsCreateMmmReportPathParams> "/v5/ad_accounts/{ad_account_id}/mmm_reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsCreateMmmReport x);
      HttpPost >=> routeBind<AnalyticsCreateReportPathParams> "/v5/ad_accounts/{ad_account_id}/reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsCreateReport x);
      HttpPost >=> routeBind<AnalyticsCreateTemplateReportPathParams> "/v5/ad_accounts/{ad_account_id}/templates/{template_id}/reports"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsCreateTemplateReport x) x);
      HttpGet >=> routeBind<AnalyticsGetMmmReportPathParams> "/v5/ad_accounts/{ad_account_id}/mmm_reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsGetMmmReport x);
      HttpGet >=> routeBind<AnalyticsGetReportPathParams> "/v5/ad_accounts/{ad_account_id}/reports"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.AnalyticsGetReport x);
      HttpDelete >=> routeBind<SandboxDeletePathParams> "/v5/ad_accounts/{ad_account_id}/sandbox"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.SandboxDelete x);
      HttpGet >=> routeBind<TemplatesListPathParams> "/v5/ad_accounts/{ad_account_id}/templates"  (fun x -> requiresAuthentication authFailure >=>  AdAccountsApiHandler.TemplatesList x);
      HttpGet >=> routeBind<AdGroupsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsAnalytics x);
      HttpPost >=> routeBind<AdGroupsAudienceSizingPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsAudienceSizing x);
      HttpPost >=> routeBind<AdGroupsBidFloorGetPathParams> "/v5/ad_accounts/{ad_account_id}/bid_floor"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsBidFloorGet x);
      HttpPost >=> routeBind<AdGroupsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsCreate x);
      HttpGet >=> routeBind<AdGroupsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsGet x) x);
      HttpGet >=> routeBind<AdGroupsListPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsList x);
      HttpGet >=> routeBind<AdGroupsTargetingAnalyticsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsTargetingAnalyticsGet x);
      HttpPatch >=> routeBind<AdGroupsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/ad_groups"  (fun x -> requiresAuthentication authFailure >=>  AdGroupsApiHandler.AdGroupsUpdate x);
      HttpPost >=> routeBind<AdPreviewsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/ad_previews"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdPreviewsCreate x);
      HttpGet >=> routeBind<AdTargetingAnalyticsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ads/targeting_analytics"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdTargetingAnalyticsGet x);
      HttpGet >=> routeBind<AdsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/ads/analytics"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdsAnalytics x);
      HttpPost >=> routeBind<AdsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/ads"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdsCreate x);
      HttpGet >=> routeBind<AdsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ads/{ad_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdsGet x) x);
      HttpGet >=> routeBind<AdsListPathParams> "/v5/ad_accounts/{ad_account_id}/ads"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdsList x);
      HttpPatch >=> routeBind<AdsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/ads"  (fun x -> requiresAuthentication authFailure >=>  AdsApiHandler.AdsUpdate x);
      HttpPost >=> route "/v5/advanced_auction/items/get" >=> requiresAuthentication authFailure >=>  AdvancedAuctionApiHandler.AdvancedAuctionItemsGetPost;
      HttpPost >=> route "/v5/advanced_auction/items/submit" >=> requiresAuthentication authFailure >=>  AdvancedAuctionApiHandler.AdvancedAuctionItemsSubmitPost;
      HttpGet >=> routeBind<AudienceInsightsGetPathParams> "/v5/ad_accounts/{ad_account_id}/audience_insights"  (fun x -> requiresAuthentication authFailure >=>  AudienceInsightsApiHandler.AudienceInsightsGet x);
      HttpGet >=> routeBind<AudienceInsightsScopeAndTypeGetPathParams> "/v5/ad_accounts/{ad_account_id}/insights/audiences"  (fun x -> requiresAuthentication authFailure >=>  AudienceInsightsApiHandler.AudienceInsightsScopeAndTypeGet x);
      HttpGet >=> routeBind<AdAccountsAudiencesSharedAccountsListPathParams> "/v5/ad_accounts/{ad_account_id}/audiences/shared/accounts"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.AdAccountsAudiencesSharedAccountsList x);
      HttpGet >=> routeBind<BusinessAccountAudiencesSharedAccountsListPathParams> "/v5/businesses/{business_id}/audiences/shared/accounts"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.BusinessAccountAudiencesSharedAccountsList x);
      HttpGet >=> routeBind<SharedAudiencesForBusinessListPathParams> "/v5/businesses/{business_id}/audiences"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.SharedAudiencesForBusinessList x);
      HttpPatch >=> routeBind<UpdateAdAccountToAdAccountSharedAudiencePathParams> "/v5/ad_accounts/{ad_account_id}/audiences/ad_accounts/shared"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.UpdateAdAccountToAdAccountSharedAudience x);
      HttpPatch >=> routeBind<UpdateAdAccountToBusinessSharedAudiencePathParams> "/v5/ad_accounts/{ad_account_id}/audiences/businesses/shared"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.UpdateAdAccountToBusinessSharedAudience x);
      HttpPatch >=> routeBind<UpdateBusinessToAdAccountSharedAudiencePathParams> "/v5/businesses/{business_id}/audiences/ad_accounts/shared"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.UpdateBusinessToAdAccountSharedAudience x);
      HttpPatch >=> routeBind<UpdateBusinessToBusinessSharedAudiencePathParams> "/v5/businesses/{business_id}/audiences/businesses/shared"  (fun x -> requiresAuthentication authFailure >=>  AudienceSharingApiHandler.UpdateBusinessToBusinessSharedAudience x);
      HttpPost >=> routeBind<AudiencesCreatePathParams> "/v5/ad_accounts/{ad_account_id}/audiences"  (fun x -> requiresAuthentication authFailure >=>  AudiencesApiHandler.AudiencesCreate x);
      HttpPost >=> routeBind<AudiencesCreateCustomPathParams> "/v5/ad_accounts/{ad_account_id}/audiences/custom"  (fun x -> requiresAuthentication authFailure >=>  AudiencesApiHandler.AudiencesCreateCustom x);
      HttpGet >=> routeBind<AudiencesGetPathParams> "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  AudiencesApiHandler.AudiencesGet x) x);
      HttpGet >=> routeBind<AudiencesListPathParams> "/v5/ad_accounts/{ad_account_id}/audiences"  (fun x -> requiresAuthentication authFailure >=>  AudiencesApiHandler.AudiencesList x);
      HttpPatch >=> routeBind<AudiencesUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/audiences/{audience_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  AudiencesApiHandler.AudiencesUpdate x) x);
      HttpPost >=> routeBind<AdsCreditRedeemPathParams> "/v5/ad_accounts/{ad_account_id}/ads_credit/redeem"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.AdsCreditRedeem x);
      HttpGet >=> routeBind<AdsCreditsDiscountsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ads_credit/discounts"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.AdsCreditsDiscountsGet x);
      HttpGet >=> routeBind<BillingProfilesGetPathParams> "/v5/ad_accounts/{ad_account_id}/billing_profiles"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.BillingProfilesGet x);
      HttpGet >=> routeBind<SsioAccountsGetPathParams> "/v5/ad_accounts/{ad_account_id}/ssio/accounts"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioAccountsGet x);
      HttpPost >=> routeBind<SsioInsertionOrderCreatePathParams> "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioInsertionOrderCreate x);
      HttpPatch >=> routeBind<SsioInsertionOrderEditPathParams> "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioInsertionOrderEdit x);
      HttpGet >=> routeBind<SsioInsertionOrdersStatusGetByAdAccountPathParams> "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/status"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioInsertionOrdersStatusGetByAdAccount x);
      HttpGet >=> routeBind<SsioInsertionOrdersStatusGetByPinOrderIdPathParams> "/v5/ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioInsertionOrdersStatusGetByPinOrderId x) x);
      HttpGet >=> routeBind<SsioOrderLinesGetByAdAccountPathParams> "/v5/ad_accounts/{ad_account_id}/ssio/order_lines"  (fun x -> requiresAuthentication authFailure >=>  BillingApiHandler.SsioOrderLinesGetByAdAccount x);
      HttpPost >=> routeBind<BoardSectionsCreatePathParams> "/v5/boards/{board_id}/sections"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsCreate x);
      HttpDelete >=> routeBind<BoardSectionsDeletePathParams> "/v5/boards/{board_id}/sections/{section_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsDelete x) x);
      HttpGet >=> routeBind<BoardSectionsListPathParams> "/v5/boards/{board_id}/sections"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsList x);
      HttpGet >=> routeBind<BoardSectionsListPinsPathParams> "/v5/boards/{board_id}/sections/{section_id}/pins"  (fun x -> (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsListPins x) x);
      HttpPatch >=> routeBind<BoardSectionsUpdatePathParams> "/v5/boards/{board_id}/sections/{section_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardSectionsUpdate x) x);
      HttpPost >=> route "/v5/boards" >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsCreate;
      HttpDelete >=> routeBind<BoardsDeletePathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsDelete x);
      HttpGet >=> routeBind<BoardsGetPathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsGet x);
      HttpGet >=> route "/v5/boards" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsList;
      HttpGet >=> routeBind<BoardsListPinsPathParams> "/v5/boards/{board_id}/pins"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsListPins x);
      HttpPatch >=> routeBind<BoardsUpdatePathParams> "/v5/boards/{board_id}"  (fun x -> requiresAuthentication authFailure >=>  BoardsApiHandler.BoardsUpdate x);
      HttpPost >=> routeBind<BulkDownloadCreatePathParams> "/v5/ad_accounts/{ad_account_id}/bulk/download"  (fun x -> requiresAuthentication authFailure >=>  BulkApiHandler.BulkDownloadCreate x);
      HttpGet >=> routeBind<BulkRequestGetPathParams> "/v5/ad_accounts/{ad_account_id}/bulk/{bulk_request_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BulkApiHandler.BulkRequestGet x) x);
      HttpPost >=> routeBind<BulkUpsertCreatePathParams> "/v5/ad_accounts/{ad_account_id}/bulk/upsert"  (fun x -> requiresAuthentication authFailure >=>  BulkApiHandler.BulkUpsertCreate x);
      HttpPost >=> routeBind<AssetGroupCreatePathParams> "/v5/businesses/{business_id}/asset_groups"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.AssetGroupCreate x);
      HttpDelete >=> routeBind<AssetGroupDeletePathParams> "/v5/businesses/{business_id}/asset_groups"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.AssetGroupDelete x);
      HttpPatch >=> routeBind<AssetGroupUpdatePathParams> "/v5/businesses/{business_id}/asset_groups"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.AssetGroupUpdate x);
      HttpGet >=> routeBind<BusinessAssetMembersGetPathParams> "/v5/businesses/{business_id}/assets/{asset_id}/members"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessAssetMembersGet x) x);
      HttpGet >=> routeBind<BusinessAssetPartnersGetPathParams> "/v5/businesses/{business_id}/assets/{asset_id}/partners"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessAssetPartnersGet x) x);
      HttpGet >=> routeBind<BusinessAssetsGetPathParams> "/v5/businesses/{business_id}/assets"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessAssetsGet x);
      HttpGet >=> routeBind<BusinessMemberAssetsGetPathParams> "/v5/businesses/{business_id}/members/{member_id}/assets"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessMemberAssetsGet x) x);
      HttpDelete >=> routeBind<BusinessMembersAssetAccessDeletePathParams> "/v5/businesses/{business_id}/members/assets/access"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessMembersAssetAccessDelete x);
      HttpPatch >=> routeBind<BusinessMembersAssetAccessUpdatePathParams> "/v5/businesses/{business_id}/members/assets/access"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessMembersAssetAccessUpdate x);
      HttpGet >=> routeBind<BusinessPartnerAssetAccessGetPathParams> "/v5/businesses/{business_id}/partners/{partner_id}/assets"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.BusinessPartnerAssetAccessGet x) x);
      HttpDelete >=> routeBind<DeletePartnerAssetAccessHandlerImplPathParams> "/v5/businesses/{business_id}/partners/assets"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.DeletePartnerAssetAccessHandlerImpl x);
      HttpPatch >=> routeBind<UpdatePartnerAssetAccessHandlerImplPathParams> "/v5/businesses/{business_id}/partners/assets"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessAssetsApiHandler.UpdatePartnerAssetAccessHandlerImpl x);
      HttpPost >=> routeBind<AssetAccessRequestsCreatePathParams> "/v5/businesses/{business_id}/requests/assets/access"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.AssetAccessRequestsCreate x);
      HttpDelete >=> routeBind<CancelInvitesOrRequestsPathParams> "/v5/businesses/{business_id}/invites"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.CancelInvitesOrRequests x);
      HttpPost >=> routeBind<CreateAssetInvitesPathParams> "/v5/businesses/{business_id}/invites/assets/access"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.CreateAssetInvites x);
      HttpPost >=> routeBind<CreateMembershipOrPartnershipInvitesPathParams> "/v5/businesses/{business_id}/invites"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.CreateMembershipOrPartnershipInvites x);
      HttpGet >=> routeBind<GetInvitesPathParams> "/v5/businesses/{business_id}/invites"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.GetInvites x);
      HttpPatch >=> route "/v5/businesses/invites" >=> requiresAuthentication authFailure >=>  BusinessAccessInviteApiHandler.RespondBusinessAccessInvites;
      HttpDelete >=> routeBind<DeleteBusinessMembershipPathParams> "/v5/businesses/{business_id}/members"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.DeleteBusinessMembership x);
      HttpDelete >=> routeBind<DeleteBusinessPartnersPathParams> "/v5/businesses/{business_id}/partners"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.DeleteBusinessPartners x);
      HttpGet >=> route "/v5/businesses/employers" >=> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.GetBusinessEmployers;
      HttpGet >=> routeBind<GetBusinessMembersPathParams> "/v5/businesses/{business_id}/members"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.GetBusinessMembers x);
      HttpGet >=> routeBind<GetBusinessPartnersPathParams> "/v5/businesses/{business_id}/partners"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.GetBusinessPartners x);
      HttpPatch >=> routeBind<UpdateBusinessMembershipsPathParams> "/v5/businesses/{business_id}/members"  (fun x -> requiresAuthentication authFailure >=>  BusinessAccessRelationshipsApiHandler.UpdateBusinessMemberships x);
      HttpGet >=> routeBind<CampaignTargetingAnalyticsGetPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"  (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignTargetingAnalyticsGet x);
      HttpGet >=> routeBind<CampaignsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns/analytics"  (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignsAnalytics x);
      HttpPost >=> routeBind<CampaignsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/campaigns"  (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignsCreate x);
      HttpGet >=> routeBind<CampaignsGetPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignsGet x) x);
      HttpGet >=> routeBind<CampaignsListPathParams> "/v5/ad_accounts/{ad_account_id}/campaigns"  (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignsList x);
      HttpPatch >=> routeBind<CampaignsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/campaigns"  (fun x -> requiresAuthentication authFailure >=>  CampaignsApiHandler.CampaignsUpdate x);
      HttpPost >=> route "/v5/catalogs" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsCreate;
      HttpGet >=> route "/v5/catalogs" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsList;
      HttpGet >=> routeBind<CatalogsProductGroupPinsListPathParams> "/v5/catalogs/product_groups/{product_group_id}/products"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupPinsList x);
      HttpPost >=> route "/v5/catalogs/product_groups" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsCreate;
      HttpPost >=> route "/v5/catalogs/product_groups/multiple" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsCreateMany;
      HttpDelete >=> routeBind<CatalogsProductGroupsDeletePathParams> "/v5/catalogs/product_groups/{product_group_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsDelete x);
      HttpDelete >=> route "/v5/catalogs/product_groups/multiple" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsDeleteMany;
      HttpGet >=> routeBind<CatalogsProductGroupsGetPathParams> "/v5/catalogs/product_groups/{product_group_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsGet x);
      HttpGet >=> route "/v5/catalogs/product_groups" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsList;
      HttpGet >=> routeBind<CatalogsProductGroupsProductCountsGetPathParams> "/v5/catalogs/product_groups/{product_group_id}/product_counts"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsProductCountsGet x);
      HttpPatch >=> routeBind<CatalogsProductGroupsUpdatePathParams> "/v5/catalogs/product_groups/{product_group_id}"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.CatalogsProductGroupsUpdate x);
      HttpGet >=> routeBind<FeedProcessingResultsListPathParams> "/v5/catalogs/feeds/{feed_id}/processing_results"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedProcessingResultsList x);
      HttpPost >=> route "/v5/catalogs/feeds" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsCreate;
      HttpDelete >=> routeBind<FeedsDeletePathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsDelete x);
      HttpGet >=> routeBind<FeedsGetPathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsGet x);
      HttpPost >=> routeBind<FeedsIngestPathParams> "/v5/catalogs/feeds/{feed_id}/ingest"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsIngest x);
      HttpGet >=> route "/v5/catalogs/feeds" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsList;
      HttpPatch >=> routeBind<FeedsUpdatePathParams> "/v5/catalogs/feeds/{feed_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.FeedsUpdate x);
      HttpGet >=> routeBind<ItemsBatchGetPathParams> "/v5/catalogs/items/batch/{batch_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsBatchGet x);
      HttpPost >=> route "/v5/catalogs/items/batch" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsBatchPost;
      HttpGet >=> route "/v5/catalogs/items" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsGet;
      HttpGet >=> routeBind<ItemsIssuesListPathParams> "/v5/catalogs/processing_results/{processing_result_id}/item_issues"  (fun x -> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsIssuesList x);
      HttpPost >=> route "/v5/catalogs/items" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ItemsPost;
      HttpPost >=> route "/v5/catalogs/products/get_by_product_group_filters" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ProductsByProductGroupFilterList;
      HttpPost >=> route "/v5/catalogs/reports" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ReportsCreate;
      HttpGet >=> route "/v5/catalogs/reports" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ReportsGet;
      HttpGet >=> route "/v5/catalogs/reports/stats" >=> requiresAuthentication authFailure >=>  CatalogsApiHandler.ReportsStats;
      HttpPost >=> routeBind<EventsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/events"  (fun x -> requiresAuthentication authFailure >=>  >=>  ConversionEventsApiHandler.EventsCreate x);
      HttpPost >=> routeBind<ConversionTagsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/conversion_tags"  (fun x -> requiresAuthentication authFailure >=>  ConversionTagsApiHandler.ConversionTagsCreate x);
      HttpGet >=> routeBind<ConversionTagsGetPathParams> "/v5/ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  ConversionTagsApiHandler.ConversionTagsGet x) x);
      HttpGet >=> routeBind<ConversionTagsListPathParams> "/v5/ad_accounts/{ad_account_id}/conversion_tags"  (fun x -> requiresAuthentication authFailure >=>  ConversionTagsApiHandler.ConversionTagsList x);
      HttpGet >=> routeBind<OcpmEligibleConversionTagsGetPathParams> "/v5/ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible"  (fun x -> requiresAuthentication authFailure >=>  ConversionTagsApiHandler.OcpmEligibleConversionTagsGet x);
      HttpGet >=> routeBind<PageVisitConversionTagsGetPathParams> "/v5/ad_accounts/{ad_account_id}/conversion_tags/page_visit"  (fun x -> requiresAuthentication authFailure >=>  ConversionTagsApiHandler.PageVisitConversionTagsGet x);
      HttpPost >=> routeBind<CustomerListsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/customer_lists"  (fun x -> requiresAuthentication authFailure >=>  CustomerListsApiHandler.CustomerListsCreate x);
      HttpGet >=> routeBind<CustomerListsGetPathParams> "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  CustomerListsApiHandler.CustomerListsGet x) x);
      HttpGet >=> routeBind<CustomerListsListPathParams> "/v5/ad_accounts/{ad_account_id}/customer_lists"  (fun x -> requiresAuthentication authFailure >=>  CustomerListsApiHandler.CustomerListsList x);
      HttpPatch >=> routeBind<CustomerListsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  CustomerListsApiHandler.CustomerListsUpdate x) x);
      HttpDelete >=> routeBind<IntegrationsCommerceDelPathParams> "/v5/integrations/commerce/{external_business_id}"  (fun x -> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsCommerceDel x);
      HttpGet >=> routeBind<IntegrationsCommerceGetPathParams> "/v5/integrations/commerce/{external_business_id}"  (fun x -> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsCommerceGet x);
      HttpPatch >=> routeBind<IntegrationsCommercePatchPathParams> "/v5/integrations/commerce/{external_business_id}"  (fun x -> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsCommercePatch x);
      HttpPost >=> route "/v5/integrations/commerce" >=> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsCommercePost;
      HttpGet >=> routeBind<IntegrationsGetByIdPathParams> "/v5/integrations/{id}"  (fun x -> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsGetById x);
      HttpGet >=> route "/v5/integrations" >=> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsGetList;
      HttpPost >=> route "/v5/integrations/logs" >=> requiresAuthentication authFailure >=>  IntegrationsApiHandler.IntegrationsLogsPost;
      HttpGet >=> routeBind<CountryKeywordsMetricsGetPathParams> "/v5/ad_accounts/{ad_account_id}/keywords/metrics"  (fun x -> requiresAuthentication authFailure >=>  KeywordsApiHandler.CountryKeywordsMetricsGet x);
      HttpPost >=> routeBind<KeywordsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/keywords"  (fun x -> requiresAuthentication authFailure >=>  KeywordsApiHandler.KeywordsCreate x);
      HttpGet >=> routeBind<KeywordsGetPathParams> "/v5/ad_accounts/{ad_account_id}/keywords"  (fun x -> requiresAuthentication authFailure >=>  KeywordsApiHandler.KeywordsGet x);
      HttpPatch >=> routeBind<KeywordsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/keywords"  (fun x -> requiresAuthentication authFailure >=>  KeywordsApiHandler.KeywordsUpdate x);
      HttpGet >=> routeBind<TrendingKeywordsListPathParams> "/v5/trends/keywords/{region}/top/{trend_type}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  KeywordsApiHandler.TrendingKeywordsList x) x);
      HttpDelete >=> routeBind<AdAccountsSubscriptionsDelByIdPathParams> "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  LeadAdsApiHandler.AdAccountsSubscriptionsDelById x) x);
      HttpGet >=> routeBind<AdAccountsSubscriptionsGetByIdPathParams> "/v5/ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  LeadAdsApiHandler.AdAccountsSubscriptionsGetById x) x);
      HttpGet >=> routeBind<AdAccountsSubscriptionsGetListPathParams> "/v5/ad_accounts/{ad_account_id}/leads/subscriptions"  (fun x -> requiresAuthentication authFailure >=>  LeadAdsApiHandler.AdAccountsSubscriptionsGetList x);
      HttpPost >=> routeBind<AdAccountsSubscriptionsPostPathParams> "/v5/ad_accounts/{ad_account_id}/leads/subscriptions"  (fun x -> requiresAuthentication authFailure >=>  LeadAdsApiHandler.AdAccountsSubscriptionsPost x);
      HttpGet >=> routeBind<LeadFormGetPathParams> "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  LeadFormsApiHandler.LeadFormGet x) x);
      HttpPost >=> routeBind<LeadFormTestCreatePathParams> "/v5/ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  LeadFormsApiHandler.LeadFormTestCreate x) x);
      HttpPost >=> routeBind<LeadFormsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/lead_forms"  (fun x -> requiresAuthentication authFailure >=>  LeadFormsApiHandler.LeadFormsCreate x);
      HttpGet >=> routeBind<LeadFormsListPathParams> "/v5/ad_accounts/{ad_account_id}/lead_forms"  (fun x -> requiresAuthentication authFailure >=>  LeadFormsApiHandler.LeadFormsList x);
      HttpPatch >=> routeBind<LeadFormsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/lead_forms"  (fun x -> requiresAuthentication authFailure >=>  LeadFormsApiHandler.LeadFormsUpdate x);
      HttpPost >=> routeBind<LeadsExportCreatePathParams> "/v5/ad_accounts/{ad_account_id}/leads_export"  (fun x -> requiresAuthentication authFailure >=>  LeadsExportApiHandler.LeadsExportCreate x);
      HttpGet >=> routeBind<LeadsExportGetPathParams> "/v5/ad_accounts/{ad_account_id}/leads_export/{leads_export_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  LeadsExportApiHandler.LeadsExportGet x) x);
      HttpPost >=> route "/v5/media" >=> requiresAuthentication authFailure >=>  MediaApiHandler.MediaCreate;
      HttpGet >=> routeBind<MediaGetPathParams> "/v5/media/{media_id}"  (fun x -> requiresAuthentication authFailure >=>  MediaApiHandler.MediaGet x);
      HttpGet >=> route "/v5/media" >=> requiresAuthentication authFailure >=>  MediaApiHandler.MediaList;
      HttpPost >=> route "/v5/oauth/token" >=>  >=>  OauthApiHandler.OauthToken;
      HttpGet >=> routeBind<OrderLinesGetPathParams> "/v5/ad_accounts/{ad_account_id}/order_lines/{order_line_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  OrderLinesApiHandler.OrderLinesGet x) x);
      HttpGet >=> routeBind<OrderLinesListPathParams> "/v5/ad_accounts/{ad_account_id}/order_lines"  (fun x -> requiresAuthentication authFailure >=>  OrderLinesApiHandler.OrderLinesList x);
      HttpGet >=> route "/v5/pins/analytics" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  PinsApiHandler.MultiPinsAnalytics;
      HttpGet >=> routeBind<PinsAnalyticsPathParams> "/v5/pins/{pin_id}/analytics"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  PinsApiHandler.PinsAnalytics x);
      HttpPost >=> route "/v5/pins" >=> requiresAuthentication authFailure >=>  PinsApiHandler.PinsCreate;
      HttpDelete >=> routeBind<PinsDeletePathParams> "/v5/pins/{pin_id}"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsDelete x);
      HttpGet >=> routeBind<PinsGetPathParams> "/v5/pins/{pin_id}"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  PinsApiHandler.PinsGet x);
      HttpGet >=> route "/v5/pins" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  PinsApiHandler.PinsList;
      HttpPost >=> routeBind<PinsSavePathParams> "/v5/pins/{pin_id}/save"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsSave x);
      HttpPatch >=> routeBind<PinsUpdatePathParams> "/v5/pins/{pin_id}"  (fun x -> requiresAuthentication authFailure >=>  PinsApiHandler.PinsUpdate x);
      HttpPost >=> routeBind<ProductGroupPromotionsCreatePathParams> "/v5/ad_accounts/{ad_account_id}/product_group_promotions"  (fun x -> requiresAuthentication authFailure >=>  ProductGroupPromotionsApiHandler.ProductGroupPromotionsCreate x);
      HttpGet >=> routeBind<ProductGroupPromotionsGetPathParams> "/v5/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"  (fun x -> (fun x -> requiresAuthentication authFailure >=>  ProductGroupPromotionsApiHandler.ProductGroupPromotionsGet x) x);
      HttpGet >=> routeBind<ProductGroupPromotionsListPathParams> "/v5/ad_accounts/{ad_account_id}/product_group_promotions"  (fun x -> requiresAuthentication authFailure >=>  ProductGroupPromotionsApiHandler.ProductGroupPromotionsList x);
      HttpPatch >=> routeBind<ProductGroupPromotionsUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/product_group_promotions"  (fun x -> requiresAuthentication authFailure >=>  ProductGroupPromotionsApiHandler.ProductGroupPromotionsUpdate x);
      HttpGet >=> routeBind<ProductGroupsAnalyticsPathParams> "/v5/ad_accounts/{ad_account_id}/product_groups/analytics"  (fun x -> requiresAuthentication authFailure >=>  ProductGroupPromotionsApiHandler.ProductGroupsAnalytics x);
      HttpGet >=> route "/v5/resources/ad_account_countries" >=> requiresAuthentication authFailure >=>  ResourcesApiHandler.AdAccountCountriesGet;
      HttpGet >=> route "/v5/resources/delivery_metrics" >=> requiresAuthentication authFailure >=>  ResourcesApiHandler.DeliveryMetricsGet;
      HttpGet >=> routeBind<InterestTargetingOptionsGetPathParams> "/v5/resources/targeting/interests/{interest_id}"  (fun x -> requiresAuthentication authFailure >=>  ResourcesApiHandler.InterestTargetingOptionsGet x);
      HttpGet >=> route "/v5/resources/lead_form_questions" >=> requiresAuthentication authFailure >=>  ResourcesApiHandler.LeadFormQuestionsGet;
      HttpGet >=> route "/v5/resources/metrics_ready_state" >=> requiresAuthentication authFailure >=>  ResourcesApiHandler.MetricsReadyStateGet;
      HttpGet >=> routeBind<TargetingOptionsGetPathParams> "/v5/resources/targeting/{targeting_type}"  (fun x -> requiresAuthentication authFailure >=>  ResourcesApiHandler.TargetingOptionsGet x);
      HttpGet >=> route "/v5/search/partner/pins" >=> requiresAuthentication authFailure >=>  SearchApiHandler.SearchPartnerPins;
      HttpGet >=> route "/v5/search/boards" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  SearchApiHandler.SearchUserBoardsGet;
      HttpGet >=> route "/v5/search/pins" >=> requiresAuthentication authFailure >=>  SearchApiHandler.SearchUserPinsList;
      HttpPost >=> routeBind<TargetingTemplateCreatePathParams> "/v5/ad_accounts/{ad_account_id}/targeting_templates"  (fun x -> requiresAuthentication authFailure >=>  TargetingTemplateApiHandler.TargetingTemplateCreate x);
      HttpGet >=> routeBind<TargetingTemplateListPathParams> "/v5/ad_accounts/{ad_account_id}/targeting_templates"  (fun x -> requiresAuthentication authFailure >=>  TargetingTemplateApiHandler.TargetingTemplateList x);
      HttpPatch >=> routeBind<TargetingTemplateUpdatePathParams> "/v5/ad_accounts/{ad_account_id}/targeting_templates"  (fun x -> requiresAuthentication authFailure >=>  TargetingTemplateApiHandler.TargetingTemplateUpdate x);
      HttpGet >=> route "/v5/terms/related" >=> requiresAuthentication authFailure >=>  TermsApiHandler.TermsRelatedList;
      HttpGet >=> route "/v5/terms/suggested" >=> requiresAuthentication authFailure >=>  TermsApiHandler.TermsSuggestedList;
      HttpGet >=> routeBind<TermsOfServiceGetPathParams> "/v5/ad_accounts/{ad_account_id}/terms_of_service"  (fun x -> requiresAuthentication authFailure >=>  TermsOfServiceApiHandler.TermsOfServiceGet x);
      HttpGet >=> route "/v5/user_account/following/boards" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.BoardsUserFollowsList;
      HttpPost >=> routeBind<FollowUserUpdatePathParams> "/v5/user_account/following/{username}"  (fun x -> requiresAuthentication authFailure >=>  UserAccountApiHandler.FollowUserUpdate x);
      HttpGet >=> route "/v5/user_account/followers" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.FollowersList;
      HttpGet >=> route "/v5/user_account/businesses" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.LinkedBusinessAccountsGet;
      HttpDelete >=> route "/v5/user_account/websites" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UnverifyWebsiteDelete;
      HttpGet >=> route "/v5/user_account/analytics" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountAnalytics;
      HttpGet >=> route "/v5/user_account/analytics/top_pins" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountAnalyticsTopPins;
      HttpGet >=> route "/v5/user_account/analytics/top_video_pins" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountAnalyticsTopVideoPins;
      HttpGet >=> routeBind<UserAccountFollowedInterestsPathParams> "/v5/users/{username}/interests/follow"  (fun x -> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountFollowedInterests x);
      HttpGet >=> route "/v5/user_account" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserAccountGet;
      HttpGet >=> route "/v5/user_account/following" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserFollowingGet;
      HttpGet >=> route "/v5/user_account/websites" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.UserWebsitesGet;
      HttpPost >=> route "/v5/user_account/websites" >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.VerifyWebsiteUpdate;
      HttpGet >=> route "/v5/user_account/websites/verification" >=> requiresAuthentication authFailure >=> requiresAuthentication authFailure >=>  UserAccountApiHandler.WebsiteVerificationGet;
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0