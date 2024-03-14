/*
 * Board_owner.h
 *
 * 
 */

#ifndef _Board_owner_H_
#define _Board_owner_H_


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

class Board_owner : public Object {
public:
	/*! \brief Constructor.
	 */
	Board_owner();
	Board_owner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Board_owner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUsername();

	/*! \brief Set 
	 */
	void setUsername(std::string  username);

private:
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Board_owner_H_ */
