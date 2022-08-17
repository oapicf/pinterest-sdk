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

	/*! \brief Get Some items include images that can't be found.
	 */
	int getIMAGEDOWNLOADERROR();

	/*! \brief Set Some items include images that can't be found.
	 */
	void setIMAGEDOWNLOADERROR(int  iMAGE_DOWNLOAD_ERROR);
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

private:
	int iMAGE_DOWNLOAD_ERROR;
	int lINE_LEVEL_INTERNAL_ERROR;
	int lARGE_PRODUCT_COUNT_DECREASE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionErrors_H_ */
