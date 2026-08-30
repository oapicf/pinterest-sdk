package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.CatalogsListProductsByFilterRequest
import org.openapitools.server.model.CatalogsProductGroupPinsList200Response
import org.openapitools.server.model.CatalogsProductGroupProductCountsVertical
import org.openapitools.server.model.CatalogsProductGroupsCreateManyRequestItems
import org.openapitools.server.model.CatalogsProductGroupsCreateRequestSchema
import org.openapitools.server.model.CatalogsProductGroupsList200Response
import org.openapitools.server.model.CatalogsProductGroupsUpdateRequestSchema
import org.openapitools.server.model.CatalogsVerticalProductGroup
import org.openapitools.server.model.Error


class CatalogProductGroupsApi(
    catalogProductGroupsService: CatalogProductGroupsApiService,
    catalogProductGroupsMarshaller: CatalogProductGroupsApiMarshaller
) {

  import CatalogProductGroupsApiPatterns.productGroupIdPattern

  import catalogProductGroupsMarshaller._

  lazy val route: Route =
    path("catalogs" / "product_groups" / productGroupIdPattern / "products") { (productGroupId) => 
      get { 
        parameters("ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false), "bookmark".as[String].?, "page_size".as[Int].?(25)) { (adAccountId, pinMetrics, bookmark, pageSize) => 
            catalogProductGroupsService.catalogsProductGroupPinsList(productGroupId = productGroupId, adAccountId = adAccountId, pinMetrics = pinMetrics, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "product_groups") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsProductGroupsCreateRequestSchema]){ catalogsProductGroupsCreateRequestSchema =>
              catalogProductGroupsService.catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema = catalogsProductGroupsCreateRequestSchema, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "product_groups" / "multiple") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[Seq[CatalogsProductGroupsCreateManyRequestItems]]){ catalogsProductGroupsCreateManyRequestItems =>
              catalogProductGroupsService.catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems = catalogsProductGroupsCreateManyRequestItems, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern) { (productGroupId) => 
      delete { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogProductGroupsService.catalogsProductGroupsDelete(productGroupId = productGroupId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "product_groups" / "multiple") { 
      delete { 
        parameters("id".as[String], "ad_account_id".as[String].?) { (id, adAccountId) => 
            catalogProductGroupsService.catalogsProductGroupsDeleteMany(id = id, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern) { (productGroupId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogProductGroupsService.catalogsProductGroupsGet(productGroupId = productGroupId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "product_groups") { 
      get { 
        parameters("id".as[String].?, "feed_id".as[String].?, "catalog_id".as[String].?, "ad_account_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25)) { (id, feedId, catalogId, adAccountId, bookmark, pageSize) => 
            catalogProductGroupsService.catalogsProductGroupsList(id = id, feedId = feedId, catalogId = catalogId, adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern / "product_counts") { (productGroupId) => 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            catalogProductGroupsService.catalogsProductGroupsProductCountsGet(productGroupId = productGroupId, adAccountId = adAccountId)
        }
      }
    } ~
    path("catalogs" / "product_groups" / productGroupIdPattern) { (productGroupId) => 
      patch { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[CatalogsProductGroupsUpdateRequestSchema]){ catalogsProductGroupsUpdateRequestSchema =>
              catalogProductGroupsService.catalogsProductGroupsUpdate(productGroupId = productGroupId, catalogsProductGroupsUpdateRequestSchema = catalogsProductGroupsUpdateRequestSchema, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "products" / "get_by_product_group_filters") { 
      post { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false)) { (bookmark, pageSize, adAccountId, pinMetrics) => 
            entity(as[CatalogsListProductsByFilterRequest]){ catalogsListProductsByFilterRequest =>
              catalogProductGroupsService.productsByProductGroupFilterList(catalogsListProductsByFilterRequest = catalogsListProductsByFilterRequest, bookmark = bookmark, pageSize = pageSize, adAccountId = adAccountId, pinMetrics = pinMetrics)
            }
        }
      }
    }
}

object CatalogProductGroupsApiPatterns {

    val productGroupIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait CatalogProductGroupsApiService {

  def catalogsProductGroupPinsList200(responseCatalogsProductGroupPinsList200Response: CatalogsProductGroupPinsList200Response)(implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]): Route =
    complete((200, responseCatalogsProductGroupPinsList200Response))
  def catalogsProductGroupPinsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupPinsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupPinsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupPinsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupPinsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupPinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsProductGroupPinsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupPinsList(productGroupId: String, adAccountId: Option[String], pinMetrics: Boolean, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsCreate200(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((200, responseCatalogsVerticalProductGroup))
  def catalogsProductGroupsCreate201(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((201, responseCatalogsVerticalProductGroup))
  def catalogsProductGroupsCreate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsCreate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsCreate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsCreate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsCreate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsCreateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsVerticalProductGroup
   * Code: 201, Message: Resource create operation completed successfully., DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsCreate(catalogsProductGroupsCreateRequestSchema: CatalogsProductGroupsCreateRequestSchema, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsCreateMany201(responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((201, responseStringarray))
  def catalogsProductGroupsCreateMany400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsCreateMany401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsCreateMany403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsCreateMany404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsCreateMany429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsCreateManyDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: The request has succeeded and a new resource has been created as a result., DataType: Seq[String]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsCreateMany(catalogsProductGroupsCreateManyRequestItems: Seq[CatalogsProductGroupsCreateManyRequestItems], adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsDelete200(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((200, responseCatalogsVerticalProductGroup))
  def catalogsProductGroupsDelete204: Route =
    complete((204, "Resource deleted successfully."))
  def catalogsProductGroupsDelete400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsDelete401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsDelete403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsDelete404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsDelete429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsDeleteDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsVerticalProductGroup
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsDelete(productGroupId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsDeleteMany204: Route =
    complete((204, "Resource deleted successfully."))
  def catalogsProductGroupsDeleteMany400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsDeleteMany401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsDeleteMany403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsDeleteMany404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsDeleteMany429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsDeleteManyDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsDeleteMany(id: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsGet200(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((200, responseCatalogsVerticalProductGroup))
  def catalogsProductGroupsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsGet(productGroupId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsList200(responseCatalogsProductGroupsList200Response: CatalogsProductGroupsList200Response)(implicit toEntityMarshallerCatalogsProductGroupsList200Response: ToEntityMarshaller[CatalogsProductGroupsList200Response]): Route =
    complete((200, responseCatalogsProductGroupsList200Response))
  def catalogsProductGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsProductGroupsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsList(id: Option[String], feedId: Option[String], catalogId: Option[String], adAccountId: Option[String], bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerCatalogsProductGroupsList200Response: ToEntityMarshaller[CatalogsProductGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsProductCountsGet200(responseCatalogsProductGroupProductCountsVertical: CatalogsProductGroupProductCountsVertical)(implicit toEntityMarshallerCatalogsProductGroupProductCountsVertical: ToEntityMarshaller[CatalogsProductGroupProductCountsVertical]): Route =
    complete((200, responseCatalogsProductGroupProductCountsVertical))
  def catalogsProductGroupsProductCountsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsProductCountsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsProductCountsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsProductCountsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsProductCountsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsProductCountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsProductGroupProductCountsVertical
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsProductCountsGet(productGroupId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerCatalogsProductGroupProductCountsVertical: ToEntityMarshaller[CatalogsProductGroupProductCountsVertical]): Route

  def catalogsProductGroupsUpdate200(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((200, responseCatalogsVerticalProductGroup))
  def catalogsProductGroupsUpdate400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsUpdate401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsUpdate403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsUpdate404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsUpdate429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def catalogsProductGroupsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequestSchema: CatalogsProductGroupsUpdateRequestSchema, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productsByProductGroupFilterList200(responseCatalogsProductGroupPinsList200Response: CatalogsProductGroupPinsList200Response)(implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]): Route =
    complete((200, responseCatalogsProductGroupPinsList200Response))
  def productsByProductGroupFilterList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def productsByProductGroupFilterList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productsByProductGroupFilterList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def productsByProductGroupFilterList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def productsByProductGroupFilterList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def productsByProductGroupFilterListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: CatalogsProductGroupPinsList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Int, adAccountId: Option[String], pinMetrics: Boolean)
      (implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogProductGroupsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsProductGroupsCreateManyRequestItemsList: FromEntityUnmarshaller[Seq[CatalogsProductGroupsCreateManyRequestItems]]

  implicit def fromEntityUnmarshallerCatalogsProductGroupsUpdateRequestSchema: FromEntityUnmarshaller[CatalogsProductGroupsUpdateRequestSchema]

  implicit def fromEntityUnmarshallerCatalogsListProductsByFilterRequest: FromEntityUnmarshaller[CatalogsListProductsByFilterRequest]

  implicit def fromEntityUnmarshallerCatalogsProductGroupsCreateRequestSchema: FromEntityUnmarshaller[CatalogsProductGroupsCreateRequestSchema]



  implicit def toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]

  implicit def toEntityMarshallerCatalogsProductGroupsList200Response: ToEntityMarshaller[CatalogsProductGroupsList200Response]

  implicit def toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCatalogsProductGroupProductCountsVertical: ToEntityMarshaller[CatalogsProductGroupProductCountsVertical]

}

