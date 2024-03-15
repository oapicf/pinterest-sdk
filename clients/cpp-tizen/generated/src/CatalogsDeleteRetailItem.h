/*
 * CatalogsDeleteRetailItem.h
 *
 * An item to be deleted
 */

#ifndef _CatalogsDeleteRetailItem_H_
#define _CatalogsDeleteRetailItem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An item to be deleted
 *
 *  \ingroup Models
 *
 */

class CatalogsDeleteRetailItem : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsDeleteRetailItem();
	CatalogsDeleteRetailItem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsDeleteRetailItem();

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

private:
	std::string item_id;
	std::string operation;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsDeleteRetailItem_H_ */
