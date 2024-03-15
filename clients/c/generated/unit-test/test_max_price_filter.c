#ifndef max_price_filter_TEST
#define max_price_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define max_price_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/max_price_filter.h"
max_price_filter_t* instantiate_max_price_filter(int include_optional);



max_price_filter_t* instantiate_max_price_filter(int include_optional) {
  max_price_filter_t* max_price_filter = NULL;
  if (include_optional) {
    max_price_filter = max_price_filter_create(
      0
    );
  } else {
    max_price_filter = max_price_filter_create(
      0
    );
  }

  return max_price_filter;
}


#ifdef max_price_filter_MAIN

void test_max_price_filter(int include_optional) {
    max_price_filter_t* max_price_filter_1 = instantiate_max_price_filter(include_optional);

	cJSON* jsonmax_price_filter_1 = max_price_filter_convertToJSON(max_price_filter_1);
	printf("max_price_filter :\n%s\n", cJSON_Print(jsonmax_price_filter_1));
	max_price_filter_t* max_price_filter_2 = max_price_filter_parseFromJSON(jsonmax_price_filter_1);
	cJSON* jsonmax_price_filter_2 = max_price_filter_convertToJSON(max_price_filter_2);
	printf("repeating max_price_filter:\n%s\n", cJSON_Print(jsonmax_price_filter_2));
}

int main() {
  test_max_price_filter(1);
  test_max_price_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // max_price_filter_MAIN
#endif // max_price_filter_TEST
