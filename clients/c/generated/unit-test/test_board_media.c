#ifndef board_media_TEST
#define board_media_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define board_media_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/board_media.h"
board_media_t* instantiate_board_media(int include_optional);



board_media_t* instantiate_board_media(int include_optional) {
  board_media_t* board_media = NULL;
  if (include_optional) {
    board_media = board_media_create(
      "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg",
      ["https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg","https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg","https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg","https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg"]
    );
  } else {
    board_media = board_media_create(
      "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg",
      ["https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg","https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg","https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg","https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg"]
    );
  }

  return board_media;
}


#ifdef board_media_MAIN

void test_board_media(int include_optional) {
    board_media_t* board_media_1 = instantiate_board_media(include_optional);

	cJSON* jsonboard_media_1 = board_media_convertToJSON(board_media_1);
	printf("board_media :\n%s\n", cJSON_Print(jsonboard_media_1));
	board_media_t* board_media_2 = board_media_parseFromJSON(jsonboard_media_1);
	cJSON* jsonboard_media_2 = board_media_convertToJSON(board_media_2);
	printf("repeating board_media:\n%s\n", cJSON_Print(jsonboard_media_2));
}

int main() {
  test_board_media(1);
  test_board_media(0);

  printf("Hello world \n");
  return 0;
}

#endif // board_media_MAIN
#endif // board_media_TEST
