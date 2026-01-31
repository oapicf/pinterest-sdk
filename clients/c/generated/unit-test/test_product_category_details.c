#ifndef product_category_details_TEST
#define product_category_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_category_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_category_details.h"
product_category_details_t* instantiate_product_category_details(int include_optional);

#include "test_product_categories_demographic.c"
#include "test_product_categories_metrics_highlights.c"


product_category_details_t* instantiate_product_category_details(int include_optional) {
  product_category_details_t* product_category_details = NULL;
  if (include_optional) {
    product_category_details = product_category_details_create(
       // false, not to have infinite recursion
      instantiate_product_categories_demographic(0),
      1,
       // false, not to have infinite recursion
      instantiate_product_categories_metrics_highlights(0),
      list_createList(),
      pinterest_rest_api_product_category_details__ACCENT_TABLES,
      list_createList(),
      list_createList()
    );
  } else {
    product_category_details = product_category_details_create(
      NULL,
      1,
      NULL,
      list_createList(),
      pinterest_rest_api_product_category_details__ACCENT_TABLES,
      list_createList(),
      list_createList()
    );
  }

  return product_category_details;
}


#ifdef product_category_details_MAIN

void test_product_category_details(int include_optional) {
    product_category_details_t* product_category_details_1 = instantiate_product_category_details(include_optional);

	cJSON* jsonproduct_category_details_1 = product_category_details_convertToJSON(product_category_details_1);
	printf("product_category_details :\n%s\n", cJSON_Print(jsonproduct_category_details_1));
	product_category_details_t* product_category_details_2 = product_category_details_parseFromJSON(jsonproduct_category_details_1);
	cJSON* jsonproduct_category_details_2 = product_category_details_convertToJSON(product_category_details_2);
	printf("repeating product_category_details:\n%s\n", cJSON_Print(jsonproduct_category_details_2));
}

int main() {
  test_product_category_details(1);
  test_product_category_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_category_details_MAIN
#endif // product_category_details_TEST
