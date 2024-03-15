#ifndef oauth_access_token_request_refresh_TEST
#define oauth_access_token_request_refresh_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define oauth_access_token_request_refresh_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/oauth_access_token_request_refresh.h"
oauth_access_token_request_refresh_t* instantiate_oauth_access_token_request_refresh(int include_optional);



oauth_access_token_request_refresh_t* instantiate_oauth_access_token_request_refresh(int include_optional) {
  oauth_access_token_request_refresh_t* oauth_access_token_request_refresh = NULL;
  if (include_optional) {
    oauth_access_token_request_refresh = oauth_access_token_request_refresh_create(
      pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_authorization_code,
      "0",
      "0",
      1
    );
  } else {
    oauth_access_token_request_refresh = oauth_access_token_request_refresh_create(
      pinterest_rest_api_oauth_access_token_request_refresh_GRANTTYPE_authorization_code,
      "0",
      "0",
      1
    );
  }

  return oauth_access_token_request_refresh;
}


#ifdef oauth_access_token_request_refresh_MAIN

void test_oauth_access_token_request_refresh(int include_optional) {
    oauth_access_token_request_refresh_t* oauth_access_token_request_refresh_1 = instantiate_oauth_access_token_request_refresh(include_optional);

	cJSON* jsonoauth_access_token_request_refresh_1 = oauth_access_token_request_refresh_convertToJSON(oauth_access_token_request_refresh_1);
	printf("oauth_access_token_request_refresh :\n%s\n", cJSON_Print(jsonoauth_access_token_request_refresh_1));
	oauth_access_token_request_refresh_t* oauth_access_token_request_refresh_2 = oauth_access_token_request_refresh_parseFromJSON(jsonoauth_access_token_request_refresh_1);
	cJSON* jsonoauth_access_token_request_refresh_2 = oauth_access_token_request_refresh_convertToJSON(oauth_access_token_request_refresh_2);
	printf("repeating oauth_access_token_request_refresh:\n%s\n", cJSON_Print(jsonoauth_access_token_request_refresh_2));
}

int main() {
  test_oauth_access_token_request_refresh(1);
  test_oauth_access_token_request_refresh(0);

  printf("Hello world \n");
  return 0;
}

#endif // oauth_access_token_request_refresh_MAIN
#endif // oauth_access_token_request_refresh_TEST
