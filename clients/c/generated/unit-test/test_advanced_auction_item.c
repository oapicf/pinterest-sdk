#ifndef advanced_auction_item_TEST
#define advanced_auction_item_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_item_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_item.h"
advanced_auction_item_t* instantiate_advanced_auction_item(int include_optional);

#include "test_advanced_auction_bid_options.c"


advanced_auction_item_t* instantiate_advanced_auction_item(int include_optional) {
  advanced_auction_item_t* advanced_auction_item = NULL;
  if (include_optional) {
    advanced_auction_item = advanced_auction_item_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_item__"US",
      pinterest_rest_api_advanced_auction_item__"EN",
       // false, not to have infinite recursion
      instantiate_advanced_auction_bid_options(0)
    );
  } else {
    advanced_auction_item = advanced_auction_item_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_item__"US",
      pinterest_rest_api_advanced_auction_item__"EN",
      NULL
    );
  }

  return advanced_auction_item;
}


#ifdef advanced_auction_item_MAIN

void test_advanced_auction_item(int include_optional) {
    advanced_auction_item_t* advanced_auction_item_1 = instantiate_advanced_auction_item(include_optional);

	cJSON* jsonadvanced_auction_item_1 = advanced_auction_item_convertToJSON(advanced_auction_item_1);
	printf("advanced_auction_item :\n%s\n", cJSON_Print(jsonadvanced_auction_item_1));
	advanced_auction_item_t* advanced_auction_item_2 = advanced_auction_item_parseFromJSON(jsonadvanced_auction_item_1);
	cJSON* jsonadvanced_auction_item_2 = advanced_auction_item_convertToJSON(advanced_auction_item_2);
	printf("repeating advanced_auction_item:\n%s\n", cJSON_Print(jsonadvanced_auction_item_2));
}

int main() {
  test_advanced_auction_item(1);
  test_advanced_auction_item(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_item_MAIN
#endif // advanced_auction_item_TEST
