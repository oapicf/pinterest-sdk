#ifndef bid_floor_spec_TEST
#define bid_floor_spec_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bid_floor_spec_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bid_floor_spec.h"
bid_floor_spec_t* instantiate_bid_floor_spec(int include_optional);

#include "test_optimization_goal_metadata.c"


bid_floor_spec_t* instantiate_bid_floor_spec(int include_optional) {
  bid_floor_spec_t* bid_floor_spec = NULL;
  if (include_optional) {
    bid_floor_spec = bid_floor_spec_create(
      list_createList(),
      pinterest_rest_api_bid_floor_spec__"USD",
      pinterest_rest_api_bid_floor_spec__AWARENESS,
      pinterest_rest_api_bid_floor_spec__"CLICKTHROUGH",
       // false, not to have infinite recursion
      instantiate_optimization_goal_metadata(0),
      pinterest_rest_api_bid_floor_spec__"REGULAR"
    );
  } else {
    bid_floor_spec = bid_floor_spec_create(
      list_createList(),
      pinterest_rest_api_bid_floor_spec__"USD",
      pinterest_rest_api_bid_floor_spec__AWARENESS,
      pinterest_rest_api_bid_floor_spec__"CLICKTHROUGH",
      NULL,
      pinterest_rest_api_bid_floor_spec__"REGULAR"
    );
  }

  return bid_floor_spec;
}


#ifdef bid_floor_spec_MAIN

void test_bid_floor_spec(int include_optional) {
    bid_floor_spec_t* bid_floor_spec_1 = instantiate_bid_floor_spec(include_optional);

	cJSON* jsonbid_floor_spec_1 = bid_floor_spec_convertToJSON(bid_floor_spec_1);
	printf("bid_floor_spec :\n%s\n", cJSON_Print(jsonbid_floor_spec_1));
	bid_floor_spec_t* bid_floor_spec_2 = bid_floor_spec_parseFromJSON(jsonbid_floor_spec_1);
	cJSON* jsonbid_floor_spec_2 = bid_floor_spec_convertToJSON(bid_floor_spec_2);
	printf("repeating bid_floor_spec:\n%s\n", cJSON_Print(jsonbid_floor_spec_2));
}

int main() {
  test_bid_floor_spec(1);
  test_bid_floor_spec(0);

  printf("Hello world \n");
  return 0;
}

#endif // bid_floor_spec_MAIN
#endif // bid_floor_spec_TEST
