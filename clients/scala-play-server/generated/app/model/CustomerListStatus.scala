package model

import play.api.libs.json._

/**
  * Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListStatus(
)

object CustomerListStatus {
  implicit lazy val customerListStatusJsonFormat: Format[CustomerListStatus] = Json.format[CustomerListStatus]
}

