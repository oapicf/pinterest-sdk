#ifndef boards_user_follows_list_200_response_TEST
#define boards_user_follows_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define boards_user_follows_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/boards_user_follows_list_200_response.h"
boards_user_follows_list_200_response_t* instantiate_boards_user_follows_list_200_response(int include_optional);



boards_user_follows_list_200_response_t* instantiate_boards_user_follows_list_200_response(int include_optional) {
  boards_user_follows_list_200_response_t* boards_user_follows_list_200_response = NULL;
  if (include_optional) {
    boards_user_follows_list_200_response = boards_user_follows_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    boards_user_follows_list_200_response = boards_user_follows_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return boards_user_follows_list_200_response;
}


#ifdef boards_user_follows_list_200_response_MAIN

void test_boards_user_follows_list_200_response(int include_optional) {
    boards_user_follows_list_200_response_t* boards_user_follows_list_200_response_1 = instantiate_boards_user_follows_list_200_response(include_optional);

	cJSON* jsonboards_user_follows_list_200_response_1 = boards_user_follows_list_200_response_convertToJSON(boards_user_follows_list_200_response_1);
	printf("boards_user_follows_list_200_response :\n%s\n", cJSON_Print(jsonboards_user_follows_list_200_response_1));
	boards_user_follows_list_200_response_t* boards_user_follows_list_200_response_2 = boards_user_follows_list_200_response_parseFromJSON(jsonboards_user_follows_list_200_response_1);
	cJSON* jsonboards_user_follows_list_200_response_2 = boards_user_follows_list_200_response_convertToJSON(boards_user_follows_list_200_response_2);
	printf("repeating boards_user_follows_list_200_response:\n%s\n", cJSON_Print(jsonboards_user_follows_list_200_response_2));
}

int main() {
  test_boards_user_follows_list_200_response(1);
  test_boards_user_follows_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // boards_user_follows_list_200_response_MAIN
#endif // boards_user_follows_list_200_response_TEST
