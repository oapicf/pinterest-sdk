#ifndef ad_group_array_response_element_TEST
#define ad_group_array_response_element_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_array_response_element_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_array_response_element.h"
ad_group_array_response_element_t* instantiate_ad_group_array_response_element(int include_optional);

#include "test_ad_group_response.c"


ad_group_array_response_element_t* instantiate_ad_group_array_response_element(int include_optional) {
  ad_group_array_response_element_t* ad_group_array_response_element = NULL;
  if (include_optional) {
    ad_group_array_response_element = ad_group_array_response_element_create(
       // false, not to have infinite recursion
      instantiate_ad_group_response(0),
      list_createList()
    );
  } else {
    ad_group_array_response_element = ad_group_array_response_element_create(
      NULL,
      list_createList()
    );
  }

  return ad_group_array_response_element;
}


#ifdef ad_group_array_response_element_MAIN

void test_ad_group_array_response_element(int include_optional) {
    ad_group_array_response_element_t* ad_group_array_response_element_1 = instantiate_ad_group_array_response_element(include_optional);

	cJSON* jsonad_group_array_response_element_1 = ad_group_array_response_element_convertToJSON(ad_group_array_response_element_1);
	printf("ad_group_array_response_element :\n%s\n", cJSON_Print(jsonad_group_array_response_element_1));
	ad_group_array_response_element_t* ad_group_array_response_element_2 = ad_group_array_response_element_parseFromJSON(jsonad_group_array_response_element_1);
	cJSON* jsonad_group_array_response_element_2 = ad_group_array_response_element_convertToJSON(ad_group_array_response_element_2);
	printf("repeating ad_group_array_response_element:\n%s\n", cJSON_Print(jsonad_group_array_response_element_2));
}

int main() {
  test_ad_group_array_response_element(1);
  test_ad_group_array_response_element(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_array_response_element_MAIN
#endif // ad_group_array_response_element_TEST
