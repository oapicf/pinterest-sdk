#ifndef catalogs_upsert_retail_item_TEST
#define catalogs_upsert_retail_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_upsert_retail_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_upsert_retail_item.h"
catalogs_upsert_retail_item_t* instantiate_catalogs_upsert_retail_item(int include_optional);

#include "test_item_attributes.c"


catalogs_upsert_retail_item_t* instantiate_catalogs_upsert_retail_item(int include_optional) {
  catalogs_upsert_retail_item_t* catalogs_upsert_retail_item = NULL;
  if (include_optional) {
    catalogs_upsert_retail_item = catalogs_upsert_retail_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_CREATE,
       // false, not to have infinite recursion
      instantiate_item_attributes(0)
    );
  } else {
    catalogs_upsert_retail_item = catalogs_upsert_retail_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_upsert_retail_item_OPERATION_CREATE,
      NULL
    );
  }

  return catalogs_upsert_retail_item;
}


#ifdef catalogs_upsert_retail_item_MAIN

void test_catalogs_upsert_retail_item(int include_optional) {
    catalogs_upsert_retail_item_t* catalogs_upsert_retail_item_1 = instantiate_catalogs_upsert_retail_item(include_optional);

	cJSON* jsoncatalogs_upsert_retail_item_1 = catalogs_upsert_retail_item_convertToJSON(catalogs_upsert_retail_item_1);
	printf("catalogs_upsert_retail_item :\n%s\n", cJSON_Print(jsoncatalogs_upsert_retail_item_1));
	catalogs_upsert_retail_item_t* catalogs_upsert_retail_item_2 = catalogs_upsert_retail_item_parseFromJSON(jsoncatalogs_upsert_retail_item_1);
	cJSON* jsoncatalogs_upsert_retail_item_2 = catalogs_upsert_retail_item_convertToJSON(catalogs_upsert_retail_item_2);
	printf("repeating catalogs_upsert_retail_item:\n%s\n", cJSON_Print(jsoncatalogs_upsert_retail_item_2));
}

int main() {
  test_catalogs_upsert_retail_item(1);
  test_catalogs_upsert_retail_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_upsert_retail_item_MAIN
#endif // catalogs_upsert_retail_item_TEST
