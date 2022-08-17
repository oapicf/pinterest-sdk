/*
 * ProductGroupPromotion.h
 *
 * 
 */

#ifndef _ProductGroupPromotion_H_
#define _ProductGroupPromotion_H_


#include <string>
#include "Items.h"
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

class ProductGroupPromotion : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotion();
	ProductGroupPromotion(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotion();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the product group promotion.
	 */
	std::string getId();

	/*! \brief Set ID of the product group promotion.
	 */
	void setId(std::string  id);
	/*! \brief Get ID of the ad group the product group belongs to.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the ad group the product group belongs to.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get Product group promotion
	 */
	std::string getType();

	/*! \brief Set Product group promotion
	 */
	void setType(std::string  type);
	/*! \brief Get The bid in micro currency.
	 */
	int getBidInMicroCurrency();

	/*! \brief Set The bid in micro currency.
	 */
	void setBidInMicroCurrency(int  bid_in_micro_currency);
	/*! \brief Get True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	bool getIncluded();

	/*! \brief Set True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	void setIncluded(bool  included);
	/*! \brief Get The full product group definition path
	 */
	std::string getDefinition();

	/*! \brief Set The full product group definition path
	 */
	void setDefinition(std::string  definition);
	/*! \brief Get The definition of the product group, relative to its parent - an attribute name/value pair
	 */
	std::string getRelativeDefinition();

	/*! \brief Set The definition of the product group, relative to its parent - an attribute name/value pair
	 */
	void setRelativeDefinition(std::string  relative_definition);
	/*! \brief Get The parent Product Group ID of this Product Group
	 */
	std::string getParentId();

	/*! \brief Set The parent Product Group ID of this Product Group
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get Slideshow Collections Title
	 */
	std::string getSlideshowCollectionsTitle();

	/*! \brief Set Slideshow Collections Title
	 */
	void setSlideshowCollectionsTitle(std::string  slideshow_collections_title);
	/*! \brief Get Slideshow Collections Description
	 */
	std::string getSlideshowCollectionsDescription();

	/*! \brief Set Slideshow Collections Description
	 */
	void setSlideshowCollectionsDescription(std::string  slideshow_collections_description);

private:
	std::string id;
	std::string ad_group_id;
	std::string type;
	int bid_in_micro_currency;
	bool included;
	std::string definition;
	std::string relative_definition;
	std::string parent_id;
	std::string slideshow_collections_title;
	std::string slideshow_collections_description;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotion_H_ */
