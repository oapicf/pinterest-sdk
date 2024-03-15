#ifndef boards_list_pins_200_response_TEST
#define boards_list_pins_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define boards_list_pins_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/boards_list_pins_200_response.h"
boards_list_pins_200_response_t* instantiate_boards_list_pins_200_response(int include_optional);



boards_list_pins_200_response_t* instantiate_boards_list_pins_200_response(int include_optional) {
  boards_list_pins_200_response_t* boards_list_pins_200_response = NULL;
  if (include_optional) {
    boards_list_pins_200_response = boards_list_pins_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    boards_list_pins_200_response = boards_list_pins_200_response_create(
      list_createList(),
      "0"
    );
  }

  return boards_list_pins_200_response;
}


#ifdef boards_list_pins_200_response_MAIN

void test_boards_list_pins_200_response(int include_optional) {
    boards_list_pins_200_response_t* boards_list_pins_200_response_1 = instantiate_boards_list_pins_200_response(include_optional);

	cJSON* jsonboards_list_pins_200_response_1 = boards_list_pins_200_response_convertToJSON(boards_list_pins_200_response_1);
	printf("boards_list_pins_200_response :\n%s\n", cJSON_Print(jsonboards_list_pins_200_response_1));
	boards_list_pins_200_response_t* boards_list_pins_200_response_2 = boards_list_pins_200_response_parseFromJSON(jsonboards_list_pins_200_response_1);
	cJSON* jsonboards_list_pins_200_response_2 = boards_list_pins_200_response_convertToJSON(boards_list_pins_200_response_2);
	printf("repeating boards_list_pins_200_response:\n%s\n", cJSON_Print(jsonboards_list_pins_200_response_2));
}

int main() {
  test_boards_list_pins_200_response(1);
  test_boards_list_pins_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // boards_list_pins_200_response_MAIN
#endif // boards_list_pins_200_response_TEST
