#ifndef catalogs_item_validation_issues_TEST
#define catalogs_item_validation_issues_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_item_validation_issues_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_item_validation_issues.h"
catalogs_item_validation_issues_t* instantiate_catalogs_item_validation_issues(int include_optional);

#include "test_catalogs_item_validation_errors.c"
#include "test_catalogs_item_validation_warnings.c"


catalogs_item_validation_issues_t* instantiate_catalogs_item_validation_issues(int include_optional) {
  catalogs_item_validation_issues_t* catalogs_item_validation_issues = NULL;
  if (include_optional) {
    catalogs_item_validation_issues = catalogs_item_validation_issues_create(
      0,
      "DS0294-L",
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_errors(0),
       // false, not to have infinite recursion
      instantiate_catalogs_item_validation_warnings(0)
    );
  } else {
    catalogs_item_validation_issues = catalogs_item_validation_issues_create(
      0,
      "DS0294-L",
      NULL,
      NULL
    );
  }

  return catalogs_item_validation_issues;
}


#ifdef catalogs_item_validation_issues_MAIN

void test_catalogs_item_validation_issues(int include_optional) {
    catalogs_item_validation_issues_t* catalogs_item_validation_issues_1 = instantiate_catalogs_item_validation_issues(include_optional);

	cJSON* jsoncatalogs_item_validation_issues_1 = catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_1);
	printf("catalogs_item_validation_issues :\n%s\n", cJSON_Print(jsoncatalogs_item_validation_issues_1));
	catalogs_item_validation_issues_t* catalogs_item_validation_issues_2 = catalogs_item_validation_issues_parseFromJSON(jsoncatalogs_item_validation_issues_1);
	cJSON* jsoncatalogs_item_validation_issues_2 = catalogs_item_validation_issues_convertToJSON(catalogs_item_validation_issues_2);
	printf("repeating catalogs_item_validation_issues:\n%s\n", cJSON_Print(jsoncatalogs_item_validation_issues_2));
}

int main() {
  test_catalogs_item_validation_issues(1);
  test_catalogs_item_validation_issues(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_item_validation_issues_MAIN
#endif // catalogs_item_validation_issues_TEST
