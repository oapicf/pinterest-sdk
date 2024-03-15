#ifndef user_account_followed_interests_200_response_TEST
#define user_account_followed_interests_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_account_followed_interests_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_account_followed_interests_200_response.h"
user_account_followed_interests_200_response_t* instantiate_user_account_followed_interests_200_response(int include_optional);



user_account_followed_interests_200_response_t* instantiate_user_account_followed_interests_200_response(int include_optional) {
  user_account_followed_interests_200_response_t* user_account_followed_interests_200_response = NULL;
  if (include_optional) {
    user_account_followed_interests_200_response = user_account_followed_interests_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    user_account_followed_interests_200_response = user_account_followed_interests_200_response_create(
      list_createList(),
      "0"
    );
  }

  return user_account_followed_interests_200_response;
}


#ifdef user_account_followed_interests_200_response_MAIN

void test_user_account_followed_interests_200_response(int include_optional) {
    user_account_followed_interests_200_response_t* user_account_followed_interests_200_response_1 = instantiate_user_account_followed_interests_200_response(include_optional);

	cJSON* jsonuser_account_followed_interests_200_response_1 = user_account_followed_interests_200_response_convertToJSON(user_account_followed_interests_200_response_1);
	printf("user_account_followed_interests_200_response :\n%s\n", cJSON_Print(jsonuser_account_followed_interests_200_response_1));
	user_account_followed_interests_200_response_t* user_account_followed_interests_200_response_2 = user_account_followed_interests_200_response_parseFromJSON(jsonuser_account_followed_interests_200_response_1);
	cJSON* jsonuser_account_followed_interests_200_response_2 = user_account_followed_interests_200_response_convertToJSON(user_account_followed_interests_200_response_2);
	printf("repeating user_account_followed_interests_200_response:\n%s\n", cJSON_Print(jsonuser_account_followed_interests_200_response_2));
}

int main() {
  test_user_account_followed_interests_200_response(1);
  test_user_account_followed_interests_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_account_followed_interests_200_response_MAIN
#endif // user_account_followed_interests_200_response_TEST
