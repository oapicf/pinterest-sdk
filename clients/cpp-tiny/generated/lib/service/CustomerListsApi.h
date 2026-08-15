#ifndef TINY_CPP_CLIENT_CustomerListsApi_H_
#define TINY_CPP_CLIENT_CustomerListsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CustomerList.h"
#include "CustomerListRequest.h"
#include "CustomerListUpdateRequest.h"
#include "Customer_lists_list_200_response.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CustomerListsApi : public Service {
public:
    CustomerListsApi() = default;

    virtual ~CustomerListsApi() = default;

    /**
    * Create customer lists.
    *
    * <p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href=\"https://developer.pinterest.com/docs/api/v5/audiences-create\" target=\"blank\">create audience endpoint</a>.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListRequest Parameters to get Customer lists info *Required*
    */
    Response<
                CustomerList
        >
    customerLists_create(
            
            std::string adAccountId
            , 
            
            CustomerListRequest customerListRequest
            
    );
    /**
    * Get customer list.
    *
    * Gets a specific customer list given the customer list ID.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListId Unique identifier of a customer list *Required*
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
    * <p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Customer_lists_list_200_response
        >
    customerLists_list(
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
    );
    /**
    * Update customer list.
    *
    * <p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/api-features/targeting-overview/\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListId Unique identifier of a customer list *Required*
    * \param customerListUpdateRequest  *Required*
    */
    Response<
                CustomerList
        >
    customerLists_update(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            CustomerListUpdateRequest customerListUpdateRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CustomerListsApi_H_ */