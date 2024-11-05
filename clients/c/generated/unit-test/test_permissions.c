#ifndef permissions_TEST
#define permissions_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define permissions_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/permissions.h"
permissions_t* instantiate_permissions(int include_optional);



permissions_t* instantiate_permissions(int include_optional) {
  permissions_t* permissions = NULL;
  if (include_optional) {
    permissions = permissions_create(
    );
  } else {
    permissions = permissions_create(
    );
  }

  return permissions;
}


#ifdef permissions_MAIN

void test_permissions(int include_optional) {
    permissions_t* permissions_1 = instantiate_permissions(include_optional);

	cJSON* jsonpermissions_1 = permissions_convertToJSON(permissions_1);
	printf("permissions :\n%s\n", cJSON_Print(jsonpermissions_1));
	permissions_t* permissions_2 = permissions_parseFromJSON(jsonpermissions_1);
	cJSON* jsonpermissions_2 = permissions_convertToJSON(permissions_2);
	printf("repeating permissions:\n%s\n", cJSON_Print(jsonpermissions_2));
}

int main() {
  test_permissions(1);
  test_permissions(0);

  printf("Hello world \n");
  return 0;
}

#endif // permissions_MAIN
#endif // permissions_TEST
