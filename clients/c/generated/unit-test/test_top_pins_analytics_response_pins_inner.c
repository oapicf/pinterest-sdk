#ifndef top_pins_analytics_response_pins_inner_TEST
#define top_pins_analytics_response_pins_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define top_pins_analytics_response_pins_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/top_pins_analytics_response_pins_inner.h"
top_pins_analytics_response_pins_inner_t* instantiate_top_pins_analytics_response_pins_inner(int include_optional);



top_pins_analytics_response_pins_inner_t* instantiate_top_pins_analytics_response_pins_inner(int include_optional) {
  top_pins_analytics_response_pins_inner_t* top_pins_analytics_response_pins_inner = NULL;
  if (include_optional) {
    top_pins_analytics_response_pins_inner = top_pins_analytics_response_pins_inner_create(
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
      list_createList(),
      "642396334344813594"
    );
  } else {
    top_pins_analytics_response_pins_inner = top_pins_analytics_response_pins_inner_create(
      {"CLOSEUP":1,"CLOSEUP_RATE":0,"ENGAGEMENT":1,"ENGAGEMENT_RATE":0,"IMPRESSION":240,"OUTBOUND_CLICK":20,"OUTBOUND_CLICK_RATE":0.08,"PIN_CLICK":37,"PIN_CLICK_RATE":0.15,"QUARTILE_95_PERCENT_VIEW":8,"SAVE":20,"SAVE_RATE":0.18,"VIDEO_10S_VIEW":2,"VIDEO_AVG_WATCH_TIME":2507.75,"VIDEO_MRC_VIEW":20,"VIDEO_START":29,"VIDEO_V50_WATCH_TIME":10031},
      list_createList(),
      "642396334344813594"
    );
  }

  return top_pins_analytics_response_pins_inner;
}


#ifdef top_pins_analytics_response_pins_inner_MAIN

void test_top_pins_analytics_response_pins_inner(int include_optional) {
    top_pins_analytics_response_pins_inner_t* top_pins_analytics_response_pins_inner_1 = instantiate_top_pins_analytics_response_pins_inner(include_optional);

	cJSON* jsontop_pins_analytics_response_pins_inner_1 = top_pins_analytics_response_pins_inner_convertToJSON(top_pins_analytics_response_pins_inner_1);
	printf("top_pins_analytics_response_pins_inner :\n%s\n", cJSON_Print(jsontop_pins_analytics_response_pins_inner_1));
	top_pins_analytics_response_pins_inner_t* top_pins_analytics_response_pins_inner_2 = top_pins_analytics_response_pins_inner_parseFromJSON(jsontop_pins_analytics_response_pins_inner_1);
	cJSON* jsontop_pins_analytics_response_pins_inner_2 = top_pins_analytics_response_pins_inner_convertToJSON(top_pins_analytics_response_pins_inner_2);
	printf("repeating top_pins_analytics_response_pins_inner:\n%s\n", cJSON_Print(jsontop_pins_analytics_response_pins_inner_2));
}

int main() {
  test_top_pins_analytics_response_pins_inner(1);
  test_top_pins_analytics_response_pins_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // top_pins_analytics_response_pins_inner_MAIN
#endif // top_pins_analytics_response_pins_inner_TEST
