/*
 * AdCollectionsHeaderType.h
 *
 * Collections ad header type for ads
 */

#ifndef _AdCollectionsHeaderType_H_
#define _AdCollectionsHeaderType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Collections ad header type for ads
 *
 *  \ingroup Models
 *
 */

class AdCollectionsHeaderType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdCollectionsHeaderType();
	AdCollectionsHeaderType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdCollectionsHeaderType();

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

#endif /* _AdCollectionsHeaderType_H_ */
