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
        * @return A Seq[Map[String, Object]]
        */
        def AdAccounts_adAccount/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[Map[String, Object]]] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def AdAccounts_adAccounts/list(bookmark: Option[String], pageSize: Option[Int], includeSharedAccounts: Option[Boolean]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Seq[Map[String, Object]]
        */
        def AdAccounts_adGroups/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[Map[String, Object]]] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def AdAccounts_adGroups/list(adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String], translateInterestsToNames: Option[Boolean]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Seq[Map[String, Object]]
        */
        def AdAccounts_ads/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, adIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[Map[String, Object]]] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def AdAccounts_ads/list(adAccountId: String, campaignIds: Seq[String], adGroupIds: Seq[String], adIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A AdsAnalyticsCreateAsyncResponse
        */
        def AdAccounts_analytics/createReport(adAccountId: String, adsAnalyticsCreateAsyncRequest: AdsAnalyticsCreateAsyncRequest): Either[CommonError,AdsAnalyticsCreateAsyncResponse] = Left(TODO)

        /**
        * 
        * @return A AdsAnalyticsGetAsyncResponse
        */
        def AdAccounts_analytics/getReport(adAccountId: String, token: String): Either[CommonError,AdsAnalyticsGetAsyncResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[Map[String, Object]]
        */
        def AdAccounts_campaigns/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, campaignIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[Map[String, Object]]] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def AdAccounts_campaigns/list(adAccountId: String, campaignIds: Seq[String], entityStatuses: Seq[String], pageSize: Option[Int], order: Option[String], bookmark: Option[String]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Seq[Map[String, Object]]
        */
        def AdAccounts_productGroups/analytics(adAccountId: String, startDate: LocalDateTime, endDate: LocalDateTime, productGroupIds: Seq[String], columns: Seq[String], granularity: Granularity, clickWindowDays: Option[Int], engagementWindowDays: Option[Int], viewWindowDays: Option[Int], conversionReportTime: Option[String]): Either[CommonError,Seq[Map[String, Object]]] = Left(TODO)

        /**
        * 
        * @return A BoardSection
        */
        def Boards_boardSections/create(boardId: String, boardSection: BoardSection): Either[CommonError,BoardSection] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Boards_boardSections/delete(boardId: String, sectionId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Boards_boardSections/list(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Boards_boardSections/listPins(boardId: String, sectionId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A BoardSection
        */
        def Boards_boardSections/update(boardId: String, sectionId: String, boardSection: BoardSection): Either[CommonError,BoardSection] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/create(board: Board): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Boards_boards/delete(boardId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/get(boardId: String): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Boards_boards/list(bookmark: Option[String], pageSize: Option[Int], privacy: Option[String]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Boards_boards/listPins(boardId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A Board
        */
        def Boards_boards/update(boardId: String, boardUpdate: BoardUpdate): Either[CommonError,Board] = Left(TODO)

        /**
        * 
        * @return A Object
        */
        def Catalogs_catalogsProductGroups/create(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest): Either[CommonError,Object] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Catalogs_catalogsProductGroups/delete(productGroupId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Catalogs_catalogsProductGroups/list(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A CatalogsProductGroup
        */
        def Catalogs_catalogsProductGroups/update(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest): Either[CommonError,CatalogsProductGroup] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Catalogs_feedProcessingResults/list(feedId: String, bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/create(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Catalogs_feeds/delete(feedId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/get(feedId: String): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A Paginated
        */
        def Catalogs_feeds/list(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A CatalogsFeed
        */
        def Catalogs_feeds/update(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest): Either[CommonError,CatalogsFeed] = Left(TODO)

        /**
        * 
        * @return A CatalogsItems
        */
        def Catalogs_items/get(country: String, itemIds: Seq[String], language: String): Either[CommonError,CatalogsItems] = Left(TODO)

        /**
        * 
        * @return A CatalogsItemsBatch
        */
        def Catalogs_itemsBatch/get(batchId: String): Either[CommonError,CatalogsItemsBatch] = Left(TODO)

        /**
        * 
        * @return A CatalogsItemsBatch
        */
        def Catalogs_itemsBatch/post(catalogsItemsBatchRequest: CatalogsItemsBatchRequest): Either[CommonError,CatalogsItemsBatch] = Left(TODO)

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
        * @return A Paginated
        */
        def Media_media/list(bookmark: Option[String], pageSize: Option[Int]): Either[CommonError,Paginated] = Left(TODO)

        /**
        * 
        * @return A OauthAccessTokenResponse
        */
        def Oauth_oauth/token(grantType: String): Either[CommonError,OauthAccessTokenResponse] = Left(TODO)

        /**
        * 
        * @return A Map[String, AnalyticsMetricsResponse]
        */
        def Pins_pins/analytics(pinId: String, startDate: LocalDateTime, endDate: LocalDateTime, metricTypes: Seq[String], appTypes: Option[String], splitField: Option[String], adAccountId: Option[String]): Either[CommonError,Map[String, AnalyticsMetricsResponse]] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/create(pin: Pin): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Pins_pins/delete(pinId: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Pin
        */
        def Pins_pins/get(pinId: String, adAccountId: Option[String]): Either[CommonError,Pin] = Left(TODO)

        /**
        * 
        * @return A Map[String, AnalyticsMetricsResponse]
        */
        def UserAccount_userAccount/analytics(startDate: LocalDateTime, endDate: LocalDateTime, fromClaimedContent: Option[String], pinFormat: Option[String], appTypes: Option[String], metricTypes: Seq[String], splitField: Option[String], adAccountId: Option[String]): Either[CommonError,Map[String, AnalyticsMetricsResponse]] = Left(TODO)

        /**
        * 
        * @return A Account
        */
        def UserAccount_userAccount/get(adAccountId: Option[String]): Either[CommonError,Account] = Left(TODO)

}