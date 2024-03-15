#ifndef catalogs_update_retail_item_TEST
#define catalogs_update_retail_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_update_retail_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_update_retail_item.h"
catalogs_update_retail_item_t* instantiate_catalogs_update_retail_item(int include_optional);

#include "test_updatable_item_attributes.c"


catalogs_update_retail_item_t* instantiate_catalogs_update_retail_item(int include_optional) {
  catalogs_update_retail_item_t* catalogs_update_retail_item = NULL;
  if (include_optional) {
    catalogs_update_retail_item = catalogs_update_retail_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_update_retail_item_OPERATION_CREATE,
       // false, not to have infinite recursion
      instantiate_updatable_item_attributes(0),
      ["ad_link","adult","age_group","availability","average_review_rating","brand","checkout_enabled","color","condition","custom_label_0","custom_label_1","custom_label_2","custom_label_3","custom_label_4","description","free_shipping_label","free_shipping_limit","gender","google_product_category","gtin","item_group_id","last_updated_time","link","material","min_ad_price","mpn","number_of_ratings","number_of_reviews","pattern","price","product_type","sale_price","shipping","shipping_height","shipping_weight","shipping_width","size","size_system","size_type","tax","title","variant_names","variant_values"]
    );
  } else {
    catalogs_update_retail_item = catalogs_update_retail_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_update_retail_item_OPERATION_CREATE,
      NULL,
      ["ad_link","adult","age_group","availability","average_review_rating","brand","checkout_enabled","color","condition","custom_label_0","custom_label_1","custom_label_2","custom_label_3","custom_label_4","description","free_shipping_label","free_shipping_limit","gender","google_product_category","gtin","item_group_id","last_updated_time","link","material","min_ad_price","mpn","number_of_ratings","number_of_reviews","pattern","price","product_type","sale_price","shipping","shipping_height","shipping_weight","shipping_width","size","size_system","size_type","tax","title","variant_names","variant_values"]
    );
  }

  return catalogs_update_retail_item;
}


#ifdef catalogs_update_retail_item_MAIN

void test_catalogs_update_retail_item(int include_optional) {
    catalogs_update_retail_item_t* catalogs_update_retail_item_1 = instantiate_catalogs_update_retail_item(include_optional);

	cJSON* jsoncatalogs_update_retail_item_1 = catalogs_update_retail_item_convertToJSON(catalogs_update_retail_item_1);
	printf("catalogs_update_retail_item :\n%s\n", cJSON_Print(jsoncatalogs_update_retail_item_1));
	catalogs_update_retail_item_t* catalogs_update_retail_item_2 = catalogs_update_retail_item_parseFromJSON(jsoncatalogs_update_retail_item_1);
	cJSON* jsoncatalogs_update_retail_item_2 = catalogs_update_retail_item_convertToJSON(catalogs_update_retail_item_2);
	printf("repeating catalogs_update_retail_item:\n%s\n", cJSON_Print(jsoncatalogs_update_retail_item_2));
}

int main() {
  test_catalogs_update_retail_item(1);
  test_catalogs_update_retail_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_update_retail_item_MAIN
#endif // catalogs_update_retail_item_TEST
