#ifndef user_list_type_TEST
#define user_list_type_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_list_type_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_list_type.h"
user_list_type_t* instantiate_user_list_type(int include_optional);



user_list_type_t* instantiate_user_list_type(int include_optional) {
  user_list_type_t* user_list_type = NULL;
  if (include_optional) {
    user_list_type = user_list_type_create(
    );
  } else {
    user_list_type = user_list_type_create(
    );
  }

  return user_list_type;
}


#ifdef user_list_type_MAIN

void test_user_list_type(int include_optional) {
    user_list_type_t* user_list_type_1 = instantiate_user_list_type(include_optional);

	cJSON* jsonuser_list_type_1 = user_list_type_convertToJSON(user_list_type_1);
	printf("user_list_type :\n%s\n", cJSON_Print(jsonuser_list_type_1));
	user_list_type_t* user_list_type_2 = user_list_type_parseFromJSON(jsonuser_list_type_1);
	cJSON* jsonuser_list_type_2 = user_list_type_convertToJSON(user_list_type_2);
	printf("repeating user_list_type:\n%s\n", cJSON_Print(jsonuser_list_type_2));
}

int main() {
  test_user_list_type(1);
  test_user_list_type(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_list_type_MAIN
#endif // user_list_type_TEST
