#ifndef conversion_events_user_data_any_of_TEST
#define conversion_events_user_data_any_of_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_user_data_any_of_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events_user_data_any_of.h"
conversion_events_user_data_any_of_t* instantiate_conversion_events_user_data_any_of(int include_optional);



conversion_events_user_data_any_of_t* instantiate_conversion_events_user_data_any_of(int include_optional) {
  conversion_events_user_data_any_of_t* conversion_events_user_data_any_of = NULL;
  if (include_optional) {
    conversion_events_user_data_any_of = conversion_events_user_data_any_of_create(
      ["411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8","09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969"],
      ["0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1","837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46"],
      "216.3.128.12",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    );
  } else {
    conversion_events_user_data_any_of = conversion_events_user_data_any_of_create(
      ["411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8","09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969"],
      ["0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1","837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46"],
      "216.3.128.12",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    );
  }

  return conversion_events_user_data_any_of;
}


#ifdef conversion_events_user_data_any_of_MAIN

void test_conversion_events_user_data_any_of(int include_optional) {
    conversion_events_user_data_any_of_t* conversion_events_user_data_any_of_1 = instantiate_conversion_events_user_data_any_of(include_optional);

	cJSON* jsonconversion_events_user_data_any_of_1 = conversion_events_user_data_any_of_convertToJSON(conversion_events_user_data_any_of_1);
	printf("conversion_events_user_data_any_of :\n%s\n", cJSON_Print(jsonconversion_events_user_data_any_of_1));
	conversion_events_user_data_any_of_t* conversion_events_user_data_any_of_2 = conversion_events_user_data_any_of_parseFromJSON(jsonconversion_events_user_data_any_of_1);
	cJSON* jsonconversion_events_user_data_any_of_2 = conversion_events_user_data_any_of_convertToJSON(conversion_events_user_data_any_of_2);
	printf("repeating conversion_events_user_data_any_of:\n%s\n", cJSON_Print(jsonconversion_events_user_data_any_of_2));
}

int main() {
  test_conversion_events_user_data_any_of(1);
  test_conversion_events_user_data_any_of(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_user_data_any_of_MAIN
#endif // conversion_events_user_data_any_of_TEST
