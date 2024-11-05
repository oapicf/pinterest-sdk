#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/error.h"
#include "../model/leads_export_create_request.h"
#include "../model/leads_export_create_response.h"
#include "../model/leads_export_response_data.h"


// Create a request to export leads collected from a lead ad
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
leads_export_create_response_t*
LeadsExportAPI_leadsExportCreate(apiClient_t *apiClient, char *ad_account_id, leads_export_create_request_t *leads_export_create_request);


// Get the lead export from the lead export create call
//
// <strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.
//
leads_export_response_data_t*
LeadsExportAPI_leadsExportGet(apiClient_t *apiClient, char *ad_account_id, char *leads_export_id);


