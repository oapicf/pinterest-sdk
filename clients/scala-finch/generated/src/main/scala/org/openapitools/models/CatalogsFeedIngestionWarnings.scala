package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL Additional image files are unreadable. Please check your link and upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE Additional image files are unreadable. Please upload new files to continue.
 * @param HOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT price is not a supported column. Use base_price and sale_price instead.
 */
case class CatalogsFeedIngestionWarnings(ADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE: Option[Int],
                HOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT: Option[Int]
                )

object CatalogsFeedIngestionWarnings {
    /**
     * Creates the codec for converting CatalogsFeedIngestionWarnings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionWarnings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionWarnings] = deriveEncoder
}
