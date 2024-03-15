#ifndef integration_logs_success_response_TEST
#define integration_logs_success_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_logs_success_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_logs_success_response.h"
integration_logs_success_response_t* instantiate_integration_logs_success_response(int include_optional);



integration_logs_success_response_t* instantiate_integration_logs_success_response(int include_optional) {
  integration_logs_success_response_t* integration_logs_success_response = NULL;
  if (include_optional) {
    integration_logs_success_response = integration_logs_success_response_create(
      "0"
    );
  } else {
    integration_logs_success_response = integration_logs_success_response_create(
      "0"
    );
  }

  return integration_logs_success_response;
}


#ifdef integration_logs_success_response_MAIN

void test_integration_logs_success_response(int include_optional) {
    integration_logs_success_response_t* integration_logs_success_response_1 = instantiate_integration_logs_success_response(include_optional);

	cJSON* jsonintegration_logs_success_response_1 = integration_logs_success_response_convertToJSON(integration_logs_success_response_1);
	printf("integration_logs_success_response :\n%s\n", cJSON_Print(jsonintegration_logs_success_response_1));
	integration_logs_success_response_t* integration_logs_success_response_2 = integration_logs_success_response_parseFromJSON(jsonintegration_logs_success_response_1);
	cJSON* jsonintegration_logs_success_response_2 = integration_logs_success_response_convertToJSON(integration_logs_success_response_2);
	printf("repeating integration_logs_success_response:\n%s\n", cJSON_Print(jsonintegration_logs_success_response_2));
}

int main() {
  test_integration_logs_success_response(1);
  test_integration_logs_success_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_logs_success_response_MAIN
#endif // integration_logs_success_response_TEST
