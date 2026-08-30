
/*
 * IntegrationMetadata.h
 *
 * Integration metadata
 */

#ifndef TINY_CPP_CLIENT_IntegrationMetadata_H_
#define TINY_CPP_CLIENT_IntegrationMetadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Integration metadata
 *
 *  \ingroup Models
 *
 */

class IntegrationMetadata{
public:

    /*! \brief Constructor.
	 */
    IntegrationMetadata();
    IntegrationMetadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~IntegrationMetadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getAdditionalId1();

	/*! \brief Set 
	 */
	void setAdditionalId1(std::string additional_id_1);
	/*! \brief Get 
	 */
	std::string getConnectedAdvertiserId();

	/*! \brief Set 
	 */
	void setConnectedAdvertiserId(std::string connected_advertiser_id);
	/*! \brief Get 
	 */
	std::string getConnectedLbaId();

	/*! \brief Set 
	 */
	void setConnectedLbaId(std::string connected_lba_id);
	/*! \brief Get 
	 */
	std::string getConnectedMerchantId();

	/*! \brief Set 
	 */
	void setConnectedMerchantId(std::string connected_merchant_id);
	/*! \brief Get 
	 */
	std::string getConnectedTagId();

	/*! \brief Set 
	 */
	void setConnectedTagId(std::string connected_tag_id);
	/*! \brief Get 
	 */
	std::string getConnectedUserId();

	/*! \brief Set 
	 */
	void setConnectedUserId(std::string connected_user_id);
	/*! \brief Get 
	 */
	long getCreatedTimestamp();

	/*! \brief Set 
	 */
	void setCreatedTimestamp(long created_timestamp);
	/*! \brief Get External business ID for the integration.
	 */
	std::string getExternalBusinessId();

	/*! \brief Set External business ID for the integration.
	 */
	void setExternalBusinessId(std::string external_business_id);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	long getPartnerAccessTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerAccessTokenExpiry(long partner_access_token_expiry);
	/*! \brief Get 
	 */
	std::string getPartnerMetadata();

	/*! \brief Set 
	 */
	void setPartnerMetadata(std::string partner_metadata);
	/*! \brief Get 
	 */
	long getPartnerRefreshTokenExpiry();

	/*! \brief Set 
	 */
	void setPartnerRefreshTokenExpiry(long partner_refresh_token_expiry);
	/*! \brief Get 
	 */
	std::string getScopes();

	/*! \brief Set 
	 */
	void setScopes(std::string scopes);
	/*! \brief Get 
	 */
	long getUpdatedTimestamp();

	/*! \brief Set 
	 */
	void setUpdatedTimestamp(long updated_timestamp);


    private:
    std::string additional_id_1{};
    std::string connected_advertiser_id{};
    std::string connected_lba_id{};
    std::string connected_merchant_id{};
    std::string connected_tag_id{};
    std::string connected_user_id{};
    long created_timestamp{};
    std::string external_business_id{};
    std::string id{};
    long partner_access_token_expiry{};
    std::string partner_metadata{};
    long partner_refresh_token_expiry{};
    std::string scopes{};
    long updated_timestamp{};
};
}

#endif /* TINY_CPP_CLIENT_IntegrationMetadata_H_ */
