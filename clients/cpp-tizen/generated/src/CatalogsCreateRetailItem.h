/*
 * CatalogsCreateRetailItem.h
 *
 * An item to be created
 */

#ifndef _CatalogsCreateRetailItem_H_
#define _CatalogsCreateRetailItem_H_


#include <string>
#include "ItemAttributesRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An item to be created
 *
 *  \ingroup Models
 *
 */

class CatalogsCreateRetailItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsCreateRetailItem();
	CatalogsCreateRetailItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsCreateRetailItem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get 
	 */
	std::string getOperation();

	/*! \brief Set 
	 */
	void setOperation(std::string  operation);
	/*! \brief Get 
	 */
	ItemAttributesRequest getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributesRequest  attributes);

private:
	std::string item_id;
	std::string operation;
	ItemAttributesRequest attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsCreateRetailItem_H_ */
