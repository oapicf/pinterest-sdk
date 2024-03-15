package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING Some items have ad links that are formatted incorrectly.
 * @param ADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK Some items have ad link URLs that are duplicates of the link URLs for those items.
 * @param TITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG The title for some items were truncated because they contain too many characters.
 * @param DESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG The description for some items were truncated because they contain too many characters.
 * @param GENDERUnderscoreINVALID Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param AGEUnderscoreGROUPUnderscoreINVALID Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param SIZEUnderscoreTYPEUnderscoreINVALID Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param SIZEUnderscoreSYSTEMUnderscoreINVALID Some items have size system values which are not one of the supported size systems.
 * @param LINKUnderscoreFORMATUnderscoreWARNING Some items have an invalid product link which contains invalid UTM tracking paramaters.
 * @param SALESUnderscorePRICEUnderscoreINVALID Some items have sale price values that are higher than the original price of the item.
 * @param PRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
 * @param ADWORDSUnderscoreFORMATUnderscoreWARNING Some items have adwords_redirect links that are formatted incorrectly.
 * @param ADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
 * @param DUPLICATEUnderscoreHEADERS Your feed contains duplicate headers.
 * @param FETCHUnderscoreSAMEUnderscoreSIGNATURE Ingestion completed early because there are no changes to your feed since the last successful update.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
 * @param IMAGEUnderscoreLINKUnderscoreWARNING Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
 * @param SHIPPINGUnderscoreINVALID Some items have shipping values that are formatted incorrectly.
 * @param TAXUnderscoreINVALID Some items have tax values that are formatted incorrectly.
 * @param SHIPPINGUnderscoreWEIGHTUnderscoreINVALID Some items have invalid shipping_weight values.
 * @param EXPIRATIONUnderscoreDATEUnderscoreINVALID Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
 * @param AVAILABILITYUnderscoreDATEUnderscoreINVALID Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
 * @param SALEUnderscoreDATEUnderscoreINVALID Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
 * @param WEIGHTUnderscoreUNITUnderscoreINVALID Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
 * @param ISUnderscoreBUNDLEUnderscoreINVALID Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
 * @param UPDATEDUnderscoreTIMEUnderscoreINVALID Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
 * @param CUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have custom_label values that are too long, those items will be published without that custom label.
 * @param PRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG Some items have product_type values that are too long, those items will be published without that product type.
 * @param TOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
 * @param MULTIPACKUnderscoreINVALID Some items have invalid multipack values.
 * @param INDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA The product count has increased or decreased significantly compared to the last successful ingestion.
 * @param ITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE Some items include additional_image_links that can't be found.
 * @param OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING Some items are missing a google_product_category.
 * @param OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
 * @param OPTIONALUnderscoreCONDITIONUnderscoreMISSING Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
 * @param OPTIONALUnderscoreCONDITIONUnderscoreINVALID Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
 * @param IOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID Some items include invalid ios_deep_link values.
 * @param ANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID Some items include invalid android_deep_link.
 * @param UTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
 * @param COUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY Some items include a currency that doesn't match the usual currency for the location where that product is sold or shipped.
 * @param MINUnderscoreADUnderscorePRICEUnderscoreINVALID Some items include min_ad_price values that are formatted incorrectly.
 * @param GTINUnderscoreINVALID Some items include incorrectly formatted GTINs.
 * @param INCONSISTENTUnderscoreCURRENCYUnderscoreVALUES Some items include inconsistent currencies in price fields.
 * @param SALESUnderscorePRICEUnderscoreTOOUnderscoreLOW Some items include sales price that is much lower than the list price.
 * @param SHIPPINGUnderscoreWIDTHUnderscoreINVALID Some items include incorrectly formatted shipping_width.
 * @param SHIPPINGUnderscoreHEIGHTUnderscoreINVALID Some items include incorrectly formatted shipping_height.
 * @param SALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
 * @param MPNUnderscoreINVALID Some items include incorrectly formatted MPNs.
 */
