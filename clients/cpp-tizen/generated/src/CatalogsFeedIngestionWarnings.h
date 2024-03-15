/*
 * CatalogsFeedIngestionWarnings.h
 *
 * 
 */

#ifndef _CatalogsFeedIngestionWarnings_H_
#define _CatalogsFeedIngestionWarnings_H_


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

class CatalogsFeedIngestionWarnings : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsFeedIngestionWarnings();
	CatalogsFeedIngestionWarnings(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsFeedIngestionWarnings();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	int getADDITIONALIMAGELEVELINTERNALERROR();

	/*! \brief Set We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
	 */
	void setADDITIONALIMAGELEVELINTERNALERROR(int  aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR);
	/*! \brief Get Additional image files are unreadable. Please upload new files to continue.
	 */
	int getADDITIONALIMAGEFILENOTACCESSIBLE();

	/*! \brief Set Additional image files are unreadable. Please upload new files to continue.
	 */
	void setADDITIONALIMAGEFILENOTACCESSIBLE(int  aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE);
	/*! \brief Get Additional image files are unreadable. Please check your link and upload new files to continue.
	 */
	int getADDITIONALIMAGEMALFORMEDURL();

	/*! \brief Set Additional image files are unreadable. Please check your link and upload new files to continue.
	 */
	void setADDITIONALIMAGEMALFORMEDURL(int  aDDITIONAL_IMAGE_MALFORMED_URL);
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
	/*! \brief Get price is not a supported column. Use base_price and sale_price instead.
	 */
	int getHOTELPRICEHEADERISPRESENT();

	/*! \brief Set price is not a supported column. Use base_price and sale_price instead.
	 */
	void setHOTELPRICEHEADERISPRESENT(int  hOTEL_PRICE_HEADER_IS_PRESENT);

private:
	int aDDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;
	int aDDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;
	int aDDITIONAL_IMAGE_MALFORMED_URL;
	int aDDITIONAL_IMAGE_FILE_NOT_FOUND;
	int aDDITIONAL_IMAGE_INVALID_FILE;
	int hOTEL_PRICE_HEADER_IS_PRESENT;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionWarnings_H_ */
