/*
 * LeadSubscriptionPostParamsCreate.h
 *
 * 
 */

#ifndef _LeadSubscriptionPostParamsCreate_H_
#define _LeadSubscriptionPostParamsCreate_H_


#include <string>
#include "PartnerMetadata.h"
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

class LeadSubscriptionPostParamsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadSubscriptionPostParamsCreate();
	LeadSubscriptionPostParamsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadSubscriptionPostParamsCreate();

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
	/*! \brief Get Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerAccessToken();

	/*! \brief Set Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerAccessToken(std::string  partner_access_token);
	/*! \brief Get Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
	 */
	PartnerMetadata getPartnerMetadata();

	/*! \brief Set Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
	 */
	void setPartnerMetadata(PartnerMetadata  partner_metadata);
	/*! \brief Get Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	std::string getPartnerRefreshToken();

	/*! \brief Set Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
	 */
	void setPartnerRefreshToken(std::string  partner_refresh_token);

private:
	std::string lead_form_id;
	std::string webhook_url;
	std::string partner_access_token;
	PartnerMetadata partner_metadata;
	std::string partner_refresh_token;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadSubscriptionPostParamsCreate_H_ */
