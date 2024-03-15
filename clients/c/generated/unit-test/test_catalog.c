#ifndef catalog_TEST
#define catalog_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalog_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalog.h"
catalog_t* instantiate_catalog(int include_optional);



catalog_t* instantiate_catalog(int include_optional) {
  catalog_t* catalog = NULL;
  if (include_optional) {
    catalog = catalog_create(
      "2022-03-14T15:15:22Z",
      "864344156814050986",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalog__RETAIL
    );
  } else {
    catalog = catalog_create(
      "2022-03-14T15:15:22Z",
      "864344156814050986",
      "2022-03-14T15:16:34Z",
      "0",
      pinterest_rest_api_catalog__RETAIL
    );
  }

  return catalog;
}


#ifdef catalog_MAIN

void test_catalog(int include_optional) {
    catalog_t* catalog_1 = instantiate_catalog(include_optional);

	cJSON* jsoncatalog_1 = catalog_convertToJSON(catalog_1);
	printf("catalog :\n%s\n", cJSON_Print(jsoncatalog_1));
	catalog_t* catalog_2 = catalog_parseFromJSON(jsoncatalog_1);
	cJSON* jsoncatalog_2 = catalog_convertToJSON(catalog_2);
	printf("repeating catalog:\n%s\n", cJSON_Print(jsoncatalog_2));
}

int main() {
  test_catalog(1);
  test_catalog(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalog_MAIN
#endif // catalog_TEST
