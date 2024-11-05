#ifndef catalogs_creative_assets_items_batch_TEST
#define catalogs_creative_assets_items_batch_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_items_batch_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_items_batch.h"
catalogs_creative_assets_items_batch_t* instantiate_catalogs_creative_assets_items_batch(int include_optional);



catalogs_creative_assets_items_batch_t* instantiate_catalogs_creative_assets_items_batch(int include_optional) {
  catalogs_creative_assets_items_batch_t* catalogs_creative_assets_items_batch = NULL;
  if (include_optional) {
    catalogs_creative_assets_items_batch = catalogs_creative_assets_items_batch_create(
      "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      pinterest_rest_api_catalogs_creative_assets_items_batch__"PROCESSING",
      pinterest_rest_api_catalogs_creative_assets_items_batch__RETAIL,
      list_createList()
    );
  } else {
    catalogs_creative_assets_items_batch = catalogs_creative_assets_items_batch_create(
      "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e",
      "2013-10-20T19:20:30+01:00",
      "2013-10-20T19:20:30+01:00",
      pinterest_rest_api_catalogs_creative_assets_items_batch__"PROCESSING",
      pinterest_rest_api_catalogs_creative_assets_items_batch__RETAIL,
      list_createList()
    );
  }

  return catalogs_creative_assets_items_batch;
}


#ifdef catalogs_creative_assets_items_batch_MAIN

void test_catalogs_creative_assets_items_batch(int include_optional) {
    catalogs_creative_assets_items_batch_t* catalogs_creative_assets_items_batch_1 = instantiate_catalogs_creative_assets_items_batch(include_optional);

	cJSON* jsoncatalogs_creative_assets_items_batch_1 = catalogs_creative_assets_items_batch_convertToJSON(catalogs_creative_assets_items_batch_1);
	printf("catalogs_creative_assets_items_batch :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_items_batch_1));
	catalogs_creative_assets_items_batch_t* catalogs_creative_assets_items_batch_2 = catalogs_creative_assets_items_batch_parseFromJSON(jsoncatalogs_creative_assets_items_batch_1);
	cJSON* jsoncatalogs_creative_assets_items_batch_2 = catalogs_creative_assets_items_batch_convertToJSON(catalogs_creative_assets_items_batch_2);
	printf("repeating catalogs_creative_assets_items_batch:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_items_batch_2));
}

int main() {
  test_catalogs_creative_assets_items_batch(1);
  test_catalogs_creative_assets_items_batch(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_items_batch_MAIN
#endif // catalogs_creative_assets_items_batch_TEST
