#ifndef conversion_event_response_TEST
#define conversion_event_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_event_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_event_response.h"
conversion_event_response_t* instantiate_conversion_event_response(int include_optional);



conversion_event_response_t* instantiate_conversion_event_response(int include_optional) {
  conversion_event_response_t* conversion_event_response = NULL;
  if (include_optional) {
    conversion_event_response = conversion_event_response_create(
      pinterest_rest_api_conversion_event_response__"PAGE_LOAD",
      "2614324385652",
      "549757463328",
      1564768710
    );
  } else {
    conversion_event_response = conversion_event_response_create(
      pinterest_rest_api_conversion_event_response__"PAGE_LOAD",
      "2614324385652",
      "549757463328",
      1564768710
    );
  }

  return conversion_event_response;
}


#ifdef conversion_event_response_MAIN

void test_conversion_event_response(int include_optional) {
    conversion_event_response_t* conversion_event_response_1 = instantiate_conversion_event_response(include_optional);

	cJSON* jsonconversion_event_response_1 = conversion_event_response_convertToJSON(conversion_event_response_1);
	printf("conversion_event_response :\n%s\n", cJSON_Print(jsonconversion_event_response_1));
	conversion_event_response_t* conversion_event_response_2 = conversion_event_response_parseFromJSON(jsonconversion_event_response_1);
	cJSON* jsonconversion_event_response_2 = conversion_event_response_convertToJSON(conversion_event_response_2);
	printf("repeating conversion_event_response:\n%s\n", cJSON_Print(jsonconversion_event_response_2));
}

int main() {
  test_conversion_event_response(1);
  test_conversion_event_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_event_response_MAIN
#endif // conversion_event_response_TEST
