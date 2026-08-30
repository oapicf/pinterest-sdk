/*
 * ProductGroupPromotionCustomizableCTAType.h
 *
 * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 */

#ifndef _ProductGroupPromotionCustomizableCTAType_H_
#define _ProductGroupPromotionCustomizableCTAType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotionCustomizableCTAType : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionCustomizableCTAType();
	ProductGroupPromotionCustomizableCTAType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionCustomizableCTAType();

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

#endif /* _ProductGroupPromotionCustomizableCTAType_H_ */
