#ifndef follow_user_request_TEST
#define follow_user_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define follow_user_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/follow_user_request.h"
follow_user_request_t* instantiate_follow_user_request(int include_optional);



follow_user_request_t* instantiate_follow_user_request(int include_optional) {
  follow_user_request_t* follow_user_request = NULL;
  if (include_optional) {
    follow_user_request = follow_user_request_create(
      false
    );
  } else {
    follow_user_request = follow_user_request_create(
      false
    );
  }

  return follow_user_request;
}


#ifdef follow_user_request_MAIN

void test_follow_user_request(int include_optional) {
    follow_user_request_t* follow_user_request_1 = instantiate_follow_user_request(include_optional);

	cJSON* jsonfollow_user_request_1 = follow_user_request_convertToJSON(follow_user_request_1);
	printf("follow_user_request :\n%s\n", cJSON_Print(jsonfollow_user_request_1));
	follow_user_request_t* follow_user_request_2 = follow_user_request_parseFromJSON(jsonfollow_user_request_1);
	cJSON* jsonfollow_user_request_2 = follow_user_request_convertToJSON(follow_user_request_2);
	printf("repeating follow_user_request:\n%s\n", cJSON_Print(jsonfollow_user_request_2));
}

int main() {
  test_follow_user_request(1);
  test_follow_user_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // follow_user_request_MAIN
#endif // follow_user_request_TEST
