#ifndef product_category_enum_TEST
#define product_category_enum_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_category_enum_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_category_enum.h"
product_category_enum_t* instantiate_product_category_enum(int include_optional);



product_category_enum_t* instantiate_product_category_enum(int include_optional) {
  product_category_enum_t* product_category_enum = NULL;
  if (include_optional) {
    product_category_enum = product_category_enum_create(
    );
  } else {
    product_category_enum = product_category_enum_create(
    );
  }

  return product_category_enum;
}


#ifdef product_category_enum_MAIN

void test_product_category_enum(int include_optional) {
    product_category_enum_t* product_category_enum_1 = instantiate_product_category_enum(include_optional);

	cJSON* jsonproduct_category_enum_1 = product_category_enum_convertToJSON(product_category_enum_1);
	printf("product_category_enum :\n%s\n", cJSON_Print(jsonproduct_category_enum_1));
	product_category_enum_t* product_category_enum_2 = product_category_enum_parseFromJSON(jsonproduct_category_enum_1);
	cJSON* jsonproduct_category_enum_2 = product_category_enum_convertToJSON(product_category_enum_2);
	printf("repeating product_category_enum:\n%s\n", cJSON_Print(jsonproduct_category_enum_2));
}

int main() {
  test_product_category_enum(1);
  test_product_category_enum(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_category_enum_MAIN
#endif // product_category_enum_TEST
