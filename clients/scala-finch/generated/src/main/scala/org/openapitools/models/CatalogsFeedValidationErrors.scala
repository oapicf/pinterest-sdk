package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param FETCHUnderscoreERROR Pinterest couldn't download your feed.
 * @param FETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
 * @param ENCODINGUnderscoreERROR Your feed includes data with an unsupported encoding format.
 * @param DELIMITERUnderscoreERROR Your feed includes data with formatting errors.
 * @param REQUIREDUnderscoreCOLUMNSUnderscoreMISSING Your feed is missing some required column headers.
 * @param DUPLICATEUnderscorePRODUCTS Some products are duplicated.
 * @param IMAGEUnderscoreLINKUnderscoreINVALID Some image links are formatted incorrectly.
 * @param ITEMIDUnderscoreMISSING Some items are missing an item id in their product metadata, those items will not be published.
 * @param TITLEUnderscoreMISSING Some items are missing a title in their product metadata, those items will not be published.
 * @param DESCRIPTIONUnderscoreMISSING Some items are missing a description in their product metadata, those items will not be published.
 * @param PRODUCTUnderscoreLINKUnderscoreMISSING Some items are missing a link URL in their product metadata, those items will not be published.
 * @param IMAGEUnderscoreLINKUnderscoreMISSING Some items are missing an image link URL in their product metadata, those items will not be published.
 * @param AVAILABILITYUnderscoreINVALID Some items are missing an availability value in their product metadata, those items will not be published.
 * @param PRODUCTUnderscorePRICEUnderscoreINVALID Some items have price formatting errors in their product metadata, those items will not be published.
 * @param LINKUnderscoreFORMATUnderscoreINVALID Some link values are formatted incorrectly.
 * @param PARSEUnderscoreLINEUnderscoreERROR Your feed contains formatting errors for some items.
 * @param ADWORDSUnderscoreFORMATUnderscoreINVALID Some adwords links contain too many characters.
 * @param INTERNALUnderscoreSERVICEUnderscoreERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
 * @param NOUnderscoreVERIFIEDUnderscoreDOMAIN Your merchant domain needs to be claimed.
 * @param ADULTUnderscoreINVALID Some items have invalid adult values.
 * @param IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have image_link URLs that contain too many characters, so those items will not be published.
 * @param INVALIDUnderscoreDOMAIN Some of your product link values don't match the verified domain associated with this account.
 * @param FEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Your feed contains too many items, some items will not be published.
 * @param LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some product links contain too many characters, those items will not be published.
 * @param MALFORMEDUnderscoreXML Your feed couldn't be validated because the xml file is formatted incorrectly.
 * @param PRICEUnderscoreMISSING Some products are missing a price, those items will not be published.
 * @param FEEDUnderscoreTOOUnderscoreSMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
 * @param MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
 * @param ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE Some items' main images can't be found.
 * @param PINJOINUnderscoreCONTENTUnderscoreUNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @param LISTUnderscorePRICEUnderscoreINVALID Some items have list price formatting errors in their product metadata, those items will not be published.
 * @param PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
 */
case class CatalogsFeedValidationErrors(FETCHUnderscoreERROR: Option[Int],
                FETCHUnderscoreINACTIVEUnderscoreFEEDUnderscoreERROR: Option[Int],
                ENCODINGUnderscoreERROR: Option[Int],
                DELIMITERUnderscoreERROR: Option[Int],
                REQUIREDUnderscoreCOLUMNSUnderscoreMISSING: Option[Int],
                DUPLICATEUnderscorePRODUCTS: Option[Int],
                IMAGEUnderscoreLINKUnderscoreINVALID: Option[Int],
                ITEMIDUnderscoreMISSING: Option[Int],
                TITLEUnderscoreMISSING: Option[Int],
                DESCRIPTIONUnderscoreMISSING: Option[Int],
                PRODUCTUnderscoreLINKUnderscoreMISSING: Option[Int],
                IMAGEUnderscoreLINKUnderscoreMISSING: Option[Int],
                AVAILABILITYUnderscoreINVALID: Option[Int],
                PRODUCTUnderscorePRICEUnderscoreINVALID: Option[Int],
                LINKUnderscoreFORMATUnderscoreINVALID: Option[Int],
                PARSEUnderscoreLINEUnderscoreERROR: Option[Int],
                ADWORDSUnderscoreFORMATUnderscoreINVALID: Option[Int],
                INTERNALUnderscoreSERVICEUnderscoreERROR: Option[Int],
                NOUnderscoreVERIFIEDUnderscoreDOMAIN: Option[Int],
                ADULTUnderscoreINVALID: Option[Int],
                IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                INVALIDUnderscoreDOMAIN: Option[Int],
                FEEDUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                MALFORMEDUnderscoreXML: Option[Int],
                PRICEUnderscoreMISSING: Option[Int],
                FEEDUnderscoreTOOUnderscoreSMALL: Option[Int],
                MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED: Option[Int],
                ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE: Option[Int],
                PINJOINUnderscoreCONTENTUnderscoreUNSAFE: Option[Int],
                BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE: Option[Int],
                LISTUnderscorePRICEUnderscoreINVALID: Option[Int],
                PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED: Option[Int]
                )

object CatalogsFeedValidationErrors {
    /**
     * Creates the codec for converting CatalogsFeedValidationErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationErrors] = deriveEncoder
}
