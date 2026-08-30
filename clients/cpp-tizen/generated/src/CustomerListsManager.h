#ifndef _CustomerListsManager_H_
#define _CustomerListsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CustomerList.h"
#include "CustomerListCreate.h"
#include "CustomerListUpdateWithRequiredBody.h"
#include "Customer_lists_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
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
 * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
 * \param adAccountId  *Required*
 * \param customerListCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerListCreate> customerListCreate, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);

/*! \brief Create customer lists. *Asynchronous*
 *
 * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
 * \param adAccountId  *Required*
 * \param customerListCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<CustomerListCreate> customerListCreate, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);


/*! \brief Get customer list. *Synchronous*
 *
 * Gets a specific customer list given the customer list ID.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
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
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
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
 * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
 * \param adAccountId  *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param excludeNca When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, bool excludeNca, 
	void(* handler)(Customer_lists_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get customer lists. *Asynchronous*
 *
 * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
 * \param adAccountId  *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param excludeNca When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, bool excludeNca, 
	void(* handler)(Customer_lists_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update customer list. *Synchronous*
 *
 * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsUpdateSync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUpdateWithRequiredBody> customerListUpdateWithRequiredBody, 
	void(* handler)(CustomerList, Error, void* )
	, void* userData);

/*! \brief Update customer list. *Asynchronous*
 *
 * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
 * \param adAccountId  *Required*
 * \param customerListId Customer list ID. *Required*
 * \param customerListUpdateWithRequiredBody  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool customerListsUpdateAsync(char * accessToken,
	std::string adAccountId, std::string customerListId, std::shared_ptr<CustomerListUpdateWithRequiredBody> customerListUpdateWithRequiredBody, 
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
