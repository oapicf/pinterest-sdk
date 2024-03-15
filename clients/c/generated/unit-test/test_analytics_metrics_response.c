#ifndef analytics_metrics_response_TEST
#define analytics_metrics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define analytics_metrics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/analytics_metrics_response.h"
analytics_metrics_response_t* instantiate_analytics_metrics_response(int include_optional);



analytics_metrics_response_t* instantiate_analytics_metrics_response(int include_optional) {
  analytics_metrics_response_t* analytics_metrics_response = NULL;
  if (include_optional) {
    analytics_metrics_response = analytics_metrics_response_create(
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"PROFILE_VISIT":0,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
      list_createList()
    );
  } else {
    analytics_metrics_response = analytics_metrics_response_create(
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"PROFILE_VISIT":0,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
      list_createList()
    );
  }

  return analytics_metrics_response;
}


#ifdef analytics_metrics_response_MAIN

void test_analytics_metrics_response(int include_optional) {
    analytics_metrics_response_t* analytics_metrics_response_1 = instantiate_analytics_metrics_response(include_optional);

	cJSON* jsonanalytics_metrics_response_1 = analytics_metrics_response_convertToJSON(analytics_metrics_response_1);
	printf("analytics_metrics_response :\n%s\n", cJSON_Print(jsonanalytics_metrics_response_1));
	analytics_metrics_response_t* analytics_metrics_response_2 = analytics_metrics_response_parseFromJSON(jsonanalytics_metrics_response_1);
	cJSON* jsonanalytics_metrics_response_2 = analytics_metrics_response_convertToJSON(analytics_metrics_response_2);
	printf("repeating analytics_metrics_response:\n%s\n", cJSON_Print(jsonanalytics_metrics_response_2));
}

int main() {
  test_analytics_metrics_response(1);
  test_analytics_metrics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // analytics_metrics_response_MAIN
#endif // analytics_metrics_response_TEST
