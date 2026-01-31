/*
 * MediaUploadParameters.h
 *
 * 
 */

#ifndef _MediaUploadParameters_H_
#define _MediaUploadParameters_H_


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

class MediaUploadParameters : public Object {
public:
	/*! \brief Constructor.
	 */
	MediaUploadParameters();
	MediaUploadParameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MediaUploadParameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getContentType();

	/*! \brief Set 
	 */
	void setContentType(std::string  contentType);
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
	std::string getXamzalgorithm();

	/*! \brief Set 
	 */
	void setXamzalgorithm(std::string  xamzalgorithm);
	/*! \brief Get 
	 */
	std::string getXamzcredential();

	/*! \brief Set 
	 */
	void setXamzcredential(std::string  xamzcredential);
	/*! \brief Get 
	 */
	std::string getXamzdate();

	/*! \brief Set 
	 */
	void setXamzdate(std::string  xamzdate);
	/*! \brief Get 
	 */
	std::string getXamzsecuritytoken();

	/*! \brief Set 
	 */
	void setXamzsecuritytoken(std::string  xamzsecuritytoken);
	/*! \brief Get 
	 */
	std::string getXamzsignature();

	/*! \brief Set 
	 */
	void setXamzsignature(std::string  xamzsignature);

private:
	std::string contentType;
	std::string key;
	std::string policy;
	std::string xamzalgorithm;
	std::string xamzcredential;
	std::string xamzdate;
	std::string xamzsecuritytoken;
	std::string xamzsignature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MediaUploadParameters_H_ */
