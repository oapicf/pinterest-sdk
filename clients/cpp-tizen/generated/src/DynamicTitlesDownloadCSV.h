/*
 * DynamicTitlesDownloadCSV.h
 *
 * 
 */

#ifndef _DynamicTitlesDownloadCSV_H_
#define _DynamicTitlesDownloadCSV_H_


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

class DynamicTitlesDownloadCSV : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesDownloadCSV();
	DynamicTitlesDownloadCSV(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesDownloadCSV();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Pre-signed S3 URL to download the CSV file.
	 */
	std::string getDownloadUrl();

	/*! \brief Set Pre-signed S3 URL to download the CSV file.
	 */
	void setDownloadUrl(std::string  download_url);

private:
	std::string download_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesDownloadCSV_H_ */
