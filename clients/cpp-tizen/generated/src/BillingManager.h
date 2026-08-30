#ifndef _BillingManager_H_
#define _BillingManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdsCreditRedeem.h"
#include "AdsCreditRedeemCreate.h"
#include "Ads_credits_discounts_get_200_response.h"
#include "BillingInvoiceDocumentType.h"
#include "BillingInvoiceDownloadResponse.h"
#include "BillingInvoiceSortField.h"
#include "BillingInvoiceStatus.h"
#include "Billing_invoices_get_200_response.h"
#include "Billing_profiles_get_200_response.h"
#include "Date.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "SSIOAccount.h"
#include "SSIOInsertionOrder.h"
#include "SSIOInsertionOrderCreate.h"
#include "SSIOInsertionOrderStatusResponse.h"
#include "SSIOInsertionOrderUpdate.h"
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
 * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adsCreditRedeemCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditRedeemSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemCreate> adsCreditRedeemCreate, 
	void(* handler)(AdsCreditRedeem, Error, void* )
	, void* userData);

/*! \brief Redeem ad credits. *Asynchronous*
 *
 * Redeem ads credit on behalf of the ad account id and apply it towards billing.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adsCreditRedeemCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditRedeemAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdsCreditRedeemCreate> adsCreditRedeemCreate, 
	void(* handler)(AdsCreditRedeem, Error, void* )
	, void* userData);


/*! \brief Get ads credit discounts. *Synchronous*
 *
 * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
 * Returns the list of discounts applied to the account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adsCreditsDiscountsGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Ads_credits_discounts_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get download url for a billing invoice. *Synchronous*
 *
 * Get download url for a billing invoice.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param billingInvoiceId Unique identifier of a billing invoice. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingInvoiceDownloadGetSync(char * accessToken,
	std::string adAccountId, std::string billingInvoiceId, 
	void(* handler)(BillingInvoiceDownloadResponse, Error, void* )
	, void* userData);

/*! \brief Get download url for a billing invoice. *Asynchronous*
 *
 * Get download url for a billing invoice.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param billingInvoiceId Unique identifier of a billing invoice. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingInvoiceDownloadGetAsync(char * accessToken,
	std::string adAccountId, std::string billingInvoiceId, 
	void(* handler)(BillingInvoiceDownloadResponse, Error, void* )
	, void* userData);


/*! \brief Get billing invoices. *Synchronous*
 *
 * Get billing invoices in the advertiser account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param sort Field of which to sort billing invoices
 * \param status Status of billing invoices to filter by
 * \param documentType Document type of billing invoices to filter by
 * \param startDueDate Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
 * \param endDueDate Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingInvoicesGetSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, Date startDueDate, Date endDueDate, 
	void(* handler)(Billing_invoices_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get billing invoices. *Asynchronous*
 *
 * Get billing invoices in the advertiser account.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param sort Field of which to sort billing invoices
 * \param status Status of billing invoices to filter by
 * \param documentType Document type of billing invoices to filter by
 * \param startDueDate Starting point for due dates when searching for invoices. Format: YYYY-MM-DD
 * \param endDueDate Ending point for due dates when searching for invoices. Format: YYYY-MM-DD
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingInvoicesGetAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, BillingInvoiceSortField sort, BillingInvoiceStatus status, BillingInvoiceDocumentType documentType, Date startDueDate, Date endDueDate, 
	void(* handler)(Billing_invoices_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get billing profiles. *Synchronous*
 *
 * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingProfilesGetSync(char * accessToken,
	bool isActive, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get billing profiles. *Asynchronous*
 *
 * Get billing profiles in the advertiser account.  **This endpoint might not be available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param isActive Return active billing profiles, if false return all billing profiles. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool billingProfilesGetAsync(char * accessToken,
	bool isActive, std::string adAccountId, std::string bookmark, int pageSize, 
	void(* handler)(Billing_profiles_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get Salesforce account details including bill-to information.. *Synchronous*
 *
 *   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioAccountsGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccount, Error, void* )
	, void* userData);

/*! \brief Get Salesforce account details including bill-to information.. *Asynchronous*
 *
 *   Get Salesforce account details including bill-to information to be used in insertion orders process for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioAccountsGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(SSIOAccount, Error, void* )
	, void* userData);


/*! \brief Create insertion order through SSIO.. *Synchronous*
 *
 *   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOInsertionOrderCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOInsertionOrderCreate> sSIOInsertionOrderCreate, 
	void(* handler)(SSIOInsertionOrder, Error, void* )
	, void* userData);

/*! \brief Create insertion order through SSIO.. *Asynchronous*
 *
 *   Create insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOInsertionOrderCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOInsertionOrderCreate> sSIOInsertionOrderCreate, 
	void(* handler)(SSIOInsertionOrder, Error, void* )
	, void* userData);


/*! \brief Edit insertion order through SSIO.. *Synchronous*
 *
 *   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOInsertionOrderUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderEditSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOInsertionOrderUpdate> sSIOInsertionOrderUpdate, 
	void(* handler)(SSIOInsertionOrder, Error, void* )
	, void* userData);

/*! \brief Edit insertion order through SSIO.. *Asynchronous*
 *
 *   Edit insertion order through SSIO for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param sSIOInsertionOrderUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioInsertionOrderEditAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<SSIOInsertionOrderUpdate> sSIOInsertionOrderUpdate, 
	void(* handler)(SSIOInsertionOrder, Error, void* )
	, void* userData);


/*! \brief Get insertion order status by ad account id.. *Synchronous*
 *
 *   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
 *   Get insertion order status for `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
 *   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
 *   Get insertion order status for `pin_order_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
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
 *   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pinOrderId The pin order id associated with the SSIO insertion order
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioOrderLinesGetByAdAccountSync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, std::string bookmark, int pageSize, 
	void(* handler)(Ssio_order_lines_get_by_ad_account_200_response, Error, void* )
	, void* userData);

/*! \brief Get Salesforce order lines by ad account id.. *Asynchronous*
 *
 *   Get Salesforce order lines for account id `ad_account_id`.   - The token's `user_account` must either be the owner of the specified ad account, or have one of the necessary roles granted via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Finance, Campaign.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pinOrderId The pin order id associated with the SSIO insertion order
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool ssioOrderLinesGetByAdAccountAsync(char * accessToken,
	std::string adAccountId, std::string pinOrderId, std::string bookmark, int pageSize, 
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
