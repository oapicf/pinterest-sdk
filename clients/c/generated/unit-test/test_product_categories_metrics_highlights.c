#ifndef product_categories_metrics_highlights_TEST
#define product_categories_metrics_highlights_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_categories_metrics_highlights_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_categories_metrics_highlights.h"
product_categories_metrics_highlights_t* instantiate_product_categories_metrics_highlights(int include_optional);

#include "test_inner_product_categories_metrics_highlights.c"
#include "test_inner_product_categories_metrics_highlights.c"
#include "test_inner_product_categories_metrics_highlights.c"


product_categories_metrics_highlights_t* instantiate_product_categories_metrics_highlights(int include_optional) {
  product_categories_metrics_highlights_t* product_categories_metrics_highlights = NULL;
  if (include_optional) {
    product_categories_metrics_highlights = product_categories_metrics_highlights_create(
       // false, not to have infinite recursion
      instantiate_inner_product_categories_metrics_highlights(0),
       // false, not to have infinite recursion
      instantiate_inner_product_categories_metrics_highlights(0),
       // false, not to have infinite recursion
      instantiate_inner_product_categories_metrics_highlights(0)
    );
  } else {
    product_categories_metrics_highlights = product_categories_metrics_highlights_create(
      NULL,
      NULL,
      NULL
    );
  }

  return product_categories_metrics_highlights;
}


#ifdef product_categories_metrics_highlights_MAIN

void test_product_categories_metrics_highlights(int include_optional) {
    product_categories_metrics_highlights_t* product_categories_metrics_highlights_1 = instantiate_product_categories_metrics_highlights(include_optional);

	cJSON* jsonproduct_categories_metrics_highlights_1 = product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights_1);
	printf("product_categories_metrics_highlights :\n%s\n", cJSON_Print(jsonproduct_categories_metrics_highlights_1));
	product_categories_metrics_highlights_t* product_categories_metrics_highlights_2 = product_categories_metrics_highlights_parseFromJSON(jsonproduct_categories_metrics_highlights_1);
	cJSON* jsonproduct_categories_metrics_highlights_2 = product_categories_metrics_highlights_convertToJSON(product_categories_metrics_highlights_2);
	printf("repeating product_categories_metrics_highlights:\n%s\n", cJSON_Print(jsonproduct_categories_metrics_highlights_2));
}

int main() {
  test_product_categories_metrics_highlights(1);
  test_product_categories_metrics_highlights(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_categories_metrics_highlights_MAIN
#endif // product_categories_metrics_highlights_TEST
