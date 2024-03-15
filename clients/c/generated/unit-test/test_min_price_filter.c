#ifndef min_price_filter_TEST
#define min_price_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define min_price_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/min_price_filter.h"
min_price_filter_t* instantiate_min_price_filter(int include_optional);



min_price_filter_t* instantiate_min_price_filter(int include_optional) {
  min_price_filter_t* min_price_filter = NULL;
  if (include_optional) {
    min_price_filter = min_price_filter_create(
      0
    );
  } else {
    min_price_filter = min_price_filter_create(
      0
    );
  }

  return min_price_filter;
}


#ifdef min_price_filter_MAIN

void test_min_price_filter(int include_optional) {
    min_price_filter_t* min_price_filter_1 = instantiate_min_price_filter(include_optional);

	cJSON* jsonmin_price_filter_1 = min_price_filter_convertToJSON(min_price_filter_1);
	printf("min_price_filter :\n%s\n", cJSON_Print(jsonmin_price_filter_1));
	min_price_filter_t* min_price_filter_2 = min_price_filter_parseFromJSON(jsonmin_price_filter_1);
	cJSON* jsonmin_price_filter_2 = min_price_filter_convertToJSON(min_price_filter_2);
	printf("repeating min_price_filter:\n%s\n", cJSON_Print(jsonmin_price_filter_2));
}

int main() {
  test_min_price_filter(1);
  test_min_price_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // min_price_filter_MAIN
#endif // min_price_filter_TEST
