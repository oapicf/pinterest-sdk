#ifndef pinterest_lib_pagination_order_TEST
#define pinterest_lib_pagination_order_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define pinterest_lib_pagination_order_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/pinterest_lib_pagination_order.h"
pinterest_lib_pagination_order_t* instantiate_pinterest_lib_pagination_order(int include_optional);



pinterest_lib_pagination_order_t* instantiate_pinterest_lib_pagination_order(int include_optional) {
  pinterest_lib_pagination_order_t* pinterest_lib_pagination_order = NULL;
  if (include_optional) {
    pinterest_lib_pagination_order = pinterest_lib_pagination_order_create(
    );
  } else {
    pinterest_lib_pagination_order = pinterest_lib_pagination_order_create(
    );
  }

  return pinterest_lib_pagination_order;
}


#ifdef pinterest_lib_pagination_order_MAIN

void test_pinterest_lib_pagination_order(int include_optional) {
    pinterest_lib_pagination_order_t* pinterest_lib_pagination_order_1 = instantiate_pinterest_lib_pagination_order(include_optional);

	cJSON* jsonpinterest_lib_pagination_order_1 = pinterest_lib_pagination_order_convertToJSON(pinterest_lib_pagination_order_1);
	printf("pinterest_lib_pagination_order :\n%s\n", cJSON_Print(jsonpinterest_lib_pagination_order_1));
	pinterest_lib_pagination_order_t* pinterest_lib_pagination_order_2 = pinterest_lib_pagination_order_parseFromJSON(jsonpinterest_lib_pagination_order_1);
	cJSON* jsonpinterest_lib_pagination_order_2 = pinterest_lib_pagination_order_convertToJSON(pinterest_lib_pagination_order_2);
	printf("repeating pinterest_lib_pagination_order:\n%s\n", cJSON_Print(jsonpinterest_lib_pagination_order_2));
}

int main() {
  test_pinterest_lib_pagination_order(1);
  test_pinterest_lib_pagination_order(0);

  printf("Hello world \n");
  return 0;
}

#endif // pinterest_lib_pagination_order_MAIN
#endif // pinterest_lib_pagination_order_TEST
