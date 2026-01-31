#ifndef conversion_msot_events_TEST
#define conversion_msot_events_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_msot_events_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_msot_events.h"
conversion_msot_events_t* instantiate_conversion_msot_events(int include_optional);

#include "test_currency.c"


conversion_msot_events_t* instantiate_conversion_msot_events(int include_optional) {
  conversion_msot_events_t* conversion_msot_events = NULL;
  if (include_optional) {
    conversion_msot_events = conversion_msot_events_create(
      [1451410040],
      "2680060704746",
      pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_"multi_touch",
      pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_"click",
      0.5,
      "626736533506",
      null,
      "eventId0001",
      pinterest_rest_api_conversion_msot_events_EVENTNAME_"add_to_cart",
      1451431341,
      2,
      2,
      123.45
    );
  } else {
    conversion_msot_events = conversion_msot_events_create(
      [1451410040],
      "2680060704746",
      pinterest_rest_api_conversion_msot_events_ATTRIBUTIONMODEL_"multi_touch",
      pinterest_rest_api_conversion_msot_events_ATTRIBUTIONSCOPE_"click",
      0.5,
      "626736533506",
      null,
      "eventId0001",
      pinterest_rest_api_conversion_msot_events_EVENTNAME_"add_to_cart",
      1451431341,
      2,
      2,
      123.45
    );
  }

  return conversion_msot_events;
}


#ifdef conversion_msot_events_MAIN

void test_conversion_msot_events(int include_optional) {
    conversion_msot_events_t* conversion_msot_events_1 = instantiate_conversion_msot_events(include_optional);

	cJSON* jsonconversion_msot_events_1 = conversion_msot_events_convertToJSON(conversion_msot_events_1);
	printf("conversion_msot_events :\n%s\n", cJSON_Print(jsonconversion_msot_events_1));
	conversion_msot_events_t* conversion_msot_events_2 = conversion_msot_events_parseFromJSON(jsonconversion_msot_events_1);
	cJSON* jsonconversion_msot_events_2 = conversion_msot_events_convertToJSON(conversion_msot_events_2);
	printf("repeating conversion_msot_events:\n%s\n", cJSON_Print(jsonconversion_msot_events_2));
}

int main() {
  test_conversion_msot_events(1);
  test_conversion_msot_events(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_msot_events_MAIN
#endif // conversion_msot_events_TEST
