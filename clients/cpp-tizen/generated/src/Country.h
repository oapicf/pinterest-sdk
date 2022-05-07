/*
 * Country.h
 *
 * Country ID from ISO 3166-1 alpha-2.
 */

#ifndef _Country_H_
#define _Country_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Country ID from ISO 3166-1 alpha-2.
 *
 *  \ingroup Models
 *
 */

class Country : public Object {
public:
	/*! \brief Constructor.
	 */
	Country();
	Country(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Country();

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

#endif /* _Country_H_ */
