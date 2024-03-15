#ifndef ad_group_summary_status_TEST
#define ad_group_summary_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_summary_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_summary_status.h"
ad_group_summary_status_t* instantiate_ad_group_summary_status(int include_optional);



ad_group_summary_status_t* instantiate_ad_group_summary_status(int include_optional) {
  ad_group_summary_status_t* ad_group_summary_status = NULL;
  if (include_optional) {
    ad_group_summary_status = ad_group_summary_status_create(
    );
  } else {
    ad_group_summary_status = ad_group_summary_status_create(
    );
  }

  return ad_group_summary_status;
}


#ifdef ad_group_summary_status_MAIN

void test_ad_group_summary_status(int include_optional) {
    ad_group_summary_status_t* ad_group_summary_status_1 = instantiate_ad_group_summary_status(include_optional);

	cJSON* jsonad_group_summary_status_1 = ad_group_summary_status_convertToJSON(ad_group_summary_status_1);
	printf("ad_group_summary_status :\n%s\n", cJSON_Print(jsonad_group_summary_status_1));
	ad_group_summary_status_t* ad_group_summary_status_2 = ad_group_summary_status_parseFromJSON(jsonad_group_summary_status_1);
	cJSON* jsonad_group_summary_status_2 = ad_group_summary_status_convertToJSON(ad_group_summary_status_2);
	printf("repeating ad_group_summary_status:\n%s\n", cJSON_Print(jsonad_group_summary_status_2));
}

int main() {
  test_ad_group_summary_status(1);
  test_ad_group_summary_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_summary_status_MAIN
#endif // ad_group_summary_status_TEST
