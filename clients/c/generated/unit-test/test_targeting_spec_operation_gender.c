#ifndef targeting_spec_operation_gender_TEST
#define targeting_spec_operation_gender_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_operation_gender_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_operation_gender.h"
targeting_spec_operation_gender_t* instantiate_targeting_spec_operation_gender(int include_optional);



targeting_spec_operation_gender_t* instantiate_targeting_spec_operation_gender(int include_optional) {
  targeting_spec_operation_gender_t* targeting_spec_operation_gender = NULL;
  if (include_optional) {
    targeting_spec_operation_gender = targeting_spec_operation_gender_create(
      pinterest_rest_api_targeting_spec_operation_gender_FIELD_GENDER,
      pinterest_rest_api_targeting_spec_operation_gender_OPERATION_SET,
      list_createList()
    );
  } else {
    targeting_spec_operation_gender = targeting_spec_operation_gender_create(
      pinterest_rest_api_targeting_spec_operation_gender_FIELD_GENDER,
      pinterest_rest_api_targeting_spec_operation_gender_OPERATION_SET,
      list_createList()
    );
  }

  return targeting_spec_operation_gender;
}


#ifdef targeting_spec_operation_gender_MAIN

void test_targeting_spec_operation_gender(int include_optional) {
    targeting_spec_operation_gender_t* targeting_spec_operation_gender_1 = instantiate_targeting_spec_operation_gender(include_optional);

	cJSON* jsontargeting_spec_operation_gender_1 = targeting_spec_operation_gender_convertToJSON(targeting_spec_operation_gender_1);
	printf("targeting_spec_operation_gender :\n%s\n", cJSON_Print(jsontargeting_spec_operation_gender_1));
	targeting_spec_operation_gender_t* targeting_spec_operation_gender_2 = targeting_spec_operation_gender_parseFromJSON(jsontargeting_spec_operation_gender_1);
	cJSON* jsontargeting_spec_operation_gender_2 = targeting_spec_operation_gender_convertToJSON(targeting_spec_operation_gender_2);
	printf("repeating targeting_spec_operation_gender:\n%s\n", cJSON_Print(jsontargeting_spec_operation_gender_2));
}

int main() {
  test_targeting_spec_operation_gender(1);
  test_targeting_spec_operation_gender(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_operation_gender_MAIN
#endif // targeting_spec_operation_gender_TEST
