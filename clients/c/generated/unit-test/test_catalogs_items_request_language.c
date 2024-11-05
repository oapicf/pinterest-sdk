#ifndef catalogs_items_request_language_TEST
#define catalogs_items_request_language_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_items_request_language_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_items_request_language.h"
catalogs_items_request_language_t* instantiate_catalogs_items_request_language(int include_optional);



catalogs_items_request_language_t* instantiate_catalogs_items_request_language(int include_optional) {
  catalogs_items_request_language_t* catalogs_items_request_language = NULL;
  if (include_optional) {
    catalogs_items_request_language = catalogs_items_request_language_create(
    );
  } else {
    catalogs_items_request_language = catalogs_items_request_language_create(
    );
  }

  return catalogs_items_request_language;
}


#ifdef catalogs_items_request_language_MAIN

void test_catalogs_items_request_language(int include_optional) {
    catalogs_items_request_language_t* catalogs_items_request_language_1 = instantiate_catalogs_items_request_language(include_optional);

	cJSON* jsoncatalogs_items_request_language_1 = catalogs_items_request_language_convertToJSON(catalogs_items_request_language_1);
	printf("catalogs_items_request_language :\n%s\n", cJSON_Print(jsoncatalogs_items_request_language_1));
	catalogs_items_request_language_t* catalogs_items_request_language_2 = catalogs_items_request_language_parseFromJSON(jsoncatalogs_items_request_language_1);
	cJSON* jsoncatalogs_items_request_language_2 = catalogs_items_request_language_convertToJSON(catalogs_items_request_language_2);
	printf("repeating catalogs_items_request_language:\n%s\n", cJSON_Print(jsoncatalogs_items_request_language_2));
}

int main() {
  test_catalogs_items_request_language(1);
  test_catalogs_items_request_language(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_items_request_language_MAIN
#endif // catalogs_items_request_language_TEST
