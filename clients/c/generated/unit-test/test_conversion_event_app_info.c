#ifndef conversion_event_app_info_TEST
#define conversion_event_app_info_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_event_app_info_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_event_app_info.h"
conversion_event_app_info_t* instantiate_conversion_event_app_info(int include_optional);



conversion_event_app_info_t* instantiate_conversion_event_app_info(int include_optional) {
  conversion_event_app_info_t* conversion_event_app_info = NULL;
  if (include_optional) {
    conversion_event_app_info = conversion_event_app_info_create(
      "429047995",
      "MyAwesomeApp",
      "com.company.myawesomeapp",
      "Google Play Store",
      "7.9",
      1739222269,
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36",
      900,
      1678
    );
  } else {
    conversion_event_app_info = conversion_event_app_info_create(
      "429047995",
      "MyAwesomeApp",
      "com.company.myawesomeapp",
      "Google Play Store",
      "7.9",
      1739222269,
      "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36",
      900,
      1678
    );
  }

  return conversion_event_app_info;
}


#ifdef conversion_event_app_info_MAIN

void test_conversion_event_app_info(int include_optional) {
    conversion_event_app_info_t* conversion_event_app_info_1 = instantiate_conversion_event_app_info(include_optional);

	cJSON* jsonconversion_event_app_info_1 = conversion_event_app_info_convertToJSON(conversion_event_app_info_1);
	printf("conversion_event_app_info :\n%s\n", cJSON_Print(jsonconversion_event_app_info_1));
	conversion_event_app_info_t* conversion_event_app_info_2 = conversion_event_app_info_parseFromJSON(jsonconversion_event_app_info_1);
	cJSON* jsonconversion_event_app_info_2 = conversion_event_app_info_convertToJSON(conversion_event_app_info_2);
	printf("repeating conversion_event_app_info:\n%s\n", cJSON_Print(jsonconversion_event_app_info_2));
}

int main() {
  test_conversion_event_app_info(1);
  test_conversion_event_app_info(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_event_app_info_MAIN
#endif // conversion_event_app_info_TEST
