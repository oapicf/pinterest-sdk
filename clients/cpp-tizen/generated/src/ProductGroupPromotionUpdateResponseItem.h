/*
 * ProductGroupPromotionUpdateResponseItem.h
 *
 * 
 */

#ifndef _ProductGroupPromotionUpdateResponseItem_H_
#define _ProductGroupPromotionUpdateResponseItem_H_


#include <string>
#include "Exception.h"
#include "ProductGroupPromotion.h"
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

class ProductGroupPromotionUpdateResponseItem : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionUpdateResponseItem();
	ProductGroupPromotionUpdateResponseItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionUpdateResponseItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ProductGroupPromotion getData();

	/*! \brief Set 
	 */
	void setData(ProductGroupPromotion  data);
	/*! \brief Get 
	 */
	Exception getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Exception  exceptions);

private:
	ProductGroupPromotion data;
	Exception exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionUpdateResponseItem_H_ */
