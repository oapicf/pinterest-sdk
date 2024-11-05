#ifndef _BillingManager_H_
#define _BillingManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdsCreditRedeemRequest.h"
#include "AdsCreditRedeemResponse.h"
#include "Ads_credits_discounts_get_200_response.h"
#include "Billing_profiles_get_200_response.h"
#include "Error.h"
#include "SSIOAccountResponse.h"
#include "SSIOCreateInsertionOrderRequest.h"
#include "SSIOCreateInsertionOrderResponse.h"
#include "SSIOEditInsertionOrderRequest.h"
#include "SSIOEditInsertionOrderResponse.h"
#include "SSIOInsertionOrderStatusResponse.h"
#include "Ssio_insertion_orders_status_get_by_ad_account_200_response.h"
#include "Ssio_order_lines_get_by_ad_account_200_response.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Billing Billing
 * \ingroup Operations
 *  @{
 */
class BillingManager {
public:
	BillingManager();
	virtual ~BillingManager();

/*! \brief Redeem ad credits. *Synchronous*
 *
 * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adsCreditRedeemRequest Redeem ad credits request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditRedeemSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemRequest> adsCreditRedeemRequest, 
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
	, void* userData);

/*! \brief Redeem ad credits. *Asynchronous*
 *
 * Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adsCreditRedeemRequest Redeem ad credits request. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditRedeemAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemRequest> adsCreditRedeemRequest, 
	void(* handler)(AdsCreditRedeemResponse, Error, void* )
	, void* userData);


/*! \brief Get ads credit discounts. *Synchronous*
 *
 * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditsDiscountsGetSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get ads credit discounts. *Asynchronous*
 *
 * Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditsDiscountsGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get billing profiles. *Synchronous*
 *
 * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingProfilesGetSync(char * accessToken,
	std::string adAccountId, bool isActive, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get billing profiles. *Asynchronous*
 *
 * Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingProfilesGetAsync(char * accessToken,
	std::string adAccountId, bool isActive, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get Salesforce account details including bill-to information.. *Synchronous*
 *
 * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioAccountsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccountResponse, Error, void* )
	, void* userData);

/*! \brief Get Salesforce account details including bill-to information.. *Asynchronous*
 *
 * Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioAccountsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccountResponse, Error, void* )
	, void* userData);


/*! \brief Create insertion order through SSIO.. *Synchronous*
 *
 * Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOCreateInsertionOrderRequest Order line to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOCreateInsertionOrderRequest> sSIOCreateInsertionOrderRequest, 
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
	, void* userData);

/*! \brief Create insertion order through SSIO.. *Asynchronous*
 *
 * Create insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOCreateInsertionOrderRequest Order line to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOCreateInsertionOrderRequest> sSIOCreateInsertionOrderRequest, 
	void(* handler)(SSIOCreateInsertionOrderResponse, Error, void* )
	, void* userData);


/*! \brief Edit insertion order through SSIO.. *Synchronous*
 *
 * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOEditInsertionOrderRequest Order line to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderEditSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOEditInsertionOrderRequest> sSIOEditInsertionOrderRequest, 
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
	, void* userData);

/*! \brief Edit insertion order through SSIO.. *Asynchronous*
 *
 * Edit insertion order through SSIO for <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOEditInsertionOrderRequest Order line to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderEditAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOEditInsertionOrderRequest> sSIOEditInsertionOrderRequest, 
	void(* handler)(SSIOEditInsertionOrderResponse, Error, void* )
	, void* userData);


/*! \brief Get insertion order status by ad account id.. *Synchronous*
 *
 * Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrdersStatusGetByAdAccountSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
	, void* userData);

/*! \brief Get insertion order status by ad account id.. *Asynchronous*
 *
 * Get insertion order status for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrdersStatusGetByAdAccountAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_insertion_orders_status_get_by_ad_account_200_response, Error, void* )
	, void* userData);


/*! \brief Get insertion order status by pin order id.. *Synchronous*
 *
 * Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pinOrderId The pin order id associated with the ssio insertion order *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrdersStatusGetByPinOrderIdSync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, 
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
	, void* userData);

/*! \brief Get insertion order status by pin order id.. *Asynchronous*
 *
 * Get insertion order status for pin order id <code>pin_order_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pinOrderId The pin order id associated with the ssio insertion order *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrdersStatusGetByPinOrderIdAsync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, 
	void(* handler)(SSIOInsertionOrderStatusResponse, Error, void* )
	, void* userData);


/*! \brief Get Salesforce order lines by ad account id.. *Synchronous*
 *
 * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param pinOrderId The pin order id associated with the ssio insertino order
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioOrderLinesGetByAdAccountSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string pinOrderId, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	, void* userData);

/*! \brief Get Salesforce order lines by ad account id.. *Asynchronous*
 *
 * Get Salesforce order lines for account id <code>ad_account_id</code>. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param pinOrderId The pin order id associated with the ssio insertino order
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioOrderLinesGetByAdAccountAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, std::string pinOrderId, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* BillingManager_H_ */
