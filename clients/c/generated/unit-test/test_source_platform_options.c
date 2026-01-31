#ifndef source_platform_options_TEST
#define source_platform_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define source_platform_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/source_platform_options.h"
source_platform_options_t* instantiate_source_platform_options(int include_optional);



source_platform_options_t* instantiate_source_platform_options(int include_optional) {
  source_platform_options_t* source_platform_options = NULL;
  if (include_optional) {
    source_platform_options = source_platform_options_create(
    );
  } else {
    source_platform_options = source_platform_options_create(
    );
  }

  return source_platform_options;
}


#ifdef source_platform_options_MAIN

void test_source_platform_options(int include_optional) {
    source_platform_options_t* source_platform_options_1 = instantiate_source_platform_options(include_optional);

	cJSON* jsonsource_platform_options_1 = source_platform_options_convertToJSON(source_platform_options_1);
	printf("source_platform_options :\n%s\n", cJSON_Print(jsonsource_platform_options_1));
	source_platform_options_t* source_platform_options_2 = source_platform_options_parseFromJSON(jsonsource_platform_options_1);
	cJSON* jsonsource_platform_options_2 = source_platform_options_convertToJSON(source_platform_options_2);
	printf("repeating source_platform_options:\n%s\n", cJSON_Print(jsonsource_platform_options_2));
}

int main() {
  test_source_platform_options(1);
  test_source_platform_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // source_platform_options_MAIN
#endif // source_platform_options_TEST
