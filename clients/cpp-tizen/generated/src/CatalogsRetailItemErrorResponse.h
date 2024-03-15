/*
 * CatalogsRetailItemErrorResponse.h
 *
 * Object describing a retail item error
 */

#ifndef _CatalogsRetailItemErrorResponse_H_
#define _CatalogsRetailItemErrorResponse_H_


#include <string>
#include "CatalogsType.h"
#include "ItemValidationEvent.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a retail item error
 *
 *  \ingroup Models
 *
 */

class CatalogsRetailItemErrorResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsRetailItemErrorResponse();
	CatalogsRetailItemErrorResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsRetailItemErrorResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CatalogsType getCatalogType();

	/*! \brief Set 
	 */
	void setCatalogType(CatalogsType  catalog_type);
	/*! \brief Get The catalog item id in the merchant namespace
	 */
	std::string getItemId();

	/*! \brief Set The catalog item id in the merchant namespace
	 */
	void setItemId(std::string  item_id);
	/*! \brief Get Array with the errors for the item id requested
	 */
	std::list<ItemValidationEvent> getErrors();

	/*! \brief Set Array with the errors for the item id requested
	 */
	void setErrors(std::list <ItemValidationEvent> errors);

private:
	CatalogsType catalog_type;
	std::string item_id;
	std::list <ItemValidationEvent>errors;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsRetailItemErrorResponse_H_ */
