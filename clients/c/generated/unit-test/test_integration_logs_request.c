#ifndef integration_logs_request_TEST
#define integration_logs_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integration_logs_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integration_logs_request.h"
integration_logs_request_t* instantiate_integration_logs_request(int include_optional);



integration_logs_request_t* instantiate_integration_logs_request(int include_optional) {
  integration_logs_request_t* integration_logs_request = NULL;
  if (include_optional) {
    integration_logs_request = integration_logs_request_create(
      list_createList()
    );
  } else {
    integration_logs_request = integration_logs_request_create(
      list_createList()
    );
  }

  return integration_logs_request;
}


#ifdef integration_logs_request_MAIN

void test_integration_logs_request(int include_optional) {
    integration_logs_request_t* integration_logs_request_1 = instantiate_integration_logs_request(include_optional);

	cJSON* jsonintegration_logs_request_1 = integration_logs_request_convertToJSON(integration_logs_request_1);
	printf("integration_logs_request :\n%s\n", cJSON_Print(jsonintegration_logs_request_1));
	integration_logs_request_t* integration_logs_request_2 = integration_logs_request_parseFromJSON(jsonintegration_logs_request_1);
	cJSON* jsonintegration_logs_request_2 = integration_logs_request_convertToJSON(integration_logs_request_2);
	printf("repeating integration_logs_request:\n%s\n", cJSON_Print(jsonintegration_logs_request_2));
}

int main() {
  test_integration_logs_request(1);
  test_integration_logs_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // integration_logs_request_MAIN
#endif // integration_logs_request_TEST
