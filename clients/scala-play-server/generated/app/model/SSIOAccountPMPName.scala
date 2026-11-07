package model

import play.api.libs.json._

/**
  * Pinterest marketing partner name.
  * @param id Salesforce id for PMP
  * @param name Display name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SSIOAccountPMPName(
  id: Option[String],
  name: Option[String]
)

object SSIOAccountPMPName {
  implicit lazy val sSIOAccountPMPNameJsonFormat: Format[SSIOAccountPMPName] = Json.format[SSIOAccountPMPName]
}

