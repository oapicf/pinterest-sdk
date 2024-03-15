/*
 * CatalogsFeedIngestionErrors.h
 *
 * 
 */

#ifndef _CatalogsFeedIngestionErrors_H_
#define _CatalogsFeedIngestionErrors_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CatalogsFeedIngestionErrors : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedIngestionErrors();
	CatalogsFeedIngestionErrors(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedIngestionErrors();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
	 */
	int getLINELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
	 */
	void setLINELEVELINTERNALERROR(int  lINE_LEVEL_INTERNAL_ERROR);
	/*! \brief Get The product count has decreased by more than 99% compared to the last successful ingestion.
	 */
	int getLARGEPRODUCTCOUNTDECREASE();

	/*! \brief Set The product count has decreased by more than 99% compared to the last successful ingestion.
	 */
	void setLARGEPRODUCTCOUNTDECREASE(int  lARGE_PRODUCT_COUNT_DECREASE);
	/*! \brief Get We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
	 */
	int getACCOUNTFLAGGED();

	/*! \brief Set We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
	 */
	void setACCOUNTFLAGGED(int  aCCOUNT_FLAGGED);
	/*! \brief Get We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
	 */
	int getIMAGELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
	 */
	void setIMAGELEVELINTERNALERROR(int  iMAGE_LEVEL_INTERNAL_ERROR);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEFILENOTACCESSIBLE();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEFILENOTACCESSIBLE(int  iMAGE_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getIMAGEMALFORMEDURL();

	/*! \brief Set Image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setIMAGEMALFORMEDURL(int  iMAGE_MALFORMED_URL);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEFILENOTFOUND();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEFILENOTFOUND(int  iMAGE_FILE_NOT_FOUND);
	/*! \brief Get Image files are unreadable. Please upload new files to continue.
	 */
	int getIMAGEINVALIDFILE();

	/*! \brief Set Image files are unreadable. Please upload new files to continue.
	 */
	void setIMAGEINVALIDFILE(int  iMAGE_INVALID_FILE);

private:
	int lINE_LEVEL_INTERNAL_ERROR;
	int lARGE_PRODUCT_COUNT_DECREASE;
	int aCCOUNT_FLAGGED;
	int iMAGE_LEVEL_INTERNAL_ERROR;
	int iMAGE_FILE_NOT_ACCESSIBLE;
	int iMAGE_MALFORMED_URL;
	int iMAGE_FILE_NOT_FOUND;
	int iMAGE_INVALID_FILE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionErrors_H_ */
