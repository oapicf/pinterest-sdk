#ifndef conversion_tag_type_TEST
#define conversion_tag_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag_type.h"
conversion_tag_type_t* instantiate_conversion_tag_type(int include_optional);



conversion_tag_type_t* instantiate_conversion_tag_type(int include_optional) {
  conversion_tag_type_t* conversion_tag_type = NULL;
  if (include_optional) {
    conversion_tag_type = conversion_tag_type_create(
    );
  } else {
    conversion_tag_type = conversion_tag_type_create(
    );
  }

  return conversion_tag_type;
}


#ifdef conversion_tag_type_MAIN

void test_conversion_tag_type(int include_optional) {
    conversion_tag_type_t* conversion_tag_type_1 = instantiate_conversion_tag_type(include_optional);

	cJSON* jsonconversion_tag_type_1 = conversion_tag_type_convertToJSON(conversion_tag_type_1);
	printf("conversion_tag_type :\n%s\n", cJSON_Print(jsonconversion_tag_type_1));
	conversion_tag_type_t* conversion_tag_type_2 = conversion_tag_type_parseFromJSON(jsonconversion_tag_type_1);
	cJSON* jsonconversion_tag_type_2 = conversion_tag_type_convertToJSON(conversion_tag_type_2);
	printf("repeating conversion_tag_type:\n%s\n", cJSON_Print(jsonconversion_tag_type_2));
}

int main() {
  test_conversion_tag_type(1);
  test_conversion_tag_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_type_MAIN
#endif // conversion_tag_type_TEST
