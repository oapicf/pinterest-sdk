package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CatalogsLocalStoresCreate200ResponseInner
import org.openapitools.server.model.CatalogsLocalStoresDelete200ResponseInner
import org.openapitools.server.model.CatalogsLocalStoresList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.LocalInventoryItemsBatch
import org.openapitools.server.model.LocalInventoryItemsBatchCreate
import org.openapitools.server.model.LocalInventoryItemsGet
import org.openapitools.server.model.LocalInventoryItemsGetCreate
import org.openapitools.server.model.LocalStore
import org.openapitools.server.model.LocalStoreBatchUpdate
import org.openapitools.server.model.LocalStoreCreate
import org.openapitools.server.model.SupplementalItemsBatchResponse


class CatalogSupplementalApi(
    catalogSupplementalService: CatalogSupplementalApiService,
    catalogSupplementalMarshaller: CatalogSupplementalApiMarshaller
) {

  import CatalogSupplementalApiPatterns.batchIdPattern
import CatalogSupplementalApiPatterns.catalogIdPattern

  import catalogSupplementalMarshaller._

  lazy val route: Route =
    path("catalogs" / catalogIdPattern / "local_inventory_items" / "batch") { (catalogId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[LocalInventoryItemsBatchCreate]){ localInventoryItemsBatchCreate =>
              catalogSupplementalService.catalogsLocalInventoryItemsBatchOperate(catalogId = catalogId, localInventoryItemsBatchCreate = localInventoryItemsBatchCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "local_inventory_items" / "query") { (catalogId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[LocalInventoryItemsGetCreate]){ localInventoryItemsGetCreate =>
              catalogSupplementalService.catalogsLocalInventoryItemsPost(catalogId = catalogId, localInventoryItemsGetCreate = localInventoryItemsGetCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "local_stores") { (catalogId) => 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[Seq[LocalStoreCreate]]){ localStoreCreate =>
              catalogSupplementalService.catalogsLocalStoresCreate(catalogId = catalogId, localStoreCreate = localStoreCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "local_stores") { (catalogId) => 
      delete { 
        parameters("ids".as[String], "ad_account_id".as[String].?) { (ids, adAccountId) => 
            catalogSupplementalService.catalogsLocalStoresDelete(catalogId = catalogId, ids = ids, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "local_stores") { (catalogId) => 
      get { 
        parameters("ids".as[String].?, "ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (ids, adAccountId, bookmark, pageSize) => 
            catalogSupplementalService.catalogsLocalStoresList(catalogId = catalogId, ids = ids, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "local_stores") { (catalogId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[Seq[LocalStoreBatchUpdate]]){ localStoreBatchUpdate =>
              catalogSupplementalService.catalogsLocalStoresUpdate(catalogId = catalogId, localStoreBatchUpdate = localStoreBatchUpdate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / catalogIdPattern / "supplemental_items" / "batch" / batchIdPattern) { (catalogId, batchId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogSupplementalService.catalogsSupplementalItemsBatchGet(catalogId = catalogId, batchId = batchId, adAccountId = adAccountId)
        }
      }
    }
}

object CatalogSupplementalApiPatterns {

    val batchIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val catalogIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CatalogSupplementalApiService {

  def catalogsLocalInventoryItemsBatchOperate200(responseSupplementalItemsBatchResponse: SupplementalItemsBatchResponse)(implicit toEntityMarshallerSupplementalItemsBatchResponse: ToEntityMarshaller[SupplementalItemsBatchResponse]): Route =
    complete((200, responseSupplementalItemsBatchResponse))
  def catalogsLocalInventoryItemsBatchOperate201(responseLocalInventoryItemsBatch: LocalInventoryItemsBatch)(implicit toEntityMarshallerLocalInventoryItemsBatch: ToEntityMarshaller[LocalInventoryItemsBatch]): Route =
    complete((201, responseLocalInventoryItemsBatch))
  def catalogsLocalInventoryItemsBatchOperate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalInventoryItemsBatchOperate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalInventoryItemsBatchOperate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalInventoryItemsBatchOperate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalInventoryItemsBatchOperate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalInventoryItemsBatchOperateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SupplementalItemsBatchResponse
   * Code: 201, Message: Resource create operation completed successfully., DataType: LocalInventoryItemsBatch
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalInventoryItemsBatchOperate(catalogId: String, localInventoryItemsBatchCreate: LocalInventoryItemsBatchCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerLocalInventoryItemsBatch: ToEntityMarshaller[LocalInventoryItemsBatch], toEntityMarshallerSupplementalItemsBatchResponse: ToEntityMarshaller[SupplementalItemsBatchResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsLocalInventoryItemsPost200(responseLocalInventoryItemsGet: LocalInventoryItemsGet)(implicit toEntityMarshallerLocalInventoryItemsGet: ToEntityMarshaller[LocalInventoryItemsGet]): Route =
    complete((200, responseLocalInventoryItemsGet))
  def catalogsLocalInventoryItemsPost201(responseLocalInventoryItemsGet: LocalInventoryItemsGet)(implicit toEntityMarshallerLocalInventoryItemsGet: ToEntityMarshaller[LocalInventoryItemsGet]): Route =
    complete((201, responseLocalInventoryItemsGet))
  def catalogsLocalInventoryItemsPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalInventoryItemsPost401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalInventoryItemsPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalInventoryItemsPost404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalInventoryItemsPost429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalInventoryItemsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LocalInventoryItemsGet
   * Code: 201, Message: Resource create operation completed successfully., DataType: LocalInventoryItemsGet
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalInventoryItemsPost(catalogId: String, localInventoryItemsGetCreate: LocalInventoryItemsGetCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerLocalInventoryItemsGet: ToEntityMarshaller[LocalInventoryItemsGet], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsLocalStoresCreate200(responseCatalogsLocalStoresCreate200ResponseInnerarray: Seq[CatalogsLocalStoresCreate200ResponseInner])(implicit toEntityMarshallerCatalogsLocalStoresCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresCreate200ResponseInner]]): Route =
    complete((200, responseCatalogsLocalStoresCreate200ResponseInnerarray))
  def catalogsLocalStoresCreate201(responseLocalStorearray: Seq[LocalStore])(implicit toEntityMarshallerLocalStorearray: ToEntityMarshaller[Seq[LocalStore]]): Route =
    complete((201, responseLocalStorearray))
  def catalogsLocalStoresCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalStoresCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalStoresCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalStoresCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalStoresCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalStoresCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CatalogsLocalStoresCreate200ResponseInner]
   * Code: 201, Message: Resource create operation completed successfully., DataType: Seq[LocalStore]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalStoresCreate(catalogId: String, localStoreCreate: Seq[LocalStoreCreate], adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsLocalStoresCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresCreate200ResponseInner]], toEntityMarshallerLocalStorearray: ToEntityMarshaller[Seq[LocalStore]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsLocalStoresDelete200(responseCatalogsLocalStoresDelete200ResponseInnerarray: Seq[CatalogsLocalStoresDelete200ResponseInner])(implicit toEntityMarshallerCatalogsLocalStoresDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresDelete200ResponseInner]]): Route =
    complete((200, responseCatalogsLocalStoresDelete200ResponseInnerarray))
  def catalogsLocalStoresDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def catalogsLocalStoresDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalStoresDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalStoresDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalStoresDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalStoresDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalStoresDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CatalogsLocalStoresDelete200ResponseInner]
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalStoresDelete(catalogId: String, ids: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalogsLocalStoresDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresDelete200ResponseInner]]): Route

  def catalogsLocalStoresList200(responseCatalogsLocalStoresList200Response: CatalogsLocalStoresList200Response)(implicit toEntityMarshallerCatalogsLocalStoresList200Response: ToEntityMarshaller[CatalogsLocalStoresList200Response]): Route =
    complete((200, responseCatalogsLocalStoresList200Response))
  def catalogsLocalStoresList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalStoresList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalStoresList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalStoresList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalStoresList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalStoresListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsLocalStoresList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalStoresList(catalogId: String, ids: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerCatalogsLocalStoresList200Response: ToEntityMarshaller[CatalogsLocalStoresList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsLocalStoresUpdate200(responseCatalogsLocalStoresCreate200ResponseInnerarray: Seq[CatalogsLocalStoresCreate200ResponseInner])(implicit toEntityMarshallerCatalogsLocalStoresCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresCreate200ResponseInner]]): Route =
    complete((200, responseCatalogsLocalStoresCreate200ResponseInnerarray))
  def catalogsLocalStoresUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsLocalStoresUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsLocalStoresUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsLocalStoresUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsLocalStoresUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsLocalStoresUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[CatalogsLocalStoresCreate200ResponseInner]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsLocalStoresUpdate(catalogId: String, localStoreBatchUpdate: Seq[LocalStoreBatchUpdate], adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsLocalStoresCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresCreate200ResponseInner]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsSupplementalItemsBatchGet200(responseSupplementalItemsBatchResponse: SupplementalItemsBatchResponse)(implicit toEntityMarshallerSupplementalItemsBatchResponse: ToEntityMarshaller[SupplementalItemsBatchResponse]): Route =
    complete((200, responseSupplementalItemsBatchResponse))
  def catalogsSupplementalItemsBatchGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsSupplementalItemsBatchGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsSupplementalItemsBatchGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsSupplementalItemsBatchGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsSupplementalItemsBatchGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsSupplementalItemsBatchGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: SupplementalItemsBatchResponse
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsSupplementalItemsBatchGet(catalogId: String, batchId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerSupplementalItemsBatchResponse: ToEntityMarshaller[SupplementalItemsBatchResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogSupplementalApiMarshaller {
  implicit def fromEntityUnmarshallerLocalInventoryItemsBatchCreate: FromEntityUnmarshaller[LocalInventoryItemsBatchCreate]

  implicit def fromEntityUnmarshallerLocalStoreBatchUpdateList: FromEntityUnmarshaller[Seq[LocalStoreBatchUpdate]]

  implicit def fromEntityUnmarshallerLocalStoreCreateList: FromEntityUnmarshaller[Seq[LocalStoreCreate]]

  implicit def fromEntityUnmarshallerLocalInventoryItemsGetCreate: FromEntityUnmarshaller[LocalInventoryItemsGetCreate]



  implicit def toEntityMarshallerCatalogsLocalStoresList200Response: ToEntityMarshaller[CatalogsLocalStoresList200Response]

  implicit def toEntityMarshallerLocalInventoryItemsBatch: ToEntityMarshaller[LocalInventoryItemsBatch]

  implicit def toEntityMarshallerCatalogsLocalStoresCreate200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresCreate200ResponseInner]]

  implicit def toEntityMarshallerLocalStorearray: ToEntityMarshaller[Seq[LocalStore]]

  implicit def toEntityMarshallerSupplementalItemsBatchResponse: ToEntityMarshaller[SupplementalItemsBatchResponse]

  implicit def toEntityMarshallerLocalInventoryItemsGet: ToEntityMarshaller[LocalInventoryItemsGet]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCatalogsLocalStoresDelete200ResponseInnerarray: ToEntityMarshaller[Seq[CatalogsLocalStoresDelete200ResponseInner]]

}

