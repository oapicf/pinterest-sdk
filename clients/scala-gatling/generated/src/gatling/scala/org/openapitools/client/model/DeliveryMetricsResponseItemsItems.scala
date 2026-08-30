
package org.openapitools.client.model


case class DeliveryMetricsResponseItemsItems (
    /* Category name */
    _category: Option[String],
    /* How the metric is defined. */
    _definition: Option[String],
    /* Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    _displayName: Option[String],
    /* Metric's name. */
    _name: Option[String]
)
object DeliveryMetricsResponseItemsItems {
    def toStringBody(var_category: Object, var_definition: Object, var_displayName: Object, var_name: Object) =
        s"""
        | {
        | "category":$var_category,"definition":$var_definition,"displayName":$var_displayName,"name":$var_name
        | }
        """.stripMargin
}
