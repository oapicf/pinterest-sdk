/*
 * ProductGroupPromotionCreateRequest.h
 *
 * 
 */

#ifndef _ProductGroupPromotionCreateRequest_H_
#define _ProductGroupPromotionCreateRequest_H_


#include <string>
#include "Items.h"
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

class ProductGroupPromotionCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionCreateRequest();
	ProductGroupPromotionCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the Ad Group the Product Group Promotion belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the Ad Group the Product Group Promotion belongs to.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get 
	 */
	std::list<Items> getProductGroupPromotion();

	/*! \brief Set 
	 */
	void setProductGroupPromotion(std::list <Items> product_group_promotion);

private:
	std::string ad_group_id;
	std::list <Items>product_group_promotion;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionCreateRequest_H_ */
