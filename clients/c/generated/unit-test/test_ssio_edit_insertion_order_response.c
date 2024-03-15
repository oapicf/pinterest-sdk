#ifndef ssio_edit_insertion_order_response_TEST
#define ssio_edit_insertion_order_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_edit_insertion_order_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_edit_insertion_order_response.h"
ssio_edit_insertion_order_response_t* instantiate_ssio_edit_insertion_order_response(int include_optional);



ssio_edit_insertion_order_response_t* instantiate_ssio_edit_insertion_order_response(int include_optional) {
  ssio_edit_insertion_order_response_t* ssio_edit_insertion_order_response = NULL;
  if (include_optional) {
    ssio_edit_insertion_order_response = ssio_edit_insertion_order_response_create(
      "0"
    );
  } else {
    ssio_edit_insertion_order_response = ssio_edit_insertion_order_response_create(
      "0"
    );
  }

  return ssio_edit_insertion_order_response;
}


#ifdef ssio_edit_insertion_order_response_MAIN

void test_ssio_edit_insertion_order_response(int include_optional) {
    ssio_edit_insertion_order_response_t* ssio_edit_insertion_order_response_1 = instantiate_ssio_edit_insertion_order_response(include_optional);

	cJSON* jsonssio_edit_insertion_order_response_1 = ssio_edit_insertion_order_response_convertToJSON(ssio_edit_insertion_order_response_1);
	printf("ssio_edit_insertion_order_response :\n%s\n", cJSON_Print(jsonssio_edit_insertion_order_response_1));
	ssio_edit_insertion_order_response_t* ssio_edit_insertion_order_response_2 = ssio_edit_insertion_order_response_parseFromJSON(jsonssio_edit_insertion_order_response_1);
	cJSON* jsonssio_edit_insertion_order_response_2 = ssio_edit_insertion_order_response_convertToJSON(ssio_edit_insertion_order_response_2);
	printf("repeating ssio_edit_insertion_order_response:\n%s\n", cJSON_Print(jsonssio_edit_insertion_order_response_2));
}

int main() {
  test_ssio_edit_insertion_order_response(1);
  test_ssio_edit_insertion_order_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_edit_insertion_order_response_MAIN
#endif // ssio_edit_insertion_order_response_TEST
