#ifndef integration_request_TEST
#define integration_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_request.h"
integration_request_t* instantiate_integration_request(int include_optional);



integration_request_t* instantiate_integration_request(int include_optional) {
  integration_request_t* integration_request = NULL;
  if (include_optional) {
    integration_request = integration_request_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0"
    );
  } else {
    integration_request = integration_request_create(
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      56,
      56,
      "0",
      "0",
      "0"
    );
  }

  return integration_request;
}


#ifdef integration_request_MAIN

void test_integration_request(int include_optional) {
    integration_request_t* integration_request_1 = instantiate_integration_request(include_optional);

	cJSON* jsonintegration_request_1 = integration_request_convertToJSON(integration_request_1);
	printf("integration_request :\n%s\n", cJSON_Print(jsonintegration_request_1));
	integration_request_t* integration_request_2 = integration_request_parseFromJSON(jsonintegration_request_1);
	cJSON* jsonintegration_request_2 = integration_request_convertToJSON(integration_request_2);
	printf("repeating integration_request:\n%s\n", cJSON_Print(jsonintegration_request_2));
}

int main() {
  test_integration_request(1);
  test_integration_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_request_MAIN
#endif // integration_request_TEST
