#ifndef catalogs_feed_validation_details_TEST
#define catalogs_feed_validation_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_validation_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_validation_details.h"
catalogs_feed_validation_details_t* instantiate_catalogs_feed_validation_details(int include_optional);

#include "test_catalogs_feed_validation_errors.c"
#include "test_catalogs_feed_validation_warnings.c"


catalogs_feed_validation_details_t* instantiate_catalogs_feed_validation_details(int include_optional) {
  catalogs_feed_validation_details_t* catalogs_feed_validation_details = NULL;
  if (include_optional) {
    catalogs_feed_validation_details = catalogs_feed_validation_details_create(
       // false, not to have infinite recursion
      instantiate_catalogs_feed_validation_errors(0),
       // false, not to have infinite recursion
      instantiate_catalogs_feed_validation_warnings(0)
    );
  } else {
    catalogs_feed_validation_details = catalogs_feed_validation_details_create(
      NULL,
      NULL
    );
  }

  return catalogs_feed_validation_details;
}


#ifdef catalogs_feed_validation_details_MAIN

void test_catalogs_feed_validation_details(int include_optional) {
    catalogs_feed_validation_details_t* catalogs_feed_validation_details_1 = instantiate_catalogs_feed_validation_details(include_optional);

	cJSON* jsoncatalogs_feed_validation_details_1 = catalogs_feed_validation_details_convertToJSON(catalogs_feed_validation_details_1);
	printf("catalogs_feed_validation_details :\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_details_1));
	catalogs_feed_validation_details_t* catalogs_feed_validation_details_2 = catalogs_feed_validation_details_parseFromJSON(jsoncatalogs_feed_validation_details_1);
	cJSON* jsoncatalogs_feed_validation_details_2 = catalogs_feed_validation_details_convertToJSON(catalogs_feed_validation_details_2);
	printf("repeating catalogs_feed_validation_details:\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_details_2));
}

int main() {
  test_catalogs_feed_validation_details(1);
  test_catalogs_feed_validation_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_validation_details_MAIN
#endif // catalogs_feed_validation_details_TEST
