#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/catalogs_create_report_response.h"
#include "../model/catalogs_report.h"
#include "../model/catalogs_report_parameters.h"
#include "../model/catalogs_report_stats_parameters.h"
#include "../model/pinterest_lib_error.h"
#include "../model/reports_stats_200_response.h"


// Build catalogs report
//
// Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: The All Items report is limited to 25 million items per catalog.
//
catalogs_create_report_response_t*
CatalogReportsAPI_reportsCreate(apiClient_t *apiClient, catalogs_report_parameters_t *catalogs_report_parameters, char *ad_account_id);


// Get catalogs report
//
// This returns a URL to a report given a token returned from [Build catalogs report](/docs/api/v5/#operation/reports/create). You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
//
catalogs_report_t*
CatalogReportsAPI_reportsGet(apiClient_t *apiClient, char *token, char *ad_account_id);


// List report stats
//
// List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
//
reports_stats_200_response_t*
CatalogReportsAPI_reportsStats(apiClient_t *apiClient, catalogs_report_stats_parameters_t *parameters, char *ad_account_id, char *bookmark, int *page_size);


