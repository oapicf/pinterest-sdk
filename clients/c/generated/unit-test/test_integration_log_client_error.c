#ifndef integration_log_client_error_TEST
#define integration_log_client_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_log_client_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_log_client_error.h"
integration_log_client_error_t* instantiate_integration_log_client_error(int include_optional);



integration_log_client_error_t* instantiate_integration_log_client_error(int include_optional) {
  integration_log_client_error_t* integration_log_client_error = NULL;
  if (include_optional) {
    integration_log_client_error = integration_log_client_error_create(
      "0",
      56,
      "0",
      56,
      "0",
      "0",
      "0",
      56,
      "0"
    );
  } else {
    integration_log_client_error = integration_log_client_error_create(
      "0",
      56,
      "0",
      56,
      "0",
      "0",
      "0",
      56,
      "0"
    );
  }

  return integration_log_client_error;
}


#ifdef integration_log_client_error_MAIN

void test_integration_log_client_error(int include_optional) {
    integration_log_client_error_t* integration_log_client_error_1 = instantiate_integration_log_client_error(include_optional);

	cJSON* jsonintegration_log_client_error_1 = integration_log_client_error_convertToJSON(integration_log_client_error_1);
	printf("integration_log_client_error :\n%s\n", cJSON_Print(jsonintegration_log_client_error_1));
	integration_log_client_error_t* integration_log_client_error_2 = integration_log_client_error_parseFromJSON(jsonintegration_log_client_error_1);
	cJSON* jsonintegration_log_client_error_2 = integration_log_client_error_convertToJSON(integration_log_client_error_2);
	printf("repeating integration_log_client_error:\n%s\n", cJSON_Print(jsonintegration_log_client_error_2));
}

int main() {
  test_integration_log_client_error(1);
  test_integration_log_client_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_log_client_error_MAIN
#endif // integration_log_client_error_TEST
