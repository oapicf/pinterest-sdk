#ifndef pin_analytics_metrics_response_daily_metrics_inner_TEST
#define pin_analytics_metrics_response_daily_metrics_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_analytics_metrics_response_daily_metrics_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_analytics_metrics_response_daily_metrics_inner.h"
pin_analytics_metrics_response_daily_metrics_inner_t* instantiate_pin_analytics_metrics_response_daily_metrics_inner(int include_optional);



pin_analytics_metrics_response_daily_metrics_inner_t* instantiate_pin_analytics_metrics_response_daily_metrics_inner(int include_optional) {
  pin_analytics_metrics_response_daily_metrics_inner_t* pin_analytics_metrics_response_daily_metrics_inner = NULL;
  if (include_optional) {
    pin_analytics_metrics_response_daily_metrics_inner = pin_analytics_metrics_response_daily_metrics_inner_create(
      pinterest_rest_api_pin_analytics_metrics_response_daily_metrics_inner__"READY",
      "2019-12-01",
      {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  } else {
    pin_analytics_metrics_response_daily_metrics_inner = pin_analytics_metrics_response_daily_metrics_inner_create(
      pinterest_rest_api_pin_analytics_metrics_response_daily_metrics_inner__"READY",
      "2019-12-01",
      {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  }

  return pin_analytics_metrics_response_daily_metrics_inner;
}


#ifdef pin_analytics_metrics_response_daily_metrics_inner_MAIN

void test_pin_analytics_metrics_response_daily_metrics_inner(int include_optional) {
    pin_analytics_metrics_response_daily_metrics_inner_t* pin_analytics_metrics_response_daily_metrics_inner_1 = instantiate_pin_analytics_metrics_response_daily_metrics_inner(include_optional);

	cJSON* jsonpin_analytics_metrics_response_daily_metrics_inner_1 = pin_analytics_metrics_response_daily_metrics_inner_convertToJSON(pin_analytics_metrics_response_daily_metrics_inner_1);
	printf("pin_analytics_metrics_response_daily_metrics_inner :\n%s\n", cJSON_Print(jsonpin_analytics_metrics_response_daily_metrics_inner_1));
	pin_analytics_metrics_response_daily_metrics_inner_t* pin_analytics_metrics_response_daily_metrics_inner_2 = pin_analytics_metrics_response_daily_metrics_inner_parseFromJSON(jsonpin_analytics_metrics_response_daily_metrics_inner_1);
	cJSON* jsonpin_analytics_metrics_response_daily_metrics_inner_2 = pin_analytics_metrics_response_daily_metrics_inner_convertToJSON(pin_analytics_metrics_response_daily_metrics_inner_2);
	printf("repeating pin_analytics_metrics_response_daily_metrics_inner:\n%s\n", cJSON_Print(jsonpin_analytics_metrics_response_daily_metrics_inner_2));
}

int main() {
  test_pin_analytics_metrics_response_daily_metrics_inner(1);
  test_pin_analytics_metrics_response_daily_metrics_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_analytics_metrics_response_daily_metrics_inner_MAIN
#endif // pin_analytics_metrics_response_daily_metrics_inner_TEST
