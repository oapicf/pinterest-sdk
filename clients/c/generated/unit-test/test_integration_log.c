#ifndef integration_log_TEST
#define integration_log_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_log_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_log.h"
integration_log_t* instantiate_integration_log(int include_optional);

#include "test_integration_log_client_error.c"
#include "test_integration_log_client_request.c"


integration_log_t* instantiate_integration_log(int include_optional) {
  integration_log_t* integration_log = NULL;
  if (include_optional) {
    integration_log = integration_log_create(
      56,
      pinterest_rest_api_integration_log_EVENTTYPE_APP,
      pinterest_rest_api_integration_log_LOGLEVEL_INFO,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_integration_log_client_error(0),
       // false, not to have infinite recursion
      instantiate_integration_log_client_request(0)
    );
  } else {
    integration_log = integration_log_create(
      56,
      pinterest_rest_api_integration_log_EVENTTYPE_APP,
      pinterest_rest_api_integration_log_LOGLEVEL_INFO,
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      "0",
      NULL,
      NULL
    );
  }

  return integration_log;
}


#ifdef integration_log_MAIN

void test_integration_log(int include_optional) {
    integration_log_t* integration_log_1 = instantiate_integration_log(include_optional);

	cJSON* jsonintegration_log_1 = integration_log_convertToJSON(integration_log_1);
	printf("integration_log :\n%s\n", cJSON_Print(jsonintegration_log_1));
	integration_log_t* integration_log_2 = integration_log_parseFromJSON(jsonintegration_log_1);
	cJSON* jsonintegration_log_2 = integration_log_convertToJSON(integration_log_2);
	printf("repeating integration_log:\n%s\n", cJSON_Print(jsonintegration_log_2));
}

int main() {
  test_integration_log(1);
  test_integration_log(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_log_MAIN
#endif // integration_log_TEST
