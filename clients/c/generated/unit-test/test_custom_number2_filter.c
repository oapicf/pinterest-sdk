#ifndef custom_number2_filter_TEST
#define custom_number2_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define custom_number2_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/custom_number2_filter.h"
custom_number2_filter_t* instantiate_custom_number2_filter(int include_optional);



custom_number2_filter_t* instantiate_custom_number2_filter(int include_optional) {
  custom_number2_filter_t* custom_number2_filter = NULL;
  if (include_optional) {
    custom_number2_filter = custom_number2_filter_create(
      0
    );
  } else {
    custom_number2_filter = custom_number2_filter_create(
      0
    );
  }

  return custom_number2_filter;
}


#ifdef custom_number2_filter_MAIN

void test_custom_number2_filter(int include_optional) {
    custom_number2_filter_t* custom_number2_filter_1 = instantiate_custom_number2_filter(include_optional);

	cJSON* jsoncustom_number2_filter_1 = custom_number2_filter_convertToJSON(custom_number2_filter_1);
	printf("custom_number2_filter :\n%s\n", cJSON_Print(jsoncustom_number2_filter_1));
	custom_number2_filter_t* custom_number2_filter_2 = custom_number2_filter_parseFromJSON(jsoncustom_number2_filter_1);
	cJSON* jsoncustom_number2_filter_2 = custom_number2_filter_convertToJSON(custom_number2_filter_2);
	printf("repeating custom_number2_filter:\n%s\n", cJSON_Print(jsoncustom_number2_filter_2));
}

int main() {
  test_custom_number2_filter(1);
  test_custom_number2_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // custom_number2_filter_MAIN
#endif // custom_number2_filter_TEST
