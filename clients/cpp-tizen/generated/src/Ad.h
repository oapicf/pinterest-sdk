/*
 * Ad.h
 *
 * 
 */

#ifndef _Ad_H_
#define _Ad_H_


#include <string>
#include "AdCollectionsHeaderType.h"
#include "AdDisapprovalReasons.h"
#include "AdReviewStatus.h"
#include "CartingProduct.h"
#include "CreativeType.h"
#include "CustomizableCTAType.h"
#include "DisclosureType.h"
#include "EntityStatus.h"
#include "GridClickType.h"
#include "PinPromotionSummaryStatus.h"
#include "QuizPinData.h"
#include "TrackingUrls.h"
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

class Ad : public Object {
public:
	/*! \brief Constructor.
	 */
	Ad();
	Ad(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ad();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the advertiser that this ad belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The ID of the advertiser that this ad belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
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
	/*! \brief Get ID of the ad campaign that contains this ad.
	 */
	std::string getCampaignId();

	/*! \brief Set ID of the ad campaign that contains this ad.
	 */
	void setCampaignId(std::string  campaign_id);
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
	/*! \brief Get The vendor platform type of the carting/WTB ad.
	 */
	int getCartingPlatformType();

	/*! \brief Set The vendor platform type of the carting/WTB ad.
	 */
	void setCartingPlatformType(int  carting_platform_type);
	/*! \brief Get Array of carting/WTB products for the ad.
	 */
	std::list<CartingProduct> getCartingProducts();

	/*! \brief Set Array of carting/WTB products for the ad.
	 */
	void setCartingProducts(std::list <CartingProduct> carting_products);
	/*! \brief Get Tracking url for the ad clicks.
	 */
	std::string getClickTrackingUrl();

	/*! \brief Set Tracking url for the ad clicks.
	 */
	void setClickTrackingUrl(std::string  click_tracking_url);
	/*! \brief Get Destination URL template for all items within a collections drawer.
	 */
	std::string getCollectionItemsDestinationUrlTemplate();

	/*! \brief Set Destination URL template for all items within a collections drawer.
	 */
	void setCollectionItemsDestinationUrlTemplate(std::string  collection_items_destination_url_template);
	/*! \brief Get 
	 */
	AdCollectionsHeaderType getCollectionsHeaderType();

	/*! \brief Set 
	 */
	void setCollectionsHeaderType(AdCollectionsHeaderType  collections_header_type);
	/*! \brief Get Pin creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Pin creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int  created_time);
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
	/*! \brief Get The ID of this ad.
	 */
	std::string getId();

	/*! \brief Set The ID of this ad.
	 */
	void setId(std::string  id);
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
	/*! \brief Get Whether the advertiser has accepted the terms and conditions for collage ad.
	 */
	bool getIsCollageAcceptedTerms();

	/*! \brief Set Whether the advertiser has accepted the terms and conditions for collage ad.
	 */
	void setIsCollageAcceptedTerms(bool  is_collage_accepted_terms);
	/*! \brief Get Whether the collage ad has a single destination url override.
	 */
	bool getIsCollageSingleDestination();

	/*! \brief Set Whether the collage ad has a single destination url override.
	 */
	void setIsCollageSingleDestination(bool  is_collage_single_destination);
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
	/*! \brief Get Pin ID. This field may only be updated for draft ads.
	 */
	std::string getPinId();

	/*! \brief Set Pin ID. This field may only be updated for draft ads.
	 */
	void setPinId(std::string  pin_id);
	/*! \brief Get Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	 */
	QuizPinData getQuizPinData();

	/*! \brief Set Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
	 */
	void setQuizPinData(QuizPinData  quiz_pin_data);
	/*! \brief Get Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	 */
	std::list<AdDisapprovalReasons> getRejectedReasons();

	/*! \brief Set Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	 */
	void setRejectedReasons(std::list <AdDisapprovalReasons> rejected_reasons);
	/*! \brief Get Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	 */
	std::list<std::string> getRejectionLabels();

	/*! \brief Set Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
	 */
	void setRejectionLabels(std::list <std::string> rejection_labels);
	/*! \brief Get Ad review status
	 */
	AdReviewStatus getReviewStatus();

	/*! \brief Set Ad review status
	 */
	void setReviewStatus(AdReviewStatus  review_status);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus  status);
	/*! \brief Get Ad summary status
	 */
	PinPromotionSummaryStatus getSummaryStatus();

	/*! \brief Set Ad summary status
	 */
	void setSummaryStatus(PinPromotionSummaryStatus  summary_status);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls  tracking_urls);
	/*! \brief Get Always \"ad\".
	 */
	std::string getType();

	/*! \brief Set Always \"ad\".
	 */
	void setType(std::string  type);
	/*! \brief Get Last update time. Unix timestamp in seconds.
	 */
	int getUpdatedTime();

	/*! \brief Set Last update time. Unix timestamp in seconds.
	 */
	void setUpdatedTime(int  updated_time);
	/*! \brief Get Tracking URL for ad impressions.
	 */
	std::string getViewTrackingUrl();

	/*! \brief Set Tracking URL for ad impressions.
	 */
	void setViewTrackingUrl(std::string  view_tracking_url);

private:
	std::string ad_account_id;
	std::string ad_group_id;
	std::string android_deep_link;
	std::string campaign_id;
	std::list <std::string>carousel_android_deep_links;
	std::list <std::string>carousel_destination_urls;
	std::list <std::string>carousel_ios_deep_links;
	int carting_platform_type;
	std::list <CartingProduct>carting_products;
	std::string click_tracking_url;
	std::string collection_items_destination_url_template;
	AdCollectionsHeaderType collections_header_type;
	int created_time;
	CreativeType creative_type;
	CustomizableCTAType customizable_cta_type;
	std::string destination_url;
	DisclosureType disclosure_type;
	std::string disclosure_url;
	GridClickType grid_click_type;
	std::string id;
	std::string ios_deep_link;
	bool is_carting;
	bool is_collage_accepted_terms;
	bool is_collage_single_destination;
	bool is_pin_deleted;
	bool is_removable;
	std::string lead_form_id;
	std::string name;
	std::string pin_id;
	QuizPinData quiz_pin_data;
	std::list <AdDisapprovalReasons>rejected_reasons;
	std::list <std::string>rejection_labels;
	AdReviewStatus review_status;
	EntityStatus status;
	PinPromotionSummaryStatus summary_status;
	TrackingUrls tracking_urls;
	std::string type;
	int updated_time;
	std::string view_tracking_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Ad_H_ */
