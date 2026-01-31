#ifndef product_category_region_TEST
#define product_category_region_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_category_region_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_category_region.h"
product_category_region_t* instantiate_product_category_region(int include_optional);



product_category_region_t* instantiate_product_category_region(int include_optional) {
  product_category_region_t* product_category_region = NULL;
  if (include_optional) {
    product_category_region = product_category_region_create(
    );
  } else {
    product_category_region = product_category_region_create(
    );
  }

  return product_category_region;
}


#ifdef product_category_region_MAIN

void test_product_category_region(int include_optional) {
    product_category_region_t* product_category_region_1 = instantiate_product_category_region(include_optional);

	cJSON* jsonproduct_category_region_1 = product_category_region_convertToJSON(product_category_region_1);
	printf("product_category_region :\n%s\n", cJSON_Print(jsonproduct_category_region_1));
	product_category_region_t* product_category_region_2 = product_category_region_parseFromJSON(jsonproduct_category_region_1);
	cJSON* jsonproduct_category_region_2 = product_category_region_convertToJSON(product_category_region_2);
	printf("repeating product_category_region:\n%s\n", cJSON_Print(jsonproduct_category_region_2));
}

int main() {
  test_product_category_region(1);
  test_product_category_region(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_category_region_MAIN
#endif // product_category_region_TEST
