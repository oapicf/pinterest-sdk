#ifndef update_invites_results_response_array_items_inner_TEST
#define update_invites_results_response_array_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_invites_results_response_array_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_invites_results_response_array_items_inner.h"
update_invites_results_response_array_items_inner_t* instantiate_update_invites_results_response_array_items_inner(int include_optional);

#include "test_invite_exception_response.c"
#include "test_invite_business_role_binding.c"


update_invites_results_response_array_items_inner_t* instantiate_update_invites_results_response_array_items_inner(int include_optional) {
  update_invites_results_response_array_items_inner_t* update_invites_results_response_array_items_inner = NULL;
  if (include_optional) {
    update_invites_results_response_array_items_inner = update_invites_results_response_array_items_inner_create(
       // false, not to have infinite recursion
      instantiate_invite_exception_response(0),
       // false, not to have infinite recursion
      instantiate_invite_business_role_binding(0)
    );
  } else {
    update_invites_results_response_array_items_inner = update_invites_results_response_array_items_inner_create(
      NULL,
      NULL
    );
  }

  return update_invites_results_response_array_items_inner;
}


#ifdef update_invites_results_response_array_items_inner_MAIN

void test_update_invites_results_response_array_items_inner(int include_optional) {
    update_invites_results_response_array_items_inner_t* update_invites_results_response_array_items_inner_1 = instantiate_update_invites_results_response_array_items_inner(include_optional);

	cJSON* jsonupdate_invites_results_response_array_items_inner_1 = update_invites_results_response_array_items_inner_convertToJSON(update_invites_results_response_array_items_inner_1);
	printf("update_invites_results_response_array_items_inner :\n%s\n", cJSON_Print(jsonupdate_invites_results_response_array_items_inner_1));
	update_invites_results_response_array_items_inner_t* update_invites_results_response_array_items_inner_2 = update_invites_results_response_array_items_inner_parseFromJSON(jsonupdate_invites_results_response_array_items_inner_1);
	cJSON* jsonupdate_invites_results_response_array_items_inner_2 = update_invites_results_response_array_items_inner_convertToJSON(update_invites_results_response_array_items_inner_2);
	printf("repeating update_invites_results_response_array_items_inner:\n%s\n", cJSON_Print(jsonupdate_invites_results_response_array_items_inner_2));
}

int main() {
  test_update_invites_results_response_array_items_inner(1);
  test_update_invites_results_response_array_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_invites_results_response_array_items_inner_MAIN
#endif // update_invites_results_response_array_items_inner_TEST
