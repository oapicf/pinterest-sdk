#ifndef non_nullable_product_availability_type_TEST
#define non_nullable_product_availability_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define non_nullable_product_availability_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/non_nullable_product_availability_type.h"
non_nullable_product_availability_type_t* instantiate_non_nullable_product_availability_type(int include_optional);



non_nullable_product_availability_type_t* instantiate_non_nullable_product_availability_type(int include_optional) {
  non_nullable_product_availability_type_t* non_nullable_product_availability_type = NULL;
  if (include_optional) {
    non_nullable_product_availability_type = non_nullable_product_availability_type_create(
    );
  } else {
    non_nullable_product_availability_type = non_nullable_product_availability_type_create(
    );
  }

  return non_nullable_product_availability_type;
}


#ifdef non_nullable_product_availability_type_MAIN

void test_non_nullable_product_availability_type(int include_optional) {
    non_nullable_product_availability_type_t* non_nullable_product_availability_type_1 = instantiate_non_nullable_product_availability_type(include_optional);

	cJSON* jsonnon_nullable_product_availability_type_1 = non_nullable_product_availability_type_convertToJSON(non_nullable_product_availability_type_1);
	printf("non_nullable_product_availability_type :\n%s\n", cJSON_Print(jsonnon_nullable_product_availability_type_1));
	non_nullable_product_availability_type_t* non_nullable_product_availability_type_2 = non_nullable_product_availability_type_parseFromJSON(jsonnon_nullable_product_availability_type_1);
	cJSON* jsonnon_nullable_product_availability_type_2 = non_nullable_product_availability_type_convertToJSON(non_nullable_product_availability_type_2);
	printf("repeating non_nullable_product_availability_type:\n%s\n", cJSON_Print(jsonnon_nullable_product_availability_type_2));
}

int main() {
  test_non_nullable_product_availability_type(1);
  test_non_nullable_product_availability_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // non_nullable_product_availability_type_MAIN
#endif // non_nullable_product_availability_type_TEST
