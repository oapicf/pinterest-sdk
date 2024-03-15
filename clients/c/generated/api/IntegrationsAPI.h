#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/detailed_error.h"
#include "../model/error.h"
#include "../model/integration_logs_request.h"
#include "../model/integration_logs_success_response.h"
#include "../model/integration_metadata.h"
#include "../model/integration_record.h"
#include "../model/integration_request.h"
#include "../model/integration_request_patch.h"
#include "../model/integrations_get_list_200_response.h"


// Delete commerce integration
//
// Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
void
IntegrationsAPI_integrationsCommerceDel(apiClient_t *apiClient, char *external_business_id);


// Get commerce integration
//
// Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommerceGet(apiClient_t *apiClient, char *external_business_id);


// Update commerce integration
//
// Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommercePatch(apiClient_t *apiClient, char *external_business_id, integration_request_patch_t *integration_request_patch);


// Create commerce integration
//
// Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_metadata_t*
IntegrationsAPI_integrationsCommercePost(apiClient_t *apiClient, integration_request_t *integration_request);


// Get integration metadata
//
// Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_record_t*
IntegrationsAPI_integrationsGetById(apiClient_t *apiClient, char *id);


// Get integration metadata list
//
// Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integrations_get_list_200_response_t*
IntegrationsAPI_integrationsGetList(apiClient_t *apiClient, char *bookmark, int *page_size);


// Receives batched logs from integration applications.
//
// This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.
//
integration_logs_success_response_t*
IntegrationsAPI_integrationsLogsPost(apiClient_t *apiClient, integration_logs_request_t *integration_logs_request);


