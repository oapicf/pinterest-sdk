#ifndef auth_respond_invites_body_invites_inner_TEST
#define auth_respond_invites_body_invites_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define auth_respond_invites_body_invites_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/auth_respond_invites_body_invites_inner.h"
auth_respond_invites_body_invites_inner_t* instantiate_auth_respond_invites_body_invites_inner(int include_optional);

#include "test_auth_respond_invites_body_invites_inner_action.c"


auth_respond_invites_body_invites_inner_t* instantiate_auth_respond_invites_body_invites_inner(int include_optional) {
  auth_respond_invites_body_invites_inner_t* auth_respond_invites_body_invites_inner = NULL;
  if (include_optional) {
    auth_respond_invites_body_invites_inner = auth_respond_invites_body_invites_inner_create(
       // false, not to have infinite recursion
      instantiate_auth_respond_invites_body_invites_inner_action(0),
      "a"
    );
  } else {
    auth_respond_invites_body_invites_inner = auth_respond_invites_body_invites_inner_create(
      NULL,
      "a"
    );
  }

  return auth_respond_invites_body_invites_inner;
}


#ifdef auth_respond_invites_body_invites_inner_MAIN

void test_auth_respond_invites_body_invites_inner(int include_optional) {
    auth_respond_invites_body_invites_inner_t* auth_respond_invites_body_invites_inner_1 = instantiate_auth_respond_invites_body_invites_inner(include_optional);

	cJSON* jsonauth_respond_invites_body_invites_inner_1 = auth_respond_invites_body_invites_inner_convertToJSON(auth_respond_invites_body_invites_inner_1);
	printf("auth_respond_invites_body_invites_inner :\n%s\n", cJSON_Print(jsonauth_respond_invites_body_invites_inner_1));
	auth_respond_invites_body_invites_inner_t* auth_respond_invites_body_invites_inner_2 = auth_respond_invites_body_invites_inner_parseFromJSON(jsonauth_respond_invites_body_invites_inner_1);
	cJSON* jsonauth_respond_invites_body_invites_inner_2 = auth_respond_invites_body_invites_inner_convertToJSON(auth_respond_invites_body_invites_inner_2);
	printf("repeating auth_respond_invites_body_invites_inner:\n%s\n", cJSON_Print(jsonauth_respond_invites_body_invites_inner_2));
}

int main() {
  test_auth_respond_invites_body_invites_inner(1);
  test_auth_respond_invites_body_invites_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // auth_respond_invites_body_invites_inner_MAIN
#endif // auth_respond_invites_body_invites_inner_TEST
