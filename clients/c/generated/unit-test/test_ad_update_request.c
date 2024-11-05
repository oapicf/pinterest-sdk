#ifndef ad_update_request_TEST
#define ad_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_update_request.h"
ad_update_request_t* instantiate_ad_update_request(int include_optional);

#include "test_tracking_urls.c"
#include "test_quiz_pin_data.c"


ad_update_request_t* instantiate_ad_update_request(int include_optional) {
  ad_update_request_t* ad_update_request = NULL;
  if (include_optional) {
    ad_update_request = ad_update_request_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_update_request__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_update_request__"ACTIVE",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      "0",
      "a",
      pinterest_rest_api_ad_update_request__"CLOSEUP",
      pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_"LEARN_MORE",
      {"questions":[{"question_id":1,"question_text":"Where do you thrive?","options":[{"text":"Hangout vibes"},{"text":"Time to party!"},{"text":"Keeping it lowkey"}]},{"question_id":2,"question_text":"Where would you nap?","options":[{"text":"Hammock in the mountains"},{"text":"Beach towel in the sand"},{"text":"Tent under the stars"}]},{"question_id":2,"question_text":"Who are you taking?","options":[{"text":"No one—solo trip!"},{"text":"My best friend"},{"text":"The family"}]}],"results":[{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":1},{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":2},{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":3}]},
      "687195134316",
      "394205773611545468"
    );
  } else {
    ad_update_request = ad_update_request_create(
      "2680059592705",
      "0",
      list_createList(),
      list_createList(),
      list_createList(),
      "0",
      pinterest_rest_api_ad_update_request__"REGULAR",
      "0",
      "0",
      false,
      false,
      "0",
      pinterest_rest_api_ad_update_request__"ACTIVE",
      {"impression":["URL1","URL2"],"click":["URL1","URL2"],"engagement":["URL1","URL2"],"buyable_button":["URL1","URL2"],"audience_verification":["URL1","URL2"]},
      "0",
      "a",
      pinterest_rest_api_ad_update_request__"CLOSEUP",
      pinterest_rest_api_ad_update_request_CUSTOMIZABLECTATYPE_"LEARN_MORE",
      {"questions":[{"question_id":1,"question_text":"Where do you thrive?","options":[{"text":"Hangout vibes"},{"text":"Time to party!"},{"text":"Keeping it lowkey"}]},{"question_id":2,"question_text":"Where would you nap?","options":[{"text":"Hammock in the mountains"},{"text":"Beach towel in the sand"},{"text":"Tent under the stars"}]},{"question_id":2,"question_text":"Who are you taking?","options":[{"text":"No one—solo trip!"},{"text":"My best friend"},{"text":"The family"}]}],"results":[{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":1},{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":2},{"organicPinId":"1234","android_deep_link":"https://www.pinterest.com/","iOS_deep_link":"https://www.pinterest.com/","destination_url":"https://www.pinterest.com/","result_id":3}]},
      "687195134316",
      "394205773611545468"
    );
  }

  return ad_update_request;
}


#ifdef ad_update_request_MAIN

void test_ad_update_request(int include_optional) {
    ad_update_request_t* ad_update_request_1 = instantiate_ad_update_request(include_optional);

	cJSON* jsonad_update_request_1 = ad_update_request_convertToJSON(ad_update_request_1);
	printf("ad_update_request :\n%s\n", cJSON_Print(jsonad_update_request_1));
	ad_update_request_t* ad_update_request_2 = ad_update_request_parseFromJSON(jsonad_update_request_1);
	cJSON* jsonad_update_request_2 = ad_update_request_convertToJSON(ad_update_request_2);
	printf("repeating ad_update_request:\n%s\n", cJSON_Print(jsonad_update_request_2));
}

int main() {
  test_ad_update_request(1);
  test_ad_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_update_request_MAIN
#endif // ad_update_request_TEST
