#ifndef user_following_feed_type_TEST
#define user_following_feed_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_following_feed_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_following_feed_type.h"
user_following_feed_type_t* instantiate_user_following_feed_type(int include_optional);



user_following_feed_type_t* instantiate_user_following_feed_type(int include_optional) {
  user_following_feed_type_t* user_following_feed_type = NULL;
  if (include_optional) {
    user_following_feed_type = user_following_feed_type_create(
    );
  } else {
    user_following_feed_type = user_following_feed_type_create(
    );
  }

  return user_following_feed_type;
}


#ifdef user_following_feed_type_MAIN

void test_user_following_feed_type(int include_optional) {
    user_following_feed_type_t* user_following_feed_type_1 = instantiate_user_following_feed_type(include_optional);

	cJSON* jsonuser_following_feed_type_1 = user_following_feed_type_convertToJSON(user_following_feed_type_1);
	printf("user_following_feed_type :\n%s\n", cJSON_Print(jsonuser_following_feed_type_1));
	user_following_feed_type_t* user_following_feed_type_2 = user_following_feed_type_parseFromJSON(jsonuser_following_feed_type_1);
	cJSON* jsonuser_following_feed_type_2 = user_following_feed_type_convertToJSON(user_following_feed_type_2);
	printf("repeating user_following_feed_type:\n%s\n", cJSON_Print(jsonuser_following_feed_type_2));
}

int main() {
  test_user_following_feed_type(1);
  test_user_following_feed_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_following_feed_type_MAIN
#endif // user_following_feed_type_TEST
