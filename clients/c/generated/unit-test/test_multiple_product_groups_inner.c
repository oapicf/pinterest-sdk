#ifndef multiple_product_groups_inner_TEST
#define multiple_product_groups_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define multiple_product_groups_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/multiple_product_groups_inner.h"
multiple_product_groups_inner_t* instantiate_multiple_product_groups_inner(int include_optional);

#include "test_catalogs_creative_assets_product_group_filters.c"


multiple_product_groups_inner_t* instantiate_multiple_product_groups_inner(int include_optional) {
  multiple_product_groups_inner_t* multiple_product_groups_inner = NULL;
  if (include_optional) {
    multiple_product_groups_inner = multiple_product_groups_inner_create(
      "0",
      "0",
      1,
       // false, not to have infinite recursion
      instantiate_catalogs_creative_assets_product_group_filters(0),
      "2680059592705",
      pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_CREATIVE_ASSETS,
      "2680059592705",
      pinterest_rest_api_multiple_product_groups_inner__"US",
      pinterest_rest_api_multiple_product_groups_inner__af-ZA
    );
  } else {
    multiple_product_groups_inner = multiple_product_groups_inner_create(
      "0",
      "0",
      1,
      NULL,
      "2680059592705",
      pinterest_rest_api_multiple_product_groups_inner_CATALOGTYPE_CREATIVE_ASSETS,
      "2680059592705",
      pinterest_rest_api_multiple_product_groups_inner__"US",
      pinterest_rest_api_multiple_product_groups_inner__af-ZA
    );
  }

  return multiple_product_groups_inner;
}


#ifdef multiple_product_groups_inner_MAIN

void test_multiple_product_groups_inner(int include_optional) {
    multiple_product_groups_inner_t* multiple_product_groups_inner_1 = instantiate_multiple_product_groups_inner(include_optional);

	cJSON* jsonmultiple_product_groups_inner_1 = multiple_product_groups_inner_convertToJSON(multiple_product_groups_inner_1);
	printf("multiple_product_groups_inner :\n%s\n", cJSON_Print(jsonmultiple_product_groups_inner_1));
	multiple_product_groups_inner_t* multiple_product_groups_inner_2 = multiple_product_groups_inner_parseFromJSON(jsonmultiple_product_groups_inner_1);
	cJSON* jsonmultiple_product_groups_inner_2 = multiple_product_groups_inner_convertToJSON(multiple_product_groups_inner_2);
	printf("repeating multiple_product_groups_inner:\n%s\n", cJSON_Print(jsonmultiple_product_groups_inner_2));
}

int main() {
  test_multiple_product_groups_inner(1);
  test_multiple_product_groups_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // multiple_product_groups_inner_MAIN
#endif // multiple_product_groups_inner_TEST
