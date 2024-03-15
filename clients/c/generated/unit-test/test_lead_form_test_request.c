#ifndef lead_form_test_request_TEST
#define lead_form_test_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_test_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_test_request.h"
lead_form_test_request_t* instantiate_lead_form_test_request(int include_optional);



lead_form_test_request_t* instantiate_lead_form_test_request(int include_optional) {
  lead_form_test_request_t* lead_form_test_request = NULL;
  if (include_optional) {
    lead_form_test_request = lead_form_test_request_create(
      ["John","Doe","abc@email.com","987654321"]
    );
  } else {
    lead_form_test_request = lead_form_test_request_create(
      ["John","Doe","abc@email.com","987654321"]
    );
  }

  return lead_form_test_request;
}


#ifdef lead_form_test_request_MAIN

void test_lead_form_test_request(int include_optional) {
    lead_form_test_request_t* lead_form_test_request_1 = instantiate_lead_form_test_request(include_optional);

	cJSON* jsonlead_form_test_request_1 = lead_form_test_request_convertToJSON(lead_form_test_request_1);
	printf("lead_form_test_request :\n%s\n", cJSON_Print(jsonlead_form_test_request_1));
	lead_form_test_request_t* lead_form_test_request_2 = lead_form_test_request_parseFromJSON(jsonlead_form_test_request_1);
	cJSON* jsonlead_form_test_request_2 = lead_form_test_request_convertToJSON(lead_form_test_request_2);
	printf("repeating lead_form_test_request:\n%s\n", cJSON_Print(jsonlead_form_test_request_2));
}

int main() {
  test_lead_form_test_request(1);
  test_lead_form_test_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_test_request_MAIN
#endif // lead_form_test_request_TEST
