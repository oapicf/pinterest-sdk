#ifndef ssio_account_pmp_name_TEST
#define ssio_account_pmp_name_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ssio_account_pmp_name_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ssio_account_pmp_name.h"
ssio_account_pmp_name_t* instantiate_ssio_account_pmp_name(int include_optional);



ssio_account_pmp_name_t* instantiate_ssio_account_pmp_name(int include_optional) {
  ssio_account_pmp_name_t* ssio_account_pmp_name = NULL;
  if (include_optional) {
    ssio_account_pmp_name = ssio_account_pmp_name_create(
      "Bidalgo",
      "0011N00001LW2aSQAT"
    );
  } else {
    ssio_account_pmp_name = ssio_account_pmp_name_create(
      "Bidalgo",
      "0011N00001LW2aSQAT"
    );
  }

  return ssio_account_pmp_name;
}


#ifdef ssio_account_pmp_name_MAIN

void test_ssio_account_pmp_name(int include_optional) {
    ssio_account_pmp_name_t* ssio_account_pmp_name_1 = instantiate_ssio_account_pmp_name(include_optional);

	cJSON* jsonssio_account_pmp_name_1 = ssio_account_pmp_name_convertToJSON(ssio_account_pmp_name_1);
	printf("ssio_account_pmp_name :\n%s\n", cJSON_Print(jsonssio_account_pmp_name_1));
	ssio_account_pmp_name_t* ssio_account_pmp_name_2 = ssio_account_pmp_name_parseFromJSON(jsonssio_account_pmp_name_1);
	cJSON* jsonssio_account_pmp_name_2 = ssio_account_pmp_name_convertToJSON(ssio_account_pmp_name_2);
	printf("repeating ssio_account_pmp_name:\n%s\n", cJSON_Print(jsonssio_account_pmp_name_2));
}

int main() {
  test_ssio_account_pmp_name(1);
  test_ssio_account_pmp_name(0);

  printf("Hello world \n");
  return 0;
}

#endif // ssio_account_pmp_name_MAIN
#endif // ssio_account_pmp_name_TEST
