#ifndef leads_export_status_TEST
#define leads_export_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define leads_export_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/leads_export_status.h"
leads_export_status_t* instantiate_leads_export_status(int include_optional);



leads_export_status_t* instantiate_leads_export_status(int include_optional) {
  leads_export_status_t* leads_export_status = NULL;
  if (include_optional) {
    leads_export_status = leads_export_status_create(
    );
  } else {
    leads_export_status = leads_export_status_create(
    );
  }

  return leads_export_status;
}


#ifdef leads_export_status_MAIN

void test_leads_export_status(int include_optional) {
    leads_export_status_t* leads_export_status_1 = instantiate_leads_export_status(include_optional);

	cJSON* jsonleads_export_status_1 = leads_export_status_convertToJSON(leads_export_status_1);
	printf("leads_export_status :\n%s\n", cJSON_Print(jsonleads_export_status_1));
	leads_export_status_t* leads_export_status_2 = leads_export_status_parseFromJSON(jsonleads_export_status_1);
	cJSON* jsonleads_export_status_2 = leads_export_status_convertToJSON(leads_export_status_2);
	printf("repeating leads_export_status:\n%s\n", cJSON_Print(jsonleads_export_status_2));
}

int main() {
  test_leads_export_status(1);
  test_leads_export_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // leads_export_status_MAIN
#endif // leads_export_status_TEST
