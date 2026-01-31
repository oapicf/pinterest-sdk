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
import org.openapitools.server.model.CatalogsProductGroupsList200Response
import org.openapitools.server.model.CatalogsProductGroupsUpdateRequest
import org.openapitools.server.model.CatalogsVerticalProductGroup
import org.openapitools.server.model.Error
import org.openapitools.server.model.MultipleProductGroupsInner


class CatalogProductGroupsApi(
    catalogProductGroupsService: CatalogProductGroupsApiService,
    catalogProductGroupsMarshaller: CatalogProductGroupsApiMarshaller
) {

  import CatalogProductGroupsApiPatterns.productGroupIdPattern

  import catalogProductGroupsMarshaller._

  lazy val route: Route =
    path("catalogs" / "product_groups" / productGroupIdPattern / "products") { (productGroupId) => 
      get { 
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25), "ad_account_id".as[String].?, "pin_metrics".as[Boolean].?(false)) { (bookmark, pageSize, adAccountId, pinMetrics) => 
            catalogProductGroupsService.catalogsProductGroupPinsList(productGroupId = productGroupId, bookmark = bookmark, pageSize = pageSize, adAccountId = adAccountId, pinMetrics = pinMetrics)
        }
      }
    } ~
    path("catalogs" / "product_groups") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[MultipleProductGroupsInner]){ multipleProductGroupsInner =>
              catalogProductGroupsService.catalogsProductGroupsCreate(multipleProductGroupsInner = multipleProductGroupsInner, adAccountId = adAccountId)
            }
        }
      }
    } ~
    path("catalogs" / "product_groups" / "multiple") { 
      post { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            entity(as[Seq[MultipleProductGroupsInner]]){ multipleProductGroupsInner =>
              catalogProductGroupsService.catalogsProductGroupsCreateMany(multipleProductGroupsInner = multipleProductGroupsInner, adAccountId = adAccountId)
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
        parameters("id".as[String].?, "feed_id".as[String].?, "catalog_id".as[String].?, "bookmark".as[String].?, "page_size".as[Int].?(25), "ad_account_id".as[String].?) { (id, feedId, catalogId, bookmark, pageSize, adAccountId) => 
            catalogProductGroupsService.catalogsProductGroupsList(id = id, feedId = feedId, catalogId = catalogId, bookmark = bookmark, pageSize = pageSize, adAccountId = adAccountId)
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
            entity(as[CatalogsProductGroupsUpdateRequest]){ catalogsProductGroupsUpdateRequest =>
              catalogProductGroupsService.catalogsProductGroupsUpdate(productGroupId = productGroupId, catalogsProductGroupsUpdateRequest = catalogsProductGroupsUpdateRequest, adAccountId = adAccountId)
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

    val productGroupIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait CatalogProductGroupsApiService {

  def catalogsProductGroupPinsList200(responseCatalogsProductGroupPinsList200Response: CatalogsProductGroupPinsList200Response)(implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]): Route =
    complete((200, responseCatalogsProductGroupPinsList200Response))
  def catalogsProductGroupPinsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupPinsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupPinsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupPinsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsProductGroupPinsList200Response
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupPinsList(productGroupId: String, bookmark: Option[String], pageSize: Int, adAccountId: Option[String], pinMetrics: Boolean)
      (implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsCreate201(responseCatalogsVerticalProductGroup: CatalogsVerticalProductGroup)(implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]): Route =
    complete((201, responseCatalogsVerticalProductGroup))
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
   * Code: 201, Message: Success, DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: Invalid body., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t create this catalogs product group with this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsCreate(multipleProductGroupsInner: MultipleProductGroupsInner, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsCreateMany201(responseStringarray: Seq[String])(implicit toEntityMarshallerStringarray: ToEntityMarshaller[Seq[String]]): Route =
    complete((201, responseStringarray))
  def catalogsProductGroupsCreateMany400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def catalogsProductGroupsCreateMany401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsCreateMany403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsCreateMany409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsCreateManyDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 201, Message: Success, DataType: Seq[String]
   * Code: 400, Message: Invalid body., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t create this catalogs product group with this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsCreateMany(multipleProductGroupsInner: Seq[MultipleProductGroupsInner], adAccountId: Option[String])
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
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t delete this catalogs product group., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsDelete(productGroupId: String, adAccountId: Option[String])
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsDeleteMany204: Route =
    complete((204, "Catalogs Product Groups deleted successfully."))
  def catalogsProductGroupsDeleteMany401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def catalogsProductGroupsDeleteMany403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def catalogsProductGroupsDeleteMany404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsDeleteMany409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsDeleteManyDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Catalogs Product Groups deleted successfully.
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t delete this catalogs product group., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
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
  def catalogsProductGroupsGet409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: Invalid catalogs product group id parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t get a catalogs product group without an existing catalog., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
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
  def catalogsProductGroupsList409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsProductGroupsList200Response
   * Code: 400, Message: Invalid feed parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 404, Message: Data feed not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t create this catalogs product group with this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsList(id: Option[String], feedId: Option[String], catalogId: Option[String], bookmark: Option[String], pageSize: Int, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsProductGroupsList200Response: ToEntityMarshaller[CatalogsProductGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def catalogsProductGroupsProductCountsGet200(responseCatalogsProductGroupProductCountsVertical: CatalogsProductGroupProductCountsVertical)(implicit toEntityMarshallerCatalogsProductGroupProductCountsVertical: ToEntityMarshaller[CatalogsProductGroupProductCountsVertical]): Route =
    complete((200, responseCatalogsProductGroupProductCountsVertical))
  def catalogsProductGroupsProductCountsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def catalogsProductGroupsProductCountsGet409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsProductCountsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsProductGroupProductCountsVertical
   * Code: 404, Message: Product Group Not Found., DataType: Error
   * Code: 409, Message: Can&#39;t access this feature without an existing catalog., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
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
  def catalogsProductGroupsUpdate409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def catalogsProductGroupsUpdateDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsVerticalProductGroup
   * Code: 400, Message: Invalid parameters., DataType: Error
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 403, Message: Forbidden. Account not approved for catalog product group mutations yet., DataType: Error
   * Code: 404, Message: Catalogs product group not found., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t update this catalogs product group to this value., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def catalogsProductGroupsUpdate(productGroupId: String, catalogsProductGroupsUpdateRequest: CatalogsProductGroupsUpdateRequest, adAccountId: Option[String])
      (implicit toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def productsByProductGroupFilterList200(responseCatalogsProductGroupPinsList200Response: CatalogsProductGroupPinsList200Response)(implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]): Route =
    complete((200, responseCatalogsProductGroupPinsList200Response))
  def productsByProductGroupFilterList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def productsByProductGroupFilterList409(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((409, responseError))
  def productsByProductGroupFilterListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: CatalogsProductGroupPinsList200Response
   * Code: 401, Message: Unauthorized access., DataType: Error
   * Code: 409, Message: Conflict. Can&#39;t get products., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def productsByProductGroupFilterList(catalogsListProductsByFilterRequest: CatalogsListProductsByFilterRequest, bookmark: Option[String], pageSize: Int, adAccountId: Option[String], pinMetrics: Boolean)
      (implicit toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait CatalogProductGroupsApiMarshaller {
  implicit def fromEntityUnmarshallerCatalogsProductGroupsUpdateRequest: FromEntityUnmarshaller[CatalogsProductGroupsUpdateRequest]

  implicit def fromEntityUnmarshallerMultipleProductGroupsInnerList: FromEntityUnmarshaller[Seq[MultipleProductGroupsInner]]

  implicit def fromEntityUnmarshallerCatalogsListProductsByFilterRequest: FromEntityUnmarshaller[CatalogsListProductsByFilterRequest]

  implicit def fromEntityUnmarshallerMultipleProductGroupsInner: FromEntityUnmarshaller[MultipleProductGroupsInner]



  implicit def toEntityMarshallerCatalogsVerticalProductGroup: ToEntityMarshaller[CatalogsVerticalProductGroup]

  implicit def toEntityMarshallerCatalogsProductGroupsList200Response: ToEntityMarshaller[CatalogsProductGroupsList200Response]

  implicit def toEntityMarshallerCatalogsProductGroupPinsList200Response: ToEntityMarshaller[CatalogsProductGroupPinsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerCatalogsProductGroupProductCountsVertical: ToEntityMarshaller[CatalogsProductGroupProductCountsVertical]

}

