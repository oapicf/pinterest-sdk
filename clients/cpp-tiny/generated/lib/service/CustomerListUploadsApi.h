#ifndef TINY_CPP_CLIENT_CustomerListUploadsApi_H_
#define TINY_CPP_CLIENT_CustomerListUploadsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CustomerListUploadCreateRequest.h"
#include "CustomerListUploadCreateResponse.h"
#include "CustomerListUploadResponse.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CustomerListUploadsApi : public Service {
public:
    CustomerListUploadsApi() = default;

    virtual ~CustomerListUploadsApi() = default;

    /**
    * Create customer list upload.
    *
    * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListId Unique identifier of a customer list *Required*
    * \param customerListUploadCreateRequest Parameters to create a customer list upload request *Required*
    */
    Response<
                CustomerListUploadCreateResponse
        >
    customerListUploads_create(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            CustomerListUploadCreateRequest customerListUploadCreateRequest
            
    );
    /**
    * Get customer list upload.
    *
    * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListId Unique identifier of a customer list *Required*
    * \param customerListUploadId Unique identifier of a customer list upload *Required*
    */
    Response<
                CustomerListUploadResponse
        >
    customerListUploads_get(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            std::string customerListUploadId
            
    );
    /**
    * Run customer list upload.
    *
    * <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param customerListId Unique identifier of a customer list *Required*
    * \param customerListUploadId Unique identifier of a customer list upload *Required*
    */
    Response<
                CustomerListUploadResponse
        >
    customerListUploads_run(
            
            std::string adAccountId
            , 
            
            std::string customerListId
            , 
            
            std::string customerListUploadId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CustomerListUploadsApi_H_ */