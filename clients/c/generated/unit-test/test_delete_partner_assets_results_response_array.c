#ifndef delete_partner_assets_results_response_array_TEST
#define delete_partner_assets_results_response_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_partner_assets_results_response_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_partner_assets_results_response_array.h"
delete_partner_assets_results_response_array_t* instantiate_delete_partner_assets_results_response_array(int include_optional);



delete_partner_assets_results_response_array_t* instantiate_delete_partner_assets_results_response_array(int include_optional) {
  delete_partner_assets_results_response_array_t* delete_partner_assets_results_response_array = NULL;
  if (include_optional) {
    delete_partner_assets_results_response_array = delete_partner_assets_results_response_array_create(
      list_createList()
    );
  } else {
    delete_partner_assets_results_response_array = delete_partner_assets_results_response_array_create(
      list_createList()
    );
  }

  return delete_partner_assets_results_response_array;
}


#ifdef delete_partner_assets_results_response_array_MAIN

void test_delete_partner_assets_results_response_array(int include_optional) {
    delete_partner_assets_results_response_array_t* delete_partner_assets_results_response_array_1 = instantiate_delete_partner_assets_results_response_array(include_optional);

	cJSON* jsondelete_partner_assets_results_response_array_1 = delete_partner_assets_results_response_array_convertToJSON(delete_partner_assets_results_response_array_1);
	printf("delete_partner_assets_results_response_array :\n%s\n", cJSON_Print(jsondelete_partner_assets_results_response_array_1));
	delete_partner_assets_results_response_array_t* delete_partner_assets_results_response_array_2 = delete_partner_assets_results_response_array_parseFromJSON(jsondelete_partner_assets_results_response_array_1);
	cJSON* jsondelete_partner_assets_results_response_array_2 = delete_partner_assets_results_response_array_convertToJSON(delete_partner_assets_results_response_array_2);
	printf("repeating delete_partner_assets_results_response_array:\n%s\n", cJSON_Print(jsondelete_partner_assets_results_response_array_2));
}

int main() {
  test_delete_partner_assets_results_response_array(1);
  test_delete_partner_assets_results_response_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_partner_assets_results_response_array_MAIN
#endif // delete_partner_assets_results_response_array_TEST
