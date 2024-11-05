#ifndef delete_member_access_results_response_array_TEST
#define delete_member_access_results_response_array_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delete_member_access_results_response_array_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delete_member_access_results_response_array.h"
delete_member_access_results_response_array_t* instantiate_delete_member_access_results_response_array(int include_optional);



delete_member_access_results_response_array_t* instantiate_delete_member_access_results_response_array(int include_optional) {
  delete_member_access_results_response_array_t* delete_member_access_results_response_array = NULL;
  if (include_optional) {
    delete_member_access_results_response_array = delete_member_access_results_response_array_create(
      list_createList()
    );
  } else {
    delete_member_access_results_response_array = delete_member_access_results_response_array_create(
      list_createList()
    );
  }

  return delete_member_access_results_response_array;
}


#ifdef delete_member_access_results_response_array_MAIN

void test_delete_member_access_results_response_array(int include_optional) {
    delete_member_access_results_response_array_t* delete_member_access_results_response_array_1 = instantiate_delete_member_access_results_response_array(include_optional);

	cJSON* jsondelete_member_access_results_response_array_1 = delete_member_access_results_response_array_convertToJSON(delete_member_access_results_response_array_1);
	printf("delete_member_access_results_response_array :\n%s\n", cJSON_Print(jsondelete_member_access_results_response_array_1));
	delete_member_access_results_response_array_t* delete_member_access_results_response_array_2 = delete_member_access_results_response_array_parseFromJSON(jsondelete_member_access_results_response_array_1);
	cJSON* jsondelete_member_access_results_response_array_2 = delete_member_access_results_response_array_convertToJSON(delete_member_access_results_response_array_2);
	printf("repeating delete_member_access_results_response_array:\n%s\n", cJSON_Print(jsondelete_member_access_results_response_array_2));
}

int main() {
  test_delete_member_access_results_response_array(1);
  test_delete_member_access_results_response_array(0);

  printf("Hello world \n");
  return 0;
}

#endif // delete_member_access_results_response_array_MAIN
#endif // delete_member_access_results_response_array_TEST
