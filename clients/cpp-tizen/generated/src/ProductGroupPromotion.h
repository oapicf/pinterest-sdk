/*
 * ProductGroupPromotion.h
 *
 * 
 */

#ifndef _ProductGroupPromotion_H_
#define _ProductGroupPromotion_H_


#include <string>
#include "CollectionsHeaderType.h"
#include "CreativeType.h"
#include "EntityStatus.h"
#include "GridClickType.h"
#include "PreferredMediaType.h"
#include "ProductGroupPromotionCustomizableCTAType.h"
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
	/*! \brief Get ID of the catalogs product group that this product group promotion references (required for create operations)
	 */
	std::string getCatalogProductGroupId();

	/*! \brief Set ID of the catalogs product group that this product group promotion references (required for create operations)
	 */
	void setCatalogProductGroupId(std::string  catalog_product_group_id);
	/*! \brief Get Catalogs product group name
	 */
	std::string getCatalogProductGroupName();

	/*! \brief Set Catalogs product group name
	 */
	void setCatalogProductGroupName(std::string  catalog_product_group_name);
	/*! \brief Get 
	 */
	CollectionsHeaderType getCollectionsHeaderType();

	/*! \brief Set 
	 */
	void setCollectionsHeaderType(CollectionsHeaderType  collections_header_type);
	/*! \brief Get Collections Hero Destination Url
	 */
	std::string getCollectionsHeroDestinationUrl();

	/*! \brief Set Collections Hero Destination Url
	 */
	void setCollectionsHeroDestinationUrl(std::string  collections_hero_destination_url);
	/*! \brief Get Hero Pin ID if this PG is promoted as a Collection
	 */
	std::string getCollectionsHeroPinId();

	/*! \brief Set Hero Pin ID if this PG is promoted as a Collection
	 */
	void setCollectionsHeroPinId(std::string  collections_hero_pin_id);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);
	/*! \brief Get 
	 */
	ProductGroupPromotionCustomizableCTAType getCustomizableCtaType();

	/*! \brief Set 
	 */
	void setCustomizableCtaType(ProductGroupPromotionCustomizableCTAType  customizable_cta_type);
	/*! \brief Get The full product group definition path
	 */
	std::string getDefinition();

	/*! \brief Set The full product group definition path
	 */
	void setDefinition(std::string  definition);
	/*! \brief Get 
	 */
	GridClickType getGridClickType();

	/*! \brief Set 
	 */
	void setGridClickType(GridClickType  grid_click_type);
	/*! \brief Get ID of the product group promotion (required for update operations).
	 */
	std::string getId();

	/*! \brief Set ID of the product group promotion (required for update operations).
	 */
	void setId(std::string  id);
	/*! \brief Get True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	bool getIncluded();

	/*! \brief Set True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	void setIncluded(bool  included);
	/*! \brief Get Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
	 */
	bool getIsGenerateBackground();

	/*! \brief Set Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
	 */
	void setIsGenerateBackground(bool  is_generate_background);
	/*! \brief Get Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
	 */
	bool getIsImageAutoResizing();

	/*! \brief Set Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
	 */
	void setIsImageAutoResizing(bool  is_image_auto_resizing);
	/*! \brief Get If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	bool getIsMdl();

	/*! \brief Set If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	void setIsMdl(bool  is_mdl);
	/*! \brief Get The parent Product Group ID of this Product Group
	 */
	std::string getParentId();

	/*! \brief Set The parent Product Group ID of this Product Group
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get 
	 */
	PreferredMediaType getPreferredMediaType();

	/*! \brief Set 
	 */
	void setPreferredMediaType(PreferredMediaType  preferred_media_type);
	/*! \brief Get The definition of the product group, relative to its parent - an attribute name/value pair
	 */
	std::string getRelativeDefinition();

	/*! \brief Set The definition of the product group, relative to its parent - an attribute name/value pair
	 */
	void setRelativeDefinition(std::string  relative_definition);
	/*! \brief Get The ad image tag selected for the product group promotion.
	 */
	std::string getSelectedImageTag();

	/*! \brief Set The ad image tag selected for the product group promotion.
	 */
	void setSelectedImageTag(std::string  selected_image_tag);
	/*! \brief Get The ad video tag selected for the product group promotion.
	 */
	std::string getSelectedVideoTag();

	/*! \brief Set The ad video tag selected for the product group promotion.
	 */
	void setSelectedVideoTag(std::string  selected_video_tag);
	/*! \brief Get Slideshow Collections Description
	 */
	std::string getSlideshowCollectionsDescription();

	/*! \brief Set Slideshow Collections Description
	 */
	void setSlideshowCollectionsDescription(std::string  slideshow_collections_description);
	/*! \brief Get Slideshow Collections Title
	 */
	std::string getSlideshowCollectionsTitle();

	/*! \brief Set Slideshow Collections Title
	 */
	void setSlideshowCollectionsTitle(std::string  slideshow_collections_title);
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

private:
	std::string ad_group_id;
	int bid_in_micro_currency;
	std::string catalog_product_group_id;
	std::string catalog_product_group_name;
	CollectionsHeaderType collections_header_type;
	std::string collections_hero_destination_url;
	std::string collections_hero_pin_id;
	CreativeType creative_type;
	ProductGroupPromotionCustomizableCTAType customizable_cta_type;
	std::string definition;
	GridClickType grid_click_type;
	std::string id;
	bool included;
	bool is_generate_background;
	bool is_image_auto_resizing;
	bool is_mdl;
	std::string parent_id;
	PreferredMediaType preferred_media_type;
	std::string relative_definition;
	std::string selected_image_tag;
	std::string selected_video_tag;
	std::string slideshow_collections_description;
	std::string slideshow_collections_title;
	EntityStatus status;
	std::string tracking_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProductGroupPromotion_H_ */
