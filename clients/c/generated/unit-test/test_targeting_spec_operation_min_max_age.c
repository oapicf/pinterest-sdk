#ifndef targeting_spec_operation_min_max_age_TEST
#define targeting_spec_operation_min_max_age_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_operation_min_max_age_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_operation_min_max_age.h"
targeting_spec_operation_min_max_age_t* instantiate_targeting_spec_operation_min_max_age(int include_optional);



targeting_spec_operation_min_max_age_t* instantiate_targeting_spec_operation_min_max_age(int include_optional) {
  targeting_spec_operation_min_max_age_t* targeting_spec_operation_min_max_age = NULL;
  if (include_optional) {
    targeting_spec_operation_min_max_age = targeting_spec_operation_min_max_age_create(
      pinterest_rest_api_targeting_spec_operation_min_max_age_FIELD_MINIMUM_AGE,
      pinterest_rest_api_targeting_spec_operation_min_max_age_OPERATION_SET,
      "a"
    );
  } else {
    targeting_spec_operation_min_max_age = targeting_spec_operation_min_max_age_create(
      pinterest_rest_api_targeting_spec_operation_min_max_age_FIELD_MINIMUM_AGE,
      pinterest_rest_api_targeting_spec_operation_min_max_age_OPERATION_SET,
      "a"
    );
  }

  return targeting_spec_operation_min_max_age;
}


#ifdef targeting_spec_operation_min_max_age_MAIN

void test_targeting_spec_operation_min_max_age(int include_optional) {
    targeting_spec_operation_min_max_age_t* targeting_spec_operation_min_max_age_1 = instantiate_targeting_spec_operation_min_max_age(include_optional);

	cJSON* jsontargeting_spec_operation_min_max_age_1 = targeting_spec_operation_min_max_age_convertToJSON(targeting_spec_operation_min_max_age_1);
	printf("targeting_spec_operation_min_max_age :\n%s\n", cJSON_Print(jsontargeting_spec_operation_min_max_age_1));
	targeting_spec_operation_min_max_age_t* targeting_spec_operation_min_max_age_2 = targeting_spec_operation_min_max_age_parseFromJSON(jsontargeting_spec_operation_min_max_age_1);
	cJSON* jsontargeting_spec_operation_min_max_age_2 = targeting_spec_operation_min_max_age_convertToJSON(targeting_spec_operation_min_max_age_2);
	printf("repeating targeting_spec_operation_min_max_age:\n%s\n", cJSON_Print(jsontargeting_spec_operation_min_max_age_2));
}

int main() {
  test_targeting_spec_operation_min_max_age(1);
  test_targeting_spec_operation_min_max_age(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_operation_min_max_age_MAIN
#endif // targeting_spec_operation_min_max_age_TEST
