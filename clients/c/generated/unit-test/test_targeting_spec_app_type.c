#ifndef targeting_spec_app_type_TEST
#define targeting_spec_app_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define targeting_spec_app_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/targeting_spec_app_type.h"
targeting_spec_app_type_t* instantiate_targeting_spec_app_type(int include_optional);



targeting_spec_app_type_t* instantiate_targeting_spec_app_type(int include_optional) {
  targeting_spec_app_type_t* targeting_spec_app_type = NULL;
  if (include_optional) {
    targeting_spec_app_type = targeting_spec_app_type_create(
    );
  } else {
    targeting_spec_app_type = targeting_spec_app_type_create(
    );
  }

  return targeting_spec_app_type;
}


#ifdef targeting_spec_app_type_MAIN

void test_targeting_spec_app_type(int include_optional) {
    targeting_spec_app_type_t* targeting_spec_app_type_1 = instantiate_targeting_spec_app_type(include_optional);

	cJSON* jsontargeting_spec_app_type_1 = targeting_spec_app_type_convertToJSON(targeting_spec_app_type_1);
	printf("targeting_spec_app_type :\n%s\n", cJSON_Print(jsontargeting_spec_app_type_1));
	targeting_spec_app_type_t* targeting_spec_app_type_2 = targeting_spec_app_type_parseFromJSON(jsontargeting_spec_app_type_1);
	cJSON* jsontargeting_spec_app_type_2 = targeting_spec_app_type_convertToJSON(targeting_spec_app_type_2);
	printf("repeating targeting_spec_app_type:\n%s\n", cJSON_Print(jsontargeting_spec_app_type_2));
}

int main() {
  test_targeting_spec_app_type(1);
  test_targeting_spec_app_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // targeting_spec_app_type_MAIN
#endif // targeting_spec_app_type_TEST
