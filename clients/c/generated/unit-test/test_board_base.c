#ifndef board_base_TEST
#define board_base_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_base_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_base.h"
board_base_t* instantiate_board_base(int include_optional);

#include "test_board_media.c"
#include "test_board_owner.c"


board_base_t* instantiate_board_base(int include_optional) {
  board_base_t* board_base = NULL;
  if (include_optional) {
    board_base = board_base_create(
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
      5
    );
  } else {
    board_base = board_base_create(
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
      5
    );
  }

  return board_base;
}


#ifdef board_base_MAIN

void test_board_base(int include_optional) {
    board_base_t* board_base_1 = instantiate_board_base(include_optional);

	cJSON* jsonboard_base_1 = board_base_convertToJSON(board_base_1);
	printf("board_base :\n%s\n", cJSON_Print(jsonboard_base_1));
	board_base_t* board_base_2 = board_base_parseFromJSON(jsonboard_base_1);
	cJSON* jsonboard_base_2 = board_base_convertToJSON(board_base_2);
	printf("repeating board_base:\n%s\n", cJSON_Print(jsonboard_base_2));
}

int main() {
  test_board_base(1);
  test_board_base(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_base_MAIN
#endif // board_base_TEST
