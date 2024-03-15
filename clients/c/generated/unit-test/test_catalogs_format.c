#ifndef catalogs_format_TEST
#define catalogs_format_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_format_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_format.h"
catalogs_format_t* instantiate_catalogs_format(int include_optional);



catalogs_format_t* instantiate_catalogs_format(int include_optional) {
  catalogs_format_t* catalogs_format = NULL;
  if (include_optional) {
    catalogs_format = catalogs_format_create(
    );
  } else {
    catalogs_format = catalogs_format_create(
    );
  }

  return catalogs_format;
}


#ifdef catalogs_format_MAIN

void test_catalogs_format(int include_optional) {
    catalogs_format_t* catalogs_format_1 = instantiate_catalogs_format(include_optional);

	cJSON* jsoncatalogs_format_1 = catalogs_format_convertToJSON(catalogs_format_1);
	printf("catalogs_format :\n%s\n", cJSON_Print(jsoncatalogs_format_1));
	catalogs_format_t* catalogs_format_2 = catalogs_format_parseFromJSON(jsoncatalogs_format_1);
	cJSON* jsoncatalogs_format_2 = catalogs_format_convertToJSON(catalogs_format_2);
	printf("repeating catalogs_format:\n%s\n", cJSON_Print(jsoncatalogs_format_2));
}

int main() {
  test_catalogs_format(1);
  test_catalogs_format(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_format_MAIN
#endif // catalogs_format_TEST
