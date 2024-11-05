package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnerAssetAccessBody_accesses_inner.
  * @param partnerId Unique identifier of a business partner to update asset access to.
  * @param assetId Unique identifier of the business asset.
  * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeletePartnerAssetAccessBodyAccessesInner(
  partnerId: String,
  assetId: String,
  partnerType: Option[DeletePartnerAssetAccessBodyAccessesInner.PartnerType.Value]
)

object DeletePartnerAssetAccessBodyAccessesInner {
  implicit lazy val deletePartnerAssetAccessBodyAccessesInnerJsonFormat: Format[DeletePartnerAssetAccessBodyAccessesInner] = Json.format[DeletePartnerAssetAccessBodyAccessesInner]

  // noinspection TypeAnnotation
  object PartnerType extends Enumeration {
    val INTERNAL = Value("INTERNAL")
    val EXTERNAL = Value("EXTERNAL")

    type PartnerType = Value
    implicit lazy val PartnerTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

