/*
 * WebsiteVerificationMethod.h
 *
 * Method used to verify website ownership.
 */

#ifndef _WebsiteVerificationMethod_H_
#define _WebsiteVerificationMethod_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Method used to verify website ownership.
 *
 *  \ingroup Models
 *
 */

class WebsiteVerificationMethod : public Object {
public:
	/*! \brief Constructor.
	 */
	WebsiteVerificationMethod();
	WebsiteVerificationMethod(char* str);

	/*! \brief Destructor.
	 */
	virtual ~WebsiteVerificationMethod();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _WebsiteVerificationMethod_H_ */
