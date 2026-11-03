package model

import play.api.libs.json._

/**
  * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CustomerListStatus(
)

object CustomerListStatus {
  implicit lazy val customerListStatusJsonFormat: Format[CustomerListStatus] = Json.format[CustomerListStatus]
}

