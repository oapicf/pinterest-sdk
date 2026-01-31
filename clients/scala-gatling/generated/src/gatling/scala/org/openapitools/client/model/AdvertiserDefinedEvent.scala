
package org.openapitools.client.model


case class AdvertiserDefinedEvent (
    /* raw string name of the event, usually logged as raw_event_name in our dataset */
    _name: Option[String],
    /* standard type mapped to ADE for optimization */
    _mappedConversionType: Option[String]
)
object AdvertiserDefinedEvent {
    def toStringBody(var_name: Object, var_mappedConversionType: Object) =
        s"""
        | {
        | "name":$var_name,"mappedConversionType":$var_mappedConversionType
        | }
        """.stripMargin
}
