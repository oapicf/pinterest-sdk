#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/customer_list_upload.h"
#include "../model/customer_list_upload_create_request.h"
#include "../model/customer_list_upload_create_response.h"
#include "../model/pinterest_lib_error.h"


// Create customer list upload
//
// Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**
//
customer_list_upload_create_response_t*
CustomerListUploadsAPI_customerListUploadsCreate(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, customer_list_upload_create_request_t *customer_list_upload_create_request);


// Get customer list upload
//
// Get the metadata for a given upload by its ID.
//
customer_list_upload_t*
CustomerListUploadsAPI_customerListUploadsGet(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id);


// Run customer list upload
//
// Begin processing a customer list upload.
//
customer_list_upload_t*
CustomerListUploadsAPI_customerListUploadsRun(apiClient_t *apiClient, char *ad_account_id, char *customer_list_id, char *customer_list_upload_id);


