#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/label_create_request.h"
#include "../model/label_update_request.h"
#include "../model/labels_list_200_response.h"
#include "../model/labels_response.h"

// Enum ENTITYSTATUSES for LabelsAPI_labelsList
typedef enum  { pinterest_rest_api_labelsList_ENTITYSTATUSES_NULL = 0, pinterest_rest_api_labelsList_ENTITYSTATUSES_ACTIVE, pinterest_rest_api_labelsList_ENTITYSTATUSES_ARCHIVED } pinterest_rest_api_labelsList_entity_statuses_e;

// Enum LABELTYPES for LabelsAPI_labelsList
typedef enum  { pinterest_rest_api_labelsList_LABELTYPES_NULL = 0, pinterest_rest_api_labelsList_LABELTYPES_BRAND, pinterest_rest_api_labelsList_LABELTYPES_CUSTOM } pinterest_rest_api_labelsList_label_types_e;


// Create labels
//
// <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
//
labels_response_t*
LabelsAPI_labelsCreate(apiClient_t *apiClient, char *ad_account_id, label_create_request_t *label_create_request);


// List labels
//
// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
//
labels_list_200_response_t*
LabelsAPI_labelsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *label_ids, list_t *entity_statuses, list_t *label_types, int *page_size, char *bookmark);


// Update labels
//
// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
//
labels_response_t*
LabelsAPI_labelsUpdate(apiClient_t *apiClient, char *ad_account_id, label_update_request_t *label_update_request);


