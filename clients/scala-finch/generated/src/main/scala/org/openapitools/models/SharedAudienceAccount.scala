package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param accountUnderscoreid Account ID (ad account or business ID).
 * @param accountUnderscorename Account name.
 * @param accountUnderscoretype account type
 * @param sharedUnderscoreonUnderscoretimestamp Epoch timestamp in seconds for the shared audience event
 */
case class SharedAudienceAccount(accountUnderscoreid: String,
                accountUnderscorename: String,
                accountUnderscoretype: String,
                sharedUnderscoreonUnderscoretimestamp: Int
                )

object SharedAudienceAccount {
    /**
     * Creates the codec for converting SharedAudienceAccount from and to JSON.
     */
    implicit val decoder: Decoder[SharedAudienceAccount] = deriveDecoder
    implicit val encoder: ObjectEncoder[SharedAudienceAccount] = deriveEncoder
}
