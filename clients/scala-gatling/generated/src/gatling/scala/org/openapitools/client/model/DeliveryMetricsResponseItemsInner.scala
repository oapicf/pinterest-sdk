
package org.openapitools.client.model


case class DeliveryMetricsResponseItemsInner (
    /* Metric's name. */
    _name: Option[String],
    /* Category name */
    _category: Option[String],
    /* How the metric is defined. */
    _definition: Option[String],
    /* Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
    _displayName: Option[String]
)
object DeliveryMetricsResponseItemsInner {
    def toStringBody(var_name: Object, var_category: Object, var_definition: Object, var_displayName: Object) =
        s"""
        | {
        | "name":$var_name,"category":$var_category,"definition":$var_definition,"displayName":$var_displayName
        | }
        """.stripMargin
}
