#ifndef order_line_single_response_TEST
#define order_line_single_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define order_line_single_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/order_line_single_response.h"
order_line_single_response_t* instantiate_order_line_single_response(int include_optional);



order_line_single_response_t* instantiate_order_line_single_response(int include_optional) {
  order_line_single_response_t* order_line_single_response = NULL;
  if (include_optional) {
    order_line_single_response = order_line_single_response_create(
      0
    );
  } else {
    order_line_single_response = order_line_single_response_create(
      0
    );
  }

  return order_line_single_response;
}


#ifdef order_line_single_response_MAIN

void test_order_line_single_response(int include_optional) {
    order_line_single_response_t* order_line_single_response_1 = instantiate_order_line_single_response(include_optional);

	cJSON* jsonorder_line_single_response_1 = order_line_single_response_convertToJSON(order_line_single_response_1);
	printf("order_line_single_response :\n%s\n", cJSON_Print(jsonorder_line_single_response_1));
	order_line_single_response_t* order_line_single_response_2 = order_line_single_response_parseFromJSON(jsonorder_line_single_response_1);
	cJSON* jsonorder_line_single_response_2 = order_line_single_response_convertToJSON(order_line_single_response_2);
	printf("repeating order_line_single_response:\n%s\n", cJSON_Print(jsonorder_line_single_response_2));
}

int main() {
  test_order_line_single_response(1);
  test_order_line_single_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // order_line_single_response_MAIN
#endif // order_line_single_response_TEST
