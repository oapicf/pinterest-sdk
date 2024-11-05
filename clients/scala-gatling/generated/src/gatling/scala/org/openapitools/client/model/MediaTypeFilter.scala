
package org.openapitools.client.model


case class MediaTypeFilter (
    _MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria
)
object MediaTypeFilter {
    def toStringBody(var_MEDIA_TYPE: Object) =
        s"""
        | {
        | "MEDIA_TYPE":$var_MEDIA_TYPE
        | }
        """.stripMargin
}
