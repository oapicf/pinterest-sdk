#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/event_quality_score.h"
#include "../model/ingestion_source_options.h"
#include "../model/lookback_period_options.h"
#include "../model/pinterest_lib_error.h"
#include "../model/source_platform_options.h"

// Enum  for ConversionEqsAPI_conversionEqsList
typedef enum  { pinterest_rest_api_conversionEqsList__NULL = 0, pinterest_rest_api_conversionEqsList___1d, pinterest_rest_api_conversionEqsList___14d } pinterest_rest_api_conversionEqsList_lookback_period_e;

// Enum  for ConversionEqsAPI_conversionEqsList
typedef enum  { pinterest_rest_api_conversionEqsList__NULL = 0, pinterest_rest_api_conversionEqsList__WEB, pinterest_rest_api_conversionEqsList__MOBILE, pinterest_rest_api_conversionEqsList__MOBILE_ANDROID, pinterest_rest_api_conversionEqsList__MOBILE_IOS, pinterest_rest_api_conversionEqsList__OFFLINE, pinterest_rest_api_conversionEqsList__PINTEREST_WEB, pinterest_rest_api_conversionEqsList__PINTEREST_ANDROID, pinterest_rest_api_conversionEqsList__PINTEREST_IOS, pinterest_rest_api_conversionEqsList__POINT_OF_SALE } pinterest_rest_api_conversionEqsList_source_platform_e;

// Enum  for ConversionEqsAPI_conversionEqsList
typedef enum  { pinterest_rest_api_conversionEqsList__NULL = 0, pinterest_rest_api_conversionEqsList__TAG, pinterest_rest_api_conversionEqsList__MMP, pinterest_rest_api_conversionEqsList__FILE_UPLOAD, pinterest_rest_api_conversionEqsList__CONVERSIONS_API, pinterest_rest_api_conversionEqsList__NATIVE } pinterest_rest_api_conversionEqsList_ingestion_source_e;


// Get event quality score (EQS)
//
// Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.
//
list_t*
ConversionEqsAPI_conversionEqsList(apiClient_t *apiClient, lookback_period_options_e lookback_period, char *ad_account_id, source_platform_options_e source_platform, ingestion_source_options_e ingestion_source);


