
package org.openapitools.client.model


case class ConversionEventsUserData (
    /* Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    _ph: Option[List[String]],
    /* Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. */
    _ge: Option[List[String]],
    /* Sha256 hashes of user's date of birthday, given as year, month, and day. */
    _db: Option[List[String]],
    /* Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    _ln: Option[List[String]],
    /* Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    _fn: Option[List[String]],
    /* Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). */
    _ct: Option[List[String]],
    /* Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). */
    _st: Option[List[String]],
    /* Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). */
    _zp: Option[List[String]],
    /* Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. */
    _country: Option[List[String]],
    /* Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. */
    _externalId: Option[List[String]],
    /* The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    _clickId: Option[String],
    /* A unique identifier of visitors' information defined by third party partners. e.g RampID */
    _partnerId: Option[String]
)
object ConversionEventsUserData {
    def toStringBody(var_ph: Object, var_ge: Object, var_db: Object, var_ln: Object, var_fn: Object, var_ct: Object, var_st: Object, var_zp: Object, var_country: Object, var_externalId: Object, var_clickId: Object, var_partnerId: Object) =
        s"""
        | {
        | "ph":$var_ph,"ge":$var_ge,"db":$var_db,"ln":$var_ln,"fn":$var_fn,"ct":$var_ct,"st":$var_st,"zp":$var_zp,"country":$var_country,"externalId":$var_externalId,"clickId":$var_clickId,"partnerId":$var_partnerId
        | }
        """.stripMargin
}
