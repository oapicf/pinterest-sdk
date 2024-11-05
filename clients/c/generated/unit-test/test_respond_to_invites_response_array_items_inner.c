#ifndef respond_to_invites_response_array_items_inner_TEST
#define respond_to_invites_response_array_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define respond_to_invites_response_array_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/respond_to_invites_response_array_items_inner.h"
respond_to_invites_response_array_items_inner_t* instantiate_respond_to_invites_response_array_items_inner(int include_optional);

#include "test_invite_exception_response.c"
#include "test_base_invite_data_response.c"


respond_to_invites_response_array_items_inner_t* instantiate_respond_to_invites_response_array_items_inner(int include_optional) {
  respond_to_invites_response_array_items_inner_t* respond_to_invites_response_array_items_inner = NULL;
  if (include_optional) {
    respond_to_invites_response_array_items_inner = respond_to_invites_response_array_items_inner_create(
       // false, not to have infinite recursion
      instantiate_invite_exception_response(0),
       // false, not to have infinite recursion
      instantiate_base_invite_data_response(0)
    );
  } else {
    respond_to_invites_response_array_items_inner = respond_to_invites_response_array_items_inner_create(
      NULL,
      NULL
    );
  }

  return respond_to_invites_response_array_items_inner;
}


#ifdef respond_to_invites_response_array_items_inner_MAIN

void test_respond_to_invites_response_array_items_inner(int include_optional) {
    respond_to_invites_response_array_items_inner_t* respond_to_invites_response_array_items_inner_1 = instantiate_respond_to_invites_response_array_items_inner(include_optional);

	cJSON* jsonrespond_to_invites_response_array_items_inner_1 = respond_to_invites_response_array_items_inner_convertToJSON(respond_to_invites_response_array_items_inner_1);
	printf("respond_to_invites_response_array_items_inner :\n%s\n", cJSON_Print(jsonrespond_to_invites_response_array_items_inner_1));
	respond_to_invites_response_array_items_inner_t* respond_to_invites_response_array_items_inner_2 = respond_to_invites_response_array_items_inner_parseFromJSON(jsonrespond_to_invites_response_array_items_inner_1);
	cJSON* jsonrespond_to_invites_response_array_items_inner_2 = respond_to_invites_response_array_items_inner_convertToJSON(respond_to_invites_response_array_items_inner_2);
	printf("repeating respond_to_invites_response_array_items_inner:\n%s\n", cJSON_Print(jsonrespond_to_invites_response_array_items_inner_2));
}

int main() {
  test_respond_to_invites_response_array_items_inner(1);
  test_respond_to_invites_response_array_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // respond_to_invites_response_array_items_inner_MAIN
#endif // respond_to_invites_response_array_items_inner_TEST
