#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/leads_export_response_data.h"
#include "../model/leads_exports.h"
#include "../model/leads_exports_create.h"
#include "../model/pinterest_lib_error.h"


// Create a request to export leads collected from a lead ad
//
// **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create an export of leads collected from a lead ad. This returns a `leads_export_id` token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
leads_exports_t*
LeadsExportAPI_leadsExportCreate(apiClient_t *apiClient, char *ad_account_id, leads_exports_create_t *leads_exports_create);


// Get the lead export from the lead export create call
//
// **This feature is currently in beta and not available to all apps. If you're interested in joining the beta, please reach out to your Pinterest account manager.**  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).
//
leads_export_response_data_t*
LeadsExportAPI_leadsExportGet(apiClient_t *apiClient, char *ad_account_id, char *leads_export_id);


