#ifndef conversion_events_data_inner_custom_data_TEST
#define conversion_events_data_inner_custom_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_data_inner_custom_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events_data_inner_custom_data.h"
conversion_events_data_inner_custom_data_t* instantiate_conversion_events_data_inner_custom_data(int include_optional);



conversion_events_data_inner_custom_data_t* instantiate_conversion_events_data_inner_custom_data(int include_optional) {
  conversion_events_data_inner_custom_data_t* conversion_events_data_inner_custom_data = NULL;
  if (include_optional) {
    conversion_events_data_inner_custom_data = conversion_events_data_inner_custom_data_create(
      "pinterest-brand",
      "shirts",
      ["product-id-001","product-id-002"],
      "pinterest-themed-clothing",
      [{"id":"product-id-001","item_price":"14.99","quantity":3,"item_name":"pinterest-shirt-girl","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"},{"id":"product-id-002","item_price":"13.71","quantity":2,"item_name":"pinterest-shirt-men","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"}],
      "USD",
      "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f",
      1,
      "ss-company",
      5,
      "LDP",
      "my_order_id",
      "2794.82",
      "sample string",
      "72.39"
    );
  } else {
    conversion_events_data_inner_custom_data = conversion_events_data_inner_custom_data_create(
      "pinterest-brand",
      "shirts",
      ["product-id-001","product-id-002"],
      "pinterest-themed-clothing",
      [{"id":"product-id-001","item_price":"14.99","quantity":3,"item_name":"pinterest-shirt-girl","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"},{"id":"product-id-002","item_price":"13.71","quantity":2,"item_name":"pinterest-shirt-men","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"}],
      "USD",
      "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f",
      1,
      "ss-company",
      5,
      "LDP",
      "my_order_id",
      "2794.82",
      "sample string",
      "72.39"
    );
  }

  return conversion_events_data_inner_custom_data;
}


#ifdef conversion_events_data_inner_custom_data_MAIN

void test_conversion_events_data_inner_custom_data(int include_optional) {
    conversion_events_data_inner_custom_data_t* conversion_events_data_inner_custom_data_1 = instantiate_conversion_events_data_inner_custom_data(include_optional);

	cJSON* jsonconversion_events_data_inner_custom_data_1 = conversion_events_data_inner_custom_data_convertToJSON(conversion_events_data_inner_custom_data_1);
	printf("conversion_events_data_inner_custom_data :\n%s\n", cJSON_Print(jsonconversion_events_data_inner_custom_data_1));
	conversion_events_data_inner_custom_data_t* conversion_events_data_inner_custom_data_2 = conversion_events_data_inner_custom_data_parseFromJSON(jsonconversion_events_data_inner_custom_data_1);
	cJSON* jsonconversion_events_data_inner_custom_data_2 = conversion_events_data_inner_custom_data_convertToJSON(conversion_events_data_inner_custom_data_2);
	printf("repeating conversion_events_data_inner_custom_data:\n%s\n", cJSON_Print(jsonconversion_events_data_inner_custom_data_2));
}

int main() {
  test_conversion_events_data_inner_custom_data(1);
  test_conversion_events_data_inner_custom_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_data_inner_custom_data_MAIN
#endif // conversion_events_data_inner_custom_data_TEST
