#ifndef catalogs_product_group_product_counts_TEST
#define catalogs_product_group_product_counts_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_product_counts_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_product_counts.h"
catalogs_product_group_product_counts_t* instantiate_catalogs_product_group_product_counts(int include_optional);



catalogs_product_group_product_counts_t* instantiate_catalogs_product_group_product_counts(int include_optional) {
  catalogs_product_group_product_counts_t* catalogs_product_group_product_counts = NULL;
  if (include_optional) {
    catalogs_product_group_product_counts = catalogs_product_group_product_counts_create(
      0,
      0,
      0,
      0
    );
  } else {
    catalogs_product_group_product_counts = catalogs_product_group_product_counts_create(
      0,
      0,
      0,
      0
    );
  }

  return catalogs_product_group_product_counts;
}


#ifdef catalogs_product_group_product_counts_MAIN

void test_catalogs_product_group_product_counts(int include_optional) {
    catalogs_product_group_product_counts_t* catalogs_product_group_product_counts_1 = instantiate_catalogs_product_group_product_counts(include_optional);

	cJSON* jsoncatalogs_product_group_product_counts_1 = catalogs_product_group_product_counts_convertToJSON(catalogs_product_group_product_counts_1);
	printf("catalogs_product_group_product_counts :\n%s\n", cJSON_Print(jsoncatalogs_product_group_product_counts_1));
	catalogs_product_group_product_counts_t* catalogs_product_group_product_counts_2 = catalogs_product_group_product_counts_parseFromJSON(jsoncatalogs_product_group_product_counts_1);
	cJSON* jsoncatalogs_product_group_product_counts_2 = catalogs_product_group_product_counts_convertToJSON(catalogs_product_group_product_counts_2);
	printf("repeating catalogs_product_group_product_counts:\n%s\n", cJSON_Print(jsoncatalogs_product_group_product_counts_2));
}

int main() {
  test_catalogs_product_group_product_counts(1);
  test_catalogs_product_group_product_counts(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_product_counts_MAIN
#endif // catalogs_product_group_product_counts_TEST
