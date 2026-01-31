#ifndef product_categories_engagement_type_TEST
#define product_categories_engagement_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_categories_engagement_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_categories_engagement_type.h"
product_categories_engagement_type_t* instantiate_product_categories_engagement_type(int include_optional);



product_categories_engagement_type_t* instantiate_product_categories_engagement_type(int include_optional) {
  product_categories_engagement_type_t* product_categories_engagement_type = NULL;
  if (include_optional) {
    product_categories_engagement_type = product_categories_engagement_type_create(
    );
  } else {
    product_categories_engagement_type = product_categories_engagement_type_create(
    );
  }

  return product_categories_engagement_type;
}


#ifdef product_categories_engagement_type_MAIN

void test_product_categories_engagement_type(int include_optional) {
    product_categories_engagement_type_t* product_categories_engagement_type_1 = instantiate_product_categories_engagement_type(include_optional);

	cJSON* jsonproduct_categories_engagement_type_1 = product_categories_engagement_type_convertToJSON(product_categories_engagement_type_1);
	printf("product_categories_engagement_type :\n%s\n", cJSON_Print(jsonproduct_categories_engagement_type_1));
	product_categories_engagement_type_t* product_categories_engagement_type_2 = product_categories_engagement_type_parseFromJSON(jsonproduct_categories_engagement_type_1);
	cJSON* jsonproduct_categories_engagement_type_2 = product_categories_engagement_type_convertToJSON(product_categories_engagement_type_2);
	printf("repeating product_categories_engagement_type:\n%s\n", cJSON_Print(jsonproduct_categories_engagement_type_2));
}

int main() {
  test_product_categories_engagement_type(1);
  test_product_categories_engagement_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_categories_engagement_type_MAIN
#endif // product_categories_engagement_type_TEST
