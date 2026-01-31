package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Catalog
import org.openapitools.server.model.CatalogsAvailableFilterValues
import org.openapitools.server.model.CatalogsCreateRequest
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
            entity(as[CatalogsCreateRequest]){ catalogsCreateRequest =>
              catalogsService.catalogsCreate(catalogsCreateRequest = catalogsCreateRequest, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs") { 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "ad_account_id".as[String].?) { (bookmark, pageSize, adAccountId) => 
            catalogsService.catalogsList(bookmark = bookmark, pageSize = pageSize, adAccountId = adAccountId)
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
  def catalogsAvailableFilterValues409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsAvailableFilterValuesDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsAvailableFilterValues
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not authorized to access available filter values., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 409, Message: Can&#39;t access this feature without an existing catalog., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsAvailableFilterValues(catalogId: String, feedId: Option[String], country: Option[String], language: Option[String], adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsAvailableFilterValues: ToEntityMarshaller[CatalogsAvailableFilterValues], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsCreate200(responseCatalog: Catalog)(implicit toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]): Route =
    complete((200, responseCatalog))
  def catalogsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Catalog
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsCreate(catalogsCreateRequest: CatalogsCreateRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]): Route

  def catalogsList200(responseCatalogsList200Response: CatalogsList200Response)(implicit toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response]): Route =
    complete((200, responseCatalogsList200Response))
  def catalogsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsList200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsList(bookmark: Option[String], pageSize: Int, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsCreateRequest: FromEntityUnmarshaller[CatalogsCreateRequest]



  implicit def toEntityMarshallerCatalogsList200Response: ToEntityMarshaller[CatalogsList200Response]

  implicit def toEntityMarshallerCatalogsAvailableFilterValues: ToEntityMarshaller[CatalogsAvailableFilterValues]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCatalog: ToEntityMarshaller[Catalog]

}

