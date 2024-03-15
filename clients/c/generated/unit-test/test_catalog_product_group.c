#ifndef catalog_product_group_TEST
#define catalog_product_group_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalog_product_group_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalog_product_group.h"
catalog_product_group_t* instantiate_catalog_product_group(int include_optional);

#include "test_board.c"


catalog_product_group_t* instantiate_catalog_product_group(int include_optional) {
  catalog_product_group_t* catalog_product_group = NULL;
  if (include_optional) {
    catalog_product_group = catalog_product_group_create(
      "2680059592705",
      "2680059592705",
      "Most Popular",
      {"1":["123chars_title"]},
      {"1":["123chars_title"]},
       // false, not to have infinite recursion
      instantiate_board(0),
      pinterest_rest_api_catalog_product_group__"ACTIVE",
      "a",
      1621350033000,
      1622742155000,
      6,
      2
    );
  } else {
    catalog_product_group = catalog_product_group_create(
      "2680059592705",
      "2680059592705",
      "Most Popular",
      {"1":["123chars_title"]},
      {"1":["123chars_title"]},
      NULL,
      pinterest_rest_api_catalog_product_group__"ACTIVE",
      "a",
      1621350033000,
      1622742155000,
      6,
      2
    );
  }

  return catalog_product_group;
}


#ifdef catalog_product_group_MAIN

void test_catalog_product_group(int include_optional) {
    catalog_product_group_t* catalog_product_group_1 = instantiate_catalog_product_group(include_optional);

	cJSON* jsoncatalog_product_group_1 = catalog_product_group_convertToJSON(catalog_product_group_1);
	printf("catalog_product_group :\n%s\n", cJSON_Print(jsoncatalog_product_group_1));
	catalog_product_group_t* catalog_product_group_2 = catalog_product_group_parseFromJSON(jsoncatalog_product_group_1);
	cJSON* jsoncatalog_product_group_2 = catalog_product_group_convertToJSON(catalog_product_group_2);
	printf("repeating catalog_product_group:\n%s\n", cJSON_Print(jsoncatalog_product_group_2));
}

int main() {
  test_catalog_product_group(1);
  test_catalog_product_group(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalog_product_group_MAIN
#endif // catalog_product_group_TEST
