#ifndef pins_list_200_response_TEST
#define pins_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pins_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pins_list_200_response.h"
pins_list_200_response_t* instantiate_pins_list_200_response(int include_optional);



pins_list_200_response_t* instantiate_pins_list_200_response(int include_optional) {
  pins_list_200_response_t* pins_list_200_response = NULL;
  if (include_optional) {
    pins_list_200_response = pins_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    pins_list_200_response = pins_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return pins_list_200_response;
}


#ifdef pins_list_200_response_MAIN

void test_pins_list_200_response(int include_optional) {
    pins_list_200_response_t* pins_list_200_response_1 = instantiate_pins_list_200_response(include_optional);

	cJSON* jsonpins_list_200_response_1 = pins_list_200_response_convertToJSON(pins_list_200_response_1);
	printf("pins_list_200_response :\n%s\n", cJSON_Print(jsonpins_list_200_response_1));
	pins_list_200_response_t* pins_list_200_response_2 = pins_list_200_response_parseFromJSON(jsonpins_list_200_response_1);
	cJSON* jsonpins_list_200_response_2 = pins_list_200_response_convertToJSON(pins_list_200_response_2);
	printf("repeating pins_list_200_response:\n%s\n", cJSON_Print(jsonpins_list_200_response_2));
}

int main() {
  test_pins_list_200_response(1);
  test_pins_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // pins_list_200_response_MAIN
#endif // pins_list_200_response_TEST
