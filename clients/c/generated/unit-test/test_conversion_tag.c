#ifndef conversion_tag_TEST
#define conversion_tag_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag.h"
conversion_tag_t* instantiate_conversion_tag(int include_optional);

#include "test_conversion_tag_configs.c"


conversion_tag_t* instantiate_conversion_tag(int include_optional) {
  conversion_tag_t* conversion_tag = NULL;
  if (include_optional) {
    conversion_tag = conversion_tag_create(
      "<script type=text/javascript> [...]",
       // false, not to have infinite recursion
      instantiate_conversion_tag_configs(0),
      UNKNOWN,
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      "3",
      "549755885175",
      "ACTIVE"
    );
  } else {
    conversion_tag = conversion_tag_create(
      "<script type=text/javascript> [...]",
      NULL,
      UNKNOWN,
      "2617998078212",
      1599030000000,
      "ACME Checkout Test Tag",
      "3",
      "549755885175",
      "ACTIVE"
    );
  }

  return conversion_tag;
}


#ifdef conversion_tag_MAIN

void test_conversion_tag(int include_optional) {
    conversion_tag_t* conversion_tag_1 = instantiate_conversion_tag(include_optional);

	cJSON* jsonconversion_tag_1 = conversion_tag_convertToJSON(conversion_tag_1);
	printf("conversion_tag :\n%s\n", cJSON_Print(jsonconversion_tag_1));
	conversion_tag_t* conversion_tag_2 = conversion_tag_parseFromJSON(jsonconversion_tag_1);
	cJSON* jsonconversion_tag_2 = conversion_tag_convertToJSON(conversion_tag_2);
	printf("repeating conversion_tag:\n%s\n", cJSON_Print(jsonconversion_tag_2));
}

int main() {
  test_conversion_tag(1);
  test_conversion_tag(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_MAIN
#endif // conversion_tag_TEST
