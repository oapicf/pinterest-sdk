#ifndef integrations_get_list_200_response_TEST
#define integrations_get_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define integrations_get_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/integrations_get_list_200_response.h"
integrations_get_list_200_response_t* instantiate_integrations_get_list_200_response(int include_optional);



integrations_get_list_200_response_t* instantiate_integrations_get_list_200_response(int include_optional) {
  integrations_get_list_200_response_t* integrations_get_list_200_response = NULL;
  if (include_optional) {
    integrations_get_list_200_response = integrations_get_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    integrations_get_list_200_response = integrations_get_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return integrations_get_list_200_response;
}


#ifdef integrations_get_list_200_response_MAIN

void test_integrations_get_list_200_response(int include_optional) {
    integrations_get_list_200_response_t* integrations_get_list_200_response_1 = instantiate_integrations_get_list_200_response(include_optional);

	cJSON* jsonintegrations_get_list_200_response_1 = integrations_get_list_200_response_convertToJSON(integrations_get_list_200_response_1);
	printf("integrations_get_list_200_response :\n%s\n", cJSON_Print(jsonintegrations_get_list_200_response_1));
	integrations_get_list_200_response_t* integrations_get_list_200_response_2 = integrations_get_list_200_response_parseFromJSON(jsonintegrations_get_list_200_response_1);
	cJSON* jsonintegrations_get_list_200_response_2 = integrations_get_list_200_response_convertToJSON(integrations_get_list_200_response_2);
	printf("repeating integrations_get_list_200_response:\n%s\n", cJSON_Print(jsonintegrations_get_list_200_response_2));
}

int main() {
  test_integrations_get_list_200_response(1);
  test_integrations_get_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // integrations_get_list_200_response_MAIN
#endif // integrations_get_list_200_response_TEST
