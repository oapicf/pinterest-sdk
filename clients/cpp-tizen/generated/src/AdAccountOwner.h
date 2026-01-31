/*
 * AdAccountOwner.h
 *
 * 
 */

#ifndef _AdAccountOwner_H_
#define _AdAccountOwner_H_


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

class AdAccountOwner : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountOwner();
	AdAccountOwner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountOwner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The owning account's user ID.
	 */
	std::string getId();

	/*! \brief Set The owning account's user ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Public username for the user account
	 */
	std::string getUsername();

	/*! \brief Set Public username for the user account
	 */
	void setUsername(std::string  username);

private:
	std::string id;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountOwner_H_ */
