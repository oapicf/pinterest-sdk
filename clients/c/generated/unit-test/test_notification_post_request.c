#ifndef notification_post_request_TEST
#define notification_post_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define notification_post_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/notification_post_request.h"
notification_post_request_t* instantiate_notification_post_request(int include_optional);



notification_post_request_t* instantiate_notification_post_request(int include_optional) {
  notification_post_request_t* notification_post_request = NULL;
  if (include_optional) {
    notification_post_request = notification_post_request_create(
    );
  } else {
    notification_post_request = notification_post_request_create(
    );
  }

  return notification_post_request;
}


#ifdef notification_post_request_MAIN

void test_notification_post_request(int include_optional) {
    notification_post_request_t* notification_post_request_1 = instantiate_notification_post_request(include_optional);

	cJSON* jsonnotification_post_request_1 = notification_post_request_convertToJSON(notification_post_request_1);
	printf("notification_post_request :\n%s\n", cJSON_Print(jsonnotification_post_request_1));
	notification_post_request_t* notification_post_request_2 = notification_post_request_parseFromJSON(jsonnotification_post_request_1);
	cJSON* jsonnotification_post_request_2 = notification_post_request_convertToJSON(notification_post_request_2);
	printf("repeating notification_post_request:\n%s\n", cJSON_Print(jsonnotification_post_request_2));
}

int main() {
  test_notification_post_request(1);
  test_notification_post_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // notification_post_request_MAIN
#endif // notification_post_request_TEST
