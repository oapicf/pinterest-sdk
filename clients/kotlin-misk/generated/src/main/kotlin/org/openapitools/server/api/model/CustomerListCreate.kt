package org.openapitools.server.api.model

import org.openapitools.server.api.model.CustomerListRecordRow
import org.openapitools.server.api.model.UserListType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerListCreate(
    /** Customer list name. */
    val name: kotlin.String,
    /** Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
    val isNca: kotlin.Boolean? = null,
    /** Type of customer list (e.g., EMAIL, IDFA, MAID). */
    val listType: UserListType? = null,
    /** Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. */
    val records: kotlin.String? = null,
    /** Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. */
    val recordsV2: kotlin.collections.List<CustomerListRecordRow>? = null
)
