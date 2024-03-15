#ifndef mmm_reporting_targeting_type_TEST
#define mmm_reporting_targeting_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define mmm_reporting_targeting_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/mmm_reporting_targeting_type.h"
mmm_reporting_targeting_type_t* instantiate_mmm_reporting_targeting_type(int include_optional);



mmm_reporting_targeting_type_t* instantiate_mmm_reporting_targeting_type(int include_optional) {
  mmm_reporting_targeting_type_t* mmm_reporting_targeting_type = NULL;
  if (include_optional) {
    mmm_reporting_targeting_type = mmm_reporting_targeting_type_create(
    );
  } else {
    mmm_reporting_targeting_type = mmm_reporting_targeting_type_create(
    );
  }

  return mmm_reporting_targeting_type;
}


#ifdef mmm_reporting_targeting_type_MAIN

void test_mmm_reporting_targeting_type(int include_optional) {
    mmm_reporting_targeting_type_t* mmm_reporting_targeting_type_1 = instantiate_mmm_reporting_targeting_type(include_optional);

	cJSON* jsonmmm_reporting_targeting_type_1 = mmm_reporting_targeting_type_convertToJSON(mmm_reporting_targeting_type_1);
	printf("mmm_reporting_targeting_type :\n%s\n", cJSON_Print(jsonmmm_reporting_targeting_type_1));
	mmm_reporting_targeting_type_t* mmm_reporting_targeting_type_2 = mmm_reporting_targeting_type_parseFromJSON(jsonmmm_reporting_targeting_type_1);
	cJSON* jsonmmm_reporting_targeting_type_2 = mmm_reporting_targeting_type_convertToJSON(mmm_reporting_targeting_type_2);
	printf("repeating mmm_reporting_targeting_type:\n%s\n", cJSON_Print(jsonmmm_reporting_targeting_type_2));
}

int main() {
  test_mmm_reporting_targeting_type(1);
  test_mmm_reporting_targeting_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // mmm_reporting_targeting_type_MAIN
#endif // mmm_reporting_targeting_type_TEST
