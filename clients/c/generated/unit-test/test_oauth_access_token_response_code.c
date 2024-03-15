#ifndef oauth_access_token_response_code_TEST
#define oauth_access_token_response_code_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define oauth_access_token_response_code_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/oauth_access_token_response_code.h"
oauth_access_token_response_code_t* instantiate_oauth_access_token_response_code(int include_optional);



oauth_access_token_response_code_t* instantiate_oauth_access_token_response_code(int include_optional) {
  oauth_access_token_response_code_t* oauth_access_token_response_code = NULL;
  if (include_optional) {
    oauth_access_token_response_code = oauth_access_token_response_code_create(
      pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_authorization_code,
      "0",
      "bearer",
      56,
      "0",
      "0",
      56
    );
  } else {
    oauth_access_token_response_code = oauth_access_token_response_code_create(
      pinterest_rest_api_oauth_access_token_response_code_RESPONSETYPE_authorization_code,
      "0",
      "bearer",
      56,
      "0",
      "0",
      56
    );
  }

  return oauth_access_token_response_code;
}


#ifdef oauth_access_token_response_code_MAIN

void test_oauth_access_token_response_code(int include_optional) {
    oauth_access_token_response_code_t* oauth_access_token_response_code_1 = instantiate_oauth_access_token_response_code(include_optional);

	cJSON* jsonoauth_access_token_response_code_1 = oauth_access_token_response_code_convertToJSON(oauth_access_token_response_code_1);
	printf("oauth_access_token_response_code :\n%s\n", cJSON_Print(jsonoauth_access_token_response_code_1));
	oauth_access_token_response_code_t* oauth_access_token_response_code_2 = oauth_access_token_response_code_parseFromJSON(jsonoauth_access_token_response_code_1);
	cJSON* jsonoauth_access_token_response_code_2 = oauth_access_token_response_code_convertToJSON(oauth_access_token_response_code_2);
	printf("repeating oauth_access_token_response_code:\n%s\n", cJSON_Print(jsonoauth_access_token_response_code_2));
}

int main() {
  test_oauth_access_token_response_code(1);
  test_oauth_access_token_response_code(0);

  printf("Hello world \n");
  return 0;
}

#endif // oauth_access_token_response_code_MAIN
#endif // oauth_access_token_response_code_TEST
