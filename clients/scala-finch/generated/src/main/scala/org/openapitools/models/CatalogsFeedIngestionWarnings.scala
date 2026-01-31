package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreCONTENTUnderscoreREADUnderscoreERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreDNSUnderscoreLOOKUPUnderscoreERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreFOUND Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore400 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore403 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore404 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore405 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore410 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore429 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore500 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore502 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore503 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore504 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore507 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore508 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore520 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore521 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore522 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore525 Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreCONFIGURATIONUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreFAILEDUnderscoreTOUnderscoreDOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreMALFORMEDUnderscoreURL Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreRATEUnderscoreLIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreREQUESTUnderscoreEXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINVALIDUnderscoreFILE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSITEUnderscoreERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSITEUnderscoreTIMEOUT Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSSLUnderscoreERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSSLUnderscoreHANDSHAKEUnderscoreERROR Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreEMPTYUnderscoreFILE Ad image files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreHEIGHTUnderscoreTOOUnderscoreSMALL Ad images must have a height larger than 75 pixels
 * @param ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreTOOUnderscoreMANYUnderscorePIXELS Ad images must have a maximum area (width x height) of less than 89478485 pixels
 * @param ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreTYPEUnderscoreMISMATCH Some ad images could not be processed due to a file type mismatch.
 * @param ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreWIDTHUnderscoreTOOUnderscoreSMALL Ad images must have a width larger than 75 pixels
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreCONTENTUnderscoreREADUnderscoreERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreDNSUnderscoreLOOKUPUnderscoreERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreFOUND Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore400 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore403 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore404 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore405 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore410 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore429 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore500 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore502 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore503 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore504 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore507 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore508 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore520 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore521 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore522 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore525 Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreCONFIGURATIONUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreFAILEDUnderscoreTOUnderscoreDOWNLOAD We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreMALFORMEDUnderscoreURL Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreRATEUnderscoreLIMITED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreREQUESTUnderscoreEXPIRED We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINVALIDUnderscoreFILE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSITEUnderscoreERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSITEUnderscoreTIMEOUT Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSSLUnderscoreERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSSLUnderscoreHANDSHAKEUnderscoreERROR Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscoreLENGTHUnderscoreTOOUnderscoreSHORT Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
 * @param ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreEMPTYUnderscoreFILE Ad video files are unreadable. Please check your link and upload new files to continue.
 * @param ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreHEIGHTUnderscoreTOOUnderscoreSMALL Ad videos must have a height larger than 75 pixels
 * @param ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreTOOUnderscoreMANYUnderscorePIXELS Ad videos must have a maximum area (width x height) of less than 89478485 pixels
 * @param ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreTYPEUnderscoreMISMATCH Some ad videos could not be processed due to a file type mismatch.
 * @param ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreWIDTHUnderscoreTOOUnderscoreSMALL Ad videos must have a width larger than 75 pixels
 * @param ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE Additional image files are unreadable. Please upload new files to continue.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @param ADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL Additional image files are unreadable. Please check your link and upload new files to continue.
 * @param FETCHUnderscoreGOOGLEUnderscoreSHEETUnderscorePUBLICUnderscoreCANUnderscoreEDIT Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
 * @param HOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT Price is not a supported column. Use base_price and sale_price instead.
 * @param VIDEOUnderscoreDOWNLOADUnderscoreVIDEOUnderscoreTOOUnderscoreSHORT Video length is too short. Please ensure that the main video is at least 4 seconds long.
 * @param VIDEOUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE Video files are unreadable. Please upload new files to continue.
 * @param VIDEOUnderscoreFILEUnderscoreNOTUnderscoreFOUND Video files are unreadable. Please upload new files to continue.
 * @param VIDEOUnderscoreINVALIDUnderscoreFILE Video files are unreadable. Please upload new files to continue.
 * @param VIDEOUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
 * @param VIDEOUnderscoreMALFORMEDUnderscoreURL Video files are unreadable. Please check your link and upload new files to continue.
 */
