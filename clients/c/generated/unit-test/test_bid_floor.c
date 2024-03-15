#ifndef bid_floor_TEST
#define bid_floor_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bid_floor_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bid_floor.h"
bid_floor_t* instantiate_bid_floor(int include_optional);



bid_floor_t* instantiate_bid_floor(int include_optional) {
  bid_floor_t* bid_floor = NULL;
  if (include_optional) {
    bid_floor = bid_floor_create(
      [100000,200000],
      "bidfloor"
    );
  } else {
    bid_floor = bid_floor_create(
      [100000,200000],
      "bidfloor"
    );
  }

  return bid_floor;
}


#ifdef bid_floor_MAIN

void test_bid_floor(int include_optional) {
    bid_floor_t* bid_floor_1 = instantiate_bid_floor(include_optional);

	cJSON* jsonbid_floor_1 = bid_floor_convertToJSON(bid_floor_1);
	printf("bid_floor :\n%s\n", cJSON_Print(jsonbid_floor_1));
	bid_floor_t* bid_floor_2 = bid_floor_parseFromJSON(jsonbid_floor_1);
	cJSON* jsonbid_floor_2 = bid_floor_convertToJSON(bid_floor_2);
	printf("repeating bid_floor:\n%s\n", cJSON_Print(jsonbid_floor_2));
}

int main() {
  test_bid_floor(1);
  test_bid_floor(0);

  printf("Hello world \n");
  return 0;
}

#endif // bid_floor_MAIN
#endif // bid_floor_TEST
