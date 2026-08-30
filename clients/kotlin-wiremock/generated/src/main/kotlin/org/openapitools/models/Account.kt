@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Account(
    @field:JsonProperty("about")
    val about: kotlin.String? = null,

    @field:JsonProperty("account_type")
    val accountType: UserAccountType? = null,

    @field:JsonProperty("board_count")
    val boardCount: kotlin.Int? = null,

    @field:JsonProperty("business_name")
    val businessName: kotlin.String? = null,

    @field:JsonProperty("follower_count")
    val followerCount: kotlin.Int? = null,

    @field:JsonProperty("following_count")
    val followingCount: kotlin.Int? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("monthly_views")
    val monthlyViews: kotlin.Int? = null,

    @field:JsonProperty("pin_count")
    val pinCount: kotlin.Int? = null,

    @field:JsonProperty("profile_image")
    val profileImage: kotlin.String? = null,

    @field:JsonProperty("username")
    val username: kotlin.String? = null,

    @field:JsonProperty("website_url")
    val websiteUrl: kotlin.String? = null,

)
