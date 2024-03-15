#ifndef conversion_tag_response_TEST
#define conversion_tag_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag_response.h"
conversion_tag_response_t* instantiate_conversion_tag_response(int include_optional);

#include "test_conversion_tag_configs.c"


conversion_tag_response_t* instantiate_conversion_tag_response(int include_optional) {
  conversion_tag_response_t* conversion_tag_response = NULL;
  if (include_optional) {
    conversion_tag_response = conversion_tag_response_create(
      "549755885175",
      "<script type=text/javascript> [...]",
      pinterest_rest_api_conversion_tag_response__"VALIDATION_COMPLETE",
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      pinterest_rest_api_conversion_tag_response__"ACTIVE",
      "3",
       // false, not to have infinite recursion
      instantiate_conversion_tag_configs(0)
    );
  } else {
    conversion_tag_response = conversion_tag_response_create(
      "549755885175",
      "<script type=text/javascript> [...]",
      pinterest_rest_api_conversion_tag_response__"VALIDATION_COMPLETE",
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      pinterest_rest_api_conversion_tag_response__"ACTIVE",
      "3",
      NULL
    );
  }

  return conversion_tag_response;
}


#ifdef conversion_tag_response_MAIN

void test_conversion_tag_response(int include_optional) {
    conversion_tag_response_t* conversion_tag_response_1 = instantiate_conversion_tag_response(include_optional);

	cJSON* jsonconversion_tag_response_1 = conversion_tag_response_convertToJSON(conversion_tag_response_1);
	printf("conversion_tag_response :\n%s\n", cJSON_Print(jsonconversion_tag_response_1));
	conversion_tag_response_t* conversion_tag_response_2 = conversion_tag_response_parseFromJSON(jsonconversion_tag_response_1);
	cJSON* jsonconversion_tag_response_2 = conversion_tag_response_convertToJSON(conversion_tag_response_2);
	printf("repeating conversion_tag_response:\n%s\n", cJSON_Print(jsonconversion_tag_response_2));
}

int main() {
  test_conversion_tag_response(1);
  test_conversion_tag_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_response_MAIN
#endif // conversion_tag_response_TEST
