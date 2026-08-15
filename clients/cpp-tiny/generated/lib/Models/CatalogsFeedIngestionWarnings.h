
/*
 * CatalogsFeedIngestionWarnings.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedIngestionWarnings_H_
#define TINY_CPP_CLIENT_CatalogsFeedIngestionWarnings_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionWarnings{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedIngestionWarnings();
    CatalogsFeedIngestionWarnings(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedIngestionWarnings();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADCONTENTREADERROR();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADCONTENTREADERROR(int  aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADDNSLOOKUPERROR();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADDNSLOOKUPERROR(int  aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADFILENOTACCESSIBLE();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADFILENOTACCESSIBLE(int  aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADFILENOTFOUND();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADFILENOTFOUND(int  aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS400();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS400(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_400);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS403();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS403(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_403);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS404();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS404(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_404);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS405();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS405(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_405);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS410();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS410(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_410);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS429();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS429(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_429);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS500();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS500(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_500);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS502();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS502(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_502);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS503();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS503(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_503);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS504();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS504(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_504);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS507();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS507(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_507);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS508();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS508(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_508);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS520();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS520(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_520);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS521();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS521(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_521);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS522();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS522(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_522);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADHTTPSTATUS525();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADHTTPSTATUS525(int  aD_IMAGE_DOWNLOAD_HTTP_STATUS_525);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADIMAGEDOWNLOADINTERNALCONFIGURATIONERROR(int  aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADIMAGEDOWNLOADINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADIMAGEDOWNLOADINTERNALERROR(int  aD_IMAGE_DOWNLOAD_INTERNAL_ERROR);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADIMAGEDOWNLOADINTERNALFAILEDTODOWNLOAD(int  aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADINTERNALMALFORMEDURL();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADINTERNALMALFORMEDURL(int  aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADIMAGEDOWNLOADINTERNALRATELIMITED();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADIMAGEDOWNLOADINTERNALRATELIMITED(int  aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADIMAGEDOWNLOADINTERNALREQUESTEXPIRED();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADIMAGEDOWNLOADINTERNALREQUESTEXPIRED(int  aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADINVALIDFILE();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADINVALIDFILE(int  aD_IMAGE_DOWNLOAD_INVALID_FILE);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADSITEERROR();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADSITEERROR(int  aD_IMAGE_DOWNLOAD_SITE_ERROR);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADSITETIMEOUT();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADSITETIMEOUT(int  aD_IMAGE_DOWNLOAD_SITE_TIMEOUT);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADSSLERROR();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADSSLERROR(int  aD_IMAGE_DOWNLOAD_SSL_ERROR);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEDOWNLOADSSLHANDSHAKEERROR();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEDOWNLOADSSLHANDSHAKEERROR(int  aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR);
	/*! \brief Get Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADIMAGEPROCESSINGEMPTYFILE();

	/*! \brief Set Ad image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADIMAGEPROCESSINGEMPTYFILE(int  aD_IMAGE_PROCESSING_EMPTY_FILE);
	/*! \brief Get Ad images must have a height larger than 75 pixels
	 */
	int getADIMAGEPROCESSINGHEIGHTTOOSMALL();

	/*! \brief Set Ad images must have a height larger than 75 pixels
	 */
	void setADIMAGEPROCESSINGHEIGHTTOOSMALL(int  aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL);
	/*! \brief Get Ad images must have a maximum area (width x height) of less than 89478485 pixels
	 */
	int getADIMAGEPROCESSINGTOOMANYPIXELS();

	/*! \brief Set Ad images must have a maximum area (width x height) of less than 89478485 pixels
	 */
	void setADIMAGEPROCESSINGTOOMANYPIXELS(int  aD_IMAGE_PROCESSING_TOO_MANY_PIXELS);
	/*! \brief Get Some ad images could not be processed due to a file type mismatch.
	 */
	int getADIMAGEPROCESSINGTYPEMISMATCH();

	/*! \brief Set Some ad images could not be processed due to a file type mismatch.
	 */
	void setADIMAGEPROCESSINGTYPEMISMATCH(int  aD_IMAGE_PROCESSING_TYPE_MISMATCH);
	/*! \brief Get Ad images must have a width larger than 75 pixels
	 */
	int getADIMAGEPROCESSINGWIDTHTOOSMALL();

	/*! \brief Set Ad images must have a width larger than 75 pixels
	 */
	void setADIMAGEPROCESSINGWIDTHTOOSMALL(int  aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADCONTENTREADERROR();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADCONTENTREADERROR(int  aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADDNSLOOKUPERROR();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADDNSLOOKUPERROR(int  aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADFILENOTACCESSIBLE();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADFILENOTACCESSIBLE(int  aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADFILENOTFOUND();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADFILENOTFOUND(int  aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS400();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS400(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_400);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS403();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS403(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_403);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS404();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS404(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_404);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS405();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS405(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_405);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS410();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS410(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_410);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS429();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS429(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_429);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS500();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS500(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_500);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS502();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS502(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_502);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS503();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS503(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_503);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS504();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS504(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_504);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS507();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS507(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_507);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS508();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS508(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_508);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS520();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS520(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_520);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS521();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS521(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_521);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS522();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS522(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_522);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADHTTPSTATUS525();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADHTTPSTATUS525(int  aD_VIDEO_DOWNLOAD_HTTP_STATUS_525);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADVIDEODOWNLOADINTERNALCONFIGURATIONERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADVIDEODOWNLOADINTERNALCONFIGURATIONERROR(int  aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADVIDEODOWNLOADINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADVIDEODOWNLOADINTERNALERROR(int  aD_VIDEO_DOWNLOAD_INTERNAL_ERROR);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADVIDEODOWNLOADINTERNALFAILEDTODOWNLOAD(int  aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADINTERNALMALFORMEDURL();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADINTERNALMALFORMEDURL(int  aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADVIDEODOWNLOADINTERNALRATELIMITED();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADVIDEODOWNLOADINTERNALRATELIMITED(int  aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADVIDEODOWNLOADINTERNALREQUESTEXPIRED();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADVIDEODOWNLOADINTERNALREQUESTEXPIRED(int  aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADINVALIDFILE();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADINVALIDFILE(int  aD_VIDEO_DOWNLOAD_INVALID_FILE);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADSITEERROR();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADSITEERROR(int  aD_VIDEO_DOWNLOAD_SITE_ERROR);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADSITETIMEOUT();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADSITETIMEOUT(int  aD_VIDEO_DOWNLOAD_SITE_TIMEOUT);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADSSLERROR();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADSSLERROR(int  aD_VIDEO_DOWNLOAD_SSL_ERROR);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEODOWNLOADSSLHANDSHAKEERROR();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEODOWNLOADSSLHANDSHAKEERROR(int  aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR);
	/*! \brief Get Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
	 */
	int getADVIDEOLENGTHTOOSHORT();

	/*! \brief Set Ad videos length is too short. Please ensure that all ad videos are at least 4 seconds long.
	 */
	void setADVIDEOLENGTHTOOSHORT(int  aD_VIDEO_LENGTH_TOO_SHORT);
	/*! \brief Get Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADVIDEOPROCESSINGEMPTYFILE();

	/*! \brief Set Ad video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADVIDEOPROCESSINGEMPTYFILE(int  aD_VIDEO_PROCESSING_EMPTY_FILE);
	/*! \brief Get Ad videos must have a height larger than 75 pixels
	 */
	int getADVIDEOPROCESSINGHEIGHTTOOSMALL();

	/*! \brief Set Ad videos must have a height larger than 75 pixels
	 */
	void setADVIDEOPROCESSINGHEIGHTTOOSMALL(int  aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL);
	/*! \brief Get Ad videos must have a maximum area (width x height) of less than 89478485 pixels
	 */
	int getADVIDEOPROCESSINGTOOMANYPIXELS();

	/*! \brief Set Ad videos must have a maximum area (width x height) of less than 89478485 pixels
	 */
	void setADVIDEOPROCESSINGTOOMANYPIXELS(int  aD_VIDEO_PROCESSING_TOO_MANY_PIXELS);
	/*! \brief Get Some ad videos could not be processed due to a file type mismatch.
	 */
	int getADVIDEOPROCESSINGTYPEMISMATCH();

	/*! \brief Set Some ad videos could not be processed due to a file type mismatch.
	 */
	void setADVIDEOPROCESSINGTYPEMISMATCH(int  aD_VIDEO_PROCESSING_TYPE_MISMATCH);
	/*! \brief Get Ad videos must have a width larger than 75 pixels
	 */
	int getADVIDEOPROCESSINGWIDTHTOOSMALL();

	/*! \brief Set Ad videos must have a width larger than 75 pixels
	 */
	void setADVIDEOPROCESSINGWIDTHTOOSMALL(int  aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL);
	/*! \brief Get Additional image files are unreadable. Please upload new files to continue.
	 */
	int getADDITIONALIMAGEFILENOTACCESSIBLE();

	/*! \brief Set Additional image files are unreadable. Please upload new files to continue.
	 */
	void setADDITIONALIMAGEFILENOTACCESSIBLE(int  aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Additional image files are unreadable. Please upload new files to continue.
	 */
	int getADDITIONALIMAGEFILENOTFOUND();

	/*! \brief Set Additional image files are unreadable. Please upload new files to continue.
	 */
	void setADDITIONALIMAGEFILENOTFOUND(int  aDDITIONAL_IMAGE_FILE_NOT_FOUND);
	/*! \brief Get Additional image files are unreadable. Please upload new files to continue.
	 */
	int getADDITIONALIMAGEINVALIDFILE();

	/*! \brief Set Additional image files are unreadable. Please upload new files to continue.
	 */
	void setADDITIONALIMAGEINVALIDFILE(int  aDDITIONAL_IMAGE_INVALID_FILE);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADDITIONALIMAGELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADDITIONALIMAGELEVELINTERNALERROR(int  aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR);
	/*! \brief Get Additional image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADDITIONALIMAGEMALFORMEDURL();

	/*! \brief Set Additional image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADDITIONALIMAGEMALFORMEDURL(int  aDDITIONAL_IMAGE_MALFORMED_URL);
	/*! \brief Get Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
	 */
	int getFETCHGOOGLESHEETPUBLICCANEDIT();

	/*! \brief Set Update your Google Sheets sharing settings from 'Editor' to 'Viewer'.
	 */
	void setFETCHGOOGLESHEETPUBLICCANEDIT(int  fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT);
	/*! \brief Get Price is not a supported column. Use base_price and sale_price instead.
	 */
	int getHOTELPRICEHEADERISPRESENT();

	/*! \brief Set Price is not a supported column. Use base_price and sale_price instead.
	 */
	void setHOTELPRICEHEADERISPRESENT(int  hOTEL_PRICE_HEADER_IS_PRESENT);
	/*! \brief Get Video length is too short. Please ensure that the main video is at least 4 seconds long.
	 */
	int getVIDEODOWNLOADVIDEOTOOSHORT();

	/*! \brief Set Video length is too short. Please ensure that the main video is at least 4 seconds long.
	 */
	void setVIDEODOWNLOADVIDEOTOOSHORT(int  vIDEO_DOWNLOAD_VIDEO_TOO_SHORT);
	/*! \brief Get Video files are unreadable. Please upload new files to continue.
	 */
	int getVIDEOFILENOTACCESSIBLE();

	/*! \brief Set Video files are unreadable. Please upload new files to continue.
	 */
	void setVIDEOFILENOTACCESSIBLE(int  vIDEO_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Video files are unreadable. Please upload new files to continue.
	 */
	int getVIDEOFILENOTFOUND();

	/*! \brief Set Video files are unreadable. Please upload new files to continue.
	 */
	void setVIDEOFILENOTFOUND(int  vIDEO_FILE_NOT_FOUND);
	/*! \brief Get Video files are unreadable. Please upload new files to continue.
	 */
	int getVIDEOINVALIDFILE();

	/*! \brief Set Video files are unreadable. Please upload new files to continue.
	 */
	void setVIDEOINVALIDFILE(int  vIDEO_INVALID_FILE);
	/*! \brief Get We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
	 */
	int getVIDEOLEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional videos. The next download attempt will happen in 24 hours.
	 */
	void setVIDEOLEVELINTERNALERROR(int  vIDEO_LEVEL_INTERNAL_ERROR);
	/*! \brief Get Video files are unreadable. Please check your link and upload new files to continue.
	 */
	int getVIDEOMALFORMEDURL();

	/*! \brief Set Video files are unreadable. Please check your link and upload new files to continue.
	 */
	void setVIDEOMALFORMEDURL(int  vIDEO_MALFORMED_URL);


    private:
    int aD_IMAGE_DOWNLOAD_CONTENT_READ_ERROR{};
    int aD_IMAGE_DOWNLOAD_DNS_LOOKUP_ERROR{};
    int aD_IMAGE_DOWNLOAD_FILE_NOT_ACCESSIBLE{};
    int aD_IMAGE_DOWNLOAD_FILE_NOT_FOUND{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_400{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_403{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_404{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_405{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_410{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_429{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_500{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_502{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_503{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_504{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_507{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_508{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_520{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_521{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_522{};
    int aD_IMAGE_DOWNLOAD_HTTP_STATUS_525{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_ERROR{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_MALFORMED_URL{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_RATE_LIMITED{};
    int aD_IMAGE_DOWNLOAD_INTERNAL_REQUEST_EXPIRED{};
    int aD_IMAGE_DOWNLOAD_INVALID_FILE{};
    int aD_IMAGE_DOWNLOAD_SITE_ERROR{};
    int aD_IMAGE_DOWNLOAD_SITE_TIMEOUT{};
    int aD_IMAGE_DOWNLOAD_SSL_ERROR{};
    int aD_IMAGE_DOWNLOAD_SSL_HANDSHAKE_ERROR{};
    int aD_IMAGE_PROCESSING_EMPTY_FILE{};
    int aD_IMAGE_PROCESSING_HEIGHT_TOO_SMALL{};
    int aD_IMAGE_PROCESSING_TOO_MANY_PIXELS{};
    int aD_IMAGE_PROCESSING_TYPE_MISMATCH{};
    int aD_IMAGE_PROCESSING_WIDTH_TOO_SMALL{};
    int aD_VIDEO_DOWNLOAD_CONTENT_READ_ERROR{};
    int aD_VIDEO_DOWNLOAD_DNS_LOOKUP_ERROR{};
    int aD_VIDEO_DOWNLOAD_FILE_NOT_ACCESSIBLE{};
    int aD_VIDEO_DOWNLOAD_FILE_NOT_FOUND{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_400{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_403{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_404{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_405{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_410{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_429{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_500{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_502{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_503{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_504{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_507{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_508{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_520{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_521{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_522{};
    int aD_VIDEO_DOWNLOAD_HTTP_STATUS_525{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_CONFIGURATION_ERROR{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_ERROR{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_FAILED_TO_DOWNLOAD{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_MALFORMED_URL{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_RATE_LIMITED{};
    int aD_VIDEO_DOWNLOAD_INTERNAL_REQUEST_EXPIRED{};
    int aD_VIDEO_DOWNLOAD_INVALID_FILE{};
    int aD_VIDEO_DOWNLOAD_SITE_ERROR{};
    int aD_VIDEO_DOWNLOAD_SITE_TIMEOUT{};
    int aD_VIDEO_DOWNLOAD_SSL_ERROR{};
    int aD_VIDEO_DOWNLOAD_SSL_HANDSHAKE_ERROR{};
    int aD_VIDEO_LENGTH_TOO_SHORT{};
    int aD_VIDEO_PROCESSING_EMPTY_FILE{};
    int aD_VIDEO_PROCESSING_HEIGHT_TOO_SMALL{};
    int aD_VIDEO_PROCESSING_TOO_MANY_PIXELS{};
    int aD_VIDEO_PROCESSING_TYPE_MISMATCH{};
    int aD_VIDEO_PROCESSING_WIDTH_TOO_SMALL{};
    int aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE{};
    int aDDITIONAL_IMAGE_FILE_NOT_FOUND{};
    int aDDITIONAL_IMAGE_INVALID_FILE{};
    int aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR{};
    int aDDITIONAL_IMAGE_MALFORMED_URL{};
    int fETCH_GOOGLE_SHEET_PUBLIC_CAN_EDIT{};
    int hOTEL_PRICE_HEADER_IS_PRESENT{};
    int vIDEO_DOWNLOAD_VIDEO_TOO_SHORT{};
    int vIDEO_FILE_NOT_ACCESSIBLE{};
    int vIDEO_FILE_NOT_FOUND{};
    int vIDEO_INVALID_FILE{};
    int vIDEO_LEVEL_INTERNAL_ERROR{};
    int vIDEO_MALFORMED_URL{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestionWarnings_H_ */
