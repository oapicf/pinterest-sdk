#ifndef audiences_list_200_response_TEST
#define audiences_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define audiences_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/audiences_list_200_response.h"
audiences_list_200_response_t* instantiate_audiences_list_200_response(int include_optional);



audiences_list_200_response_t* instantiate_audiences_list_200_response(int include_optional) {
  audiences_list_200_response_t* audiences_list_200_response = NULL;
  if (include_optional) {
    audiences_list_200_response = audiences_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    audiences_list_200_response = audiences_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return audiences_list_200_response;
}


#ifdef audiences_list_200_response_MAIN

void test_audiences_list_200_response(int include_optional) {
    audiences_list_200_response_t* audiences_list_200_response_1 = instantiate_audiences_list_200_response(include_optional);

	cJSON* jsonaudiences_list_200_response_1 = audiences_list_200_response_convertToJSON(audiences_list_200_response_1);
	printf("audiences_list_200_response :\n%s\n", cJSON_Print(jsonaudiences_list_200_response_1));
	audiences_list_200_response_t* audiences_list_200_response_2 = audiences_list_200_response_parseFromJSON(jsonaudiences_list_200_response_1);
	cJSON* jsonaudiences_list_200_response_2 = audiences_list_200_response_convertToJSON(audiences_list_200_response_2);
	printf("repeating audiences_list_200_response:\n%s\n", cJSON_Print(jsonaudiences_list_200_response_2));
}

int main() {
  test_audiences_list_200_response(1);
  test_audiences_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // audiences_list_200_response_MAIN
#endif // audiences_list_200_response_TEST
