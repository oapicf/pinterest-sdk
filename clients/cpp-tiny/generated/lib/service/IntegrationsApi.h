#ifndef TINY_CPP_CLIENT_IntegrationsApi_H_
#define TINY_CPP_CLIENT_IntegrationsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Error.h"
#include "IntegrationLogsRequest.h"
#include "IntegrationLogsSuccessResponse.h"
#include "IntegrationMetadata.h"
#include "IntegrationRecord.h"
#include "IntegrationRequest.h"
#include "IntegrationRequestPatch.h"
#include "Integrations_get_list_200_response.h"
#include "Integrations_logs_post_400_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class IntegrationsApi : public Service {
public:
    IntegrationsApi() = default;

    virtual ~IntegrationsApi() = default;

    /**
    * Delete commerce integration.
    *
    * Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param externalBusinessId External business ID for the integration. *Required*
    */
    Response<
            String
        >
    integrationsCommerce_del(
            
            std::string externalBusinessId
            
    );
    /**
    * Get commerce integration.
    *
    * Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param externalBusinessId External business ID for the integration. *Required*
    */
    Response<
                IntegrationMetadata
        >
    integrationsCommerce_get(
            
            std::string externalBusinessId
            
    );
    /**
    * Update commerce integration.
    *
    * Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param externalBusinessId External business ID for the integration. *Required*
    * \param integrationRequestPatch Parameters to get create/update the Integration Metadata *Required*
    */
    Response<
                IntegrationMetadata
        >
    integrationsCommerce_patch(
            
            std::string externalBusinessId
            , 
            
            IntegrationRequestPatch integrationRequestPatch
            
    );
    /**
    * Create commerce integration.
    *
    * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param integrationRequest Parameters to get create/update the Integration Metadata *Required*
    */
    Response<
                IntegrationMetadata
        >
    integrationsCommerce_post(
            
            IntegrationRequest integrationRequest
            
    );
    /**
    * Receives batched logs from integration applications..
    *
    * This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param integrationLogsRequest Ingest log information from external integration application. *Required*
    */
    Response<
                IntegrationLogsSuccessResponse
        >
    integrationsLogs_post(
            
            IntegrationLogsRequest integrationLogsRequest
            
    );
    /**
    * Get integration metadata.
    *
    * Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param id Integration ID. *Required*
    */
    Response<
                IntegrationRecord
        >
    integrations_getById(
            
            std::string id
            
    );
    /**
    * Get integration metadata list.
    *
    * Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    */
    Response<
                Integrations_get_list_200_response
        >
    integrations_getList(
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_IntegrationsApi_H_ */