#ifndef creative_assets_processing_record_TEST
#define creative_assets_processing_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define creative_assets_processing_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/creative_assets_processing_record.h"
creative_assets_processing_record_t* instantiate_creative_assets_processing_record(int include_optional);



creative_assets_processing_record_t* instantiate_creative_assets_processing_record(int include_optional) {
  creative_assets_processing_record_t* creative_assets_processing_record = NULL;
  if (include_optional) {
    creative_assets_processing_record = creative_assets_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_creative_assets_processing_record__"SUCCESS"
    );
  } else {
    creative_assets_processing_record = creative_assets_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_creative_assets_processing_record__"SUCCESS"
    );
  }

  return creative_assets_processing_record;
}


#ifdef creative_assets_processing_record_MAIN

void test_creative_assets_processing_record(int include_optional) {
    creative_assets_processing_record_t* creative_assets_processing_record_1 = instantiate_creative_assets_processing_record(include_optional);

	cJSON* jsoncreative_assets_processing_record_1 = creative_assets_processing_record_convertToJSON(creative_assets_processing_record_1);
	printf("creative_assets_processing_record :\n%s\n", cJSON_Print(jsoncreative_assets_processing_record_1));
	creative_assets_processing_record_t* creative_assets_processing_record_2 = creative_assets_processing_record_parseFromJSON(jsoncreative_assets_processing_record_1);
	cJSON* jsoncreative_assets_processing_record_2 = creative_assets_processing_record_convertToJSON(creative_assets_processing_record_2);
	printf("repeating creative_assets_processing_record:\n%s\n", cJSON_Print(jsoncreative_assets_processing_record_2));
}

int main() {
  test_creative_assets_processing_record(1);
  test_creative_assets_processing_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // creative_assets_processing_record_MAIN
#endif // creative_assets_processing_record_TEST
