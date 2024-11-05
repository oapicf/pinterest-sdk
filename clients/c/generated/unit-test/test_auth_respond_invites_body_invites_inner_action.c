#ifndef auth_respond_invites_body_invites_inner_action_TEST
#define auth_respond_invites_body_invites_inner_action_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define auth_respond_invites_body_invites_inner_action_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/auth_respond_invites_body_invites_inner_action.h"
auth_respond_invites_body_invites_inner_action_t* instantiate_auth_respond_invites_body_invites_inner_action(int include_optional);



auth_respond_invites_body_invites_inner_action_t* instantiate_auth_respond_invites_body_invites_inner_action(int include_optional) {
  auth_respond_invites_body_invites_inner_action_t* auth_respond_invites_body_invites_inner_action = NULL;
  if (include_optional) {
    auth_respond_invites_body_invites_inner_action = auth_respond_invites_body_invites_inner_action_create(
      1,
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  } else {
    auth_respond_invites_body_invites_inner_action = auth_respond_invites_body_invites_inner_action_create(
      1,
      {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}
    );
  }

  return auth_respond_invites_body_invites_inner_action;
}


#ifdef auth_respond_invites_body_invites_inner_action_MAIN

void test_auth_respond_invites_body_invites_inner_action(int include_optional) {
    auth_respond_invites_body_invites_inner_action_t* auth_respond_invites_body_invites_inner_action_1 = instantiate_auth_respond_invites_body_invites_inner_action(include_optional);

	cJSON* jsonauth_respond_invites_body_invites_inner_action_1 = auth_respond_invites_body_invites_inner_action_convertToJSON(auth_respond_invites_body_invites_inner_action_1);
	printf("auth_respond_invites_body_invites_inner_action :\n%s\n", cJSON_Print(jsonauth_respond_invites_body_invites_inner_action_1));
	auth_respond_invites_body_invites_inner_action_t* auth_respond_invites_body_invites_inner_action_2 = auth_respond_invites_body_invites_inner_action_parseFromJSON(jsonauth_respond_invites_body_invites_inner_action_1);
	cJSON* jsonauth_respond_invites_body_invites_inner_action_2 = auth_respond_invites_body_invites_inner_action_convertToJSON(auth_respond_invites_body_invites_inner_action_2);
	printf("repeating auth_respond_invites_body_invites_inner_action:\n%s\n", cJSON_Print(jsonauth_respond_invites_body_invites_inner_action_2));
}

int main() {
  test_auth_respond_invites_body_invites_inner_action(1);
  test_auth_respond_invites_body_invites_inner_action(0);

  printf("Hello world \n");
  return 0;
}

#endif // auth_respond_invites_body_invites_inner_action_MAIN
#endif // auth_respond_invites_body_invites_inner_action_TEST
