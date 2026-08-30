/*
 * FollowUser.h
 *
 * 
 */

#ifndef _FollowUser_H_
#define _FollowUser_H_


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

class FollowUser : public Object {
public:
	/*! \brief Constructor.
	 */
	FollowUser();
	FollowUser(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FollowUser();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Always 'user'
	 */
	std::string getType();

	/*! \brief Set Always 'user'
	 */
	void setType(std::string  type);
	/*! \brief Get Username
	 */
	std::string getUsername();

	/*! \brief Set Username
	 */
	void setUsername(std::string  username);

private:
	std::string type;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FollowUser_H_ */
