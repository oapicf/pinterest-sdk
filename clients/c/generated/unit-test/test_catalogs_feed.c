#ifndef catalogs_feed_TEST
#define catalogs_feed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed.h"
catalogs_feed_t* instantiate_catalogs_feed(int include_optional);

#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"


catalogs_feed_t* instantiate_catalogs_feed(int include_optional) {
  catalogs_feed_t* catalogs_feed = NULL;
  if (include_optional) {
    catalogs_feed = catalogs_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_feed__TSV,
      pinterest_rest_api_catalogs_feed__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "0",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_catalogs_feed__ACTIVE,
      pinterest_rest_api_catalogs_feed__"USD",
      "en-US",
      pinterest_rest_api_catalogs_feed__"US",
      pinterest_rest_api_catalogs_feed__IN_STOCK,
      "a"
    );
  } else {
    catalogs_feed = catalogs_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_feed__TSV,
      pinterest_rest_api_catalogs_feed__RETAIL,
      NULL,
      "0",
      NULL,
      pinterest_rest_api_catalogs_feed__ACTIVE,
      pinterest_rest_api_catalogs_feed__"USD",
      "en-US",
      pinterest_rest_api_catalogs_feed__"US",
      pinterest_rest_api_catalogs_feed__IN_STOCK,
      "a"
    );
  }

  return catalogs_feed;
}


#ifdef catalogs_feed_MAIN

void test_catalogs_feed(int include_optional) {
    catalogs_feed_t* catalogs_feed_1 = instantiate_catalogs_feed(include_optional);

	cJSON* jsoncatalogs_feed_1 = catalogs_feed_convertToJSON(catalogs_feed_1);
	printf("catalogs_feed :\n%s\n", cJSON_Print(jsoncatalogs_feed_1));
	catalogs_feed_t* catalogs_feed_2 = catalogs_feed_parseFromJSON(jsoncatalogs_feed_1);
	cJSON* jsoncatalogs_feed_2 = catalogs_feed_convertToJSON(catalogs_feed_2);
	printf("repeating catalogs_feed:\n%s\n", cJSON_Print(jsoncatalogs_feed_2));
}

int main() {
  test_catalogs_feed(1);
  test_catalogs_feed(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_MAIN
#endif // catalogs_feed_TEST
