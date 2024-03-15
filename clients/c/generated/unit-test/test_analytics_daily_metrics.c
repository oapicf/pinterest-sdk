#ifndef analytics_daily_metrics_TEST
#define analytics_daily_metrics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define analytics_daily_metrics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/analytics_daily_metrics.h"
analytics_daily_metrics_t* instantiate_analytics_daily_metrics(int include_optional);



analytics_daily_metrics_t* instantiate_analytics_daily_metrics(int include_optional) {
  analytics_daily_metrics_t* analytics_daily_metrics = NULL;
  if (include_optional) {
    analytics_daily_metrics = analytics_daily_metrics_create(
      pinterest_rest_api_analytics_daily_metrics__"READY",
      "2019-12-01",
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  } else {
    analytics_daily_metrics = analytics_daily_metrics_create(
      pinterest_rest_api_analytics_daily_metrics__"READY",
      "2019-12-01",
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  }

  return analytics_daily_metrics;
}


#ifdef analytics_daily_metrics_MAIN

void test_analytics_daily_metrics(int include_optional) {
    analytics_daily_metrics_t* analytics_daily_metrics_1 = instantiate_analytics_daily_metrics(include_optional);

	cJSON* jsonanalytics_daily_metrics_1 = analytics_daily_metrics_convertToJSON(analytics_daily_metrics_1);
	printf("analytics_daily_metrics :\n%s\n", cJSON_Print(jsonanalytics_daily_metrics_1));
	analytics_daily_metrics_t* analytics_daily_metrics_2 = analytics_daily_metrics_parseFromJSON(jsonanalytics_daily_metrics_1);
	cJSON* jsonanalytics_daily_metrics_2 = analytics_daily_metrics_convertToJSON(analytics_daily_metrics_2);
	printf("repeating analytics_daily_metrics:\n%s\n", cJSON_Print(jsonanalytics_daily_metrics_2));
}

int main() {
  test_analytics_daily_metrics(1);
  test_analytics_daily_metrics(0);

  printf("Hello world \n");
  return 0;
}

#endif // analytics_daily_metrics_MAIN
#endif // analytics_daily_metrics_TEST
