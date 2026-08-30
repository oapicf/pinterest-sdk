/*
 * TopVideoPinsSortBy.h
 *
 * Sort metric for top video pins analytics.
 */

#ifndef _TopVideoPinsSortBy_H_
#define _TopVideoPinsSortBy_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Sort metric for top video pins analytics.
 *
 *  \ingroup Models
 *
 */

class TopVideoPinsSortBy : public Object {
public:
	/*! \brief Constructor.
	 */
	TopVideoPinsSortBy();
	TopVideoPinsSortBy(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TopVideoPinsSortBy();

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

#endif /* _TopVideoPinsSortBy_H_ */
