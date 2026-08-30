
package org.openapitools.client.model


case class AppsflyerAudienceSyncCreate (
    /* The container ID of the audience */
    _containerId: String,
    /* The pre-signed URL for SHA256 hashed GAID/IDFA file */
    _urlAdidSha256: Option[String],
    /* The pre-signed URL for SHA256 hashed email file */
    _urlEmailSha256: Option[String]
)
object AppsflyerAudienceSyncCreate {
    def toStringBody(var_containerId: Object, var_urlAdidSha256: Object, var_urlEmailSha256: Object) =
        s"""
        | {
        | "containerId":$var_containerId,"urlAdidSha256":$var_urlAdidSha256,"urlEmailSha256":$var_urlEmailSha256
        | }
        """.stripMargin
}
