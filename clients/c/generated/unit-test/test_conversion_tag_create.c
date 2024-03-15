#ifndef conversion_tag_create_TEST
#define conversion_tag_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag_create.h"
conversion_tag_create_t* instantiate_conversion_tag_create(int include_optional);



conversion_tag_create_t* instantiate_conversion_tag_create(int include_optional) {
  conversion_tag_create_t* conversion_tag_create = NULL;
  if (include_optional) {
    conversion_tag_create = conversion_tag_create_create(
      "ACME Tools Tag",
      true,
      0.6,
      true,
      true,
      true,
      true,
      true
    );
  } else {
    conversion_tag_create = conversion_tag_create_create(
      "ACME Tools Tag",
      true,
      0.6,
      true,
      true,
      true,
      true,
      true
    );
  }

  return conversion_tag_create;
}


#ifdef conversion_tag_create_MAIN

void test_conversion_tag_create(int include_optional) {
    conversion_tag_create_t* conversion_tag_create_1 = instantiate_conversion_tag_create(include_optional);

	cJSON* jsonconversion_tag_create_1 = conversion_tag_create_convertToJSON(conversion_tag_create_1);
	printf("conversion_tag_create :\n%s\n", cJSON_Print(jsonconversion_tag_create_1));
	conversion_tag_create_t* conversion_tag_create_2 = conversion_tag_create_parseFromJSON(jsonconversion_tag_create_1);
	cJSON* jsonconversion_tag_create_2 = conversion_tag_create_convertToJSON(conversion_tag_create_2);
	printf("repeating conversion_tag_create:\n%s\n", cJSON_Print(jsonconversion_tag_create_2));
}

int main() {
  test_conversion_tag_create(1);
  test_conversion_tag_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_create_MAIN
#endif // conversion_tag_create_TEST
