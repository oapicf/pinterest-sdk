#ifndef board_update_privacy_TEST
#define board_update_privacy_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_update_privacy_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_update_privacy.h"
board_update_privacy_t* instantiate_board_update_privacy(int include_optional);



board_update_privacy_t* instantiate_board_update_privacy(int include_optional) {
  board_update_privacy_t* board_update_privacy = NULL;
  if (include_optional) {
    board_update_privacy = board_update_privacy_create(
    );
  } else {
    board_update_privacy = board_update_privacy_create(
    );
  }

  return board_update_privacy;
}


#ifdef board_update_privacy_MAIN

void test_board_update_privacy(int include_optional) {
    board_update_privacy_t* board_update_privacy_1 = instantiate_board_update_privacy(include_optional);

	cJSON* jsonboard_update_privacy_1 = board_update_privacy_convertToJSON(board_update_privacy_1);
	printf("board_update_privacy :\n%s\n", cJSON_Print(jsonboard_update_privacy_1));
	board_update_privacy_t* board_update_privacy_2 = board_update_privacy_parseFromJSON(jsonboard_update_privacy_1);
	cJSON* jsonboard_update_privacy_2 = board_update_privacy_convertToJSON(board_update_privacy_2);
	printf("repeating board_update_privacy:\n%s\n", cJSON_Print(jsonboard_update_privacy_2));
}

int main() {
  test_board_update_privacy(1);
  test_board_update_privacy(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_update_privacy_MAIN
#endif // board_update_privacy_TEST
