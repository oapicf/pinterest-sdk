/*
 * TargetingAdvertiserCountry.h
 *
 * Advertiser&#39;s ISO two character country code.
 */

#ifndef _TargetingAdvertiserCountry_H_
#define _TargetingAdvertiserCountry_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Advertiser's ISO two character country code.
 *
 *  \ingroup Models
 *
 */

class TargetingAdvertiserCountry : public Object {
public:
	/*! \brief Constructor.
	 */
	TargetingAdvertiserCountry();
	TargetingAdvertiserCountry(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TargetingAdvertiserCountry();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _TargetingAdvertiserCountry_H_ */
