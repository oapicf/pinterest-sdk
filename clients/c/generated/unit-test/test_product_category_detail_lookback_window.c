#ifndef product_category_detail_lookback_window_TEST
#define product_category_detail_lookback_window_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_category_detail_lookback_window_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_category_detail_lookback_window.h"
product_category_detail_lookback_window_t* instantiate_product_category_detail_lookback_window(int include_optional);



product_category_detail_lookback_window_t* instantiate_product_category_detail_lookback_window(int include_optional) {
  product_category_detail_lookback_window_t* product_category_detail_lookback_window = NULL;
  if (include_optional) {
    product_category_detail_lookback_window = product_category_detail_lookback_window_create(
    );
  } else {
    product_category_detail_lookback_window = product_category_detail_lookback_window_create(
    );
  }

  return product_category_detail_lookback_window;
}


#ifdef product_category_detail_lookback_window_MAIN

void test_product_category_detail_lookback_window(int include_optional) {
    product_category_detail_lookback_window_t* product_category_detail_lookback_window_1 = instantiate_product_category_detail_lookback_window(include_optional);

	cJSON* jsonproduct_category_detail_lookback_window_1 = product_category_detail_lookback_window_convertToJSON(product_category_detail_lookback_window_1);
	printf("product_category_detail_lookback_window :\n%s\n", cJSON_Print(jsonproduct_category_detail_lookback_window_1));
	product_category_detail_lookback_window_t* product_category_detail_lookback_window_2 = product_category_detail_lookback_window_parseFromJSON(jsonproduct_category_detail_lookback_window_1);
	cJSON* jsonproduct_category_detail_lookback_window_2 = product_category_detail_lookback_window_convertToJSON(product_category_detail_lookback_window_2);
	printf("repeating product_category_detail_lookback_window:\n%s\n", cJSON_Print(jsonproduct_category_detail_lookback_window_2));
}

int main() {
  test_product_category_detail_lookback_window(1);
  test_product_category_detail_lookback_window(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_category_detail_lookback_window_MAIN
#endif // product_category_detail_lookback_window_TEST
