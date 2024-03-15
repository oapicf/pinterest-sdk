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
 * @param id Order line ID.
 * @param _type Always \"orderline\".
 * @param adUnderscoreaccountUnderscoreid Ad account ID.
 * @param purchaseUnderscoreorderUnderscoreid Purchase order ID.
 * @param startUnderscoretime Start time. Unix timestamp.
 * @param endUnderscoretime End time. Unix timestamp.
 * @param budget Order line budget in micro currency.
 * @param paidUnderscorebudget Order line paid budget in micro currency.
 * @param status Order line status.
 * @param name Order line name.
 * @param paidUnderscoretype Order line paid type.
 * @param campaignUnderscoreids Associated List of campaign IDs.
 */
case class OrderLine(id: Option[String],
                _type: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                purchaseUnderscoreorderUnderscoreid: Option[String],
                startUnderscoretime: Option[BigDecimal],
                endUnderscoretime: Option[BigDecimal],
                budget: Option[BigDecimal],
                paidUnderscorebudget: Option[BigDecimal],
                status: Option[OrderLineStatus],
                name: Option[String],
                paidUnderscoretype: Option[OrderLinePaidType],
                campaignUnderscoreids: Seq[String]
                )

object OrderLine {
    /**
     * Creates the codec for converting OrderLine from and to JSON.
     */
    implicit val decoder: Decoder[OrderLine] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderLine] = deriveEncoder
}
