
/*
 * AdPreviewRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdPreviewRequest_H_
#define TINY_CPP_CLIENT_AdPreviewRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdPreviewShopping.h"
#include "AdPreviewSourceImage.h"
#include "AdPreviewSourcePinId.h"
#include "AdShoppingPreviewCreativeType.h"
#include "BasePreferredMediaType.h"
#include "CustomizableCTAType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdPreviewRequest{
public:

    /*! \brief Constructor.
	 */
    AdPreviewRequest();
    AdPreviewRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdPreviewRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Image URL.
	 */
	std::string getImageUrl();

	/*! \brief Set Image URL.
	 */
	void setImageUrl(std::string image_url);
	/*! \brief Get Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	std::string getPromotionId();

	/*! \brief Set Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
	 */
	void setPromotionId(std::string promotion_id);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setTitle(std::string title);
	/*! \brief Get Ad format of the shopping ad preview.
	 */
	AdShoppingPreviewCreativeType getCreativeType();

	/*! \brief Set Ad format of the shopping ad preview.
	 */
	void setCreativeType(AdShoppingPreviewCreativeType creative_type);
	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string pin_id);
	/*! \brief Get Catalog Product Group Id.
	 */
	std::string getCatalogProductGroupId();

	/*! \brief Set Catalog Product Group Id.
	 */
	void setCatalogProductGroupId(std::string catalog_product_group_id);
	/*! \brief Get Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
	 */
	CustomizableCTAType getCustomizableCtaType();

	/*! \brief Set Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
	 */
	void setCustomizableCtaType(CustomizableCTAType customizable_cta_type);
	/*! \brief Get Title displayed below ad.
	 */
	std::string getHeroImageTitle();

	/*! \brief Set Title displayed below ad.
	 */
	void setHeroImageTitle(std::string hero_image_title);
	/*! \brief Get Hero image URL.
	 */
	std::string getHeroImageUrl();

	/*! \brief Set Hero image URL.
	 */
	void setHeroImageUrl(std::string hero_image_url);
	/*! \brief Get Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
	 */
	std::string getHeroPinId();

	/*! \brief Set Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
	 */
	void setHeroPinId(std::string hero_pin_id);
	/*! \brief Get Multi image template tag.
	 */
	std::string getImageTag();

	/*! \brief Set Multi image template tag.
	 */
	void setImageTag(std::string image_tag);
	/*! \brief Get Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
	 */
	std::string getItemId();

	/*! \brief Set Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
	 */
	void setItemId(std::string item_id);
	/*! \brief Get Preferred media type.
	 */
	BasePreferredMediaType getPreferredMediaType();

	/*! \brief Set Preferred media type.
	 */
	void setPreferredMediaType(BasePreferredMediaType preferred_media_type);
	/*! \brief Get Include promotion data in preview when available on catalog item. Defaults to false.
	 */
	bool isShowPromotion();

	/*! \brief Set Include promotion data in preview when available on catalog item. Defaults to false.
	 */
	void setShowPromotion(bool show_promotion);
	/*! \brief Get Multi video template tag, image_tag and video_tag are mutual exclusive.
	 */
	std::string getVideoTag();

	/*! \brief Set Multi video template tag, image_tag and video_tag are mutual exclusive.
	 */
	void setVideoTag(std::string video_tag);


    private:
    std::string image_url{};
    std::string promotion_id{};
    std::string title{};
    AdShoppingPreviewCreativeType creative_type;
    std::string pin_id{};
    std::string catalog_product_group_id{};
    CustomizableCTAType customizable_cta_type;
    std::string hero_image_title{};
    std::string hero_image_url{};
    std::string hero_pin_id{};
    std::string image_tag{};
    std::string item_id{};
    BasePreferredMediaType preferred_media_type;
    bool show_promotion{};
    std::string video_tag{};
};
}

#endif /* TINY_CPP_CLIENT_AdPreviewRequest_H_ */
