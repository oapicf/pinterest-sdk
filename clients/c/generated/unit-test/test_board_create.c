#ifndef board_create_TEST
#define board_create_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_create_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_create.h"
board_create_t* instantiate_board_create(int include_optional);



board_create_t* instantiate_board_create(int include_optional) {
  board_create_t* board_create = NULL;
  if (include_optional) {
    board_create = board_create_create(
      "My favorite summer recipes",
      true,
      "Summer recipes",
      PUBLIC
    );
  } else {
    board_create = board_create_create(
      "My favorite summer recipes",
      true,
      "Summer recipes",
      PUBLIC
    );
  }

  return board_create;
}


#ifdef board_create_MAIN

void test_board_create(int include_optional) {
    board_create_t* board_create_1 = instantiate_board_create(include_optional);

	cJSON* jsonboard_create_1 = board_create_convertToJSON(board_create_1);
	printf("board_create :\n%s\n", cJSON_Print(jsonboard_create_1));
	board_create_t* board_create_2 = board_create_parseFromJSON(jsonboard_create_1);
	cJSON* jsonboard_create_2 = board_create_convertToJSON(board_create_2);
	printf("repeating board_create:\n%s\n", cJSON_Print(jsonboard_create_2));
}

int main() {
  test_board_create(1);
  test_board_create(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_create_MAIN
#endif // board_create_TEST
