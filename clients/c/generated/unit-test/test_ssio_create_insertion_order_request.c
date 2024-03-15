#ifndef ssio_create_insertion_order_request_TEST
#define ssio_create_insertion_order_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_create_insertion_order_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_create_insertion_order_request.h"
ssio_create_insertion_order_request_t* instantiate_ssio_create_insertion_order_request(int include_optional);



ssio_create_insertion_order_request_t* instantiate_ssio_create_insertion_order_request(int include_optional) {
  ssio_create_insertion_order_request_t* ssio_create_insertion_order_request = NULL;
  if (include_optional) {
    ssio_create_insertion_order_request = ssio_create_insertion_order_request_create(
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
      "test@example",
      56,
      "0",
      "0",
      pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_BUDGET,
      "0",
      "0",
      "0",
      "0",
      1.337,
      pinterest_rest_api_ssio_create_insertion_order_request__"USD"
    );
  } else {
    ssio_create_insertion_order_request = ssio_create_insertion_order_request_create(
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
      "test@example",
      56,
      "0",
      "0",
      pinterest_rest_api_ssio_create_insertion_order_request_ORDERLINETYPE_BUDGET,
      "0",
      "0",
      "0",
      "0",
      1.337,
      pinterest_rest_api_ssio_create_insertion_order_request__"USD"
    );
  }

  return ssio_create_insertion_order_request;
}


#ifdef ssio_create_insertion_order_request_MAIN

void test_ssio_create_insertion_order_request(int include_optional) {
    ssio_create_insertion_order_request_t* ssio_create_insertion_order_request_1 = instantiate_ssio_create_insertion_order_request(include_optional);

	cJSON* jsonssio_create_insertion_order_request_1 = ssio_create_insertion_order_request_convertToJSON(ssio_create_insertion_order_request_1);
	printf("ssio_create_insertion_order_request :\n%s\n", cJSON_Print(jsonssio_create_insertion_order_request_1));
	ssio_create_insertion_order_request_t* ssio_create_insertion_order_request_2 = ssio_create_insertion_order_request_parseFromJSON(jsonssio_create_insertion_order_request_1);
	cJSON* jsonssio_create_insertion_order_request_2 = ssio_create_insertion_order_request_convertToJSON(ssio_create_insertion_order_request_2);
	printf("repeating ssio_create_insertion_order_request:\n%s\n", cJSON_Print(jsonssio_create_insertion_order_request_2));
}

int main() {
  test_ssio_create_insertion_order_request(1);
  test_ssio_create_insertion_order_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_create_insertion_order_request_MAIN
#endif // ssio_create_insertion_order_request_TEST
