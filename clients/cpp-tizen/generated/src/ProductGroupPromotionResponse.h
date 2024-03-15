/*
 * ProductGroupPromotionResponse.h
 *
 * 
 */

#ifndef _ProductGroupPromotionResponse_H_
#define _ProductGroupPromotionResponse_H_


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

class ProductGroupPromotionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionResponse();
	ProductGroupPromotionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionResponse();

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

private:
	std::list <ProductGroupPromotionResponseItem>items;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionResponse_H_ */
