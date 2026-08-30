#ifndef TINY_CPP_CLIENT_ProductTagsApi_H_
#define TINY_CPP_CLIENT_ProductTagsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Pinterest.Lib.Error.h"
#include "ProductTagsBulkAddRequest.h"
#include "ProductTagsBulkDeleteRequest.h"
#include "ProductTagsError.h"
#include "ProductTagsResponse.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ProductTagsApi : public Service {
public:
    ProductTagsApi() = default;

    virtual ~ProductTagsApi();

    /**
    * Add product tags to pin.
    *
    * Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
    * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
    * \param productTagsBulkAddRequest  *Required*
    */
    Response<
                ProductTagsResponse
        >
    productTags_bulkAdd(
            
            std::string pinId
            , 
            
            ProductTagsBulkAddRequest productTagsBulkAddRequest
            
    );
    /**
    * Delete product tags from pin.
    *
    * Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
    * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
    * \param productTagsBulkDeleteRequest  *Required*
    */
    Response<
            String
        >
    productTags_bulkDelete(
            
            std::string pinId
            , 
            
            ProductTagsBulkDeleteRequest productTagsBulkDeleteRequest
            
    );
    /**
    * Get product tags for pin.
    *
    * Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
    * \param pinId Unique identifier of the hero pin that will receive product tags. *Required*
    */
    Response<
                ProductTagsResponse
        >
    productTags_list(
            
            std::string pinId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ProductTagsApi_H_ */