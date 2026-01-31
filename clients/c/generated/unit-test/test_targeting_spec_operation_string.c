#ifndef targeting_spec_operation_string_TEST
#define targeting_spec_operation_string_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_operation_string_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_operation_string.h"
targeting_spec_operation_string_t* instantiate_targeting_spec_operation_string(int include_optional);



targeting_spec_operation_string_t* instantiate_targeting_spec_operation_string(int include_optional) {
  targeting_spec_operation_string_t* targeting_spec_operation_string = NULL;
  if (include_optional) {
    targeting_spec_operation_string = targeting_spec_operation_string_create(
      "0",
      pinterest_rest_api_targeting_spec_operation_string_OPERATION_SET,
      "0"
    );
  } else {
    targeting_spec_operation_string = targeting_spec_operation_string_create(
      "0",
      pinterest_rest_api_targeting_spec_operation_string_OPERATION_SET,
      "0"
    );
  }

  return targeting_spec_operation_string;
}


#ifdef targeting_spec_operation_string_MAIN

void test_targeting_spec_operation_string(int include_optional) {
    targeting_spec_operation_string_t* targeting_spec_operation_string_1 = instantiate_targeting_spec_operation_string(include_optional);

	cJSON* jsontargeting_spec_operation_string_1 = targeting_spec_operation_string_convertToJSON(targeting_spec_operation_string_1);
	printf("targeting_spec_operation_string :\n%s\n", cJSON_Print(jsontargeting_spec_operation_string_1));
	targeting_spec_operation_string_t* targeting_spec_operation_string_2 = targeting_spec_operation_string_parseFromJSON(jsontargeting_spec_operation_string_1);
	cJSON* jsontargeting_spec_operation_string_2 = targeting_spec_operation_string_convertToJSON(targeting_spec_operation_string_2);
	printf("repeating targeting_spec_operation_string:\n%s\n", cJSON_Print(jsontargeting_spec_operation_string_2));
}

int main() {
  test_targeting_spec_operation_string(1);
  test_targeting_spec_operation_string(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_operation_string_MAIN
#endif // targeting_spec_operation_string_TEST
