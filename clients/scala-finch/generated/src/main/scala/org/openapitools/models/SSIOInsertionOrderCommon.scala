package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param agencyUnderscorelink URL link for agency
 * @param billingUnderscorecontactUnderscoreemail The billing contact email
 * @param billingUnderscorecontactUnderscorefirstname The billing contact first name
 * @param billingUnderscorecontactUnderscorelastname The billing contact last name
 * @param budgetUnderscoreamount If Budget order line, the budget amount.
 * @param endUnderscoredate End date of time period. Format: YYYY-MM-DD
 * @param mediaUnderscorecontactUnderscoreemail The media contact email
 * @param mediaUnderscorecontactUnderscorefirstname The media contact first name
 * @param mediaUnderscorecontactUnderscorelastname The media contact last name
 * @param poUnderscorenumber The po number
 * @param startUnderscoredate Starting date of time period. Format: YYYY-MM-DD
 * @param userUnderscoreemail The email of user submitting the insertion order
 */
case class SSIOInsertionOrderCommon(agencyUnderscorelink: Option[String],
                billingUnderscorecontactUnderscoreemail: Option[String],
                billingUnderscorecontactUnderscorefirstname: Option[String],
                billingUnderscorecontactUnderscorelastname: Option[String],
                budgetUnderscoreamount: Option[BigDecimal],
                endUnderscoredate: Option[String],
                mediaUnderscorecontactUnderscoreemail: Option[String],
                mediaUnderscorecontactUnderscorefirstname: Option[String],
                mediaUnderscorecontactUnderscorelastname: Option[String],
                poUnderscorenumber: Option[String],
                startUnderscoredate: Option[String],
                userUnderscoreemail: Option[String]
                )

object SSIOInsertionOrderCommon {
    /**
     * Creates the codec for converting SSIOInsertionOrderCommon from and to JSON.
     */
    implicit val decoder: Decoder[SSIOInsertionOrderCommon] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOInsertionOrderCommon] = deriveEncoder
}
