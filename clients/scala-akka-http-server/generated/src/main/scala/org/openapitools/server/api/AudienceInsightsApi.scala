package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AudienceInsightType
import org.openapitools.server.model.AudienceInsights
import org.openapitools.server.model.AudienceInsightsScopeAndTypeGet200Response
import org.openapitools.server.model.Error


class AudienceInsightsApi(
    audienceInsightsService: AudienceInsightsApiService,
    audienceInsightsMarshaller: AudienceInsightsApiMarshaller
) {

  import AudienceInsightsApiPatterns.adAccountIdPattern

  import audienceInsightsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "audience_insights") { (adAccountId) => 
      get { 
        parameters("audience_insight_type".as[String]) { (audienceInsightType) => 
            audienceInsightsService.audienceInsightsGet(adAccountId = adAccountId, audienceInsightType = audienceInsightType)
        }
      }
    } ~
    path("ad_accounts" / adAccountIdPattern / "insights" / "audiences") { (adAccountId) => 
      get {  
            audienceInsightsService.audienceInsightsScopeAndTypeGet(adAccountId = adAccountId)
      }
    }
}

object AudienceInsightsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("""^\\d+$""".r)
}

trait AudienceInsightsApiService {

  def audienceInsightsGet200(responseAudienceInsights: AudienceInsights)(implicit toEntityMarshallerAudienceInsights: ToEntityMarshaller[AudienceInsights]): Route =
    complete((200, responseAudienceInsights))
  def audienceInsightsGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audienceInsightsGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audienceInsightsGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audienceInsightsGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audienceInsightsGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audienceInsightsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AudienceInsights
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audienceInsightsGet(adAccountId: String, audienceInsightType: String)
      (implicit toEntityMarshallerAudienceInsights: ToEntityMarshaller[AudienceInsights], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audienceInsightsScopeAndTypeGet200(responseAudienceInsightsScopeAndTypeGet200Response: AudienceInsightsScopeAndTypeGet200Response)(implicit toEntityMarshallerAudienceInsightsScopeAndTypeGet200Response: ToEntityMarshaller[AudienceInsightsScopeAndTypeGet200Response]): Route =
    complete((200, responseAudienceInsightsScopeAndTypeGet200Response))
  def audienceInsightsScopeAndTypeGet400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def audienceInsightsScopeAndTypeGet401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def audienceInsightsScopeAndTypeGet403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def audienceInsightsScopeAndTypeGet404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def audienceInsightsScopeAndTypeGet429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def audienceInsightsScopeAndTypeGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: AudienceInsightsScopeAndTypeGet200Response
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def audienceInsightsScopeAndTypeGet(adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAudienceInsightsScopeAndTypeGet200Response: ToEntityMarshaller[AudienceInsightsScopeAndTypeGet200Response]): Route

}

trait AudienceInsightsApiMarshaller {


  implicit def toEntityMarshallerAudienceInsights: ToEntityMarshaller[AudienceInsights]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAudienceInsightsScopeAndTypeGet200Response: ToEntityMarshaller[AudienceInsightsScopeAndTypeGet200Response]

}

