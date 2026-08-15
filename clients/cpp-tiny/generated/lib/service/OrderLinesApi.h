#ifndef TINY_CPP_CLIENT_OrderLinesApi_H_
#define TINY_CPP_CLIENT_OrderLinesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "OrderLine.h"
#include "Order_lines_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OrderLinesApi : public Service {
public:
    OrderLinesApi() = default;

    virtual ~OrderLinesApi() = default;

    /**
    * Get order line.
    *
    * Get a specific existing order line associated with an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param orderLineId Unique identifier of an order line. *Required*
    */
    Response<
                OrderLine
        >
    orderLines_get(
            
            std::string adAccountId
            , 
            
            std::string orderLineId
            
    );
    /**
    * Get order lines.
    *
    * List existing order lines associated with an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Order_lines_list_200_response
        >
    orderLines_list(
            
            std::string adAccountId
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OrderLinesApi_H_ */