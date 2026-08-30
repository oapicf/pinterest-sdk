
/*
 * LeadSubscriptionPostParamsCreate.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_H_
#define TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_H_


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

class LeadSubscriptionPostParamsCreate{
public:

    /*! \brief Constructor.
	 */
    LeadSubscriptionPostParamsCreate();
    LeadSubscriptionPostParamsCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadSubscriptionPostParamsCreate();


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
	void setLeadFormId(std::string lead_form_id);
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
    std::string lead_form_id{};
    std::string webhook_url{};
    std::string partner_access_token{};
    PartnerMetadata partner_metadata;
    std::string partner_refresh_token{};
};
}

#endif /* TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_H_ */
