package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param LINEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
 * @param LARGEUnderscorePRODUCTUnderscoreCOUNTUnderscoreDECREASE The product count has decreased by more than 99% compared to the last successful ingestion.
 * @param ACCOUNTUnderscoreFLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
 * @param IMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
 * @param IMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Image files are unreadable. Please upload new files to continue.
 * @param IMAGEUnderscoreMALFORMEDUnderscoreURL Image files are unreadable. Please check your link and upload new files to continue.
 * @param IMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND Image files are unreadable. Please upload new files to continue.
 * @param IMAGEUnderscoreINVALIDUnderscoreFILE Image files are unreadable. Please upload new files to continue.
 */
case class CatalogsFeedIngestionErrors(LINEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR: Option[Int],
                LARGEUnderscorePRODUCTUnderscoreCOUNTUnderscoreDECREASE: Option[Int],
                ACCOUNTUnderscoreFLAGGED: Option[Int],
                IMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR: Option[Int],
                IMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                IMAGEUnderscoreMALFORMEDUnderscoreURL: Option[Int],
                IMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                IMAGEUnderscoreINVALIDUnderscoreFILE: Option[Int]
                )

object CatalogsFeedIngestionErrors {
    /**
     * Creates the codec for converting CatalogsFeedIngestionErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionErrors] = deriveEncoder
}
