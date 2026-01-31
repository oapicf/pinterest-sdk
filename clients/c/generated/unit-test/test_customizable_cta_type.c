#ifndef customizable_cta_type_TEST
#define customizable_cta_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define customizable_cta_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/customizable_cta_type.h"
customizable_cta_type_t* instantiate_customizable_cta_type(int include_optional);



customizable_cta_type_t* instantiate_customizable_cta_type(int include_optional) {
  customizable_cta_type_t* customizable_cta_type = NULL;
  if (include_optional) {
    customizable_cta_type = customizable_cta_type_create(
    );
  } else {
    customizable_cta_type = customizable_cta_type_create(
    );
  }

  return customizable_cta_type;
}


#ifdef customizable_cta_type_MAIN

void test_customizable_cta_type(int include_optional) {
    customizable_cta_type_t* customizable_cta_type_1 = instantiate_customizable_cta_type(include_optional);

	cJSON* jsoncustomizable_cta_type_1 = customizable_cta_type_convertToJSON(customizable_cta_type_1);
	printf("customizable_cta_type :\n%s\n", cJSON_Print(jsoncustomizable_cta_type_1));
	customizable_cta_type_t* customizable_cta_type_2 = customizable_cta_type_parseFromJSON(jsoncustomizable_cta_type_1);
	cJSON* jsoncustomizable_cta_type_2 = customizable_cta_type_convertToJSON(customizable_cta_type_2);
	printf("repeating customizable_cta_type:\n%s\n", cJSON_Print(jsoncustomizable_cta_type_2));
}

int main() {
  test_customizable_cta_type(1);
  test_customizable_cta_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // customizable_cta_type_MAIN
#endif // customizable_cta_type_TEST
