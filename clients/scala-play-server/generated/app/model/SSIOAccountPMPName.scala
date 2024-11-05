package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountPMPName.
  * @param name Display name
  * @param id Salesforce id for PMP
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SSIOAccountPMPName(
  name: Option[String],
  id: Option[String]
)

object SSIOAccountPMPName {
  implicit lazy val sSIOAccountPMPNameJsonFormat: Format[SSIOAccountPMPName] = Json.format[SSIOAccountPMPName]
}

