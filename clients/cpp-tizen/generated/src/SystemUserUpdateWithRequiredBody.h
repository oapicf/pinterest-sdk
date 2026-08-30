/*
 * SystemUserUpdateWithRequiredBody.h
 *
 * Resource create or update operation model with required body fields (no OptionalProperties).
 */

#ifndef _SystemUserUpdateWithRequiredBody_H_
#define _SystemUserUpdateWithRequiredBody_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create or update operation model with required body fields (no OptionalProperties).
 *
 *  \ingroup Models
 *
 */

class SystemUserUpdateWithRequiredBody : public Object {
public:
	/*! \brief Constructor.
	 */
	SystemUserUpdateWithRequiredBody();
	SystemUserUpdateWithRequiredBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SystemUserUpdateWithRequiredBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get New system user name
	 */
	std::string getName();

	/*! \brief Set New system user name
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SystemUserUpdateWithRequiredBody_H_ */
