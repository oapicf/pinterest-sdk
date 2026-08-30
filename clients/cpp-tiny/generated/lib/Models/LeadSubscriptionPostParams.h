
/*
 * LeadSubscriptionPostParams.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadSubscriptionPostParams_H_
#define TINY_CPP_CLIENT_LeadSubscriptionPostParams_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "PartnerMetadata.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class LeadSubscriptionPostParams{
public:

    /*! \brief Constructor.
	 */
    LeadSubscriptionPostParams();
    LeadSubscriptionPostParams(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadSubscriptionPostParams();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The Ad Account ID that this lead form belongs to.
	 */
	std::string getAdAccountId();

	/*! \brief Set The Ad Account ID that this lead form belongs to.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get API version.
	 */
	std::string getApiVersion();

	/*! \brief Set API version.
	 */
	void setApiVersion(std::string api_version);
	/*! \brief Get Subscription creation time. Unix timestamp in milliseconds.
	 */
	int getCreatedTime();

	/*! \brief Set Subscription creation time. Unix timestamp in milliseconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Lead data encryption algorithm.
	 */
	std::string getCryptographicAlgorithm();

	/*! \brief Set Lead data encryption algorithm.
	 */
	void setCryptographicAlgorithm(std::string cryptographic_algorithm);
	/*! \brief Get Base64 encoded key for client to decrypt lead data.
	 */
	std::string getCryptographicKey();

	/*! \brief Set Base64 encoded key for client to decrypt lead data.
	 */
	void setCryptographicKey(std::string cryptographic_key);
	/*! \brief Get Subscription ID.
	 */
	std::string getId();

	/*! \brief Set Subscription ID.
	 */
	void setId(std::string id);
	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string lead_form_id);
	/*! \brief Get User account used to subscribe lead data.
	 */
	std::string getUserAccountId();

	/*! \brief Set User account used to subscribe lead data.
	 */
	void setUserAccountId(std::string user_account_id);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string webhook_url);
	/*! \brief Get Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerAccessToken();

	/*! \brief Set Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerAccessToken(std::string partner_access_token);
	/*! \brief Get Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
	 */
	PartnerMetadata getPartnerMetadata();

	/*! \brief Set Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
	 */
	void setPartnerMetadata(PartnerMetadata partner_metadata);
	/*! \brief Get Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerRefreshToken();

	/*! \brief Set Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerRefreshToken(std::string partner_refresh_token);


    private:
    std::string ad_account_id{};
    std::string api_version{};
    int created_time{};
    std::string cryptographic_algorithm{};
    std::string cryptographic_key{};
    std::string id{};
    std::string lead_form_id{};
    std::string user_account_id{};
    std::string webhook_url{};
    std::string partner_access_token{};
    PartnerMetadata partner_metadata;
    std::string partner_refresh_token{};
};
}

#endif /* TINY_CPP_CLIENT_LeadSubscriptionPostParams_H_ */
