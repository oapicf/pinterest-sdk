#ifndef update_member_assets_results_response_array_TEST
#define update_member_assets_results_response_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define update_member_assets_results_response_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/update_member_assets_results_response_array.h"
update_member_assets_results_response_array_t* instantiate_update_member_assets_results_response_array(int include_optional);



update_member_assets_results_response_array_t* instantiate_update_member_assets_results_response_array(int include_optional) {
  update_member_assets_results_response_array_t* update_member_assets_results_response_array = NULL;
  if (include_optional) {
    update_member_assets_results_response_array = update_member_assets_results_response_array_create(
      list_createList()
    );
  } else {
    update_member_assets_results_response_array = update_member_assets_results_response_array_create(
      list_createList()
    );
  }

  return update_member_assets_results_response_array;
}


#ifdef update_member_assets_results_response_array_MAIN

void test_update_member_assets_results_response_array(int include_optional) {
    update_member_assets_results_response_array_t* update_member_assets_results_response_array_1 = instantiate_update_member_assets_results_response_array(include_optional);

	cJSON* jsonupdate_member_assets_results_response_array_1 = update_member_assets_results_response_array_convertToJSON(update_member_assets_results_response_array_1);
	printf("update_member_assets_results_response_array :\n%s\n", cJSON_Print(jsonupdate_member_assets_results_response_array_1));
	update_member_assets_results_response_array_t* update_member_assets_results_response_array_2 = update_member_assets_results_response_array_parseFromJSON(jsonupdate_member_assets_results_response_array_1);
	cJSON* jsonupdate_member_assets_results_response_array_2 = update_member_assets_results_response_array_convertToJSON(update_member_assets_results_response_array_2);
	printf("repeating update_member_assets_results_response_array:\n%s\n", cJSON_Print(jsonupdate_member_assets_results_response_array_2));
}

int main() {
  test_update_member_assets_results_response_array(1);
  test_update_member_assets_results_response_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // update_member_assets_results_response_array_MAIN
#endif // update_member_assets_results_response_array_TEST
