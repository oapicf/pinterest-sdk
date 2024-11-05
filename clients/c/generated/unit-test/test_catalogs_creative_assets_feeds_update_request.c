#ifndef catalogs_creative_assets_feeds_update_request_TEST
#define catalogs_creative_assets_feeds_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_feeds_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_feeds_update_request.h"
catalogs_creative_assets_feeds_update_request_t* instantiate_catalogs_creative_assets_feeds_update_request(int include_optional);

#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"


catalogs_creative_assets_feeds_update_request_t* instantiate_catalogs_creative_assets_feeds_update_request(int include_optional) {
  catalogs_creative_assets_feeds_update_request_t* catalogs_creative_assets_feeds_update_request = NULL;
  if (include_optional) {
    catalogs_creative_assets_feeds_update_request = catalogs_creative_assets_feeds_update_request_create(
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__"USD",
      "0",
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__TSV,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "a",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__ACTIVE,
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__RETAIL
    );
  } else {
    catalogs_creative_assets_feeds_update_request = catalogs_creative_assets_feeds_update_request_create(
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__"USD",
      "0",
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__TSV,
      NULL,
      "a",
      NULL,
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__ACTIVE,
      pinterest_rest_api_catalogs_creative_assets_feeds_update_request__RETAIL
    );
  }

  return catalogs_creative_assets_feeds_update_request;
}


#ifdef catalogs_creative_assets_feeds_update_request_MAIN

void test_catalogs_creative_assets_feeds_update_request(int include_optional) {
    catalogs_creative_assets_feeds_update_request_t* catalogs_creative_assets_feeds_update_request_1 = instantiate_catalogs_creative_assets_feeds_update_request(include_optional);

	cJSON* jsoncatalogs_creative_assets_feeds_update_request_1 = catalogs_creative_assets_feeds_update_request_convertToJSON(catalogs_creative_assets_feeds_update_request_1);
	printf("catalogs_creative_assets_feeds_update_request :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_feeds_update_request_1));
	catalogs_creative_assets_feeds_update_request_t* catalogs_creative_assets_feeds_update_request_2 = catalogs_creative_assets_feeds_update_request_parseFromJSON(jsoncatalogs_creative_assets_feeds_update_request_1);
	cJSON* jsoncatalogs_creative_assets_feeds_update_request_2 = catalogs_creative_assets_feeds_update_request_convertToJSON(catalogs_creative_assets_feeds_update_request_2);
	printf("repeating catalogs_creative_assets_feeds_update_request:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_feeds_update_request_2));
}

int main() {
  test_catalogs_creative_assets_feeds_update_request(1);
  test_catalogs_creative_assets_feeds_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_feeds_update_request_MAIN
#endif // catalogs_creative_assets_feeds_update_request_TEST
