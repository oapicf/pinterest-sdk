
package org.openapitools.client.model


case class BulkUpsertRequestUpdate (
    _adGroups: Option[List[AdGroupUpdateRequest]],
    _ads: Option[List[AdUpdateRequest]],
    _campaigns: Option[List[CampaignUpdateRequest]],
    _catalogProductGroups: Option[List[BulkUpsertRequestUpdateCatalogProductGroupsItems]],
    _keywords: Option[List[KeywordUpdateGenerated]],
    _labels: Option[List[LabelBulkUpdateRequest]],
    _productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
    _schedules: Option[List[ScheduleUpdateRequest]]
)
object BulkUpsertRequestUpdate {
    def toStringBody(var_adGroups: Object, var_ads: Object, var_campaigns: Object, var_catalogProductGroups: Object, var_keywords: Object, var_labels: Object, var_productGroups: Object, var_schedules: Object) =
        s"""
        | {
        | "adGroups":$var_adGroups,"ads":$var_ads,"campaigns":$var_campaigns,"catalogProductGroups":$var_catalogProductGroups,"keywords":$var_keywords,"labels":$var_labels,"productGroups":$var_productGroups,"schedules":$var_schedules
        | }
        """.stripMargin
}
