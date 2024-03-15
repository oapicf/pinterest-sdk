
package org.openapitools.client.model


case class AudienceDemographicValue (
    /* Unique key for demographic item */
    _key: Option[String],
    /* Display name for demographic */
    _name: Option[String],
    /* Value of demographic item as a percent of total audience */
    _ratio: Option[Number]
)
object AudienceDemographicValue {
    def toStringBody(var_key: Object, var_name: Object, var_ratio: Object) =
        s"""
        | {
        | "key":$var_key,"name":$var_name,"ratio":$var_ratio
        | }
        """.stripMargin
}
