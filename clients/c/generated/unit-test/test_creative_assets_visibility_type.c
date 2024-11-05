#ifndef creative_assets_visibility_type_TEST
#define creative_assets_visibility_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define creative_assets_visibility_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/creative_assets_visibility_type.h"
creative_assets_visibility_type_t* instantiate_creative_assets_visibility_type(int include_optional);



creative_assets_visibility_type_t* instantiate_creative_assets_visibility_type(int include_optional) {
  creative_assets_visibility_type_t* creative_assets_visibility_type = NULL;
  if (include_optional) {
    creative_assets_visibility_type = creative_assets_visibility_type_create(
    );
  } else {
    creative_assets_visibility_type = creative_assets_visibility_type_create(
    );
  }

  return creative_assets_visibility_type;
}


#ifdef creative_assets_visibility_type_MAIN

void test_creative_assets_visibility_type(int include_optional) {
    creative_assets_visibility_type_t* creative_assets_visibility_type_1 = instantiate_creative_assets_visibility_type(include_optional);

	cJSON* jsoncreative_assets_visibility_type_1 = creative_assets_visibility_type_convertToJSON(creative_assets_visibility_type_1);
	printf("creative_assets_visibility_type :\n%s\n", cJSON_Print(jsoncreative_assets_visibility_type_1));
	creative_assets_visibility_type_t* creative_assets_visibility_type_2 = creative_assets_visibility_type_parseFromJSON(jsoncreative_assets_visibility_type_1);
	cJSON* jsoncreative_assets_visibility_type_2 = creative_assets_visibility_type_convertToJSON(creative_assets_visibility_type_2);
	printf("repeating creative_assets_visibility_type:\n%s\n", cJSON_Print(jsoncreative_assets_visibility_type_2));
}

int main() {
  test_creative_assets_visibility_type(1);
  test_creative_assets_visibility_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // creative_assets_visibility_type_MAIN
#endif // creative_assets_visibility_type_TEST
