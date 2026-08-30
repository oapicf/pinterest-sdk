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
import org.openapitools.server.model.CatalogsFeedCreateRequestSchema
import org.openapitools.server.model.CatalogsFeedIngestion
import org.openapitools.server.model.CatalogsFeedUpdateRequestSchema
import org.openapitools.server.model.CatalogsItemValidationIssue
import org.openapitools.server.model.Error
import org.openapitools.server.model.FeedProcessingResultsList200Response
import org.openapitools.server.model.FeedsList200Response
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
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, bookmark, pageSize) => 
            catalogFeedsService.feedProcessingResultsList(feedId = feedId, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "feeds") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsFeedCreateRequestSchema]){ catalogsFeedCreateRequestSchema =>
              catalogFeedsService.feedsCreate(catalogsFeedCreateRequestSchema = catalogsFeedCreateRequestSchema, adAccountId = adAccountId)
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
        parameters("catalog_id".as[String].?, "ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (catalogId, adAccountId, bookmark, pageSize) => 
            catalogFeedsService.feedsList(catalogId = catalogId, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsFeedUpdateRequestSchema]){ catalogsFeedUpdateRequestSchema =>
              catalogFeedsService.feedsUpdate(feedId = feedId, catalogsFeedUpdateRequestSchema = catalogsFeedUpdateRequestSchema, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "processing_results" / processingResultIdPattern / "item_issues") { (processingResultId) => 
      get { 
        parameters("item_numbers".as[String].?, "item_validation_issue".as[String].?, "ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (itemNumbers, itemValidationIssue, adAccountId, bookmark, pageSize) => 
            catalogFeedsService.itemsIssuesList(processingResultId = processingResultId, itemNumbers = itemNumbers, itemValidationIssue = itemValidationIssue, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    }
}

object CatalogFeedsApiPatterns {

    val processingResultIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val feedIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CatalogFeedsApiService {

  def feedProcessingResultsList200(responseFeedProcessingResultsList200Response: FeedProcessingResultsList200Response)(implicit toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]): Route =
    complete((200, responseFeedProcessingResultsList200Response))
  def feedProcessingResultsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedProcessingResultsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedProcessingResultsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedProcessingResultsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedProcessingResultsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedProcessingResultsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: FeedProcessingResultsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedProcessingResultsList(feedId: String, adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]): Route

  def feedsCreate200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsCreate201(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((201, responseCatalogsFeed))
  def feedsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsFeed
   * Code: 201, Message: Resource create operation completed successfully., DataType: CatalogsFeed
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsCreate(catalogsFeedCreateRequestSchema: CatalogsFeedCreateRequestSchema, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsDelete200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def feedsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsFeed
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsDelete(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsGet200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsFeed
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsGet(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsIngest200(responseCatalogsFeedIngestion: CatalogsFeedIngestion)(implicit toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]): Route =
    complete((200, responseCatalogsFeedIngestion))
  def feedsIngest400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsIngest401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsIngest403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsIngest404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsIngest429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsIngestDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsFeedIngestion
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsIngest(feedId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]): Route

  def feedsList200(responseFeedsList200Response: FeedsList200Response)(implicit toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response]): Route =
    complete((200, responseFeedsList200Response))
  def feedsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: FeedsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsList(catalogId: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsUpdate200(responseCatalogsFeed: CatalogsFeed)(implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]): Route =
    complete((200, responseCatalogsFeed))
  def feedsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def feedsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def feedsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsFeed
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def feedsUpdate(feedId: String, catalogsFeedUpdateRequestSchema: CatalogsFeedUpdateRequestSchema, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsIssuesList200(responseItemsIssuesList200Response: ItemsIssuesList200Response)(implicit toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response]): Route =
    complete((200, responseItemsIssuesList200Response))
  def itemsIssuesList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def itemsIssuesList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsIssuesList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsIssuesList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def itemsIssuesList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def itemsIssuesListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: ItemsIssuesList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def itemsIssuesList(processingResultId: String, itemNumbers: Option[String], itemValidationIssue: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogFeedsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsFeedCreateRequestSchema: FromEntityUnmarshaller[CatalogsFeedCreateRequestSchema]

  implicit def fromEntityUnmarshallerCatalogsFeedUpdateRequestSchema: FromEntityUnmarshaller[CatalogsFeedUpdateRequestSchema]



  implicit def toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]

  implicit def toEntityMarshallerFeedsList200Response: ToEntityMarshaller[FeedsList200Response]

  implicit def toEntityMarshallerItemsIssuesList200Response: ToEntityMarshaller[ItemsIssuesList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerFeedProcessingResultsList200Response: ToEntityMarshaller[FeedProcessingResultsList200Response]

  implicit def toEntityMarshallerCatalogsFeedIngestion: ToEntityMarshaller[CatalogsFeedIngestion]

}

