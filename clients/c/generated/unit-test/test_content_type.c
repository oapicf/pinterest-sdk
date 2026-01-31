#ifndef content_type_TEST
#define content_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define content_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/content_type.h"
content_type_t* instantiate_content_type(int include_optional);



content_type_t* instantiate_content_type(int include_optional) {
  content_type_t* content_type = NULL;
  if (include_optional) {
    content_type = content_type_create(
    );
  } else {
    content_type = content_type_create(
    );
  }

  return content_type;
}


#ifdef content_type_MAIN

void test_content_type(int include_optional) {
    content_type_t* content_type_1 = instantiate_content_type(include_optional);

	cJSON* jsoncontent_type_1 = content_type_convertToJSON(content_type_1);
	printf("content_type :\n%s\n", cJSON_Print(jsoncontent_type_1));
	content_type_t* content_type_2 = content_type_parseFromJSON(jsoncontent_type_1);
	cJSON* jsoncontent_type_2 = content_type_convertToJSON(content_type_2);
	printf("repeating content_type:\n%s\n", cJSON_Print(jsoncontent_type_2));
}

int main() {
  test_content_type(1);
  test_content_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // content_type_MAIN
#endif // content_type_TEST
