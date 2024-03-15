#ifndef ssio_insertion_order_common_TEST
#define ssio_insertion_order_common_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_insertion_order_common_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_insertion_order_common.h"
ssio_insertion_order_common_t* instantiate_ssio_insertion_order_common(int include_optional);



ssio_insertion_order_common_t* instantiate_ssio_insertion_order_common(int include_optional) {
  ssio_insertion_order_common_t* ssio_insertion_order_common = NULL;
  if (include_optional) {
    ssio_insertion_order_common = ssio_insertion_order_common_create(
      "2020-12-20",
      "2020-12-20",
      "0",
      5000000,
      "0",
      "0",
      "test@example",
      "0",
      "0",
      "test@example",
      "0",
      "test@example"
    );
  } else {
    ssio_insertion_order_common = ssio_insertion_order_common_create(
      "2020-12-20",
      "2020-12-20",
      "0",
      5000000,
      "0",
      "0",
      "test@example",
      "0",
      "0",
      "test@example",
      "0",
      "test@example"
    );
  }

  return ssio_insertion_order_common;
}


#ifdef ssio_insertion_order_common_MAIN

void test_ssio_insertion_order_common(int include_optional) {
    ssio_insertion_order_common_t* ssio_insertion_order_common_1 = instantiate_ssio_insertion_order_common(include_optional);

	cJSON* jsonssio_insertion_order_common_1 = ssio_insertion_order_common_convertToJSON(ssio_insertion_order_common_1);
	printf("ssio_insertion_order_common :\n%s\n", cJSON_Print(jsonssio_insertion_order_common_1));
	ssio_insertion_order_common_t* ssio_insertion_order_common_2 = ssio_insertion_order_common_parseFromJSON(jsonssio_insertion_order_common_1);
	cJSON* jsonssio_insertion_order_common_2 = ssio_insertion_order_common_convertToJSON(ssio_insertion_order_common_2);
	printf("repeating ssio_insertion_order_common:\n%s\n", cJSON_Print(jsonssio_insertion_order_common_2));
}

int main() {
  test_ssio_insertion_order_common(1);
  test_ssio_insertion_order_common(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_insertion_order_common_MAIN
#endif // ssio_insertion_order_common_TEST
