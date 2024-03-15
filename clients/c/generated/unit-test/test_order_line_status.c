#ifndef order_line_status_TEST
#define order_line_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_line_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_line_status.h"
order_line_status_t* instantiate_order_line_status(int include_optional);



order_line_status_t* instantiate_order_line_status(int include_optional) {
  order_line_status_t* order_line_status = NULL;
  if (include_optional) {
    order_line_status = order_line_status_create(
    );
  } else {
    order_line_status = order_line_status_create(
    );
  }

  return order_line_status;
}


#ifdef order_line_status_MAIN

void test_order_line_status(int include_optional) {
    order_line_status_t* order_line_status_1 = instantiate_order_line_status(include_optional);

	cJSON* jsonorder_line_status_1 = order_line_status_convertToJSON(order_line_status_1);
	printf("order_line_status :\n%s\n", cJSON_Print(jsonorder_line_status_1));
	order_line_status_t* order_line_status_2 = order_line_status_parseFromJSON(jsonorder_line_status_1);
	cJSON* jsonorder_line_status_2 = order_line_status_convertToJSON(order_line_status_2);
	printf("repeating order_line_status:\n%s\n", cJSON_Print(jsonorder_line_status_2));
}

int main() {
  test_order_line_status(1);
  test_order_line_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_line_status_MAIN
#endif // order_line_status_TEST
