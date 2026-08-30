
/*
 * IntegrationLog.h
 *
 * Schema for log sent from an integration application.
 */

#ifndef TINY_CPP_CLIENT_IntegrationLog_H_
#define TINY_CPP_CLIENT_IntegrationLog_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "IntegrationLogClientError.h"
#include "IntegrationLogClientRequest.h"
#include "IntegrationLogEventType.h"
#include "IntegrationLogLevel.h"

namespace Tiny {


/*! \brief Schema for log sent from an integration application.
 *
 *  \ingroup Models
 *
 */

class IntegrationLog{
public:

    /*! \brief Constructor.
	 */
    IntegrationLog();
    IntegrationLog(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationLog();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAdvertiserId();

	/*! \brief Set 
	 */
	void setAdvertiserId(std::string advertiser_id);
	/*! \brief Get Version number of the integration application.
	 */
	std::string getAppVersionNumber();

	/*! \brief Set Version number of the integration application.
	 */
	void setAppVersionNumber(std::string app_version_number);
	/*! \brief Get Timestamp in milliseconds of when the log was executed at the client.
	 */
	int getClientTimestamp();

	/*! \brief Set Timestamp in milliseconds of when the log was executed at the client.
	 */
	void setClientTimestamp(int client_timestamp);
	/*! \brief Get 
	 */
	IntegrationLogClientError getError();

	/*! \brief Set 
	 */
	void setError(IntegrationLogClientError error);
	/*! \brief Get Log event type
	 */
	IntegrationLogEventType getEventType();

	/*! \brief Set Log event type
	 */
	void setEventType(IntegrationLogEventType event_type);
	/*! \brief Get 
	 */
	std::string getExternalBusinessId();

	/*! \brief Set 
	 */
	void setExternalBusinessId(std::string external_business_id);
	/*! \brief Get 
	 */
	std::string getFeedProfileId();

	/*! \brief Set 
	 */
	void setFeedProfileId(std::string feed_profile_id);
	/*! \brief Get Log level type
	 */
	IntegrationLogLevel getLogLevel();

	/*! \brief Set Log level type
	 */
	void setLogLevel(IntegrationLogLevel log_level);
	/*! \brief Get 
	 */
	std::string getMerchantId();

	/*! \brief Set 
	 */
	void setMerchantId(std::string merchant_id);
	/*! \brief Get Explanation of the event that occured.
	 */
	std::string getMessage();

	/*! \brief Set Explanation of the event that occured.
	 */
	void setMessage(std::string message);
	/*! \brief Get Version number of the platform the integration application is running on.
	 */
	std::string getPlatformVersionNumber();

	/*! \brief Set Version number of the platform the integration application is running on.
	 */
	void setPlatformVersionNumber(std::string platform_version_number);
	/*! \brief Get 
	 */
	IntegrationLogClientRequest getRequest();

	/*! \brief Set 
	 */
	void setRequest(IntegrationLogClientRequest request);
	/*! \brief Get 
	 */
	std::string getTagId();

	/*! \brief Set 
	 */
	void setTagId(std::string tag_id);


    private:
    std::string advertiser_id{};
    std::string app_version_number{};
    int client_timestamp{};
    IntegrationLogClientError error;
    IntegrationLogEventType event_type;
    std::string external_business_id{};
    std::string feed_profile_id{};
    IntegrationLogLevel log_level;
    std::string merchant_id{};
    std::string message{};
    std::string platform_version_number{};
    IntegrationLogClientRequest request;
    std::string tag_id{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationLog_H_ */
