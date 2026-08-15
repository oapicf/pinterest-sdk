#ifndef TINY_CPP_CLIENT_BulkApi_H_
#define TINY_CPP_CLIENT_BulkApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "BulkDownloadRequest.h"
#include "BulkDownloadResponse.h"
#include "BulkUpsertRequest.h"
#include "BulkUpsertResponse.h"
#include "BulkUpsertStatusResponse.h"
#include "Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class BulkApi : public Service {
public:
    BulkApi() = default;

    virtual ~BulkApi() = default;

    /**
    * Get advertiser entities in bulk.
    *
    * Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bulkDownloadRequest Parameters to get ad entities in bulk *Required*
    */
    Response<
                BulkDownloadResponse
        >
    bulkDownload_create(
            
            std::string adAccountId
            , 
            
            BulkDownloadRequest bulkDownloadRequest
            
    );
    /**
    * Download advertiser entities in bulk.
    *
    * Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bulkRequestId Unique identifier of a bulk upsert request. *Required*
    * \param includeDetails if set to True then attach the errors/details to all the requests
    */
    Response<
                BulkUpsertStatusResponse
        >
    bulkRequest_get(
            
            std::string adAccountId
            , 
            
            std::string bulkRequestId
            , 
            
            bool includeDetails
            
    );
    /**
    * Create/update ad entities in bulk.
    *
    * Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bulkUpsertRequest Parameters to get create/update ad entities in bulk *Required*
    */
    Response<
                BulkUpsertResponse
        >
    bulkUpsert_create(
            
            std::string adAccountId
            , 
            
            BulkUpsertRequest bulkUpsertRequest
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_BulkApi_H_ */