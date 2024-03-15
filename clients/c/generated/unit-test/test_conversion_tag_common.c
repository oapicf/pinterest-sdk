#ifndef conversion_tag_common_TEST
#define conversion_tag_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag_common.h"
conversion_tag_common_t* instantiate_conversion_tag_common(int include_optional);

#include "test_conversion_tag_configs.c"


conversion_tag_common_t* instantiate_conversion_tag_common(int include_optional) {
  conversion_tag_common_t* conversion_tag_common = NULL;
  if (include_optional) {
    conversion_tag_common = conversion_tag_common_create(
      "549755885175",
      "<script type=text/javascript> [...]",
      pinterest_rest_api_conversion_tag_common__"VALIDATION_COMPLETE",
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      pinterest_rest_api_conversion_tag_common__"ACTIVE",
      "3",
       // false, not to have infinite recursion
      instantiate_conversion_tag_configs(0)
    );
  } else {
    conversion_tag_common = conversion_tag_common_create(
      "549755885175",
      "<script type=text/javascript> [...]",
      pinterest_rest_api_conversion_tag_common__"VALIDATION_COMPLETE",
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      pinterest_rest_api_conversion_tag_common__"ACTIVE",
      "3",
      NULL
    );
  }

  return conversion_tag_common;
}


#ifdef conversion_tag_common_MAIN

void test_conversion_tag_common(int include_optional) {
    conversion_tag_common_t* conversion_tag_common_1 = instantiate_conversion_tag_common(include_optional);

	cJSON* jsonconversion_tag_common_1 = conversion_tag_common_convertToJSON(conversion_tag_common_1);
	printf("conversion_tag_common :\n%s\n", cJSON_Print(jsonconversion_tag_common_1));
	conversion_tag_common_t* conversion_tag_common_2 = conversion_tag_common_parseFromJSON(jsonconversion_tag_common_1);
	cJSON* jsonconversion_tag_common_2 = conversion_tag_common_convertToJSON(conversion_tag_common_2);
	printf("repeating conversion_tag_common:\n%s\n", cJSON_Print(jsonconversion_tag_common_2));
}

int main() {
  test_conversion_tag_common(1);
  test_conversion_tag_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_common_MAIN
#endif // conversion_tag_common_TEST
