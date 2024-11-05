#ifndef create_invites_results_response_array_items_inner_invite_TEST
#define create_invites_results_response_array_items_inner_invite_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_invites_results_response_array_items_inner_invite_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_invites_results_response_array_items_inner_invite.h"
create_invites_results_response_array_items_inner_invite_t* instantiate_create_invites_results_response_array_items_inner_invite(int include_optional);

#include "test_business_access_user_summary.c"


create_invites_results_response_array_items_inner_invite_t* instantiate_create_invites_results_response_array_items_inner_invite(int include_optional) {
  create_invites_results_response_array_items_inner_invite_t* create_invites_results_response_array_items_inner_invite = NULL;
  if (include_optional) {
    create_invites_results_response_array_items_inner_invite = create_invites_results_response_array_items_inner_invite_create(
      "383791336903426391",
       // false, not to have infinite recursion
      instantiate_business_access_user_summary(0)
    );
  } else {
    create_invites_results_response_array_items_inner_invite = create_invites_results_response_array_items_inner_invite_create(
      "383791336903426391",
      NULL
    );
  }

  return create_invites_results_response_array_items_inner_invite;
}


#ifdef create_invites_results_response_array_items_inner_invite_MAIN

void test_create_invites_results_response_array_items_inner_invite(int include_optional) {
    create_invites_results_response_array_items_inner_invite_t* create_invites_results_response_array_items_inner_invite_1 = instantiate_create_invites_results_response_array_items_inner_invite(include_optional);

	cJSON* jsoncreate_invites_results_response_array_items_inner_invite_1 = create_invites_results_response_array_items_inner_invite_convertToJSON(create_invites_results_response_array_items_inner_invite_1);
	printf("create_invites_results_response_array_items_inner_invite :\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_items_inner_invite_1));
	create_invites_results_response_array_items_inner_invite_t* create_invites_results_response_array_items_inner_invite_2 = create_invites_results_response_array_items_inner_invite_parseFromJSON(jsoncreate_invites_results_response_array_items_inner_invite_1);
	cJSON* jsoncreate_invites_results_response_array_items_inner_invite_2 = create_invites_results_response_array_items_inner_invite_convertToJSON(create_invites_results_response_array_items_inner_invite_2);
	printf("repeating create_invites_results_response_array_items_inner_invite:\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_items_inner_invite_2));
}

int main() {
  test_create_invites_results_response_array_items_inner_invite(1);
  test_create_invites_results_response_array_items_inner_invite(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_invites_results_response_array_items_inner_invite_MAIN
#endif // create_invites_results_response_array_items_inner_invite_TEST
