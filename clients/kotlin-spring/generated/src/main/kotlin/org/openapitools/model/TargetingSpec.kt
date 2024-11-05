package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TargetingSpecSHOPPINGRETARGETING
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Ad group targeting specification defining the ad group target audience. For example, `{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}`
 * @param AGE_BUCKET Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
 * @param APPTYPE Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
 * @param AUDIENCE_EXCLUDE Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.
 * @param AUDIENCE_INCLUDE Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.
 * @param GENDER Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
 * @param GEO Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).
 * @param INTEREST Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.
 * @param LOCALE 24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.
 * @param LOCATION 22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).
 * @param SHOPPING_RETARGETING Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting
 * @param TARGETING_STRATEGY 
 */
data class TargetingSpec(

    @Schema(example = "[\"35-44\",\"50-54\"]", description = "Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.")
    @get:JsonProperty("AGE_BUCKET") val AGE_BUCKET: kotlin.collections.List<TargetingSpec.AGEBUCKET>? = null,

    @Schema(example = "[\"ipad\",\"iphone\"]", description = "Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.")
    @get:JsonProperty("APPTYPE") val APPTYPE: kotlin.collections.List<TargetingSpec.APPTYPE>? = null,

    @Schema(example = "null", description = "Excluded customer list IDs. Used to drive new customer acquisition goals. For example: [\"2542620905475\"]. Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_EXCLUDE field is missing, the default behavior in terms of ad delivery is that **No users will be excluded**.")
    @get:JsonProperty("AUDIENCE_EXCLUDE") val AUDIENCE_EXCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Targeted customer list IDs. For example: [\"2542620905473\"]. Audience lists need to have at least 100 people with Pinterest accounts in them Audience lists need to have at least 100 people with Pinterest accounts in them. If the AUDIENCE_INCLUDE field is missing, the default behavior in terms of ad delivery is that **All users will be included**.")
    @get:JsonProperty("AUDIENCE_INCLUDE") val AUDIENCE_INCLUDE: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.")
    @get:JsonProperty("GENDER") val GENDER: kotlin.collections.List<TargetingSpec.GENDER>? = null,

    @Schema(example = "null", description = "Location region codes, e.g., \"BE-VOV\" (East Flanders, Belgium) For complete list, <a href=\"https://help.pinterest.com/sub/helpcenter/partner/pinterest_location_targeting_codes.xlsx\" target=\"_blank\">click here</a> or postal codes, e.g., \"US-94107\". Use either region codes or postal codes but not both. At least one of LOCATION or GEO must be specified. If the GEO field is missing, then only LOCATION values will be targeted (see LOCATION field below).")
    @get:JsonProperty("GEO") val GEO: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Array of interest object IDs. If the INTEREST field is missing, the default behavior in terms of ad delivery is that **All interests will be targeted**.")
    @get:JsonProperty("INTEREST") val INTEREST: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "24 ISO 639-1 two letter language codes. If the LOCALE field is missing, the default behavior in terms of ad delivery is that **All languages will be targeted, only english non-sublanguage will be targeted**.")
    @get:JsonProperty("LOCALE") val LOCALE: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "22 ISO Alpha 2 two letter country codes or US Nielsen DMA (Designated Market Area) codes (location region codes) (e.g., [\"US\", \"807\"]). For complete list, click here. Location-Country and Location-Metro codes apply. At least one of LOCATION or GEO must be specified. If the LOCATION field is missing, then only GEO values will be targeted (see GEO field above).")
    @get:JsonProperty("LOCATION") val LOCATION: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Array of object: lookback_window [Integer]: Number of days ago to start lookback timeframe for dynamic retargeting tag_types [Array of integer]: Event types to target for dynamic retargeting exclusion_window [Integer]: Number of days ago to stop lookback timeframe for dynamic retargeting")
    @get:JsonProperty("SHOPPING_RETARGETING") val SHOPPING_RETARGETING: kotlin.collections.List<TargetingSpecSHOPPINGRETARGETING>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("TARGETING_STRATEGY") val TARGETING_STRATEGY: kotlin.collections.List<TargetingSpec.TARGETINGSTRATEGY>? = null
    ) {

    /**
    * Age ranges. If the AGE_BUCKET field is missing, the default behavior in terms of ad delivery is that **All age buckets** will be targeted.
    * Values: _18Minus24,_21Plus,_25Minus34,_35Minus44,_45Minus49,_50Minus54,_55Minus64,_65Plus
    */
    enum class AGEBUCKET(@get:JsonValue val value: kotlin.String) {

        _18Minus24("18-24"),
        _21Plus("21+"),
        _25Minus34("25-34"),
        _35Minus44("35-44"),
        _45Minus49("45-49"),
        _50Minus54("50-54"),
        _55Minus64("55-64"),
        _65Plus("65+");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AGEBUCKET {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Allowed devices. If the APPTYPE field is missing, the default behavior in terms of ad delivery is that **All devices/apptypes** will be targeted.
    * Values: android_mobile,android_tablet,ipad,iphone,web,web_mobile
    */
    enum class APPTYPE(@get:JsonValue val value: kotlin.String) {

        android_mobile("android_mobile"),
        android_tablet("android_tablet"),
        ipad("ipad"),
        iphone("iphone"),
        web("web"),
        web_mobile("web_mobile");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): APPTYPE {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Targeted genders. Values: [\"unknown\",\"male\",\"female\"]. If the GENDER field is missing, the default behavior in terms of ad delivery is that **All genders will be targeted**.
    * Values: unknown,male,female
    */
    enum class GENDER(@get:JsonValue val value: kotlin.String) {

        unknown("unknown"),
        male("male"),
        female("female");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): GENDER {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * 
    * Values: CHOOSE_YOUR_OWN,FIND_NEW_CUSTOMERS,RECONNECT_WITH_USERS
    */
    enum class TARGETINGSTRATEGY(@get:JsonValue val value: kotlin.String) {

        CHOOSE_YOUR_OWN("CHOOSE_YOUR_OWN"),
        FIND_NEW_CUSTOMERS("FIND_NEW_CUSTOMERS"),
        RECONNECT_WITH_USERS("RECONNECT_WITH_USERS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): TARGETINGSTRATEGY {
                return values().first{it -> it.value == value}
            }
        }
    }

}

