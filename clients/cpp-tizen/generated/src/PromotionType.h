/*
 * PromotionType.h
 *
 * Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
 */

#ifndef _PromotionType_H_
#define _PromotionType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Determines the displayed promotion text along with what parameters (if any) are needed to complete the template.
 *
 *  \ingroup Models
 *
 */

class PromotionType : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionType();
	PromotionType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionType();

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

#endif /* _PromotionType_H_ */
