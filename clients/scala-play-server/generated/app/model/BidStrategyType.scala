package model

import play.api.libs.json._

/**
  * Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BidStrategyType(
)

object BidStrategyType {
  implicit lazy val bidStrategyTypeJsonFormat: Format[BidStrategyType] = Json.format[BidStrategyType]
}

