#ifndef board_TEST
#define board_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board.h"
board_t* instantiate_board(int include_optional);

#include "test_board_media.c"
#include "test_board_owner.c"


board_t* instantiate_board(int include_optional) {
  board_t* board = NULL;
  if (include_optional) {
    board = board_create(
      "549755885175",
      "2020-01-01T20:10:40Z",
      "2020-01-01T20:10:40Z",
      "Summer Recipes",
      "My favorite summer recipes",
      17,
      5,
      13,
       // false, not to have infinite recursion
      instantiate_board_media(0),
       // false, not to have infinite recursion
      instantiate_board_owner(0),
      pinterest_rest_api_board_PRIVACY_"PUBLIC"
    );
  } else {
    board = board_create(
      "549755885175",
      "2020-01-01T20:10:40Z",
      "2020-01-01T20:10:40Z",
      "Summer Recipes",
      "My favorite summer recipes",
      17,
      5,
      13,
      NULL,
      NULL,
      pinterest_rest_api_board_PRIVACY_"PUBLIC"
    );
  }

  return board;
}


#ifdef board_MAIN

void test_board(int include_optional) {
    board_t* board_1 = instantiate_board(include_optional);

	cJSON* jsonboard_1 = board_convertToJSON(board_1);
	printf("board :\n%s\n", cJSON_Print(jsonboard_1));
	board_t* board_2 = board_parseFromJSON(jsonboard_1);
	cJSON* jsonboard_2 = board_convertToJSON(board_2);
	printf("repeating board:\n%s\n", cJSON_Print(jsonboard_2));
}

int main() {
  test_board(1);
  test_board(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_MAIN
#endif // board_TEST
