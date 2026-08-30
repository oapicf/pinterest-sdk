package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.server.model.Error
import org.openapitools.server.model.LeadSubscription
import org.openapitools.server.model.LeadSubscriptionPostParamsCreate


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
        parameters("bookmark".as[String].?, "page_size".as[Int].?(25)) { (bookmark, pageSize) => 
            leadAdsService.adAccountsSubscriptionsGetList(adAccountId = adAccountId, bookmark = bookmark, pageSize = pageSize)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "leads" / "subscriptions") { (adAccountId) => 
      post {  
            entity(as[LeadSubscriptionPostParamsCreate]){ leadSubscriptionPostParamsCreate =>
              leadAdsService.adAccountsSubscriptionsPost(adAccountId = adAccountId, leadSubscriptionPostParamsCreate = leadSubscriptionPostParamsCreate)
            }
      }
    }
}

object LeadAdsApiPatterns {

    val subscriptionIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait LeadAdsApiService {

  def adAccountsSubscriptionsDelById200(responseLeadSubscription: LeadSubscription)(implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription]): Route =
    complete((200, responseLeadSubscription))
  def adAccountsSubscriptionsDelById204: Route =
    complete((204, "Resource deleted successfully."))
  def adAccountsSubscriptionsDelById400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsDelById401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountsSubscriptionsDelById403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsDelById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsSubscriptionsDelById429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adAccountsSubscriptionsDelByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadSubscription
   * Code: 204, Message: Resource deleted successfully.
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountsSubscriptionsDelById(adAccountId: String, subscriptionId: String)
      (implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsGetById200(responseLeadSubscription: LeadSubscription)(implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription]): Route =
    complete((200, responseLeadSubscription))
  def adAccountsSubscriptionsGetById400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsGetById401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountsSubscriptionsGetById403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsGetById404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsSubscriptionsGetById429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adAccountsSubscriptionsGetByIdDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadSubscription
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountsSubscriptionsGetById(adAccountId: String, subscriptionId: String)
      (implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsGetList200(responseAdAccountsSubscriptionsGetList200Response: AdAccountsSubscriptionsGetList200Response)(implicit toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response]): Route =
    complete((200, responseAdAccountsSubscriptionsGetList200Response))
  def adAccountsSubscriptionsGetList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsGetList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def adAccountsSubscriptionsGetList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsGetList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def adAccountsSubscriptionsGetList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def adAccountsSubscriptionsGetListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AdAccountsSubscriptionsGetList200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountsSubscriptionsGetList(adAccountId: String, bookmark: Option[String], pageSize: Int)
      (implicit toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def adAccountsSubscriptionsPost200(responseLeadSubscription: LeadSubscription)(implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription]): Route =
    complete((200, responseLeadSubscription))
  def adAccountsSubscriptionsPost400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def adAccountsSubscriptionsPost403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def adAccountsSubscriptionsPostDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: LeadSubscription
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def adAccountsSubscriptionsPost(adAccountId: String, leadSubscriptionPostParamsCreate: LeadSubscriptionPostParamsCreate)
      (implicit toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait LeadAdsApiMarshaller {
  implicit def fromEntityUnmarshallerLeadSubscriptionPostParamsCreate: FromEntityUnmarshaller[LeadSubscriptionPostParamsCreate]



  implicit def toEntityMarshallerAdAccountsSubscriptionsGetList200Response: ToEntityMarshaller[AdAccountsSubscriptionsGetList200Response]

  implicit def toEntityMarshallerLeadSubscription: ToEntityMarshaller[LeadSubscription]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

