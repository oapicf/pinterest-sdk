#ifndef order_line_error_TEST
#define order_line_error_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_line_error_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_line_error.h"
order_line_error_t* instantiate_order_line_error(int include_optional);



order_line_error_t* instantiate_order_line_error(int include_optional) {
  order_line_error_t* order_line_error = NULL;
  if (include_optional) {
    order_line_error = order_line_error_create(
      0,
      list_createList()
    );
  } else {
    order_line_error = order_line_error_create(
      0,
      list_createList()
    );
  }

  return order_line_error;
}


#ifdef order_line_error_MAIN

void test_order_line_error(int include_optional) {
    order_line_error_t* order_line_error_1 = instantiate_order_line_error(include_optional);

	cJSON* jsonorder_line_error_1 = order_line_error_convertToJSON(order_line_error_1);
	printf("order_line_error :\n%s\n", cJSON_Print(jsonorder_line_error_1));
	order_line_error_t* order_line_error_2 = order_line_error_parseFromJSON(jsonorder_line_error_1);
	cJSON* jsonorder_line_error_2 = order_line_error_convertToJSON(order_line_error_2);
	printf("repeating order_line_error:\n%s\n", cJSON_Print(jsonorder_line_error_2));
}

int main() {
  test_order_line_error(1);
  test_order_line_error(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_line_error_MAIN
#endif // order_line_error_TEST
