
/*
 * CatalogsFeedIngestionErrors.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CatalogsFeedIngestionErrors_H_
#define TINY_CPP_CLIENT_CatalogsFeedIngestionErrors_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionErrors{
public:

    /*! \brief Constructor.
	 */
    CatalogsFeedIngestionErrors();
    CatalogsFeedIngestionErrors(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CatalogsFeedIngestionErrors();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
	 */
	int getACCOUNTFLAGGED();

	/*! \brief Set We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
	 */
	void setACCOUNTFLAGGED(int aCCOUNT_FLAGGED);
	/*! \brief Get Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
	 */
	int getFETCHGOOGLESHEETNOTSHARED();

	/*! \brief Set Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
	 */
	void setFETCHGOOGLESHEETNOTSHARED(int fETCH_GOOGLE_SHEET_NOT_SHARED);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEFILENOTACCESSIBLE();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEFILENOTACCESSIBLE(int iMAGE_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEFILENOTFOUND();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEFILENOTFOUND(int iMAGE_FILE_NOT_FOUND);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEINVALIDFILE();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEINVALIDFILE(int iMAGE_INVALID_FILE);
	/*! \brief Get We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
	 */
	int getIMAGELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
	 */
	void setIMAGELEVELINTERNALERROR(int iMAGE_LEVEL_INTERNAL_ERROR);
	/*! \brief Get Image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getIMAGEMALFORMEDURL();

	/*! \brief Set Image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setIMAGEMALFORMEDURL(int iMAGE_MALFORMED_URL);
	/*! \brief Get The product count has decreased by more than 99% compared to the last successful ingestion.
	 */
	int getLARGEPRODUCTCOUNTDECREASE();

	/*! \brief Set The product count has decreased by more than 99% compared to the last successful ingestion.
	 */
	void setLARGEPRODUCTCOUNTDECREASE(int lARGE_PRODUCT_COUNT_DECREASE);
	/*! \brief Get We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
	 */
	int getLINELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
	 */
	void setLINELEVELINTERNALERROR(int lINE_LEVEL_INTERNAL_ERROR);


    private:
    int aCCOUNT_FLAGGED{};
    int fETCH_GOOGLE_SHEET_NOT_SHARED{};
    int iMAGE_FILE_NOT_ACCESSIBLE{};
    int iMAGE_FILE_NOT_FOUND{};
    int iMAGE_INVALID_FILE{};
    int iMAGE_LEVEL_INTERNAL_ERROR{};
    int iMAGE_MALFORMED_URL{};
    int lARGE_PRODUCT_COUNT_DECREASE{};
    int lINE_LEVEL_INTERNAL_ERROR{};
};
}

#endif /* TINY_CPP_CLIENT_CatalogsFeedIngestionErrors_H_ */
