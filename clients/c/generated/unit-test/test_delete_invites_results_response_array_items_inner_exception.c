#ifndef delete_invites_results_response_array_items_inner_exception_TEST
#define delete_invites_results_response_array_items_inner_exception_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_invites_results_response_array_items_inner_exception_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_invites_results_response_array_items_inner_exception.h"
delete_invites_results_response_array_items_inner_exception_t* instantiate_delete_invites_results_response_array_items_inner_exception(int include_optional);



delete_invites_results_response_array_items_inner_exception_t* instantiate_delete_invites_results_response_array_items_inner_exception(int include_optional) {
  delete_invites_results_response_array_items_inner_exception_t* delete_invites_results_response_array_items_inner_exception = NULL;
  if (include_optional) {
    delete_invites_results_response_array_items_inner_exception = delete_invites_results_response_array_items_inner_exception_create(
      "a",
      "Business Invite request cannot be performed on current invitation status."
    );
  } else {
    delete_invites_results_response_array_items_inner_exception = delete_invites_results_response_array_items_inner_exception_create(
      "a",
      "Business Invite request cannot be performed on current invitation status."
    );
  }

  return delete_invites_results_response_array_items_inner_exception;
}


#ifdef delete_invites_results_response_array_items_inner_exception_MAIN

void test_delete_invites_results_response_array_items_inner_exception(int include_optional) {
    delete_invites_results_response_array_items_inner_exception_t* delete_invites_results_response_array_items_inner_exception_1 = instantiate_delete_invites_results_response_array_items_inner_exception(include_optional);

	cJSON* jsondelete_invites_results_response_array_items_inner_exception_1 = delete_invites_results_response_array_items_inner_exception_convertToJSON(delete_invites_results_response_array_items_inner_exception_1);
	printf("delete_invites_results_response_array_items_inner_exception :\n%s\n", cJSON_Print(jsondelete_invites_results_response_array_items_inner_exception_1));
	delete_invites_results_response_array_items_inner_exception_t* delete_invites_results_response_array_items_inner_exception_2 = delete_invites_results_response_array_items_inner_exception_parseFromJSON(jsondelete_invites_results_response_array_items_inner_exception_1);
	cJSON* jsondelete_invites_results_response_array_items_inner_exception_2 = delete_invites_results_response_array_items_inner_exception_convertToJSON(delete_invites_results_response_array_items_inner_exception_2);
	printf("repeating delete_invites_results_response_array_items_inner_exception:\n%s\n", cJSON_Print(jsondelete_invites_results_response_array_items_inner_exception_2));
}

int main() {
  test_delete_invites_results_response_array_items_inner_exception(1);
  test_delete_invites_results_response_array_items_inner_exception(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_invites_results_response_array_items_inner_exception_MAIN
#endif // delete_invites_results_response_array_items_inner_exception_TEST
