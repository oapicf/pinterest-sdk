package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param audienceId Unique identifier of an audience
  * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(
  audienceId: String,
  operationType: OperationType,
  recipientAccountIds: List[String]
)

object AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody {
  implicit lazy val adAccountToAdAccountSharedAudienceUpdateWithRequiredBodyJsonFormat: Format[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] = Json.format[AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody]
}

