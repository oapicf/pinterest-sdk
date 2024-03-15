#ifndef catalogs_product_metadata_TEST
#define catalogs_product_metadata_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_product_metadata_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_product_metadata.h"
catalogs_product_metadata_t* instantiate_catalogs_product_metadata(int include_optional);



catalogs_product_metadata_t* instantiate_catalogs_product_metadata(int include_optional) {
  catalogs_product_metadata_t* catalogs_product_metadata = NULL;
  if (include_optional) {
    catalogs_product_metadata = catalogs_product_metadata_create(
      "DS0294-L",
      "DS0294",
      pinterest_rest_api_catalogs_product_metadata__IN_STOCK,
      24.99,
      14.99,
      pinterest_rest_api_catalogs_product_metadata__"USD"
    );
  } else {
    catalogs_product_metadata = catalogs_product_metadata_create(
      "DS0294-L",
      "DS0294",
      pinterest_rest_api_catalogs_product_metadata__IN_STOCK,
      24.99,
      14.99,
      pinterest_rest_api_catalogs_product_metadata__"USD"
    );
  }

  return catalogs_product_metadata;
}


#ifdef catalogs_product_metadata_MAIN

void test_catalogs_product_metadata(int include_optional) {
    catalogs_product_metadata_t* catalogs_product_metadata_1 = instantiate_catalogs_product_metadata(include_optional);

	cJSON* jsoncatalogs_product_metadata_1 = catalogs_product_metadata_convertToJSON(catalogs_product_metadata_1);
	printf("catalogs_product_metadata :\n%s\n", cJSON_Print(jsoncatalogs_product_metadata_1));
	catalogs_product_metadata_t* catalogs_product_metadata_2 = catalogs_product_metadata_parseFromJSON(jsoncatalogs_product_metadata_1);
	cJSON* jsoncatalogs_product_metadata_2 = catalogs_product_metadata_convertToJSON(catalogs_product_metadata_2);
	printf("repeating catalogs_product_metadata:\n%s\n", cJSON_Print(jsoncatalogs_product_metadata_2));
}

int main() {
  test_catalogs_product_metadata(1);
  test_catalogs_product_metadata(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_product_metadata_MAIN
#endif // catalogs_product_metadata_TEST
