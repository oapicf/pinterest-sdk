#ifndef permissions_with_owner_TEST
#define permissions_with_owner_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define permissions_with_owner_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/permissions_with_owner.h"
permissions_with_owner_t* instantiate_permissions_with_owner(int include_optional);



permissions_with_owner_t* instantiate_permissions_with_owner(int include_optional) {
  permissions_with_owner_t* permissions_with_owner = NULL;
  if (include_optional) {
    permissions_with_owner = permissions_with_owner_create(
    );
  } else {
    permissions_with_owner = permissions_with_owner_create(
    );
  }

  return permissions_with_owner;
}


#ifdef permissions_with_owner_MAIN

void test_permissions_with_owner(int include_optional) {
    permissions_with_owner_t* permissions_with_owner_1 = instantiate_permissions_with_owner(include_optional);

	cJSON* jsonpermissions_with_owner_1 = permissions_with_owner_convertToJSON(permissions_with_owner_1);
	printf("permissions_with_owner :\n%s\n", cJSON_Print(jsonpermissions_with_owner_1));
	permissions_with_owner_t* permissions_with_owner_2 = permissions_with_owner_parseFromJSON(jsonpermissions_with_owner_1);
	cJSON* jsonpermissions_with_owner_2 = permissions_with_owner_convertToJSON(permissions_with_owner_2);
	printf("repeating permissions_with_owner:\n%s\n", cJSON_Print(jsonpermissions_with_owner_2));
}

int main() {
  test_permissions_with_owner(1);
  test_permissions_with_owner(0);

  printf("Hello world \n");
  return 0;
}

#endif // permissions_with_owner_MAIN
#endif // permissions_with_owner_TEST
