#ifndef product_categories_demographic_TEST
#define product_categories_demographic_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_categories_demographic_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_categories_demographic.h"
product_categories_demographic_t* instantiate_product_categories_demographic(int include_optional);

#include "test_gender_demographics.c"


product_categories_demographic_t* instantiate_product_categories_demographic(int include_optional) {
  product_categories_demographic_t* product_categories_demographic = NULL;
  if (include_optional) {
    product_categories_demographic = product_categories_demographic_create(
      list_createList(),
       // false, not to have infinite recursion
      instantiate_gender_demographics(0)
    );
  } else {
    product_categories_demographic = product_categories_demographic_create(
      list_createList(),
      NULL
    );
  }

  return product_categories_demographic;
}


#ifdef product_categories_demographic_MAIN

void test_product_categories_demographic(int include_optional) {
    product_categories_demographic_t* product_categories_demographic_1 = instantiate_product_categories_demographic(include_optional);

	cJSON* jsonproduct_categories_demographic_1 = product_categories_demographic_convertToJSON(product_categories_demographic_1);
	printf("product_categories_demographic :\n%s\n", cJSON_Print(jsonproduct_categories_demographic_1));
	product_categories_demographic_t* product_categories_demographic_2 = product_categories_demographic_parseFromJSON(jsonproduct_categories_demographic_1);
	cJSON* jsonproduct_categories_demographic_2 = product_categories_demographic_convertToJSON(product_categories_demographic_2);
	printf("repeating product_categories_demographic:\n%s\n", cJSON_Print(jsonproduct_categories_demographic_2));
}

int main() {
  test_product_categories_demographic(1);
  test_product_categories_demographic(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_categories_demographic_MAIN
#endif // product_categories_demographic_TEST
