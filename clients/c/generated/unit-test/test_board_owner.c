#ifndef board_owner_TEST
#define board_owner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_owner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_owner.h"
board_owner_t* instantiate_board_owner(int include_optional);



board_owner_t* instantiate_board_owner(int include_optional) {
  board_owner_t* board_owner = NULL;
  if (include_optional) {
    board_owner = board_owner_create(
      "0"
    );
  } else {
    board_owner = board_owner_create(
      "0"
    );
  }

  return board_owner;
}


#ifdef board_owner_MAIN

void test_board_owner(int include_optional) {
    board_owner_t* board_owner_1 = instantiate_board_owner(include_optional);

	cJSON* jsonboard_owner_1 = board_owner_convertToJSON(board_owner_1);
	printf("board_owner :\n%s\n", cJSON_Print(jsonboard_owner_1));
	board_owner_t* board_owner_2 = board_owner_parseFromJSON(jsonboard_owner_1);
	cJSON* jsonboard_owner_2 = board_owner_convertToJSON(board_owner_2);
	printf("repeating board_owner:\n%s\n", cJSON_Print(jsonboard_owner_2));
}

int main() {
  test_board_owner(1);
  test_board_owner(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_owner_MAIN
#endif // board_owner_TEST
