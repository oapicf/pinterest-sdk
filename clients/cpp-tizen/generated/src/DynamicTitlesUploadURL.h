/*
 * DynamicTitlesUploadURL.h
 *
 * 
 */

#ifndef _DynamicTitlesUploadURL_H_
#define _DynamicTitlesUploadURL_H_


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

class DynamicTitlesUploadURL : public Object {
public:
	/*! \brief Constructor.
	 */
	DynamicTitlesUploadURL();
	DynamicTitlesUploadURL(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DynamicTitlesUploadURL();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
	 */
	std::string getExistingFilename();

	/*! \brief Set If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
	 */
	void setExistingFilename(std::string  existing_filename);
	/*! \brief Get Unique identifier for this upload session. Must be passed to the process endpoint.
	 */
	std::string getRequestId();

	/*! \brief Set Unique identifier for this upload session. Must be passed to the process endpoint.
	 */
	void setRequestId(std::string  request_id);
	/*! \brief Get Pre-signed S3 PUT URL to upload the reviewed CSV file.
	 */
	std::string getUploadUrl();

	/*! \brief Set Pre-signed S3 PUT URL to upload the reviewed CSV file.
	 */
	void setUploadUrl(std::string  upload_url);

private:
	std::string existing_filename;
	std::string request_id;
	std::string upload_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DynamicTitlesUploadURL_H_ */
