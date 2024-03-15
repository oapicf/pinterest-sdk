#ifndef integration_request_patch_TEST
#define integration_request_patch_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_request_patch_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_request_patch.h"
integration_request_patch_t* instantiate_integration_request_patch(int include_optional);



integration_request_patch_t* instantiate_integration_request_patch(int include_optional) {
  integration_request_patch_t* integration_request_patch = NULL;
  if (include_optional) {
    integration_request_patch = integration_request_patch_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      "0",
      "0",
      "0"
    );
  } else {
    integration_request_patch = integration_request_patch_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      1.337,
      1.337,
      "0",
      "0",
      "0"
    );
  }

  return integration_request_patch;
}


#ifdef integration_request_patch_MAIN

void test_integration_request_patch(int include_optional) {
    integration_request_patch_t* integration_request_patch_1 = instantiate_integration_request_patch(include_optional);

	cJSON* jsonintegration_request_patch_1 = integration_request_patch_convertToJSON(integration_request_patch_1);
	printf("integration_request_patch :\n%s\n", cJSON_Print(jsonintegration_request_patch_1));
	integration_request_patch_t* integration_request_patch_2 = integration_request_patch_parseFromJSON(jsonintegration_request_patch_1);
	cJSON* jsonintegration_request_patch_2 = integration_request_patch_convertToJSON(integration_request_patch_2);
	printf("repeating integration_request_patch:\n%s\n", cJSON_Print(jsonintegration_request_patch_2));
}

int main() {
  test_integration_request_patch(1);
  test_integration_request_patch(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_request_patch_MAIN
#endif // integration_request_patch_TEST
