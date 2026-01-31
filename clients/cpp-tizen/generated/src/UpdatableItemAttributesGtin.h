/*
 * UpdatableItemAttributes_gtin.h
 *
 * The unique universal product identifier.
 */

#ifndef _UpdatableItemAttributes_gtin_H_
#define _UpdatableItemAttributes_gtin_H_


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

class UpdatableItemAttributes_gtin : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdatableItemAttributes_gtin();
	UpdatableItemAttributes_gtin(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdatableItemAttributes_gtin();

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

#endif /* _UpdatableItemAttributes_gtin_H_ */
