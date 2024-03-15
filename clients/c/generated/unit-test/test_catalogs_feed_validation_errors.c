#ifndef catalogs_feed_validation_errors_TEST
#define catalogs_feed_validation_errors_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feed_validation_errors_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feed_validation_errors.h"
catalogs_feed_validation_errors_t* instantiate_catalogs_feed_validation_errors(int include_optional);



catalogs_feed_validation_errors_t* instantiate_catalogs_feed_validation_errors(int include_optional) {
  catalogs_feed_validation_errors_t* catalogs_feed_validation_errors = NULL;
  if (include_optional) {
    catalogs_feed_validation_errors = catalogs_feed_validation_errors_create(
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
    catalogs_feed_validation_errors = catalogs_feed_validation_errors_create(
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

  return catalogs_feed_validation_errors;
}


#ifdef catalogs_feed_validation_errors_MAIN

void test_catalogs_feed_validation_errors(int include_optional) {
    catalogs_feed_validation_errors_t* catalogs_feed_validation_errors_1 = instantiate_catalogs_feed_validation_errors(include_optional);

	cJSON* jsoncatalogs_feed_validation_errors_1 = catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_errors_1);
	printf("catalogs_feed_validation_errors :\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_errors_1));
	catalogs_feed_validation_errors_t* catalogs_feed_validation_errors_2 = catalogs_feed_validation_errors_parseFromJSON(jsoncatalogs_feed_validation_errors_1);
	cJSON* jsoncatalogs_feed_validation_errors_2 = catalogs_feed_validation_errors_convertToJSON(catalogs_feed_validation_errors_2);
	printf("repeating catalogs_feed_validation_errors:\n%s\n", cJSON_Print(jsoncatalogs_feed_validation_errors_2));
}

int main() {
  test_catalogs_feed_validation_errors(1);
  test_catalogs_feed_validation_errors(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feed_validation_errors_MAIN
#endif // catalogs_feed_validation_errors_TEST
