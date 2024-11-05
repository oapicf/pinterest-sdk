#ifndef oauth_access_token_request_client_credentials_TEST
#define oauth_access_token_request_client_credentials_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define oauth_access_token_request_client_credentials_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/oauth_access_token_request_client_credentials.h"
oauth_access_token_request_client_credentials_t* instantiate_oauth_access_token_request_client_credentials(int include_optional);



oauth_access_token_request_client_credentials_t* instantiate_oauth_access_token_request_client_credentials(int include_optional) {
  oauth_access_token_request_client_credentials_t* oauth_access_token_request_client_credentials = NULL;
  if (include_optional) {
    oauth_access_token_request_client_credentials = oauth_access_token_request_client_credentials_create(
      pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_authorization_code,
      "0"
    );
  } else {
    oauth_access_token_request_client_credentials = oauth_access_token_request_client_credentials_create(
      pinterest_rest_api_oauth_access_token_request_client_credentials_GRANTTYPE_authorization_code,
      "0"
    );
  }

  return oauth_access_token_request_client_credentials;
}


#ifdef oauth_access_token_request_client_credentials_MAIN

void test_oauth_access_token_request_client_credentials(int include_optional) {
    oauth_access_token_request_client_credentials_t* oauth_access_token_request_client_credentials_1 = instantiate_oauth_access_token_request_client_credentials(include_optional);

	cJSON* jsonoauth_access_token_request_client_credentials_1 = oauth_access_token_request_client_credentials_convertToJSON(oauth_access_token_request_client_credentials_1);
	printf("oauth_access_token_request_client_credentials :\n%s\n", cJSON_Print(jsonoauth_access_token_request_client_credentials_1));
	oauth_access_token_request_client_credentials_t* oauth_access_token_request_client_credentials_2 = oauth_access_token_request_client_credentials_parseFromJSON(jsonoauth_access_token_request_client_credentials_1);
	cJSON* jsonoauth_access_token_request_client_credentials_2 = oauth_access_token_request_client_credentials_convertToJSON(oauth_access_token_request_client_credentials_2);
	printf("repeating oauth_access_token_request_client_credentials:\n%s\n", cJSON_Print(jsonoauth_access_token_request_client_credentials_2));
}

int main() {
  test_oauth_access_token_request_client_credentials(1);
  test_oauth_access_token_request_client_credentials(0);

  printf("Hello world \n");
  return 0;
}

#endif // oauth_access_token_request_client_credentials_MAIN
#endif // oauth_access_token_request_client_credentials_TEST
