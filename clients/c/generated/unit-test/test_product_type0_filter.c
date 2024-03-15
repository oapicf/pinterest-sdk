#ifndef product_type0_filter_TEST
#define product_type0_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_type0_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_type0_filter.h"
product_type0_filter_t* instantiate_product_type0_filter(int include_optional);



product_type0_filter_t* instantiate_product_type0_filter(int include_optional) {
  product_type0_filter_t* product_type0_filter = NULL;
  if (include_optional) {
    product_type0_filter = product_type0_filter_create(
      0
    );
  } else {
    product_type0_filter = product_type0_filter_create(
      0
    );
  }

  return product_type0_filter;
}


#ifdef product_type0_filter_MAIN

void test_product_type0_filter(int include_optional) {
    product_type0_filter_t* product_type0_filter_1 = instantiate_product_type0_filter(include_optional);

	cJSON* jsonproduct_type0_filter_1 = product_type0_filter_convertToJSON(product_type0_filter_1);
	printf("product_type0_filter :\n%s\n", cJSON_Print(jsonproduct_type0_filter_1));
	product_type0_filter_t* product_type0_filter_2 = product_type0_filter_parseFromJSON(jsonproduct_type0_filter_1);
	cJSON* jsonproduct_type0_filter_2 = product_type0_filter_convertToJSON(product_type0_filter_2);
	printf("repeating product_type0_filter:\n%s\n", cJSON_Print(jsonproduct_type0_filter_2));
}

int main() {
  test_product_type0_filter(1);
  test_product_type0_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_type0_filter_MAIN
#endif // product_type0_filter_TEST