case class CatalogsFeedValidationWarnings(ADUnderscoreLINKUnderscoreFORMATUnderscoreWARNING: Option[Int],
                ADUnderscoreLINKUnderscoreSAMEUnderscoreASUnderscoreLINK: Option[Int],
                TITLEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                DESCRIPTIONUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                GENDERUnderscoreINVALID: Option[Int],
                AGEUnderscoreGROUPUnderscoreINVALID: Option[Int],
                SIZEUnderscoreTYPEUnderscoreINVALID: Option[Int],
                SIZEUnderscoreSYSTEMUnderscoreINVALID: Option[Int],
                LINKUnderscoreFORMATUnderscoreWARNING: Option[Int],
                SALESUnderscorePRICEUnderscoreINVALID: Option[Int],
                PRODUCTUnderscoreCATEGORYUnderscoreDEPTHUnderscoreWARNING: Option[Int],
                ADWORDSUnderscoreFORMATUnderscoreWARNING: Option[Int],
                ADWORDSUnderscoreSAMEUnderscoreASUnderscoreLINK: Option[Int],
                DUPLICATEUnderscoreHEADERS: Option[Int],
                FETCHUnderscoreSAMEUnderscoreSIGNATURE: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreLINKUnderscoreWARNING: Option[Int],
                IMAGEUnderscoreLINKUnderscoreWARNING: Option[Int],
                SHIPPINGUnderscoreINVALID: Option[Int],
                TAXUnderscoreINVALID: Option[Int],
                SHIPPINGUnderscoreWEIGHTUnderscoreINVALID: Option[Int],
                EXPIRATIONUnderscoreDATEUnderscoreINVALID: Option[Int],
                AVAILABILITYUnderscoreDATEUnderscoreINVALID: Option[Int],
                SALEUnderscoreDATEUnderscoreINVALID: Option[Int],
                WEIGHTUnderscoreUNITUnderscoreINVALID: Option[Int],
                ISUnderscoreBUNDLEUnderscoreINVALID: Option[Int],
                UPDATEDUnderscoreTIMEUnderscoreINVALID: Option[Int],
                CUSTOMUnderscoreLABELUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                PRODUCTUnderscoreTYPEUnderscoreLENGTHUnderscoreTOOUnderscoreLONG: Option[Int],
                TOOUnderscoreMANYUnderscoreADDITIONALUnderscoreIMAGEUnderscoreLINKS: Option[Int],
                MULTIPACKUnderscoreINVALID: Option[Int],
                INDEXEDUnderscorePRODUCTUnderscoreCOUNTUnderscoreLARGEUnderscoreDELTA: Option[Int],
                ITEMUnderscoreADDITIONALUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFAILURE: Option[Int],
                OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreMISSING: Option[Int],
                OPTIONALUnderscorePRODUCTUnderscoreCATEGORYUnderscoreINVALID: Option[Int],
                OPTIONALUnderscoreCONDITIONUnderscoreMISSING: Option[Int],
                OPTIONALUnderscoreCONDITIONUnderscoreINVALID: Option[Int],
                IOSUnderscoreDEEPUnderscoreLINKUnderscoreINVALID: Option[Int],
                ANDROIDUnderscoreDEEPUnderscoreLINKUnderscoreINVALID: Option[Int],
                UTMUnderscoreSOURCEUnderscoreAUTOUnderscoreCORRECTED: Option[Int],
                COUNTRYUnderscoreDOESUnderscoreNOTUnderscoreMAPUnderscoreTOUnderscoreCURRENCY: Option[Int],
                MINUnderscoreADUnderscorePRICEUnderscoreINVALID: Option[Int],
                GTINUnderscoreINVALID: Option[Int],
                INCONSISTENTUnderscoreCURRENCYUnderscoreVALUES: Option[Int],
                SALESUnderscorePRICEUnderscoreTOOUnderscoreLOW: Option[Int],
                SHIPPINGUnderscoreWIDTHUnderscoreINVALID: Option[Int],
                SHIPPINGUnderscoreHEIGHTUnderscoreINVALID: Option[Int],
                SALESUnderscorePRICEUnderscoreTOOUnderscoreHIGH: Option[Int],
                MPNUnderscoreINVALID: Option[Int]
                )

object CatalogsFeedValidationWarnings {
    /**
     * Creates the codec for converting CatalogsFeedValidationWarnings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedValidationWarnings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedValidationWarnings] = deriveEncoder
}
