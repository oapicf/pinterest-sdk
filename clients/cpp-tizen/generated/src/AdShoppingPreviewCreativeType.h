/*
 * AdShoppingPreviewCreativeType.h
 *
 * 
 */

#ifndef _AdShoppingPreviewCreativeType_H_
#define _AdShoppingPreviewCreativeType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdShoppingPreviewCreativeType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdShoppingPreviewCreativeType();
	AdShoppingPreviewCreativeType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdShoppingPreviewCreativeType();

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

#endif /* _AdShoppingPreviewCreativeType_H_ */
