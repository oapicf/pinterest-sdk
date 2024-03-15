#ifndef catalogs_feed_ingestion_info_TEST
#define catalogs_feed_ingestion_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_ingestion_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_ingestion_info.h"
catalogs_feed_ingestion_info_t* instantiate_catalogs_feed_ingestion_info(int include_optional);



catalogs_feed_ingestion_info_t* instantiate_catalogs_feed_ingestion_info(int include_optional) {
  catalogs_feed_ingestion_info_t* catalogs_feed_ingestion_info = NULL;
  if (include_optional) {
    catalogs_feed_ingestion_info = catalogs_feed_ingestion_info_create(
      56,
      56,
      56
    );
  } else {
    catalogs_feed_ingestion_info = catalogs_feed_ingestion_info_create(
      56,
      56,
      56
    );
  }

  return catalogs_feed_ingestion_info;
}


#ifdef catalogs_feed_ingestion_info_MAIN

void test_catalogs_feed_ingestion_info(int include_optional) {
    catalogs_feed_ingestion_info_t* catalogs_feed_ingestion_info_1 = instantiate_catalogs_feed_ingestion_info(include_optional);

	cJSON* jsoncatalogs_feed_ingestion_info_1 = catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_info_1);
	printf("catalogs_feed_ingestion_info :\n%s\n", cJSON_Print(jsoncatalogs_feed_ingestion_info_1));
	catalogs_feed_ingestion_info_t* catalogs_feed_ingestion_info_2 = catalogs_feed_ingestion_info_parseFromJSON(jsoncatalogs_feed_ingestion_info_1);
	cJSON* jsoncatalogs_feed_ingestion_info_2 = catalogs_feed_ingestion_info_convertToJSON(catalogs_feed_ingestion_info_2);
	printf("repeating catalogs_feed_ingestion_info:\n%s\n", cJSON_Print(jsoncatalogs_feed_ingestion_info_2));
}

int main() {
  test_catalogs_feed_ingestion_info(1);
  test_catalogs_feed_ingestion_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_ingestion_info_MAIN
#endif // catalogs_feed_ingestion_info_TEST
