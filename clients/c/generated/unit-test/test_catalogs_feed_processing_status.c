#ifndef catalogs_feed_processing_status_TEST
#define catalogs_feed_processing_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_processing_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_processing_status.h"
catalogs_feed_processing_status_t* instantiate_catalogs_feed_processing_status(int include_optional);



catalogs_feed_processing_status_t* instantiate_catalogs_feed_processing_status(int include_optional) {
  catalogs_feed_processing_status_t* catalogs_feed_processing_status = NULL;
  if (include_optional) {
    catalogs_feed_processing_status = catalogs_feed_processing_status_create(
    );
  } else {
    catalogs_feed_processing_status = catalogs_feed_processing_status_create(
    );
  }

  return catalogs_feed_processing_status;
}


#ifdef catalogs_feed_processing_status_MAIN

void test_catalogs_feed_processing_status(int include_optional) {
    catalogs_feed_processing_status_t* catalogs_feed_processing_status_1 = instantiate_catalogs_feed_processing_status(include_optional);

	cJSON* jsoncatalogs_feed_processing_status_1 = catalogs_feed_processing_status_convertToJSON(catalogs_feed_processing_status_1);
	printf("catalogs_feed_processing_status :\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_status_1));
	catalogs_feed_processing_status_t* catalogs_feed_processing_status_2 = catalogs_feed_processing_status_parseFromJSON(jsoncatalogs_feed_processing_status_1);
	cJSON* jsoncatalogs_feed_processing_status_2 = catalogs_feed_processing_status_convertToJSON(catalogs_feed_processing_status_2);
	printf("repeating catalogs_feed_processing_status:\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_status_2));
}

int main() {
  test_catalogs_feed_processing_status(1);
  test_catalogs_feed_processing_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_processing_status_MAIN
#endif // catalogs_feed_processing_status_TEST
