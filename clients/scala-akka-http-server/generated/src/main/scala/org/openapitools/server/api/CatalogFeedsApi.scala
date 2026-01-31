package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CatalogsFeed
import org.openapitools.server.model.CatalogsFeedIngestion
import org.openapitools.server.model.CatalogsItemValidationIssue
import org.openapitools.server.model.Error
import org.openapitools.server.model.FeedProcessingResultsList200Response
import org.openapitools.server.model.FeedsCreateRequest
import org.openapitools.server.model.FeedsList200Response
import org.openapitools.server.model.FeedsUpdateRequest
import org.openapitools.server.model.ItemsIssuesList200Response


class CatalogFeedsApi(
    catalogFeedsService: CatalogFeedsApiService,
    catalogFeedsMarshaller: CatalogFeedsApiMarshaller
) {

  import CatalogFeedsApiPatterns.processingResultIdPattern
import CatalogFeedsApiPatterns.feedIdPattern

  import catalogFeedsMarshaller._

  lazy val route: Route =
    path("catalogs" / "feeds" / feedIdPattern / "processing_results") { (feedId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "ad_account_id".as[String].?) { (bookmark, pageSize, adAccountId) => 
            catalogFeedsService.feedProcessingResultsList(feedId = feedId, bookmark = bookmark, pageSize = pageSize, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "feeds") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[FeedsCreateRequest]){ feedsCreateRequest =>
              catalogFeedsService.feedsCreate(feedsCreateRequest = feedsCreateRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogFeedsService.feedsDelete(feedId = feedId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogFeedsService.feedsGet(feedId = feedId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern / "ingest") { (feedId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogFeedsService.feedsIngest(feedId = feedId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "feeds") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "catalog_id".as[String].?, "ad_account_id".as[String].?) { (bookmark, pageSize, catalogId, adAccountId) => 
            catalogFeedsService.feedsList(bookmark = bookmark, pageSize = pageSize, catalogId = catalogId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[FeedsUpdateRequest]){ feedsUpdateRequest =>
              catalogFeedsService.feedsUpdate(feedId = feedId, feedsUpdateRequest = feedsUpdateRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "processing_results" / processingResultIdPattern / "item_issues") { (processingResultId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "item_numbers".as[String].?, "item_validation_issue".as[String].?, "ad_account_id".as[String].?) { (bookmark, pageSize, itemNumbers, itemValidationIssue, adAccountId) => 
            catalogFeedsService.itemsIssuesList(processingResultId = processingResultId, bookmark = bookmark, pageSize = pageSize, itemNumbers = itemNumbers, itemValidationIssue = itemValidationIssue, adAccountId = adAccountId)
        }
      }
    }
}

object CatalogFeedsApiPatterns {

    val processingResultIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val feedIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CatalogFeedsApiService {

  def feedProcessingResultsList200(responseFeedProcessingResultsList200Response: FeedProcessingResultsList200Response)(implicit toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]): Route =
    complete((200, responseFeedProcessingResultsList200Response))
  def feedProcessingResultsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedProcessingResultsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedProcessingResultsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedProcessingResultsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: FeedProcessingResultsList200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Feed not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Int, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]): Route

  def feedsCreate201(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((201, responseCatalogsFeed))
  def feedsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsCreate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def feedsCreate422(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((422, responseError))
  def feedsCreate501(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((501, responseError))
  def feedsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Success, DataType: CatalogsFeed
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Business account required., DataType: Error
   * Code: 409, Message: User website required., DataType: Error
   * Code: 422, Message: Unique feed name is required., DataType: Error
   * Code: 501, Message: Not implemented (absent \&quot;default_country\&quot; or \&quot;default_locale\&quot;)., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def feedsCreate(feedsCreateRequest: FeedsCreateRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsDelete204: Route =
    complete((204, "Feed deleted successfully."))
  def feedsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsDelete409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def feedsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Feed deleted successfully.
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t delete a feed with active promotions., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def feedsDelete(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsGet200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsFeed
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def feedsGet(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsIngest200(responseCatalogsFeedIngestion: CatalogsFeedIngestion)(implicit toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]): Route =
    complete((200, responseCatalogsFeedIngestion))
  def feedsIngest400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsIngest403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsIngest404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsIngestDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The ingestion process was successfully started., DataType: CatalogsFeedIngestion
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def feedsIngest(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]): Route

  def feedsList200(responseFeedsList200Response: FeedsList200Response)(implicit toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response]): Route =
    complete((200, responseFeedsList200Response))
  def feedsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: FeedsList200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def feedsList(bookmark: Option[String], pageSize: Int, catalogId: Option[String], adAccountId: Option[String])
      (implicit toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsUpdate200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsFeed
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def feedsUpdate(feedId: String, feedsUpdateRequest: FeedsUpdateRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsIssuesList200(responseItemsIssuesList200Response: ItemsIssuesList200Response)(implicit toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response]): Route =
    complete((200, responseItemsIssuesList200Response))
  def itemsIssuesList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsIssuesList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def itemsIssuesList501(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((501, responseError))
  def itemsIssuesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: ItemsIssuesList200Response
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Processing Result not found., DataType: Error
   * Code: 501, Message: Not implemented., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def itemsIssuesList(processingResultId: String, bookmark: Option[String], pageSize: Int, itemNumbers: Option[String], itemValidationIssue: Option[String], adAccountId: Option[String])
      (implicit toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogFeedsApiMarshaller {
  implicit def fromEntityUnmarshallerFeedsCreateRequest: FromEntityUnmarshaller[FeedsCreateRequest]

  implicit def fromEntityUnmarshallerFeedsUpdateRequest: FromEntityUnmarshaller[FeedsUpdateRequest]



  implicit def toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]

  implicit def toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response]

  implicit def toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]

  implicit def toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]

}

