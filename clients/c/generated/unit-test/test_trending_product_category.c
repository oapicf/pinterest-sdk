#ifndef trending_product_category_TEST
#define trending_product_category_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define trending_product_category_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/trending_product_category.h"
trending_product_category_t* instantiate_trending_product_category(int include_optional);



trending_product_category_t* instantiate_trending_product_category(int include_optional) {
  trending_product_category_t* trending_product_category = NULL;
  if (include_optional) {
    trending_product_category = trending_product_category_create(
      ENGAGEMENT,
      56,
      56,
      "0",
      list_createList()
    );
  } else {
    trending_product_category = trending_product_category_create(
      ENGAGEMENT,
      56,
      56,
      "0",
      list_createList()
    );
  }

  return trending_product_category;
}


#ifdef trending_product_category_MAIN

void test_trending_product_category(int include_optional) {
    trending_product_category_t* trending_product_category_1 = instantiate_trending_product_category(include_optional);

	cJSON* jsontrending_product_category_1 = trending_product_category_convertToJSON(trending_product_category_1);
	printf("trending_product_category :\n%s\n", cJSON_Print(jsontrending_product_category_1));
	trending_product_category_t* trending_product_category_2 = trending_product_category_parseFromJSON(jsontrending_product_category_1);
	cJSON* jsontrending_product_category_2 = trending_product_category_convertToJSON(trending_product_category_2);
	printf("repeating trending_product_category:\n%s\n", cJSON_Print(jsontrending_product_category_2));
}

int main() {
  test_trending_product_category(1);
  test_trending_product_category(0);

  printf("Hello world \n");
  return 0;
}

#endif // trending_product_category_MAIN
#endif // trending_product_category_TEST
