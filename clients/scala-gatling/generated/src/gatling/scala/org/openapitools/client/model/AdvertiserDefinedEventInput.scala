
package org.openapitools.client.model


case class AdvertiserDefinedEventInput (
    /* Pinterest standard event type to map this custom event to for campaign optimization and reporting */
    _mappedConversionType: AdvertiserDefinedEventMappingType,
    /* Raw string name of the event */
    _name: String
)
object AdvertiserDefinedEventInput {
    def toStringBody(var_mappedConversionType: Object, var_name: Object) =
        s"""
        | {
        | "mappedConversionType":$var_mappedConversionType,"name":$var_name
        | }
        """.stripMargin
}
