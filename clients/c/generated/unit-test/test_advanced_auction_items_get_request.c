#ifndef advanced_auction_items_get_request_TEST
#define advanced_auction_items_get_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_items_get_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_items_get_request.h"
advanced_auction_items_get_request_t* instantiate_advanced_auction_items_get_request(int include_optional);



advanced_auction_items_get_request_t* instantiate_advanced_auction_items_get_request(int include_optional) {
  advanced_auction_items_get_request_t* advanced_auction_items_get_request = NULL;
  if (include_optional) {
    advanced_auction_items_get_request = advanced_auction_items_get_request_create(
      "2680059592705",
      list_createList()
    );
  } else {
    advanced_auction_items_get_request = advanced_auction_items_get_request_create(
      "2680059592705",
      list_createList()
    );
  }

  return advanced_auction_items_get_request;
}


#ifdef advanced_auction_items_get_request_MAIN

void test_advanced_auction_items_get_request(int include_optional) {
    advanced_auction_items_get_request_t* advanced_auction_items_get_request_1 = instantiate_advanced_auction_items_get_request(include_optional);

	cJSON* jsonadvanced_auction_items_get_request_1 = advanced_auction_items_get_request_convertToJSON(advanced_auction_items_get_request_1);
	printf("advanced_auction_items_get_request :\n%s\n", cJSON_Print(jsonadvanced_auction_items_get_request_1));
	advanced_auction_items_get_request_t* advanced_auction_items_get_request_2 = advanced_auction_items_get_request_parseFromJSON(jsonadvanced_auction_items_get_request_1);
	cJSON* jsonadvanced_auction_items_get_request_2 = advanced_auction_items_get_request_convertToJSON(advanced_auction_items_get_request_2);
	printf("repeating advanced_auction_items_get_request:\n%s\n", cJSON_Print(jsonadvanced_auction_items_get_request_2));
}

int main() {
  test_advanced_auction_items_get_request(1);
  test_advanced_auction_items_get_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_items_get_request_MAIN
#endif // advanced_auction_items_get_request_TEST
