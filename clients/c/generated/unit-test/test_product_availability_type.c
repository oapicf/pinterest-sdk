#ifndef product_availability_type_TEST
#define product_availability_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_availability_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_availability_type.h"
product_availability_type_t* instantiate_product_availability_type(int include_optional);



product_availability_type_t* instantiate_product_availability_type(int include_optional) {
  product_availability_type_t* product_availability_type = NULL;
  if (include_optional) {
    product_availability_type = product_availability_type_create(
    );
  } else {
    product_availability_type = product_availability_type_create(
    );
  }

  return product_availability_type;
}


#ifdef product_availability_type_MAIN

void test_product_availability_type(int include_optional) {
    product_availability_type_t* product_availability_type_1 = instantiate_product_availability_type(include_optional);

	cJSON* jsonproduct_availability_type_1 = product_availability_type_convertToJSON(product_availability_type_1);
	printf("product_availability_type :\n%s\n", cJSON_Print(jsonproduct_availability_type_1));
	product_availability_type_t* product_availability_type_2 = product_availability_type_parseFromJSON(jsonproduct_availability_type_1);
	cJSON* jsonproduct_availability_type_2 = product_availability_type_convertToJSON(product_availability_type_2);
	printf("repeating product_availability_type:\n%s\n", cJSON_Print(jsonproduct_availability_type_2));
}

int main() {
  test_product_availability_type(1);
  test_product_availability_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_availability_type_MAIN
#endif // product_availability_type_TEST
