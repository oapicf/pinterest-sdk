#ifndef catalogs_feed_ingestion_TEST
#define catalogs_feed_ingestion_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_ingestion_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_ingestion.h"
catalogs_feed_ingestion_t* instantiate_catalogs_feed_ingestion(int include_optional);



catalogs_feed_ingestion_t* instantiate_catalogs_feed_ingestion(int include_optional) {
  catalogs_feed_ingestion_t* catalogs_feed_ingestion = NULL;
  if (include_optional) {
    catalogs_feed_ingestion = catalogs_feed_ingestion_create(
      "01234",
      "56789",
      "2022-03-14T15:16:34Z",
      pinterest_rest_api_catalogs_feed_ingestion__COMPLETED
    );
  } else {
    catalogs_feed_ingestion = catalogs_feed_ingestion_create(
      "01234",
      "56789",
      "2022-03-14T15:16:34Z",
      pinterest_rest_api_catalogs_feed_ingestion__COMPLETED
    );
  }

  return catalogs_feed_ingestion;
}


#ifdef catalogs_feed_ingestion_MAIN

void test_catalogs_feed_ingestion(int include_optional) {
    catalogs_feed_ingestion_t* catalogs_feed_ingestion_1 = instantiate_catalogs_feed_ingestion(include_optional);

	cJSON* jsoncatalogs_feed_ingestion_1 = catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_1);
	printf("catalogs_feed_ingestion :\n%s\n", cJSON_Print(jsoncatalogs_feed_ingestion_1));
	catalogs_feed_ingestion_t* catalogs_feed_ingestion_2 = catalogs_feed_ingestion_parseFromJSON(jsoncatalogs_feed_ingestion_1);
	cJSON* jsoncatalogs_feed_ingestion_2 = catalogs_feed_ingestion_convertToJSON(catalogs_feed_ingestion_2);
	printf("repeating catalogs_feed_ingestion:\n%s\n", cJSON_Print(jsoncatalogs_feed_ingestion_2));
}

int main() {
  test_catalogs_feed_ingestion(1);
  test_catalogs_feed_ingestion(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_ingestion_MAIN
#endif // catalogs_feed_ingestion_TEST
