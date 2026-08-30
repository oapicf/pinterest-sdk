/*
 * AdPinPreviewCreativeType.h
 *
 * 
 */

#ifndef _AdPinPreviewCreativeType_H_
#define _AdPinPreviewCreativeType_H_


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

class AdPinPreviewCreativeType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdPinPreviewCreativeType();
	AdPinPreviewCreativeType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdPinPreviewCreativeType();

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

#endif /* _AdPinPreviewCreativeType_H_ */
