package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CatalogsItems
import org.openapitools.server.model.CatalogsItemsBatch
import org.openapitools.server.model.CatalogsItemsRequest
import org.openapitools.server.model.Error
import org.openapitools.server.model.ItemsBatchPostRequest


class CatalogItemsApi(
    catalogItemsService: CatalogItemsApiService,
    catalogItemsMarshaller: CatalogItemsApiMarshaller
) {

  import CatalogItemsApiPatterns.batchIdPattern

  import catalogItemsMarshaller._

  lazy val route: Route =
    path("catalogs" / "items" / "batch" / batchIdPattern) { (batchId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogItemsService.itemsBatchGet(batchId = batchId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "items" / "batch") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[ItemsBatchPostRequest]){ itemsBatchPostRequest =>
              catalogItemsService.itemsBatchPost(itemsBatchPostRequest = itemsBatchPostRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "items") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsItemsRequest]){ catalogsItemsRequest =>
              catalogItemsService.itemsPost(catalogsItemsRequest = catalogsItemsRequest, adAccountId = adAccountId)
            }
        }
      }
    }
}

object CatalogItemsApiPatterns {

    val batchIdPattern: PathMatcher1[String] = PathMatcher("^[a-zA-Z0-9]+$".r)
}

trait CatalogItemsApiService {

  def itemsBatchGet200(responseCatalogsItemsBatch: CatalogsItemsBatch)(implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]): Route =
    complete((200, responseCatalogsItemsBatch))
  def itemsBatchGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsBatchGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsBatchGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def itemsBatchGet405(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((405, responseError))
  def itemsBatchGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items batch, DataType: CatalogsItemsBatch
   * Code: 401, Message: Not authenticated to access catalogs items batch, DataType: Error
   * Code: 403, Message: Not authorized to access catalogs items batch, DataType: Error
   * Code: 404, Message: Catalogs items batch not found, DataType: Error
   * Code: 405, Message: Method Not Allowed., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsBatchGet(batchId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsBatchPost200(responseCatalogsItemsBatch: CatalogsItemsBatch)(implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]): Route =
    complete((200, responseCatalogsItemsBatch))
  def itemsBatchPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def itemsBatchPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsBatchPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsBatchPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items batch, DataType: CatalogsItemsBatch
   * Code: 400, Message: Invalid request parameters., DataType: Error
   * Code: 401, Message: Not authenticated to post catalogs items, DataType: Error
   * Code: 403, Message: Not authorized to post catalogs items, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsBatchPost(itemsBatchPostRequest: ItemsBatchPostRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def itemsPost200(responseCatalogsItems: CatalogsItems)(implicit toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems]): Route =
    complete((200, responseCatalogsItems))
  def itemsPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def itemsPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def itemsPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def itemsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Response containing the requested catalogs items, DataType: CatalogsItems
   * Code: 400, Message: Invalid request, DataType: Error
   * Code: 401, Message: Not authorized to access catalogs items, DataType: Error
   * Code: 403, Message: Not authorized to access catalogs items, DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def itemsPost(catalogsItemsRequest: CatalogsItemsRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogItemsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsItemsRequest: FromEntityUnmarshaller[CatalogsItemsRequest]

  implicit def fromEntityUnmarshallerItemsBatchPostRequest: FromEntityUnmarshaller[ItemsBatchPostRequest]



  implicit def toEntityMarshallerCatalogsItemsBatch: ToEntityMarshaller[CatalogsItemsBatch]

  implicit def toEntityMarshallerCatalogsItems: ToEntityMarshaller[CatalogsItems]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

