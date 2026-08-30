
package org.openapitools.client.model


case class FollowUserCreate (
    /*   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed. */
    _autoFollow: Option[Boolean]
)
object FollowUserCreate {
    def toStringBody(var_autoFollow: Object) =
        s"""
        | {
        | "autoFollow":$var_autoFollow
        | }
        """.stripMargin
}
