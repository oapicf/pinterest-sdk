#ifndef product_group_promotion_create_request_TEST
#define product_group_promotion_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_promotion_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_promotion_create_request.h"
product_group_promotion_create_request_t* instantiate_product_group_promotion_create_request(int include_optional);



product_group_promotion_create_request_t* instantiate_product_group_promotion_create_request(int include_optional) {
  product_group_promotion_create_request_t* product_group_promotion_create_request = NULL;
  if (include_optional) {
    product_group_promotion_create_request = product_group_promotion_create_request_create(
      "2680059592705",
      list_createList()
    );
  } else {
    product_group_promotion_create_request = product_group_promotion_create_request_create(
      "2680059592705",
      list_createList()
    );
  }

  return product_group_promotion_create_request;
}


#ifdef product_group_promotion_create_request_MAIN

void test_product_group_promotion_create_request(int include_optional) {
    product_group_promotion_create_request_t* product_group_promotion_create_request_1 = instantiate_product_group_promotion_create_request(include_optional);

	cJSON* jsonproduct_group_promotion_create_request_1 = product_group_promotion_create_request_convertToJSON(product_group_promotion_create_request_1);
	printf("product_group_promotion_create_request :\n%s\n", cJSON_Print(jsonproduct_group_promotion_create_request_1));
	product_group_promotion_create_request_t* product_group_promotion_create_request_2 = product_group_promotion_create_request_parseFromJSON(jsonproduct_group_promotion_create_request_1);
	cJSON* jsonproduct_group_promotion_create_request_2 = product_group_promotion_create_request_convertToJSON(product_group_promotion_create_request_2);
	printf("repeating product_group_promotion_create_request:\n%s\n", cJSON_Print(jsonproduct_group_promotion_create_request_2));
}

int main() {
  test_product_group_promotion_create_request(1);
  test_product_group_promotion_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_promotion_create_request_MAIN
#endif // product_group_promotion_create_request_TEST
