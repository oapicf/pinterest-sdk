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

	/*! \brief Get 
	 */
	int getImageDownloadError();

	/*! \brief Set 
	 */
	void setImageDownloadError(int  image_download_error);
	/*! \brief Get 
	 */
	int getImageDownloadConnectionTimeout();

	/*! \brief Set 
	 */
	void setImageDownloadConnectionTimeout(int  image_download_connection_timeout);
	/*! \brief Get 
	 */
	int getImageFormatUnrecognize();

	/*! \brief Set 
	 */
	void setImageFormatUnrecognize(int  image_format_unrecognize);
	/*! \brief Get 
	 */
	int getLineLevelInternalError();

	/*! \brief Set 
	 */
	void setLineLevelInternalError(int  line_level_internal_error);
	/*! \brief Get 
	 */
	int getLargeProductCountDecrease();

	/*! \brief Set 
	 */
	void setLargeProductCountDecrease(int  large_product_count_decrease);

private:
	int image_download_error;
	int image_download_connection_timeout;
	int image_format_unrecognize;
	int line_level_internal_error;
	int large_product_count_decrease;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsFeedIngestionErrors_H_ */
