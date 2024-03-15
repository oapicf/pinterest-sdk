#ifndef ssio_account_response_TEST
#define ssio_account_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_account_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_account_response.h"
ssio_account_response_t* instantiate_ssio_account_response(int include_optional);



ssio_account_response_t* instantiate_ssio_account_response(int include_optional) {
  ssio_account_response_t* ssio_account_response = NULL;
  if (include_optional) {
    ssio_account_response = ssio_account_response_create(
      true,
      true,
      list_createList(),
      "USD",
      list_createList(),
      "No Error"
    );
  } else {
    ssio_account_response = ssio_account_response_create(
      true,
      true,
      list_createList(),
      "USD",
      list_createList(),
      "No Error"
    );
  }

  return ssio_account_response;
}


#ifdef ssio_account_response_MAIN

void test_ssio_account_response(int include_optional) {
    ssio_account_response_t* ssio_account_response_1 = instantiate_ssio_account_response(include_optional);

	cJSON* jsonssio_account_response_1 = ssio_account_response_convertToJSON(ssio_account_response_1);
	printf("ssio_account_response :\n%s\n", cJSON_Print(jsonssio_account_response_1));
	ssio_account_response_t* ssio_account_response_2 = ssio_account_response_parseFromJSON(jsonssio_account_response_1);
	cJSON* jsonssio_account_response_2 = ssio_account_response_convertToJSON(ssio_account_response_2);
	printf("repeating ssio_account_response:\n%s\n", cJSON_Print(jsonssio_account_response_2));
}

int main() {
  test_ssio_account_response(1);
  test_ssio_account_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_account_response_MAIN
#endif // ssio_account_response_TEST
