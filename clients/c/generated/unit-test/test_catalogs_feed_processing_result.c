#ifndef catalogs_feed_processing_result_TEST
#define catalogs_feed_processing_result_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_processing_result_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_processing_result.h"
catalogs_feed_processing_result_t* instantiate_catalogs_feed_processing_result(int include_optional);

#include "test_catalogs_feed_ingestion_details.c"
#include "test_catalogs_feed_product_counts.c"
#include "test_catalogs_feed_validation_details.c"


catalogs_feed_processing_result_t* instantiate_catalogs_feed_processing_result(int include_optional) {
  catalogs_feed_processing_result_t* catalogs_feed_processing_result = NULL;
  if (include_optional) {
    catalogs_feed_processing_result = catalogs_feed_processing_result_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
       // false, not to have infinite recursion
      instantiate_catalogs_feed_ingestion_details(0),
      pinterest_rest_api_catalogs_feed_processing_result__COMPLETED,
       // false, not to have infinite recursion
      instantiate_catalogs_feed_product_counts(0),
       // false, not to have infinite recursion
      instantiate_catalogs_feed_validation_details(0)
    );
  } else {
    catalogs_feed_processing_result = catalogs_feed_processing_result_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z",
      NULL,
      pinterest_rest_api_catalogs_feed_processing_result__COMPLETED,
      NULL,
      NULL
    );
  }

  return catalogs_feed_processing_result;
}


#ifdef catalogs_feed_processing_result_MAIN

void test_catalogs_feed_processing_result(int include_optional) {
    catalogs_feed_processing_result_t* catalogs_feed_processing_result_1 = instantiate_catalogs_feed_processing_result(include_optional);

	cJSON* jsoncatalogs_feed_processing_result_1 = catalogs_feed_processing_result_convertToJSON(catalogs_feed_processing_result_1);
	printf("catalogs_feed_processing_result :\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_result_1));
	catalogs_feed_processing_result_t* catalogs_feed_processing_result_2 = catalogs_feed_processing_result_parseFromJSON(jsoncatalogs_feed_processing_result_1);
	cJSON* jsoncatalogs_feed_processing_result_2 = catalogs_feed_processing_result_convertToJSON(catalogs_feed_processing_result_2);
	printf("repeating catalogs_feed_processing_result:\n%s\n", cJSON_Print(jsoncatalogs_feed_processing_result_2));
}

int main() {
  test_catalogs_feed_processing_result(1);
  test_catalogs_feed_processing_result(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_processing_result_MAIN
#endif // catalogs_feed_processing_result_TEST
