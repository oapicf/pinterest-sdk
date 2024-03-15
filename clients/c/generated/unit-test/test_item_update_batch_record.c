#ifndef item_update_batch_record_TEST
#define item_update_batch_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_update_batch_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_update_batch_record.h"
item_update_batch_record_t* instantiate_item_update_batch_record(int include_optional);

#include "test_updatable_item_attributes.c"


item_update_batch_record_t* instantiate_item_update_batch_record(int include_optional) {
  item_update_batch_record_t* item_update_batch_record = NULL;
  if (include_optional) {
    item_update_batch_record = item_update_batch_record_create(
      "DS0294-M",
       // false, not to have infinite recursion
      instantiate_updatable_item_attributes(0),
      ["ad_link","adult","age_group","availability","average_review_rating","brand","checkout_enabled","color","condition","custom_label_0","custom_label_1","custom_label_2","custom_label_3","custom_label_4","description","free_shipping_label","free_shipping_limit","gender","google_product_category","gtin","item_group_id","last_updated_time","link","material","min_ad_price","mpn","number_of_ratings","number_of_reviews","pattern","price","product_type","sale_price","shipping","shipping_height","shipping_weight","shipping_width","size","size_system","size_type","tax","title","variant_names","variant_values"]
    );
  } else {
    item_update_batch_record = item_update_batch_record_create(
      "DS0294-M",
      NULL,
      ["ad_link","adult","age_group","availability","average_review_rating","brand","checkout_enabled","color","condition","custom_label_0","custom_label_1","custom_label_2","custom_label_3","custom_label_4","description","free_shipping_label","free_shipping_limit","gender","google_product_category","gtin","item_group_id","last_updated_time","link","material","min_ad_price","mpn","number_of_ratings","number_of_reviews","pattern","price","product_type","sale_price","shipping","shipping_height","shipping_weight","shipping_width","size","size_system","size_type","tax","title","variant_names","variant_values"]
    );
  }

  return item_update_batch_record;
}


#ifdef item_update_batch_record_MAIN

void test_item_update_batch_record(int include_optional) {
    item_update_batch_record_t* item_update_batch_record_1 = instantiate_item_update_batch_record(include_optional);

	cJSON* jsonitem_update_batch_record_1 = item_update_batch_record_convertToJSON(item_update_batch_record_1);
	printf("item_update_batch_record :\n%s\n", cJSON_Print(jsonitem_update_batch_record_1));
	item_update_batch_record_t* item_update_batch_record_2 = item_update_batch_record_parseFromJSON(jsonitem_update_batch_record_1);
	cJSON* jsonitem_update_batch_record_2 = item_update_batch_record_convertToJSON(item_update_batch_record_2);
	printf("repeating item_update_batch_record:\n%s\n", cJSON_Print(jsonitem_update_batch_record_2));
}

int main() {
  test_item_update_batch_record(1);
  test_item_update_batch_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_update_batch_record_MAIN
#endif // item_update_batch_record_TEST
