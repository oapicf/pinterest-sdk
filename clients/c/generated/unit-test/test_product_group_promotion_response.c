#ifndef product_group_promotion_response_TEST
#define product_group_promotion_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_promotion_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_promotion_response.h"
product_group_promotion_response_t* instantiate_product_group_promotion_response(int include_optional);



product_group_promotion_response_t* instantiate_product_group_promotion_response(int include_optional) {
  product_group_promotion_response_t* product_group_promotion_response = NULL;
  if (include_optional) {
    product_group_promotion_response = product_group_promotion_response_create(
      list_createList()
    );
  } else {
    product_group_promotion_response = product_group_promotion_response_create(
      list_createList()
    );
  }

  return product_group_promotion_response;
}


#ifdef product_group_promotion_response_MAIN

void test_product_group_promotion_response(int include_optional) {
    product_group_promotion_response_t* product_group_promotion_response_1 = instantiate_product_group_promotion_response(include_optional);

	cJSON* jsonproduct_group_promotion_response_1 = product_group_promotion_response_convertToJSON(product_group_promotion_response_1);
	printf("product_group_promotion_response :\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_1));
	product_group_promotion_response_t* product_group_promotion_response_2 = product_group_promotion_response_parseFromJSON(jsonproduct_group_promotion_response_1);
	cJSON* jsonproduct_group_promotion_response_2 = product_group_promotion_response_convertToJSON(product_group_promotion_response_2);
	printf("repeating product_group_promotion_response:\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_2));
}

int main() {
  test_product_group_promotion_response(1);
  test_product_group_promotion_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_promotion_response_MAIN
#endif // product_group_promotion_response_TEST
