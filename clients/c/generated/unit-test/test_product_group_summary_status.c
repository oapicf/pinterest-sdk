#ifndef product_group_summary_status_TEST
#define product_group_summary_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define product_group_summary_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/product_group_summary_status.h"
product_group_summary_status_t* instantiate_product_group_summary_status(int include_optional);



product_group_summary_status_t* instantiate_product_group_summary_status(int include_optional) {
  product_group_summary_status_t* product_group_summary_status = NULL;
  if (include_optional) {
    product_group_summary_status = product_group_summary_status_create(
    );
  } else {
    product_group_summary_status = product_group_summary_status_create(
    );
  }

  return product_group_summary_status;
}


#ifdef product_group_summary_status_MAIN

void test_product_group_summary_status(int include_optional) {
    product_group_summary_status_t* product_group_summary_status_1 = instantiate_product_group_summary_status(include_optional);

	cJSON* jsonproduct_group_summary_status_1 = product_group_summary_status_convertToJSON(product_group_summary_status_1);
	printf("product_group_summary_status :\n%s\n", cJSON_Print(jsonproduct_group_summary_status_1));
	product_group_summary_status_t* product_group_summary_status_2 = product_group_summary_status_parseFromJSON(jsonproduct_group_summary_status_1);
	cJSON* jsonproduct_group_summary_status_2 = product_group_summary_status_convertToJSON(product_group_summary_status_2);
	printf("repeating product_group_summary_status:\n%s\n", cJSON_Print(jsonproduct_group_summary_status_2));
}

int main() {
  test_product_group_summary_status(1);
  test_product_group_summary_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // product_group_summary_status_MAIN
#endif // product_group_summary_status_TEST
