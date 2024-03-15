#ifndef order_line_paid_type_TEST
#define order_line_paid_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_line_paid_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_line_paid_type.h"
order_line_paid_type_t* instantiate_order_line_paid_type(int include_optional);



order_line_paid_type_t* instantiate_order_line_paid_type(int include_optional) {
  order_line_paid_type_t* order_line_paid_type = NULL;
  if (include_optional) {
    order_line_paid_type = order_line_paid_type_create(
    );
  } else {
    order_line_paid_type = order_line_paid_type_create(
    );
  }

  return order_line_paid_type;
}


#ifdef order_line_paid_type_MAIN

void test_order_line_paid_type(int include_optional) {
    order_line_paid_type_t* order_line_paid_type_1 = instantiate_order_line_paid_type(include_optional);

	cJSON* jsonorder_line_paid_type_1 = order_line_paid_type_convertToJSON(order_line_paid_type_1);
	printf("order_line_paid_type :\n%s\n", cJSON_Print(jsonorder_line_paid_type_1));
	order_line_paid_type_t* order_line_paid_type_2 = order_line_paid_type_parseFromJSON(jsonorder_line_paid_type_1);
	cJSON* jsonorder_line_paid_type_2 = order_line_paid_type_convertToJSON(order_line_paid_type_2);
	printf("repeating order_line_paid_type:\n%s\n", cJSON_Print(jsonorder_line_paid_type_2));
}

int main() {
  test_order_line_paid_type(1);
  test_order_line_paid_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_line_paid_type_MAIN
#endif // order_line_paid_type_TEST
