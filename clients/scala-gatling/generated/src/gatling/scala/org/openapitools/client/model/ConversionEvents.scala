
package org.openapitools.client.model


case class ConversionEvents (
    _data: List[ConversionEventsDataInner]
)
object ConversionEvents {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
