#ifndef board_with_update_privacy_update_TEST
#define board_with_update_privacy_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_with_update_privacy_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_with_update_privacy_update.h"
board_with_update_privacy_update_t* instantiate_board_with_update_privacy_update(int include_optional);



board_with_update_privacy_update_t* instantiate_board_with_update_privacy_update(int include_optional) {
  board_with_update_privacy_update_t* board_with_update_privacy_update = NULL;
  if (include_optional) {
    board_with_update_privacy_update = board_with_update_privacy_update_create(
      "My favorite summer recipes",
      "Summer recipes",
      pinterest_rest_api_board_with_update_privacy_update__PUBLIC
    );
  } else {
    board_with_update_privacy_update = board_with_update_privacy_update_create(
      "My favorite summer recipes",
      "Summer recipes",
      pinterest_rest_api_board_with_update_privacy_update__PUBLIC
    );
  }

  return board_with_update_privacy_update;
}


#ifdef board_with_update_privacy_update_MAIN

void test_board_with_update_privacy_update(int include_optional) {
    board_with_update_privacy_update_t* board_with_update_privacy_update_1 = instantiate_board_with_update_privacy_update(include_optional);

	cJSON* jsonboard_with_update_privacy_update_1 = board_with_update_privacy_update_convertToJSON(board_with_update_privacy_update_1);
	printf("board_with_update_privacy_update :\n%s\n", cJSON_Print(jsonboard_with_update_privacy_update_1));
	board_with_update_privacy_update_t* board_with_update_privacy_update_2 = board_with_update_privacy_update_parseFromJSON(jsonboard_with_update_privacy_update_1);
	cJSON* jsonboard_with_update_privacy_update_2 = board_with_update_privacy_update_convertToJSON(board_with_update_privacy_update_2);
	printf("repeating board_with_update_privacy_update:\n%s\n", cJSON_Print(jsonboard_with_update_privacy_update_2));
}

int main() {
  test_board_with_update_privacy_update(1);
  test_board_with_update_privacy_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_with_update_privacy_update_MAIN
#endif // board_with_update_privacy_update_TEST
