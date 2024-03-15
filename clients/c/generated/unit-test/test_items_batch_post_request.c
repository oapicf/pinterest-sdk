#ifndef items_batch_post_request_TEST
#define items_batch_post_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define items_batch_post_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/items_batch_post_request.h"
items_batch_post_request_t* instantiate_items_batch_post_request(int include_optional);



items_batch_post_request_t* instantiate_items_batch_post_request(int include_optional) {
  items_batch_post_request_t* items_batch_post_request = NULL;
  if (include_optional) {
    items_batch_post_request = items_batch_post_request_create(
      pinterest_rest_api_items_batch_post_request__RETAIL,
      pinterest_rest_api_items_batch_post_request__"US",
      pinterest_rest_api_items_batch_post_request__"EN",
      list_createList(),
      "2680059592705",
      pinterest_rest_api_items_batch_post_request__"UPDATE"
    );
  } else {
    items_batch_post_request = items_batch_post_request_create(
      pinterest_rest_api_items_batch_post_request__RETAIL,
      pinterest_rest_api_items_batch_post_request__"US",
      pinterest_rest_api_items_batch_post_request__"EN",
      list_createList(),
      "2680059592705",
      pinterest_rest_api_items_batch_post_request__"UPDATE"
    );
  }

  return items_batch_post_request;
}


#ifdef items_batch_post_request_MAIN

void test_items_batch_post_request(int include_optional) {
    items_batch_post_request_t* items_batch_post_request_1 = instantiate_items_batch_post_request(include_optional);

	cJSON* jsonitems_batch_post_request_1 = items_batch_post_request_convertToJSON(items_batch_post_request_1);
	printf("items_batch_post_request :\n%s\n", cJSON_Print(jsonitems_batch_post_request_1));
	items_batch_post_request_t* items_batch_post_request_2 = items_batch_post_request_parseFromJSON(jsonitems_batch_post_request_1);
	cJSON* jsonitems_batch_post_request_2 = items_batch_post_request_convertToJSON(items_batch_post_request_2);
	printf("repeating items_batch_post_request:\n%s\n", cJSON_Print(jsonitems_batch_post_request_2));
}

int main() {
  test_items_batch_post_request(1);
  test_items_batch_post_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // items_batch_post_request_MAIN
#endif // items_batch_post_request_TEST
