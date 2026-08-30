
/*
 * ConversionEventsDataItems.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ConversionEventsDataItems_H_
#define TINY_CPP_CLIENT_ConversionEventsDataItems_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConversionEventAppInfo.h"
#include "ConversionEventDeviceInfo.h"
#include "ConversionEventsDataItemsCustomData.h"
#include "ConversionEventsUserDataProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ConversionEventsDataItems{
public:

    /*! \brief Constructor.
	 */
    ConversionEventsDataItems();
    ConversionEventsDataItems(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ConversionEventsDataItems();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
	 */
	std::string getActionSource();

	/*! \brief Set The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
	 */
	void setActionSource(std::string action_source);
	/*! \brief Get The app store app ID.
	 */
	std::string getAppId();

	/*! \brief Set The app store app ID.
	 */
	void setAppId(std::string app_id);
	/*! \brief Get 
	 */
	ConversionEventAppInfo getAppInfo();

	/*! \brief Set 
	 */
	void setAppInfo(ConversionEventAppInfo app_info);
	/*! \brief Get Name of the app.
	 */
	std::string getAppName();

	/*! \brief Set Name of the app.
	 */
	void setAppName(std::string app_name);
	/*! \brief Get Version of the app.
	 */
	std::string getAppVersion();

	/*! \brief Set Version of the app.
	 */
	void setAppVersion(std::string app_version);
	/*! \brief Get 
	 */
	ConversionEventsDataItemsCustomData getCustomData();

	/*! \brief Set 
	 */
	void setCustomData(ConversionEventsDataItemsCustomData custom_data);
	/*! \brief Get Brand of the user device.
	 */
	std::string getDeviceBrand();

	/*! \brief Set Brand of the user device.
	 */
	void setDeviceBrand(std::string device_brand);
	/*! \brief Get User device's mobile carrier.
	 */
	std::string getDeviceCarrier();

	/*! \brief Set User device's mobile carrier.
	 */
	void setDeviceCarrier(std::string device_carrier);
	/*! \brief Get 
	 */
	ConversionEventDeviceInfo getDeviceInfo();

	/*! \brief Set 
	 */
	void setDeviceInfo(ConversionEventDeviceInfo device_info);
	/*! \brief Get Model of the user device.
	 */
	std::string getDeviceModel();

	/*! \brief Set Model of the user device.
	 */
	void setDeviceModel(std::string device_model);
	/*! \brief Get Type of the user device.
	 */
	std::string getDeviceType();

	/*! \brief Set Type of the user device.
	 */
	void setDeviceType(std::string device_type);
	/*! \brief Get A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
	 */
	std::string getEventId();

	/*! \brief Set A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
	 */
	void setEventId(std::string event_id);
	/*! \brief Get The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
	 */
	std::string getEventName();

	/*! \brief Set The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
	 */
	void setEventName(std::string event_name);
	/*! \brief Get URL of the web conversion event.
	 */
	std::string getEventSourceUrl();

	/*! \brief Set URL of the web conversion event.
	 */
	void setEventSourceUrl(std::string event_source_url);
	/*! \brief Get The time when the event happened. Unix timestamp in seconds.
	 */
	long getEventTime();

	/*! \brief Set The time when the event happened. Unix timestamp in seconds.
	 */
	void setEventTime(long event_time);
	/*! \brief Get Two-character ISO-639-1 language code indicating the user's language.
	 */
	std::string getLanguage();

	/*! \brief Set Two-character ISO-639-1 language code indicating the user's language.
	 */
	void setLanguage(std::string language);
	/*! \brief Get When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	 */
	bool isOptOut();

	/*! \brief Set When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	 */
	void setOptOut(bool opt_out);
	/*! \brief Get Version of the device operating system.
	 */
	std::string getOsVersion();

	/*! \brief Set Version of the device operating system.
	 */
	void setOsVersion(std::string os_version);
	/*! \brief Get The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
	 */
	std::string getPartnerName();

	/*! \brief Set The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
	 */
	void setPartnerName(std::string partner_name);
	/*! \brief Get Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
	 */
	ConversionEventsUserDataProperties getUserData();

	/*! \brief Set Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
	 */
	void setUserData(ConversionEventsUserDataProperties user_data);
	/*! \brief Get Whether the event occurred when the user device was connected to wifi.
	 */
	bool isWifi();

	/*! \brief Set Whether the event occurred when the user device was connected to wifi.
	 */
	void setWifi(bool wifi);


    private:
    std::string action_source{};
    std::string app_id{};
    ConversionEventAppInfo app_info;
    std::string app_name{};
    std::string app_version{};
    ConversionEventsDataItemsCustomData custom_data;
    std::string device_brand{};
    std::string device_carrier{};
    ConversionEventDeviceInfo device_info;
    std::string device_model{};
    std::string device_type{};
    std::string event_id{};
    std::string event_name{};
    std::string event_source_url{};
    long event_time{};
    std::string language{};
    bool opt_out{};
    std::string os_version{};
    std::string partner_name{};
    ConversionEventsUserDataProperties user_data;
    bool wifi{};
};
}

#endif /* TINY_CPP_CLIENT_ConversionEventsDataItems_H_ */
