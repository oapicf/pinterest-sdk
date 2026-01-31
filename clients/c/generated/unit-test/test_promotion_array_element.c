#ifndef promotion_array_element_TEST
#define promotion_array_element_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_array_element_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_array_element.h"
promotion_array_element_t* instantiate_promotion_array_element(int include_optional);

#include "test_promotion_response.c"
#include "test_exception.c"


promotion_array_element_t* instantiate_promotion_array_element(int include_optional) {
  promotion_array_element_t* promotion_array_element = NULL;
  if (include_optional) {
    promotion_array_element = promotion_array_element_create(
       // false, not to have infinite recursion
      instantiate_promotion_response(0),
       // false, not to have infinite recursion
      instantiate_exception(0)
    );
  } else {
    promotion_array_element = promotion_array_element_create(
      NULL,
      NULL
    );
  }

  return promotion_array_element;
}


#ifdef promotion_array_element_MAIN

void test_promotion_array_element(int include_optional) {
    promotion_array_element_t* promotion_array_element_1 = instantiate_promotion_array_element(include_optional);

	cJSON* jsonpromotion_array_element_1 = promotion_array_element_convertToJSON(promotion_array_element_1);
	printf("promotion_array_element :\n%s\n", cJSON_Print(jsonpromotion_array_element_1));
	promotion_array_element_t* promotion_array_element_2 = promotion_array_element_parseFromJSON(jsonpromotion_array_element_1);
	cJSON* jsonpromotion_array_element_2 = promotion_array_element_convertToJSON(promotion_array_element_2);
	printf("repeating promotion_array_element:\n%s\n", cJSON_Print(jsonpromotion_array_element_2));
}

int main() {
  test_promotion_array_element(1);
  test_promotion_array_element(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_array_element_MAIN
#endif // promotion_array_element_TEST
