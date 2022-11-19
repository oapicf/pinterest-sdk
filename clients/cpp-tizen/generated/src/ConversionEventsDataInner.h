/*
 * ConversionEvents_data_inner.h
 *
 * 
 */

#ifndef _ConversionEvents_data_inner_H_
#define _ConversionEvents_data_inner_H_


#include <string>
#include "ConversionEventsUserData.h"
#include "ConversionEvents_data_inner_custom_data.h"
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

class ConversionEvents_data_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEvents_data_inner();
	ConversionEvents_data_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEvents_data_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the user event.
	 */
	std::string getEventName();

	/*! \brief Set The type of the user event.
	 */
	void setEventName(std::string  event_name);
	/*! \brief Get The source indicating where the conversion event occurred.
	 */
	std::string getActionSource();

	/*! \brief Set The source indicating where the conversion event occurred.
	 */
	void setActionSource(std::string  action_source);
	/*! \brief Get The time when the event happened. Unix timestamp in seconds.
	 */
	long long getEventTime();

	/*! \brief Set The time when the event happened. Unix timestamp in seconds.
	 */
	void setEventTime(long long  event_time);
	/*! \brief Get A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking.
	 */
	std::string getEventId();

	/*! \brief Set A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking.
	 */
	void setEventId(std::string  event_id);
	/*! \brief Get URL of the web conversion event.
	 */
	std::string getEventSourceUrl();

	/*! \brief Set URL of the web conversion event.
	 */
	void setEventSourceUrl(std::string  event_source_url);
	/*! \brief Get When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	 */
	bool getOptOut();

	/*! \brief Set When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
	 */
	void setOptOut(bool  opt_out);
	/*! \brief Get The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. Only send this field if Pinterest has worked directly with you to define a value for partner_name.
	 */
	std::string getPartnerName();

	/*! \brief Set The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. Only send this field if Pinterest has worked directly with you to define a value for partner_name.
	 */
	void setPartnerName(std::string  partner_name);
	/*! \brief Get 
	 */
	ConversionEventsUserData getUserData();

	/*! \brief Set 
	 */
	void setUserData(ConversionEventsUserData  user_data);
	/*! \brief Get 
	 */
	ConversionEvents_data_inner_custom_data getCustomData();

	/*! \brief Set 
	 */
	void setCustomData(ConversionEvents_data_inner_custom_data  custom_data);
	/*! \brief Get The app store app ID.
	 */
	std::string getAppId();

	/*! \brief Set The app store app ID.
	 */
	void setAppId(std::string  app_id);
	/*! \brief Get Name of the app.
	 */
	std::string getAppName();

	/*! \brief Set Name of the app.
	 */
	void setAppName(std::string  app_name);
	/*! \brief Get Version of the app.
	 */
	std::string getAppVersion();

	/*! \brief Set Version of the app.
	 */
	void setAppVersion(std::string  app_version);
	/*! \brief Get Brand of the user device.
	 */
	std::string getDeviceBrand();

	/*! \brief Set Brand of the user device.
	 */
	void setDeviceBrand(std::string  device_brand);
	/*! \brief Get User device's mobile carrier.
	 */
	std::string getDeviceCarrier();

	/*! \brief Set User device's mobile carrier.
	 */
	void setDeviceCarrier(std::string  device_carrier);
	/*! \brief Get Model of the user device.
	 */
	std::string getDeviceModel();

	/*! \brief Set Model of the user device.
	 */
	void setDeviceModel(std::string  device_model);
	/*! \brief Get Type of the user device.
	 */
	std::string getDeviceType();

	/*! \brief Set Type of the user device.
	 */
	void setDeviceType(std::string  device_type);
	/*! \brief Get Version of the device operating system.
	 */
	std::string getOsVersion();

	/*! \brief Set Version of the device operating system.
	 */
	void setOsVersion(std::string  os_version);
	/*! \brief Get Whether the event occurred when the user device was connected to wifi.
	 */
	bool getWifi();

	/*! \brief Set Whether the event occurred when the user device was connected to wifi.
	 */
	void setWifi(bool  wifi);
	/*! \brief Get Two-character ISO-639-1 language code indicating the user's language.
	 */
	std::string getLanguage();

	/*! \brief Set Two-character ISO-639-1 language code indicating the user's language.
	 */
	void setLanguage(std::string  language);

private:
	std::string event_name;
	std::string action_source;
	long long event_time;
	std::string event_id;
	std::string event_source_url;
	bool opt_out;
	std::string partner_name;
	ConversionEventsUserData user_data;
	ConversionEvents_data_inner_custom_data custom_data;
	std::string app_id;
	std::string app_name;
	std::string app_version;
	std::string device_brand;
	std::string device_carrier;
	std::string device_model;
	std::string device_type;
	std::string os_version;
	bool wifi;
	std::string language;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEvents_data_inner_H_ */
