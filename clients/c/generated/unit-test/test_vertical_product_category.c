#ifndef vertical_product_category_TEST
#define vertical_product_category_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define vertical_product_category_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/vertical_product_category.h"
vertical_product_category_t* instantiate_vertical_product_category(int include_optional);



vertical_product_category_t* instantiate_vertical_product_category(int include_optional) {
  vertical_product_category_t* vertical_product_category = NULL;
  if (include_optional) {
    vertical_product_category = vertical_product_category_create(
    );
  } else {
    vertical_product_category = vertical_product_category_create(
    );
  }

  return vertical_product_category;
}


#ifdef vertical_product_category_MAIN

void test_vertical_product_category(int include_optional) {
    vertical_product_category_t* vertical_product_category_1 = instantiate_vertical_product_category(include_optional);

	cJSON* jsonvertical_product_category_1 = vertical_product_category_convertToJSON(vertical_product_category_1);
	printf("vertical_product_category :\n%s\n", cJSON_Print(jsonvertical_product_category_1));
	vertical_product_category_t* vertical_product_category_2 = vertical_product_category_parseFromJSON(jsonvertical_product_category_1);
	cJSON* jsonvertical_product_category_2 = vertical_product_category_convertToJSON(vertical_product_category_2);
	printf("repeating vertical_product_category:\n%s\n", cJSON_Print(jsonvertical_product_category_2));
}

int main() {
  test_vertical_product_category(1);
  test_vertical_product_category(0);

  printf("Hello world \n");
  return 0;
}

#endif // vertical_product_category_MAIN
#endif // vertical_product_category_TEST
