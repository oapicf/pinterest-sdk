#ifndef catalogs_product_group_multiple_string_list_criteria_TEST
#define catalogs_product_group_multiple_string_list_criteria_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_multiple_string_list_criteria_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_multiple_string_list_criteria.h"
catalogs_product_group_multiple_string_list_criteria_t* instantiate_catalogs_product_group_multiple_string_list_criteria(int include_optional);



catalogs_product_group_multiple_string_list_criteria_t* instantiate_catalogs_product_group_multiple_string_list_criteria(int include_optional) {
  catalogs_product_group_multiple_string_list_criteria_t* catalogs_product_group_multiple_string_list_criteria = NULL;
  if (include_optional) {
    catalogs_product_group_multiple_string_list_criteria = catalogs_product_group_multiple_string_list_criteria_create(
      list_createList(),
      1
    );
  } else {
    catalogs_product_group_multiple_string_list_criteria = catalogs_product_group_multiple_string_list_criteria_create(
      list_createList(),
      1
    );
  }

  return catalogs_product_group_multiple_string_list_criteria;
}


#ifdef catalogs_product_group_multiple_string_list_criteria_MAIN

void test_catalogs_product_group_multiple_string_list_criteria(int include_optional) {
    catalogs_product_group_multiple_string_list_criteria_t* catalogs_product_group_multiple_string_list_criteria_1 = instantiate_catalogs_product_group_multiple_string_list_criteria(include_optional);

	cJSON* jsoncatalogs_product_group_multiple_string_list_criteria_1 = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_product_group_multiple_string_list_criteria_1);
	printf("catalogs_product_group_multiple_string_list_criteria :\n%s\n", cJSON_Print(jsoncatalogs_product_group_multiple_string_list_criteria_1));
	catalogs_product_group_multiple_string_list_criteria_t* catalogs_product_group_multiple_string_list_criteria_2 = catalogs_product_group_multiple_string_list_criteria_parseFromJSON(jsoncatalogs_product_group_multiple_string_list_criteria_1);
	cJSON* jsoncatalogs_product_group_multiple_string_list_criteria_2 = catalogs_product_group_multiple_string_list_criteria_convertToJSON(catalogs_product_group_multiple_string_list_criteria_2);
	printf("repeating catalogs_product_group_multiple_string_list_criteria:\n%s\n", cJSON_Print(jsoncatalogs_product_group_multiple_string_list_criteria_2));
}

int main() {
  test_catalogs_product_group_multiple_string_list_criteria(1);
  test_catalogs_product_group_multiple_string_list_criteria(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_multiple_string_list_criteria_MAIN
#endif // catalogs_product_group_multiple_string_list_criteria_TEST
