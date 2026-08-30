
package org.openapitools.client.model


case class CustomerListRecordRow (
    /* Email address (plain or hashed with SHA1, SHA256, or MD5). */
    _email: Option[String],
    /* External ID identifier (not hashed). */
    _externalId: Option[String],
    /* Hashed phone number (hashed with SHA1, SHA256, or MD5). */
    _hashedPhoneNumber: Option[String],
    /* Hashed pinner ID (hashed with SHA1, SHA256, or MD5). */
    _hashedPinnerId: Option[String],
    /* IP address (not hashed). */
    _ipAddress: Option[String],
    /* LiveRamp envelope identifier (Base64-encoded, not hashed). */
    _liverampEnvelope: Option[String],
    /* Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). */
    _maid: Option[String],
    /* User agent string (not hashed). */
    _userAgent: Option[String]
)
object CustomerListRecordRow {
    def toStringBody(var_email: Object, var_externalId: Object, var_hashedPhoneNumber: Object, var_hashedPinnerId: Object, var_ipAddress: Object, var_liverampEnvelope: Object, var_maid: Object, var_userAgent: Object) =
        s"""
        | {
        | "email":$var_email,"externalId":$var_externalId,"hashedPhoneNumber":$var_hashedPhoneNumber,"hashedPinnerId":$var_hashedPinnerId,"ipAddress":$var_ipAddress,"liverampEnvelope":$var_liverampEnvelope,"maid":$var_maid,"userAgent":$var_userAgent
        | }
        """.stripMargin
}
