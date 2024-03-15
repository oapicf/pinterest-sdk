#ifndef ad_group_audience_sizing_request_keywords_inner_TEST
#define ad_group_audience_sizing_request_keywords_inner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_audience_sizing_request_keywords_inner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_audience_sizing_request_keywords_inner.h"
ad_group_audience_sizing_request_keywords_inner_t* instantiate_ad_group_audience_sizing_request_keywords_inner(int include_optional);



ad_group_audience_sizing_request_keywords_inner_t* instantiate_ad_group_audience_sizing_request_keywords_inner(int include_optional) {
  ad_group_audience_sizing_request_keywords_inner_t* ad_group_audience_sizing_request_keywords_inner = NULL;
  if (include_optional) {
    ad_group_audience_sizing_request_keywords_inner = ad_group_audience_sizing_request_keywords_inner_create(
      pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__"BROAD",
      "0"
    );
  } else {
    ad_group_audience_sizing_request_keywords_inner = ad_group_audience_sizing_request_keywords_inner_create(
      pinterest_rest_api_ad_group_audience_sizing_request_keywords_inner__"BROAD",
      "0"
    );
  }

  return ad_group_audience_sizing_request_keywords_inner;
}


#ifdef ad_group_audience_sizing_request_keywords_inner_MAIN

void test_ad_group_audience_sizing_request_keywords_inner(int include_optional) {
    ad_group_audience_sizing_request_keywords_inner_t* ad_group_audience_sizing_request_keywords_inner_1 = instantiate_ad_group_audience_sizing_request_keywords_inner(include_optional);

	cJSON* jsonad_group_audience_sizing_request_keywords_inner_1 = ad_group_audience_sizing_request_keywords_inner_convertToJSON(ad_group_audience_sizing_request_keywords_inner_1);
	printf("ad_group_audience_sizing_request_keywords_inner :\n%s\n", cJSON_Print(jsonad_group_audience_sizing_request_keywords_inner_1));
	ad_group_audience_sizing_request_keywords_inner_t* ad_group_audience_sizing_request_keywords_inner_2 = ad_group_audience_sizing_request_keywords_inner_parseFromJSON(jsonad_group_audience_sizing_request_keywords_inner_1);
	cJSON* jsonad_group_audience_sizing_request_keywords_inner_2 = ad_group_audience_sizing_request_keywords_inner_convertToJSON(ad_group_audience_sizing_request_keywords_inner_2);
	printf("repeating ad_group_audience_sizing_request_keywords_inner:\n%s\n", cJSON_Print(jsonad_group_audience_sizing_request_keywords_inner_2));
}

int main() {
  test_ad_group_audience_sizing_request_keywords_inner(1);
  test_ad_group_audience_sizing_request_keywords_inner(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_audience_sizing_request_keywords_inner_MAIN
#endif // ad_group_audience_sizing_request_keywords_inner_TEST
