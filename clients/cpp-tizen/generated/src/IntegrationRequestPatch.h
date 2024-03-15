/*
 * IntegrationRequestPatch.h
 *
 * Schema used for updating the integration metadata.
 */

#ifndef _IntegrationRequestPatch_H_
#define _IntegrationRequestPatch_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Schema used for updating the integration metadata.
 *
 *  \ingroup Models
 *
 */

class IntegrationRequestPatch : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationRequestPatch();
	IntegrationRequestPatch(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationRequestPatch();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getConnectedMerchantId();

	/*! \brief Set 
	 */
	void setConnectedMerchantId(std::string  connected_merchant_id);
	/*! \brief Get 
	 */
	std::string getConnectedAdvertiserId();

	/*! \brief Set 
	 */
	void setConnectedAdvertiserId(std::string  connected_advertiser_id);
	/*! \brief Get 
	 */
	std::string getConnectedLbaId();

	/*! \brief Set 
	 */
	void setConnectedLbaId(std::string  connected_lba_id);
	/*! \brief Get 
	 */
	std::string getConnectedTagId();

	/*! \brief Set 
	 */
	void setConnectedTagId(std::string  connected_tag_id);
	/*! \brief Get 
	 */
	std::string getPartnerAccessToken();

	/*! \brief Set 
	 */
	void setPartnerAccessToken(std::string  partner_access_token);
	/*! \brief Get 
	 */
	std::string getPartnerRefreshToken();

	/*! \brief Set 
	 */
	void setPartnerRefreshToken(std::string  partner_refresh_token);
	/*! \brief Get 
	 */
	std::string getPartnerPrimaryEmail();

	/*! \brief Set 
	 */
	void setPartnerPrimaryEmail(std::string  partner_primary_email);
	/*! \brief Get 
	 */
	long long getPartnerAccessTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerAccessTokenExpiry(long long  partner_access_token_expiry);
	/*! \brief Get 
	 */
	long long getPartnerRefreshTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerRefreshTokenExpiry(long long  partner_refresh_token_expiry);
	/*! \brief Get 
	 */
	std::string getScopes();

	/*! \brief Set 
	 */
	void setScopes(std::string  scopes);
	/*! \brief Get 
	 */
	std::string getAdditionalId1();

	/*! \brief Set 
	 */
	void setAdditionalId1(std::string  additional_id_1);
	/*! \brief Get 
	 */
	std::string getPartnerMetadata();

	/*! \brief Set 
	 */
	void setPartnerMetadata(std::string  partner_metadata);

private:
	std::string connected_merchant_id;
	std::string connected_advertiser_id;
	std::string connected_lba_id;
	std::string connected_tag_id;
	std::string partner_access_token;
	std::string partner_refresh_token;
	std::string partner_primary_email;
	long long partner_access_token_expiry;
	long long partner_refresh_token_expiry;
	std::string scopes;
	std::string additional_id_1;
	std::string partner_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationRequestPatch_H_ */
