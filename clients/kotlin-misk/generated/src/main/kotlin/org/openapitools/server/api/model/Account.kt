package org.openapitools.server.api.model

import org.openapitools.server.api.model.UserAccountType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Account(
    /** Profile about description. */
    val about: kotlin.String? = null,
    /** Type of account */
    val accountType: UserAccountType? = null,
    /**   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
    val boardCount: kotlin.Int? = null,
    val businessName: kotlin.String? = null,
    /** User account follower count. */
    val followerCount: kotlin.Int? = null,
    /** User account following count. */
    val followingCount: kotlin.Int? = null,
    /** User account ID. */
    val id: kotlin.String? = null,
    /** User account monthly views. */
    val monthlyViews: kotlin.Int? = null,
    /** User account pin count. This includes both created and saved pins. */
    val pinCount: kotlin.Int? = null,
    val profileImage: kotlin.String? = null,
    val username: kotlin.String? = null,
    val websiteUrl: kotlin.String? = null
)
