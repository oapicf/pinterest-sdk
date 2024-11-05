#ifndef catalogs_creative_assets_item_error_response_TEST
#define catalogs_creative_assets_item_error_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_item_error_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_item_error_response.h"
catalogs_creative_assets_item_error_response_t* instantiate_catalogs_creative_assets_item_error_response(int include_optional);



catalogs_creative_assets_item_error_response_t* instantiate_catalogs_creative_assets_item_error_response(int include_optional) {
  catalogs_creative_assets_item_error_response_t* catalogs_creative_assets_item_error_response = NULL;
  if (include_optional) {
    catalogs_creative_assets_item_error_response = catalogs_creative_assets_item_error_response_create(
      pinterest_rest_api_catalogs_creative_assets_item_error_response__RETAIL,
      "DS0294-M",
      list_createList()
    );
  } else {
    catalogs_creative_assets_item_error_response = catalogs_creative_assets_item_error_response_create(
      pinterest_rest_api_catalogs_creative_assets_item_error_response__RETAIL,
      "DS0294-M",
      list_createList()
    );
  }

  return catalogs_creative_assets_item_error_response;
}


#ifdef catalogs_creative_assets_item_error_response_MAIN

void test_catalogs_creative_assets_item_error_response(int include_optional) {
    catalogs_creative_assets_item_error_response_t* catalogs_creative_assets_item_error_response_1 = instantiate_catalogs_creative_assets_item_error_response(include_optional);

	cJSON* jsoncatalogs_creative_assets_item_error_response_1 = catalogs_creative_assets_item_error_response_convertToJSON(catalogs_creative_assets_item_error_response_1);
	printf("catalogs_creative_assets_item_error_response :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_item_error_response_1));
	catalogs_creative_assets_item_error_response_t* catalogs_creative_assets_item_error_response_2 = catalogs_creative_assets_item_error_response_parseFromJSON(jsoncatalogs_creative_assets_item_error_response_1);
	cJSON* jsoncatalogs_creative_assets_item_error_response_2 = catalogs_creative_assets_item_error_response_convertToJSON(catalogs_creative_assets_item_error_response_2);
	printf("repeating catalogs_creative_assets_item_error_response:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_item_error_response_2));
}

int main() {
  test_catalogs_creative_assets_item_error_response(1);
  test_catalogs_creative_assets_item_error_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_item_error_response_MAIN
#endif // catalogs_creative_assets_item_error_response_TEST
