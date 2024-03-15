#ifndef price_filter_TEST
#define price_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define price_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/price_filter.h"
price_filter_t* instantiate_price_filter(int include_optional);

#include "test_catalogs_product_group_pricing_currency_criteria.c"


price_filter_t* instantiate_price_filter(int include_optional) {
  price_filter_t* price_filter = NULL;
  if (include_optional) {
    price_filter = price_filter_create(
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_pricing_currency_criteria(0)
    );
  } else {
    price_filter = price_filter_create(
      NULL
    );
  }

  return price_filter;
}


#ifdef price_filter_MAIN

void test_price_filter(int include_optional) {
    price_filter_t* price_filter_1 = instantiate_price_filter(include_optional);

	cJSON* jsonprice_filter_1 = price_filter_convertToJSON(price_filter_1);
	printf("price_filter :\n%s\n", cJSON_Print(jsonprice_filter_1));
	price_filter_t* price_filter_2 = price_filter_parseFromJSON(jsonprice_filter_1);
	cJSON* jsonprice_filter_2 = price_filter_convertToJSON(price_filter_2);
	printf("repeating price_filter:\n%s\n", cJSON_Print(jsonprice_filter_2));
}

int main() {
  test_price_filter(1);
  test_price_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // price_filter_MAIN
#endif // price_filter_TEST
