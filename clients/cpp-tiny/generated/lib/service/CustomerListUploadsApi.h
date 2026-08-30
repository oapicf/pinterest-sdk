#ifndef TINY_CPP_CLIENT_CustomerListUploadsApi_H_
#define TINY_CPP_CLIENT_CustomerListUploadsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "CustomerListUpload.h"
#include "CustomerListUploadCreateRequest.h"
#include "CustomerListUploadCreateResponse.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CustomerListUploadsApi : public Service {
public:
    CustomerListUploadsApi() = default;

    virtual ~CustomerListUploadsApi();

    /**
    * Create customer list upload.
    *
    * Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
    * \param adAccountId  *Required*
    * \param customerListId Customer list ID. *Required*
    * \param customerListUploadCreateRequest  *Required*
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
    * Get the metadata for a given upload by its ID.
    * \param adAccountId  *Required*
    * \param customerListId Customer list ID. *Required*
    * \param customerListUploadId Customer List Upload ID. *Required*
    */
    Response<
                CustomerListUpload
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
    * Begin processing a customer list upload.
    * \param adAccountId  *Required*
    * \param customerListId Customer list ID. *Required*
    * \param customerListUploadId Customer List Upload ID. *Required*
    */
    Response<
                CustomerListUpload
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