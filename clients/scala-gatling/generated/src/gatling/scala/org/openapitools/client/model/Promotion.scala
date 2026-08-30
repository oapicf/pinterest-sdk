
package org.openapitools.client.model


case class Promotion (
    /* The Ad Account ID that this promotion belongs to. */
    _adAccountId: String,
    _discountStatus: Option[DiscountStatus],
    /* Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
    _endTime: Option[Integer],
    /* Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
    _externalId: Option[String],
    /* Promotion ID */
    _id: String,
    /* The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. */
    _platformType: Option[String],
    /* Code that can be used to redeem a promotion. */
    _promotionCode: Option[String],
    /* An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. */
    _promotionCustomId: Option[String],
    /* Internal name for the promotion. */
    _promotionTitle: String,
    _promotionType: PromotionType,
    /* Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
    _startTime: Option[Integer],
    _status: Option[EntityStatus],
    /* List of values to be inserted in the promotion type-specific template. */
    _templateValues: Option[List[PromotionTemplateValue]]
)
object Promotion {
    def toStringBody(var_adAccountId: Object, var_discountStatus: Object, var_endTime: Object, var_externalId: Object, var_id: Object, var_platformType: Object, var_promotionCode: Object, var_promotionCustomId: Object, var_promotionTitle: Object, var_promotionType: Object, var_startTime: Object, var_status: Object, var_templateValues: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"discountStatus":$var_discountStatus,"endTime":$var_endTime,"externalId":$var_externalId,"id":$var_id,"platformType":$var_platformType,"promotionCode":$var_promotionCode,"promotionCustomId":$var_promotionCustomId,"promotionTitle":$var_promotionTitle,"promotionType":$var_promotionType,"startTime":$var_startTime,"status":$var_status,"templateValues":$var_templateValues
        | }
        """.stripMargin
}
