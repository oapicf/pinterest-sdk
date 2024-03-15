#ifndef creative_type_TEST
#define creative_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define creative_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/creative_type.h"
creative_type_t* instantiate_creative_type(int include_optional);



creative_type_t* instantiate_creative_type(int include_optional) {
  creative_type_t* creative_type = NULL;
  if (include_optional) {
    creative_type = creative_type_create(
    );
  } else {
    creative_type = creative_type_create(
    );
  }

  return creative_type;
}


#ifdef creative_type_MAIN

void test_creative_type(int include_optional) {
    creative_type_t* creative_type_1 = instantiate_creative_type(include_optional);

	cJSON* jsoncreative_type_1 = creative_type_convertToJSON(creative_type_1);
	printf("creative_type :\n%s\n", cJSON_Print(jsoncreative_type_1));
	creative_type_t* creative_type_2 = creative_type_parseFromJSON(jsoncreative_type_1);
	cJSON* jsoncreative_type_2 = creative_type_convertToJSON(creative_type_2);
	printf("repeating creative_type:\n%s\n", cJSON_Print(jsoncreative_type_2));
}

int main() {
  test_creative_type(1);
  test_creative_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // creative_type_MAIN
#endif // creative_type_TEST
