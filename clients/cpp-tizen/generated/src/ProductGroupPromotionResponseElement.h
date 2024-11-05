/*
 * ProductGroupPromotionResponseElement.h
 *
 * 
 */

#ifndef _ProductGroupPromotionResponseElement_H_
#define _ProductGroupPromotionResponseElement_H_


#include <string>
#include "CreativeType.h"
#include "EntityStatus.h"
#include "GridClickType.h"
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

class ProductGroupPromotionResponseElement : public Object {
public:
	/*! \brief Constructor.
	 */
	ProductGroupPromotionResponseElement();
	ProductGroupPromotionResponseElement(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProductGroupPromotionResponseElement();

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
	/*! \brief Get If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	bool getIsMdl();

	/*! \brief Set If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	void setIsMdl(bool  is_mdl);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Tracking template for proudct group promotions. 4000 limit
	 */
	std::string getTrackingUrl();

	/*! \brief Set Tracking template for proudct group promotions. 4000 limit
	 */
	void setTrackingUrl(std::string  tracking_url);
	/*! \brief Get ID of the catalogs product group that this product group promotion references
	 */
	std::string getCatalogProductGroupId();

	/*! \brief Set ID of the catalogs product group that this product group promotion references
	 */
	void setCatalogProductGroupId(std::string  catalog_product_group_id);
	/*! \brief Get Catalogs product group name
	 */
	std::string getCatalogProductGroupName();

	/*! \brief Set Catalogs product group name
	 */
	void setCatalogProductGroupName(std::string  catalog_product_group_name);
	/*! \brief Get Hero Pin ID if this PG is promoted as a Collection
	 */
	std::string getCollectionsHeroPinId();

	/*! \brief Set Hero Pin ID if this PG is promoted as a Collection
	 */
	void setCollectionsHeroPinId(std::string  collections_hero_pin_id);
	/*! \brief Get Collections Hero Destination Url
	 */
	std::string getCollectionsHeroDestinationUrl();

	/*! \brief Set Collections Hero Destination Url
	 */
	void setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url);
	/*! \brief Get 
	 */
	GridClickType getGridClickType();

	/*! \brief Set 
	 */
	void setGridClickType(GridClickType  grid_click_type);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);

private:
	std::string id;
	std::string ad_group_id;
	int bid_in_micro_currency;
	bool included;
	std::string definition;
	std::string relative_definition;
	std::string parent_id;
	std::string slideshow_collections_title;
	std::string slideshow_collections_description;
	bool is_mdl;
	EntityStatus status;
	std::string tracking_url;
	std::string catalog_product_group_id;
	std::string catalog_product_group_name;
	std::string collections_hero_pin_id;
	std::string collections_hero_destination_url;
	GridClickType grid_click_type;
	CreativeType creative_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotionResponseElement_H_ */
