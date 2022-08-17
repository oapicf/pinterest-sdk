/*
 * CatalogsItems.h
 *
 * Response object of catalogs items
 */

#ifndef _CatalogsItems_H_
#define _CatalogsItems_H_


#include <string>
#include "ItemResponse.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response object of catalogs items
 *
 *  \ingroup Models
 *
 */

class CatalogsItems : public Object {
public:
	/*! \brief Constructor.
	 */
	CatalogsItems();
	CatalogsItems(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CatalogsItems();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Array with catalogs items
	 */
	std::list<ItemResponse> getItems();

	/*! \brief Set Array with catalogs items
	 */
	void setItems(std::list <ItemResponse> items);

private:
	std::list <ItemResponse>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CatalogsItems_H_ */
