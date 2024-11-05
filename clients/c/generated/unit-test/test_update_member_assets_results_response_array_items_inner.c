#ifndef update_member_assets_results_response_array_items_inner_TEST
#define update_member_assets_results_response_array_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_member_assets_results_response_array_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_member_assets_results_response_array_items_inner.h"
update_member_assets_results_response_array_items_inner_t* instantiate_update_member_assets_results_response_array_items_inner(int include_optional);

#include "test_users_for_individual_asset_response.c"


update_member_assets_results_response_array_items_inner_t* instantiate_update_member_assets_results_response_array_items_inner(int include_optional) {
  update_member_assets_results_response_array_items_inner_t* update_member_assets_results_response_array_items_inner = NULL;
  if (include_optional) {
    update_member_assets_results_response_array_items_inner = update_member_assets_results_response_array_items_inner_create(
       // false, not to have infinite recursion
      instantiate_users_for_individual_asset_response(0)
    );
  } else {
    update_member_assets_results_response_array_items_inner = update_member_assets_results_response_array_items_inner_create(
      NULL
    );
  }

  return update_member_assets_results_response_array_items_inner;
}


#ifdef update_member_assets_results_response_array_items_inner_MAIN

void test_update_member_assets_results_response_array_items_inner(int include_optional) {
    update_member_assets_results_response_array_items_inner_t* update_member_assets_results_response_array_items_inner_1 = instantiate_update_member_assets_results_response_array_items_inner(include_optional);

	cJSON* jsonupdate_member_assets_results_response_array_items_inner_1 = update_member_assets_results_response_array_items_inner_convertToJSON(update_member_assets_results_response_array_items_inner_1);
	printf("update_member_assets_results_response_array_items_inner :\n%s\n", cJSON_Print(jsonupdate_member_assets_results_response_array_items_inner_1));
	update_member_assets_results_response_array_items_inner_t* update_member_assets_results_response_array_items_inner_2 = update_member_assets_results_response_array_items_inner_parseFromJSON(jsonupdate_member_assets_results_response_array_items_inner_1);
	cJSON* jsonupdate_member_assets_results_response_array_items_inner_2 = update_member_assets_results_response_array_items_inner_convertToJSON(update_member_assets_results_response_array_items_inner_2);
	printf("repeating update_member_assets_results_response_array_items_inner:\n%s\n", cJSON_Print(jsonupdate_member_assets_results_response_array_items_inner_2));
}

int main() {
  test_update_member_assets_results_response_array_items_inner(1);
  test_update_member_assets_results_response_array_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_member_assets_results_response_array_items_inner_MAIN
#endif // update_member_assets_results_response_array_items_inner_TEST
