/*
 * UserWebsiteCreate.h
 *
 * Resource create operation model.
 */

#ifndef _UserWebsiteCreate_H_
#define _UserWebsiteCreate_H_


#include <string>
#include "WebsiteVerificationMethod.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class UserWebsiteCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	UserWebsiteCreate();
	UserWebsiteCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserWebsiteCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Method used to verify website ownership.
	 */
	WebsiteVerificationMethod getVerificationMethod();

	/*! \brief Set Method used to verify website ownership.
	 */
	void setVerificationMethod(WebsiteVerificationMethod  verification_method);
	/*! \brief Get Website with path or domain only
	 */
	std::string getWebsite();

	/*! \brief Set Website with path or domain only
	 */
	void setWebsite(std::string  website);

private:
	WebsiteVerificationMethod verification_method;
	std::string website;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserWebsiteCreate_H_ */
