#ifndef inner_product_categories_metrics_highlights_TEST
#define inner_product_categories_metrics_highlights_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define inner_product_categories_metrics_highlights_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/inner_product_categories_metrics_highlights.h"
inner_product_categories_metrics_highlights_t* instantiate_inner_product_categories_metrics_highlights(int include_optional);



inner_product_categories_metrics_highlights_t* instantiate_inner_product_categories_metrics_highlights(int include_optional) {
  inner_product_categories_metrics_highlights_t* inner_product_categories_metrics_highlights = NULL;
  if (include_optional) {
    inner_product_categories_metrics_highlights = inner_product_categories_metrics_highlights_create(
      1.337
    );
  } else {
    inner_product_categories_metrics_highlights = inner_product_categories_metrics_highlights_create(
      1.337
    );
  }

  return inner_product_categories_metrics_highlights;
}


#ifdef inner_product_categories_metrics_highlights_MAIN

void test_inner_product_categories_metrics_highlights(int include_optional) {
    inner_product_categories_metrics_highlights_t* inner_product_categories_metrics_highlights_1 = instantiate_inner_product_categories_metrics_highlights(include_optional);

	cJSON* jsoninner_product_categories_metrics_highlights_1 = inner_product_categories_metrics_highlights_convertToJSON(inner_product_categories_metrics_highlights_1);
	printf("inner_product_categories_metrics_highlights :\n%s\n", cJSON_Print(jsoninner_product_categories_metrics_highlights_1));
	inner_product_categories_metrics_highlights_t* inner_product_categories_metrics_highlights_2 = inner_product_categories_metrics_highlights_parseFromJSON(jsoninner_product_categories_metrics_highlights_1);
	cJSON* jsoninner_product_categories_metrics_highlights_2 = inner_product_categories_metrics_highlights_convertToJSON(inner_product_categories_metrics_highlights_2);
	printf("repeating inner_product_categories_metrics_highlights:\n%s\n", cJSON_Print(jsoninner_product_categories_metrics_highlights_2));
}

int main() {
  test_inner_product_categories_metrics_highlights(1);
  test_inner_product_categories_metrics_highlights(0);

  printf("Hello world \n");
  return 0;
}

#endif // inner_product_categories_metrics_highlights_MAIN
#endif // inner_product_categories_metrics_highlights_TEST
