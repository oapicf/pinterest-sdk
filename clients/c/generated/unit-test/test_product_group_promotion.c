#ifndef product_group_promotion_TEST
#define product_group_promotion_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_promotion_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_promotion.h"
product_group_promotion_t* instantiate_product_group_promotion(int include_optional);



product_group_promotion_t* instantiate_product_group_promotion(int include_optional) {
  product_group_promotion_t* product_group_promotion = NULL;
  if (include_optional) {
    product_group_promotion = product_group_promotion_create(
      "2680059592705",
      14000000,
      "1231235",
      "catalogProductGroupName",
      pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_"SHOP_THIS_COLLECTION",
      "http://www.pinterest.com",
      "123123",
      pinterest_rest_api_product_group_promotion__REGULAR,
      pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_"SHOP_NOW",
      "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
      pinterest_rest_api_product_group_promotion__"CLOSEUP",
      "2680059592705",
      true,
      true,
      true,
      "1231234",
      pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_"VIDEO",
      "product_type_1='beverage appliances'",
      "holiday_sale",
      "holiday_sale",
      "slideshow description",
      "slideshow title",
      pinterest_rest_api_product_group_promotion__"ACTIVE",
      "https://www.pinterest.com"
    );
  } else {
    product_group_promotion = product_group_promotion_create(
      "2680059592705",
      14000000,
      "1231235",
      "catalogProductGroupName",
      pinterest_rest_api_product_group_promotion_COLLECTIONSHEADERTYPE_"SHOP_THIS_COLLECTION",
      "http://www.pinterest.com",
      "123123",
      pinterest_rest_api_product_group_promotion__REGULAR,
      pinterest_rest_api_product_group_promotion_CUSTOMIZABLECTATYPE_"SHOP_NOW",
      "*/product_type_0='kitchen'/product_type_1='beverage appliances'",
      pinterest_rest_api_product_group_promotion__"CLOSEUP",
      "2680059592705",
      true,
      true,
      true,
      "1231234",
      pinterest_rest_api_product_group_promotion_PREFERREDMEDIATYPE_"VIDEO",
      "product_type_1='beverage appliances'",
      "holiday_sale",
      "holiday_sale",
      "slideshow description",
      "slideshow title",
      pinterest_rest_api_product_group_promotion__"ACTIVE",
      "https://www.pinterest.com"
    );
  }

  return product_group_promotion;
}


#ifdef product_group_promotion_MAIN

void test_product_group_promotion(int include_optional) {
    product_group_promotion_t* product_group_promotion_1 = instantiate_product_group_promotion(include_optional);

	cJSON* jsonproduct_group_promotion_1 = product_group_promotion_convertToJSON(product_group_promotion_1);
	printf("product_group_promotion :\n%s\n", cJSON_Print(jsonproduct_group_promotion_1));
	product_group_promotion_t* product_group_promotion_2 = product_group_promotion_parseFromJSON(jsonproduct_group_promotion_1);
	cJSON* jsonproduct_group_promotion_2 = product_group_promotion_convertToJSON(product_group_promotion_2);
	printf("repeating product_group_promotion:\n%s\n", cJSON_Print(jsonproduct_group_promotion_2));
}

int main() {
  test_product_group_promotion(1);
  test_product_group_promotion(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_promotion_MAIN
#endif // product_group_promotion_TEST
