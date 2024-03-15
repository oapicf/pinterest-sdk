#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/bulk_download_request.h"
#include "../model/bulk_download_response.h"
#include "../model/bulk_upsert_request.h"
#include "../model/bulk_upsert_response.h"
#include "../model/bulk_upsert_status_response.h"
#include "../model/error.h"


// Get advertiser entities in bulk
//
// Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.
//
bulk_download_response_t*
BulkAPI_bulkDownloadCreate(apiClient_t *apiClient, char *ad_account_id, bulk_download_request_t *bulk_download_request);


// Download advertiser entities in bulk
//
// Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).
//
bulk_upsert_status_response_t*
BulkAPI_bulkRequestGet(apiClient_t *apiClient, char *ad_account_id, char *bulk_request_id, int *include_details);


// Create/update ad entities in bulk
//
// Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.
//
bulk_upsert_response_t*
BulkAPI_bulkUpsertCreate(apiClient_t *apiClient, char *ad_account_id, bulk_upsert_request_t *bulk_upsert_request);


