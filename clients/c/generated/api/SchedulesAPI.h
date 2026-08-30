#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/pinterest_lib_error.h"
#include "../model/pinterest_lib_pagination_order.h"
#include "../model/schedule.h"
#include "../model/schedule_batch_update.h"
#include "../model/schedule_create.h"
#include "../model/schedule_status.h"
#include "../model/schedule_type.h"
#include "../model/schedules_create_200_response_inner.h"
#include "../model/schedules_list_200_response.h"

// Enum  for SchedulesAPI_schedulesList
typedef enum  { pinterest_rest_api_schedulesList__NULL = 0, pinterest_rest_api_schedulesList__ASCENDING, pinterest_rest_api_schedulesList__DESCENDING } pinterest_rest_api_schedulesList_order_e;

// Enum SCHEDULESTATUSES for SchedulesAPI_schedulesList
typedef enum  { pinterest_rest_api_schedulesList_SCHEDULESTATUSES_NULL = 0, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_DRAFT, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_CREATED, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_SCHEDULED, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_ACTIVE, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_COMPLETED, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_FAILED, pinterest_rest_api_schedulesList_SCHEDULESTATUSES_CANCELED } pinterest_rest_api_schedulesList_schedule_statuses_e;

// Enum  for SchedulesAPI_schedulesList
typedef enum  { pinterest_rest_api_schedulesList__NULL = 0, pinterest_rest_api_schedulesList__CAMPAIGN_BUDGET_CHANGE, pinterest_rest_api_schedulesList__CAMPAIGN_BID_MULTIPLIERS } pinterest_rest_api_schedulesList_schedule_type_e;


// Create schedules
//
// Batch create schedules
//
list_t*
SchedulesAPI_schedulesCreate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_create);


// Get Schedules
//
// Get schedules for a specific advertiser
//
schedules_list_200_response_t*
SchedulesAPI_schedulesList(apiClient_t *apiClient, char *ad_account_id, list_t *entity_ids, char *bookmark, int *page_size, pinterest_lib_pagination_order_e order, list_t *schedule_statuses, schedule_type_e schedule_type);


// Update schedules
//
// Update one or more schedules
//
list_t*
SchedulesAPI_schedulesUpdate(apiClient_t *apiClient, char *ad_account_id, list_t *schedule_batch_update);


