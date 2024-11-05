#ifndef delete_invites_results_response_array_items_inner_TEST
#define delete_invites_results_response_array_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_invites_results_response_array_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_invites_results_response_array_items_inner.h"
delete_invites_results_response_array_items_inner_t* instantiate_delete_invites_results_response_array_items_inner(int include_optional);

#include "test_delete_invites_results_response_array_items_inner_exception.c"
#include "test_base_invite_data_response.c"


delete_invites_results_response_array_items_inner_t* instantiate_delete_invites_results_response_array_items_inner(int include_optional) {
  delete_invites_results_response_array_items_inner_t* delete_invites_results_response_array_items_inner = NULL;
  if (include_optional) {
    delete_invites_results_response_array_items_inner = delete_invites_results_response_array_items_inner_create(
       // false, not to have infinite recursion
      instantiate_delete_invites_results_response_array_items_inner_exception(0),
       // false, not to have infinite recursion
      instantiate_base_invite_data_response(0)
    );
  } else {
    delete_invites_results_response_array_items_inner = delete_invites_results_response_array_items_inner_create(
      NULL,
      NULL
    );
  }

  return delete_invites_results_response_array_items_inner;
}


#ifdef delete_invites_results_response_array_items_inner_MAIN

void test_delete_invites_results_response_array_items_inner(int include_optional) {
    delete_invites_results_response_array_items_inner_t* delete_invites_results_response_array_items_inner_1 = instantiate_delete_invites_results_response_array_items_inner(include_optional);

	cJSON* jsondelete_invites_results_response_array_items_inner_1 = delete_invites_results_response_array_items_inner_convertToJSON(delete_invites_results_response_array_items_inner_1);
	printf("delete_invites_results_response_array_items_inner :\n%s\n", cJSON_Print(jsondelete_invites_results_response_array_items_inner_1));
	delete_invites_results_response_array_items_inner_t* delete_invites_results_response_array_items_inner_2 = delete_invites_results_response_array_items_inner_parseFromJSON(jsondelete_invites_results_response_array_items_inner_1);
	cJSON* jsondelete_invites_results_response_array_items_inner_2 = delete_invites_results_response_array_items_inner_convertToJSON(delete_invites_results_response_array_items_inner_2);
	printf("repeating delete_invites_results_response_array_items_inner:\n%s\n", cJSON_Print(jsondelete_invites_results_response_array_items_inner_2));
}

int main() {
  test_delete_invites_results_response_array_items_inner(1);
  test_delete_invites_results_response_array_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_invites_results_response_array_items_inner_MAIN
#endif // delete_invites_results_response_array_items_inner_TEST
