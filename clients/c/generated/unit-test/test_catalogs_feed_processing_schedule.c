#ifndef catalogs_feed_processing_schedule_TEST
#define catalogs_feed_processing_schedule_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_processing_schedule_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_processing_schedule.h"
catalogs_feed_processing_schedule_t* instantiate_catalogs_feed_processing_schedule(int include_optional);



catalogs_feed_processing_schedule_t* instantiate_catalogs_feed_processing_schedule(int include_optional) {
  catalogs_feed_processing_schedule_t* catalogs_feed_processing_schedule = NULL;
  if (include_optional) {
    catalogs_feed_processing_schedule = catalogs_feed_processing_schedule_create(
      "02:59",
      pinterest_rest_api_catalogs_feed_processing_schedule_TIMEZONE_Africa/Abidjan
    );
  } else {
    catalogs_feed_processing_schedule = catalogs_feed_processing_schedule_create(
      "02:59",
      pinterest_rest_api_catalogs_feed_processing_schedule_TIMEZONE_Africa/Abidjan
    );
  }

  return catalogs_feed_processing_schedule;
}


#ifdef catalogs_feed_processing_schedule_MAIN

void test_catalogs_feed_processing_schedule(int include_optional) {
    catalogs_feed_processing_schedule_t* catalogs_feed_processing_schedule_1 = instantiate_catalogs_feed_processing_schedule(include_optional);

	cJSON* jsoncatalogs_feed_processing_schedule_1 = catalogs_feed_processing_schedule_convertToJSON(catalogs_feed_processing_schedule_1);
	printf("catalogs_feed_processing_schedule :\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_schedule_1));
	catalogs_feed_processing_schedule_t* catalogs_feed_processing_schedule_2 = catalogs_feed_processing_schedule_parseFromJSON(jsoncatalogs_feed_processing_schedule_1);
	cJSON* jsoncatalogs_feed_processing_schedule_2 = catalogs_feed_processing_schedule_convertToJSON(catalogs_feed_processing_schedule_2);
	printf("repeating catalogs_feed_processing_schedule:\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_schedule_2));
}

int main() {
  test_catalogs_feed_processing_schedule(1);
  test_catalogs_feed_processing_schedule(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_processing_schedule_MAIN
#endif // catalogs_feed_processing_schedule_TEST
