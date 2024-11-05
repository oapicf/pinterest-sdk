#ifndef product_group_reference_filter_TEST
#define product_group_reference_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_reference_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_reference_filter.h"
product_group_reference_filter_t* instantiate_product_group_reference_filter(int include_optional);



product_group_reference_filter_t* instantiate_product_group_reference_filter(int include_optional) {
  product_group_reference_filter_t* product_group_reference_filter = NULL;
  if (include_optional) {
    product_group_reference_filter = product_group_reference_filter_create(
      0
    );
  } else {
    product_group_reference_filter = product_group_reference_filter_create(
      0
    );
  }

  return product_group_reference_filter;
}


#ifdef product_group_reference_filter_MAIN

void test_product_group_reference_filter(int include_optional) {
    product_group_reference_filter_t* product_group_reference_filter_1 = instantiate_product_group_reference_filter(include_optional);

	cJSON* jsonproduct_group_reference_filter_1 = product_group_reference_filter_convertToJSON(product_group_reference_filter_1);
	printf("product_group_reference_filter :\n%s\n", cJSON_Print(jsonproduct_group_reference_filter_1));
	product_group_reference_filter_t* product_group_reference_filter_2 = product_group_reference_filter_parseFromJSON(jsonproduct_group_reference_filter_1);
	cJSON* jsonproduct_group_reference_filter_2 = product_group_reference_filter_convertToJSON(product_group_reference_filter_2);
	printf("repeating product_group_reference_filter:\n%s\n", cJSON_Print(jsonproduct_group_reference_filter_2));
}

int main() {
  test_product_group_reference_filter(1);
  test_product_group_reference_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_reference_filter_MAIN
#endif // product_group_reference_filter_TEST
