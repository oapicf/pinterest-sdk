/*
 * PromotionApplicationLevel.h
 *
 * Specify if the promotion is applied at ad group or item level.
 */

#ifndef _PromotionApplicationLevel_H_
#define _PromotionApplicationLevel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specify if the promotion is applied at ad group or item level.
 *
 *  \ingroup Models
 *
 */

class PromotionApplicationLevel : public Object {
public:
	/*! \brief Constructor.
	 */
	PromotionApplicationLevel();
	PromotionApplicationLevel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PromotionApplicationLevel();

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

#endif /* _PromotionApplicationLevel_H_ */
