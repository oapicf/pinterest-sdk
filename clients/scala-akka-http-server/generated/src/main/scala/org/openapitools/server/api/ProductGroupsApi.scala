package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountsCatalogsProductGroupsList200Response
import org.openapitools.server.model.Error


class ProductGroupsApi(
    productGroupsService: ProductGroupsApiService,
    productGroupsMarshaller: ProductGroupsApiMarshaller
) {

  import ProductGroupsApiPatterns.adAccountIdPattern

  import productGroupsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "product_groups" / "catalogs") { (adAccountId) => 
      get { 
        parameters("feed_profile_id".as[String].?) { (feedProfileId) => 
            productGroupsService.adAccountsCatalogsProductGroupsList(adAccountId = adAccountId, feedProfileId = feedProfileId)
        }
      }
    }
}

object ProductGroupsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ProductGroupsApiService {

  def adAccountsCatalogsProductGroupsList200(responseAdAccountsCatalogsProductGroupsList200Response: AdAccountsCatalogsProductGroupsList200Response)(implicit toEntityMarshallerAdAccountsCatalogsProductGroupsList200Response: ToEntityMarshaller[AdAccountsCatalogsProductGroupsList200Response]): Route =
    complete((200, responseAdAccountsCatalogsProductGroupsList200Response))
  def adAccountsCatalogsProductGroupsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsCatalogsProductGroupsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountsCatalogsProductGroupsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsCatalogsProductGroupsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountsCatalogsProductGroupsList200Response
   * Code: 400, Message: Invalid ad account ads parameters., DataType: Error
   * Code: 401, Message: Access Denied. This can happen if account is not yet approved to operate as Merchant on Pinterest., DataType: Error
   * Code: 404, Message: Merchant data not found., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def adAccountsCatalogsProductGroupsList(adAccountId: String, feedProfileId: Option[String])
      (implicit toEntityMarshallerAdAccountsCatalogsProductGroupsList200Response: ToEntityMarshaller[AdAccountsCatalogsProductGroupsList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ProductGroupsApiMarshaller {


  implicit def toEntityMarshallerAdAccountsCatalogsProductGroupsList200Response: ToEntityMarshaller[AdAccountsCatalogsProductGroupsList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

