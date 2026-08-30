
package org.openapitools.client.model


case class TotalCountByEntityStatus (
    /* Count of ACTIVE assets */
    _ACTIVE: Option[Integer],
    /* Count of ARCHIVED assets */
    _ARCHIVED: Option[Integer],
    /* Count of PAUSED assets */
    _PAUSED: Option[Integer]
)
object TotalCountByEntityStatus {
    def toStringBody(var_ACTIVE: Object, var_ARCHIVED: Object, var_PAUSED: Object) =
        s"""
        | {
        | "ACTIVE":$var_ACTIVE,"ARCHIVED":$var_ARCHIVED,"PAUSED":$var_PAUSED
        | }
        """.stripMargin
}
