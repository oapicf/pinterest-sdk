#ifndef ad_group_audience_sizing_request_TEST
#define ad_group_audience_sizing_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_audience_sizing_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_audience_sizing_request.h"
ad_group_audience_sizing_request_t* instantiate_ad_group_audience_sizing_request(int include_optional);

#include "test_targeting_spec.c"


ad_group_audience_sizing_request_t* instantiate_ad_group_audience_sizing_request(int include_optional) {
  ad_group_audience_sizing_request_t* ad_group_audience_sizing_request = NULL;
  if (include_optional) {
    ad_group_audience_sizing_request = ad_group_audience_sizing_request_create(
      true,
      "ALL",
      list_createList(),
       // false, not to have infinite recursion
      instantiate_targeting_spec(0),
      list_createList(),
      list_createList()
    );
  } else {
    ad_group_audience_sizing_request = ad_group_audience_sizing_request_create(
      true,
      "ALL",
      list_createList(),
      NULL,
      list_createList(),
      list_createList()
    );
  }

  return ad_group_audience_sizing_request;
}


#ifdef ad_group_audience_sizing_request_MAIN

void test_ad_group_audience_sizing_request(int include_optional) {
    ad_group_audience_sizing_request_t* ad_group_audience_sizing_request_1 = instantiate_ad_group_audience_sizing_request(include_optional);

	cJSON* jsonad_group_audience_sizing_request_1 = ad_group_audience_sizing_request_convertToJSON(ad_group_audience_sizing_request_1);
	printf("ad_group_audience_sizing_request :\n%s\n", cJSON_Print(jsonad_group_audience_sizing_request_1));
	ad_group_audience_sizing_request_t* ad_group_audience_sizing_request_2 = ad_group_audience_sizing_request_parseFromJSON(jsonad_group_audience_sizing_request_1);
	cJSON* jsonad_group_audience_sizing_request_2 = ad_group_audience_sizing_request_convertToJSON(ad_group_audience_sizing_request_2);
	printf("repeating ad_group_audience_sizing_request:\n%s\n", cJSON_Print(jsonad_group_audience_sizing_request_2));
}

int main() {
  test_ad_group_audience_sizing_request(1);
  test_ad_group_audience_sizing_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_audience_sizing_request_MAIN
#endif // ad_group_audience_sizing_request_TEST
