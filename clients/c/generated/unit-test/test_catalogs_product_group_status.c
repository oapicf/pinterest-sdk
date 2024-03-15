#ifndef catalogs_product_group_status_TEST
#define catalogs_product_group_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_group_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_group_status.h"
catalogs_product_group_status_t* instantiate_catalogs_product_group_status(int include_optional);



catalogs_product_group_status_t* instantiate_catalogs_product_group_status(int include_optional) {
  catalogs_product_group_status_t* catalogs_product_group_status = NULL;
  if (include_optional) {
    catalogs_product_group_status = catalogs_product_group_status_create(
    );
  } else {
    catalogs_product_group_status = catalogs_product_group_status_create(
    );
  }

  return catalogs_product_group_status;
}


#ifdef catalogs_product_group_status_MAIN

void test_catalogs_product_group_status(int include_optional) {
    catalogs_product_group_status_t* catalogs_product_group_status_1 = instantiate_catalogs_product_group_status(include_optional);

	cJSON* jsoncatalogs_product_group_status_1 = catalogs_product_group_status_convertToJSON(catalogs_product_group_status_1);
	printf("catalogs_product_group_status :\n%s\n", cJSON_Print(jsoncatalogs_product_group_status_1));
	catalogs_product_group_status_t* catalogs_product_group_status_2 = catalogs_product_group_status_parseFromJSON(jsoncatalogs_product_group_status_1);
	cJSON* jsoncatalogs_product_group_status_2 = catalogs_product_group_status_convertToJSON(catalogs_product_group_status_2);
	printf("repeating catalogs_product_group_status:\n%s\n", cJSON_Print(jsoncatalogs_product_group_status_2));
}

int main() {
  test_catalogs_product_group_status(1);
  test_catalogs_product_group_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_group_status_MAIN
#endif // catalogs_product_group_status_TEST
