#ifndef ssio_insertion_order_status_response_TEST
#define ssio_insertion_order_status_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_insertion_order_status_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_insertion_order_status_response.h"
ssio_insertion_order_status_response_t* instantiate_ssio_insertion_order_status_response(int include_optional);



ssio_insertion_order_status_response_t* instantiate_ssio_insertion_order_status_response(int include_optional) {
  ssio_insertion_order_status_response_t* ssio_insertion_order_status_response = NULL;
  if (include_optional) {
    ssio_insertion_order_status_response = ssio_insertion_order_status_response_create(
      "0Q01N0000015hekSAB",
      "Approved",
      "2017-06-21T23:11:11.000Z"
    );
  } else {
    ssio_insertion_order_status_response = ssio_insertion_order_status_response_create(
      "0Q01N0000015hekSAB",
      "Approved",
      "2017-06-21T23:11:11.000Z"
    );
  }

  return ssio_insertion_order_status_response;
}


#ifdef ssio_insertion_order_status_response_MAIN

void test_ssio_insertion_order_status_response(int include_optional) {
    ssio_insertion_order_status_response_t* ssio_insertion_order_status_response_1 = instantiate_ssio_insertion_order_status_response(include_optional);

	cJSON* jsonssio_insertion_order_status_response_1 = ssio_insertion_order_status_response_convertToJSON(ssio_insertion_order_status_response_1);
	printf("ssio_insertion_order_status_response :\n%s\n", cJSON_Print(jsonssio_insertion_order_status_response_1));
	ssio_insertion_order_status_response_t* ssio_insertion_order_status_response_2 = ssio_insertion_order_status_response_parseFromJSON(jsonssio_insertion_order_status_response_1);
	cJSON* jsonssio_insertion_order_status_response_2 = ssio_insertion_order_status_response_convertToJSON(ssio_insertion_order_status_response_2);
	printf("repeating ssio_insertion_order_status_response:\n%s\n", cJSON_Print(jsonssio_insertion_order_status_response_2));
}

int main() {
  test_ssio_insertion_order_status_response(1);
  test_ssio_insertion_order_status_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_insertion_order_status_response_MAIN
#endif // ssio_insertion_order_status_response_TEST
