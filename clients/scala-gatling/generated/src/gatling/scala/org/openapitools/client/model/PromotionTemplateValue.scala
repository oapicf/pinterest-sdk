
package org.openapitools.client.model


case class PromotionTemplateValue (
    /* Numeric value. */
    _amount: Option[Number],
    _currencyCode: Option[Currency],
    /* Custom text. */
    _customText: Option[String],
    /* Percent value. */
    _percent: Option[Number]
)
object PromotionTemplateValue {
    def toStringBody(var_amount: Object, var_currencyCode: Object, var_customText: Object, var_percent: Object) =
        s"""
        | {
        | "amount":$var_amount,"currencyCode":$var_currencyCode,"customText":$var_customText,"percent":$var_percent
        | }
        """.stripMargin
}
