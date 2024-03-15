/*
 * ProductGroupPromotionResponseItem.h
 *
 * 
 */

#ifndef _ProductGroupPromotionResponseItem_H_
#define _ProductGroupPromotionResponseItem_H_


#include <string>
#include "Exception.h"
#include "ProductGroupPromotion.h"
#include <list>
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

class ProductGroupPromotionResponseItem : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionResponseItem();
	ProductGroupPromotionResponseItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionResponseItem();

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
	std::list<Exception> getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(std::list <Exception> exceptions);

private:
	ProductGroupPromotion data;
	std::list <Exception>exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionResponseItem_H_ */
