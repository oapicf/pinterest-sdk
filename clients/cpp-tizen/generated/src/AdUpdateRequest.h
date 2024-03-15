/*
 * AdUpdateRequest.h
 *
 * 
 */

#ifndef _AdUpdateRequest_H_
#define _AdUpdateRequest_H_


#include <string>
#include "AdCommon_quiz_pin_data.h"
#include "AdCommon_tracking_urls.h"
#include "CreativeType.h"
#include "EntityStatus.h"
#include "GridClickType.h"
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

class AdUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdUpdateRequest();
	AdUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get ID of the ad group that contains the ad.
	 */
	std::string getAdGroupId();

	/*! \brief Set ID of the ad group that contains the ad.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get Deep link URL for Android devices. Not currently available. Using this field will generate an error.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set Deep link URL for Android devices. Not currently available. Using this field will generate an error.
	 */
	void setAndroidDeepLink(std::string  android_deep_link);
	/*! \brief Get Comma-separated deep links for the carousel pin on Android.
	 */
	std::list<std::string> getCarouselAndroidDeepLinks();

	/*! \brief Set Comma-separated deep links for the carousel pin on Android.
	 */
	void setCarouselAndroidDeepLinks(std::list <std::string> carousel_android_deep_links);
	/*! \brief Get Comma-separated destination URLs for the carousel pin to promote.
	 */
	std::list<std::string> getCarouselDestinationUrls();

	/*! \brief Set Comma-separated destination URLs for the carousel pin to promote.
	 */
	void setCarouselDestinationUrls(std::list <std::string> carousel_destination_urls);
	/*! \brief Get Comma-separated deep links for the carousel pin on iOS.
	 */
	std::list<std::string> getCarouselIosDeepLinks();

	/*! \brief Set Comma-separated deep links for the carousel pin on iOS.
	 */
	void setCarouselIosDeepLinks(std::list <std::string> carousel_ios_deep_links);
	/*! \brief Get Tracking url for the ad clicks.
	 */
	std::string getClickTrackingUrl();

	/*! \brief Set Tracking url for the ad clicks.
	 */
	void setClickTrackingUrl(std::string  click_tracking_url);
	/*! \brief Get 
	 */
	CreativeType getCreativeType();

	/*! \brief Set 
	 */
	void setCreativeType(CreativeType  creative_type);
	/*! \brief Get Destination URL.
	 */
	std::string getDestinationUrl();

	/*! \brief Set Destination URL.
	 */
	void setDestinationUrl(std::string  destination_url);
	/*! \brief Get Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
	 */
	std::string getIosDeepLink();

	/*! \brief Set Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get Is original pin deleted?
	 */
	bool getIsPinDeleted();

	/*! \brief Set Is original pin deleted?
	 */
	void setIsPinDeleted(bool  is_pin_deleted);
	/*! \brief Get Is pin repinnable?
	 */
	bool getIsRemovable();

	/*! \brief Set Is pin repinnable?
	 */
	void setIsRemovable(bool  is_removable);
	/*! \brief Get Name of the ad - 255 chars max.
	 */
	std::string getName();

	/*! \brief Set Name of the ad - 255 chars max.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get 
	 */
	AdCommon_tracking_urls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(AdCommon_tracking_urls  tracking_urls);
	/*! \brief Get Tracking URL for ad impressions.
	 */
	std::string getViewTrackingUrl();

	/*! \brief Set Tracking URL for ad impressions.
	 */
	void setViewTrackingUrl(std::string  view_tracking_url);
	/*! \brief Get Lead form ID for lead ad generation.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID for lead ad generation.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get 
	 */
	GridClickType getGridClickType();

	/*! \brief Set 
	 */
	void setGridClickType(GridClickType  grid_click_type);
	/*! \brief Get Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
	 */
	std::string getCustomizableCtaType();

	/*! \brief Set Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
	 */
	void setCustomizableCtaType(std::string  customizable_cta_type);
	/*! \brief Get 
	 */
	AdCommon_quiz_pin_data getQuizPinData();

	/*! \brief Set 
	 */
	void setQuizPinData(AdCommon_quiz_pin_data  quiz_pin_data);
	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string  id);
	/*! \brief Get Pin ID. This field may only be updated for draft ads.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID. This field may only be updated for draft ads.
	 */
	void setPinId(std::string  pin_id);

private:
	std::string ad_group_id;
	std::string android_deep_link;
	std::list <std::string>carousel_android_deep_links;
	std::list <std::string>carousel_destination_urls;
	std::list <std::string>carousel_ios_deep_links;
	std::string click_tracking_url;
	CreativeType creative_type;
	std::string destination_url;
	std::string ios_deep_link;
	bool is_pin_deleted;
	bool is_removable;
	std::string name;
	EntityStatus status;
	AdCommon_tracking_urls tracking_urls;
	std::string view_tracking_url;
	std::string lead_form_id;
	GridClickType grid_click_type;
	std::string customizable_cta_type;
	AdCommon_quiz_pin_data quiz_pin_data;
	std::string id;
	std::string pin_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdUpdateRequest_H_ */
