/*
 * TopPinsSortBy.h
 *
 * Sort metric for top pins analytics.
 */

#ifndef _TopPinsSortBy_H_
#define _TopPinsSortBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Sort metric for top pins analytics.
 *
 *  \ingroup Models
 *
 */

class TopPinsSortBy : public Object {
public:
	/*! \brief Constructor.
	 */
	TopPinsSortBy();
	TopPinsSortBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopPinsSortBy();

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

#endif /* _TopPinsSortBy_H_ */
