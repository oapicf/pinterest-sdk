#ifndef conversion_api_response_TEST
#define conversion_api_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_api_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_api_response.h"
conversion_api_response_t* instantiate_conversion_api_response(int include_optional);



conversion_api_response_t* instantiate_conversion_api_response(int include_optional) {
  conversion_api_response_t* conversion_api_response = NULL;
  if (include_optional) {
    conversion_api_response = conversion_api_response_create(
      56,
      56,
      list_createList()
    );
  } else {
    conversion_api_response = conversion_api_response_create(
      56,
      56,
      list_createList()
    );
  }

  return conversion_api_response;
}


#ifdef conversion_api_response_MAIN

void test_conversion_api_response(int include_optional) {
    conversion_api_response_t* conversion_api_response_1 = instantiate_conversion_api_response(include_optional);

	cJSON* jsonconversion_api_response_1 = conversion_api_response_convertToJSON(conversion_api_response_1);
	printf("conversion_api_response :\n%s\n", cJSON_Print(jsonconversion_api_response_1));
	conversion_api_response_t* conversion_api_response_2 = conversion_api_response_parseFromJSON(jsonconversion_api_response_1);
	cJSON* jsonconversion_api_response_2 = conversion_api_response_convertToJSON(conversion_api_response_2);
	printf("repeating conversion_api_response:\n%s\n", cJSON_Print(jsonconversion_api_response_2));
}

int main() {
  test_conversion_api_response(1);
  test_conversion_api_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_api_response_MAIN
#endif // conversion_api_response_TEST
