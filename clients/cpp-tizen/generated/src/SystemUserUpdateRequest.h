/*
 * System_user_update_request.h
 *
 * 
 */

#ifndef _System_user_update_request_H_
#define _System_user_update_request_H_


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

class System_user_update_request : public Object {
public:
	/*! \brief Constructor.
	 */
	System_user_update_request();
	System_user_update_request(char* str);

	/*! \brief Destructor.
	 */
	virtual ~System_user_update_request();

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

#endif /* _System_user_update_request_H_ */
