
package org.openapitools.client.model


case class QualityComponents (
    _advertiserExternalId: Option[Map[String, QualityComponentDetails]],
    _clickIdEpik: Option[Map[String, QualityComponentDetails]],
    /* Dedup components. */
    _externalEventId: Option[Map[String, QualityComponentDetails]],
    /* User matching identifiers. */
    _hashedEmail: Option[Map[String, QualityComponentDetails]],
    _hashedMaid: Option[Map[String, QualityComponentDetails]],
    _ipAddress: Option[Map[String, QualityComponentDetails]],
    _orderId: Option[Map[String, QualityComponentDetails]],
    _orderValue: Option[Map[String, QualityComponentDetails]],
    /* Product/event metadata. */
    _productId: Option[Map[String, QualityComponentDetails]],
    _sourceUrl: Option[Map[String, QualityComponentDetails]],
    _userAgent: Option[Map[String, QualityComponentDetails]]
)
object QualityComponents {
    def toStringBody(var_advertiserExternalId: Object, var_clickIdEpik: Object, var_externalEventId: Object, var_hashedEmail: Object, var_hashedMaid: Object, var_ipAddress: Object, var_orderId: Object, var_orderValue: Object, var_productId: Object, var_sourceUrl: Object, var_userAgent: Object) =
        s"""
        | {
        | "advertiserExternalId":$var_advertiserExternalId,"clickIdEpik":$var_clickIdEpik,"externalEventId":$var_externalEventId,"hashedEmail":$var_hashedEmail,"hashedMaid":$var_hashedMaid,"ipAddress":$var_ipAddress,"orderId":$var_orderId,"orderValue":$var_orderValue,"productId":$var_productId,"sourceUrl":$var_sourceUrl,"userAgent":$var_userAgent
        | }
        """.stripMargin
}
