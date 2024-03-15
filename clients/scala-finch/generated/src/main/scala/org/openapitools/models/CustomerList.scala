package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param adUnderscoreaccountUnderscoreid Associated ad account ID.
 * @param createdUnderscoretime Creation time. Unix timestamp in seconds.
 * @param id Customer list ID.
 * @param name Customer list name.
 * @param numUnderscorebatches Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists.
 * @param numUnderscoreremovedUnderscoreuserUnderscorerecords Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list.
 * @param numUnderscoreuploadedUnderscoreuserUnderscorerecords Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list.
 * @param status Customer list status. TOO_SMALL - the list has less than 100 Pinterest users.
 * @param _type Always \"customerlist\".
 * @param updatedUnderscoretime Last update time. Unix timestamp in seconds.
 * @param exceptions Customer list errors
 */
case class CustomerList(adUnderscoreaccountUnderscoreid: Option[String],
                createdUnderscoretime: Option[BigDecimal],
                id: Option[String],
                name: Option[String],
                numUnderscorebatches: Option[BigDecimal],
                numUnderscoreremovedUnderscoreuserUnderscorerecords: Option[BigDecimal],
                numUnderscoreuploadedUnderscoreuserUnderscorerecords: Option[BigDecimal],
                status: Option[String],
                _type: Option[String],
                updatedUnderscoretime: Option[BigDecimal],
                exceptions: Option[Object]
                )

object CustomerList {
    /**
     * Creates the codec for converting CustomerList from and to JSON.
     */
    implicit val decoder: Decoder[CustomerList] = deriveDecoder
    implicit val encoder: ObjectEncoder[CustomerList] = deriveEncoder
}
