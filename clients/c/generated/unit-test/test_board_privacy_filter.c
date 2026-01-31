#ifndef board_privacy_filter_TEST
#define board_privacy_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_privacy_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_privacy_filter.h"
board_privacy_filter_t* instantiate_board_privacy_filter(int include_optional);



board_privacy_filter_t* instantiate_board_privacy_filter(int include_optional) {
  board_privacy_filter_t* board_privacy_filter = NULL;
  if (include_optional) {
    board_privacy_filter = board_privacy_filter_create(
    );
  } else {
    board_privacy_filter = board_privacy_filter_create(
    );
  }

  return board_privacy_filter;
}


#ifdef board_privacy_filter_MAIN

void test_board_privacy_filter(int include_optional) {
    board_privacy_filter_t* board_privacy_filter_1 = instantiate_board_privacy_filter(include_optional);

	cJSON* jsonboard_privacy_filter_1 = board_privacy_filter_convertToJSON(board_privacy_filter_1);
	printf("board_privacy_filter :\n%s\n", cJSON_Print(jsonboard_privacy_filter_1));
	board_privacy_filter_t* board_privacy_filter_2 = board_privacy_filter_parseFromJSON(jsonboard_privacy_filter_1);
	cJSON* jsonboard_privacy_filter_2 = board_privacy_filter_convertToJSON(board_privacy_filter_2);
	printf("repeating board_privacy_filter:\n%s\n", cJSON_Print(jsonboard_privacy_filter_2));
}

int main() {
  test_board_privacy_filter(1);
  test_board_privacy_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_privacy_filter_MAIN
#endif // board_privacy_filter_TEST
