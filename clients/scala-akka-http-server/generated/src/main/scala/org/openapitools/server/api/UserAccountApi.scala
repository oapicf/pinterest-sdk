package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Account
import org.openapitools.server.model.AnalyticsMetricsResponse
import org.openapitools.server.model.Error
import java.time.LocalDate


class UserAccountApi(
    userAccountService: UserAccountApiService,
    userAccountMarshaller: UserAccountApiMarshaller
) {

  
  import userAccountMarshaller._

  lazy val route: Route =
    path("user_account" / "analytics") { 
      get { 
        parameters("start_date".as[String], "end_date".as[String], "from_claimed_content".as[String].?("BOTH"), "pin_format".as[String].?("ALL"), "app_types".as[String].?("ALL"), "metric_types".as[String].?, "split_field".as[String].?("NO_SPLIT"), "ad_account_id".as[String].?) { (startDate, endDate, fromClaimedContent, pinFormat, appTypes, metricTypes, splitField, adAccountId) => 
            userAccountService.userAccountAnalytics(startDate = startDate, endDate = endDate, fromClaimedContent = fromClaimedContent, pinFormat = pinFormat, appTypes = appTypes, metricTypes = metricTypes, splitField = splitField, adAccountId = adAccountId)
        }
      }
    } ~
    path("user_account") { 
      get { 
        parameters("ad_account_id".as[String].?) { (adAccountId) => 
            userAccountService.userAccountGet(adAccountId = adAccountId)
        }
      }
    }
}


trait UserAccountApiService {

  def userAccountAnalytics200(responseAnalyticsMetricsResponsemap: Map[String, AnalyticsMetricsResponse])(implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]): Route =
    complete((200, responseAnalyticsMetricsResponsemap))
  def userAccountAnalytics403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountAnalyticsDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: Map[String, AnalyticsMetricsResponse]
   * Code: 403, Message: Not authorized to access the user account analytics., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountAnalytics(startDate: String, endDate: String, fromClaimedContent: String, pinFormat: String, appTypes: String, metricTypes: Option[String], splitField: String, adAccountId: Option[String])
      (implicit toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def userAccountGet200(responseAccount: Account)(implicit toEntityMarshallerAccount: ToEntityMarshaller[Account]): Route =
    complete((200, responseAccount))
  def userAccountGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def userAccountGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: response, DataType: Account
   * Code: 403, Message: Not authorized to access the user account., DataType: Error
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def userAccountGet(adAccountId: Option[String])
      (implicit toEntityMarshallerAccount: ToEntityMarshaller[Account], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait UserAccountApiMarshaller {


  implicit def toEntityMarshallerAccount: ToEntityMarshaller[Account]

  implicit def toEntityMarshallerAnalyticsMetricsResponsemap: ToEntityMarshaller[Map[String, AnalyticsMetricsResponse]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

