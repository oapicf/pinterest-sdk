package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param accountType Type of account
 * @param id User account ID.
 * @param profileImage 
 * @param websiteUrl 
 * @param username 
 * @param about Profile about description.
 * @param businessName 
 * @param boardCount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @param pinCount User account pin count. This includes both created and saved pins.
 * @param followerCount User account follower count.
 * @param followingCount User account following count.
 * @param monthlyViews User account monthly views.
 */
data class Account(

    @Schema(example = "null", description = "Type of account")
    @get:JsonProperty("account_type") val accountType: Account.AccountType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2783136121146311751", description = "User account ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("profile_image") val profileImage: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("website_url") val websiteUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(example = "null", description = "Profile about description.")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("business_name") val businessName: kotlin.String? = null,

    @Schema(example = "14", readOnly = true, description = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
    @get:JsonProperty("board_count") val boardCount: kotlin.Int? = null,

    @Schema(example = "339", readOnly = true, description = "User account pin count. This includes both created and saved pins.")
    @get:JsonProperty("pin_count") val pinCount: kotlin.Int? = null,

    @Schema(example = "10", readOnly = true, description = "User account follower count.")
    @get:JsonProperty("follower_count") val followerCount: kotlin.Int? = null,

    @Schema(example = "347", readOnly = true, description = "User account following count.")
    @get:JsonProperty("following_count") val followingCount: kotlin.Int? = null,

    @Schema(example = "163", readOnly = true, description = "User account monthly views.")
    @get:JsonProperty("monthly_views") val monthlyViews: kotlin.Int? = null
    ) {

    /**
    * Type of account
    * Values: PINNER,BUSINESS
    */
    enum class AccountType(@get:JsonValue val value: kotlin.String) {

        PINNER("PINNER"),
        BUSINESS("BUSINESS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AccountType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

