#ifndef catalogs_items_TEST
#define catalogs_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_items.h"
catalogs_items_t* instantiate_catalogs_items(int include_optional);



catalogs_items_t* instantiate_catalogs_items(int include_optional) {
  catalogs_items_t* catalogs_items = NULL;
  if (include_optional) {
    catalogs_items = catalogs_items_create(
      list_createList()
    );
  } else {
    catalogs_items = catalogs_items_create(
      list_createList()
    );
  }

  return catalogs_items;
}


#ifdef catalogs_items_MAIN

void test_catalogs_items(int include_optional) {
    catalogs_items_t* catalogs_items_1 = instantiate_catalogs_items(include_optional);

	cJSON* jsoncatalogs_items_1 = catalogs_items_convertToJSON(catalogs_items_1);
	printf("catalogs_items :\n%s\n", cJSON_Print(jsoncatalogs_items_1));
	catalogs_items_t* catalogs_items_2 = catalogs_items_parseFromJSON(jsoncatalogs_items_1);
	cJSON* jsoncatalogs_items_2 = catalogs_items_convertToJSON(catalogs_items_2);
	printf("repeating catalogs_items:\n%s\n", cJSON_Print(jsoncatalogs_items_2));
}

int main() {
  test_catalogs_items(1);
  test_catalogs_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_items_MAIN
#endif // catalogs_items_TEST
