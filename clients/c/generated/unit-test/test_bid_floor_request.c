#ifndef bid_floor_request_TEST
#define bid_floor_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bid_floor_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bid_floor_request.h"
bid_floor_request_t* instantiate_bid_floor_request(int include_optional);

#include "test_targeting_spec.c"


bid_floor_request_t* instantiate_bid_floor_request(int include_optional) {
  bid_floor_request_t* bid_floor_request = NULL;
  if (include_optional) {
    bid_floor_request = bid_floor_request_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_targeting_spec(0)
    );
  } else {
    bid_floor_request = bid_floor_request_create(
      list_createList(),
      NULL
    );
  }

  return bid_floor_request;
}


#ifdef bid_floor_request_MAIN

void test_bid_floor_request(int include_optional) {
    bid_floor_request_t* bid_floor_request_1 = instantiate_bid_floor_request(include_optional);

	cJSON* jsonbid_floor_request_1 = bid_floor_request_convertToJSON(bid_floor_request_1);
	printf("bid_floor_request :\n%s\n", cJSON_Print(jsonbid_floor_request_1));
	bid_floor_request_t* bid_floor_request_2 = bid_floor_request_parseFromJSON(jsonbid_floor_request_1);
	cJSON* jsonbid_floor_request_2 = bid_floor_request_convertToJSON(bid_floor_request_2);
	printf("repeating bid_floor_request:\n%s\n", cJSON_Print(jsonbid_floor_request_2));
}

int main() {
  test_bid_floor_request(1);
  test_bid_floor_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // bid_floor_request_MAIN
#endif // bid_floor_request_TEST
