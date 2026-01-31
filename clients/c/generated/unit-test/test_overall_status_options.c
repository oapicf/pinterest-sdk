#ifndef overall_status_options_TEST
#define overall_status_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define overall_status_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/overall_status_options.h"
overall_status_options_t* instantiate_overall_status_options(int include_optional);



overall_status_options_t* instantiate_overall_status_options(int include_optional) {
  overall_status_options_t* overall_status_options = NULL;
  if (include_optional) {
    overall_status_options = overall_status_options_create(
    );
  } else {
    overall_status_options = overall_status_options_create(
    );
  }

  return overall_status_options;
}


#ifdef overall_status_options_MAIN

void test_overall_status_options(int include_optional) {
    overall_status_options_t* overall_status_options_1 = instantiate_overall_status_options(include_optional);

	cJSON* jsonoverall_status_options_1 = overall_status_options_convertToJSON(overall_status_options_1);
	printf("overall_status_options :\n%s\n", cJSON_Print(jsonoverall_status_options_1));
	overall_status_options_t* overall_status_options_2 = overall_status_options_parseFromJSON(jsonoverall_status_options_1);
	cJSON* jsonoverall_status_options_2 = overall_status_options_convertToJSON(overall_status_options_2);
	printf("repeating overall_status_options:\n%s\n", cJSON_Print(jsonoverall_status_options_2));
}

int main() {
  test_overall_status_options(1);
  test_overall_status_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // overall_status_options_MAIN
#endif // overall_status_options_TEST
