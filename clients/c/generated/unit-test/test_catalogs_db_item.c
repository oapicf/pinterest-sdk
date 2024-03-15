#ifndef catalogs_db_item_TEST
#define catalogs_db_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define catalogs_db_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/catalogs_db_item.h"
catalogs_db_item_t* instantiate_catalogs_db_item(int include_optional);



catalogs_db_item_t* instantiate_catalogs_db_item(int include_optional) {
  catalogs_db_item_t* catalogs_db_item = NULL;
  if (include_optional) {
    catalogs_db_item = catalogs_db_item_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z"
    );
  } else {
    catalogs_db_item = catalogs_db_item_create(
      "2022-03-14T15:15:22Z",
      "0",
      "2022-03-14T15:16:34Z"
    );
  }

  return catalogs_db_item;
}


#ifdef catalogs_db_item_MAIN

void test_catalogs_db_item(int include_optional) {
    catalogs_db_item_t* catalogs_db_item_1 = instantiate_catalogs_db_item(include_optional);

	cJSON* jsoncatalogs_db_item_1 = catalogs_db_item_convertToJSON(catalogs_db_item_1);
	printf("catalogs_db_item :\n%s\n", cJSON_Print(jsoncatalogs_db_item_1));
	catalogs_db_item_t* catalogs_db_item_2 = catalogs_db_item_parseFromJSON(jsoncatalogs_db_item_1);
	cJSON* jsoncatalogs_db_item_2 = catalogs_db_item_convertToJSON(catalogs_db_item_2);
	printf("repeating catalogs_db_item:\n%s\n", cJSON_Print(jsoncatalogs_db_item_2));
}

int main() {
  test_catalogs_db_item(1);
  test_catalogs_db_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // catalogs_db_item_MAIN
#endif // catalogs_db_item_TEST
