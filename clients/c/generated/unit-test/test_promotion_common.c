#ifndef promotion_common_TEST
#define promotion_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_common.h"
promotion_common_t* instantiate_promotion_common(int include_optional);



promotion_common_t* instantiate_promotion_common(int include_optional) {
  promotion_common_t* promotion_common = NULL;
  if (include_optional) {
    promotion_common = promotion_common_create(
      pinterest_rest_api_promotion_common_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_common__"VARIABLE",
      1677003860,
      list_createList()
    );
  } else {
    promotion_common = promotion_common_create(
      pinterest_rest_api_promotion_common_DISCOUNTSTATUS_"ACTIVE",
      1678003860,
      "abc",
      "DEFAULT",
      "blackfriday10",
      "freeshipping_2025",
      "Black Friday 10% off",
      pinterest_rest_api_promotion_common__"VARIABLE",
      1677003860,
      list_createList()
    );
  }

  return promotion_common;
}


#ifdef promotion_common_MAIN

void test_promotion_common(int include_optional) {
    promotion_common_t* promotion_common_1 = instantiate_promotion_common(include_optional);

	cJSON* jsonpromotion_common_1 = promotion_common_convertToJSON(promotion_common_1);
	printf("promotion_common :\n%s\n", cJSON_Print(jsonpromotion_common_1));
	promotion_common_t* promotion_common_2 = promotion_common_parseFromJSON(jsonpromotion_common_1);
	cJSON* jsonpromotion_common_2 = promotion_common_convertToJSON(promotion_common_2);
	printf("repeating promotion_common:\n%s\n", cJSON_Print(jsonpromotion_common_2));
}

int main() {
  test_promotion_common(1);
  test_promotion_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_common_MAIN
#endif // promotion_common_TEST
