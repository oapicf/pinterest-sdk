/*
 * UserWebsiteVerifyRequest.h
 *
 * User website verification request
 */

#ifndef _UserWebsiteVerifyRequest_H_
#define _UserWebsiteVerifyRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief User website verification request
 *
 *  \ingroup Models
 *
 */

class UserWebsiteVerifyRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UserWebsiteVerifyRequest();
	UserWebsiteVerifyRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserWebsiteVerifyRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getWebsite();

	/*! \brief Set 
	 */
	void setWebsite(std::string  website);
	/*! \brief Get 
	 */
	std::string getVerificationMethod();

	/*! \brief Set 
	 */
	void setVerificationMethod(std::string  verification_method);

private:
	std::string website;
	std::string verification_method;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserWebsiteVerifyRequest_H_ */
