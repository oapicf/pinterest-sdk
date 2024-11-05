#ifndef catalogs_items_update_batch_request_TEST
#define catalogs_items_update_batch_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_items_update_batch_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_items_update_batch_request.h"
catalogs_items_update_batch_request_t* instantiate_catalogs_items_update_batch_request(int include_optional);

#include "test_catalogs_items_request_language.c"


catalogs_items_update_batch_request_t* instantiate_catalogs_items_update_batch_request(int include_optional) {
  catalogs_items_update_batch_request_t* catalogs_items_update_batch_request = NULL;
  if (include_optional) {
    catalogs_items_update_batch_request = catalogs_items_update_batch_request_create(
      pinterest_rest_api_catalogs_items_update_batch_request__"US",
      null,
      pinterest_rest_api_catalogs_items_update_batch_request__"UPDATE",
      list_createList()
    );
  } else {
    catalogs_items_update_batch_request = catalogs_items_update_batch_request_create(
      pinterest_rest_api_catalogs_items_update_batch_request__"US",
      null,
      pinterest_rest_api_catalogs_items_update_batch_request__"UPDATE",
      list_createList()
    );
  }

  return catalogs_items_update_batch_request;
}


#ifdef catalogs_items_update_batch_request_MAIN

void test_catalogs_items_update_batch_request(int include_optional) {
    catalogs_items_update_batch_request_t* catalogs_items_update_batch_request_1 = instantiate_catalogs_items_update_batch_request(include_optional);

	cJSON* jsoncatalogs_items_update_batch_request_1 = catalogs_items_update_batch_request_convertToJSON(catalogs_items_update_batch_request_1);
	printf("catalogs_items_update_batch_request :\n%s\n", cJSON_Print(jsoncatalogs_items_update_batch_request_1));
	catalogs_items_update_batch_request_t* catalogs_items_update_batch_request_2 = catalogs_items_update_batch_request_parseFromJSON(jsoncatalogs_items_update_batch_request_1);
	cJSON* jsoncatalogs_items_update_batch_request_2 = catalogs_items_update_batch_request_convertToJSON(catalogs_items_update_batch_request_2);
	printf("repeating catalogs_items_update_batch_request:\n%s\n", cJSON_Print(jsoncatalogs_items_update_batch_request_2));
}

int main() {
  test_catalogs_items_update_batch_request(1);
  test_catalogs_items_update_batch_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_items_update_batch_request_MAIN
#endif // catalogs_items_update_batch_request_TEST
