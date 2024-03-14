/*
 * NullableCatalogsItemFieldType.h
 *
 * Product item fields
 */

#ifndef _NullableCatalogsItemFieldType_H_
#define _NullableCatalogsItemFieldType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Product item fields
 *
 *  \ingroup Models
 *
 */

class NullableCatalogsItemFieldType : public Object {
public:
	/*! \brief Constructor.
	 */
	NullableCatalogsItemFieldType();
	NullableCatalogsItemFieldType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullableCatalogsItemFieldType();

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

#endif /* _NullableCatalogsItemFieldType_H_ */
