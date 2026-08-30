
package org.openapitools.client.model


case class AdvertiserDefinedEvent (
    /* Standard type mapped to ADE for optimization */
    _mappedConversionType: Option[ConversionTagTypeOptimal],
    /* Raw string name of the event, usually logged as raw_event_name in our dataset */
    _name: Option[String]
)
object AdvertiserDefinedEvent {
    def toStringBody(var_mappedConversionType: Object, var_name: Object) =
        s"""
        | {
        | "mappedConversionType":$var_mappedConversionType,"name":$var_name
        | }
        """.stripMargin
}
