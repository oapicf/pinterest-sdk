/*
 * Campaign_ad_preview_create_200_response_inner_data.h
 *
 * Created/updated resource on success or error details on failure
 */

#ifndef _Campaign_ad_preview_create_200_response_inner_data_H_
#define _Campaign_ad_preview_create_200_response_inner_data_H_


#include <string>
#include "CampaignAdPreview.h"
#include "Campaign_ad_preview_create_200_response_inner_data_oneOf.h"
#include "Pinterest.Lib.Error.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Created/updated resource on success or error details on failure
 *
 *  \ingroup Models
 *
 */

class Campaign_ad_preview_create_200_response_inner_data : public Object {
public:
	/*! \brief Constructor.
	 */
	Campaign_ad_preview_create_200_response_inner_data();
	Campaign_ad_preview_create_200_response_inner_data(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Campaign_ad_preview_create_200_response_inner_data();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Advertiser ID for this preview.
	 */
	std::string getAdAccountId();

	/*! \brief Set Advertiser ID for this preview.
	 */
	void setAdAccountId(std::string  ad_account_id);
	/*! \brief Get Ad group ID to create a preview record for.
	 */
	std::string getAdGroupId();

	/*! \brief Set Ad group ID to create a preview record for.
	 */
	void setAdGroupId(std::string  ad_group_id);
	/*! \brief Get Client ID that created preview.
	 */
	int getClientId();

	/*! \brief Set Client ID that created preview.
	 */
	void setClientId(int  client_id);
	/*! \brief Get Unix timestamp in milliseconds for preview expiration.
	 */
	int getExpiresAt();

	/*! \brief Set Unix timestamp in milliseconds for preview expiration.
	 */
	void setExpiresAt(int  expires_at);
	/*! \brief Get Whether preview link is active.
	 */
	bool getIsActive();

	/*! \brief Set Whether preview link is active.
	 */
	void setIsActive(bool  is_active);
	/*! \brief Get Pin ID for pin promotion preview.
	 */
	int getPinId();

	/*! \brief Set Pin ID for pin promotion preview.
	 */
	void setPinId(int  pin_id);
	/*! \brief Get Pin promotion ID for this preview.
	 */
	int getPinPromotionId();

	/*! \brief Set Pin promotion ID for this preview.
	 */
	void setPinPromotionId(int  pin_promotion_id);
	/*! \brief Get Promoted product group ID for catalog previews.
	 */
	int getPromotedProductGroupId();

	/*! \brief Set Promoted product group ID for catalog previews.
	 */
	void setPromotedProductGroupId(int  promoted_product_group_id);
	/*! \brief Get Campaign ad preview URL.
	 */
	std::string getUrl();

	/*! \brief Set Campaign ad preview URL.
	 */
	void setUrl(std::string  url);
	/*! \brief Get User ID that created preview.
	 */
	int getUserId();

	/*! \brief Set User ID that created preview.
	 */
	void setUserId(int  user_id);
	/*! \brief Get Pin promotion preview key.
	 */
	std::string getUuid();

	/*! \brief Set Pin promotion preview key.
	 */
	void setUuid(std::string  uuid);
	/*! \brief Get 
	 */
	Pinterest.Lib.Error getExceptions();

	/*! \brief Set 
	 */
	void setExceptions(Pinterest.Lib.Error  exceptions);

private:
	std::string ad_account_id;
	std::string ad_group_id;
	int client_id;
	int expires_at;
	bool is_active;
	int pin_id;
	int pin_promotion_id;
	int promoted_product_group_id;
	std::string url;
	int user_id;
	std::string uuid;
	Pinterest.Lib.Error exceptions;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Campaign_ad_preview_create_200_response_inner_data_H_ */
