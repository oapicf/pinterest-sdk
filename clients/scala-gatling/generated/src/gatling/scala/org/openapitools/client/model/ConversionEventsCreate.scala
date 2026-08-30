
package org.openapitools.client.model


case class ConversionEventsCreate (
    /* A list of events (one or more) encapsulated by a data object. */
    _data: List[ConversionEventsDataItems]
)
object ConversionEventsCreate {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
