#ifndef leads_export_create_request_TEST
#define leads_export_create_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define leads_export_create_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/leads_export_create_request.h"
leads_export_create_request_t* instantiate_leads_export_create_request(int include_optional);



leads_export_create_request_t* instantiate_leads_export_create_request(int include_optional) {
  leads_export_create_request_t* leads_export_create_request = NULL;
  if (include_optional) {
    leads_export_create_request = leads_export_create_request_create(
      "2020-12-20",
      "2020-12-20",
      "687201361754"
    );
  } else {
    leads_export_create_request = leads_export_create_request_create(
      "2020-12-20",
      "2020-12-20",
      "687201361754"
    );
  }

  return leads_export_create_request;
}


#ifdef leads_export_create_request_MAIN

void test_leads_export_create_request(int include_optional) {
    leads_export_create_request_t* leads_export_create_request_1 = instantiate_leads_export_create_request(include_optional);

	cJSON* jsonleads_export_create_request_1 = leads_export_create_request_convertToJSON(leads_export_create_request_1);
	printf("leads_export_create_request :\n%s\n", cJSON_Print(jsonleads_export_create_request_1));
	leads_export_create_request_t* leads_export_create_request_2 = leads_export_create_request_parseFromJSON(jsonleads_export_create_request_1);
	cJSON* jsonleads_export_create_request_2 = leads_export_create_request_convertToJSON(leads_export_create_request_2);
	printf("repeating leads_export_create_request:\n%s\n", cJSON_Print(jsonleads_export_create_request_2));
}

int main() {
  test_leads_export_create_request(1);
  test_leads_export_create_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // leads_export_create_request_MAIN
#endif // leads_export_create_request_TEST
