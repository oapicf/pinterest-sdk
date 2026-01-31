#ifndef brand_accounts_create_200_response_TEST
#define brand_accounts_create_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define brand_accounts_create_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/brand_accounts_create_200_response.h"
brand_accounts_create_200_response_t* instantiate_brand_accounts_create_200_response(int include_optional);



brand_accounts_create_200_response_t* instantiate_brand_accounts_create_200_response(int include_optional) {
  brand_accounts_create_200_response_t* brand_accounts_create_200_response = NULL;
  if (include_optional) {
    brand_accounts_create_200_response = brand_accounts_create_200_response_create(
      "666791336903426391"
    );
  } else {
    brand_accounts_create_200_response = brand_accounts_create_200_response_create(
      "666791336903426391"
    );
  }

  return brand_accounts_create_200_response;
}


#ifdef brand_accounts_create_200_response_MAIN

void test_brand_accounts_create_200_response(int include_optional) {
    brand_accounts_create_200_response_t* brand_accounts_create_200_response_1 = instantiate_brand_accounts_create_200_response(include_optional);

	cJSON* jsonbrand_accounts_create_200_response_1 = brand_accounts_create_200_response_convertToJSON(brand_accounts_create_200_response_1);
	printf("brand_accounts_create_200_response :\n%s\n", cJSON_Print(jsonbrand_accounts_create_200_response_1));
	brand_accounts_create_200_response_t* brand_accounts_create_200_response_2 = brand_accounts_create_200_response_parseFromJSON(jsonbrand_accounts_create_200_response_1);
	cJSON* jsonbrand_accounts_create_200_response_2 = brand_accounts_create_200_response_convertToJSON(brand_accounts_create_200_response_2);
	printf("repeating brand_accounts_create_200_response:\n%s\n", cJSON_Print(jsonbrand_accounts_create_200_response_2));
}

int main() {
  test_brand_accounts_create_200_response(1);
  test_brand_accounts_create_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // brand_accounts_create_200_response_MAIN
#endif // brand_accounts_create_200_response_TEST
