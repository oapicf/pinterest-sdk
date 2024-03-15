/*
 * AdAccountGetSubscriptionResponse.h
 *
 * 
 */

#ifndef _AdAccountGetSubscriptionResponse_H_
#define _AdAccountGetSubscriptionResponse_H_


#include <string>
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

class AdAccountGetSubscriptionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountGetSubscriptionResponse();
	AdAccountGetSubscriptionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountGetSubscriptionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string  webhook_url);
	/*! \brief Get Subscription ID.
	 */
	std::string getId();

	/*! \brief Set Subscription ID.
	 */
	void setId(std::string  id);
	/*! \brief Get User account used to subscribe lead data.
	 */
	std::string getUserAccountId();

	/*! \brief Set User account used to subscribe lead data.
	 */
	void setUserAccountId(std::string  user_account_id);
	/*! \brief Get The Ad Account ID that this lead form belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The Ad Account ID that this lead form belongs to.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get API version.
	 */
	std::string getApiVersion();

	/*! \brief Set API version.
	 */
	void setApiVersion(std::string  api_version);
	/*! \brief Get Base64 encoded key for client to decrypt lead data.
	 */
	std::string getCryptographicKey();

	/*! \brief Set Base64 encoded key for client to decrypt lead data.
	 */
	void setCryptographicKey(std::string  cryptographic_key);
	/*! \brief Get Lead data encryption algorithm.
	 */
	std::string getCryptographicAlgorithm();

	/*! \brief Set Lead data encryption algorithm.
	 */
	void setCryptographicAlgorithm(std::string  cryptographic_algorithm);
	/*! \brief Get Lead form creation time. Unix timestamp in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set Lead form creation time. Unix timestamp in milliseconds.
	 */
	void setCreatedTime(int  created_time);

private:
	std::string lead_form_id;
	std::string webhook_url;
	std::string id;
	std::string user_account_id;
	std::string ad_account_id;
	std::string api_version;
	std::string cryptographic_key;
	std::string cryptographic_algorithm;
	int created_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountGetSubscriptionResponse_H_ */
