#ifndef custom_label3_filter_TEST
#define custom_label3_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define custom_label3_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/custom_label3_filter.h"
custom_label3_filter_t* instantiate_custom_label3_filter(int include_optional);



custom_label3_filter_t* instantiate_custom_label3_filter(int include_optional) {
  custom_label3_filter_t* custom_label3_filter = NULL;
  if (include_optional) {
    custom_label3_filter = custom_label3_filter_create(
      0
    );
  } else {
    custom_label3_filter = custom_label3_filter_create(
      0
    );
  }

  return custom_label3_filter;
}


#ifdef custom_label3_filter_MAIN

void test_custom_label3_filter(int include_optional) {
    custom_label3_filter_t* custom_label3_filter_1 = instantiate_custom_label3_filter(include_optional);

	cJSON* jsoncustom_label3_filter_1 = custom_label3_filter_convertToJSON(custom_label3_filter_1);
	printf("custom_label3_filter :\n%s\n", cJSON_Print(jsoncustom_label3_filter_1));
	custom_label3_filter_t* custom_label3_filter_2 = custom_label3_filter_parseFromJSON(jsoncustom_label3_filter_1);
	cJSON* jsoncustom_label3_filter_2 = custom_label3_filter_convertToJSON(custom_label3_filter_2);
	printf("repeating custom_label3_filter:\n%s\n", cJSON_Print(jsoncustom_label3_filter_2));
}

int main() {
  test_custom_label3_filter(1);
  test_custom_label3_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // custom_label3_filter_MAIN
#endif // custom_label3_filter_TEST
