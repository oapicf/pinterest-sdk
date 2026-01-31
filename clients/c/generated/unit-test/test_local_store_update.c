#ifndef local_store_update_TEST
#define local_store_update_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define local_store_update_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/local_store_update.h"
local_store_update_t* instantiate_local_store_update(int include_optional);



local_store_update_t* instantiate_local_store_update(int include_optional) {
  local_store_update_t* local_store_update = NULL;
  if (include_optional) {
    local_store_update = local_store_update_create(
      "123 Johnson St",
      "Suite 100",
      "Sunnyvale",
      AD,
      "1234567890",
      -30.21,
      50.45,
      "Sunnyvale Store",
      "94043",
      "CA",
      "store_1"
    );
  } else {
    local_store_update = local_store_update_create(
      "123 Johnson St",
      "Suite 100",
      "Sunnyvale",
      AD,
      "1234567890",
      -30.21,
      50.45,
      "Sunnyvale Store",
      "94043",
      "CA",
      "store_1"
    );
  }

  return local_store_update;
}


#ifdef local_store_update_MAIN

void test_local_store_update(int include_optional) {
    local_store_update_t* local_store_update_1 = instantiate_local_store_update(include_optional);

	cJSON* jsonlocal_store_update_1 = local_store_update_convertToJSON(local_store_update_1);
	printf("local_store_update :\n%s\n", cJSON_Print(jsonlocal_store_update_1));
	local_store_update_t* local_store_update_2 = local_store_update_parseFromJSON(jsonlocal_store_update_1);
	cJSON* jsonlocal_store_update_2 = local_store_update_convertToJSON(local_store_update_2);
	printf("repeating local_store_update:\n%s\n", cJSON_Print(jsonlocal_store_update_2));
}

int main() {
  test_local_store_update(1);
  test_local_store_update(0);

  printf("Hello world \n");
  return 0;
}

#endif // local_store_update_MAIN
#endif // local_store_update_TEST
