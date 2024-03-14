/*
 * BulkEntityType.h
 *
 * Refers ads entity type
 */

#ifndef _BulkEntityType_H_
#define _BulkEntityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Refers ads entity type
 *
 *  \ingroup Models
 *
 */

class BulkEntityType : public Object {
public:
	/*! \brief Constructor.
	 */
	BulkEntityType();
	BulkEntityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BulkEntityType();

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

#endif /* _BulkEntityType_H_ */
