#ifndef ad_group_common_tracking_urls_TEST
#define ad_group_common_tracking_urls_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_common_tracking_urls_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_common_tracking_urls.h"
ad_group_common_tracking_urls_t* instantiate_ad_group_common_tracking_urls(int include_optional);



ad_group_common_tracking_urls_t* instantiate_ad_group_common_tracking_urls(int include_optional) {
  ad_group_common_tracking_urls_t* ad_group_common_tracking_urls = NULL;
  if (include_optional) {
    ad_group_common_tracking_urls = ad_group_common_tracking_urls_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  } else {
    ad_group_common_tracking_urls = ad_group_common_tracking_urls_create(
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList(),
      list_createList()
    );
  }

  return ad_group_common_tracking_urls;
}


#ifdef ad_group_common_tracking_urls_MAIN

void test_ad_group_common_tracking_urls(int include_optional) {
    ad_group_common_tracking_urls_t* ad_group_common_tracking_urls_1 = instantiate_ad_group_common_tracking_urls(include_optional);

	cJSON* jsonad_group_common_tracking_urls_1 = ad_group_common_tracking_urls_convertToJSON(ad_group_common_tracking_urls_1);
	printf("ad_group_common_tracking_urls :\n%s\n", cJSON_Print(jsonad_group_common_tracking_urls_1));
	ad_group_common_tracking_urls_t* ad_group_common_tracking_urls_2 = ad_group_common_tracking_urls_parseFromJSON(jsonad_group_common_tracking_urls_1);
	cJSON* jsonad_group_common_tracking_urls_2 = ad_group_common_tracking_urls_convertToJSON(ad_group_common_tracking_urls_2);
	printf("repeating ad_group_common_tracking_urls:\n%s\n", cJSON_Print(jsonad_group_common_tracking_urls_2));
}

int main() {
  test_ad_group_common_tracking_urls(1);
  test_ad_group_common_tracking_urls(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_common_tracking_urls_MAIN
#endif // ad_group_common_tracking_urls_TEST
