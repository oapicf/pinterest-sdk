
package org.openapitools.client.model


case class PromotionResponse (
    /* Discount status based on the current time and start and end time of discount */
    _discountStatus: Option[String],
    /* Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
    _endTime: Option[Integer],
    /* Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
    _externalId: Option[String],
    /* The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. */
    _platformType: Option[String],
    /* Code that can be used to redeem a promotion. */
    _promotionCode: Option[String],
    /* An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. */
    _promotionCustomId: Option[String],
    /* Internal name for the promotion. */
    _promotionTitle: Option[String],
    _promotionType: Option[PromotionType],
    /* Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
    _startTime: Option[Integer],
    /* List of values to be inserted in the promotion type-specific template. */
    _templateValues: Option[List[PromotionTemplateValue]],
    /* The Ad Account ID that this promotion belongs to. */
    _adAccountId: Option[String],
    /* Promotion ID */
    _id: Option[String],
    _status: Option[EntityStatus]
)
object PromotionResponse {
    def toStringBody(var_discountStatus: Object, var_endTime: Object, var_externalId: Object, var_platformType: Object, var_promotionCode: Object, var_promotionCustomId: Object, var_promotionTitle: Object, var_promotionType: Object, var_startTime: Object, var_templateValues: Object, var_adAccountId: Object, var_id: Object, var_status: Object) =
        s"""
        | {
        | "discountStatus":$var_discountStatus,"endTime":$var_endTime,"externalId":$var_externalId,"platformType":$var_platformType,"promotionCode":$var_promotionCode,"promotionCustomId":$var_promotionCustomId,"promotionTitle":$var_promotionTitle,"promotionType":$var_promotionType,"startTime":$var_startTime,"templateValues":$var_templateValues,"adAccountId":$var_adAccountId,"id":$var_id,"status":$var_status
        | }
        """.stripMargin
}
