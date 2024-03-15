/*
 * UserSummary.h
 *
 * 
 */

#ifndef _UserSummary_H_
#define _UserSummary_H_


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

class UserSummary : public Object {
public:
	/*! \brief Constructor.
	 */
	UserSummary();
	UserSummary(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserSummary();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Username
	 */
	std::string getUsername();

	/*! \brief Set Username
	 */
	void setUsername(std::string  username);
	/*! \brief Get Always \"user\"
	 */
	std::string getType();

	/*! \brief Set Always \"user\"
	 */
	void setType(std::string  type);

private:
	std::string username;
	std::string type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserSummary_H_ */
