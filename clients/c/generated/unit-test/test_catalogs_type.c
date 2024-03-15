#ifndef catalogs_type_TEST
#define catalogs_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_type.h"
catalogs_type_t* instantiate_catalogs_type(int include_optional);



catalogs_type_t* instantiate_catalogs_type(int include_optional) {
  catalogs_type_t* catalogs_type = NULL;
  if (include_optional) {
    catalogs_type = catalogs_type_create(
    );
  } else {
    catalogs_type = catalogs_type_create(
    );
  }

  return catalogs_type;
}


#ifdef catalogs_type_MAIN

void test_catalogs_type(int include_optional) {
    catalogs_type_t* catalogs_type_1 = instantiate_catalogs_type(include_optional);

	cJSON* jsoncatalogs_type_1 = catalogs_type_convertToJSON(catalogs_type_1);
	printf("catalogs_type :\n%s\n", cJSON_Print(jsoncatalogs_type_1));
	catalogs_type_t* catalogs_type_2 = catalogs_type_parseFromJSON(jsoncatalogs_type_1);
	cJSON* jsoncatalogs_type_2 = catalogs_type_convertToJSON(catalogs_type_2);
	printf("repeating catalogs_type:\n%s\n", cJSON_Print(jsoncatalogs_type_2));
}

int main() {
  test_catalogs_type(1);
  test_catalogs_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_type_MAIN
#endif // catalogs_type_TEST
