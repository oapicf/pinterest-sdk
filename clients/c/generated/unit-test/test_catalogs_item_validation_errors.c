#ifndef catalogs_item_validation_errors_TEST
#define catalogs_item_validation_errors_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_item_validation_errors_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_item_validation_errors.h"
catalogs_item_validation_errors_t* instantiate_catalogs_item_validation_errors(int include_optional);

#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"
#include "test_catalogs_item_validation_details.c"


catalogs_item_validation_errors_t* instantiate_catalogs_item_validation_errors(int include_optional) {
  catalogs_item_validation_errors_t* catalogs_item_validation_errors = NULL;
  if (include_optional) {
    catalogs_item_validation_errors = catalogs_item_validation_errors_create(
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_details(0)
    );
  } else {
    catalogs_item_validation_errors = catalogs_item_validation_errors_create(
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return catalogs_item_validation_errors;
}


#ifdef catalogs_item_validation_errors_MAIN

void test_catalogs_item_validation_errors(int include_optional) {
    catalogs_item_validation_errors_t* catalogs_item_validation_errors_1 = instantiate_catalogs_item_validation_errors(include_optional);

	cJSON* jsoncatalogs_item_validation_errors_1 = catalogs_item_validation_errors_convertToJSON(catalogs_item_validation_errors_1);
	printf("catalogs_item_validation_errors :\n%s\n", cJSON_Print(jsoncatalogs_item_validation_errors_1));
	catalogs_item_validation_errors_t* catalogs_item_validation_errors_2 = catalogs_item_validation_errors_parseFromJSON(jsoncatalogs_item_validation_errors_1);
	cJSON* jsoncatalogs_item_validation_errors_2 = catalogs_item_validation_errors_convertToJSON(catalogs_item_validation_errors_2);
	printf("repeating catalogs_item_validation_errors:\n%s\n", cJSON_Print(jsoncatalogs_item_validation_errors_2));
}

int main() {
  test_catalogs_item_validation_errors(1);
  test_catalogs_item_validation_errors(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_item_validation_errors_MAIN
#endif // catalogs_item_validation_errors_TEST
