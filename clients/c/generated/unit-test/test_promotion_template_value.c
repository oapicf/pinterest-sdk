#ifndef promotion_template_value_TEST
#define promotion_template_value_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_template_value_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_template_value.h"
promotion_template_value_t* instantiate_promotion_template_value(int include_optional);



promotion_template_value_t* instantiate_promotion_template_value(int include_optional) {
  promotion_template_value_t* promotion_template_value = NULL;
  if (include_optional) {
    promotion_template_value = promotion_template_value_create(
      100,
      pinterest_rest_api_promotion_template_value__UNK,
      "My promotion",
      10
    );
  } else {
    promotion_template_value = promotion_template_value_create(
      100,
      pinterest_rest_api_promotion_template_value__UNK,
      "My promotion",
      10
    );
  }

  return promotion_template_value;
}


#ifdef promotion_template_value_MAIN

void test_promotion_template_value(int include_optional) {
    promotion_template_value_t* promotion_template_value_1 = instantiate_promotion_template_value(include_optional);

	cJSON* jsonpromotion_template_value_1 = promotion_template_value_convertToJSON(promotion_template_value_1);
	printf("promotion_template_value :\n%s\n", cJSON_Print(jsonpromotion_template_value_1));
	promotion_template_value_t* promotion_template_value_2 = promotion_template_value_parseFromJSON(jsonpromotion_template_value_1);
	cJSON* jsonpromotion_template_value_2 = promotion_template_value_convertToJSON(promotion_template_value_2);
	printf("repeating promotion_template_value:\n%s\n", cJSON_Print(jsonpromotion_template_value_2));
}

int main() {
  test_promotion_template_value(1);
  test_promotion_template_value(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_template_value_MAIN
#endif // promotion_template_value_TEST
