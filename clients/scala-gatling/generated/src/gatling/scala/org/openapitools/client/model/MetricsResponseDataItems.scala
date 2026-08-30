
package org.openapitools.client.model


case class MetricsResponseDataItems (
    /* Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). */
    _metrics: Any,
    /* The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) */
    _targetingType: String,
    /* The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') */
    _targetingValue: String
)
object MetricsResponseDataItems {
    def toStringBody(var_metrics: Object, var_targetingType: Object, var_targetingValue: Object) =
        s"""
        | {
        | "metrics":$var_metrics,"targetingType":$var_targetingType,"targetingValue":$var_targetingValue
        | }
        """.stripMargin
}
