#ifndef product_group_promotion_response_element_TEST
#define product_group_promotion_response_element_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_promotion_response_element_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_promotion_response_element.h"
product_group_promotion_response_element_t* instantiate_product_group_promotion_response_element(int include_optional);



product_group_promotion_response_element_t* instantiate_product_group_promotion_response_element(int include_optional) {
  product_group_promotion_response_element_t* product_group_promotion_response_element = NULL;
  if (include_optional) {
    product_group_promotion_response_element = product_group_promotion_response_element_create(
      "2680059592705",
      "2680059592705",
      14000000,
      true,
      "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
      "product_type_1='beverage appliances'",
      "1231234",
      "slideshow title",
      "slideshow description",
      true,
      pinterest_rest_api_product_group_promotion_response_element__"ACTIVE",
      "https://www.pinterest.com",
      "1231235",
      "catalogProductGroupName",
      "123123",
      "http://www.pinterest.com",
      pinterest_rest_api_product_group_promotion_response_element__"CLOSEUP",
      pinterest_rest_api_product_group_promotion_response_element__"REGULAR"
    );
  } else {
    product_group_promotion_response_element = product_group_promotion_response_element_create(
      "2680059592705",
      "2680059592705",
      14000000,
      true,
      "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
      "product_type_1='beverage appliances'",
      "1231234",
      "slideshow title",
      "slideshow description",
      true,
      pinterest_rest_api_product_group_promotion_response_element__"ACTIVE",
      "https://www.pinterest.com",
      "1231235",
      "catalogProductGroupName",
      "123123",
      "http://www.pinterest.com",
      pinterest_rest_api_product_group_promotion_response_element__"CLOSEUP",
      pinterest_rest_api_product_group_promotion_response_element__"REGULAR"
    );
  }

  return product_group_promotion_response_element;
}


#ifdef product_group_promotion_response_element_MAIN

void test_product_group_promotion_response_element(int include_optional) {
    product_group_promotion_response_element_t* product_group_promotion_response_element_1 = instantiate_product_group_promotion_response_element(include_optional);

	cJSON* jsonproduct_group_promotion_response_element_1 = product_group_promotion_response_element_convertToJSON(product_group_promotion_response_element_1);
	printf("product_group_promotion_response_element :\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_element_1));
	product_group_promotion_response_element_t* product_group_promotion_response_element_2 = product_group_promotion_response_element_parseFromJSON(jsonproduct_group_promotion_response_element_1);
	cJSON* jsonproduct_group_promotion_response_element_2 = product_group_promotion_response_element_convertToJSON(product_group_promotion_response_element_2);
	printf("repeating product_group_promotion_response_element:\n%s\n", cJSON_Print(jsonproduct_group_promotion_response_element_2));
}

int main() {
  test_product_group_promotion_response_element(1);
  test_product_group_promotion_response_element(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_promotion_response_element_MAIN
#endif // product_group_promotion_response_element_TEST
