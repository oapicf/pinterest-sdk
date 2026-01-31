#ifndef board_with_update_privacy_TEST
#define board_with_update_privacy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_with_update_privacy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_with_update_privacy.h"
board_with_update_privacy_t* instantiate_board_with_update_privacy(int include_optional);

#include "test_board_media.c"
#include "test_board_owner.c"


board_with_update_privacy_t* instantiate_board_with_update_privacy(int include_optional) {
  board_with_update_privacy_t* board_with_update_privacy = NULL;
  if (include_optional) {
    board_with_update_privacy = board_with_update_privacy_create(
      "2013-10-20T19:20:30+01:00",
      17,
      "2013-10-20T19:20:30+01:00",
      "My favorite summer recipes",
      13,
      "549755885175",
      true,
       // false, not to have infinite recursion
      instantiate_board_media(0),
      "Summer recipes",
       // false, not to have infinite recursion
      instantiate_board_owner(0),
      5,
      pinterest_rest_api_board_with_update_privacy__PUBLIC
    );
  } else {
    board_with_update_privacy = board_with_update_privacy_create(
      "2013-10-20T19:20:30+01:00",
      17,
      "2013-10-20T19:20:30+01:00",
      "My favorite summer recipes",
      13,
      "549755885175",
      true,
      NULL,
      "Summer recipes",
      NULL,
      5,
      pinterest_rest_api_board_with_update_privacy__PUBLIC
    );
  }

  return board_with_update_privacy;
}


#ifdef board_with_update_privacy_MAIN

void test_board_with_update_privacy(int include_optional) {
    board_with_update_privacy_t* board_with_update_privacy_1 = instantiate_board_with_update_privacy(include_optional);

	cJSON* jsonboard_with_update_privacy_1 = board_with_update_privacy_convertToJSON(board_with_update_privacy_1);
	printf("board_with_update_privacy :\n%s\n", cJSON_Print(jsonboard_with_update_privacy_1));
	board_with_update_privacy_t* board_with_update_privacy_2 = board_with_update_privacy_parseFromJSON(jsonboard_with_update_privacy_1);
	cJSON* jsonboard_with_update_privacy_2 = board_with_update_privacy_convertToJSON(board_with_update_privacy_2);
	printf("repeating board_with_update_privacy:\n%s\n", cJSON_Print(jsonboard_with_update_privacy_2));
}

int main() {
  test_board_with_update_privacy(1);
  test_board_with_update_privacy(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_with_update_privacy_MAIN
#endif // board_with_update_privacy_TEST
