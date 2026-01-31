#ifndef custom_number0_filter_TEST
#define custom_number0_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define custom_number0_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/custom_number0_filter.h"
custom_number0_filter_t* instantiate_custom_number0_filter(int include_optional);



custom_number0_filter_t* instantiate_custom_number0_filter(int include_optional) {
  custom_number0_filter_t* custom_number0_filter = NULL;
  if (include_optional) {
    custom_number0_filter = custom_number0_filter_create(
      0
    );
  } else {
    custom_number0_filter = custom_number0_filter_create(
      0
    );
  }

  return custom_number0_filter;
}


#ifdef custom_number0_filter_MAIN

void test_custom_number0_filter(int include_optional) {
    custom_number0_filter_t* custom_number0_filter_1 = instantiate_custom_number0_filter(include_optional);

	cJSON* jsoncustom_number0_filter_1 = custom_number0_filter_convertToJSON(custom_number0_filter_1);
	printf("custom_number0_filter :\n%s\n", cJSON_Print(jsoncustom_number0_filter_1));
	custom_number0_filter_t* custom_number0_filter_2 = custom_number0_filter_parseFromJSON(jsoncustom_number0_filter_1);
	cJSON* jsoncustom_number0_filter_2 = custom_number0_filter_convertToJSON(custom_number0_filter_2);
	printf("repeating custom_number0_filter:\n%s\n", cJSON_Print(jsoncustom_number0_filter_2));
}

int main() {
  test_custom_number0_filter(1);
  test_custom_number0_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // custom_number0_filter_MAIN
#endif // custom_number0_filter_TEST
