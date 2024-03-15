#ifndef ssio_account_address_TEST
#define ssio_account_address_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_account_address_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_account_address.h"
ssio_account_address_t* instantiate_ssio_account_address(int include_optional);



ssio_account_address_t* instantiate_ssio_account_address(int include_optional) {
  ssio_account_address_t* ssio_account_address = NULL;
  if (include_optional) {
    ssio_account_address = ssio_account_address_create(
      "475 Brannan Street, San Francisco, CA 94103",
      "Billing",
      "a1C1N000004MUrLUAW",
      "PIN US OU"
    );
  } else {
    ssio_account_address = ssio_account_address_create(
      "475 Brannan Street, San Francisco, CA 94103",
      "Billing",
      "a1C1N000004MUrLUAW",
      "PIN US OU"
    );
  }

  return ssio_account_address;
}


#ifdef ssio_account_address_MAIN

void test_ssio_account_address(int include_optional) {
    ssio_account_address_t* ssio_account_address_1 = instantiate_ssio_account_address(include_optional);

	cJSON* jsonssio_account_address_1 = ssio_account_address_convertToJSON(ssio_account_address_1);
	printf("ssio_account_address :\n%s\n", cJSON_Print(jsonssio_account_address_1));
	ssio_account_address_t* ssio_account_address_2 = ssio_account_address_parseFromJSON(jsonssio_account_address_1);
	cJSON* jsonssio_account_address_2 = ssio_account_address_convertToJSON(ssio_account_address_2);
	printf("repeating ssio_account_address:\n%s\n", cJSON_Print(jsonssio_account_address_2));
}

int main() {
  test_ssio_account_address(1);
  test_ssio_account_address(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_account_address_MAIN
#endif // ssio_account_address_TEST
