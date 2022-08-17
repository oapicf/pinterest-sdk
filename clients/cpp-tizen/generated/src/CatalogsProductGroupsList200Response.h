/*
 * Catalogs_product_groups_list_200_response.h
 *
 * 
 */

#ifndef _Catalogs_product_groups_list_200_response_H_
#define _Catalogs_product_groups_list_200_response_H_


#include <string>
#include "CatalogsProductGroup.h"
#include "Catalogs_product_groups_list_200_response_allOf.h"
#include "Paginated.h"
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

class Catalogs_product_groups_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Catalogs_product_groups_list_200_response();
	Catalogs_product_groups_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Catalogs_product_groups_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<CatalogsProductGroup> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <CatalogsProductGroup> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <CatalogsProductGroup>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Catalogs_product_groups_list_200_response_H_ */
