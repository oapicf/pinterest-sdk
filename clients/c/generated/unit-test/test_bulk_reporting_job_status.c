#ifndef bulk_reporting_job_status_TEST
#define bulk_reporting_job_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define bulk_reporting_job_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/bulk_reporting_job_status.h"
bulk_reporting_job_status_t* instantiate_bulk_reporting_job_status(int include_optional);



bulk_reporting_job_status_t* instantiate_bulk_reporting_job_status(int include_optional) {
  bulk_reporting_job_status_t* bulk_reporting_job_status = NULL;
  if (include_optional) {
    bulk_reporting_job_status = bulk_reporting_job_status_create(
    );
  } else {
    bulk_reporting_job_status = bulk_reporting_job_status_create(
    );
  }

  return bulk_reporting_job_status;
}


#ifdef bulk_reporting_job_status_MAIN

void test_bulk_reporting_job_status(int include_optional) {
    bulk_reporting_job_status_t* bulk_reporting_job_status_1 = instantiate_bulk_reporting_job_status(include_optional);

	cJSON* jsonbulk_reporting_job_status_1 = bulk_reporting_job_status_convertToJSON(bulk_reporting_job_status_1);
	printf("bulk_reporting_job_status :\n%s\n", cJSON_Print(jsonbulk_reporting_job_status_1));
	bulk_reporting_job_status_t* bulk_reporting_job_status_2 = bulk_reporting_job_status_parseFromJSON(jsonbulk_reporting_job_status_1);
	cJSON* jsonbulk_reporting_job_status_2 = bulk_reporting_job_status_convertToJSON(bulk_reporting_job_status_2);
	printf("repeating bulk_reporting_job_status:\n%s\n", cJSON_Print(jsonbulk_reporting_job_status_2));
}

int main() {
  test_bulk_reporting_job_status(1);
  test_bulk_reporting_job_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // bulk_reporting_job_status_MAIN
#endif // bulk_reporting_job_status_TEST
