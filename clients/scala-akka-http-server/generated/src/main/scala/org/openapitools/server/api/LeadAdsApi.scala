package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountCreateSubscriptionRequest
import org.openapitools.server.model.AdAccountCreateSubscriptionResponse
import org.openapitools.server.model.AdAccountGetSubscriptionResponse
import org.openapitools.server.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.server.model.Error


class LeadAdsApi(
    leadAdsService: LeadAdsApiService,
    leadAdsMarshaller: LeadAdsApiMarshaller
) {

  import LeadAdsApiPatterns.subscriptionIdPattern
import LeadAdsApiPatterns.adAccountIdPattern

  import leadAdsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "leads" / "subscriptions" / subscriptionIdPattern) { (adAccountId, subscriptionId) => 
      delete {  
            leadAdsService.adAccountsSubscriptionsDelById(adAccountId = adAccountId, subscriptionId = subscriptionId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "leads" / "subscriptions" / subscriptionIdPattern) { (adAccountId, subscriptionId) => 
      get {  
            leadAdsService.adAccountsSubscriptionsGetById(adAccountId = adAccountId, subscriptionId = subscriptionId)
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "leads" / "subscriptions") { (adAccountId) => 
      get { 
        parameters("page_size".as[Int].?(25), "bookmark".as[String].?) { (pageSize, bookmark) => 
            leadAdsService.adAccountsSubscriptionsGetList(adAccountId = adAccountId, pageSize = pageSize, bookmark = bookmark)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "leads" / "subscriptions") { (adAccountId) => 
      post {  
            entity(as[AdAccountCreateSubscriptionRequest]){ adAccountCreateSubscriptionRequest =>
              leadAdsService.adAccountsSubscriptionsPost(adAccountId = adAccountId, adAccountCreateSubscriptionRequest = adAccountCreateSubscriptionRequest)
            }
      }
    }
}

object LeadAdsApiPatterns {

    val subscriptionIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait LeadAdsApiService {

  def adAccountsSubscriptionsDelById204: Route =
    complete((204, "Subscription deleted successfully"))
  def adAccountsSubscriptionsDelById400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsDelById403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsDelById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsSubscriptionsDelByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 204, Message: Subscription deleted successfully
   * Code: 400, Message: Invalid input parameters., DataType: Error
   * Code: 403, Message: You are not authorized to delete this subscription., DataType: Error
   * Code: 404, Message: Subscription not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsGetById200(responseAdAccountGetSubscriptionResponse: AdAccountGetSubscriptionResponse)(implicit toEntityMarshallerAdAccountGetSubscriptionResponse: ToEntityMarshaller[AdAccountGetSubscriptionResponse]): Route =
    complete((200, responseAdAccountGetSubscriptionResponse))
  def adAccountsSubscriptionsGetById400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsGetById403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsGetById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsSubscriptionsGetByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountGetSubscriptionResponse
   * Code: 400, Message: Invalid input parameters., DataType: Error
   * Code: 403, Message: Can&#39;t access this subscription., DataType: Error
   * Code: 404, Message: Subscription not found., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String)
      (implicit toEntityMarshallerAdAccountGetSubscriptionResponse: ToEntityMarshaller[AdAccountGetSubscriptionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsGetList200(responseAdAccountsSubscriptionsGetList200Response: AdAccountsSubscriptionsGetList200Response)(implicit toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response]): Route =
    complete((200, responseAdAccountsSubscriptionsGetList200Response))
  def adAccountsSubscriptionsGetList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsGetListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountsSubscriptionsGetList200Response
   * Code: 403, Message: Can&#39;t access this subscription., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adAccountsSubscriptionsGetList(adAccountId: String, pageSize: Int, bookmark: Option[String])
      (implicit toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsPost200(responseAdAccountCreateSubscriptionResponse: AdAccountCreateSubscriptionResponse)(implicit toEntityMarshallerAdAccountCreateSubscriptionResponse: ToEntityMarshaller[AdAccountCreateSubscriptionResponse]): Route =
    complete((200, responseAdAccountCreateSubscriptionResponse))
  def adAccountsSubscriptionsPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AdAccountCreateSubscriptionResponse
   * Code: 400, Message: Invalid input parameters., DataType: Error
   * Code: 403, Message: Can&#39;t access this subscription., DataType: Error
   * Code: 0, Message: Unexpected error., DataType: Error
   */
  def adAccountsSubscriptionsPost(adAccountId: String, adAccountCreateSubscriptionRequest: AdAccountCreateSubscriptionRequest)
      (implicit toEntityMarshallerAdAccountCreateSubscriptionResponse: ToEntityMarshaller[AdAccountCreateSubscriptionResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LeadAdsApiMarshaller {
  implicit def fromEntityUnmarshallerAdAccountCreateSubscriptionRequest: FromEntityUnmarshaller[AdAccountCreateSubscriptionRequest]



  implicit def toEntityMarshallerAdAccountGetSubscriptionResponse: ToEntityMarshaller[AdAccountGetSubscriptionResponse]

  implicit def toEntityMarshallerAdAccountCreateSubscriptionResponse: ToEntityMarshaller[AdAccountCreateSubscriptionResponse]

  implicit def toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

