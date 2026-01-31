
package org.openapitools.client.model


case class ConversionEventsUserData (
    /* The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    _clickId: Option[String],
    /* The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    _clientIpAddress: Option[String],
    /* The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    _clientUserAgent: Option[String],
    /* Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. The string should be in the UTF-8 format. */
    _country: Option[List[String]],
    /* Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. */
    _ct: Option[List[String]],
    /* Sha256 hashes of user's date of birthday, given as year, month, and day. The string should be in the UTF-8 format. */
    _db: Option[List[String]],
    /* Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _em: Option[List[String]],
    /* Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _externalId: Option[List[String]],
    /* Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _fn: Option[List[String]],
    /* Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. The string should be in the UTF-8 format. */
    _ge: Option[List[String]],
    /* Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _hashedMaids: Option[List[String]],
    /* Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _ln: Option[List[String]],
    /* A unique identifier of visitors' information defined by third party partners. e.g RampID */
    _partnerId: Option[String],
    /* Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    _ph: Option[List[String]],
    /* Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. */
    _st: Option[List[String]],
    /* Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. */
    _zp: Option[List[String]]
)
object ConversionEventsUserData {
    def toStringBody(var_clickId: Object, var_clientIpAddress: Object, var_clientUserAgent: Object, var_country: Object, var_ct: Object, var_db: Object, var_em: Object, var_externalId: Object, var_fn: Object, var_ge: Object, var_hashedMaids: Object, var_ln: Object, var_partnerId: Object, var_ph: Object, var_st: Object, var_zp: Object) =
        s"""
        | {
        | "clickId":$var_clickId,"clientIpAddress":$var_clientIpAddress,"clientUserAgent":$var_clientUserAgent,"country":$var_country,"ct":$var_ct,"db":$var_db,"em":$var_em,"externalId":$var_externalId,"fn":$var_fn,"ge":$var_ge,"hashedMaids":$var_hashedMaids,"ln":$var_ln,"partnerId":$var_partnerId,"ph":$var_ph,"st":$var_st,"zp":$var_zp
        | }
        """.stripMargin
}
