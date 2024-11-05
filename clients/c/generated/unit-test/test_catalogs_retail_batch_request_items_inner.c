#ifndef catalogs_retail_batch_request_items_inner_TEST
#define catalogs_retail_batch_request_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_retail_batch_request_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_retail_batch_request_items_inner.h"
catalogs_retail_batch_request_items_inner_t* instantiate_catalogs_retail_batch_request_items_inner(int include_optional);

#include "test_item_attributes_request.c"


catalogs_retail_batch_request_items_inner_t* instantiate_catalogs_retail_batch_request_items_inner(int include_optional) {
  catalogs_retail_batch_request_items_inner_t* catalogs_retail_batch_request_items_inner = NULL;
  if (include_optional) {
    catalogs_retail_batch_request_items_inner = catalogs_retail_batch_request_items_inner_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_DELETE,
       // false, not to have infinite recursion
      instantiate_item_attributes_request(0),
      [ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]
    );
  } else {
    catalogs_retail_batch_request_items_inner = catalogs_retail_batch_request_items_inner_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_retail_batch_request_items_inner_OPERATION_DELETE,
      NULL,
      [ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]
    );
  }

  return catalogs_retail_batch_request_items_inner;
}


#ifdef catalogs_retail_batch_request_items_inner_MAIN

void test_catalogs_retail_batch_request_items_inner(int include_optional) {
    catalogs_retail_batch_request_items_inner_t* catalogs_retail_batch_request_items_inner_1 = instantiate_catalogs_retail_batch_request_items_inner(include_optional);

	cJSON* jsoncatalogs_retail_batch_request_items_inner_1 = catalogs_retail_batch_request_items_inner_convertToJSON(catalogs_retail_batch_request_items_inner_1);
	printf("catalogs_retail_batch_request_items_inner :\n%s\n", cJSON_Print(jsoncatalogs_retail_batch_request_items_inner_1));
	catalogs_retail_batch_request_items_inner_t* catalogs_retail_batch_request_items_inner_2 = catalogs_retail_batch_request_items_inner_parseFromJSON(jsoncatalogs_retail_batch_request_items_inner_1);
	cJSON* jsoncatalogs_retail_batch_request_items_inner_2 = catalogs_retail_batch_request_items_inner_convertToJSON(catalogs_retail_batch_request_items_inner_2);
	printf("repeating catalogs_retail_batch_request_items_inner:\n%s\n", cJSON_Print(jsoncatalogs_retail_batch_request_items_inner_2));
}

int main() {
  test_catalogs_retail_batch_request_items_inner(1);
  test_catalogs_retail_batch_request_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_retail_batch_request_items_inner_MAIN
#endif // catalogs_retail_batch_request_items_inner_TEST
