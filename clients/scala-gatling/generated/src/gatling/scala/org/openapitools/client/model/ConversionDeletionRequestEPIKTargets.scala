
package org.openapitools.client.model


case class ConversionDeletionRequestEPIKTargets (
    /* Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
    _epiks: List[String]
)
object ConversionDeletionRequestEPIKTargets {
    def toStringBody(var_epiks: Object) =
        s"""
        | {
        | "epiks":$var_epiks
        | }
        """.stripMargin
}
