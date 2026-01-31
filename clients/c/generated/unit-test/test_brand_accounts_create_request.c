#ifndef brand_accounts_create_request_TEST
#define brand_accounts_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define brand_accounts_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/brand_accounts_create_request.h"
brand_accounts_create_request_t* instantiate_brand_accounts_create_request(int include_optional);

#include "test_image_base64.c"


brand_accounts_create_request_t* instantiate_brand_accounts_create_request(int include_optional) {
  brand_accounts_create_request_t* brand_accounts_create_request = NULL;
  if (include_optional) {
    brand_accounts_create_request = brand_accounts_create_request_create(
      "Canada Stores",
      "canada_stores",
      pinterest_rest_api_brand_accounts_create_request__AD,
      "Stores in Canada",
      "https://www.example.com",
       // false, not to have infinite recursion
      instantiate_image_base64(0)
    );
  } else {
    brand_accounts_create_request = brand_accounts_create_request_create(
      "Canada Stores",
      "canada_stores",
      pinterest_rest_api_brand_accounts_create_request__AD,
      "Stores in Canada",
      "https://www.example.com",
      NULL
    );
  }

  return brand_accounts_create_request;
}


#ifdef brand_accounts_create_request_MAIN

void test_brand_accounts_create_request(int include_optional) {
    brand_accounts_create_request_t* brand_accounts_create_request_1 = instantiate_brand_accounts_create_request(include_optional);

	cJSON* jsonbrand_accounts_create_request_1 = brand_accounts_create_request_convertToJSON(brand_accounts_create_request_1);
	printf("brand_accounts_create_request :\n%s\n", cJSON_Print(jsonbrand_accounts_create_request_1));
	brand_accounts_create_request_t* brand_accounts_create_request_2 = brand_accounts_create_request_parseFromJSON(jsonbrand_accounts_create_request_1);
	cJSON* jsonbrand_accounts_create_request_2 = brand_accounts_create_request_convertToJSON(brand_accounts_create_request_2);
	printf("repeating brand_accounts_create_request:\n%s\n", cJSON_Print(jsonbrand_accounts_create_request_2));
}

int main() {
  test_brand_accounts_create_request(1);
  test_brand_accounts_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // brand_accounts_create_request_MAIN
#endif // brand_accounts_create_request_TEST
