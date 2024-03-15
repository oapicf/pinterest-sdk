#ifndef product_group_analytics_response_inner_TEST
#define product_group_analytics_response_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_analytics_response_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_analytics_response_inner.h"
product_group_analytics_response_inner_t* instantiate_product_group_analytics_response_inner(int include_optional);



product_group_analytics_response_inner_t* instantiate_product_group_analytics_response_inner(int include_optional) {
  product_group_analytics_response_inner_t* product_group_analytics_response_inner = NULL;
  if (include_optional) {
    product_group_analytics_response_inner = product_group_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  } else {
    product_group_analytics_response_inner = product_group_analytics_response_inner_create(
      "a",
      "2013-10-20"
    );
  }

  return product_group_analytics_response_inner;
}


#ifdef product_group_analytics_response_inner_MAIN

void test_product_group_analytics_response_inner(int include_optional) {
    product_group_analytics_response_inner_t* product_group_analytics_response_inner_1 = instantiate_product_group_analytics_response_inner(include_optional);

	cJSON* jsonproduct_group_analytics_response_inner_1 = product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_1);
	printf("product_group_analytics_response_inner :\n%s\n", cJSON_Print(jsonproduct_group_analytics_response_inner_1));
	product_group_analytics_response_inner_t* product_group_analytics_response_inner_2 = product_group_analytics_response_inner_parseFromJSON(jsonproduct_group_analytics_response_inner_1);
	cJSON* jsonproduct_group_analytics_response_inner_2 = product_group_analytics_response_inner_convertToJSON(product_group_analytics_response_inner_2);
	printf("repeating product_group_analytics_response_inner:\n%s\n", cJSON_Print(jsonproduct_group_analytics_response_inner_2));
}

int main() {
  test_product_group_analytics_response_inner(1);
  test_product_group_analytics_response_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_analytics_response_inner_MAIN
#endif // product_group_analytics_response_inner_TEST
