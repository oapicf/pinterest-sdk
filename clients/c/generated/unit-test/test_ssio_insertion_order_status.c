#ifndef ssio_insertion_order_status_TEST
#define ssio_insertion_order_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_insertion_order_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_insertion_order_status.h"
ssio_insertion_order_status_t* instantiate_ssio_insertion_order_status(int include_optional);



ssio_insertion_order_status_t* instantiate_ssio_insertion_order_status(int include_optional) {
  ssio_insertion_order_status_t* ssio_insertion_order_status = NULL;
  if (include_optional) {
    ssio_insertion_order_status = ssio_insertion_order_status_create(
      "0Q01N0000015hekSAB",
      "Approved",
      "2017-06-21T23:11:11.000Z"
    );
  } else {
    ssio_insertion_order_status = ssio_insertion_order_status_create(
      "0Q01N0000015hekSAB",
      "Approved",
      "2017-06-21T23:11:11.000Z"
    );
  }

  return ssio_insertion_order_status;
}


#ifdef ssio_insertion_order_status_MAIN

void test_ssio_insertion_order_status(int include_optional) {
    ssio_insertion_order_status_t* ssio_insertion_order_status_1 = instantiate_ssio_insertion_order_status(include_optional);

	cJSON* jsonssio_insertion_order_status_1 = ssio_insertion_order_status_convertToJSON(ssio_insertion_order_status_1);
	printf("ssio_insertion_order_status :\n%s\n", cJSON_Print(jsonssio_insertion_order_status_1));
	ssio_insertion_order_status_t* ssio_insertion_order_status_2 = ssio_insertion_order_status_parseFromJSON(jsonssio_insertion_order_status_1);
	cJSON* jsonssio_insertion_order_status_2 = ssio_insertion_order_status_convertToJSON(ssio_insertion_order_status_2);
	printf("repeating ssio_insertion_order_status:\n%s\n", cJSON_Print(jsonssio_insertion_order_status_2));
}

int main() {
  test_ssio_insertion_order_status(1);
  test_ssio_insertion_order_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_insertion_order_status_MAIN
#endif // ssio_insertion_order_status_TEST
