
package org.openapitools.client.model


case class BulkUpsertRequestCreate (
    _adGroups: Option[List[AdGroupCreateRequest]],
    _ads: Option[List[AdCreateRequest]],
    _campaigns: Option[List[CampaignCreateRequest]],
    _catalogProductGroups: Option[List[BulkUpsertRequestCreateCatalogProductGroupsItems]],
    _keywords: Option[List[KeywordsRequest]],
    _labels: Option[List[LabelBulkCreateRequest]],
    _productGroups: Option[List[ProductGroupPromotionCreateRequest]],
    _schedules: Option[List[ScheduleCreateRequest]]
)
object BulkUpsertRequestCreate {
    def toStringBody(var_adGroups: Object, var_ads: Object, var_campaigns: Object, var_catalogProductGroups: Object, var_keywords: Object, var_labels: Object, var_productGroups: Object, var_schedules: Object) =
        s"""
        | {
        | "adGroups":$var_adGroups,"ads":$var_ads,"campaigns":$var_campaigns,"catalogProductGroups":$var_catalogProductGroups,"keywords":$var_keywords,"labels":$var_labels,"productGroups":$var_productGroups,"schedules":$var_schedules
        | }
        """.stripMargin
}
