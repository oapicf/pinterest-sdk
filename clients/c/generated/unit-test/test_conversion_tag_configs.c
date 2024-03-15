#ifndef conversion_tag_configs_TEST
#define conversion_tag_configs_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_tag_configs_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_tag_configs.h"
conversion_tag_configs_t* instantiate_conversion_tag_configs(int include_optional);



conversion_tag_configs_t* instantiate_conversion_tag_configs(int include_optional) {
  conversion_tag_configs_t* conversion_tag_configs = NULL;
  if (include_optional) {
    conversion_tag_configs = conversion_tag_configs_create(
      true,
      0.6,
      true,
      true,
      true,
      true,
      true
    );
  } else {
    conversion_tag_configs = conversion_tag_configs_create(
      true,
      0.6,
      true,
      true,
      true,
      true,
      true
    );
  }

  return conversion_tag_configs;
}


#ifdef conversion_tag_configs_MAIN

void test_conversion_tag_configs(int include_optional) {
    conversion_tag_configs_t* conversion_tag_configs_1 = instantiate_conversion_tag_configs(include_optional);

	cJSON* jsonconversion_tag_configs_1 = conversion_tag_configs_convertToJSON(conversion_tag_configs_1);
	printf("conversion_tag_configs :\n%s\n", cJSON_Print(jsonconversion_tag_configs_1));
	conversion_tag_configs_t* conversion_tag_configs_2 = conversion_tag_configs_parseFromJSON(jsonconversion_tag_configs_1);
	cJSON* jsonconversion_tag_configs_2 = conversion_tag_configs_convertToJSON(conversion_tag_configs_2);
	printf("repeating conversion_tag_configs:\n%s\n", cJSON_Print(jsonconversion_tag_configs_2));
}

int main() {
  test_conversion_tag_configs(1);
  test_conversion_tag_configs(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_tag_configs_MAIN
#endif // conversion_tag_configs_TEST
