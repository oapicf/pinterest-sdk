package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.AudienceDefinitionResponse
import org.openapitools.server.model.AudienceInsightType
import org.openapitools.server.model.AudienceInsightsResponse
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

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait AudienceInsightsApiService {

  def audienceInsightsGet200(responseAudienceInsightsResponse: AudienceInsightsResponse)(implicit toEntityMarshallerAudienceInsightsResponse: ToEntityMarshaller[AudienceInsightsResponse]): Route =
    complete((200, responseAudienceInsightsResponse))
  def audienceInsightsGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AudienceInsightsResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audienceInsightsGet(adAccountId: String, audienceInsightType: String)
      (implicit toEntityMarshallerAudienceInsightsResponse: ToEntityMarshaller[AudienceInsightsResponse], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

  def audienceInsightsScopeAndTypeGet200(responseAudienceDefinitionResponse: AudienceDefinitionResponse)(implicit toEntityMarshallerAudienceDefinitionResponse: ToEntityMarshaller[AudienceDefinitionResponse]): Route =
    complete((200, responseAudienceDefinitionResponse))
  def audienceInsightsScopeAndTypeGetDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: Success, DataType: AudienceDefinitionResponse
   * Code: 0, Message: Unexpected error, DataType: Error
   */
  def audienceInsightsScopeAndTypeGet(adAccountId: String)
      (implicit toEntityMarshallerError: ToEntityMarshaller[Error], toEntityMarshallerAudienceDefinitionResponse: ToEntityMarshaller[AudienceDefinitionResponse]): Route

}

trait AudienceInsightsApiMarshaller {


  implicit def toEntityMarshallerAudienceInsightsResponse: ToEntityMarshaller[AudienceInsightsResponse]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

  implicit def toEntityMarshallerAudienceDefinitionResponse: ToEntityMarshaller[AudienceDefinitionResponse]

}

