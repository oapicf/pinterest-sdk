/*
 * Ad_account_owner.h
 *
 * 
 */

#ifndef _Ad_account_owner_H_
#define _Ad_account_owner_H_


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

class Ad_account_owner : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad_account_owner();
	Ad_account_owner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad_account_owner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Public username for the user account
	 */
	std::string getUsername();

	/*! \brief Set Public username for the user account
	 */
	void setUsername(std::string  username);

private:
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_account_owner_H_ */
