/*
 * UpdatableItemAttributesGtin.h
 *
 * The unique universal product identifier.
 */

#ifndef _UpdatableItemAttributesGtin_H_
#define _UpdatableItemAttributesGtin_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The unique universal product identifier.
 *
 *  \ingroup Models
 *
 */

class UpdatableItemAttributesGtin : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatableItemAttributesGtin();
	UpdatableItemAttributesGtin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatableItemAttributesGtin();

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

#endif /* _UpdatableItemAttributesGtin_H_ */
