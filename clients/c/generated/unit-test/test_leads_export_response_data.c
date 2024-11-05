#ifndef leads_export_response_data_TEST
#define leads_export_response_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define leads_export_response_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/leads_export_response_data.h"
leads_export_response_data_t* instantiate_leads_export_response_data(int include_optional);



leads_export_response_data_t* instantiate_leads_export_response_data(int include_optional) {
  leads_export_response_data_t* leads_export_response_data = NULL;
  if (include_optional) {
    leads_export_response_data = leads_export_response_data_create(
      pinterest_rest_api_leads_export_response_data__"IN_PROGRESS",
      "0"
    );
  } else {
    leads_export_response_data = leads_export_response_data_create(
      pinterest_rest_api_leads_export_response_data__"IN_PROGRESS",
      "0"
    );
  }

  return leads_export_response_data;
}


#ifdef leads_export_response_data_MAIN

void test_leads_export_response_data(int include_optional) {
    leads_export_response_data_t* leads_export_response_data_1 = instantiate_leads_export_response_data(include_optional);

	cJSON* jsonleads_export_response_data_1 = leads_export_response_data_convertToJSON(leads_export_response_data_1);
	printf("leads_export_response_data :\n%s\n", cJSON_Print(jsonleads_export_response_data_1));
	leads_export_response_data_t* leads_export_response_data_2 = leads_export_response_data_parseFromJSON(jsonleads_export_response_data_1);
	cJSON* jsonleads_export_response_data_2 = leads_export_response_data_convertToJSON(leads_export_response_data_2);
	printf("repeating leads_export_response_data:\n%s\n", cJSON_Print(jsonleads_export_response_data_2));
}

int main() {
  test_leads_export_response_data(1);
  test_leads_export_response_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // leads_export_response_data_MAIN
#endif // leads_export_response_data_TEST
