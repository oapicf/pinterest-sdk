#ifndef conversion_api_response_events_inner_TEST
#define conversion_api_response_events_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_api_response_events_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_api_response_events_inner.h"
conversion_api_response_events_inner_t* instantiate_conversion_api_response_events_inner(int include_optional);



conversion_api_response_events_inner_t* instantiate_conversion_api_response_events_inner(int include_optional) {
  conversion_api_response_events_inner_t* conversion_api_response_events_inner = NULL;
  if (include_optional) {
    conversion_api_response_events_inner = conversion_api_response_events_inner_create(
      pinterest_rest_api_conversion_api_response_events_inner_STATUS_"processed",
      "0",
      "0"
    );
  } else {
    conversion_api_response_events_inner = conversion_api_response_events_inner_create(
      pinterest_rest_api_conversion_api_response_events_inner_STATUS_"processed",
      "0",
      "0"
    );
  }

  return conversion_api_response_events_inner;
}


#ifdef conversion_api_response_events_inner_MAIN

void test_conversion_api_response_events_inner(int include_optional) {
    conversion_api_response_events_inner_t* conversion_api_response_events_inner_1 = instantiate_conversion_api_response_events_inner(include_optional);

	cJSON* jsonconversion_api_response_events_inner_1 = conversion_api_response_events_inner_convertToJSON(conversion_api_response_events_inner_1);
	printf("conversion_api_response_events_inner :\n%s\n", cJSON_Print(jsonconversion_api_response_events_inner_1));
	conversion_api_response_events_inner_t* conversion_api_response_events_inner_2 = conversion_api_response_events_inner_parseFromJSON(jsonconversion_api_response_events_inner_1);
	cJSON* jsonconversion_api_response_events_inner_2 = conversion_api_response_events_inner_convertToJSON(conversion_api_response_events_inner_2);
	printf("repeating conversion_api_response_events_inner:\n%s\n", cJSON_Print(jsonconversion_api_response_events_inner_2));
}

int main() {
  test_conversion_api_response_events_inner(1);
  test_conversion_api_response_events_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_api_response_events_inner_MAIN
#endif // conversion_api_response_events_inner_TEST
