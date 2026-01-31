package model

import play.api.libs.json._

/**
  * Error which occurred when applying a bid options operation to a specific item.
  * @param code The error code for the item bid option operation validation error
  * @param message Message describing the item bid option operation validation error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdvancedAuctionOperationError(
  code: Option[Int],
  message: Option[String]
)

object AdvancedAuctionOperationError {
  implicit lazy val advancedAuctionOperationErrorJsonFormat: Format[AdvancedAuctionOperationError] = Json.format[AdvancedAuctionOperationError]
}

