#ifndef TINY_CPP_CLIENT_IntegrationsApi_H_
#define TINY_CPP_CLIENT_IntegrationsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "IntegrationLogsInvalidLogResponse.h"
#include "IntegrationLogsRequestCreate.h"
#include "IntegrationLogsSuccessResponse.h"
#include "IntegrationMetadata.h"
#include "IntegrationMetadataCreate.h"
#include "IntegrationMetadataUpdate.h"
#include "IntegrationRecord.h"
#include "Integrations_get_list_200_response.h"
#include "Pinterest.Lib.Error.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class IntegrationsApi : public Service {
public:
    IntegrationsApi() = default;

    virtual ~IntegrationsApi();

    /**
    * Delete commerce integration.
    *
    * Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param externalBusinessId External business ID for the integration. *Required*
    */
    Response<
                IntegrationMetadata
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
    * \param integrationMetadataUpdate  *Required*
    */
    Response<
                IntegrationMetadata
        >
    integrationsCommerce_patch(
            
            std::string externalBusinessId
            , 
            
            IntegrationMetadataUpdate integrationMetadataUpdate
            
    );
    /**
    * Create commerce integration.
    *
    * Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param integrationMetadataCreate  *Required*
    */
    Response<
                IntegrationMetadata
        >
    integrationsCommerce_post(
            
            IntegrationMetadataCreate integrationMetadataCreate
            
    );
    /**
    * Receives batched logs from integration applications..
    *
    * This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param integrationLogsRequestCreate  *Required*
    */
    Response<
                IntegrationLogsSuccessResponse
        >
    integrationsLogs_post(
            
            IntegrationLogsRequestCreate integrationLogsRequestCreate
            
    );
    /**
    * Get integration metadata.
    *
    * Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
    * \param id Integration record ID. *Required*
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
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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