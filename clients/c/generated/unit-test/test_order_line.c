#ifndef order_line_TEST
#define order_line_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_line_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_line.h"
order_line_t* instantiate_order_line(int include_optional);



order_line_t* instantiate_order_line(int include_optional) {
  order_line_t* order_line = NULL;
  if (include_optional) {
    order_line = order_line_create(
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
      "PAID",
      ["626735565838"]
    );
  } else {
    order_line = order_line_create(
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
      "PAID",
      ["626735565838"]
    );
  }

  return order_line;
}


#ifdef order_line_MAIN

void test_order_line(int include_optional) {
    order_line_t* order_line_1 = instantiate_order_line(include_optional);

	cJSON* jsonorder_line_1 = order_line_convertToJSON(order_line_1);
	printf("order_line :\n%s\n", cJSON_Print(jsonorder_line_1));
	order_line_t* order_line_2 = order_line_parseFromJSON(jsonorder_line_1);
	cJSON* jsonorder_line_2 = order_line_convertToJSON(order_line_2);
	printf("repeating order_line:\n%s\n", cJSON_Print(jsonorder_line_2));
}

int main() {
  test_order_line(1);
  test_order_line(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_line_MAIN
#endif // order_line_TEST
