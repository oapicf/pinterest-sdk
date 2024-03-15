#ifndef summary_pin_media_TEST
#define summary_pin_media_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define summary_pin_media_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/summary_pin_media.h"
summary_pin_media_t* instantiate_summary_pin_media(int include_optional);



summary_pin_media_t* instantiate_summary_pin_media(int include_optional) {
  summary_pin_media_t* summary_pin_media = NULL;
  if (include_optional) {
    summary_pin_media = summary_pin_media_create(
      "0"
    );
  } else {
    summary_pin_media = summary_pin_media_create(
      "0"
    );
  }

  return summary_pin_media;
}


#ifdef summary_pin_media_MAIN

void test_summary_pin_media(int include_optional) {
    summary_pin_media_t* summary_pin_media_1 = instantiate_summary_pin_media(include_optional);

	cJSON* jsonsummary_pin_media_1 = summary_pin_media_convertToJSON(summary_pin_media_1);
	printf("summary_pin_media :\n%s\n", cJSON_Print(jsonsummary_pin_media_1));
	summary_pin_media_t* summary_pin_media_2 = summary_pin_media_parseFromJSON(jsonsummary_pin_media_1);
	cJSON* jsonsummary_pin_media_2 = summary_pin_media_convertToJSON(summary_pin_media_2);
	printf("repeating summary_pin_media:\n%s\n", cJSON_Print(jsonsummary_pin_media_2));
}

int main() {
  test_summary_pin_media(1);
  test_summary_pin_media(0);

  printf("Hello world \n");
  return 0;
}

#endif // summary_pin_media_MAIN
#endif // summary_pin_media_TEST
