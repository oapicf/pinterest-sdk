#ifndef amazon_connect_request_TEST
#define amazon_connect_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define amazon_connect_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/amazon_connect_request.h"
amazon_connect_request_t* instantiate_amazon_connect_request(int include_optional);



amazon_connect_request_t* instantiate_amazon_connect_request(int include_optional) {
  amazon_connect_request_t* amazon_connect_request = NULL;
  if (include_optional) {
    amazon_connect_request = amazon_connect_request_create(
      "0",
      "0",
      "0",
      "0",
      1,
      "089aee0d-92d3-4f8f-a947-6dc016d85bf0",
      "902057137772013006"
    );
  } else {
    amazon_connect_request = amazon_connect_request_create(
      "0",
      "0",
      "0",
      "0",
      1,
      "089aee0d-92d3-4f8f-a947-6dc016d85bf0",
      "902057137772013006"
    );
  }

  return amazon_connect_request;
}


#ifdef amazon_connect_request_MAIN

void test_amazon_connect_request(int include_optional) {
    amazon_connect_request_t* amazon_connect_request_1 = instantiate_amazon_connect_request(include_optional);

	cJSON* jsonamazon_connect_request_1 = amazon_connect_request_convertToJSON(amazon_connect_request_1);
	printf("amazon_connect_request :\n%s\n", cJSON_Print(jsonamazon_connect_request_1));
	amazon_connect_request_t* amazon_connect_request_2 = amazon_connect_request_parseFromJSON(jsonamazon_connect_request_1);
	cJSON* jsonamazon_connect_request_2 = amazon_connect_request_convertToJSON(amazon_connect_request_2);
	printf("repeating amazon_connect_request:\n%s\n", cJSON_Print(jsonamazon_connect_request_2));
}

int main() {
  test_amazon_connect_request(1);
  test_amazon_connect_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // amazon_connect_request_MAIN
#endif // amazon_connect_request_TEST
