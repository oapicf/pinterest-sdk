/*
 * CollectionsHeaderType.h
 *
 * Collections ad header type
 */

#ifndef _CollectionsHeaderType_H_
#define _CollectionsHeaderType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Collections ad header type
 *
 *  \ingroup Models
 *
 */

class CollectionsHeaderType : public Object {
public:
	/*! \brief Constructor.
	 */
	CollectionsHeaderType();
	CollectionsHeaderType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CollectionsHeaderType();

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

#endif /* _CollectionsHeaderType_H_ */
