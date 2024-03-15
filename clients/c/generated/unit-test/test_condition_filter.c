#ifndef condition_filter_TEST
#define condition_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define condition_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/condition_filter.h"
condition_filter_t* instantiate_condition_filter(int include_optional);



condition_filter_t* instantiate_condition_filter(int include_optional) {
  condition_filter_t* condition_filter = NULL;
  if (include_optional) {
    condition_filter = condition_filter_create(
      0
    );
  } else {
    condition_filter = condition_filter_create(
      0
    );
  }

  return condition_filter;
}


#ifdef condition_filter_MAIN

void test_condition_filter(int include_optional) {
    condition_filter_t* condition_filter_1 = instantiate_condition_filter(include_optional);

	cJSON* jsoncondition_filter_1 = condition_filter_convertToJSON(condition_filter_1);
	printf("condition_filter :\n%s\n", cJSON_Print(jsoncondition_filter_1));
	condition_filter_t* condition_filter_2 = condition_filter_parseFromJSON(jsoncondition_filter_1);
	cJSON* jsoncondition_filter_2 = condition_filter_convertToJSON(condition_filter_2);
	printf("repeating condition_filter:\n%s\n", cJSON_Print(jsoncondition_filter_2));
}

int main() {
  test_condition_filter(1);
  test_condition_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // condition_filter_MAIN
#endif // condition_filter_TEST
