#ifndef notification_response_TEST
#define notification_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define notification_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/notification_response.h"
notification_response_t* instantiate_notification_response(int include_optional);



notification_response_t* instantiate_notification_response(int include_optional) {
  notification_response_t* notification_response = NULL;
  if (include_optional) {
    notification_response = notification_response_create(
      false,
      1677003860,
      "0"
    );
  } else {
    notification_response = notification_response_create(
      false,
      1677003860,
      "0"
    );
  }

  return notification_response;
}


#ifdef notification_response_MAIN

void test_notification_response(int include_optional) {
    notification_response_t* notification_response_1 = instantiate_notification_response(include_optional);

	cJSON* jsonnotification_response_1 = notification_response_convertToJSON(notification_response_1);
	printf("notification_response :\n%s\n", cJSON_Print(jsonnotification_response_1));
	notification_response_t* notification_response_2 = notification_response_parseFromJSON(jsonnotification_response_1);
	cJSON* jsonnotification_response_2 = notification_response_convertToJSON(notification_response_2);
	printf("repeating notification_response:\n%s\n", cJSON_Print(jsonnotification_response_2));
}

int main() {
  test_notification_response(1);
  test_notification_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // notification_response_MAIN
#endif // notification_response_TEST
