#ifndef integration_logs_invalid_log_response_rejected_logs_inner_TEST
#define integration_logs_invalid_log_response_rejected_logs_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_logs_invalid_log_response_rejected_logs_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_logs_invalid_log_response_rejected_logs_inner.h"
integration_logs_invalid_log_response_rejected_logs_inner_t* instantiate_integration_logs_invalid_log_response_rejected_logs_inner(int include_optional);



integration_logs_invalid_log_response_rejected_logs_inner_t* instantiate_integration_logs_invalid_log_response_rejected_logs_inner(int include_optional) {
  integration_logs_invalid_log_response_rejected_logs_inner_t* integration_logs_invalid_log_response_rejected_logs_inner = NULL;
  if (include_optional) {
    integration_logs_invalid_log_response_rejected_logs_inner = integration_logs_invalid_log_response_rejected_logs_inner_create(
      56,
      "0",
      "0",
      "0"
    );
  } else {
    integration_logs_invalid_log_response_rejected_logs_inner = integration_logs_invalid_log_response_rejected_logs_inner_create(
      56,
      "0",
      "0",
      "0"
    );
  }

  return integration_logs_invalid_log_response_rejected_logs_inner;
}


#ifdef integration_logs_invalid_log_response_rejected_logs_inner_MAIN

void test_integration_logs_invalid_log_response_rejected_logs_inner(int include_optional) {
    integration_logs_invalid_log_response_rejected_logs_inner_t* integration_logs_invalid_log_response_rejected_logs_inner_1 = instantiate_integration_logs_invalid_log_response_rejected_logs_inner(include_optional);

	cJSON* jsonintegration_logs_invalid_log_response_rejected_logs_inner_1 = integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(integration_logs_invalid_log_response_rejected_logs_inner_1);
	printf("integration_logs_invalid_log_response_rejected_logs_inner :\n%s\n", cJSON_Print(jsonintegration_logs_invalid_log_response_rejected_logs_inner_1));
	integration_logs_invalid_log_response_rejected_logs_inner_t* integration_logs_invalid_log_response_rejected_logs_inner_2 = integration_logs_invalid_log_response_rejected_logs_inner_parseFromJSON(jsonintegration_logs_invalid_log_response_rejected_logs_inner_1);
	cJSON* jsonintegration_logs_invalid_log_response_rejected_logs_inner_2 = integration_logs_invalid_log_response_rejected_logs_inner_convertToJSON(integration_logs_invalid_log_response_rejected_logs_inner_2);
	printf("repeating integration_logs_invalid_log_response_rejected_logs_inner:\n%s\n", cJSON_Print(jsonintegration_logs_invalid_log_response_rejected_logs_inner_2));
}

int main() {
  test_integration_logs_invalid_log_response_rejected_logs_inner(1);
  test_integration_logs_invalid_log_response_rejected_logs_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_logs_invalid_log_response_rejected_logs_inner_MAIN
#endif // integration_logs_invalid_log_response_rejected_logs_inner_TEST
