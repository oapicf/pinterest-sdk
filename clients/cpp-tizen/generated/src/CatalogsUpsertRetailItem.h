/*
 * CatalogsUpsertRetailItem.h
 *
 * An item to be upserted
 */

#ifndef _CatalogsUpsertRetailItem_H_
#define _CatalogsUpsertRetailItem_H_


#include <string>
#include "ItemAttributes.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An item to be upserted
 *
 *  \ingroup Models
 *
 */

class CatalogsUpsertRetailItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsUpsertRetailItem();
	CatalogsUpsertRetailItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsUpsertRetailItem();

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
	ItemAttributes getAttributes();

	/*! \brief Set 
	 */
	void setAttributes(ItemAttributes  attributes);

private:
	std::string item_id;
	std::string operation;
	ItemAttributes attributes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsUpsertRetailItem_H_ */
