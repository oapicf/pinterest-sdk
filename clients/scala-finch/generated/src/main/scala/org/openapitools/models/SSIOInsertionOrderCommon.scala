package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param startUnderscoredate Starting date of time period. Format: YYYY-MM-DD
 * @param endUnderscoredate End date of time period. Format: YYYY-MM-DD
 * @param poUnderscorenumber The po number
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param billingUnderscorecontactUnderscorefirstname The billing contact first name
 * @param billingUnderscorecontactUnderscorelastname The billing contact last name
 * @param billingUnderscorecontactUnderscoreemail The billing contact email
 * @param mediaUnderscorecontactUnderscorefirstname The media contact first name
 * @param mediaUnderscorecontactUnderscorelastname The media contact last name
 * @param mediaUnderscorecontactUnderscoreemail The media contact email
 * @param agencyUnderscorelink URL link for agency
 * @param userUnderscoreemail The email of user submitting the insertion order
 */
case class SSIOInsertionOrderCommon(startUnderscoredate: Option[String],
                endUnderscoredate: Option[String],
                poUnderscorenumber: Option[String],
                budgetUnderscoreamount: Option[BigDecimal],
                billingUnderscorecontactUnderscorefirstname: Option[String],
                billingUnderscorecontactUnderscorelastname: Option[String],
                billingUnderscorecontactUnderscoreemail: Option[String],
                mediaUnderscorecontactUnderscorefirstname: Option[String],
                mediaUnderscorecontactUnderscorelastname: Option[String],
                mediaUnderscorecontactUnderscoreemail: Option[String],
                agencyUnderscorelink: Option[String],
                userUnderscoreemail: Option[String]
                )

object SSIOInsertionOrderCommon {
    /**
     * Creates the codec for converting SSIOInsertionOrderCommon from and to JSON.
     */
    implicit val decoder: Decoder[SSIOInsertionOrderCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOInsertionOrderCommon] = deriveEncoder
}
