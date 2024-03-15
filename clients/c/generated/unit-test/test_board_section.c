#ifndef board_section_TEST
#define board_section_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_section_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_section.h"
board_section_t* instantiate_board_section(int include_optional);



board_section_t* instantiate_board_section(int include_optional) {
  board_section_t* board_section = NULL;
  if (include_optional) {
    board_section = board_section_create(
      "549755885175",
      "Salads"
    );
  } else {
    board_section = board_section_create(
      "549755885175",
      "Salads"
    );
  }

  return board_section;
}


#ifdef board_section_MAIN

void test_board_section(int include_optional) {
    board_section_t* board_section_1 = instantiate_board_section(include_optional);

	cJSON* jsonboard_section_1 = board_section_convertToJSON(board_section_1);
	printf("board_section :\n%s\n", cJSON_Print(jsonboard_section_1));
	board_section_t* board_section_2 = board_section_parseFromJSON(jsonboard_section_1);
	cJSON* jsonboard_section_2 = board_section_convertToJSON(board_section_2);
	printf("repeating board_section:\n%s\n", cJSON_Print(jsonboard_section_2));
}

int main() {
  test_board_section(1);
  test_board_section(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_section_MAIN
#endif // board_section_TEST
