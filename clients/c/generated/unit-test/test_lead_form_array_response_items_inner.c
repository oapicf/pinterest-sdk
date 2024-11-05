#ifndef lead_form_array_response_items_inner_TEST
#define lead_form_array_response_items_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_array_response_items_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_array_response_items_inner.h"
lead_form_array_response_items_inner_t* instantiate_lead_form_array_response_items_inner(int include_optional);

#include "test_lead_form_response.c"


lead_form_array_response_items_inner_t* instantiate_lead_form_array_response_items_inner(int include_optional) {
  lead_form_array_response_items_inner_t* lead_form_array_response_items_inner = NULL;
  if (include_optional) {
    lead_form_array_response_items_inner = lead_form_array_response_items_inner_create(
       // false, not to have infinite recursion
      instantiate_lead_form_response(0),
      list_createList()
    );
  } else {
    lead_form_array_response_items_inner = lead_form_array_response_items_inner_create(
      NULL,
      list_createList()
    );
  }

  return lead_form_array_response_items_inner;
}


#ifdef lead_form_array_response_items_inner_MAIN

void test_lead_form_array_response_items_inner(int include_optional) {
    lead_form_array_response_items_inner_t* lead_form_array_response_items_inner_1 = instantiate_lead_form_array_response_items_inner(include_optional);

	cJSON* jsonlead_form_array_response_items_inner_1 = lead_form_array_response_items_inner_convertToJSON(lead_form_array_response_items_inner_1);
	printf("lead_form_array_response_items_inner :\n%s\n", cJSON_Print(jsonlead_form_array_response_items_inner_1));
	lead_form_array_response_items_inner_t* lead_form_array_response_items_inner_2 = lead_form_array_response_items_inner_parseFromJSON(jsonlead_form_array_response_items_inner_1);
	cJSON* jsonlead_form_array_response_items_inner_2 = lead_form_array_response_items_inner_convertToJSON(lead_form_array_response_items_inner_2);
	printf("repeating lead_form_array_response_items_inner:\n%s\n", cJSON_Print(jsonlead_form_array_response_items_inner_2));
}

int main() {
  test_lead_form_array_response_items_inner(1);
  test_lead_form_array_response_items_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_array_response_items_inner_MAIN
#endif // lead_form_array_response_items_inner_TEST
