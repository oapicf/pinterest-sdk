#ifndef lead_forms_list_200_response_TEST
#define lead_forms_list_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define lead_forms_list_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/lead_forms_list_200_response.h"
lead_forms_list_200_response_t* instantiate_lead_forms_list_200_response(int include_optional);



lead_forms_list_200_response_t* instantiate_lead_forms_list_200_response(int include_optional) {
  lead_forms_list_200_response_t* lead_forms_list_200_response = NULL;
  if (include_optional) {
    lead_forms_list_200_response = lead_forms_list_200_response_create(
      list_createList(),
      "0"
    );
  } else {
    lead_forms_list_200_response = lead_forms_list_200_response_create(
      list_createList(),
      "0"
    );
  }

  return lead_forms_list_200_response;
}


#ifdef lead_forms_list_200_response_MAIN

void test_lead_forms_list_200_response(int include_optional) {
    lead_forms_list_200_response_t* lead_forms_list_200_response_1 = instantiate_lead_forms_list_200_response(include_optional);

	cJSON* jsonlead_forms_list_200_response_1 = lead_forms_list_200_response_convertToJSON(lead_forms_list_200_response_1);
	printf("lead_forms_list_200_response :\n%s\n", cJSON_Print(jsonlead_forms_list_200_response_1));
	lead_forms_list_200_response_t* lead_forms_list_200_response_2 = lead_forms_list_200_response_parseFromJSON(jsonlead_forms_list_200_response_1);
	cJSON* jsonlead_forms_list_200_response_2 = lead_forms_list_200_response_convertToJSON(lead_forms_list_200_response_2);
	printf("repeating lead_forms_list_200_response:\n%s\n", cJSON_Print(jsonlead_forms_list_200_response_2));
}

int main() {
  test_lead_forms_list_200_response(1);
  test_lead_forms_list_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // lead_forms_list_200_response_MAIN
#endif // lead_forms_list_200_response_TEST
