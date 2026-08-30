
/*
 * DynamicTitlesUploadURL.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_DynamicTitlesUploadURL_H_
#define TINY_CPP_CLIENT_DynamicTitlesUploadURL_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class DynamicTitlesUploadURL{
public:

    /*! \brief Constructor.
	 */
    DynamicTitlesUploadURL();
    DynamicTitlesUploadURL(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~DynamicTitlesUploadURL();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
	 */
	std::string getExistingFilename();

	/*! \brief Set If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
	 */
	void setExistingFilename(std::string existing_filename);
	/*! \brief Get Unique identifier for this upload session. Must be passed to the process endpoint.
	 */
	std::string getRequestId();

	/*! \brief Set Unique identifier for this upload session. Must be passed to the process endpoint.
	 */
	void setRequestId(std::string request_id);
	/*! \brief Get Pre-signed S3 PUT URL to upload the reviewed CSV file.
	 */
	std::string getUploadUrl();

	/*! \brief Set Pre-signed S3 PUT URL to upload the reviewed CSV file.
	 */
	void setUploadUrl(std::string upload_url);


    private:
    std::string existing_filename{};
    std::string request_id{};
    std::string upload_url{};
};
}

#endif /* TINY_CPP_CLIENT_DynamicTitlesUploadURL_H_ */
