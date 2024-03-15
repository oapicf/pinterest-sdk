#ifndef search_user_boards_get_200_response_TEST
#define search_user_boards_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define search_user_boards_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/search_user_boards_get_200_response.h"
search_user_boards_get_200_response_t* instantiate_search_user_boards_get_200_response(int include_optional);



search_user_boards_get_200_response_t* instantiate_search_user_boards_get_200_response(int include_optional) {
  search_user_boards_get_200_response_t* search_user_boards_get_200_response = NULL;
  if (include_optional) {
    search_user_boards_get_200_response = search_user_boards_get_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    search_user_boards_get_200_response = search_user_boards_get_200_response_create(
      list_createList(),
      "0"
    );
  }

  return search_user_boards_get_200_response;
}


#ifdef search_user_boards_get_200_response_MAIN

void test_search_user_boards_get_200_response(int include_optional) {
    search_user_boards_get_200_response_t* search_user_boards_get_200_response_1 = instantiate_search_user_boards_get_200_response(include_optional);

	cJSON* jsonsearch_user_boards_get_200_response_1 = search_user_boards_get_200_response_convertToJSON(search_user_boards_get_200_response_1);
	printf("search_user_boards_get_200_response :\n%s\n", cJSON_Print(jsonsearch_user_boards_get_200_response_1));
	search_user_boards_get_200_response_t* search_user_boards_get_200_response_2 = search_user_boards_get_200_response_parseFromJSON(jsonsearch_user_boards_get_200_response_1);
	cJSON* jsonsearch_user_boards_get_200_response_2 = search_user_boards_get_200_response_convertToJSON(search_user_boards_get_200_response_2);
	printf("repeating search_user_boards_get_200_response:\n%s\n", cJSON_Print(jsonsearch_user_boards_get_200_response_2));
}

int main() {
  test_search_user_boards_get_200_response(1);
  test_search_user_boards_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // search_user_boards_get_200_response_MAIN
#endif // search_user_boards_get_200_response_TEST
