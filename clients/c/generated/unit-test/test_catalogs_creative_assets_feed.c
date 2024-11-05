#ifndef catalogs_creative_assets_feed_TEST
#define catalogs_creative_assets_feed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_creative_assets_feed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_creative_assets_feed.h"
catalogs_creative_assets_feed_t* instantiate_catalogs_creative_assets_feed(int include_optional);

#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"


catalogs_creative_assets_feed_t* instantiate_catalogs_creative_assets_feed(int include_optional) {
  catalogs_creative_assets_feed_t* catalogs_creative_assets_feed = NULL;
  if (include_optional) {
    catalogs_creative_assets_feed = catalogs_creative_assets_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_creative_assets_feed__TSV,
      pinterest_rest_api_catalogs_creative_assets_feed__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "0",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_catalogs_creative_assets_feed__ACTIVE,
      pinterest_rest_api_catalogs_creative_assets_feed__"USD",
      "en-US",
      pinterest_rest_api_catalogs_creative_assets_feed__"US",
      "a"
    );
  } else {
    catalogs_creative_assets_feed = catalogs_creative_assets_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_creative_assets_feed__TSV,
      pinterest_rest_api_catalogs_creative_assets_feed__RETAIL,
      NULL,
      "0",
      NULL,
      pinterest_rest_api_catalogs_creative_assets_feed__ACTIVE,
      pinterest_rest_api_catalogs_creative_assets_feed__"USD",
      "en-US",
      pinterest_rest_api_catalogs_creative_assets_feed__"US",
      "a"
    );
  }

  return catalogs_creative_assets_feed;
}


#ifdef catalogs_creative_assets_feed_MAIN

void test_catalogs_creative_assets_feed(int include_optional) {
    catalogs_creative_assets_feed_t* catalogs_creative_assets_feed_1 = instantiate_catalogs_creative_assets_feed(include_optional);

	cJSON* jsoncatalogs_creative_assets_feed_1 = catalogs_creative_assets_feed_convertToJSON(catalogs_creative_assets_feed_1);
	printf("catalogs_creative_assets_feed :\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_feed_1));
	catalogs_creative_assets_feed_t* catalogs_creative_assets_feed_2 = catalogs_creative_assets_feed_parseFromJSON(jsoncatalogs_creative_assets_feed_1);
	cJSON* jsoncatalogs_creative_assets_feed_2 = catalogs_creative_assets_feed_convertToJSON(catalogs_creative_assets_feed_2);
	printf("repeating catalogs_creative_assets_feed:\n%s\n", cJSON_Print(jsoncatalogs_creative_assets_feed_2));
}

int main() {
  test_catalogs_creative_assets_feed(1);
  test_catalogs_creative_assets_feed(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_creative_assets_feed_MAIN
#endif // catalogs_creative_assets_feed_TEST
