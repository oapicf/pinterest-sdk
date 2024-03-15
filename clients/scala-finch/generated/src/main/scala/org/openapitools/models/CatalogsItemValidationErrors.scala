package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsItemValidationDetails

/**
 * 
 * @param ADULTUnderscoreINVALID 
 * @param ADWORDSUnderscoreFORMATUnderscoreINVALID 
 * @param AVAILABILITYUnderscoreINVALID 
 * @param BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE 
 * @param DESCRIPTIONUnderscoreMISSING 
 * @param DUPLICATEUnderscorePRODUCTS 
 * @param IMAGEUnderscoreLINKUnderscoreINVALID 
 * @param IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG 
 * @param IMAGEUnderscoreLINKUnderscoreMISSING 
 * @param INVALIDUnderscoreDOMAIN 
 * @param ITEMIDUnderscoreMISSING 
 * @param ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE 
 * @param LINKUnderscoreFORMATUnderscoreINVALID 
 * @param LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG 
 * @param LISTUnderscorePRICEUnderscoreINVALID 
 * @param MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED 
 * @param PARSEUnderscoreLINEUnderscoreERROR 
 * @param PINJOINUnderscoreCONTENTUnderscoreUNSAFE 
 * @param PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED 
 * @param PRICEUnderscoreMISSING 
 * @param PRODUCTUnderscoreLINKUnderscoreMISSING 
 * @param PRODUCTUnderscorePRICEUnderscoreINVALID 
 * @param TITLEUnderscoreMISSING 
 */
case class CatalogsItemValidationErrors(ADULTUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                ADWORDSUnderscoreFORMATUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                AVAILABILITYUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                BLOCKLISTEDUnderscoreIMAGEUnderscoreSIGNATURE: Option[CatalogsItemValidationDetails],
                DESCRIPTIONUnderscoreMISSING: Option[CatalogsItemValidationDetails],
                DUPLICATEUnderscorePRODUCTS: Option[CatalogsItemValidationDetails],
                IMAGEUnderscoreLINKUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                IMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[CatalogsItemValidationDetails],
                IMAGEUnderscoreLINKUnderscoreMISSING: Option[CatalogsItemValidationDetails],
                INVALIDUnderscoreDOMAIN: Option[CatalogsItemValidationDetails],
                ITEMIDUnderscoreMISSING: Option[CatalogsItemValidationDetails],
                ITEMUnderscoreMAINUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE: Option[CatalogsItemValidationDetails],
                LINKUnderscoreFORMATUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                LINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[CatalogsItemValidationDetails],
                LISTUnderscorePRICEUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                MAXUnderscoreITEMSUnderscorePERUnderscoreITEMUnderscoreGROUPUnderscoreEXCEEDED: Option[CatalogsItemValidationDetails],
                PARSEUnderscoreLINEUnderscoreERROR: Option[CatalogsItemValidationDetails],
                PINJOINUnderscoreCONTENTUnderscoreUNSAFE: Option[CatalogsItemValidationDetails],
                PRICEUnderscoreCANNOTUnderscoreBEUnderscoreDETERMINED: Option[CatalogsItemValidationDetails],
                PRICEUnderscoreMISSING: Option[CatalogsItemValidationDetails],
                PRODUCTUnderscoreLINKUnderscoreMISSING: Option[CatalogsItemValidationDetails],
                PRODUCTUnderscorePRICEUnderscoreINVALID: Option[CatalogsItemValidationDetails],
                TITLEUnderscoreMISSING: Option[CatalogsItemValidationDetails]
                )

object CatalogsItemValidationErrors {
    /**
     * Creates the codec for converting CatalogsItemValidationErrors from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemValidationErrors] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemValidationErrors] = deriveEncoder
}
