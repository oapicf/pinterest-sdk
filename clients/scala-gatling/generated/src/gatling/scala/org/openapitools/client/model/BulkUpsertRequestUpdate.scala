
package org.openapitools.client.model


case class BulkUpsertRequestUpdate (
    _campaigns: Option[List[CampaignUpdateRequest]],
    _adGroups: Option[List[AdGroupUpdateRequest]],
    _ads: Option[List[AdUpdateRequest]],
    _productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
    _keywords: Option[List[KeywordUpdate]]
)
object BulkUpsertRequestUpdate {
    def toStringBody(var_campaigns: Object, var_adGroups: Object, var_ads: Object, var_productGroups: Object, var_keywords: Object) =
        s"""
        | {
        | "campaigns":$var_campaigns,"adGroups":$var_adGroups,"ads":$var_ads,"productGroups":$var_productGroups,"keywords":$var_keywords
        | }
        """.stripMargin
}
