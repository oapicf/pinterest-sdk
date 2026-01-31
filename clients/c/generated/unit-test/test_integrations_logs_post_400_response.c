#ifndef integrations_logs_post_400_response_TEST
#define integrations_logs_post_400_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integrations_logs_post_400_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integrations_logs_post_400_response.h"
integrations_logs_post_400_response_t* instantiate_integrations_logs_post_400_response(int include_optional);



integrations_logs_post_400_response_t* instantiate_integrations_logs_post_400_response(int include_optional) {
  integrations_logs_post_400_response_t* integrations_logs_post_400_response = NULL;
  if (include_optional) {
    integrations_logs_post_400_response = integrations_logs_post_400_response_create(
      56,
      "0",
      0
    );
  } else {
    integrations_logs_post_400_response = integrations_logs_post_400_response_create(
      56,
      "0",
      0
    );
  }

  return integrations_logs_post_400_response;
}


#ifdef integrations_logs_post_400_response_MAIN

void test_integrations_logs_post_400_response(int include_optional) {
    integrations_logs_post_400_response_t* integrations_logs_post_400_response_1 = instantiate_integrations_logs_post_400_response(include_optional);

	cJSON* jsonintegrations_logs_post_400_response_1 = integrations_logs_post_400_response_convertToJSON(integrations_logs_post_400_response_1);
	printf("integrations_logs_post_400_response :\n%s\n", cJSON_Print(jsonintegrations_logs_post_400_response_1));
	integrations_logs_post_400_response_t* integrations_logs_post_400_response_2 = integrations_logs_post_400_response_parseFromJSON(jsonintegrations_logs_post_400_response_1);
	cJSON* jsonintegrations_logs_post_400_response_2 = integrations_logs_post_400_response_convertToJSON(integrations_logs_post_400_response_2);
	printf("repeating integrations_logs_post_400_response:\n%s\n", cJSON_Print(jsonintegrations_logs_post_400_response_2));
}

int main() {
  test_integrations_logs_post_400_response(1);
  test_integrations_logs_post_400_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // integrations_logs_post_400_response_MAIN
#endif // integrations_logs_post_400_response_TEST
