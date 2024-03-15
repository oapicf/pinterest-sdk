#ifndef enhanced_match_status_type_TEST
#define enhanced_match_status_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define enhanced_match_status_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/enhanced_match_status_type.h"
enhanced_match_status_type_t* instantiate_enhanced_match_status_type(int include_optional);



enhanced_match_status_type_t* instantiate_enhanced_match_status_type(int include_optional) {
  enhanced_match_status_type_t* enhanced_match_status_type = NULL;
  if (include_optional) {
    enhanced_match_status_type = enhanced_match_status_type_create(
    );
  } else {
    enhanced_match_status_type = enhanced_match_status_type_create(
    );
  }

  return enhanced_match_status_type;
}


#ifdef enhanced_match_status_type_MAIN

void test_enhanced_match_status_type(int include_optional) {
    enhanced_match_status_type_t* enhanced_match_status_type_1 = instantiate_enhanced_match_status_type(include_optional);

	cJSON* jsonenhanced_match_status_type_1 = enhanced_match_status_type_convertToJSON(enhanced_match_status_type_1);
	printf("enhanced_match_status_type :\n%s\n", cJSON_Print(jsonenhanced_match_status_type_1));
	enhanced_match_status_type_t* enhanced_match_status_type_2 = enhanced_match_status_type_parseFromJSON(jsonenhanced_match_status_type_1);
	cJSON* jsonenhanced_match_status_type_2 = enhanced_match_status_type_convertToJSON(enhanced_match_status_type_2);
	printf("repeating enhanced_match_status_type:\n%s\n", cJSON_Print(jsonenhanced_match_status_type_2));
}

int main() {
  test_enhanced_match_status_type(1);
  test_enhanced_match_status_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // enhanced_match_status_type_MAIN
#endif // enhanced_match_status_type_TEST
