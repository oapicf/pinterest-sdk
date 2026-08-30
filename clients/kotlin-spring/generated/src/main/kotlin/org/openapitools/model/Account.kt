package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.UserAccountType
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
 * User account model containing properties related to a user's account.
 * @param about Profile about description.
 * @param accountType Type of account
 * @param boardCount   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @param businessName 
 * @param followerCount User account follower count.
 * @param followingCount User account following count.
 * @param id User account ID.
 * @param monthlyViews User account monthly views.
 * @param pinCount User account pin count. This includes both created and saved pins.
 * @param profileImage 
 * @param username 
 * @param websiteUrl 
 */
data class Account(

    @Schema(description = "Profile about description.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("about")
    @get:JsonProperty("about") val about: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Type of account")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("account_type")
    @get:JsonProperty("account_type") val accountType: UserAccountType? = null,

    @Schema(example = "14", readOnly = true, description = "  User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
    @param:JsonProperty("board_count")
    @get:JsonProperty("board_count") val boardCount: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("business_name")
    @get:JsonProperty("business_name") val businessName: kotlin.String? = null,

    @Schema(example = "10", readOnly = true, description = "User account follower count.")
    @param:JsonProperty("follower_count")
    @get:JsonProperty("follower_count") val followerCount: kotlin.Int? = null,

    @Schema(example = "347", readOnly = true, description = "User account following count.")
    @param:JsonProperty("following_count")
    @get:JsonProperty("following_count") val followingCount: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2783136121146311751", description = "User account ID.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "163", readOnly = true, description = "User account monthly views.")
    @param:JsonProperty("monthly_views")
    @get:JsonProperty("monthly_views") val monthlyViews: kotlin.Int? = null,

    @Schema(example = "339", readOnly = true, description = "User account pin count. This includes both created and saved pins.")
    @param:JsonProperty("pin_count")
    @get:JsonProperty("pin_count") val pinCount: kotlin.Int? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("profile_image")
    @get:JsonProperty("profile_image") val profileImage: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("username")
    @get:JsonProperty("username") val username: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("website_url")
    @get:JsonProperty("website_url") val websiteUrl: kotlin.String? = null
) {

}

