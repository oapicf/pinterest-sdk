package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A Seq[AdAccountAnalyticsResponseInner]
        */
        def AdAccounts_adAccount/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[AdAccountAnalyticsResponseInner]] = Left(TODO)

        /**
        * 
        * @return A MetricsResponse
        */
        def AdAccounts_adAccountTargetingAnalytics/get(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): Either[CommonError,MetricsResponse] = Left(TODO)

        /**
        * 
        * @return A AdAccount
        */
        def AdAccounts_adAccounts/create(adAccountCreateRequest: AdAccountCreateRequest): Either[CommonError,AdAccount] = Left(TODO)

        /**
        * 
        * @return A AdAccount
        */
        def AdAccounts_adAccounts/get(adAccountId: String): Either[CommonError,AdAccount] = Left(TODO)

        /**
        * 
        * @return A AdAccountsList200Response
        */
        def AdAccounts_adAccounts/list(bookmark: Option[String], pageSize: Option[Int], includeSharedAccounts: Option[Boolean]): Either[CommonError,AdAccountsList200Response] = Left(TODO)

        /**
        * 
        * @return A CreateMMMReportResponse
        */
        def AdAccounts_analytics/createMmmReport(adAccountId: String, createMMMReportRequest: CreateMMMReportRequest): Either[CommonError,CreateMMMReportResponse] = Left(TODO)

        /**
        * 
        * @return A AdsAnalyticsCreateAsyncResponse
        */
        def AdAccounts_analytics/createReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): Either[CommonError,AdsAnalyticsCreateAsyncResponse] = Left(TODO)

        /**
        * 
        * @return A AdsAnalyticsCreateAsyncResponse
        */
        def AdAccounts_analytics/createTemplateReport(adAccountId: String, templateId: String, startDate: Option[LocalDateTime], endDate: Option[LocalDateTime], granularity: Option[Granularity]): Either[CommonError,AdsAnalyticsCreateAsyncResponse] = Left(TODO)

        /**
        * 
        * @return A GetMMMReportResponse
        */
        def AdAccounts_analytics/getMmmReport(adAccountId: String, token: String): Either[CommonError,GetMMMReportResponse] = Left(TODO)

        /**
        * 
        * @return A AdsAnalyticsGetAsyncResponse
        */
        def AdAccounts_analytics/getReport(adAccountId: String, token: String): Either[CommonError,AdsAnalyticsGetAsyncResponse] = Left(TODO)

        /**
        * 
        * @return A String
        */
        def AdAccounts_sandbox/delete(adAccountId: String): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A TemplatesList200Response
        */
        def AdAccounts_templates/list(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,TemplatesList200Response] = Left(TODO)

        /**
        * 
        * @return A Seq[AdGroupsAnalyticsResponseInner]
        */
        def AdGroups_adGroups/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[AdGroupsAnalyticsResponseInner]] = Left(TODO)

        /**
        * 
        * @return A AdGroupAudienceSizingResponse
        */
        def AdGroups_adGroups/audienceSizing(adAccountId: String, adGroupAudienceSizingRequest: AdGroupAudienceSizingRequest): Either[CommonError,AdGroupAudienceSizingResponse] = Left(TODO)

        /**
        * 
        * @return A AdGroupArrayResponse
        */
        def AdGroups_adGroups/create(adAccountId: String, adGroupCreateRequest: Seq[AdGroupCreateRequest]): Either[CommonError,AdGroupArrayResponse] = Left(TODO)

        /**
        * 
        * @return A AdGroupResponse
        */
        def AdGroups_adGroups/get(adAccountId: String, adGroupId: String): Either[CommonError,AdGroupResponse] = Left(TODO)

        /**
        * 
        * @return A AdGroupsList200Response
        */
        def AdGroups_adGroups/list(adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]): Either[CommonError,AdGroupsList200Response] = Left(TODO)

        /**
        * 
        * @return A AdGroupArrayResponse
        */
        def AdGroups_adGroups/update(adAccountId: String, adGroupUpdateRequest: Seq[AdGroupUpdateRequest]): Either[CommonError,AdGroupArrayResponse] = Left(TODO)

        /**
        * 
        * @return A BidFloor
        */
        def AdGroups_adGroupsBidFloor/get(adAccountId: String, bidFloorRequest: BidFloorRequest): Either[CommonError,BidFloor] = Left(TODO)

        /**
        * 
        * @return A MetricsResponse
        */
        def AdGroups_adGroupsTargetingAnalytics/get(adAccountId: String, adGroupIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): Either[CommonError,MetricsResponse] = Left(TODO)

        /**
        * 
        * @return A AdPreviewURLResponse
        */
        def Ads_adPreviews/create(adAccountId: String, adPreviewRequest: AdPreviewRequest): Either[CommonError,AdPreviewURLResponse] = Left(TODO)

        /**
        * 
        * @return A MetricsResponse
        */
        def Ads_adTargetingAnalytics/get(adAccountId: String, adIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsAdTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): Either[CommonError,MetricsResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[AdsAnalyticsResponseInner]
        */
        def Ads_ads/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, columns: Seq[String], granularity: Granularity, adIds: Seq[String], clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], pinIds: Seq[String], campaignIds: Seq[String]): Either[CommonError,Seq[AdsAnalyticsResponseInner]] = Left(TODO)

        /**
        * 
        * @return A AdArrayResponse
        */
        def Ads_ads/create(adAccountId: String, adCreateRequest: Seq[AdCreateRequest]): Either[CommonError,AdArrayResponse] = Left(TODO)

        /**
        * 
        * @return A AdResponse
        */
        def Ads_ads/get(adAccountId: String, adId: String): Either[CommonError,AdResponse] = Left(TODO)

        /**
        * 
        * @return A AdsList200Response
        */
        def Ads_ads/list(adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], adIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,AdsList200Response] = Left(TODO)

        /**
        * 
        * @return A AdArrayResponse
        */
        def Ads_ads/update(adAccountId: String, adUpdateRequest: Seq[AdUpdateRequest]): Either[CommonError,AdArrayResponse] = Left(TODO)

        /**
        * 
        * @return A AdvancedAuctionItems
        */
        def AdvancedAuction_advancedAuctionItemsGet/post(advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, adAccountId: Option[String]): Either[CommonError,AdvancedAuctionItems] = Left(TODO)

        /**
        * 
        * @return A AdvancedAuctionProcessedItems
        */
        def AdvancedAuction_advancedAuctionItemsSubmit/post(advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, adAccountId: Option[String]): Either[CommonError,AdvancedAuctionProcessedItems] = Left(TODO)

        /**
        * 
        * @return A AudienceInsightsResponse
        */
        def AudienceInsights_audienceInsights/get(adAccountId: String, audienceInsightType: AudienceInsightType): Either[CommonError,AudienceInsightsResponse] = Left(TODO)

        /**
        * 
        * @return A AudienceDefinitionResponse
        */
        def AudienceInsights_audienceInsightsScopeAndType/get(adAccountId: String): Either[CommonError,AudienceDefinitionResponse] = Left(TODO)

        /**
        * 
        * @return A AdAccountsAudiencesSharedAccountsList200Response
        */
        def AudienceSharing_adAccountsAudiencesSharedAccounts/list(adAccountId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,AdAccountsAudiencesSharedAccountsList200Response] = Left(TODO)

        /**
        * 
        * @return A AdAccountsAudiencesSharedAccountsList200Response
        */
        def AudienceSharing_businessAccountAudiencesSharedAccounts/list(businessId: String, audienceId: String, accountType: AudienceAccountType, pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,AdAccountsAudiencesSharedAccountsList200Response] = Left(TODO)

        /**
        * 
        * @return A AudiencesList200Response
        */
        def AudienceSharing_sharedAudiencesForBusiness/list(businessId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int]): Either[CommonError,AudiencesList200Response] = Left(TODO)

        /**
        * 
        * @return A SharedAudienceResponse
        */
        def AudienceSharing_updateAdAccountToAdAccountSharedAudience(adAccountId: String, sharedAudience: SharedAudience): Either[CommonError,SharedAudienceResponse] = Left(TODO)

        /**
        * 
        * @return A BusinessSharedAudienceResponse
        */
        def AudienceSharing_updateAdAccountToBusinessSharedAudience(adAccountId: String, businessSharedAudience: BusinessSharedAudience): Either[CommonError,BusinessSharedAudienceResponse] = Left(TODO)

        /**
        * 
        * @return A SharedAudienceResponse
        */
        def AudienceSharing_updateBusinessToAdAccountSharedAudience(businessId: String, sharedAudience: SharedAudience): Either[CommonError,SharedAudienceResponse] = Left(TODO)

        /**
        * 
        * @return A BusinessSharedAudienceResponse
        */
        def AudienceSharing_updateBusinessToBusinessSharedAudience(businessId: String, businessSharedAudience: BusinessSharedAudience): Either[CommonError,BusinessSharedAudienceResponse] = Left(TODO)

        /**
        * 
        * @return A Audience
        */
        def Audiences_audiences/create(adAccountId: String, audienceCreateRequest: AudienceCreateRequest): Either[CommonError,Audience] = Left(TODO)

        /**
        * 
        * @return A Audience
        */
        def Audiences_audiences/createCustom(adAccountId: String, audienceCreateCustomRequest: AudienceCreateCustomRequest): Either[CommonError,Audience] = Left(TODO)

        /**
        * 
        * @return A Audience
        */
        def Audiences_audiences/get(adAccountId: String, audienceId: String): Either[CommonError,Audience] = Left(TODO)

        /**
        * 
        * @return A AudiencesList200Response
        */
        def Audiences_audiences/list(adAccountId: String, bookmark: Option[String], order: Option[String], pageSize: Option[Int], ownershipType: Option[String]): Either[CommonError,AudiencesList200Response] = Left(TODO)

        /**
        * 
        * @return A Audience
        */
        def Audiences_audiences/update(adAccountId: String, audienceId: String, audienceUpdateRequest: AudienceUpdateRequest): Either[CommonError,Audience] = Left(TODO)

        /**
        * 
        * @return A AdsCreditRedeemResponse
        */
        def Billing_adsCredit/redeem(adAccountId: String, adsCreditRedeemRequest: AdsCreditRedeemRequest): Either[CommonError,AdsCreditRedeemResponse] = Left(TODO)

        /**
        * 
        * @return A AdsCreditsDiscountsGet200Response
        */
        def Billing_adsCreditsDiscounts/get(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,AdsCreditsDiscountsGet200Response] = Left(TODO)

        /**
        * 
        * @return A BillingProfilesGet200Response
        */
        def Billing_billingProfiles/get(adAccountId: String, isActive: Boolean, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BillingProfilesGet200Response] = Left(TODO)

        /**
        * 
        * @return A SSIOAccountResponse
        */
        def Billing_ssioAccounts/get(adAccountId: String): Either[CommonError,SSIOAccountResponse] = Left(TODO)

        /**
        * 
        * @return A SSIOCreateInsertionOrderResponse
        */
        def Billing_ssioInsertionOrder/create(adAccountId: String, sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest): Either[CommonError,SSIOCreateInsertionOrderResponse] = Left(TODO)

        /**
        * 
        * @return A SSIOEditInsertionOrderResponse
        */
        def Billing_ssioInsertionOrder/edit(adAccountId: String, sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest): Either[CommonError,SSIOEditInsertionOrderResponse] = Left(TODO)

        /**
        * 
        * @return A SsioInsertionOrdersStatusGetByAdAccount200Response
        */
        def Billing_ssioInsertionOrdersStatus/getByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,SsioInsertionOrdersStatusGetByAdAccount200Response] = Left(TODO)

        /**
        * 
        * @return A SSIOInsertionOrderStatusResponse
        */
        def Billing_ssioInsertionOrdersStatus/getByPinOrderId(adAccountId: String, pinOrderId: String): Either[CommonError,SSIOInsertionOrderStatusResponse] = Left(TODO)

        /**
        * 
        * @return A SsioOrderLinesGetByAdAccount200Response
        */
        def Billing_ssioOrderLines/getByAdAccount(adAccountId: String, bookmark: Option[String], pageSize: Option[Int], pinOrderId: Option[String]): Either[CommonError,SsioOrderLinesGetByAdAccount200Response] = Left(TODO)

        /**
        * 
        * @return A BoardSection
        */
        def Boards_boardSections/create(boardId: String, boardSection: BoardSection, adAccountId: Option[String]): Either[CommonError,BoardSection] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Boards_boardSections/delete(boardId: String, sectionId: String, adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A BoardSectionsList200Response
        */
        def Boards_boardSections/list(boardId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BoardSectionsList200Response] = Left(TODO)

        /**
        * 
        * @return A BoardsListPins200Response
        */
        def Boards_boardSections/listPins(boardId: String, sectionId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BoardsListPins200Response] = Left(TODO)

        /**
        * 
        * @return A BoardSection
        */
        def Boards_boardSections/update(boardId: String, sectionId: String, boardSection: BoardSection, adAccountId: Option[String]): Either[CommonError,BoardSection] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/create(board: Board, adAccountId: Option[String]): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Boards_boards/delete(boardId: String, adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/get(boardId: String, adAccountId: Option[String]): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A BoardsList200Response
        */
        def Boards_boards/list(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): Either[CommonError,BoardsList200Response] = Left(TODO)

        /**
        * 
        * @return A BoardsListPins200Response
        */
        def Boards_boards/listPins(boardId: String, bookmark: Option[String], pageSize: Option[Int], creativeTypes: Seq[String], adAccountId: Option[String], pinMetrics: Option[Boolean]): Either[CommonError,BoardsListPins200Response] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/update(boardId: String, boardUpdate: BoardUpdate, adAccountId: Option[String]): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A BulkDownloadResponse
        */
        def Bulk_bulkDownload/create(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest): Either[CommonError,BulkDownloadResponse] = Left(TODO)

        /**
        * 
        * @return A BulkUpsertStatusResponse
        */
        def Bulk_bulkRequest/get(adAccountId: String, bulkRequestId: String, includeDetails: Option[Boolean]): Either[CommonError,BulkUpsertStatusResponse] = Left(TODO)

        /**
        * 
        * @return A BulkUpsertResponse
        */
        def Bulk_bulkUpsert/create(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest): Either[CommonError,BulkUpsertResponse] = Left(TODO)

        /**
        * 
        * @return A CreateAssetGroupResponse
        */
        def BusinessAccessAssets_assetGroup/create(businessId: String, createAssetGroupBody: CreateAssetGroupBody): Either[CommonError,CreateAssetGroupResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteAssetGroupResponse
        */
        def BusinessAccessAssets_assetGroup/delete(businessId: String, deleteAssetGroupBody: DeleteAssetGroupBody): Either[CommonError,DeleteAssetGroupResponse] = Left(TODO)

        /**
        * 
        * @return A UpdateAssetGroupResponse
        */
        def BusinessAccessAssets_assetGroup/update(businessId: String, updateAssetGroupBody: UpdateAssetGroupBody): Either[CommonError,UpdateAssetGroupResponse] = Left(TODO)

        /**
        * 
        * @return A BusinessAssetMembersGet200Response
        */
        def BusinessAccessAssets_businessAssetMembers/get(businessId: String, assetId: String, bookmark: Option[String], pageSize: Option[Int], startIndex: Option[Int]): Either[CommonError,BusinessAssetMembersGet200Response] = Left(TODO)

        /**
        * 
        * @return A BusinessAssetPartnersGet200Response
        */
        def BusinessAccessAssets_businessAssetPartners/get(businessId: String, assetId: String, startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BusinessAssetPartnersGet200Response] = Left(TODO)

        /**
        * 
        * @return A BusinessAssetsGet200Response
        */
        def BusinessAccessAssets_businessAssets/get(businessId: String, permissions: Seq[PermissionsWithOwner], childAssetId: Option[String], assetGroupId: Option[String], assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BusinessAssetsGet200Response] = Left(TODO)

        /**
        * 
        * @return A BusinessMemberAssetsGet200Response
        */
        def BusinessAccessAssets_businessMemberAssets/get(businessId: String, memberId: String, assetType: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,BusinessMemberAssetsGet200Response] = Left(TODO)

        /**
        * 
        * @return A DeleteMemberAccessResultsResponseArray
        */
        def BusinessAccessAssets_businessMembersAssetAccess/delete(businessId: String, businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest): Either[CommonError,DeleteMemberAccessResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A UpdateMemberAssetsResultsResponseArray
        */
        def BusinessAccessAssets_businessMembersAssetAccess/update(businessId: String, updateMemberAssetAccessBody: UpdateMemberAssetAccessBody): Either[CommonError,UpdateMemberAssetsResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A BusinessPartnerAssetAccessGet200Response
        */
        def BusinessAccessAssets_businessPartnerAssetAccess/get(businessId: String, partnerId: String, partnerType: Option[PartnerType], assetType: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,BusinessPartnerAssetAccessGet200Response] = Left(TODO)

        /**
        * 
        * @return A DeletePartnerAssetsResultsResponseArray
        */
        def BusinessAccessAssets_deletePartnerAssetAccessHandlerImpl(businessId: String, deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody): Either[CommonError,DeletePartnerAssetsResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A UpdatePartnerAssetsResultsResponseArray
        */
        def BusinessAccessAssets_updatePartnerAssetAccessHandlerImpl(businessId: String, updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody): Either[CommonError,UpdatePartnerAssetsResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A CreateAssetAccessRequestResponse
        */
        def BusinessAccessInvite_assetAccessRequests/create(businessId: String, createAssetAccessRequestBody: CreateAssetAccessRequestBody): Either[CommonError,CreateAssetAccessRequestResponse] = Left(TODO)

        /**
        * 
        * @return A DeleteInvitesResultsResponseArray
        */
        def BusinessAccessInvite_cancelInvitesOrRequests(businessId: String, cancelInvitesBody: CancelInvitesBody): Either[CommonError,DeleteInvitesResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A UpdateInvitesResultsResponseArray
        */
        def BusinessAccessInvite_createAssetInvites(businessId: String, createAssetInvitesRequest: CreateAssetInvitesRequest): Either[CommonError,UpdateInvitesResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A CreateInvitesResultsResponseArray
        */
        def BusinessAccessInvite_createMembershipOrPartnershipInvites(businessId: String, createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody): Either[CommonError,CreateInvitesResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A GetInvites200Response
        */
        def BusinessAccessInvite_get/invites(businessId: String, isMember: Option[Boolean], inviteStatus: Seq[String], inviteType: Option[InviteType], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,GetInvites200Response] = Left(TODO)

        /**
        * 
        * @return A RespondToInvitesResponseArray
        */
        def BusinessAccessInvite_respondBusinessAccessInvites(authRespondInvitesBody: AuthRespondInvitesBody): Either[CommonError,RespondToInvitesResponseArray] = Left(TODO)

        /**
        * 
        * @return A DeletedMembersResponse
        */
        def BusinessAccessRelationships_deleteBusinessMembership(businessId: String, membersToDeleteBody: MembersToDeleteBody): Either[CommonError,DeletedMembersResponse] = Left(TODO)

        /**
        * 
        * @return A DeletePartnersResponse
        */
        def BusinessAccessRelationships_deleteBusinessPartners(businessId: String, deletePartnersRequest: DeletePartnersRequest): Either[CommonError,DeletePartnersResponse] = Left(TODO)

        /**
        * 
        * @return A GetBusinessEmployers200Response
        */
        def BusinessAccessRelationships_get/businessEmployers(pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,GetBusinessEmployers200Response] = Left(TODO)

        /**
        * 
        * @return A GetBusinessMembers200Response
        */
        def BusinessAccessRelationships_get/businessMembers(businessId: String, assetsSummary: Option[Boolean], businessRoles: Seq[MemberBusinessRole], memberIds: Option[String], startIndex: Option[Int], bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,GetBusinessMembers200Response] = Left(TODO)

        /**
        * 
        * @return A GetBusinessPartners200Response
        */
        def BusinessAccessRelationships_get/businessPartners(businessId: String, assetsSummary: Option[Boolean], partnerType: Option[PartnerType], partnerIds: Option[String], startIndex: Option[Int], pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,GetBusinessPartners200Response] = Left(TODO)

        /**
        * 
        * @return A UpdateMemberResultsResponseArray
        */
        def BusinessAccessRelationships_update/businessMemberships(businessId: String, updateMemberBusinessRoleBody: Seq[UpdateMemberBusinessRoleBody]): Either[CommonError,UpdateMemberResultsResponseArray] = Left(TODO)

        /**
        * 
        * @return A MetricsResponse
        */
        def Campaigns_campaignTargetingAnalytics/get(adAccountId: String, campaignIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, targetingTypes: Seq[AdsAnalyticsCampaignTargetingType], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String], attributionTypes: Option[ConversionReportAttributionType]): Either[CommonError,MetricsResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[CampaignsAnalyticsResponseInner]
        */
        def Campaigns_campaigns/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, campaignIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[CampaignsAnalyticsResponseInner]] = Left(TODO)

        /**
        * 
        * @return A CampaignCreateResponse
        */
        def Campaigns_campaigns/create(adAccountId: String, campaignCreateRequest: Seq[CampaignCreateRequest]): Either[CommonError,CampaignCreateResponse] = Left(TODO)

        /**
        * 
        * @return A CampaignResponse
        */
        def Campaigns_campaigns/get(adAccountId: String, campaignId: String): Either[CommonError,CampaignResponse] = Left(TODO)

        /**
        * 
        * @return A CampaignsList200Response
        */
        def Campaigns_campaigns/list(adAccountId: String, campaignIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,CampaignsList200Response] = Left(TODO)

        /**
        * 
        * @return A CampaignUpdateResponse
        */
        def Campaigns_campaigns/update(adAccountId: String, campaignUpdateRequest: Seq[CampaignUpdateRequest]): Either[CommonError,CampaignUpdateResponse] = Left(TODO)

        /**
        * 
        * @return A Catalog
        */
        def Catalogs_catalogs/create(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: Option[String]): Either[CommonError,Catalog] = Left(TODO)

        /**
        * 
        * @return A CatalogsList200Response
        */
        def Catalogs_catalogs/list(bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): Either[CommonError,CatalogsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsProductGroupPinsList200Response
        */
        def Catalogs_catalogsProductGroupPins/list(productGroupId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): Either[CommonError,CatalogsProductGroupPinsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsVerticalProductGroup
        */
        def Catalogs_catalogsProductGroups/create(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: Option[String]): Either[CommonError,CatalogsVerticalProductGroup] = Left(TODO)

        /**
        * 
        * @return A Seq[String]
        */
        def Catalogs_catalogsProductGroups/createMany(multipleProductGroupsInner: Seq[MultipleProductGroupsInner], adAccountId: Option[String]): Either[CommonError,Seq[String]] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Catalogs_catalogsProductGroups/delete(productGroupId: String, adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Catalogs_catalogsProductGroups/deleteMany(id: Seq[Int], adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A CatalogsVerticalProductGroup
        */
        def Catalogs_catalogsProductGroups/get(productGroupId: String, adAccountId: Option[String]): Either[CommonError,CatalogsVerticalProductGroup] = Left(TODO)

        /**
        * 
        * @return A CatalogsProductGroupsList200Response
        */
        def Catalogs_catalogsProductGroups/list(id: Seq[Int], feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): Either[CommonError,CatalogsProductGroupsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsProductGroupProductCountsVertical
        */
        def Catalogs_catalogsProductGroups/productCountsGet(productGroupId: String, adAccountId: Option[String]): Either[CommonError,CatalogsProductGroupProductCountsVertical] = Left(TODO)

        /**
        * 
        * @return A CatalogsVerticalProductGroup
        */
        def Catalogs_catalogsProductGroups/update(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String]): Either[CommonError,CatalogsVerticalProductGroup] = Left(TODO)

        /**
        * 
        * @return A FeedProcessingResultsList200Response
        */
        def Catalogs_feedProcessingResults/list(feedId: String, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String]): Either[CommonError,FeedProcessingResultsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/create(feedsCreateRequest: FeedsCreateRequest, adAccountId: Option[String]): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Catalogs_feeds/delete(feedId: String, adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/get(feedId: String, adAccountId: Option[String]): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeedIngestion
        */
        def Catalogs_feeds/ingest(feedId: String, adAccountId: Option[String]): Either[CommonError,CatalogsFeedIngestion] = Left(TODO)

        /**
        * 
        * @return A FeedsList200Response
        */
        def Catalogs_feeds/list(bookmark: Option[String], pageSize: Option[Int], catalogId: Option[String], adAccountId: Option[String]): Either[CommonError,FeedsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/update(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: Option[String]): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A CatalogsItems
        */
        def Catalogs_items/get(country: String, language: String, adAccountId: Option[String], itemIds: Seq[String], filters: Option[CatalogsItemsFilters]): Either[CommonError,CatalogsItems] = Left(TODO)

        /**
        * 
        * @return A CatalogsItems
        */
        def Catalogs_items/post(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String]): Either[CommonError,CatalogsItems] = Left(TODO)

        /**
        * 
        * @return A CatalogsItemsBatch
        */
        def Catalogs_itemsBatch/get(batchId: String, adAccountId: Option[String]): Either[CommonError,CatalogsItemsBatch] = Left(TODO)

        /**
        * 
        * @return A CatalogsItemsBatch
        */
        def Catalogs_itemsBatch/post(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: Option[String]): Either[CommonError,CatalogsItemsBatch] = Left(TODO)

        /**
        * 
        * @return A ItemsIssuesList200Response
        */
        def Catalogs_itemsIssues/list(processingResultId: String, bookmark: Option[String], pageSize: Option[Int], itemNumbers: Seq[Int], itemValidationIssue: Option[CatalogsItemValidationIssue], adAccountId: Option[String]): Either[CommonError,ItemsIssuesList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsProductGroupPinsList200Response
        */
        def Catalogs_productsByProductGroupFilter/list(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Option[Int], adAccountId: Option[String], pinMetrics: Option[Boolean]): Either[CommonError,CatalogsProductGroupPinsList200Response] = Left(TODO)

        /**
        * 
        * @return A CatalogsCreateReportResponse
        */
        def Catalogs_reports/create(catalogsReportParameters: CatalogsReportParameters, adAccountId: Option[String]): Either[CommonError,CatalogsCreateReportResponse] = Left(TODO)

        /**
        * 
        * @return A CatalogsReport
        */
        def Catalogs_reports/get(token: String, adAccountId: Option[String]): Either[CommonError,CatalogsReport] = Left(TODO)

        /**
        * 
        * @return A ReportsStats200Response
        */
        def Catalogs_reports/stats(parameters: CatalogsReportParameters, adAccountId: Option[String], pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,ReportsStats200Response] = Left(TODO)

        /**
        * 
        * @return A ConversionApiResponse
        */
        def ConversionEvents_events/create(adAccountId: String, conversionEvents: ConversionEvents, test: Option[Boolean]): Either[CommonError,ConversionApiResponse] = Left(TODO)

        /**
        * 
        * @return A ConversionTagResponse
        */
        def ConversionTags_conversionTags/create(adAccountId: String, conversionTagCreate: ConversionTagCreate): Either[CommonError,ConversionTagResponse] = Left(TODO)

        /**
        * 
        * @return A ConversionTagResponse
        */
        def ConversionTags_conversionTags/get(adAccountId: String, conversionTagId: String): Either[CommonError,ConversionTagResponse] = Left(TODO)

        /**
        * 
        * @return A ConversionTagListResponse
        */
        def ConversionTags_conversionTags/list(adAccountId: String, filterDeleted: Option[Boolean]): Either[CommonError,ConversionTagListResponse] = Left(TODO)

        /**
        * 
        * @return A Map[String, Seq[ConversionEventResponse]]
        */
        def ConversionTags_ocpmEligibleConversionTags/get(adAccountId: String): Either[CommonError,Map[String, Seq[ConversionEventResponse]]] = Left(TODO)

        /**
        * 
        * @return A PageVisitConversionTagsGet200Response
        */
        def ConversionTags_pageVisitConversionTags/get(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,PageVisitConversionTagsGet200Response] = Left(TODO)

        /**
        * 
        * @return A CustomerList
        */
        def CustomerLists_customerLists/create(adAccountId: String, customerListRequest: CustomerListRequest): Either[CommonError,CustomerList] = Left(TODO)

        /**
        * 
        * @return A CustomerList
        */
        def CustomerLists_customerLists/get(adAccountId: String, customerListId: String): Either[CommonError,CustomerList] = Left(TODO)

        /**
        * 
        * @return A CustomerListsList200Response
        */
        def CustomerLists_customerLists/list(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,CustomerListsList200Response] = Left(TODO)

        /**
        * 
        * @return A CustomerList
        */
        def CustomerLists_customerLists/update(adAccountId: String, customerListId: String, customerListUpdateRequest: CustomerListUpdateRequest): Either[CommonError,CustomerList] = Left(TODO)

        /**
        * 
        * @return A IntegrationRecord
        */
        def Integrations_integrations/getById(id: String): Either[CommonError,IntegrationRecord] = Left(TODO)

        /**
        * 
        * @return A IntegrationsGetList200Response
        */
        def Integrations_integrations/getList(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,IntegrationsGetList200Response] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Integrations_integrationsCommerce/del(externalBusinessId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A IntegrationMetadata
        */
        def Integrations_integrationsCommerce/get(externalBusinessId: String): Either[CommonError,IntegrationMetadata] = Left(TODO)

        /**
        * 
        * @return A IntegrationMetadata
        */
        def Integrations_integrationsCommerce/patch(externalBusinessId: String, integrationRequestPatch: IntegrationRequestPatch): Either[CommonError,IntegrationMetadata] = Left(TODO)

        /**
        * 
        * @return A IntegrationMetadata
        */
        def Integrations_integrationsCommerce/post(integrationRequest: IntegrationRequest): Either[CommonError,IntegrationMetadata] = Left(TODO)

        /**
        * 
        * @return A IntegrationLogsSuccessResponse
        */
        def Integrations_integrationsLogs/post(integrationLogsRequest: IntegrationLogsRequest): Either[CommonError,IntegrationLogsSuccessResponse] = Left(TODO)

        /**
        * 
        * @return A KeywordsMetricsArrayResponse
        */
        def Keywords_countryKeywordsMetrics/get(adAccountId: String, countryCode: String, keywords: Seq[String]): Either[CommonError,KeywordsMetricsArrayResponse] = Left(TODO)

        /**
        * 
        * @return A KeywordsResponse
        */
        def Keywords_keywords/create(adAccountId: String, keywordsRequest: KeywordsRequest): Either[CommonError,KeywordsResponse] = Left(TODO)

        /**
        * 
        * @return A KeywordsGet200Response
        */
        def Keywords_keywords/get(adAccountId: String, campaignId: Option[String], adGroupId: Option[String], matchTypes: Seq[MatchType], pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,KeywordsGet200Response] = Left(TODO)

        /**
        * 
        * @return A KeywordsResponse
        */
        def Keywords_keywords/update(adAccountId: String, keywordUpdateBody: KeywordUpdateBody): Either[CommonError,KeywordsResponse] = Left(TODO)

        /**
        * 
        * @return A TrendingKeywordsResponse
        */
        def Keywords_trendingKeywords/list(region: TrendsSupportedRegion, trendType: TrendType, interests: Seq[String], genders: Seq[String], ages: Seq[String], includeKeywords: Seq[String], normalizeAgainstGroup: Option[Boolean], limit: Option[Int]): Either[CommonError,TrendingKeywordsResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def LeadAds_adAccountsSubscriptions/delById(adAccountId: String, subscriptionId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A AdAccountGetSubscriptionResponse
        */
        def LeadAds_adAccountsSubscriptions/getById(adAccountId: String, subscriptionId: String): Either[CommonError,AdAccountGetSubscriptionResponse] = Left(TODO)

        /**
        * 
        * @return A AdAccountsSubscriptionsGetList200Response
        */
        def LeadAds_adAccountsSubscriptions/getList(adAccountId: String, pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,AdAccountsSubscriptionsGetList200Response] = Left(TODO)

        /**
        * 
        * @return A AdAccountCreateSubscriptionResponse
        */
        def LeadAds_adAccountsSubscriptions/post(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest): Either[CommonError,AdAccountCreateSubscriptionResponse] = Left(TODO)

        /**
        * 
        * @return A LeadFormResponse
        */
        def LeadForms_leadForm/get(adAccountId: String, leadFormId: String): Either[CommonError,LeadFormResponse] = Left(TODO)

        /**
        * 
        * @return A LeadFormTestResponse
        */
        def LeadForms_leadFormTest/create(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest): Either[CommonError,LeadFormTestResponse] = Left(TODO)

        /**
        * 
        * @return A LeadFormArrayResponse
        */
        def LeadForms_leadForms/create(adAccountId: String, leadFormCreateRequest: Seq[LeadFormCreateRequest]): Either[CommonError,LeadFormArrayResponse] = Left(TODO)

        /**
        * 
        * @return A LeadFormsList200Response
        */
        def LeadForms_leadForms/list(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,LeadFormsList200Response] = Left(TODO)

        /**
        * 
        * @return A LeadFormArrayResponse
        */
        def LeadForms_leadForms/update(adAccountId: String, leadFormUpdateRequest: Seq[LeadFormUpdateRequest]): Either[CommonError,LeadFormArrayResponse] = Left(TODO)

        /**
        * 
        * @return A LeadsExportCreateResponse
        */
        def LeadsExport_leadsExport/create(adAccountId: String, leadsExportCreateRequest: LeadsExportCreateRequest): Either[CommonError,LeadsExportCreateResponse] = Left(TODO)

        /**
        * 
        * @return A LeadsExportResponseData
        */
        def LeadsExport_leadsExport/get(adAccountId: String, leadsExportId: String): Either[CommonError,LeadsExportResponseData] = Left(TODO)

        /**
        * 
        * @return A MediaUpload
        */
        def Media_media/create(mediaUploadRequest: MediaUploadRequest): Either[CommonError,MediaUpload] = Left(TODO)

        /**
        * 
        * @return A MediaUploadDetails
        */
        def Media_media/get(mediaId: String): Either[CommonError,MediaUploadDetails] = Left(TODO)

        /**
        * 
        * @return A MediaList200Response
        */
        def Media_media/list(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,MediaList200Response] = Left(TODO)

        /**
        * 
        * @return A OauthAccessTokenResponse
        */
        def Oauth_oauth/token(grantType: String): Either[CommonError,OauthAccessTokenResponse] = Left(TODO)

        /**
        * 
        * @return A OrderLine
        */
        def OrderLines_orderLines/get(adAccountId: String, orderLineId: String): Either[CommonError,OrderLine] = Left(TODO)

        /**
        * 
        * @return A OrderLinesList200Response
        */
        def OrderLines_orderLines/list(adAccountId: String, pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,OrderLinesList200Response] = Left(TODO)

        /**
        * 
        * @return A Map[String, Map]
        */
        def Pins_multiPins/analytics(pinIds: Seq[String], startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], adAccountId: Option[String]): Either[CommonError,Map[String, Map]] = Left(TODO)

        /**
        * 
        * @return A Map[String, PinAnalyticsMetricsResponse]
        */
        def Pins_pins/analytics(pinId: String, startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[PinsAnalyticsMetricTypesParameterInner], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Either[CommonError,Map[String, PinAnalyticsMetricsResponse]] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/create(pinCreate: PinCreate, adAccountId: Option[String]): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Pins_pins/delete(pinId: String, adAccountId: Option[String]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/get(pinId: String, pinMetrics: Option[Boolean], adAccountId: Option[String]): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A PinsList200Response
        */
        def Pins_pins/list(bookmark: Option[String], pageSize: Option[Int], pinFilter: Option[String], includeProtectedPins: Option[Boolean], pinType: Option[String], creativeTypes: Seq[String], adAccountId: Option[String], pinMetrics: Option[Boolean]): Either[CommonError,PinsList200Response] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/save(pinId: String, pinsSaveRequest: PinsSaveRequest, adAccountId: Option[String]): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/update(pinId: String, pinUpdate: PinUpdate, adAccountId: Option[String]): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A ProductGroupPromotionResponse
        */
        def ProductGroupPromotions_productGroupPromotions/create(adAccountId: String, productGroupPromotionCreateRequest: ProductGroupPromotionCreateRequest): Either[CommonError,ProductGroupPromotionResponse] = Left(TODO)

        /**
        * 
        * @return A ProductGroupPromotionResponse
        */
        def ProductGroupPromotions_productGroupPromotions/get(adAccountId: String, productGroupPromotionId: String): Either[CommonError,ProductGroupPromotionResponse] = Left(TODO)

        /**
        * 
        * @return A ProductGroupPromotionsList200Response
        */
        def ProductGroupPromotions_productGroupPromotions/list(adAccountId: String, productGroupPromotionIds: Seq[String], entityStatuses: Seq[String], adGroupId: Option[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,ProductGroupPromotionsList200Response] = Left(TODO)

        /**
        * 
        * @return A ProductGroupPromotionResponse
        */
        def ProductGroupPromotions_productGroupPromotions/update(adAccountId: String, productGroupPromotionUpdateRequest: ProductGroupPromotionUpdateRequest): Either[CommonError,ProductGroupPromotionResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[ProductGroupAnalyticsResponseInner]
        */
        def ProductGroupPromotions_productGroups/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, productGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[ProductGroupAnalyticsResponseInner]] = Left(TODO)

        /**
        * 
        * @return A AdAccountsCountryResponse
        */
        def Resources_adAccountCountries/get(): Either[CommonError,AdAccountsCountryResponse] = Left(TODO)

        /**
        * 
        * @return A DeliveryMetricsResponse
        */
        def Resources_deliveryMetrics/get(reportType: Option[String]): Either[CommonError,DeliveryMetricsResponse] = Left(TODO)

        /**
        * 
        * @return A SingleInterestTargetingOptionResponse
        */
        def Resources_interestTargetingOptions/get(interestId: String): Either[CommonError,SingleInterestTargetingOptionResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Resources_leadFormQuestions/get(): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A BookClosedResponse
        */
        def Resources_metricsReadyState/get(date: String): Either[CommonError,BookClosedResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[Object]
        */
        def Resources_targetingOptions/get(targetingType: String, clientId: Option[String], oauthSignature: Option[String], timestamp: Option[String], adAccountId: Option[String]): Either[CommonError,Seq[Object]] = Left(TODO)

        /**
        * 
        * @return A SearchPartnerPins200Response
        */
        def Search_searchPartnerPins(term: String, countryCode: String, bookmark: Option[String], locale: Option[String], limit: Option[Int]): Either[CommonError,SearchPartnerPins200Response] = Left(TODO)

        /**
        * 
        * @return A SearchUserBoardsGet200Response
        */
        def Search_searchUserBoards/get(adAccountId: Option[String], bookmark: Option[String], pageSize: Option[Int], query: Option[String]): Either[CommonError,SearchUserBoardsGet200Response] = Left(TODO)

        /**
        * 
        * @return A PinsList200Response
        */
        def Search_searchUserPins/list(query: String, adAccountId: Option[String], bookmark: Option[String]): Either[CommonError,PinsList200Response] = Left(TODO)

        /**
        * 
        * @return A TargetingTemplateGetResponseData
        */
        def TargetingTemplate_targetingTemplate/create(adAccountId: String, targetingTemplateCreate: TargetingTemplateCreate): Either[CommonError,TargetingTemplateGetResponseData] = Left(TODO)

        /**
        * 
        * @return A TargetingTemplateList200Response
        */
        def TargetingTemplate_targetingTemplate/list(adAccountId: String, order: Option[String], includeSizing: Option[Boolean], searchQuery: Option[String], pageSize: Option[Int], bookmark: Option[String]): Either[CommonError,TargetingTemplateList200Response] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def TargetingTemplate_targetingTemplate/update(adAccountId: String, targetingTemplateUpdateRequest: TargetingTemplateUpdateRequest): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A RelatedTerms
        */
        def Terms_termsRelated/list(terms: Seq[String]): Either[CommonError,RelatedTerms] = Left(TODO)

        /**
        * 
        * @return A Seq[String]
        */
        def Terms_termsSuggested/list(term: String, limit: Option[Int]): Either[CommonError,Seq[String]] = Left(TODO)

        /**
        * 
        * @return A TermsOfService
        */
        def TermsOfService_termsOfService/get(adAccountId: String, includeHtml: Option[Boolean], tosType: Option[String]): Either[CommonError,TermsOfService] = Left(TODO)

        /**
        * 
        * @return A BoardsUserFollowsList200Response
        */
        def UserAccount_boardsUserFollows/list(bookmark: Option[String], pageSize: Option[Int], explicitFollowing: Option[Boolean], adAccountId: Option[String]): Either[CommonError,BoardsUserFollowsList200Response] = Left(TODO)

        /**
        * 
        * @return A UserSummary
        */
        def UserAccount_followUser/update(username: String, followUserRequest: FollowUserRequest): Either[CommonError,UserSummary] = Left(TODO)

        /**
        * 
        * @return A FollowersList200Response
        */
        def UserAccount_followers/list(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,FollowersList200Response] = Left(TODO)

        /**
        * 
        * @return A Seq[LinkedBusiness]
        */
        def UserAccount_linkedBusinessAccounts/get(): Either[CommonError,Seq[LinkedBusiness]] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def UserAccount_unverifyWebsite/delete(website: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Map[String, AnalyticsMetricsResponse]
        */
        def UserAccount_userAccount/analytics(startDate: LocalDateTime, endDate: LocalDateTime, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], splitField: Option[String], adAccountId: Option[String]): Either[CommonError,Map[String, AnalyticsMetricsResponse]] = Left(TODO)

        /**
        * 
        * @return A TopPinsAnalyticsResponse
        */
        def UserAccount_userAccount/analytics/topPins(startDate: LocalDateTime, endDate: LocalDateTime, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): Either[CommonError,TopPinsAnalyticsResponse] = Left(TODO)

        /**
        * 
        * @return A TopVideoPinsAnalyticsResponse
        */
        def UserAccount_userAccount/analytics/topVideoPins(startDate: LocalDateTime, endDate: LocalDateTime, sortBy: String, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], contentType: Option[String], source: Option[String], metricTypes: Seq[String], numOfPins: Option[Int], createdInLastNDays: Option[Int], adAccountId: Option[String]): Either[CommonError,TopVideoPinsAnalyticsResponse] = Left(TODO)

        /**
        * 
        * @return A UserAccountFollowedInterests200Response
        */
        def UserAccount_userAccount/followedInterests(username: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,UserAccountFollowedInterests200Response] = Left(TODO)

        /**
        * 
        * @return A Account
        */
        def UserAccount_userAccount/get(adAccountId: Option[String]): Either[CommonError,Account] = Left(TODO)

        /**
        * 
        * @return A UserFollowingGet200Response
        */
        def UserAccount_userFollowing/get(bookmark: Option[String], pageSize: Option[Int], feedType: Option[UserFollowingFeedType], explicitFollowing: Option[Boolean], adAccountId: Option[String]): Either[CommonError,UserFollowingGet200Response] = Left(TODO)

        /**
        * 
        * @return A UserWebsitesGet200Response
        */
        def UserAccount_userWebsites/get(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,UserWebsitesGet200Response] = Left(TODO)

        /**
        * 
        * @return A UserWebsiteSummary
        */
        def UserAccount_verifyWebsite/update(userWebsiteVerifyRequest: UserWebsiteVerifyRequest, adAccountId: Option[String]): Either[CommonError,UserWebsiteSummary] = Left(TODO)

        /**
        * 
        * @return A UserWebsiteVerificationCode
        */
        def UserAccount_websiteVerification/get(adAccountId: Option[String]): Either[CommonError,UserWebsiteVerificationCode] = Left(TODO)

}