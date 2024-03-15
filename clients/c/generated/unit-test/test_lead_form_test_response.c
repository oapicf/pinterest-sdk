#ifndef lead_form_test_response_TEST
#define lead_form_test_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_test_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_test_response.h"
lead_form_test_response_t* instantiate_lead_form_test_response(int include_optional);



lead_form_test_response_t* instantiate_lead_form_test_response(int include_optional) {
  lead_form_test_response_t* lead_form_test_response = NULL;
  if (include_optional) {
    lead_form_test_response = lead_form_test_response_create(
      "8078432025948590686"
    );
  } else {
    lead_form_test_response = lead_form_test_response_create(
      "8078432025948590686"
    );
  }

  return lead_form_test_response;
}


#ifdef lead_form_test_response_MAIN

void test_lead_form_test_response(int include_optional) {
    lead_form_test_response_t* lead_form_test_response_1 = instantiate_lead_form_test_response(include_optional);

	cJSON* jsonlead_form_test_response_1 = lead_form_test_response_convertToJSON(lead_form_test_response_1);
	printf("lead_form_test_response :\n%s\n", cJSON_Print(jsonlead_form_test_response_1));
	lead_form_test_response_t* lead_form_test_response_2 = lead_form_test_response_parseFromJSON(jsonlead_form_test_response_1);
	cJSON* jsonlead_form_test_response_2 = lead_form_test_response_convertToJSON(lead_form_test_response_2);
	printf("repeating lead_form_test_response:\n%s\n", cJSON_Print(jsonlead_form_test_response_2));
}

int main() {
  test_lead_form_test_response(1);
  test_lead_form_test_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_test_response_MAIN
#endif // lead_form_test_response_TEST
