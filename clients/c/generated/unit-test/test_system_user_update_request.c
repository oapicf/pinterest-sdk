#ifndef system_user_update_request_TEST
#define system_user_update_request_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define system_user_update_request_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/system_user_update_request.h"
system_user_update_request_t* instantiate_system_user_update_request(int include_optional);



system_user_update_request_t* instantiate_system_user_update_request(int include_optional) {
  system_user_update_request_t* system_user_update_request = NULL;
  if (include_optional) {
    system_user_update_request = system_user_update_request_create(
      "Billing API"
    );
  } else {
    system_user_update_request = system_user_update_request_create(
      "Billing API"
    );
  }

  return system_user_update_request;
}


#ifdef system_user_update_request_MAIN

void test_system_user_update_request(int include_optional) {
    system_user_update_request_t* system_user_update_request_1 = instantiate_system_user_update_request(include_optional);

	cJSON* jsonsystem_user_update_request_1 = system_user_update_request_convertToJSON(system_user_update_request_1);
	printf("system_user_update_request :\n%s\n", cJSON_Print(jsonsystem_user_update_request_1));
	system_user_update_request_t* system_user_update_request_2 = system_user_update_request_parseFromJSON(jsonsystem_user_update_request_1);
	cJSON* jsonsystem_user_update_request_2 = system_user_update_request_convertToJSON(system_user_update_request_2);
	printf("repeating system_user_update_request:\n%s\n", cJSON_Print(jsonsystem_user_update_request_2));
}

int main() {
  test_system_user_update_request(1);
  test_system_user_update_request(0);

  printf("Hello world \n");
  return 0;
}

#endif // system_user_update_request_MAIN
#endif // system_user_update_request_TEST
