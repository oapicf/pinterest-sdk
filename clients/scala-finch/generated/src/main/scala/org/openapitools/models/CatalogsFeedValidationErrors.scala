package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ADULTUnderscoreINVALID Some items have invalid adult values.
 * @param ADWORDSUnderscoreFORMATUnderscoreINVALID Some adwords links contain too many characters.
 * @param AVAILABILITYUnderscoreINVALID Some items are missing an availability value in their product metadata, those items will not be published.
 * @param BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param DELIMITERUnderscoreERROR Your feed includes data with formatting errors.
 * @param DESCRIPTIONUnderscoreMISSING Some items are missing a description in their product metadata, those items will not be published.
 * @param DUPLICATEUnderscorePRODUCTS Some products are duplicated.
 * @param ENCODINGUnderscoreERROR Your feed includes data with an unsupported encoding format.
 * @param FEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Your feed contains too many items, some items will not be published.
 * @param FEEDUnderscoreTOOUnderscoreSMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
 * @param FETCHUnderscoreERROR Pinterest couldn't download your feed.
 * @param FETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
 * @param IMAGEUnderscoreLINKUnderscoreINVALID Some image links are formatted incorrectly.
 * @param IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have image_link URLs that contain too many characters, so those items will not be published.
 * @param IMAGEUnderscoreLINKUnderscoreMISSING Some items are missing an image link URL in their product metadata, those items will not be published.
 * @param INTERNALUnderscoreSERVICEUnderscoreERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
 * @param INVALIDUnderscoreDOMAIN Some of your product link values don't match the verified domain associated with this account.
 * @param ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE Some items' main images can't be found.
 * @param ITEMIDUnderscoreMISSING Some items are missing an item id in their product metadata, those items will not be published.
 * @param LINKUnderscoreFORMATUnderscoreINVALID Some link values are formatted incorrectly.
 * @param LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some product links contain too many characters, those items will not be published.
 * @param LISTUnderscorePRICEUnderscoreINVALID Some items have list price formatting errors in their product metadata, those items will not be published.
 * @param MALFORMEDUnderscoreXML Your feed couldn't be validated because the xml file is formatted incorrectly.
 * @param MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
 * @param NOUnderscoreVERIFIEDUnderscoreDOMAIN Your merchant domain needs to be claimed.
 * @param PARSEUnderscoreLINEUnderscoreERROR Your feed contains formatting errors for some items.
 * @param PINJOINUnderscoreCONTENTUnderscoreUNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
 * @param PRICEUnderscoreMISSING Some products are missing a price, those items will not be published.
 * @param PRODUCTUnderscoreLINKUnderscoreMISSING Some items are missing a link URL in their product metadata, those items will not be published.
 * @param PRODUCTUnderscorePRICEUnderscoreINVALID Some items have price formatting errors in their product metadata, those items will not be published.
 * @param REQUIREDUnderscoreCOLUMNSUnderscoreMISSING Your feed is missing some required column headers.
 * @param TITLEUnderscoreMISSING Some items are missing a title in their product metadata, those items will not be published.
 */
case class CatalogsFeedValidationErrors(ADULTUnderscoreINVALID: Option[Int],
                ADWORDSUnderscoreFORMATUnderscoreINVALID: Option[Int],
                AVAILABILITYUnderscoreINVALID: Option[Int],
                BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE: Option[Int],
                DELIMITERUnderscoreERROR: Option[Int],
                DESCRIPTIONUnderscoreMISSING: Option[Int],
                DUPLICATEUnderscorePRODUCTS: Option[Int],
                ENCODINGUnderscoreERROR: Option[Int],
                FEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                FEEDUnderscoreTOOUnderscoreSMALL: Option[Int],
                FETCHUnderscoreERROR: Option[Int],
                FETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR: Option[Int],
                IMAGEUnderscoreLINKUnderscoreINVALID: Option[Int],
                IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                IMAGEUnderscoreLINKUnderscoreMISSING: Option[Int],
                INTERNALUnderscoreSERVICEUnderscoreERROR: Option[Int],
                INVALIDUnderscoreDOMAIN: Option[Int],
                ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE: Option[Int],
                ITEMIDUnderscoreMISSING: Option[Int],
                LINKUnderscoreFORMATUnderscoreINVALID: Option[Int],
                LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                LISTUnderscorePRICEUnderscoreINVALID: Option[Int],
                MALFORMEDUnderscoreXML: Option[Int],
                MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED: Option[Int],
                NOUnderscoreVERIFIEDUnderscoreDOMAIN: Option[Int],
                PARSEUnderscoreLINEUnderscoreERROR: Option[Int],
                PINJOINUnderscoreCONTENTUnderscoreUNSAFE: Option[Int],
                PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED: Option[Int],
                PRICEUnderscoreMISSING: Option[Int],
                PRODUCTUnderscoreLINKUnderscoreMISSING: Option[Int],
                PRODUCTUnderscorePRICEUnderscoreINVALID: Option[Int],
                REQUIREDUnderscoreCOLUMNSUnderscoreMISSING: Option[Int],
                TITLEUnderscoreMISSING: Option[Int]
                )

object CatalogsFeedValidationErrors {
    /**
     * Creates the codec for converting CatalogsFeedValidationErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationErrors] = deriveEncoder
}
