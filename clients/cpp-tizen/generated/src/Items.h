/*
 * Items.h
 *
 * 
 */

#ifndef _Items_H_
#define _Items_H_


#include <string>
#include "ProductGroupPromotionCommon.h"
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

class Items : public Object {
public:
	/*! \brief Constructor.
	 */
	Items();
	Items(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Items();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ProductGroupPromotionCommon getItems();

	/*! \brief Set 
	 */
	void setItems(ProductGroupPromotionCommon  items);

private:
	ProductGroupPromotionCommon items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Items_H_ */
