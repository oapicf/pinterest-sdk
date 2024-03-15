#ifndef catalogs_locale_TEST
#define catalogs_locale_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_locale_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_locale.h"
catalogs_locale_t* instantiate_catalogs_locale(int include_optional);



catalogs_locale_t* instantiate_catalogs_locale(int include_optional) {
  catalogs_locale_t* catalogs_locale = NULL;
  if (include_optional) {
    catalogs_locale = catalogs_locale_create(
    );
  } else {
    catalogs_locale = catalogs_locale_create(
    );
  }

  return catalogs_locale;
}


#ifdef catalogs_locale_MAIN

void test_catalogs_locale(int include_optional) {
    catalogs_locale_t* catalogs_locale_1 = instantiate_catalogs_locale(include_optional);

	cJSON* jsoncatalogs_locale_1 = catalogs_locale_convertToJSON(catalogs_locale_1);
	printf("catalogs_locale :\n%s\n", cJSON_Print(jsoncatalogs_locale_1));
	catalogs_locale_t* catalogs_locale_2 = catalogs_locale_parseFromJSON(jsoncatalogs_locale_1);
	cJSON* jsoncatalogs_locale_2 = catalogs_locale_convertToJSON(catalogs_locale_2);
	printf("repeating catalogs_locale:\n%s\n", cJSON_Print(jsoncatalogs_locale_2));
}

int main() {
  test_catalogs_locale(1);
  test_catalogs_locale(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_locale_MAIN
#endif // catalogs_locale_TEST
