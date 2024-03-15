#ifndef user_website_verify_request_TEST
#define user_website_verify_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_website_verify_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_website_verify_request.h"
user_website_verify_request_t* instantiate_user_website_verify_request(int include_optional);



user_website_verify_request_t* instantiate_user_website_verify_request(int include_optional) {
  user_website_verify_request_t* user_website_verify_request = NULL;
  if (include_optional) {
    user_website_verify_request = user_website_verify_request_create(
      "pintest-website-12345678.test/test_1",
      pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_"METATAG"
    );
  } else {
    user_website_verify_request = user_website_verify_request_create(
      "pintest-website-12345678.test/test_1",
      pinterest_rest_api_user_website_verify_request_VERIFICATIONMETHOD_"METATAG"
    );
  }

  return user_website_verify_request;
}


#ifdef user_website_verify_request_MAIN

void test_user_website_verify_request(int include_optional) {
    user_website_verify_request_t* user_website_verify_request_1 = instantiate_user_website_verify_request(include_optional);

	cJSON* jsonuser_website_verify_request_1 = user_website_verify_request_convertToJSON(user_website_verify_request_1);
	printf("user_website_verify_request :\n%s\n", cJSON_Print(jsonuser_website_verify_request_1));
	user_website_verify_request_t* user_website_verify_request_2 = user_website_verify_request_parseFromJSON(jsonuser_website_verify_request_1);
	cJSON* jsonuser_website_verify_request_2 = user_website_verify_request_convertToJSON(user_website_verify_request_2);
	printf("repeating user_website_verify_request:\n%s\n", cJSON_Print(jsonuser_website_verify_request_2));
}

int main() {
  test_user_website_verify_request(1);
  test_user_website_verify_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_website_verify_request_MAIN
#endif // user_website_verify_request_TEST
