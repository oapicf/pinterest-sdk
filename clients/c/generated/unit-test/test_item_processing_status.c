#ifndef item_processing_status_TEST
#define item_processing_status_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_processing_status_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_processing_status.h"
item_processing_status_t* instantiate_item_processing_status(int include_optional);



item_processing_status_t* instantiate_item_processing_status(int include_optional) {
  item_processing_status_t* item_processing_status = NULL;
  if (include_optional) {
    item_processing_status = item_processing_status_create(
    );
  } else {
    item_processing_status = item_processing_status_create(
    );
  }

  return item_processing_status;
}


#ifdef item_processing_status_MAIN

void test_item_processing_status(int include_optional) {
    item_processing_status_t* item_processing_status_1 = instantiate_item_processing_status(include_optional);

	cJSON* jsonitem_processing_status_1 = item_processing_status_convertToJSON(item_processing_status_1);
	printf("item_processing_status :\n%s\n", cJSON_Print(jsonitem_processing_status_1));
	item_processing_status_t* item_processing_status_2 = item_processing_status_parseFromJSON(jsonitem_processing_status_1);
	cJSON* jsonitem_processing_status_2 = item_processing_status_convertToJSON(item_processing_status_2);
	printf("repeating item_processing_status:\n%s\n", cJSON_Print(jsonitem_processing_status_2));
}

int main() {
  test_item_processing_status(1);
  test_item_processing_status(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_processing_status_MAIN
#endif // item_processing_status_TEST
