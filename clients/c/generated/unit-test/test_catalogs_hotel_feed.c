#ifndef catalogs_hotel_feed_TEST
#define catalogs_hotel_feed_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_hotel_feed_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_hotel_feed.h"
catalogs_hotel_feed_t* instantiate_catalogs_hotel_feed(int include_optional);

#include "test_catalogs_feed_credentials.c"
#include "test_catalogs_feed_processing_schedule.c"


catalogs_hotel_feed_t* instantiate_catalogs_hotel_feed(int include_optional) {
  catalogs_hotel_feed_t* catalogs_hotel_feed = NULL;
  if (include_optional) {
    catalogs_hotel_feed = catalogs_hotel_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_hotel_feed__TSV,
      pinterest_rest_api_catalogs_hotel_feed__RETAIL,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_credentials(0),
      "0",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_processing_schedule(0),
      pinterest_rest_api_catalogs_hotel_feed__ACTIVE,
      pinterest_rest_api_catalogs_hotel_feed__"USD",
      "en-US",
      "a"
    );
  } else {
    catalogs_hotel_feed = catalogs_hotel_feed_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalogs_hotel_feed__TSV,
      pinterest_rest_api_catalogs_hotel_feed__RETAIL,
      NULL,
      "0",
      NULL,
      pinterest_rest_api_catalogs_hotel_feed__ACTIVE,
      pinterest_rest_api_catalogs_hotel_feed__"USD",
      "en-US",
      "a"
    );
  }

  return catalogs_hotel_feed;
}


#ifdef catalogs_hotel_feed_MAIN

void test_catalogs_hotel_feed(int include_optional) {
    catalogs_hotel_feed_t* catalogs_hotel_feed_1 = instantiate_catalogs_hotel_feed(include_optional);

	cJSON* jsoncatalogs_hotel_feed_1 = catalogs_hotel_feed_convertToJSON(catalogs_hotel_feed_1);
	printf("catalogs_hotel_feed :\n%s\n", cJSON_Print(jsoncatalogs_hotel_feed_1));
	catalogs_hotel_feed_t* catalogs_hotel_feed_2 = catalogs_hotel_feed_parseFromJSON(jsoncatalogs_hotel_feed_1);
	cJSON* jsoncatalogs_hotel_feed_2 = catalogs_hotel_feed_convertToJSON(catalogs_hotel_feed_2);
	printf("repeating catalogs_hotel_feed:\n%s\n", cJSON_Print(jsoncatalogs_hotel_feed_2));
}

int main() {
  test_catalogs_hotel_feed(1);
  test_catalogs_hotel_feed(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_hotel_feed_MAIN
#endif // catalogs_hotel_feed_TEST
