#ifndef ad_preview_url_response_TEST
#define ad_preview_url_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_preview_url_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_preview_url_response.h"
ad_preview_url_response_t* instantiate_ad_preview_url_response(int include_optional);



ad_preview_url_response_t* instantiate_ad_preview_url_response(int include_optional) {
  ad_preview_url_response_t* ad_preview_url_response = NULL;
  if (include_optional) {
    ad_preview_url_response = ad_preview_url_response_create(
      "https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/"
    );
  } else {
    ad_preview_url_response = ad_preview_url_response_create(
      "https://ads.pinterest.com/ad-preview/58f1a0e9ab0bd0f99462a0e4c5dd7e8297888c8a36331e88f757abe8f0295d31/"
    );
  }

  return ad_preview_url_response;
}


#ifdef ad_preview_url_response_MAIN

void test_ad_preview_url_response(int include_optional) {
    ad_preview_url_response_t* ad_preview_url_response_1 = instantiate_ad_preview_url_response(include_optional);

	cJSON* jsonad_preview_url_response_1 = ad_preview_url_response_convertToJSON(ad_preview_url_response_1);
	printf("ad_preview_url_response :\n%s\n", cJSON_Print(jsonad_preview_url_response_1));
	ad_preview_url_response_t* ad_preview_url_response_2 = ad_preview_url_response_parseFromJSON(jsonad_preview_url_response_1);
	cJSON* jsonad_preview_url_response_2 = ad_preview_url_response_convertToJSON(ad_preview_url_response_2);
	printf("repeating ad_preview_url_response:\n%s\n", cJSON_Print(jsonad_preview_url_response_2));
}

int main() {
  test_ad_preview_url_response(1);
  test_ad_preview_url_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_preview_url_response_MAIN
#endif // ad_preview_url_response_TEST
