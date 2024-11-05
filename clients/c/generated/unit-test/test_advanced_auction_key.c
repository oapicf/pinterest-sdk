#ifndef advanced_auction_key_TEST
#define advanced_auction_key_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_key_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_key.h"
advanced_auction_key_t* instantiate_advanced_auction_key(int include_optional);



advanced_auction_key_t* instantiate_advanced_auction_key(int include_optional) {
  advanced_auction_key_t* advanced_auction_key = NULL;
  if (include_optional) {
    advanced_auction_key = advanced_auction_key_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_key__"US",
      pinterest_rest_api_advanced_auction_key__"EN"
    );
  } else {
    advanced_auction_key = advanced_auction_key_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_key__"US",
      pinterest_rest_api_advanced_auction_key__"EN"
    );
  }

  return advanced_auction_key;
}


#ifdef advanced_auction_key_MAIN

void test_advanced_auction_key(int include_optional) {
    advanced_auction_key_t* advanced_auction_key_1 = instantiate_advanced_auction_key(include_optional);

	cJSON* jsonadvanced_auction_key_1 = advanced_auction_key_convertToJSON(advanced_auction_key_1);
	printf("advanced_auction_key :\n%s\n", cJSON_Print(jsonadvanced_auction_key_1));
	advanced_auction_key_t* advanced_auction_key_2 = advanced_auction_key_parseFromJSON(jsonadvanced_auction_key_1);
	cJSON* jsonadvanced_auction_key_2 = advanced_auction_key_convertToJSON(advanced_auction_key_2);
	printf("repeating advanced_auction_key:\n%s\n", cJSON_Print(jsonadvanced_auction_key_2));
}

int main() {
  test_advanced_auction_key(1);
  test_advanced_auction_key(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_key_MAIN
#endif // advanced_auction_key_TEST
