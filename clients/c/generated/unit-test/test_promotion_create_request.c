#ifndef promotion_create_request_TEST
#define promotion_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_create_request.h"
promotion_create_request_t* instantiate_promotion_create_request(int include_optional);



promotion_create_request_t* instantiate_promotion_create_request(int include_optional) {
  promotion_create_request_t* promotion_create_request = NULL;
  if (include_optional) {
    promotion_create_request = promotion_create_request_create(
      pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_create_request__"VARIABLE",
      1677003860,
      list_createList()
    );
  } else {
    promotion_create_request = promotion_create_request_create(
      pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_create_request__"VARIABLE",
      1677003860,
      list_createList()
    );
  }

  return promotion_create_request;
}


#ifdef promotion_create_request_MAIN

void test_promotion_create_request(int include_optional) {
    promotion_create_request_t* promotion_create_request_1 = instantiate_promotion_create_request(include_optional);

	cJSON* jsonpromotion_create_request_1 = promotion_create_request_convertToJSON(promotion_create_request_1);
	printf("promotion_create_request :\n%s\n", cJSON_Print(jsonpromotion_create_request_1));
	promotion_create_request_t* promotion_create_request_2 = promotion_create_request_parseFromJSON(jsonpromotion_create_request_1);
	cJSON* jsonpromotion_create_request_2 = promotion_create_request_convertToJSON(promotion_create_request_2);
	printf("repeating promotion_create_request:\n%s\n", cJSON_Print(jsonpromotion_create_request_2));
}

int main() {
  test_promotion_create_request(1);
  test_promotion_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_create_request_MAIN
#endif // promotion_create_request_TEST
