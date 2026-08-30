package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteBusinessPartnersDelete.
  * @param partnerIds A list of partner ids to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeleteBusinessPartnersDelete(
  partnerIds: List[String],
  partnerType: Option[NullablePartnerType]
)

object DeleteBusinessPartnersDelete {
  implicit lazy val deleteBusinessPartnersDeleteJsonFormat: Format[DeleteBusinessPartnersDelete] = Json.format[DeleteBusinessPartnersDelete]
}

