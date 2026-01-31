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
      "549755885175",
      5000000,
      1461269616,
      "2680059592705",
      "Order Line Name 1",
      5000000,
      "PAID",
      "PO12345",
      1452208622,
      "ACTIVE",
      "orderline"
    );
  } else {
    order_lines = order_lines_create(
      "549755885175",
      5000000,
      1461269616,
      "2680059592705",
      "Order Line Name 1",
      5000000,
      "PAID",
      "PO12345",
      1452208622,
      "ACTIVE",
      "orderline"
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
