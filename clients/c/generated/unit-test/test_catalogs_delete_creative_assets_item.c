#ifndef catalogs_delete_creative_assets_item_TEST
#define catalogs_delete_creative_assets_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_delete_creative_assets_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_delete_creative_assets_item.h"
catalogs_delete_creative_assets_item_t* instantiate_catalogs_delete_creative_assets_item(int include_optional);



catalogs_delete_creative_assets_item_t* instantiate_catalogs_delete_creative_assets_item(int include_optional) {
  catalogs_delete_creative_assets_item_t* catalogs_delete_creative_assets_item = NULL;
  if (include_optional) {
    catalogs_delete_creative_assets_item = catalogs_delete_creative_assets_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_DELETE
    );
  } else {
    catalogs_delete_creative_assets_item = catalogs_delete_creative_assets_item_create(
      "DS0294-M",
      pinterest_rest_api_catalogs_delete_creative_assets_item_OPERATION_DELETE
    );
  }

  return catalogs_delete_creative_assets_item;
}


#ifdef catalogs_delete_creative_assets_item_MAIN

void test_catalogs_delete_creative_assets_item(int include_optional) {
    catalogs_delete_creative_assets_item_t* catalogs_delete_creative_assets_item_1 = instantiate_catalogs_delete_creative_assets_item(include_optional);

	cJSON* jsoncatalogs_delete_creative_assets_item_1 = catalogs_delete_creative_assets_item_convertToJSON(catalogs_delete_creative_assets_item_1);
	printf("catalogs_delete_creative_assets_item :\n%s\n", cJSON_Print(jsoncatalogs_delete_creative_assets_item_1));
	catalogs_delete_creative_assets_item_t* catalogs_delete_creative_assets_item_2 = catalogs_delete_creative_assets_item_parseFromJSON(jsoncatalogs_delete_creative_assets_item_1);
	cJSON* jsoncatalogs_delete_creative_assets_item_2 = catalogs_delete_creative_assets_item_convertToJSON(catalogs_delete_creative_assets_item_2);
	printf("repeating catalogs_delete_creative_assets_item:\n%s\n", cJSON_Print(jsoncatalogs_delete_creative_assets_item_2));
}

int main() {
  test_catalogs_delete_creative_assets_item(1);
  test_catalogs_delete_creative_assets_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_delete_creative_assets_item_MAIN
#endif // catalogs_delete_creative_assets_item_TEST
