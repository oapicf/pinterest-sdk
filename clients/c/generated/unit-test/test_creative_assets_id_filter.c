#ifndef creative_assets_id_filter_TEST
#define creative_assets_id_filter_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define creative_assets_id_filter_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/creative_assets_id_filter.h"
creative_assets_id_filter_t* instantiate_creative_assets_id_filter(int include_optional);



creative_assets_id_filter_t* instantiate_creative_assets_id_filter(int include_optional) {
  creative_assets_id_filter_t* creative_assets_id_filter = NULL;
  if (include_optional) {
    creative_assets_id_filter = creative_assets_id_filter_create(
      0
    );
  } else {
    creative_assets_id_filter = creative_assets_id_filter_create(
      0
    );
  }

  return creative_assets_id_filter;
}


#ifdef creative_assets_id_filter_MAIN

void test_creative_assets_id_filter(int include_optional) {
    creative_assets_id_filter_t* creative_assets_id_filter_1 = instantiate_creative_assets_id_filter(include_optional);

	cJSON* jsoncreative_assets_id_filter_1 = creative_assets_id_filter_convertToJSON(creative_assets_id_filter_1);
	printf("creative_assets_id_filter :\n%s\n", cJSON_Print(jsoncreative_assets_id_filter_1));
	creative_assets_id_filter_t* creative_assets_id_filter_2 = creative_assets_id_filter_parseFromJSON(jsoncreative_assets_id_filter_1);
	cJSON* jsoncreative_assets_id_filter_2 = creative_assets_id_filter_convertToJSON(creative_assets_id_filter_2);
	printf("repeating creative_assets_id_filter:\n%s\n", cJSON_Print(jsoncreative_assets_id_filter_2));
}

int main() {
  test_creative_assets_id_filter(1);
  test_creative_assets_id_filter(0);

  printf("Hello world \n");
  return 0;
}

#endif // creative_assets_id_filter_MAIN
#endif // creative_assets_id_filter_TEST
