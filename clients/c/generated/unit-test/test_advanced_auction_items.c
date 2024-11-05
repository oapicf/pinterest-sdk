#ifndef advanced_auction_items_TEST
#define advanced_auction_items_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_items_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_items.h"
advanced_auction_items_t* instantiate_advanced_auction_items(int include_optional);



advanced_auction_items_t* instantiate_advanced_auction_items(int include_optional) {
  advanced_auction_items_t* advanced_auction_items = NULL;
  if (include_optional) {
    advanced_auction_items = advanced_auction_items_create(
      "2680059592705",
      list_createList()
    );
  } else {
    advanced_auction_items = advanced_auction_items_create(
      "2680059592705",
      list_createList()
    );
  }

  return advanced_auction_items;
}


#ifdef advanced_auction_items_MAIN

void test_advanced_auction_items(int include_optional) {
    advanced_auction_items_t* advanced_auction_items_1 = instantiate_advanced_auction_items(include_optional);

	cJSON* jsonadvanced_auction_items_1 = advanced_auction_items_convertToJSON(advanced_auction_items_1);
	printf("advanced_auction_items :\n%s\n", cJSON_Print(jsonadvanced_auction_items_1));
	advanced_auction_items_t* advanced_auction_items_2 = advanced_auction_items_parseFromJSON(jsonadvanced_auction_items_1);
	cJSON* jsonadvanced_auction_items_2 = advanced_auction_items_convertToJSON(advanced_auction_items_2);
	printf("repeating advanced_auction_items:\n%s\n", cJSON_Print(jsonadvanced_auction_items_2));
}

int main() {
  test_advanced_auction_items(1);
  test_advanced_auction_items(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_items_MAIN
#endif // advanced_auction_items_TEST
