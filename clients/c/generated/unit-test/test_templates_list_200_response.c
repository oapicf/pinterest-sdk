#ifndef templates_list_200_response_TEST
#define templates_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define templates_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/templates_list_200_response.h"
templates_list_200_response_t* instantiate_templates_list_200_response(int include_optional);



templates_list_200_response_t* instantiate_templates_list_200_response(int include_optional) {
  templates_list_200_response_t* templates_list_200_response = NULL;
  if (include_optional) {
    templates_list_200_response = templates_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    templates_list_200_response = templates_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return templates_list_200_response;
}


#ifdef templates_list_200_response_MAIN

void test_templates_list_200_response(int include_optional) {
    templates_list_200_response_t* templates_list_200_response_1 = instantiate_templates_list_200_response(include_optional);

	cJSON* jsontemplates_list_200_response_1 = templates_list_200_response_convertToJSON(templates_list_200_response_1);
	printf("templates_list_200_response :\n%s\n", cJSON_Print(jsontemplates_list_200_response_1));
	templates_list_200_response_t* templates_list_200_response_2 = templates_list_200_response_parseFromJSON(jsontemplates_list_200_response_1);
	cJSON* jsontemplates_list_200_response_2 = templates_list_200_response_convertToJSON(templates_list_200_response_2);
	printf("repeating templates_list_200_response:\n%s\n", cJSON_Print(jsontemplates_list_200_response_2));
}

int main() {
  test_templates_list_200_response(1);
  test_templates_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // templates_list_200_response_MAIN
#endif // templates_list_200_response_TEST
