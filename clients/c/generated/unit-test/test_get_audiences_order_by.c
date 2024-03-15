#ifndef get_audiences_order_by_TEST
#define get_audiences_order_by_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_audiences_order_by_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_audiences_order_by.h"
get_audiences_order_by_t* instantiate_get_audiences_order_by(int include_optional);



get_audiences_order_by_t* instantiate_get_audiences_order_by(int include_optional) {
  get_audiences_order_by_t* get_audiences_order_by = NULL;
  if (include_optional) {
    get_audiences_order_by = get_audiences_order_by_create(
    );
  } else {
    get_audiences_order_by = get_audiences_order_by_create(
    );
  }

  return get_audiences_order_by;
}


#ifdef get_audiences_order_by_MAIN

void test_get_audiences_order_by(int include_optional) {
    get_audiences_order_by_t* get_audiences_order_by_1 = instantiate_get_audiences_order_by(include_optional);

	cJSON* jsonget_audiences_order_by_1 = get_audiences_order_by_convertToJSON(get_audiences_order_by_1);
	printf("get_audiences_order_by :\n%s\n", cJSON_Print(jsonget_audiences_order_by_1));
	get_audiences_order_by_t* get_audiences_order_by_2 = get_audiences_order_by_parseFromJSON(jsonget_audiences_order_by_1);
	cJSON* jsonget_audiences_order_by_2 = get_audiences_order_by_convertToJSON(get_audiences_order_by_2);
	printf("repeating get_audiences_order_by:\n%s\n", cJSON_Print(jsonget_audiences_order_by_2));
}

int main() {
  test_get_audiences_order_by(1);
  test_get_audiences_order_by(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_audiences_order_by_MAIN
#endif // get_audiences_order_by_TEST
