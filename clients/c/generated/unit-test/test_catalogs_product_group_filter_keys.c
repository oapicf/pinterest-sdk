#ifndef catalogs_product_group_filter_keys_TEST
#define catalogs_product_group_filter_keys_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_filter_keys_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_filter_keys.h"
catalogs_product_group_filter_keys_t* instantiate_catalogs_product_group_filter_keys(int include_optional);

#include "test_catalogs_product_group_pricing_criteria.c"
#include "test_catalogs_product_group_pricing_criteria.c"
#include "test_catalogs_product_group_currency_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_string_criteria.c"
#include "test_catalogs_product_group_multiple_gender_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"
#include "test_catalogs_product_group_multiple_string_list_criteria.c"


catalogs_product_group_filter_keys_t* instantiate_catalogs_product_group_filter_keys(int include_optional) {
  catalogs_product_group_filter_keys_t* catalogs_product_group_filter_keys = NULL;
  if (include_optional) {
    catalogs_product_group_filter_keys = catalogs_product_group_filter_keys_create(
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_pricing_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_pricing_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_currency_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_gender_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0),
       // false, not to have infinite recursion
      instantiate_catalogs_product_group_multiple_string_list_criteria(0)
    );
  } else {
    catalogs_product_group_filter_keys = catalogs_product_group_filter_keys_create(
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
      NULL,
      NULL,
      NULL,
      NULL
    );
  }

  return catalogs_product_group_filter_keys;
}


#ifdef catalogs_product_group_filter_keys_MAIN

void test_catalogs_product_group_filter_keys(int include_optional) {
    catalogs_product_group_filter_keys_t* catalogs_product_group_filter_keys_1 = instantiate_catalogs_product_group_filter_keys(include_optional);

	cJSON* jsoncatalogs_product_group_filter_keys_1 = catalogs_product_group_filter_keys_convertToJSON(catalogs_product_group_filter_keys_1);
	printf("catalogs_product_group_filter_keys :\n%s\n", cJSON_Print(jsoncatalogs_product_group_filter_keys_1));
	catalogs_product_group_filter_keys_t* catalogs_product_group_filter_keys_2 = catalogs_product_group_filter_keys_parseFromJSON(jsoncatalogs_product_group_filter_keys_1);
	cJSON* jsoncatalogs_product_group_filter_keys_2 = catalogs_product_group_filter_keys_convertToJSON(catalogs_product_group_filter_keys_2);
	printf("repeating catalogs_product_group_filter_keys:\n%s\n", cJSON_Print(jsoncatalogs_product_group_filter_keys_2));
}

int main() {
  test_catalogs_product_group_filter_keys(1);
  test_catalogs_product_group_filter_keys(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_filter_keys_MAIN
#endif // catalogs_product_group_filter_keys_TEST
