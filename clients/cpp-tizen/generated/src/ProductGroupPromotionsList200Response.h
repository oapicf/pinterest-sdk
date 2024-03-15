/*
 * Product_group_promotions_list_200_response.h
 *
 * 
 */

#ifndef _Product_group_promotions_list_200_response_H_
#define _Product_group_promotions_list_200_response_H_


#include <string>
#include "ProductGroupPromotionResponseItem.h"
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

class Product_group_promotions_list_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	Product_group_promotions_list_200_response();
	Product_group_promotions_list_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Product_group_promotions_list_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<ProductGroupPromotionResponseItem> getItems();

	/*! \brief Set 
	 */
	void setItems(std::list <ProductGroupPromotionResponseItem> items);
	/*! \brief Get 
	 */
	std::string getBookmark();

	/*! \brief Set 
	 */
	void setBookmark(std::string  bookmark);

private:
	std::list <ProductGroupPromotionResponseItem>items;
	std::string bookmark;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Product_group_promotions_list_200_response_H_ */
