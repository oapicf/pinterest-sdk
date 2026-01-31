#ifndef board_privacy_TEST
#define board_privacy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_privacy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_privacy.h"
board_privacy_t* instantiate_board_privacy(int include_optional);



board_privacy_t* instantiate_board_privacy(int include_optional) {
  board_privacy_t* board_privacy = NULL;
  if (include_optional) {
    board_privacy = board_privacy_create(
    );
  } else {
    board_privacy = board_privacy_create(
    );
  }

  return board_privacy;
}


#ifdef board_privacy_MAIN

void test_board_privacy(int include_optional) {
    board_privacy_t* board_privacy_1 = instantiate_board_privacy(include_optional);

	cJSON* jsonboard_privacy_1 = board_privacy_convertToJSON(board_privacy_1);
	printf("board_privacy :\n%s\n", cJSON_Print(jsonboard_privacy_1));
	board_privacy_t* board_privacy_2 = board_privacy_parseFromJSON(jsonboard_privacy_1);
	cJSON* jsonboard_privacy_2 = board_privacy_convertToJSON(board_privacy_2);
	printf("repeating board_privacy:\n%s\n", cJSON_Print(jsonboard_privacy_2));
}

int main() {
  test_board_privacy(1);
  test_board_privacy(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_privacy_MAIN
#endif // board_privacy_TEST
