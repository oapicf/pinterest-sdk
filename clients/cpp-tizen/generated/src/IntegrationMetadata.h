/*
 * IntegrationMetadata.h
 *
 * Integration metadata
 */

#ifndef _IntegrationMetadata_H_
#define _IntegrationMetadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Integration metadata
 *
 *  \ingroup Models
 *
 */

class IntegrationMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	IntegrationMetadata();
	IntegrationMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~IntegrationMetadata();

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
	long long getCreatedTimestamp();

	/*! \brief Set 
	 */
	void setCreatedTimestamp(long long  created_timestamp);
	/*! \brief Get 
	 */
	long long getUpdatedTimestamp();

	/*! \brief Set 
	 */
	void setUpdatedTimestamp(long long  updated_timestamp);
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
	std::string id;
	std::string external_business_id;
	std::string connected_merchant_id;
	std::string connected_user_id;
	std::string connected_advertiser_id;
	std::string connected_lba_id;
	std::string connected_tag_id;
	long long partner_access_token_expiry;
	long long partner_refresh_token_expiry;
	std::string scopes;
	long long created_timestamp;
	long long updated_timestamp;
	std::string additional_id_1;
	std::string partner_metadata;
	void __init();
	void __cleanup();

};
}
}

#endif /* _IntegrationMetadata_H_ */
