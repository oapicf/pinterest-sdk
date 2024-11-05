#ifndef advanced_auction_items_submit_upsert_record_TEST
#define advanced_auction_items_submit_upsert_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define advanced_auction_items_submit_upsert_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/advanced_auction_items_submit_upsert_record.h"
advanced_auction_items_submit_upsert_record_t* instantiate_advanced_auction_items_submit_upsert_record(int include_optional);

#include "test_advanced_auction_bid_options.c"


advanced_auction_items_submit_upsert_record_t* instantiate_advanced_auction_items_submit_upsert_record(int include_optional) {
  advanced_auction_items_submit_upsert_record_t* advanced_auction_items_submit_upsert_record = NULL;
  if (include_optional) {
    advanced_auction_items_submit_upsert_record = advanced_auction_items_submit_upsert_record_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_items_submit_upsert_record__"US",
      pinterest_rest_api_advanced_auction_items_submit_upsert_record__"EN",
       // false, not to have infinite recursion
      instantiate_advanced_auction_bid_options(0),
      ["BID","APP_TYPE_BID_MULTIPLIER_SET"]
    );
  } else {
    advanced_auction_items_submit_upsert_record = advanced_auction_items_submit_upsert_record_create(
      "DS0294-M",
      pinterest_rest_api_advanced_auction_items_submit_upsert_record__"US",
      pinterest_rest_api_advanced_auction_items_submit_upsert_record__"EN",
      NULL,
      ["BID","APP_TYPE_BID_MULTIPLIER_SET"]
    );
  }

  return advanced_auction_items_submit_upsert_record;
}


#ifdef advanced_auction_items_submit_upsert_record_MAIN

void test_advanced_auction_items_submit_upsert_record(int include_optional) {
    advanced_auction_items_submit_upsert_record_t* advanced_auction_items_submit_upsert_record_1 = instantiate_advanced_auction_items_submit_upsert_record(include_optional);

	cJSON* jsonadvanced_auction_items_submit_upsert_record_1 = advanced_auction_items_submit_upsert_record_convertToJSON(advanced_auction_items_submit_upsert_record_1);
	printf("advanced_auction_items_submit_upsert_record :\n%s\n", cJSON_Print(jsonadvanced_auction_items_submit_upsert_record_1));
	advanced_auction_items_submit_upsert_record_t* advanced_auction_items_submit_upsert_record_2 = advanced_auction_items_submit_upsert_record_parseFromJSON(jsonadvanced_auction_items_submit_upsert_record_1);
	cJSON* jsonadvanced_auction_items_submit_upsert_record_2 = advanced_auction_items_submit_upsert_record_convertToJSON(advanced_auction_items_submit_upsert_record_2);
	printf("repeating advanced_auction_items_submit_upsert_record:\n%s\n", cJSON_Print(jsonadvanced_auction_items_submit_upsert_record_2));
}

int main() {
  test_advanced_auction_items_submit_upsert_record(1);
  test_advanced_auction_items_submit_upsert_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // advanced_auction_items_submit_upsert_record_MAIN
#endif // advanced_auction_items_submit_upsert_record_TEST
