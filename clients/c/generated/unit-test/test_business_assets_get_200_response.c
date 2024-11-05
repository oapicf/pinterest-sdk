#ifndef business_assets_get_200_response_TEST
#define business_assets_get_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define business_assets_get_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/business_assets_get_200_response.h"
business_assets_get_200_response_t* instantiate_business_assets_get_200_response(int include_optional);



business_assets_get_200_response_t* instantiate_business_assets_get_200_response(int include_optional) {
  business_assets_get_200_response_t* business_assets_get_200_response = NULL;
  if (include_optional) {
    business_assets_get_200_response = business_assets_get_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    business_assets_get_200_response = business_assets_get_200_response_create(
      list_createList(),
      "0"
    );
  }

  return business_assets_get_200_response;
}


#ifdef business_assets_get_200_response_MAIN

void test_business_assets_get_200_response(int include_optional) {
    business_assets_get_200_response_t* business_assets_get_200_response_1 = instantiate_business_assets_get_200_response(include_optional);

	cJSON* jsonbusiness_assets_get_200_response_1 = business_assets_get_200_response_convertToJSON(business_assets_get_200_response_1);
	printf("business_assets_get_200_response :\n%s\n", cJSON_Print(jsonbusiness_assets_get_200_response_1));
	business_assets_get_200_response_t* business_assets_get_200_response_2 = business_assets_get_200_response_parseFromJSON(jsonbusiness_assets_get_200_response_1);
	cJSON* jsonbusiness_assets_get_200_response_2 = business_assets_get_200_response_convertToJSON(business_assets_get_200_response_2);
	printf("repeating business_assets_get_200_response:\n%s\n", cJSON_Print(jsonbusiness_assets_get_200_response_2));
}

int main() {
  test_business_assets_get_200_response(1);
  test_business_assets_get_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // business_assets_get_200_response_MAIN
#endif // business_assets_get_200_response_TEST
