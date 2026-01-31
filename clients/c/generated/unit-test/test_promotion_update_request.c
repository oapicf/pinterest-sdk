#ifndef promotion_update_request_TEST
#define promotion_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_update_request.h"
promotion_update_request_t* instantiate_promotion_update_request(int include_optional);



promotion_update_request_t* instantiate_promotion_update_request(int include_optional) {
  promotion_update_request_t* promotion_update_request = NULL;
  if (include_optional) {
    promotion_update_request = promotion_update_request_create(
      pinterest_rest_api_promotion_update_request_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_update_request__"VARIABLE",
      1677003860,
      list_createList(),
      "7834020347906",
      pinterest_rest_api_promotion_update_request__"ACTIVE"
    );
  } else {
    promotion_update_request = promotion_update_request_create(
      pinterest_rest_api_promotion_update_request_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_update_request__"VARIABLE",
      1677003860,
      list_createList(),
      "7834020347906",
      pinterest_rest_api_promotion_update_request__"ACTIVE"
    );
  }

  return promotion_update_request;
}


#ifdef promotion_update_request_MAIN

void test_promotion_update_request(int include_optional) {
    promotion_update_request_t* promotion_update_request_1 = instantiate_promotion_update_request(include_optional);

	cJSON* jsonpromotion_update_request_1 = promotion_update_request_convertToJSON(promotion_update_request_1);
	printf("promotion_update_request :\n%s\n", cJSON_Print(jsonpromotion_update_request_1));
	promotion_update_request_t* promotion_update_request_2 = promotion_update_request_parseFromJSON(jsonpromotion_update_request_1);
	cJSON* jsonpromotion_update_request_2 = promotion_update_request_convertToJSON(promotion_update_request_2);
	printf("repeating promotion_update_request:\n%s\n", cJSON_Print(jsonpromotion_update_request_2));
}

int main() {
  test_promotion_update_request(1);
  test_promotion_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_update_request_MAIN
#endif // promotion_update_request_TEST
