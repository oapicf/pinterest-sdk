#ifndef followers_list_200_response_TEST
#define followers_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define followers_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/followers_list_200_response.h"
followers_list_200_response_t* instantiate_followers_list_200_response(int include_optional);



followers_list_200_response_t* instantiate_followers_list_200_response(int include_optional) {
  followers_list_200_response_t* followers_list_200_response = NULL;
  if (include_optional) {
    followers_list_200_response = followers_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    followers_list_200_response = followers_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return followers_list_200_response;
}


#ifdef followers_list_200_response_MAIN

void test_followers_list_200_response(int include_optional) {
    followers_list_200_response_t* followers_list_200_response_1 = instantiate_followers_list_200_response(include_optional);

	cJSON* jsonfollowers_list_200_response_1 = followers_list_200_response_convertToJSON(followers_list_200_response_1);
	printf("followers_list_200_response :\n%s\n", cJSON_Print(jsonfollowers_list_200_response_1));
	followers_list_200_response_t* followers_list_200_response_2 = followers_list_200_response_parseFromJSON(jsonfollowers_list_200_response_1);
	cJSON* jsonfollowers_list_200_response_2 = followers_list_200_response_convertToJSON(followers_list_200_response_2);
	printf("repeating followers_list_200_response:\n%s\n", cJSON_Print(jsonfollowers_list_200_response_2));
}

int main() {
  test_followers_list_200_response(1);
  test_followers_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // followers_list_200_response_MAIN
#endif // followers_list_200_response_TEST
