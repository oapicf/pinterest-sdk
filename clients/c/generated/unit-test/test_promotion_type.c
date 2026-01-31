#ifndef promotion_type_TEST
#define promotion_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define promotion_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/promotion_type.h"
promotion_type_t* instantiate_promotion_type(int include_optional);



promotion_type_t* instantiate_promotion_type(int include_optional) {
  promotion_type_t* promotion_type = NULL;
  if (include_optional) {
    promotion_type = promotion_type_create(
    );
  } else {
    promotion_type = promotion_type_create(
    );
  }

  return promotion_type;
}


#ifdef promotion_type_MAIN

void test_promotion_type(int include_optional) {
    promotion_type_t* promotion_type_1 = instantiate_promotion_type(include_optional);

	cJSON* jsonpromotion_type_1 = promotion_type_convertToJSON(promotion_type_1);
	printf("promotion_type :\n%s\n", cJSON_Print(jsonpromotion_type_1));
	promotion_type_t* promotion_type_2 = promotion_type_parseFromJSON(jsonpromotion_type_1);
	cJSON* jsonpromotion_type_2 = promotion_type_convertToJSON(promotion_type_2);
	printf("repeating promotion_type:\n%s\n", cJSON_Print(jsonpromotion_type_2));
}

int main() {
  test_promotion_type(1);
  test_promotion_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // promotion_type_MAIN
#endif // promotion_type_TEST
