/*
 * AdCreateRequest.h
 *
 * 
 */

#ifndef _AdCreateRequest_H_
#define _AdCreateRequest_H_


#include <string>
#include "CreativeType.h"
#include "CustomizableCTAType.h"
#include "DisclosureType.h"
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

class AdCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdCreateRequest();
	AdCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdCreateRequest();

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
	/*! \brief Get Deep link URL for Android devices.
	 */
	std::string getAndroidDeepLink();

	/*! \brief Set Deep link URL for Android devices.
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
	/*! \brief Get 
	 */
	CustomizableCTAType getCustomizableCtaType();

	/*! \brief Set 
	 */
	void setCustomizableCtaType(CustomizableCTAType  customizable_cta_type);
	/*! \brief Get Destination URL.
	 */
	std::string getDestinationUrl();

	/*! \brief Set Destination URL.
	 */
	void setDestinationUrl(std::string  destination_url);
	/*! \brief Get 
	 */
	DisclosureType getDisclosureType();

	/*! \brief Set 
	 */
	void setDisclosureType(DisclosureType  disclosure_type);
	/*! \brief Get URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
	 */
	std::string getDisclosureUrl();

	/*! \brief Set URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
	 */
	void setDisclosureUrl(std::string  disclosure_url);
	/*! \brief Get 
	 */
	GridClickType getGridClickType();

	/*! \brief Set 
	 */
	void setGridClickType(GridClickType  grid_click_type);
	/*! \brief Get Deep link URL for iOS devices.
	 */
	std::string getIosDeepLink();

	/*! \brief Set Deep link URL for iOS devices.
	 */
	void setIosDeepLink(std::string  ios_deep_link);
	/*! \brief Get Is the ad a carting/WTB ad?
	 */
	bool getIsCarting();

	/*! \brief Set Is the ad a carting/WTB ad?
	 */
	void setIsCarting(bool  is_carting);
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
	/*! \brief Get Lead form ID for lead ad generation.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID for lead ad generation.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get Name of the ad - 255 chars max.
	 */
	std::string getName();

	/*! \brief Set Name of the ad - 255 chars max.
	 */
	void setName(std::string  name);
	/*! \brief Get Pin ID.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID.
	 */
	void setPinId(std::string  pin_id);
	/*! \brief Get Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	 */
	std::string getQuizPinData();

	/*! \brief Set Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	 */
	void setQuizPinData(std::string  quiz_pin_data);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get 
	 */
	std::string getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(std::string  tracking_urls);
	/*! \brief Get Tracking URL for ad impressions.
	 */
	std::string getViewTrackingUrl();

	/*! \brief Set Tracking URL for ad impressions.
	 */
	void setViewTrackingUrl(std::string  view_tracking_url);

private:
	std::string ad_group_id;
	std::string android_deep_link;
	std::list <std::string>carousel_android_deep_links;
	std::list <std::string>carousel_destination_urls;
	std::list <std::string>carousel_ios_deep_links;
	std::string click_tracking_url;
	CreativeType creative_type;
	CustomizableCTAType customizable_cta_type;
	std::string destination_url;
	DisclosureType disclosure_type;
	std::string disclosure_url;
	GridClickType grid_click_type;
	std::string ios_deep_link;
	bool is_carting;
	bool is_pin_deleted;
	bool is_removable;
	std::string lead_form_id;
	std::string name;
	std::string pin_id;
	std::string quiz_pin_data;
	EntityStatus status;
	std::string tracking_urls;
	std::string view_tracking_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdCreateRequest_H_ */
