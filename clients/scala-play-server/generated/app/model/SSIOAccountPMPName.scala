package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SSIOAccountPMPName.
  * @param name Display name
  * @param id Salesforce id for PMP
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class SSIOAccountPMPName(
  name: Option[String],
  id: Option[String]
)

object SSIOAccountPMPName {
  implicit lazy val sSIOAccountPMPNameJsonFormat: Format[SSIOAccountPMPName] = Json.format[SSIOAccountPMPName]
}

