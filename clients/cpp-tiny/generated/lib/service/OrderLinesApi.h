#ifndef TINY_CPP_CLIENT_OrderLinesApi_H_
#define TINY_CPP_CLIENT_OrderLinesApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "OrderLine.h"
#include "Order_lines_list_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class OrderLinesApi : public Service {
public:
    OrderLinesApi() = default;

    virtual ~OrderLinesApi();

    /**
    * Get order line.
    *
    * Get a specific existing order line associated with an ad account.
    * \param orderLineId Order line ID. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                OrderLine
        >
    orderLines_get(
            
            std::string orderLineId
            , 
            
            std::string adAccountId
            
    );
    /**
    * Get order lines..
    *
    * List existing order lines associated with an ad account.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Order_lines_list_200_response
        >
    orderLines_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_OrderLinesApi_H_ */