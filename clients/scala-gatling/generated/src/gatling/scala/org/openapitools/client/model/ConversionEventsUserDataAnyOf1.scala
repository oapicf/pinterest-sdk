
package org.openapitools.client.model


case class ConversionEventsUserDataAnyOf1 (
    /* Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _em: Option[List[String]],
    /* Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _hashedMaids: List[String],
    /* The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    _clientIpAddress: Option[String],
    /* The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    _clientUserAgent: Option[String]
)
object ConversionEventsUserDataAnyOf1 {
    def toStringBody(var_em: Object, var_hashedMaids: Object, var_clientIpAddress: Object, var_clientUserAgent: Object) =
        s"""
        | {
        | "em":$var_em,"hashedMaids":$var_hashedMaids,"clientIpAddress":$var_clientIpAddress,"clientUserAgent":$var_clientUserAgent
        | }
        """.stripMargin
}
