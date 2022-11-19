/*
 * ConversionEventsUserData_anyOf_1.h
 *
 * 
 */

#ifndef _ConversionEventsUserData_anyOf_1_H_
#define _ConversionEventsUserData_anyOf_1_H_


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

class ConversionEventsUserData_anyOf_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventsUserData_anyOf_1();
	ConversionEventsUserData_anyOf_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventsUserData_anyOf_1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching.
	 */
	std::list<std::string> getHashedMaids();

	/*! \brief Set Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching.
	 */
	void setHashedMaids(std::list <std::string> hashed_maids);

private:
	std::list <std::string>hashed_maids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventsUserData_anyOf_1_H_ */
