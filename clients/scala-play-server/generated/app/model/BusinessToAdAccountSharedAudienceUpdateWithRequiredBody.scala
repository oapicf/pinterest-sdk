package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  * @param audienceId Unique identifier of an audience
  * @param recipientAccountIds Ad account IDs to share with or revoke from (request) / that received the audience (response).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody(
  audienceId: String,
  operationType: OperationType,
  recipientAccountIds: List[String]
)

object BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {
  implicit lazy val businessToAdAccountSharedAudienceUpdateWithRequiredBodyJsonFormat: Format[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] = Json.format[BusinessToAdAccountSharedAudienceUpdateWithRequiredBody]
}

