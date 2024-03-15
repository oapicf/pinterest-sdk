#ifndef integration_metadata_TEST
#define integration_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_metadata.h"
integration_metadata_t* instantiate_integration_metadata(int include_optional);



integration_metadata_t* instantiate_integration_metadata(int include_optional) {
  integration_metadata_t* integration_metadata = NULL;
  if (include_optional) {
    integration_metadata = integration_metadata_create(
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      "0",
      1.337,
      1.337,
      "0",
      "0"
    );
  } else {
    integration_metadata = integration_metadata_create(
      "a",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      "0",
      1.337,
      1.337,
      "0",
      "0"
    );
  }

  return integration_metadata;
}


#ifdef integration_metadata_MAIN

void test_integration_metadata(int include_optional) {
    integration_metadata_t* integration_metadata_1 = instantiate_integration_metadata(include_optional);

	cJSON* jsonintegration_metadata_1 = integration_metadata_convertToJSON(integration_metadata_1);
	printf("integration_metadata :\n%s\n", cJSON_Print(jsonintegration_metadata_1));
	integration_metadata_t* integration_metadata_2 = integration_metadata_parseFromJSON(jsonintegration_metadata_1);
	cJSON* jsonintegration_metadata_2 = integration_metadata_convertToJSON(integration_metadata_2);
	printf("repeating integration_metadata:\n%s\n", cJSON_Print(jsonintegration_metadata_2));
}

int main() {
  test_integration_metadata(1);
  test_integration_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_metadata_MAIN
#endif // integration_metadata_TEST
