#ifndef integration_log_client_request_TEST
#define integration_log_client_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_log_client_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_log_client_request.h"
integration_log_client_request_t* instantiate_integration_log_client_request(int include_optional);



integration_log_client_request_t* instantiate_integration_log_client_request(int include_optional) {
  integration_log_client_request_t* integration_log_client_request = NULL;
  if (include_optional) {
    integration_log_client_request = integration_log_client_request_create(
      pinterest_rest_api_integration_log_client_request_METHOD_GET,
      "0",
      "0",
      list_createList(),
      list_createList(),
      56
    );
  } else {
    integration_log_client_request = integration_log_client_request_create(
      pinterest_rest_api_integration_log_client_request_METHOD_GET,
      "0",
      "0",
      list_createList(),
      list_createList(),
      56
    );
  }

  return integration_log_client_request;
}


#ifdef integration_log_client_request_MAIN

void test_integration_log_client_request(int include_optional) {
    integration_log_client_request_t* integration_log_client_request_1 = instantiate_integration_log_client_request(include_optional);

	cJSON* jsonintegration_log_client_request_1 = integration_log_client_request_convertToJSON(integration_log_client_request_1);
	printf("integration_log_client_request :\n%s\n", cJSON_Print(jsonintegration_log_client_request_1));
	integration_log_client_request_t* integration_log_client_request_2 = integration_log_client_request_parseFromJSON(jsonintegration_log_client_request_1);
	cJSON* jsonintegration_log_client_request_2 = integration_log_client_request_convertToJSON(integration_log_client_request_2);
	printf("repeating integration_log_client_request:\n%s\n", cJSON_Print(jsonintegration_log_client_request_2));
}

int main() {
  test_integration_log_client_request(1);
  test_integration_log_client_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_log_client_request_MAIN
#endif // integration_log_client_request_TEST
