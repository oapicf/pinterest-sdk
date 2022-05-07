/*
 * MediaUpload_allOf_upload_parameters.h
 *
 * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 */

#ifndef _MediaUpload_allOf_upload_parameters_H_
#define _MediaUpload_allOf_upload_parameters_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
 *
 *  \ingroup Models
 *
 */

class MediaUpload_allOf_upload_parameters : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUpload_allOf_upload_parameters();
	MediaUpload_allOf_upload_parameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUpload_allOf_upload_parameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getXamzdate();

	/*! \brief Set 
	 */
	void setXamzdate(std::string  xamzdate);
	/*! \brief Get 
	 */
	std::string getXamzsignature();

	/*! \brief Set 
	 */
	void setXamzsignature(std::string  xamzsignature);
	/*! \brief Get 
	 */
	std::string getXamzsecuritytoken();

	/*! \brief Set 
	 */
	void setXamzsecuritytoken(std::string  xamzsecuritytoken);
	/*! \brief Get 
	 */
	std::string getXamzalgorithm();

	/*! \brief Set 
	 */
	void setXamzalgorithm(std::string  xamzalgorithm);
	/*! \brief Get 
	 */
	std::string getKey();

	/*! \brief Set 
	 */
	void setKey(std::string  key);
	/*! \brief Get 
	 */
	std::string getPolicy();

	/*! \brief Set 
	 */
	void setPolicy(std::string  policy);
	/*! \brief Get 
	 */
	std::string getXamzcredential();

	/*! \brief Set 
	 */
	void setXamzcredential(std::string  xamzcredential);
	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  contentType);

private:
	std::string xamzdate;
	std::string xamzsignature;
	std::string xamzsecuritytoken;
	std::string xamzalgorithm;
	std::string key;
	std::string policy;
	std::string xamzcredential;
	std::string contentType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MediaUpload_allOf_upload_parameters_H_ */
