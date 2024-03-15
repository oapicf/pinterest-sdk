#ifndef brand_filter_TEST
#define brand_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define brand_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/brand_filter.h"
brand_filter_t* instantiate_brand_filter(int include_optional);



brand_filter_t* instantiate_brand_filter(int include_optional) {
  brand_filter_t* brand_filter = NULL;
  if (include_optional) {
    brand_filter = brand_filter_create(
      0
    );
  } else {
    brand_filter = brand_filter_create(
      0
    );
  }

  return brand_filter;
}


#ifdef brand_filter_MAIN

void test_brand_filter(int include_optional) {
    brand_filter_t* brand_filter_1 = instantiate_brand_filter(include_optional);

	cJSON* jsonbrand_filter_1 = brand_filter_convertToJSON(brand_filter_1);
	printf("brand_filter :\n%s\n", cJSON_Print(jsonbrand_filter_1));
	brand_filter_t* brand_filter_2 = brand_filter_parseFromJSON(jsonbrand_filter_1);
	cJSON* jsonbrand_filter_2 = brand_filter_convertToJSON(brand_filter_2);
	printf("repeating brand_filter:\n%s\n", cJSON_Print(jsonbrand_filter_2));
}

int main() {
  test_brand_filter(1);
  test_brand_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // brand_filter_MAIN
#endif // brand_filter_TEST
