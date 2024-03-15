#ifndef catalogs_item_validation_issue_TEST
#define catalogs_item_validation_issue_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_item_validation_issue_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_item_validation_issue.h"
catalogs_item_validation_issue_t* instantiate_catalogs_item_validation_issue(int include_optional);



catalogs_item_validation_issue_t* instantiate_catalogs_item_validation_issue(int include_optional) {
  catalogs_item_validation_issue_t* catalogs_item_validation_issue = NULL;
  if (include_optional) {
    catalogs_item_validation_issue = catalogs_item_validation_issue_create(
    );
  } else {
    catalogs_item_validation_issue = catalogs_item_validation_issue_create(
    );
  }

  return catalogs_item_validation_issue;
}


#ifdef catalogs_item_validation_issue_MAIN

void test_catalogs_item_validation_issue(int include_optional) {
    catalogs_item_validation_issue_t* catalogs_item_validation_issue_1 = instantiate_catalogs_item_validation_issue(include_optional);

	cJSON* jsoncatalogs_item_validation_issue_1 = catalogs_item_validation_issue_convertToJSON(catalogs_item_validation_issue_1);
	printf("catalogs_item_validation_issue :\n%s\n", cJSON_Print(jsoncatalogs_item_validation_issue_1));
	catalogs_item_validation_issue_t* catalogs_item_validation_issue_2 = catalogs_item_validation_issue_parseFromJSON(jsoncatalogs_item_validation_issue_1);
	cJSON* jsoncatalogs_item_validation_issue_2 = catalogs_item_validation_issue_convertToJSON(catalogs_item_validation_issue_2);
	printf("repeating catalogs_item_validation_issue:\n%s\n", cJSON_Print(jsoncatalogs_item_validation_issue_2));
}

int main() {
  test_catalogs_item_validation_issue(1);
  test_catalogs_item_validation_issue(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_item_validation_issue_MAIN
#endif // catalogs_item_validation_issue_TEST
