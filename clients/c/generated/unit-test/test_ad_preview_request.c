#ifndef ad_preview_request_TEST
#define ad_preview_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_preview_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_preview_request.h"
ad_preview_request_t* instantiate_ad_preview_request(int include_optional);



ad_preview_request_t* instantiate_ad_preview_request(int include_optional) {
  ad_preview_request_t* ad_preview_request = NULL;
  if (include_optional) {
    ad_preview_request = ad_preview_request_create(
      "https://somewebsite.com/someimage.jpg",
      "My Preview Image",
      "7389479023"
    );
  } else {
    ad_preview_request = ad_preview_request_create(
      "https://somewebsite.com/someimage.jpg",
      "My Preview Image",
      "7389479023"
    );
  }

  return ad_preview_request;
}


#ifdef ad_preview_request_MAIN

void test_ad_preview_request(int include_optional) {
    ad_preview_request_t* ad_preview_request_1 = instantiate_ad_preview_request(include_optional);

	cJSON* jsonad_preview_request_1 = ad_preview_request_convertToJSON(ad_preview_request_1);
	printf("ad_preview_request :\n%s\n", cJSON_Print(jsonad_preview_request_1));
	ad_preview_request_t* ad_preview_request_2 = ad_preview_request_parseFromJSON(jsonad_preview_request_1);
	cJSON* jsonad_preview_request_2 = ad_preview_request_convertToJSON(ad_preview_request_2);
	printf("repeating ad_preview_request:\n%s\n", cJSON_Print(jsonad_preview_request_2));
}

int main() {
  test_ad_preview_request(1);
  test_ad_preview_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_preview_request_MAIN
#endif // ad_preview_request_TEST
