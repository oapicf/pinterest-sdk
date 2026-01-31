package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.{PathMatcher, PathMatcher1}
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Error
import org.openapitools.server.model.EventQualityScore
import org.openapitools.server.model.IngestionSourceOptions
import org.openapitools.server.model.LookbackPeriodOptions
import org.openapitools.server.model.SourcePlatformOptions


class ConversionEqsApi(
    conversionEqsService: ConversionEqsApiService,
    conversionEqsMarshaller: ConversionEqsApiMarshaller
) {

  import ConversionEqsApiPatterns.adAccountIdPattern

  import conversionEqsMarshaller._

  lazy val route: Route =
    path("ad_accounts" / adAccountIdPattern / "conversion_eqs") { (adAccountId) => 
      get { 
        parameters("lookback_period".as[String], "source_platform".as[String].?, "ingestion_source".as[String].?) { (lookbackPeriod, sourcePlatform, ingestionSource) => 
            conversionEqsService.conversionEqsList(lookbackPeriod = lookbackPeriod, adAccountId = adAccountId, sourcePlatform = sourcePlatform, ingestionSource = ingestionSource)
        }
      }
    }
}

object ConversionEqsApiPatterns {

    val adAccountIdPattern: PathMatcher1[String] = PathMatcher("^\\d+$".r)
}

trait ConversionEqsApiService {

  def conversionEqsList200(responseEventQualityScorearray: Seq[EventQualityScore])(implicit toEntityMarshallerEventQualityScorearray: ToEntityMarshaller[Seq[EventQualityScore]]): Route =
    complete((200, responseEventQualityScorearray))
  def conversionEqsList400(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((400, responseError))
  def conversionEqsList401(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((401, responseError))
  def conversionEqsList403(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((403, responseError))
  def conversionEqsList404(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((404, responseError))
  def conversionEqsList429(responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((429, responseError))
  def conversionEqsListDefault(statusCode: Int, responseError: Error)(implicit toEntityMarshallerError: ToEntityMarshaller[Error]): Route =
    complete((statusCode, responseError))
  /**
   * Code: 200, Message: The request has succeeded., DataType: Seq[EventQualityScore]
   * Code: 400, Message: The request could not be understood by the server due to unexpected data., DataType: Error
   * Code: 401, Message: Authentication is required and has either failed or not been provided., DataType: Error
   * Code: 403, Message: The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource., DataType: Error
   * Code: 404, Message: The requested resource could not be found on this server., DataType: Error
   * Code: 429, Message: The user has sent too many requests in a given amount of time and is being rate limited., DataType: Error
   * Code: 0, Message: An unexpected error response., DataType: Error
   */
  def conversionEqsList(lookbackPeriod: String, adAccountId: String, sourcePlatform: Option[String], ingestionSource: Option[String])
      (implicit toEntityMarshallerEventQualityScorearray: ToEntityMarshaller[Seq[EventQualityScore]], toEntityMarshallerError: ToEntityMarshaller[Error]): Route

}

trait ConversionEqsApiMarshaller {


  implicit def toEntityMarshallerEventQualityScorearray: ToEntityMarshaller[Seq[EventQualityScore]]

  implicit def toEntityMarshallerError: ToEntityMarshaller[Error]

}

