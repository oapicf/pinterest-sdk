#ifndef audience_insights_response_TEST
#define audience_insights_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audience_insights_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audience_insights_response.h"
audience_insights_response_t* instantiate_audience_insights_response(int include_optional);

#include "test_audience_demographics.c"


audience_insights_response_t* instantiate_audience_insights_response(int include_optional) {
  audience_insights_response_t* audience_insights_response = NULL;
  if (include_optional) {
    audience_insights_response = audience_insights_response_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_audience_demographics(0),
      pinterest_rest_api_audience_insights_response__"YOUR_TOTAL_AUDIENCE",
      "2022-10-09",
      10000,
      true
    );
  } else {
    audience_insights_response = audience_insights_response_create(
      list_createList(),
      NULL,
      pinterest_rest_api_audience_insights_response__"YOUR_TOTAL_AUDIENCE",
      "2022-10-09",
      10000,
      true
    );
  }

  return audience_insights_response;
}


#ifdef audience_insights_response_MAIN

void test_audience_insights_response(int include_optional) {
    audience_insights_response_t* audience_insights_response_1 = instantiate_audience_insights_response(include_optional);

	cJSON* jsonaudience_insights_response_1 = audience_insights_response_convertToJSON(audience_insights_response_1);
	printf("audience_insights_response :\n%s\n", cJSON_Print(jsonaudience_insights_response_1));
	audience_insights_response_t* audience_insights_response_2 = audience_insights_response_parseFromJSON(jsonaudience_insights_response_1);
	cJSON* jsonaudience_insights_response_2 = audience_insights_response_convertToJSON(audience_insights_response_2);
	printf("repeating audience_insights_response:\n%s\n", cJSON_Print(jsonaudience_insights_response_2));
}

int main() {
  test_audience_insights_response(1);
  test_audience_insights_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // audience_insights_response_MAIN
#endif // audience_insights_response_TEST
