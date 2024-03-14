/*
 * ProductGroupPromotionUpdateItem.h
 *
 * 
 */

#ifndef _ProductGroupPromotionUpdateItem_H_
#define _ProductGroupPromotionUpdateItem_H_


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

class ProductGroupPromotionUpdateItem : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionUpdateItem();
	ProductGroupPromotionUpdateItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionUpdateItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the product group.
	 */
	std::string getId();

	/*! \brief Set ID of the product group.
	 */
	void setId(std::string  id);

private:
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionUpdateItem_H_ */
