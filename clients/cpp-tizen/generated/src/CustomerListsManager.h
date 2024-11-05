#ifndef _CustomerListsManager_H_
#define _CustomerListsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CustomerList.h"
#include "CustomerListRequest.h"
#include "CustomerListUpdateRequest.h"
#include "Customer_lists_list_200_response.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup CustomerLists CustomerLists
 * \ingroup Operations
 *  @{
 */
class CustomerListsManager {
public:
	CustomerListsManager();
	virtual ~CustomerListsManager();

/*! \brief Create customer lists. *Synchronous*
 *
 * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/>  <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListRequest Parameters to get Customer lists info *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerListRequest> customerListRequest, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);

/*! \brief Create customer lists. *Asynchronous*
 *
 * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/>  <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListRequest Parameters to get Customer lists info *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerListRequest> customerListRequest, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);


/*! \brief Get customer list. *Synchronous*
 *
 * Gets a specific customer list given the customer list ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsGetSync(char * accessToken,
	std::string adAccountId, std::string customerListId, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);

/*! \brief Get customer list. *Asynchronous*
 *
 * Gets a specific customer list given the customer list ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsGetAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);


/*! \brief Get customer lists. *Synchronous*
 *
 * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Customer_lists_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get customer lists. *Asynchronous*
 *
 * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Customer_lists_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update customer list. *Synchronous*
 *
 * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsUpdateSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUpdateRequest> customerListUpdateRequest, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);

/*! \brief Update customer list. *Asynchronous*
 *
 * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param customerListId Unique identifier of a customer list *Required*
 * \param customerListUpdateRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsUpdateAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUpdateRequest> customerListUpdateRequest, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CustomerListsManager_H_ */
