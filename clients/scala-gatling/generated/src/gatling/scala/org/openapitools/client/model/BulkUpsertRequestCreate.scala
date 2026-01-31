
package org.openapitools.client.model


case class BulkUpsertRequestCreate (
    _adGroups: Option[List[AdGroupCreateRequest]],
    _ads: Option[List[AdCreateRequest]],
    _campaigns: Option[List[CampaignCreateRequest]],
    _catalogProductGroups: Option[List[MultipleProductGroupsInner]],
    _keywords: Option[List[KeywordsRequest]],
    _labels: Option[List[LabelCreateRequest]],
    _productGroups: Option[List[ProductGroupPromotionCreateRequest]]
)
object BulkUpsertRequestCreate {
    def toStringBody(var_adGroups: Object, var_ads: Object, var_campaigns: Object, var_catalogProductGroups: Object, var_keywords: Object, var_labels: Object, var_productGroups: Object) =
        s"""
        | {
        | "adGroups":$var_adGroups,"ads":$var_ads,"campaigns":$var_campaigns,"catalogProductGroups":$var_catalogProductGroups,"keywords":$var_keywords,"labels":$var_labels,"productGroups":$var_productGroups
        | }
        """.stripMargin
}
