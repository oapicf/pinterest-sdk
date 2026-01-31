#ifndef event_quality_score_TEST
#define event_quality_score_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define event_quality_score_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/event_quality_score.h"
event_quality_score_t* instantiate_event_quality_score(int include_optional);

#include "test_quality_components.c"


event_quality_score_t* instantiate_event_quality_score(int include_optional) {
  event_quality_score_t* event_quality_score = NULL;
  if (include_optional) {
    event_quality_score = event_quality_score_create(
      pinterest_rest_api_event_quality_score__TAG,
      pinterest_rest_api_event_quality_score__1d,
      pinterest_rest_api_event_quality_score__NEEDS_IMPROVEMENT,
       // false, not to have infinite recursion
      instantiate_quality_components(0),
      pinterest_rest_api_event_quality_score__WEB
    );
  } else {
    event_quality_score = event_quality_score_create(
      pinterest_rest_api_event_quality_score__TAG,
      pinterest_rest_api_event_quality_score__1d,
      pinterest_rest_api_event_quality_score__NEEDS_IMPROVEMENT,
      NULL,
      pinterest_rest_api_event_quality_score__WEB
    );
  }

  return event_quality_score;
}


#ifdef event_quality_score_MAIN

void test_event_quality_score(int include_optional) {
    event_quality_score_t* event_quality_score_1 = instantiate_event_quality_score(include_optional);

	cJSON* jsonevent_quality_score_1 = event_quality_score_convertToJSON(event_quality_score_1);
	printf("event_quality_score :\n%s\n", cJSON_Print(jsonevent_quality_score_1));
	event_quality_score_t* event_quality_score_2 = event_quality_score_parseFromJSON(jsonevent_quality_score_1);
	cJSON* jsonevent_quality_score_2 = event_quality_score_convertToJSON(event_quality_score_2);
	printf("repeating event_quality_score:\n%s\n", cJSON_Print(jsonevent_quality_score_2));
}

int main() {
  test_event_quality_score(1);
  test_event_quality_score(0);

  printf("Hello world \n");
  return 0;
}

#endif // event_quality_score_MAIN
#endif // event_quality_score_TEST
