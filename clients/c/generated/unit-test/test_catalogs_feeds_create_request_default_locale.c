#ifndef catalogs_feeds_create_request_default_locale_TEST
#define catalogs_feeds_create_request_default_locale_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_feeds_create_request_default_locale_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_feeds_create_request_default_locale.h"
catalogs_feeds_create_request_default_locale_t* instantiate_catalogs_feeds_create_request_default_locale(int include_optional);



catalogs_feeds_create_request_default_locale_t* instantiate_catalogs_feeds_create_request_default_locale(int include_optional) {
  catalogs_feeds_create_request_default_locale_t* catalogs_feeds_create_request_default_locale = NULL;
  if (include_optional) {
    catalogs_feeds_create_request_default_locale = catalogs_feeds_create_request_default_locale_create(
    );
  } else {
    catalogs_feeds_create_request_default_locale = catalogs_feeds_create_request_default_locale_create(
    );
  }

  return catalogs_feeds_create_request_default_locale;
}


#ifdef catalogs_feeds_create_request_default_locale_MAIN

void test_catalogs_feeds_create_request_default_locale(int include_optional) {
    catalogs_feeds_create_request_default_locale_t* catalogs_feeds_create_request_default_locale_1 = instantiate_catalogs_feeds_create_request_default_locale(include_optional);

	cJSON* jsoncatalogs_feeds_create_request_default_locale_1 = catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_feeds_create_request_default_locale_1);
	printf("catalogs_feeds_create_request_default_locale :\n%s\n", cJSON_Print(jsoncatalogs_feeds_create_request_default_locale_1));
	catalogs_feeds_create_request_default_locale_t* catalogs_feeds_create_request_default_locale_2 = catalogs_feeds_create_request_default_locale_parseFromJSON(jsoncatalogs_feeds_create_request_default_locale_1);
	cJSON* jsoncatalogs_feeds_create_request_default_locale_2 = catalogs_feeds_create_request_default_locale_convertToJSON(catalogs_feeds_create_request_default_locale_2);
	printf("repeating catalogs_feeds_create_request_default_locale:\n%s\n", cJSON_Print(jsoncatalogs_feeds_create_request_default_locale_2));
}

int main() {
  test_catalogs_feeds_create_request_default_locale(1);
  test_catalogs_feeds_create_request_default_locale(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_feeds_create_request_default_locale_MAIN
#endif // catalogs_feeds_create_request_default_locale_TEST
