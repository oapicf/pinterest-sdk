#ifndef pin_analytics_metrics_response_TEST
#define pin_analytics_metrics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pin_analytics_metrics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pin_analytics_metrics_response.h"
pin_analytics_metrics_response_t* instantiate_pin_analytics_metrics_response(int include_optional);



pin_analytics_metrics_response_t* instantiate_pin_analytics_metrics_response(int include_optional) {
  pin_analytics_metrics_response_t* pin_analytics_metrics_response = NULL;
  if (include_optional) {
    pin_analytics_metrics_response = pin_analytics_metrics_response_create(
      {"TOTAL_COMMENTS":10,"TOTAL_REACTIONS":12},
      list_createList(),
      {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  } else {
    pin_analytics_metrics_response = pin_analytics_metrics_response_create(
      {"TOTAL_COMMENTS":10,"TOTAL_REACTIONS":12},
      list_createList(),
      {"IMPRESSION":240,"OUTBOUND_CLICK":20,"PIN_CLICK":37,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031}
    );
  }

  return pin_analytics_metrics_response;
}


#ifdef pin_analytics_metrics_response_MAIN

void test_pin_analytics_metrics_response(int include_optional) {
    pin_analytics_metrics_response_t* pin_analytics_metrics_response_1 = instantiate_pin_analytics_metrics_response(include_optional);

	cJSON* jsonpin_analytics_metrics_response_1 = pin_analytics_metrics_response_convertToJSON(pin_analytics_metrics_response_1);
	printf("pin_analytics_metrics_response :\n%s\n", cJSON_Print(jsonpin_analytics_metrics_response_1));
	pin_analytics_metrics_response_t* pin_analytics_metrics_response_2 = pin_analytics_metrics_response_parseFromJSON(jsonpin_analytics_metrics_response_1);
	cJSON* jsonpin_analytics_metrics_response_2 = pin_analytics_metrics_response_convertToJSON(pin_analytics_metrics_response_2);
	printf("repeating pin_analytics_metrics_response:\n%s\n", cJSON_Print(jsonpin_analytics_metrics_response_2));
}

int main() {
  test_pin_analytics_metrics_response(1);
  test_pin_analytics_metrics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // pin_analytics_metrics_response_MAIN
#endif // pin_analytics_metrics_response_TEST
