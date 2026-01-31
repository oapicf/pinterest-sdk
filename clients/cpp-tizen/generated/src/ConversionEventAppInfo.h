/*
 * ConversionEventAppInfo.h
 *
 * Object containing information about the application where event occurred.
 */

#ifndef _ConversionEventAppInfo_H_
#define _ConversionEventAppInfo_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object containing information about the application where event occurred.
 *
 *  \ingroup Models
 *
 */

class ConversionEventAppInfo : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionEventAppInfo();
	ConversionEventAppInfo(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionEventAppInfo();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get App ID in Google Play Store, AppStore or other stores.
	 */
	std::string getAppId();

	/*! \brief Set App ID in Google Play Store, AppStore or other stores.
	 */
	void setAppId(std::string  app_id);
	/*! \brief Get Name of the app. Primarily used for Mobile Apps.
	 */
	std::string getAppName();

	/*! \brief Set Name of the app. Primarily used for Mobile Apps.
	 */
	void setAppName(std::string  app_name);
	/*! \brief Get App package name
	 */
	std::string getAppPackageName();

	/*! \brief Set App package name
	 */
	void setAppPackageName(std::string  app_package_name);
	/*! \brief Get The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
	 */
	std::string getAppStore();

	/*! \brief Set The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
	 */
	void setAppStore(std::string  app_store);
	/*! \brief Get App version. Primarily used for mobile apps
	 */
	std::string getAppVersion();

	/*! \brief Set App version. Primarily used for mobile apps
	 */
	void setAppVersion(std::string  app_version);
	/*! \brief Get App install time. Unix timestamp in seconds
	 */
	int getInstallTime();

	/*! \brief Set App install time. Unix timestamp in seconds
	 */
	void setInstallTime(int  install_time);
	/*! \brief Get User Agent request header. Primarily used for Web events
	 */
	std::string getUserAgent();

	/*! \brief Set User Agent request header. Primarily used for Web events
	 */
	void setUserAgent(std::string  user_agent);
	/*! \brief Get Inner height of the window or viewport.
	 */
	int getWindowHeight();

	/*! \brief Set Inner height of the window or viewport.
	 */
	void setWindowHeight(int  window_height);
	/*! \brief Get Inner width of the window or viewport.
	 */
	int getWindowWidth();

	/*! \brief Set Inner width of the window or viewport.
	 */
	void setWindowWidth(int  window_width);

private:
	std::string app_id;
	std::string app_name;
	std::string app_package_name;
	std::string app_store;
	std::string app_version;
	int install_time;
	std::string user_agent;
	int window_height;
	int window_width;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ConversionEventAppInfo_H_ */
