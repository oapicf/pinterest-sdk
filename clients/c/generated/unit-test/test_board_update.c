#ifndef board_update_TEST
#define board_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_update.h"
board_update_t* instantiate_board_update(int include_optional);



board_update_t* instantiate_board_update(int include_optional) {
  board_update_t* board_update = NULL;
  if (include_optional) {
    board_update = board_update_create(
      "Summer Recipes",
      "My favorite summer recipes",
      pinterest_rest_api_board_update_PRIVACY_PUBLIC
    );
  } else {
    board_update = board_update_create(
      "Summer Recipes",
      "My favorite summer recipes",
      pinterest_rest_api_board_update_PRIVACY_PUBLIC
    );
  }

  return board_update;
}


#ifdef board_update_MAIN

void test_board_update(int include_optional) {
    board_update_t* board_update_1 = instantiate_board_update(include_optional);

	cJSON* jsonboard_update_1 = board_update_convertToJSON(board_update_1);
	printf("board_update :\n%s\n", cJSON_Print(jsonboard_update_1));
	board_update_t* board_update_2 = board_update_parseFromJSON(jsonboard_update_1);
	cJSON* jsonboard_update_2 = board_update_convertToJSON(board_update_2);
	printf("repeating board_update:\n%s\n", cJSON_Print(jsonboard_update_2));
}

int main() {
  test_board_update(1);
  test_board_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_update_MAIN
#endif // board_update_TEST
