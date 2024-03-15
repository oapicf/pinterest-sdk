#ifndef ssio_order_line_TEST
#define ssio_order_line_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_order_line_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_order_line.h"
ssio_order_line_t* instantiate_ssio_order_line(int include_optional);



ssio_order_line_t* instantiate_ssio_order_line(int include_optional) {
  ssio_order_line_t* ssio_order_line = NULL;
  if (include_optional) {
    ssio_order_line = ssio_order_line_create(
      "0",
      "0",
      "0",
      "2020-10-06T13:07:04.000Z",
      "Thu Mar 01 00:00:00 UTC 2018",
      "Mon Oct 05 00:00:00 UTC 2020",
      "Home Depot Inc.",
      "Mary",
      "Smith",
      "mail@test.com",
      "mail@test.com",
      "John",
      "Doe",
      pinterest_rest_api_ssio_order_line__"USD",
      "0",
      "0",
      "0",
      "0",
      "0",
      "2020-10-06T13:07:04.000Z",
      5000000,
      1.337
    );
  } else {
    ssio_order_line = ssio_order_line_create(
      "0",
      "0",
      "0",
      "2020-10-06T13:07:04.000Z",
      "Thu Mar 01 00:00:00 UTC 2018",
      "Mon Oct 05 00:00:00 UTC 2020",
      "Home Depot Inc.",
      "Mary",
      "Smith",
      "mail@test.com",
      "mail@test.com",
      "John",
      "Doe",
      pinterest_rest_api_ssio_order_line__"USD",
      "0",
      "0",
      "0",
      "0",
      "0",
      "2020-10-06T13:07:04.000Z",
      5000000,
      1.337
    );
  }

  return ssio_order_line;
}


#ifdef ssio_order_line_MAIN

void test_ssio_order_line(int include_optional) {
    ssio_order_line_t* ssio_order_line_1 = instantiate_ssio_order_line(include_optional);

	cJSON* jsonssio_order_line_1 = ssio_order_line_convertToJSON(ssio_order_line_1);
	printf("ssio_order_line :\n%s\n", cJSON_Print(jsonssio_order_line_1));
	ssio_order_line_t* ssio_order_line_2 = ssio_order_line_parseFromJSON(jsonssio_order_line_1);
	cJSON* jsonssio_order_line_2 = ssio_order_line_convertToJSON(ssio_order_line_2);
	printf("repeating ssio_order_line:\n%s\n", cJSON_Print(jsonssio_order_line_2));
}

int main() {
  test_ssio_order_line(1);
  test_ssio_order_line(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_order_line_MAIN
#endif // ssio_order_line_TEST
