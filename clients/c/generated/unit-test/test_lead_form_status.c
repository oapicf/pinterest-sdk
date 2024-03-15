#ifndef lead_form_status_TEST
#define lead_form_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_form_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_form_status.h"
lead_form_status_t* instantiate_lead_form_status(int include_optional);



lead_form_status_t* instantiate_lead_form_status(int include_optional) {
  lead_form_status_t* lead_form_status = NULL;
  if (include_optional) {
    lead_form_status = lead_form_status_create(
    );
  } else {
    lead_form_status = lead_form_status_create(
    );
  }

  return lead_form_status;
}


#ifdef lead_form_status_MAIN

void test_lead_form_status(int include_optional) {
    lead_form_status_t* lead_form_status_1 = instantiate_lead_form_status(include_optional);

	cJSON* jsonlead_form_status_1 = lead_form_status_convertToJSON(lead_form_status_1);
	printf("lead_form_status :\n%s\n", cJSON_Print(jsonlead_form_status_1));
	lead_form_status_t* lead_form_status_2 = lead_form_status_parseFromJSON(jsonlead_form_status_1);
	cJSON* jsonlead_form_status_2 = lead_form_status_convertToJSON(lead_form_status_2);
	printf("repeating lead_form_status:\n%s\n", cJSON_Print(jsonlead_form_status_2));
}

int main() {
  test_lead_form_status(1);
  test_lead_form_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_form_status_MAIN
#endif // lead_form_status_TEST
