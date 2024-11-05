#ifndef leads_export_create_response_TEST
#define leads_export_create_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define leads_export_create_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/leads_export_create_response.h"
leads_export_create_response_t* instantiate_leads_export_create_response(int include_optional);



leads_export_create_response_t* instantiate_leads_export_create_response(int include_optional) {
  leads_export_create_response_t* leads_export_create_response = NULL;
  if (include_optional) {
    leads_export_create_response = leads_export_create_response_create(
      "123456789012"
    );
  } else {
    leads_export_create_response = leads_export_create_response_create(
      "123456789012"
    );
  }

  return leads_export_create_response;
}


#ifdef leads_export_create_response_MAIN

void test_leads_export_create_response(int include_optional) {
    leads_export_create_response_t* leads_export_create_response_1 = instantiate_leads_export_create_response(include_optional);

	cJSON* jsonleads_export_create_response_1 = leads_export_create_response_convertToJSON(leads_export_create_response_1);
	printf("leads_export_create_response :\n%s\n", cJSON_Print(jsonleads_export_create_response_1));
	leads_export_create_response_t* leads_export_create_response_2 = leads_export_create_response_parseFromJSON(jsonleads_export_create_response_1);
	cJSON* jsonleads_export_create_response_2 = leads_export_create_response_convertToJSON(leads_export_create_response_2);
	printf("repeating leads_export_create_response:\n%s\n", cJSON_Print(jsonleads_export_create_response_2));
}

int main() {
  test_leads_export_create_response(1);
  test_leads_export_create_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // leads_export_create_response_MAIN
#endif // leads_export_create_response_TEST
