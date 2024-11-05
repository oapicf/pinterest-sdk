package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingResponse.
  * @param audienceSizeLowerBound The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  * @param audienceSizeUpperBound The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupAudienceSizingResponse(
  audienceSizeLowerBound: Option[BigDecimal],
  audienceSizeUpperBound: Option[BigDecimal]
)

object AdGroupAudienceSizingResponse {
  implicit lazy val adGroupAudienceSizingResponseJsonFormat: Format[AdGroupAudienceSizingResponse] = Json.format[AdGroupAudienceSizingResponse]
}

