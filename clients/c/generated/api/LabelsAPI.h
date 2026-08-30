#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/label_create_request.h"
#include "../model/label_update_request.h"
#include "../model/labeled_entities.h"
#include "../model/labeled_entities_create.h"
#include "../model/labels_list_200_response.h"
#include "../model/labels_response.h"
#include "../model/pinterest_lib_error.h"
#include "../model/query_label_entity_statuses_items.h"
#include "../model/query_label_types_items.h"

// Enum ENTITYSTATUSES for LabelsAPI_labelsList
typedef enum  { pinterest_rest_api_labelsList_ENTITYSTATUSES_NULL = 0, pinterest_rest_api_labelsList_ENTITYSTATUSES_ACTIVE, pinterest_rest_api_labelsList_ENTITYSTATUSES_ARCHIVED } pinterest_rest_api_labelsList_entity_statuses_e;

// Enum LABELTYPES for LabelsAPI_labelsList
typedef enum  { pinterest_rest_api_labelsList_LABELTYPES_NULL = 0, pinterest_rest_api_labelsList_LABELTYPES_BRAND, pinterest_rest_api_labelsList_LABELTYPES_CUSTOM } pinterest_rest_api_labelsList_label_types_e;


// Apply label to entity
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
//
labeled_entities_t*
LabelsAPI_labelsApply(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create);


// Create labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
//
labels_response_t*
LabelsAPI_labelsCreate(apiClient_t *apiClient, char *ad_account_id, label_create_request_t *label_create_request);


// List labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
//
labels_list_200_response_t*
LabelsAPI_labelsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *label_ids, list_t *entity_statuses, list_t *label_types, char *bookmark, int *page_size);


// Remove label from entities
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
//
labeled_entities_t*
LabelsAPI_labelsRemove(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create);


// Update labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
//
labels_response_t*
LabelsAPI_labelsUpdate(apiClient_t *apiClient, char *ad_account_id, label_update_request_t *label_update_request);


