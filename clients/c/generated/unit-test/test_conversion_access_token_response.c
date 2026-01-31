#ifndef conversion_access_token_response_TEST
#define conversion_access_token_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_access_token_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_access_token_response.h"
conversion_access_token_response_t* instantiate_conversion_access_token_response(int include_optional);



conversion_access_token_response_t* instantiate_conversion_access_token_response(int include_optional) {
  conversion_access_token_response_t* conversion_access_token_response = NULL;
  if (include_optional) {
    conversion_access_token_response = conversion_access_token_response_create(
      "0",
      "conversion"
    );
  } else {
    conversion_access_token_response = conversion_access_token_response_create(
      "0",
      "conversion"
    );
  }

  return conversion_access_token_response;
}


#ifdef conversion_access_token_response_MAIN

void test_conversion_access_token_response(int include_optional) {
    conversion_access_token_response_t* conversion_access_token_response_1 = instantiate_conversion_access_token_response(include_optional);

	cJSON* jsonconversion_access_token_response_1 = conversion_access_token_response_convertToJSON(conversion_access_token_response_1);
	printf("conversion_access_token_response :\n%s\n", cJSON_Print(jsonconversion_access_token_response_1));
	conversion_access_token_response_t* conversion_access_token_response_2 = conversion_access_token_response_parseFromJSON(jsonconversion_access_token_response_1);
	cJSON* jsonconversion_access_token_response_2 = conversion_access_token_response_convertToJSON(conversion_access_token_response_2);
	printf("repeating conversion_access_token_response:\n%s\n", cJSON_Print(jsonconversion_access_token_response_2));
}

int main() {
  test_conversion_access_token_response(1);
  test_conversion_access_token_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_access_token_response_MAIN
#endif // conversion_access_token_response_TEST
