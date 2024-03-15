#ifndef board_sections_list_200_response_TEST
#define board_sections_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_sections_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_sections_list_200_response.h"
board_sections_list_200_response_t* instantiate_board_sections_list_200_response(int include_optional);



board_sections_list_200_response_t* instantiate_board_sections_list_200_response(int include_optional) {
  board_sections_list_200_response_t* board_sections_list_200_response = NULL;
  if (include_optional) {
    board_sections_list_200_response = board_sections_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    board_sections_list_200_response = board_sections_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return board_sections_list_200_response;
}


#ifdef board_sections_list_200_response_MAIN

void test_board_sections_list_200_response(int include_optional) {
    board_sections_list_200_response_t* board_sections_list_200_response_1 = instantiate_board_sections_list_200_response(include_optional);

	cJSON* jsonboard_sections_list_200_response_1 = board_sections_list_200_response_convertToJSON(board_sections_list_200_response_1);
	printf("board_sections_list_200_response :\n%s\n", cJSON_Print(jsonboard_sections_list_200_response_1));
	board_sections_list_200_response_t* board_sections_list_200_response_2 = board_sections_list_200_response_parseFromJSON(jsonboard_sections_list_200_response_1);
	cJSON* jsonboard_sections_list_200_response_2 = board_sections_list_200_response_convertToJSON(board_sections_list_200_response_2);
	printf("repeating board_sections_list_200_response:\n%s\n", cJSON_Print(jsonboard_sections_list_200_response_2));
}

int main() {
  test_board_sections_list_200_response(1);
  test_board_sections_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_sections_list_200_response_MAIN
#endif // board_sections_list_200_response_TEST
