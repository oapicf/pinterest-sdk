#ifndef conversion_events_data_inner_TEST
#define conversion_events_data_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_data_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events_data_inner.h"
conversion_events_data_inner_t* instantiate_conversion_events_data_inner(int include_optional);

#include "test_conversion_events_user_data.c"
#include "test_conversion_events_data_inner_custom_data.c"


conversion_events_data_inner_t* instantiate_conversion_events_data_inner(int include_optional) {
  conversion_events_data_inner_t* conversion_events_data_inner = NULL;
  if (include_optional) {
    conversion_events_data_inner = conversion_events_data_inner_create(
      "checkout",
      "app_ios",
      1451431341,
      "eventId0001",
      "https://www.my-clothing-shop.org/",
      false,
      "ss-partnername",
       // false, not to have infinite recursion
      instantiate_conversion_events_user_data(0),
       // false, not to have infinite recursion
      instantiate_conversion_events_data_inner_custom_data(0),
      "429047995",
      "Pinterest",
      "7.9",
      "Apple",
      "T-Mobile",
      "iPhone X",
      "iPhone",
      "12.1.4",
      false,
      "en"
    );
  } else {
    conversion_events_data_inner = conversion_events_data_inner_create(
      "checkout",
      "app_ios",
      1451431341,
      "eventId0001",
      "https://www.my-clothing-shop.org/",
      false,
      "ss-partnername",
      NULL,
      NULL,
      "429047995",
      "Pinterest",
      "7.9",
      "Apple",
      "T-Mobile",
      "iPhone X",
      "iPhone",
      "12.1.4",
      false,
      "en"
    );
  }

  return conversion_events_data_inner;
}


#ifdef conversion_events_data_inner_MAIN

void test_conversion_events_data_inner(int include_optional) {
    conversion_events_data_inner_t* conversion_events_data_inner_1 = instantiate_conversion_events_data_inner(include_optional);

	cJSON* jsonconversion_events_data_inner_1 = conversion_events_data_inner_convertToJSON(conversion_events_data_inner_1);
	printf("conversion_events_data_inner :\n%s\n", cJSON_Print(jsonconversion_events_data_inner_1));
	conversion_events_data_inner_t* conversion_events_data_inner_2 = conversion_events_data_inner_parseFromJSON(jsonconversion_events_data_inner_1);
	cJSON* jsonconversion_events_data_inner_2 = conversion_events_data_inner_convertToJSON(conversion_events_data_inner_2);
	printf("repeating conversion_events_data_inner:\n%s\n", cJSON_Print(jsonconversion_events_data_inner_2));
}

int main() {
  test_conversion_events_data_inner(1);
  test_conversion_events_data_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_data_inner_MAIN
#endif // conversion_events_data_inner_TEST
