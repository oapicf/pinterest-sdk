#ifndef targeting_spec_operation_list_TEST
#define targeting_spec_operation_list_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_operation_list_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_operation_list.h"
targeting_spec_operation_list_t* instantiate_targeting_spec_operation_list(int include_optional);



targeting_spec_operation_list_t* instantiate_targeting_spec_operation_list(int include_optional) {
  targeting_spec_operation_list_t* targeting_spec_operation_list = NULL;
  if (include_optional) {
    targeting_spec_operation_list = targeting_spec_operation_list_create(
      "0",
      pinterest_rest_api_targeting_spec_operation_list_OPERATION_SET,
      list_createList()
    );
  } else {
    targeting_spec_operation_list = targeting_spec_operation_list_create(
      "0",
      pinterest_rest_api_targeting_spec_operation_list_OPERATION_SET,
      list_createList()
    );
  }

  return targeting_spec_operation_list;
}


#ifdef targeting_spec_operation_list_MAIN

void test_targeting_spec_operation_list(int include_optional) {
    targeting_spec_operation_list_t* targeting_spec_operation_list_1 = instantiate_targeting_spec_operation_list(include_optional);

	cJSON* jsontargeting_spec_operation_list_1 = targeting_spec_operation_list_convertToJSON(targeting_spec_operation_list_1);
	printf("targeting_spec_operation_list :\n%s\n", cJSON_Print(jsontargeting_spec_operation_list_1));
	targeting_spec_operation_list_t* targeting_spec_operation_list_2 = targeting_spec_operation_list_parseFromJSON(jsontargeting_spec_operation_list_1);
	cJSON* jsontargeting_spec_operation_list_2 = targeting_spec_operation_list_convertToJSON(targeting_spec_operation_list_2);
	printf("repeating targeting_spec_operation_list:\n%s\n", cJSON_Print(jsontargeting_spec_operation_list_2));
}

int main() {
  test_targeting_spec_operation_list(1);
  test_targeting_spec_operation_list(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_operation_list_MAIN
#endif // targeting_spec_operation_list_TEST
