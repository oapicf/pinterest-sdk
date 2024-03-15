#ifndef user_summary_TEST
#define user_summary_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_summary_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_summary.h"
user_summary_t* instantiate_user_summary(int include_optional);



user_summary_t* instantiate_user_summary(int include_optional) {
  user_summary_t* user_summary = NULL;
  if (include_optional) {
    user_summary = user_summary_create(
      "username",
      "user"
    );
  } else {
    user_summary = user_summary_create(
      "username",
      "user"
    );
  }

  return user_summary;
}


#ifdef user_summary_MAIN

void test_user_summary(int include_optional) {
    user_summary_t* user_summary_1 = instantiate_user_summary(include_optional);

	cJSON* jsonuser_summary_1 = user_summary_convertToJSON(user_summary_1);
	printf("user_summary :\n%s\n", cJSON_Print(jsonuser_summary_1));
	user_summary_t* user_summary_2 = user_summary_parseFromJSON(jsonuser_summary_1);
	cJSON* jsonuser_summary_2 = user_summary_convertToJSON(user_summary_2);
	printf("repeating user_summary:\n%s\n", cJSON_Print(jsonuser_summary_2));
}

int main() {
  test_user_summary(1);
  test_user_summary(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_summary_MAIN
#endif // user_summary_TEST
