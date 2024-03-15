#ifndef oauth_access_token_response_TEST
#define oauth_access_token_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define oauth_access_token_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/oauth_access_token_response.h"
oauth_access_token_response_t* instantiate_oauth_access_token_response(int include_optional);



oauth_access_token_response_t* instantiate_oauth_access_token_response(int include_optional) {
  oauth_access_token_response_t* oauth_access_token_response = NULL;
  if (include_optional) {
    oauth_access_token_response = oauth_access_token_response_create(
      pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_authorization_code,
      "0",
      "bearer",
      56,
      "0"
    );
  } else {
    oauth_access_token_response = oauth_access_token_response_create(
      pinterest_rest_api_oauth_access_token_response_RESPONSETYPE_authorization_code,
      "0",
      "bearer",
      56,
      "0"
    );
  }

  return oauth_access_token_response;
}


#ifdef oauth_access_token_response_MAIN

void test_oauth_access_token_response(int include_optional) {
    oauth_access_token_response_t* oauth_access_token_response_1 = instantiate_oauth_access_token_response(include_optional);

	cJSON* jsonoauth_access_token_response_1 = oauth_access_token_response_convertToJSON(oauth_access_token_response_1);
	printf("oauth_access_token_response :\n%s\n", cJSON_Print(jsonoauth_access_token_response_1));
	oauth_access_token_response_t* oauth_access_token_response_2 = oauth_access_token_response_parseFromJSON(jsonoauth_access_token_response_1);
	cJSON* jsonoauth_access_token_response_2 = oauth_access_token_response_convertToJSON(oauth_access_token_response_2);
	printf("repeating oauth_access_token_response:\n%s\n", cJSON_Print(jsonoauth_access_token_response_2));
}

int main() {
  test_oauth_access_token_response(1);
  test_oauth_access_token_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // oauth_access_token_response_MAIN
#endif // oauth_access_token_response_TEST
