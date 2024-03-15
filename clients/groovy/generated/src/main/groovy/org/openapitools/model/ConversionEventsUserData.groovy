package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ConversionEventsUserData {
    /* Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    List<String> ph
    /* Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender. */
    List<String> ge
    /* Sha256 hashes of user's date of birthday, given as year, month, and day. */
    List<String> db
    /* Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    List<String> ln
    /* Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    List<String> fn
    /* Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). */
    List<String> ct
    /* Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing). */
    List<String> st
    /* Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing). */
    List<String> zp
    /* Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase. */
    List<String> country
    /* Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. */
    List<String> externalId
    /* The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    String clickId
    /* A unique identifier of visitors' information defined by third party partners. e.g RampID */
    String partnerId
}
