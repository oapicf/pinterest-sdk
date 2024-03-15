#ifndef conversion_events_data_inner_custom_data_contents_inner_TEST
#define conversion_events_data_inner_custom_data_contents_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_data_inner_custom_data_contents_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events_data_inner_custom_data_contents_inner.h"
conversion_events_data_inner_custom_data_contents_inner_t* instantiate_conversion_events_data_inner_custom_data_contents_inner(int include_optional);



conversion_events_data_inner_custom_data_contents_inner_t* instantiate_conversion_events_data_inner_custom_data_contents_inner(int include_optional) {
  conversion_events_data_inner_custom_data_contents_inner_t* conversion_events_data_inner_custom_data_contents_inner = NULL;
  if (include_optional) {
    conversion_events_data_inner_custom_data_contents_inner = conversion_events_data_inner_custom_data_contents_inner_create(
      "red-pinterest-shirt-logo-1",
      "1325.12",
      5,
      "pinterest-clothing-shirt",
      "pinterest-entertainment",
      "pinterest"
    );
  } else {
    conversion_events_data_inner_custom_data_contents_inner = conversion_events_data_inner_custom_data_contents_inner_create(
      "red-pinterest-shirt-logo-1",
      "1325.12",
      5,
      "pinterest-clothing-shirt",
      "pinterest-entertainment",
      "pinterest"
    );
  }

  return conversion_events_data_inner_custom_data_contents_inner;
}


#ifdef conversion_events_data_inner_custom_data_contents_inner_MAIN

void test_conversion_events_data_inner_custom_data_contents_inner(int include_optional) {
    conversion_events_data_inner_custom_data_contents_inner_t* conversion_events_data_inner_custom_data_contents_inner_1 = instantiate_conversion_events_data_inner_custom_data_contents_inner(include_optional);

	cJSON* jsonconversion_events_data_inner_custom_data_contents_inner_1 = conversion_events_data_inner_custom_data_contents_inner_convertToJSON(conversion_events_data_inner_custom_data_contents_inner_1);
	printf("conversion_events_data_inner_custom_data_contents_inner :\n%s\n", cJSON_Print(jsonconversion_events_data_inner_custom_data_contents_inner_1));
	conversion_events_data_inner_custom_data_contents_inner_t* conversion_events_data_inner_custom_data_contents_inner_2 = conversion_events_data_inner_custom_data_contents_inner_parseFromJSON(jsonconversion_events_data_inner_custom_data_contents_inner_1);
	cJSON* jsonconversion_events_data_inner_custom_data_contents_inner_2 = conversion_events_data_inner_custom_data_contents_inner_convertToJSON(conversion_events_data_inner_custom_data_contents_inner_2);
	printf("repeating conversion_events_data_inner_custom_data_contents_inner:\n%s\n", cJSON_Print(jsonconversion_events_data_inner_custom_data_contents_inner_2));
}

int main() {
  test_conversion_events_data_inner_custom_data_contents_inner(1);
  test_conversion_events_data_inner_custom_data_contents_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_data_inner_custom_data_contents_inner_MAIN
#endif // conversion_events_data_inner_custom_data_contents_inner_TEST