case class CatalogsFeedIngestionWarnings(ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreCONTENTUnderscoreREADUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreDNSUnderscoreLOOKUPUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore400: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore403: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore404: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore405: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore410: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore429: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore500: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore502: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore503: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore504: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore507: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore508: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore520: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore521: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore522: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore525: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreCONFIGURATIONUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreFAILEDUnderscoreTOUnderscoreDOWNLOAD: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreMALFORMEDUnderscoreURL: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreRATEUnderscoreLIMITED: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreREQUESTUnderscoreEXPIRED: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreINVALIDUnderscoreFILE: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSITEUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSITEUnderscoreTIMEOUT: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSSLUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscoreDOWNLOADUnderscoreSSLUnderscoreHANDSHAKEUnderscoreERROR: Option[Int],
                ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreEMPTYUnderscoreFILE: Option[Int],
                ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreHEIGHTUnderscoreTOOUnderscoreSMALL: Option[Int],
                ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreTOOUnderscoreMANYUnderscorePIXELS: Option[Int],
                ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreTYPEUnderscoreMISMATCH: Option[Int],
                ADUnderscoreIMAGEUnderscorePROCESSINGUnderscoreWIDTHUnderscoreTOOUnderscoreSMALL: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreCONTENTUnderscoreREADUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreDNSUnderscoreLOOKUPUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore400: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore403: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore404: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore405: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore410: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore429: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore500: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore502: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore503: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore504: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore507: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore508: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore520: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore521: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore522: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreHTTPUnderscoreSTATUSUnderscore525: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreCONFIGURATIONUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreFAILEDUnderscoreTOUnderscoreDOWNLOAD: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreMALFORMEDUnderscoreURL: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreRATEUnderscoreLIMITED: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINTERNALUnderscoreREQUESTUnderscoreEXPIRED: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreINVALIDUnderscoreFILE: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSITEUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSITEUnderscoreTIMEOUT: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSSLUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreDOWNLOADUnderscoreSSLUnderscoreHANDSHAKEUnderscoreERROR: Option[Int],
                ADUnderscoreVIDEOUnderscoreLENGTHUnderscoreTOOUnderscoreSHORT: Option[Int],
                ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreEMPTYUnderscoreFILE: Option[Int],
                ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreHEIGHTUnderscoreTOOUnderscoreSMALL: Option[Int],
                ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreTOOUnderscoreMANYUnderscorePIXELS: Option[Int],
                ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreTYPEUnderscoreMISMATCH: Option[Int],
                ADUnderscoreVIDEOUnderscorePROCESSINGUnderscoreWIDTHUnderscoreTOOUnderscoreSMALL: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreINVALIDUnderscoreFILE: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR: Option[Int],
                ADDITIONALUnderscoreIMAGEUnderscoreMALFORMEDUnderscoreURL: Option[Int],
                FETCHUnderscoreGOOGLEUnderscoreSHEETUnderscorePUBLICUnderscoreCANUnderscoreEDIT: Option[Int],
                HOTELUnderscorePRICEUnderscoreHEADERUnderscoreISUnderscorePRESENT: Option[Int],
                VIDEOUnderscoreDOWNLOADUnderscoreVIDEOUnderscoreTOOUnderscoreSHORT: Option[Int],
                VIDEOUnderscoreFILEUnderscoreNOTUnderscoreACCESSIBLE: Option[Int],
                VIDEOUnderscoreFILEUnderscoreNOTUnderscoreFOUND: Option[Int],
                VIDEOUnderscoreINVALIDUnderscoreFILE: Option[Int],
                VIDEOUnderscoreLEVELUnderscoreINTERNALUnderscoreERROR: Option[Int],
                VIDEOUnderscoreMALFORMEDUnderscoreURL: Option[Int]
                )

object CatalogsFeedIngestionWarnings {
    /**
     * Creates the codec for converting CatalogsFeedIngestionWarnings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsFeedIngestionWarnings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsFeedIngestionWarnings] = deriveEncoder
}
