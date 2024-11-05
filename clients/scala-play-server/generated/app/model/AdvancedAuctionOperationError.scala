package model

import play.api.libs.json._

/**
  * Error which occurred when applying a bid options operation to a specific item.
  * @param code The error code for the item bid option operation validation error
  * @param message Message describing the item bid option operation validation error
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdvancedAuctionOperationError(
  code: Option[Int],
  message: Option[String]
)

object AdvancedAuctionOperationError {
  implicit lazy val advancedAuctionOperationErrorJsonFormat: Format[AdvancedAuctionOperationError] = Json.format[AdvancedAuctionOperationError]
}

