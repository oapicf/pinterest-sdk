#ifndef top_video_pins_analytics_response_pins_inner_TEST
#define top_video_pins_analytics_response_pins_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define top_video_pins_analytics_response_pins_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/top_video_pins_analytics_response_pins_inner.h"
top_video_pins_analytics_response_pins_inner_t* instantiate_top_video_pins_analytics_response_pins_inner(int include_optional);



top_video_pins_analytics_response_pins_inner_t* instantiate_top_video_pins_analytics_response_pins_inner(int include_optional) {
  top_video_pins_analytics_response_pins_inner_t* top_video_pins_analytics_response_pins_inner = NULL;
  if (include_optional) {
    top_video_pins_analytics_response_pins_inner = top_video_pins_analytics_response_pins_inner_create(
      {"IMPRESSION":7,"QUARTILE_95_PERCENT_VIEW":2,"SAVE":1,"VIDEO_10S_VIEW":5,"VIDEO_AVG_WATCH_TIME":86989,"VIDEO_MRC_VIEW":2,"VIDEO_START":2,"VIDEO_V50_WATCH_TIME":173979,"OUTBOUND_CLICK":2},
      list_createList(),
      "642396334344813594"
    );
  } else {
    top_video_pins_analytics_response_pins_inner = top_video_pins_analytics_response_pins_inner_create(
      {"IMPRESSION":7,"QUARTILE_95_PERCENT_VIEW":2,"SAVE":1,"VIDEO_10S_VIEW":5,"VIDEO_AVG_WATCH_TIME":86989,"VIDEO_MRC_VIEW":2,"VIDEO_START":2,"VIDEO_V50_WATCH_TIME":173979,"OUTBOUND_CLICK":2},
      list_createList(),
      "642396334344813594"
    );
  }

  return top_video_pins_analytics_response_pins_inner;
}


#ifdef top_video_pins_analytics_response_pins_inner_MAIN

void test_top_video_pins_analytics_response_pins_inner(int include_optional) {
    top_video_pins_analytics_response_pins_inner_t* top_video_pins_analytics_response_pins_inner_1 = instantiate_top_video_pins_analytics_response_pins_inner(include_optional);

	cJSON* jsontop_video_pins_analytics_response_pins_inner_1 = top_video_pins_analytics_response_pins_inner_convertToJSON(top_video_pins_analytics_response_pins_inner_1);
	printf("top_video_pins_analytics_response_pins_inner :\n%s\n", cJSON_Print(jsontop_video_pins_analytics_response_pins_inner_1));
	top_video_pins_analytics_response_pins_inner_t* top_video_pins_analytics_response_pins_inner_2 = top_video_pins_analytics_response_pins_inner_parseFromJSON(jsontop_video_pins_analytics_response_pins_inner_1);
	cJSON* jsontop_video_pins_analytics_response_pins_inner_2 = top_video_pins_analytics_response_pins_inner_convertToJSON(top_video_pins_analytics_response_pins_inner_2);
	printf("repeating top_video_pins_analytics_response_pins_inner:\n%s\n", cJSON_Print(jsontop_video_pins_analytics_response_pins_inner_2));
}

int main() {
  test_top_video_pins_analytics_response_pins_inner(1);
  test_top_video_pins_analytics_response_pins_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // top_video_pins_analytics_response_pins_inner_MAIN
#endif // top_video_pins_analytics_response_pins_inner_TEST
