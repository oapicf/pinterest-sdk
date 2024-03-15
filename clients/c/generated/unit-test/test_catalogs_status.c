#ifndef catalogs_status_TEST
#define catalogs_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_status.h"
catalogs_status_t* instantiate_catalogs_status(int include_optional);



catalogs_status_t* instantiate_catalogs_status(int include_optional) {
  catalogs_status_t* catalogs_status = NULL;
  if (include_optional) {
    catalogs_status = catalogs_status_create(
    );
  } else {
    catalogs_status = catalogs_status_create(
    );
  }

  return catalogs_status;
}


#ifdef catalogs_status_MAIN

void test_catalogs_status(int include_optional) {
    catalogs_status_t* catalogs_status_1 = instantiate_catalogs_status(include_optional);

	cJSON* jsoncatalogs_status_1 = catalogs_status_convertToJSON(catalogs_status_1);
	printf("catalogs_status :\n%s\n", cJSON_Print(jsoncatalogs_status_1));
	catalogs_status_t* catalogs_status_2 = catalogs_status_parseFromJSON(jsoncatalogs_status_1);
	cJSON* jsoncatalogs_status_2 = catalogs_status_convertToJSON(catalogs_status_2);
	printf("repeating catalogs_status:\n%s\n", cJSON_Print(jsoncatalogs_status_2));
}

int main() {
  test_catalogs_status(1);
  test_catalogs_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_status_MAIN
#endif // catalogs_status_TEST
