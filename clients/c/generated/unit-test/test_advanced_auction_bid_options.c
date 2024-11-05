#ifndef advanced_auction_bid_options_TEST
#define advanced_auction_bid_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_bid_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_bid_options.h"
advanced_auction_bid_options_t* instantiate_advanced_auction_bid_options(int include_optional);



advanced_auction_bid_options_t* instantiate_advanced_auction_bid_options(int include_optional) {
  advanced_auction_bid_options_t* advanced_auction_bid_options = NULL;
  if (include_optional) {
    advanced_auction_bid_options = advanced_auction_bid_options_create(
      5000000,
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"browse":0.9,"search":1.2}
    );
  } else {
    advanced_auction_bid_options = advanced_auction_bid_options_create(
      5000000,
      {"android_mobile":1.1,"android_tablet":1.1,"ipad":1.2,"iphone":1.2,"web":0.9,"web_mobile":0.8},
      {"browse":0.9,"search":1.2}
    );
  }

  return advanced_auction_bid_options;
}


#ifdef advanced_auction_bid_options_MAIN

void test_advanced_auction_bid_options(int include_optional) {
    advanced_auction_bid_options_t* advanced_auction_bid_options_1 = instantiate_advanced_auction_bid_options(include_optional);

	cJSON* jsonadvanced_auction_bid_options_1 = advanced_auction_bid_options_convertToJSON(advanced_auction_bid_options_1);
	printf("advanced_auction_bid_options :\n%s\n", cJSON_Print(jsonadvanced_auction_bid_options_1));
	advanced_auction_bid_options_t* advanced_auction_bid_options_2 = advanced_auction_bid_options_parseFromJSON(jsonadvanced_auction_bid_options_1);
	cJSON* jsonadvanced_auction_bid_options_2 = advanced_auction_bid_options_convertToJSON(advanced_auction_bid_options_2);
	printf("repeating advanced_auction_bid_options:\n%s\n", cJSON_Print(jsonadvanced_auction_bid_options_2));
}

int main() {
  test_advanced_auction_bid_options(1);
  test_advanced_auction_bid_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_bid_options_MAIN
#endif // advanced_auction_bid_options_TEST
