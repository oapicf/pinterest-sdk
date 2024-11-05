#ifndef product_group_promotion_response_item_TEST
#define product_group_promotion_response_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_promotion_response_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_promotion_response_item.h"
product_group_promotion_response_item_t* instantiate_product_group_promotion_response_item(int include_optional);

#include "test_product_group_promotion_response_element.c"


product_group_promotion_response_item_t* instantiate_product_group_promotion_response_item(int include_optional) {
  product_group_promotion_response_item_t* product_group_promotion_response_item = NULL;
  if (include_optional) {
    product_group_promotion_response_item = product_group_promotion_response_item_create(
       // false, not to have infinite recursion
      instantiate_product_group_promotion_response_element(0),
      list_createList()
    );
  } else {
    product_group_promotion_response_item = product_group_promotion_response_item_create(
      NULL,
      list_createList()
    );
  }

  return product_group_promotion_response_item;
}


#ifdef product_group_promotion_response_item_MAIN

void test_product_group_promotion_response_item(int include_optional) {
    product_group_promotion_response_item_t* product_group_promotion_response_item_1 = instantiate_product_group_promotion_response_item(include_optional);

	cJSON* jsonproduct_group_promotion_response_item_1 = product_group_promotion_response_item_convertToJSON(product_group_promotion_response_item_1);
	printf("product_group_promotion_response_item :\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_item_1));
	product_group_promotion_response_item_t* product_group_promotion_response_item_2 = product_group_promotion_response_item_parseFromJSON(jsonproduct_group_promotion_response_item_1);
	cJSON* jsonproduct_group_promotion_response_item_2 = product_group_promotion_response_item_convertToJSON(product_group_promotion_response_item_2);
	printf("repeating product_group_promotion_response_item:\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_item_2));
}

int main() {
  test_product_group_promotion_response_item(1);
  test_product_group_promotion_response_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_promotion_response_item_MAIN
#endif // product_group_promotion_response_item_TEST
