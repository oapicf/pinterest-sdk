package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountPMPName.
  * @param id Salesforce id for PMP
  * @param name Display name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SSIOAccountPMPName(
  id: Option[String],
  name: Option[String]
)

object SSIOAccountPMPName {
  implicit lazy val sSIOAccountPMPNameJsonFormat: Format[SSIOAccountPMPName] = Json.format[SSIOAccountPMPName]
}

