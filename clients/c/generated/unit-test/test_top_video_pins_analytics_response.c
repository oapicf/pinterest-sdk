#ifndef top_video_pins_analytics_response_TEST
#define top_video_pins_analytics_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define top_video_pins_analytics_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/top_video_pins_analytics_response.h"
top_video_pins_analytics_response_t* instantiate_top_video_pins_analytics_response(int include_optional);

#include "test_top_pins_analytics_response_date_availability.c"


top_video_pins_analytics_response_t* instantiate_top_video_pins_analytics_response(int include_optional) {
  top_video_pins_analytics_response_t* top_video_pins_analytics_response = NULL;
  if (include_optional) {
    top_video_pins_analytics_response = top_video_pins_analytics_response_create(
       // false, not to have infinite recursion
      instantiate_top_pins_analytics_response_date_availability(0),
      list_createList(),
      pinterest_rest_api_top_video_pins_analytics_response_SORTBY_"IMPRESSION"
    );
  } else {
    top_video_pins_analytics_response = top_video_pins_analytics_response_create(
      NULL,
      list_createList(),
      pinterest_rest_api_top_video_pins_analytics_response_SORTBY_"IMPRESSION"
    );
  }

  return top_video_pins_analytics_response;
}


#ifdef top_video_pins_analytics_response_MAIN

void test_top_video_pins_analytics_response(int include_optional) {
    top_video_pins_analytics_response_t* top_video_pins_analytics_response_1 = instantiate_top_video_pins_analytics_response(include_optional);

	cJSON* jsontop_video_pins_analytics_response_1 = top_video_pins_analytics_response_convertToJSON(top_video_pins_analytics_response_1);
	printf("top_video_pins_analytics_response :\n%s\n", cJSON_Print(jsontop_video_pins_analytics_response_1));
	top_video_pins_analytics_response_t* top_video_pins_analytics_response_2 = top_video_pins_analytics_response_parseFromJSON(jsontop_video_pins_analytics_response_1);
	cJSON* jsontop_video_pins_analytics_response_2 = top_video_pins_analytics_response_convertToJSON(top_video_pins_analytics_response_2);
	printf("repeating top_video_pins_analytics_response:\n%s\n", cJSON_Print(jsontop_video_pins_analytics_response_2));
}

int main() {
  test_top_video_pins_analytics_response(1);
  test_top_video_pins_analytics_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // top_video_pins_analytics_response_MAIN
#endif // top_video_pins_analytics_response_TEST
