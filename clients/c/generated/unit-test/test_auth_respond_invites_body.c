#ifndef auth_respond_invites_body_TEST
#define auth_respond_invites_body_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define auth_respond_invites_body_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/auth_respond_invites_body.h"
auth_respond_invites_body_t* instantiate_auth_respond_invites_body(int include_optional);



auth_respond_invites_body_t* instantiate_auth_respond_invites_body(int include_optional) {
  auth_respond_invites_body_t* auth_respond_invites_body = NULL;
  if (include_optional) {
    auth_respond_invites_body = auth_respond_invites_body_create(
      list_createList()
    );
  } else {
    auth_respond_invites_body = auth_respond_invites_body_create(
      list_createList()
    );
  }

  return auth_respond_invites_body;
}


#ifdef auth_respond_invites_body_MAIN

void test_auth_respond_invites_body(int include_optional) {
    auth_respond_invites_body_t* auth_respond_invites_body_1 = instantiate_auth_respond_invites_body(include_optional);

	cJSON* jsonauth_respond_invites_body_1 = auth_respond_invites_body_convertToJSON(auth_respond_invites_body_1);
	printf("auth_respond_invites_body :\n%s\n", cJSON_Print(jsonauth_respond_invites_body_1));
	auth_respond_invites_body_t* auth_respond_invites_body_2 = auth_respond_invites_body_parseFromJSON(jsonauth_respond_invites_body_1);
	cJSON* jsonauth_respond_invites_body_2 = auth_respond_invites_body_convertToJSON(auth_respond_invites_body_2);
	printf("repeating auth_respond_invites_body:\n%s\n", cJSON_Print(jsonauth_respond_invites_body_2));
}

int main() {
  test_auth_respond_invites_body(1);
  test_auth_respond_invites_body(0);

  printf("Hello world \n");
  return 0;
}

#endif // auth_respond_invites_body_MAIN
#endif // auth_respond_invites_body_TEST
