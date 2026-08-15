
/*
 * ProductGroupPromotion.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProductGroupPromotion_H_
#define TINY_CPP_CLIENT_ProductGroupPromotion_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CreativeType.h"
#include "EntityStatus.h"
#include "GridClickType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProductGroupPromotion{
public:

    /*! \brief Constructor.
	 */
    ProductGroupPromotion();
    ProductGroupPromotion(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProductGroupPromotion();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	/*! \brief Get Collections ad header type
	 */
	std::string getCollectionsHeaderType();

	/*! \brief Set Collections ad header type
	 */
	void setCollectionsHeaderType(std::string  collections_header_type);
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
	/*! \brief Get Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
	 */
	std::string getCustomizableCtaType();

	/*! \brief Set Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
	 */
	void setCustomizableCtaType(std::string  customizable_cta_type);
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
	/*! \brief Get ID of the product group promotion.
	 */
	std::string getId();

	/*! \brief Set ID of the product group promotion.
	 */
	void setId(std::string  id);
	/*! \brief Get True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	bool isIncluded();

	/*! \brief Set True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	 */
	void setIncluded(bool  included);
	/*! \brief Get Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
	 */
	bool isIsGenerateBackground();

	/*! \brief Set Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
	 */
	void setIsGenerateBackground(bool  is_generate_background);
	/*! \brief Get If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	bool isIsMdl();

	/*! \brief Set If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	 */
	void setIsMdl(bool  is_mdl);
	/*! \brief Get The parent Product Group ID of this Product Group
	 */
	std::string getParentId();

	/*! \brief Set The parent Product Group ID of this Product Group
	 */
	void setParentId(std::string  parent_id);
	/*! \brief Get Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
	 */
	std::string getPreferredMediaType();

	/*! \brief Set Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
	 */
	void setPreferredMediaType(std::string  preferred_media_type);
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
    std::string ad_group_id{};
    int bid_in_micro_currency{};
    std::string catalog_product_group_id{};
    std::string catalog_product_group_name{};
    std::string collections_header_type{};
    std::string collections_hero_destination_url{};
    std::string collections_hero_pin_id{};
    CreativeType creative_type;
    std::string customizable_cta_type{};
    std::string definition{};
    GridClickType grid_click_type;
    std::string id{};
    bool included{};
    bool is_generate_background{};
    bool is_mdl{};
    std::string parent_id{};
    std::string preferred_media_type{};
    std::string relative_definition{};
    std::string selected_image_tag{};
    std::string selected_video_tag{};
    std::string slideshow_collections_description{};
    std::string slideshow_collections_title{};
    EntityStatus status;
    std::string tracking_url{};
};
}

#endif /* TINY_CPP_CLIENT_ProductGroupPromotion_H_ */
