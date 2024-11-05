#ifndef create_invites_results_response_array_items_inner_TEST
#define create_invites_results_response_array_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define create_invites_results_response_array_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/create_invites_results_response_array_items_inner.h"
create_invites_results_response_array_items_inner_t* instantiate_create_invites_results_response_array_items_inner(int include_optional);

#include "test_invite_exception_response.c"
#include "test_create_invites_results_response_array_items_inner_invite.c"


create_invites_results_response_array_items_inner_t* instantiate_create_invites_results_response_array_items_inner(int include_optional) {
  create_invites_results_response_array_items_inner_t* create_invites_results_response_array_items_inner = NULL;
  if (include_optional) {
    create_invites_results_response_array_items_inner = create_invites_results_response_array_items_inner_create(
       // false, not to have infinite recursion
      instantiate_invite_exception_response(0),
       // false, not to have infinite recursion
      instantiate_create_invites_results_response_array_items_inner_invite(0)
    );
  } else {
    create_invites_results_response_array_items_inner = create_invites_results_response_array_items_inner_create(
      NULL,
      NULL
    );
  }

  return create_invites_results_response_array_items_inner;
}


#ifdef create_invites_results_response_array_items_inner_MAIN

void test_create_invites_results_response_array_items_inner(int include_optional) {
    create_invites_results_response_array_items_inner_t* create_invites_results_response_array_items_inner_1 = instantiate_create_invites_results_response_array_items_inner(include_optional);

	cJSON* jsoncreate_invites_results_response_array_items_inner_1 = create_invites_results_response_array_items_inner_convertToJSON(create_invites_results_response_array_items_inner_1);
	printf("create_invites_results_response_array_items_inner :\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_items_inner_1));
	create_invites_results_response_array_items_inner_t* create_invites_results_response_array_items_inner_2 = create_invites_results_response_array_items_inner_parseFromJSON(jsoncreate_invites_results_response_array_items_inner_1);
	cJSON* jsoncreate_invites_results_response_array_items_inner_2 = create_invites_results_response_array_items_inner_convertToJSON(create_invites_results_response_array_items_inner_2);
	printf("repeating create_invites_results_response_array_items_inner:\n%s\n", cJSON_Print(jsoncreate_invites_results_response_array_items_inner_2));
}

int main() {
  test_create_invites_results_response_array_items_inner(1);
  test_create_invites_results_response_array_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // create_invites_results_response_array_items_inner_MAIN
#endif // create_invites_results_response_array_items_inner_TEST
