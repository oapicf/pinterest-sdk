#ifndef ad_group_id_filter_TEST
#define ad_group_id_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ad_group_id_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ad_group_id_filter.h"
ad_group_id_filter_t* instantiate_ad_group_id_filter(int include_optional);



ad_group_id_filter_t* instantiate_ad_group_id_filter(int include_optional) {
  ad_group_id_filter_t* ad_group_id_filter = NULL;
  if (include_optional) {
    ad_group_id_filter = ad_group_id_filter_create(
      ["12345678"]
    );
  } else {
    ad_group_id_filter = ad_group_id_filter_create(
      ["12345678"]
    );
  }

  return ad_group_id_filter;
}


#ifdef ad_group_id_filter_MAIN

void test_ad_group_id_filter(int include_optional) {
    ad_group_id_filter_t* ad_group_id_filter_1 = instantiate_ad_group_id_filter(include_optional);

	cJSON* jsonad_group_id_filter_1 = ad_group_id_filter_convertToJSON(ad_group_id_filter_1);
	printf("ad_group_id_filter :\n%s\n", cJSON_Print(jsonad_group_id_filter_1));
	ad_group_id_filter_t* ad_group_id_filter_2 = ad_group_id_filter_parseFromJSON(jsonad_group_id_filter_1);
	cJSON* jsonad_group_id_filter_2 = ad_group_id_filter_convertToJSON(ad_group_id_filter_2);
	printf("repeating ad_group_id_filter:\n%s\n", cJSON_Print(jsonad_group_id_filter_2));
}

int main() {
  test_ad_group_id_filter(1);
  test_ad_group_id_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // ad_group_id_filter_MAIN
#endif // ad_group_id_filter_TEST
