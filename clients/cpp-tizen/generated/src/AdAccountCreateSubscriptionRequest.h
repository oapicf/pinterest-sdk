/*
 * AdAccountCreateSubscriptionRequest.h
 *
 * 
 */

#ifndef _AdAccountCreateSubscriptionRequest_H_
#define _AdAccountCreateSubscriptionRequest_H_


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

class AdAccountCreateSubscriptionRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountCreateSubscriptionRequest();
	AdAccountCreateSubscriptionRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountCreateSubscriptionRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Standard HTTPS webhook URL.
	 */
	std::string getWebhookUrl();

	/*! \brief Set Standard HTTPS webhook URL.
	 */
	void setWebhookUrl(std::string  webhook_url);
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
	/*! \brief Get Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerRefreshToken();

	/*! \brief Set Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerRefreshToken(std::string  partner_refresh_token);

private:
	std::string webhook_url;
	std::string lead_form_id;
	std::string partner_access_token;
	std::string partner_refresh_token;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountCreateSubscriptionRequest_H_ */
