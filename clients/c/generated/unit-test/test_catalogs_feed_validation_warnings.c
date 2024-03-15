#ifndef catalogs_feed_validation_warnings_TEST
#define catalogs_feed_validation_warnings_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_validation_warnings_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_validation_warnings.h"
catalogs_feed_validation_warnings_t* instantiate_catalogs_feed_validation_warnings(int include_optional);



catalogs_feed_validation_warnings_t* instantiate_catalogs_feed_validation_warnings(int include_optional) {
  catalogs_feed_validation_warnings_t* catalogs_feed_validation_warnings = NULL;
  if (include_optional) {
    catalogs_feed_validation_warnings = catalogs_feed_validation_warnings_create(
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_1,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56
    );
  } else {
    catalogs_feed_validation_warnings = catalogs_feed_validation_warnings_create(
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      pinterest_rest_api_catalogs_feed_validation_warnings_FETCHSAMESIGNATURE_1,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56,
      56
    );
  }

  return catalogs_feed_validation_warnings;
}


#ifdef catalogs_feed_validation_warnings_MAIN

void test_catalogs_feed_validation_warnings(int include_optional) {
    catalogs_feed_validation_warnings_t* catalogs_feed_validation_warnings_1 = instantiate_catalogs_feed_validation_warnings(include_optional);

	cJSON* jsoncatalogs_feed_validation_warnings_1 = catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_1);
	printf("catalogs_feed_validation_warnings :\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_warnings_1));
	catalogs_feed_validation_warnings_t* catalogs_feed_validation_warnings_2 = catalogs_feed_validation_warnings_parseFromJSON(jsoncatalogs_feed_validation_warnings_1);
	cJSON* jsoncatalogs_feed_validation_warnings_2 = catalogs_feed_validation_warnings_convertToJSON(catalogs_feed_validation_warnings_2);
	printf("repeating catalogs_feed_validation_warnings:\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_warnings_2));
}

int main() {
  test_catalogs_feed_validation_warnings(1);
  test_catalogs_feed_validation_warnings(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_validation_warnings_MAIN
#endif // catalogs_feed_validation_warnings_TEST
