#ifndef ad_array_response_element_TEST
#define ad_array_response_element_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_array_response_element_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_array_response_element.h"
ad_array_response_element_t* instantiate_ad_array_response_element(int include_optional);

#include "test_ad_response.c"
#include "test_exception.c"


ad_array_response_element_t* instantiate_ad_array_response_element(int include_optional) {
  ad_array_response_element_t* ad_array_response_element = NULL;
  if (include_optional) {
    ad_array_response_element = ad_array_response_element_create(
       // false, not to have infinite recursion
      instantiate_ad_response(0),
       // false, not to have infinite recursion
      instantiate_exception(0)
    );
  } else {
    ad_array_response_element = ad_array_response_element_create(
      NULL,
      NULL
    );
  }

  return ad_array_response_element;
}


#ifdef ad_array_response_element_MAIN

void test_ad_array_response_element(int include_optional) {
    ad_array_response_element_t* ad_array_response_element_1 = instantiate_ad_array_response_element(include_optional);

	cJSON* jsonad_array_response_element_1 = ad_array_response_element_convertToJSON(ad_array_response_element_1);
	printf("ad_array_response_element :\n%s\n", cJSON_Print(jsonad_array_response_element_1));
	ad_array_response_element_t* ad_array_response_element_2 = ad_array_response_element_parseFromJSON(jsonad_array_response_element_1);
	cJSON* jsonad_array_response_element_2 = ad_array_response_element_convertToJSON(ad_array_response_element_2);
	printf("repeating ad_array_response_element:\n%s\n", cJSON_Print(jsonad_array_response_element_2));
}

int main() {
  test_ad_array_response_element(1);
  test_ad_array_response_element(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_array_response_element_MAIN
#endif // ad_array_response_element_TEST
