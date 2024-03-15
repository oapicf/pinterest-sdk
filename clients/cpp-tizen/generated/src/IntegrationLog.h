/*
 * IntegrationLog.h
 *
 * Schema for log sent from an integration application.
 */

#ifndef _IntegrationLog_H_
#define _IntegrationLog_H_


#include <string>
#include "IntegrationLogClientError.h"
#include "IntegrationLogClientRequest.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schema for log sent from an integration application.
 *
 *  \ingroup Models
 *
 */

class IntegrationLog : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationLog();
	IntegrationLog(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationLog();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Timestamp in milliseconds of when the log was executed at the client.
	 */
	int getClientTimestamp();

	/*! \brief Set Timestamp in milliseconds of when the log was executed at the client.
	 */
	void setClientTimestamp(int  client_timestamp);
	/*! \brief Get Log event type
	 */
	std::string getEventType();

	/*! \brief Set Log event type
	 */
	void setEventType(std::string  event_type);
	/*! \brief Get Log level type
	 */
	std::string getLogLevel();

	/*! \brief Set Log level type
	 */
	void setLogLevel(std::string  log_level);
	/*! \brief Get 
	 */
	std::string getExternalBusinessId();

	/*! \brief Set 
	 */
	void setExternalBusinessId(std::string  external_business_id);
	/*! \brief Get 
	 */
	std::string getAdvertiserId();

	/*! \brief Set 
	 */
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get 
	 */
	std::string getMerchantId();

	/*! \brief Set 
	 */
	void setMerchantId(std::string  merchant_id);
	/*! \brief Get 
	 */
	std::string getTagId();

	/*! \brief Set 
	 */
	void setTagId(std::string  tag_id);
	/*! \brief Get 
	 */
	std::string getFeedProfileId();

	/*! \brief Set 
	 */
	void setFeedProfileId(std::string  feed_profile_id);
	/*! \brief Get Explanation of the event that occured.
	 */
	std::string getMessage();

	/*! \brief Set Explanation of the event that occured.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Version number of the integration application.
	 */
	std::string getAppVersionNumber();

	/*! \brief Set Version number of the integration application.
	 */
	void setAppVersionNumber(std::string  app_version_number);
	/*! \brief Get Version number of the platform the integration application is running on.
	 */
	std::string getPlatformVersionNumber();

	/*! \brief Set Version number of the platform the integration application is running on.
	 */
	void setPlatformVersionNumber(std::string  platform_version_number);
	/*! \brief Get 
	 */
	IntegrationLogClientError getError();

	/*! \brief Set 
	 */
	void setError(IntegrationLogClientError  error);
	/*! \brief Get 
	 */
	IntegrationLogClientRequest getRequest();

	/*! \brief Set 
	 */
	void setRequest(IntegrationLogClientRequest  request);

private:
	int client_timestamp;
	std::string event_type;
	std::string log_level;
	std::string external_business_id;
	std::string advertiser_id;
	std::string merchant_id;
	std::string tag_id;
	std::string feed_profile_id;
	std::string message;
	std::string app_version_number;
	std::string platform_version_number;
	IntegrationLogClientError error;
	IntegrationLogClientRequest request;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationLog_H_ */
