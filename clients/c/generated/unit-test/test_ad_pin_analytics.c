#ifndef ad_pin_analytics_TEST
#define ad_pin_analytics_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_pin_analytics_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_pin_analytics.h"
ad_pin_analytics_t* instantiate_ad_pin_analytics(int include_optional);



ad_pin_analytics_t* instantiate_ad_pin_analytics(int include_optional) {
  ad_pin_analytics_t* ad_pin_analytics = NULL;
  if (include_optional) {
    ad_pin_analytics = ad_pin_analytics_create(
      "2013-10-20",
      "a"
    );
  } else {
    ad_pin_analytics = ad_pin_analytics_create(
      "2013-10-20",
      "a"
    );
  }

  return ad_pin_analytics;
}


#ifdef ad_pin_analytics_MAIN

void test_ad_pin_analytics(int include_optional) {
    ad_pin_analytics_t* ad_pin_analytics_1 = instantiate_ad_pin_analytics(include_optional);

	cJSON* jsonad_pin_analytics_1 = ad_pin_analytics_convertToJSON(ad_pin_analytics_1);
	printf("ad_pin_analytics :\n%s\n", cJSON_Print(jsonad_pin_analytics_1));
	ad_pin_analytics_t* ad_pin_analytics_2 = ad_pin_analytics_parseFromJSON(jsonad_pin_analytics_1);
	cJSON* jsonad_pin_analytics_2 = ad_pin_analytics_convertToJSON(ad_pin_analytics_2);
	printf("repeating ad_pin_analytics:\n%s\n", cJSON_Print(jsonad_pin_analytics_2));
}

int main() {
  test_ad_pin_analytics(1);
  test_ad_pin_analytics(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_pin_analytics_MAIN
#endif // ad_pin_analytics_TEST
