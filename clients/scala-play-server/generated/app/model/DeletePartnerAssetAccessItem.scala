package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnerAssetAccessItem.
  * @param assetId Unique identifier of the business asset.
  * @param partnerId Unique identifier of a business partner to update asset access to.
  * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeletePartnerAssetAccessItem(
  assetId: String,
  partnerId: String,
  partnerType: Option[DeletePartnerAssetAccessItem.PartnerType.Value]
)

object DeletePartnerAssetAccessItem {
  implicit lazy val deletePartnerAssetAccessItemJsonFormat: Format[DeletePartnerAssetAccessItem] = Json.format[DeletePartnerAssetAccessItem]

  // noinspection TypeAnnotation
  object PartnerType extends Enumeration {
    val INTERNAL = Value("INTERNAL")
    val EXTERNAL = Value("EXTERNAL")

    type PartnerType = Value
    implicit lazy val PartnerTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

