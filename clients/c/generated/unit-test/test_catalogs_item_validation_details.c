#ifndef catalogs_item_validation_details_TEST
#define catalogs_item_validation_details_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_item_validation_details_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_item_validation_details.h"
catalogs_item_validation_details_t* instantiate_catalogs_item_validation_details(int include_optional);



catalogs_item_validation_details_t* instantiate_catalogs_item_validation_details(int include_optional) {
  catalogs_item_validation_details_t* catalogs_item_validation_details = NULL;
  if (include_optional) {
    catalogs_item_validation_details = catalogs_item_validation_details_create(
      pinterest_rest_api_catalogs_item_validation_details__"TITLE",
      "0"
    );
  } else {
    catalogs_item_validation_details = catalogs_item_validation_details_create(
      pinterest_rest_api_catalogs_item_validation_details__"TITLE",
      "0"
    );
  }

  return catalogs_item_validation_details;
}


#ifdef catalogs_item_validation_details_MAIN

void test_catalogs_item_validation_details(int include_optional) {
    catalogs_item_validation_details_t* catalogs_item_validation_details_1 = instantiate_catalogs_item_validation_details(include_optional);

	cJSON* jsoncatalogs_item_validation_details_1 = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_details_1);
	printf("catalogs_item_validation_details :\n%s\n", cJSON_Print(jsoncatalogs_item_validation_details_1));
	catalogs_item_validation_details_t* catalogs_item_validation_details_2 = catalogs_item_validation_details_parseFromJSON(jsoncatalogs_item_validation_details_1);
	cJSON* jsoncatalogs_item_validation_details_2 = catalogs_item_validation_details_convertToJSON(catalogs_item_validation_details_2);
	printf("repeating catalogs_item_validation_details:\n%s\n", cJSON_Print(jsoncatalogs_item_validation_details_2));
}

int main() {
  test_catalogs_item_validation_details(1);
  test_catalogs_item_validation_details(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_item_validation_details_MAIN
#endif // catalogs_item_validation_details_TEST
