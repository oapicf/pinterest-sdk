#ifndef TINY_CPP_CLIENT_CustomerListsApi_H_
#define TINY_CPP_CLIENT_CustomerListsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CustomerList.h"
#include "CustomerListCreate.h"
#include "CustomerListUpdateWithRequiredBody.h"
#include "Customer_lists_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CustomerListsApi : public Service {
public:
    CustomerListsApi() = default;

    virtual ~CustomerListsApi();

    /**
    * Create customer lists.
    *
    * Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).
    * \param adAccountId  *Required*
    * \param customerListCreate  *Required*
    */
    Response<
                CustomerList
        >
    customerLists_create(
            
            std::string adAccountId
            , 
            
            CustomerListCreate customerListCreate
            
    );
    /**
    * Get customer list.
    *
    * Gets a specific customer list given the customer list ID.
    * \param adAccountId  *Required*
    * \param customerListId Customer list ID. *Required*
    */
    Response<
                CustomerList
        >
    customerLists_get(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            
    );
    /**
    * Get customer lists.
    *
    * Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    * \param adAccountId  *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param excludeNca When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all).
    */
    Response<
                Customer_lists_list_200_response
        >
    customerLists_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            
            bool excludeNca
            
    );
    /**
    * Update customer list.
    *
    * Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.
    * \param adAccountId  *Required*
    * \param customerListId Customer list ID. *Required*
    * \param customerListUpdateWithRequiredBody  *Required*
    */
    Response<
                CustomerList
        >
    customerLists_update(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            CustomerListUpdateWithRequiredBody customerListUpdateWithRequiredBody
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CustomerListsApi_H_ */