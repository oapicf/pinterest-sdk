#ifndef disclosure_type_TEST
#define disclosure_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define disclosure_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/disclosure_type.h"
disclosure_type_t* instantiate_disclosure_type(int include_optional);



disclosure_type_t* instantiate_disclosure_type(int include_optional) {
  disclosure_type_t* disclosure_type = NULL;
  if (include_optional) {
    disclosure_type = disclosure_type_create(
    );
  } else {
    disclosure_type = disclosure_type_create(
    );
  }

  return disclosure_type;
}


#ifdef disclosure_type_MAIN

void test_disclosure_type(int include_optional) {
    disclosure_type_t* disclosure_type_1 = instantiate_disclosure_type(include_optional);

	cJSON* jsondisclosure_type_1 = disclosure_type_convertToJSON(disclosure_type_1);
	printf("disclosure_type :\n%s\n", cJSON_Print(jsondisclosure_type_1));
	disclosure_type_t* disclosure_type_2 = disclosure_type_parseFromJSON(jsondisclosure_type_1);
	cJSON* jsondisclosure_type_2 = disclosure_type_convertToJSON(disclosure_type_2);
	printf("repeating disclosure_type:\n%s\n", cJSON_Print(jsondisclosure_type_2));
}

int main() {
  test_disclosure_type(1);
  test_disclosure_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // disclosure_type_MAIN
#endif // disclosure_type_TEST
