#ifndef order_lines_TEST
#define order_lines_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_lines_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_lines.h"
order_lines_t* instantiate_order_lines(int include_optional);



order_lines_t* instantiate_order_lines(int include_optional) {
  order_lines_t* order_lines = NULL;
  if (include_optional) {
    order_lines = order_lines_create(
      "2680059592705",
      "orderline",
      "549755885175",
      "PO12345",
      1452208622,
      1461269616,
      5000000,
      5000000,
      "ACTIVE",
      "Order Line Name 1",
      "PAID"
    );
  } else {
    order_lines = order_lines_create(
      "2680059592705",
      "orderline",
      "549755885175",
      "PO12345",
      1452208622,
      1461269616,
      5000000,
      5000000,
      "ACTIVE",
      "Order Line Name 1",
      "PAID"
    );
  }

  return order_lines;
}


#ifdef order_lines_MAIN

void test_order_lines(int include_optional) {
    order_lines_t* order_lines_1 = instantiate_order_lines(include_optional);

	cJSON* jsonorder_lines_1 = order_lines_convertToJSON(order_lines_1);
	printf("order_lines :\n%s\n", cJSON_Print(jsonorder_lines_1));
	order_lines_t* order_lines_2 = order_lines_parseFromJSON(jsonorder_lines_1);
	cJSON* jsonorder_lines_2 = order_lines_convertToJSON(order_lines_2);
	printf("repeating order_lines:\n%s\n", cJSON_Print(jsonorder_lines_2));
}

int main() {
  test_order_lines(1);
  test_order_lines(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_lines_MAIN
#endif // order_lines_TEST
