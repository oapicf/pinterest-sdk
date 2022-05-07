/*
 * BoardOwner.h
 *
 * 
 */

#ifndef _BoardOwner_H_
#define _BoardOwner_H_


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

class BoardOwner : public Object {
public:
	/*! \brief Constructor.
	 */
	BoardOwner();
	BoardOwner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BoardOwner();

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

#endif /* _BoardOwner_H_ */
