
package org.openapitools.client.model


case class BulkUpsertRequestCreate (
    _campaigns: Option[List[CampaignCreateRequest]],
    _adGroups: Option[List[AdGroupCreateRequest]],
    _ads: Option[List[AdCreateRequest]],
    _productGroups: Option[List[ProductGroupPromotionCreateRequest]],
    _keywords: Option[List[KeywordsRequest]]
)
object BulkUpsertRequestCreate {
    def toStringBody(var_campaigns: Object, var_adGroups: Object, var_ads: Object, var_productGroups: Object, var_keywords: Object) =
        s"""
        | {
        | "campaigns":$var_campaigns,"adGroups":$var_adGroups,"ads":$var_ads,"productGroups":$var_productGroups,"keywords":$var_keywords
        | }
        """.stripMargin
}
