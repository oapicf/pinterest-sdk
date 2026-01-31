package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.OrderLinePaidType
import org.openapitools.models.OrderLineStatus
import scala.collection.immutable.Seq

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param budget Order line budget in micro currency.
 * @param endUnderscoretime End time. Unix timestamp.
 * @param id Order line ID.
 * @param name Order line name.
 * @param paidUnderscorebudget Order line paid budget in micro currency.
 * @param paidUnderscoretype Order line paid type.
 * @param purchaseUnderscoreorderUnderscoreid Purchase order ID.
 * @param startUnderscoretime Start time. Unix timestamp.
 * @param status Order line status.
 * @param _type Always \"orderline\".
 * @param campaignUnderscoreids Associated List of campaign IDs.
 */
case class OrderLine(adUnderscoreaccountUnderscoreid: Option[String],
                budget: Option[BigDecimal],
                endUnderscoretime: Option[BigDecimal],
                id: Option[String],
                name: Option[String],
                paidUnderscorebudget: Option[BigDecimal],
                paidUnderscoretype: Option[OrderLinePaidType],
                purchaseUnderscoreorderUnderscoreid: Option[String],
                startUnderscoretime: Option[BigDecimal],
                status: Option[OrderLineStatus],
                _type: Option[String],
                campaignUnderscoreids: Seq[String]
                )

object OrderLine {
    /**
     * Creates the codec for converting OrderLine from and to JSON.
     */
    implicit val decoder: Decoder[OrderLine] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLine] = deriveEncoder
}
