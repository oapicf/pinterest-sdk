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
import org.openapitools.server.model.CatalogsFeedsCreateRequest
import org.openapitools.server.model.CatalogsFeedsUpdateRequest
import org.openapitools.server.model.CatalogsItems
import org.openapitools.server.model.CatalogsItemsBatch
import org.openapitools.server.model.CatalogsItemsBatchRequest
import org.openapitools.server.model.CatalogsProductGroup
import org.openapitools.server.model.CatalogsProductGroupCreateRequest
import org.openapitools.server.model.CatalogsProductGroupUpdateRequest
import org.openapitools.server.model.Error
import org.openapitools.server.model.Paginated


class CatalogsApi(
    catalogsService: CatalogsApiService,
    catalogsMarshaller: CatalogsApiMarshaller
) {

  import CatalogsApiPatterns.productGroupIdPattern
import CatalogsApiPatterns.feedIdPattern

  import catalogsMarshaller._

  lazy val route: Route =
    path("catalogs" / "product_groups") { 
      post {  
            entity(as[CatalogsProductGroupCreateRequest]){ catalogsProductGroupCreateRequest =>
              catalogsService.catalogsProductGroupsCreate(catalogsProductGroupCreateRequest = catalogsProductGroupCreateRequest)
            }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern) { (productGroupId) => 
      delete {  
            catalogsService.catalogsProductGroupsDelete(productGroupId = productGroupId)
      }
    } ~
    path("catalogs" / "product_groups") { 
      get { 
        parameters("feed_id".as[String], "bookmark".as[String].?, "page_size".as[Int].?(25)) { (feedId, bookmark, pageSize) => 
            catalogsService.catalogsProductGroupsList(feedId = feedId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern) { (productGroupId) => 
      patch {  
            entity(as[CatalogsProductGroupUpdateRequest]){ catalogsProductGroupUpdateRequest =>
              catalogsService.catalogsProductGroupsUpdate(productGroupId = productGroupId, catalogsProductGroupUpdateRequest = catalogsProductGroupUpdateRequest)
            }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern / "processing_results") { (feedId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            catalogsService.feedProcessingResultsList(feedId = feedId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "feeds") { 
      post {  
            entity(as[CatalogsFeedsCreateRequest]){ catalogsFeedsCreateRequest =>
              catalogsService.feedsCreate(catalogsFeedsCreateRequest = catalogsFeedsCreateRequest)
            }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      delete {  
            catalogsService.feedsDelete(feedId = feedId)
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      get {  
            catalogsService.feedsGet(feedId = feedId)
      }
    } ~
    path("catalogs" / "feeds") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            catalogsService.feedsList(bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "feeds" / feedIdPattern) { (feedId) => 
      patch {  
            entity(as[CatalogsFeedsUpdateRequest]){ catalogsFeedsUpdateRequest =>
              catalogsService.feedsUpdate(feedId = feedId, catalogsFeedsUpdateRequest = catalogsFeedsUpdateRequest)
            }
      }
    } ~
    path("catalogs" / "items" / "batch" / Segment) { (batchId) => 
      get {  
            catalogsService.itemsBatchGet(batchId = batchId)
      }
    } ~
    path("catalogs" / "items" / "batch") { 
      post {  
            entity(as[CatalogsItemsBatchRequest]){ catalogsItemsBatchRequest =>
              catalogsService.itemsBatchPost(catalogsItemsBatchRequest = catalogsItemsBatchRequest)
            }
      }
    } ~
    path("catalogs" / "items") { 
      get { 
        parameters("country".as[String], "item_ids".as[String], "language".as[String]) { (country, itemIds, language) => 
            catalogsService.itemsGet(country = country, itemIds = itemIds, language = language)
        }
      }
    }
}

object CatalogsApiPatterns {

    val productGroupIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val feedIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CatalogsApiService {

  def catalogsProductGroupsCreate201(responseAny: Any)(implicit toEntityMarshallerAny: ToEntityMarshaller[Any]): Route =
    complete((201, responseAny))
  def catalogsProductGroupsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsCreate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Success, DataType: Any
   * Code: 400, Message: Invalid body., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t create this catalogs product group with this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsCreate(catalogsProductGroupCreateRequest: CatalogsProductGroupCreateRequest)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsDelete204: Route =
    complete((204, "Catalogs Product Group deleted successfully."))
  def catalogsProductGroupsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsDelete409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Catalogs Product Group deleted successfully.
   * Code: 400, Message: Invalid catalogs product group id parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t delete this catalogs product group., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsDelete(productGroupId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def catalogsProductGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsList409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for feed mutations yet., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t create this catalogs product group with this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsList(feedId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsUpdate200(responseCatalogsProductGroup: CatalogsProductGroup)(implicit toEntityMarshallerCatalogsProductGroup: ToEntityMarshaller[CatalogsProductGroup]): Route =
    complete((200, responseCatalogsProductGroup))
  def catalogsProductGroupsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsUpdate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsProductGroup
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t update this catalogs product group to this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupUpdateRequest: CatalogsProductGroupUpdateRequest)
      (implicit toEntityMarshallerCatalogsProductGroup: ToEntityMarshaller[CatalogsProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedProcessingResultsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def feedProcessingResultsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedProcessingResultsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedProcessingResultsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def feedProcessingResultsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Feed not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def feedProcessingResultsList(feedId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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
  def feedsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Success, DataType: CatalogsFeed
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Business account required., DataType: Error
   * Code: 409, Message: User website required., DataType: Error
   * Code: 422, Message: Unique feed name is required., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def feedsCreate(catalogsFeedsCreateRequest: CatalogsFeedsCreateRequest)
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
  def feedsDelete(feedId: String)
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
  def feedsGet(feedId: String)
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def feedsList200(responsePaginated: Paginated)(implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]): Route =
    complete((200, responsePaginated))
  def feedsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def feedsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def feedsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Paginated
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def feedsList(bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerPaginated: ToEntityMarshaller[Paginated], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

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
  def feedsUpdate(feedId: String, catalogsFeedsUpdateRequest: CatalogsFeedsUpdateRequest)
      (implicit toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsBatchGet200(responseCatalogsItemsBatch: CatalogsItemsBatch)(implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]): Route =
    complete((200, responseCatalogsItemsBatch))
  def itemsBatchGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsBatchGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsBatchGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def itemsBatchGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items batch, DataType: CatalogsItemsBatch
   * Code: 401, Message: Not authorized to access catalogs items batch, DataType: Error
   * Code: 403, Message: Not authorized to access catalogs items batch, DataType: Error
   * Code: 404, Message: Catalogs items batch not found, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsBatchGet(batchId: String)
      (implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsBatchPost200(responseCatalogsItemsBatch: CatalogsItemsBatch)(implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]): Route =
    complete((200, responseCatalogsItemsBatch))
  def itemsBatchPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsBatchPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsBatchPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items batch, DataType: CatalogsItemsBatch
   * Code: 401, Message: Not authorized to post catalogs items, DataType: Error
   * Code: 403, Message: Not authorized to post catalogs items, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsBatchPost(catalogsItemsBatchRequest: CatalogsItemsBatchRequest)
      (implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsGet200(responseCatalogsItems: CatalogsItems)(implicit toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems]): Route =
    complete((200, responseCatalogsItems))
  def itemsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items, DataType: CatalogsItems
   * Code: 401, Message: Not authorized to access catalogs items, DataType: Error
   * Code: 403, Message: Not authorized to access catalogs items, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsGet(country: String, itemIds: String, language: String)
      (implicit toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsProductGroupCreateRequest: FromEntityUnmarshaller[CatalogsProductGroupCreateRequest]

  implicit def fromEntityUnmarshallerCatalogsProductGroupUpdateRequest: FromEntityUnmarshaller[CatalogsProductGroupUpdateRequest]

  implicit def fromEntityUnmarshallerCatalogsItemsBatchRequest: FromEntityUnmarshaller[CatalogsItemsBatchRequest]

  implicit def fromEntityUnmarshallerCatalogsFeedsUpdateRequest: FromEntityUnmarshaller[CatalogsFeedsUpdateRequest]

  implicit def fromEntityUnmarshallerCatalogsFeedsCreateRequest: FromEntityUnmarshaller[CatalogsFeedsCreateRequest]



  implicit def toEntityMarshallerCatalogsFeed: ToEntityMarshaller[CatalogsFeed]

  implicit def toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]

  implicit def toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems]

  implicit def toEntityMarshallerCatalogsProductGroup: ToEntityMarshaller[CatalogsProductGroup]

  implicit def toEntityMarshallerPaginated: ToEntityMarshaller[Paginated]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

