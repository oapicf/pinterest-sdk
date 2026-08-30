package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Catalog
import org.openapitools.server.model.CatalogCreate
import org.openapitools.server.model.CatalogsAvailableFilterValues
import org.openapitools.server.model.CatalogsList200Response
import org.openapitools.server.model.CatalogsLocale
import org.openapitools.server.model.Country
import org.openapitools.server.model.Error


class CatalogsApi(
    catalogsService: CatalogsApiService,
    catalogsMarshaller: CatalogsApiMarshaller
) {

  
  import catalogsMarshaller._

  lazy val route: Route =
    path("catalogs" / "available_filter_values") { 
      get { 
        parameters("catalog_id".as[String], "feed_id".as[String].?, "country".as[String].?, "language".as[String].?, "ad_account_id".as[String].?) { (catalogId, feedId, country, language, adAccountId) => 
            catalogsService.catalogsAvailableFilterValues(catalogId = catalogId, feedId = feedId, country = country, language = language, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogCreate]){ catalogCreate =>
              catalogsService.catalogsCreate(catalogCreate = catalogCreate, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs") { 
      get { 
        parameters("ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, bookmark, pageSize) => 
            catalogsService.catalogsList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    }
}


trait CatalogsApiService {

  def catalogsAvailableFilterValues200(responseCatalogsAvailableFilterValues: CatalogsAvailableFilterValues)(implicit toEntityMarshallerCatalogsAvailableFilterValues: ToEntityMarshaller[CatalogsAvailableFilterValues]): Route =
    complete((200, responseCatalogsAvailableFilterValues))
  def catalogsAvailableFilterValues400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsAvailableFilterValues401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsAvailableFilterValues403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsAvailableFilterValues404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsAvailableFilterValues429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsAvailableFilterValuesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsAvailableFilterValues
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsAvailableFilterValues(catalogId: String, feedId: Option[String], country: Option[String], language: Option[String], adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsAvailableFilterValues: ToEntityMarshaller[CatalogsAvailableFilterValues], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsCreate200(responseCatalog: Catalog)(implicit toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]): Route =
    complete((200, responseCatalog))
  def catalogsCreate201(responseCatalog: Catalog)(implicit toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]): Route =
    complete((201, responseCatalog))
  def catalogsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Catalog
   * Code: 201, Message: Resource create operation completed successfully., DataType: Catalog
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsCreate(catalogCreate: CatalogCreate, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]): Route

  def catalogsList200(responseCatalogsList200Response: CatalogsList200Response)(implicit toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response]): Route =
    complete((200, responseCatalogsList200Response))
  def catalogsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsList(adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogCreate: FromEntityUnmarshaller[CatalogCreate]



  implicit def toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response]

  implicit def toEntityMarshallerCatalogsAvailableFilterValues: ToEntityMarshaller[CatalogsAvailableFilterValues]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]

}

