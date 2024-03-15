#ifndef feeds_list_200_response_TEST
#define feeds_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define feeds_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/feeds_list_200_response.h"
feeds_list_200_response_t* instantiate_feeds_list_200_response(int include_optional);



feeds_list_200_response_t* instantiate_feeds_list_200_response(int include_optional) {
  feeds_list_200_response_t* feeds_list_200_response = NULL;
  if (include_optional) {
    feeds_list_200_response = feeds_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    feeds_list_200_response = feeds_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return feeds_list_200_response;
}


#ifdef feeds_list_200_response_MAIN

void test_feeds_list_200_response(int include_optional) {
    feeds_list_200_response_t* feeds_list_200_response_1 = instantiate_feeds_list_200_response(include_optional);

	cJSON* jsonfeeds_list_200_response_1 = feeds_list_200_response_convertToJSON(feeds_list_200_response_1);
	printf("feeds_list_200_response :\n%s\n", cJSON_Print(jsonfeeds_list_200_response_1));
	feeds_list_200_response_t* feeds_list_200_response_2 = feeds_list_200_response_parseFromJSON(jsonfeeds_list_200_response_1);
	cJSON* jsonfeeds_list_200_response_2 = feeds_list_200_response_convertToJSON(feeds_list_200_response_2);
	printf("repeating feeds_list_200_response:\n%s\n", cJSON_Print(jsonfeeds_list_200_response_2));
}

int main() {
  test_feeds_list_200_response(1);
  test_feeds_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // feeds_list_200_response_MAIN
#endif // feeds_list_200_response_TEST
