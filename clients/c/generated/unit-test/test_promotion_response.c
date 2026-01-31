#ifndef promotion_response_TEST
#define promotion_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_response.h"
promotion_response_t* instantiate_promotion_response(int include_optional);



promotion_response_t* instantiate_promotion_response(int include_optional) {
  promotion_response_t* promotion_response = NULL;
  if (include_optional) {
    promotion_response = promotion_response_create(
      pinterest_rest_api_promotion_response_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_response__"VARIABLE",
      1677003860,
      list_createList(),
      "549755885175",
      "7834020347906",
      pinterest_rest_api_promotion_response__"ACTIVE"
    );
  } else {
    promotion_response = promotion_response_create(
      pinterest_rest_api_promotion_response_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_response__"VARIABLE",
      1677003860,
      list_createList(),
      "549755885175",
      "7834020347906",
      pinterest_rest_api_promotion_response__"ACTIVE"
    );
  }

  return promotion_response;
}


#ifdef promotion_response_MAIN

void test_promotion_response(int include_optional) {
    promotion_response_t* promotion_response_1 = instantiate_promotion_response(include_optional);

	cJSON* jsonpromotion_response_1 = promotion_response_convertToJSON(promotion_response_1);
	printf("promotion_response :\n%s\n", cJSON_Print(jsonpromotion_response_1));
	promotion_response_t* promotion_response_2 = promotion_response_parseFromJSON(jsonpromotion_response_1);
	cJSON* jsonpromotion_response_2 = promotion_response_convertToJSON(promotion_response_2);
	printf("repeating promotion_response:\n%s\n", cJSON_Print(jsonpromotion_response_2));
}

int main() {
  test_promotion_response(1);
  test_promotion_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_response_MAIN
#endif // promotion_response_TEST
