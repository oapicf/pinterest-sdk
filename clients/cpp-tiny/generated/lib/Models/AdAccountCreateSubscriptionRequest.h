
/*
 * AdAccountCreateSubscriptionRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdAccountCreateSubscriptionRequest_H_
#define TINY_CPP_CLIENT_AdAccountCreateSubscriptionRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdAccountCreateSubscriptionRequest_partner_metadata.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdAccountCreateSubscriptionRequest{
public:

    /*! \brief Constructor.
	 */
    AdAccountCreateSubscriptionRequest();
    AdAccountCreateSubscriptionRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdAccountCreateSubscriptionRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Lead form ID.
	 */
	std::string getLeadFormId();

	/*! \brief Set Lead form ID.
	 */
	void setLeadFormId(std::string  lead_form_id);
	/*! \brief Get Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerAccessToken();

	/*! \brief Set Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerAccessToken(std::string  partner_access_token);
	/*! \brief Get 
	 */
	AdAccountCreateSubscriptionRequest_partner_metadata getPartnerMetadata();

	/*! \brief Set 
	 */
	void setPartnerMetadata(AdAccountCreateSubscriptionRequest_partner_metadata  partner_metadata);
	/*! \brief Get Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerRefreshToken();

	/*! \brief Set Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerRefreshToken(std::string  partner_refresh_token);
	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string  webhook_url);


    private:
    std::string lead_form_id{};
    std::string partner_access_token{};
    AdAccountCreateSubscriptionRequest_partner_metadata partner_metadata;
    std::string partner_refresh_token{};
    std::string webhook_url{};
};
}

#endif /* TINY_CPP_CLIENT_AdAccountCreateSubscriptionRequest_H_ */
