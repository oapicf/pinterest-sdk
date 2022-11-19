/*
 * ConversionEventsUserData_anyOf.h
 *
 * 
 */

#ifndef _ConversionEventsUserData_anyOf_H_
#define _ConversionEventsUserData_anyOf_H_


#include <string>
#include <list>
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

class ConversionEventsUserData_anyOf : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsUserData_anyOf();
	ConversionEventsUserData_anyOf(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsUserData_anyOf();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Sha256 hashes of lowercase version of user's email addresses. Used for matching.
	 */
	std::list<std::string> getEm();

	/*! \brief Set Sha256 hashes of lowercase version of user's email addresses. Used for matching.
	 */
	void setEm(std::list <std::string> em);

private:
	std::list <std::string>em;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsUserData_anyOf_H_ */
