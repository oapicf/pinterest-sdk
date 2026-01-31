/*
 * LeadSubscription.h
 *
 * 
 */

#ifndef _LeadSubscription_H_
#define _LeadSubscription_H_


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

class LeadSubscription : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadSubscription();
	LeadSubscription(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadSubscription();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	/*! \brief Get Subscription creation time. Unix timestamp in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set Subscription creation time. Unix timestamp in milliseconds.
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get Lead data encryption algorithm.
	 */
	std::string getCryptographicAlgorithm();

	/*! \brief Set Lead data encryption algorithm.
	 */
	void setCryptographicAlgorithm(std::string  cryptographic_algorithm);
	/*! \brief Get Base64 encoded key for client to decrypt lead data.
	 */
	std::string getCryptographicKey();

	/*! \brief Set Base64 encoded key for client to decrypt lead data.
	 */
	void setCryptographicKey(std::string  cryptographic_key);
	/*! \brief Get Subscription ID.
	 */
	std::string getId();

	/*! \brief Set Subscription ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get User account used to subscribe lead data.
	 */
	std::string getUserAccountId();

	/*! \brief Set User account used to subscribe lead data.
	 */
	void setUserAccountId(std::string  user_account_id);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string  webhook_url);

private:
	std::string ad_account_id;
	std::string api_version;
	int created_time;
	std::string cryptographic_algorithm;
	std::string cryptographic_key;
	std::string id;
	std::string lead_form_id;
	std::string user_account_id;
	std::string webhook_url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadSubscription_H_ */
