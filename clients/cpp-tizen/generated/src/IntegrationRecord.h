/*
 * IntegrationRecord.h
 *
 * Integration record
 */

#ifndef _IntegrationRecord_H_
#define _IntegrationRecord_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Integration record
 *
 *  \ingroup Models
 *
 */

class IntegrationRecord : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationRecord();
	IntegrationRecord(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationRecord();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getExternalBusinessId();

	/*! \brief Set 
	 */
	void setExternalBusinessId(std::string  external_business_id);
	/*! \brief Get 
	 */
	std::string getConnectedMerchantId();

	/*! \brief Set 
	 */
	void setConnectedMerchantId(std::string  connected_merchant_id);
	/*! \brief Get 
	 */
	std::string getConnectedUserId();

	/*! \brief Set 
	 */
	void setConnectedUserId(std::string  connected_user_id);
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
	int getPartnerAccessTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerAccessTokenExpiry(int  partner_access_token_expiry);
	/*! \brief Get 
	 */
	int getPartnerRefreshTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerRefreshTokenExpiry(int  partner_refresh_token_expiry);
	/*! \brief Get 
	 */
	std::string getScopes();

	/*! \brief Set 
	 */
	void setScopes(std::string  scopes);
	/*! \brief Get 
	 */
	std::string getPartnerMetadata();

	/*! \brief Set 
	 */
	void setPartnerMetadata(std::string  partner_metadata);
	/*! \brief Get 
	 */
	std::string getAdditionalId1();

	/*! \brief Set 
	 */
	void setAdditionalId1(std::string  additional_id_1);
	/*! \brief Get 
	 */
	int getCreatedTime();

	/*! \brief Set 
	 */
	void setCreatedTime(int  created_time);
	/*! \brief Get 
	 */
	int getUpdatedTime();

	/*! \brief Set 
	 */
	void setUpdatedTime(int  updated_time);

private:
	std::string id;
	std::string external_business_id;
	std::string connected_merchant_id;
	std::string connected_user_id;
	std::string connected_advertiser_id;
	std::string connected_lba_id;
	std::string connected_tag_id;
	std::string partner_access_token;
	std::string partner_refresh_token;
	std::string partner_primary_email;
	int partner_access_token_expiry;
	int partner_refresh_token_expiry;
	std::string scopes;
	std::string partner_metadata;
	std::string additional_id_1;
	int created_time;
	int updated_time;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationRecord_H_ */
