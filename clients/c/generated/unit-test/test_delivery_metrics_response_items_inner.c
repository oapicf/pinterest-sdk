#ifndef delivery_metrics_response_items_inner_TEST
#define delivery_metrics_response_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define delivery_metrics_response_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/delivery_metrics_response_items_inner.h"
delivery_metrics_response_items_inner_t* instantiate_delivery_metrics_response_items_inner(int include_optional);



delivery_metrics_response_items_inner_t* instantiate_delivery_metrics_response_items_inner(int include_optional) {
  delivery_metrics_response_items_inner_t* delivery_metrics_response_items_inner = NULL;
  if (include_optional) {
    delivery_metrics_response_items_inner = delivery_metrics_response_items_inner_create(
      "AD_GROUP_ID",
      pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_"ADS",
      "Unique ID for your ad group",
      "Ad group ID"
    );
  } else {
    delivery_metrics_response_items_inner = delivery_metrics_response_items_inner_create(
      "AD_GROUP_ID",
      pinterest_rest_api_delivery_metrics_response_items_inner_CATEGORY_"ADS",
      "Unique ID for your ad group",
      "Ad group ID"
    );
  }

  return delivery_metrics_response_items_inner;
}


#ifdef delivery_metrics_response_items_inner_MAIN

void test_delivery_metrics_response_items_inner(int include_optional) {
    delivery_metrics_response_items_inner_t* delivery_metrics_response_items_inner_1 = instantiate_delivery_metrics_response_items_inner(include_optional);

	cJSON* jsondelivery_metrics_response_items_inner_1 = delivery_metrics_response_items_inner_convertToJSON(delivery_metrics_response_items_inner_1);
	printf("delivery_metrics_response_items_inner :\n%s\n", cJSON_Print(jsondelivery_metrics_response_items_inner_1));
	delivery_metrics_response_items_inner_t* delivery_metrics_response_items_inner_2 = delivery_metrics_response_items_inner_parseFromJSON(jsondelivery_metrics_response_items_inner_1);
	cJSON* jsondelivery_metrics_response_items_inner_2 = delivery_metrics_response_items_inner_convertToJSON(delivery_metrics_response_items_inner_2);
	printf("repeating delivery_metrics_response_items_inner:\n%s\n", cJSON_Print(jsondelivery_metrics_response_items_inner_2));
}

int main() {
  test_delivery_metrics_response_items_inner(1);
  test_delivery_metrics_response_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // delivery_metrics_response_items_inner_MAIN
#endif // delivery_metrics_response_items_inner_TEST
