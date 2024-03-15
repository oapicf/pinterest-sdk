#ifndef item_delete_batch_record_TEST
#define item_delete_batch_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define item_delete_batch_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/item_delete_batch_record.h"
item_delete_batch_record_t* instantiate_item_delete_batch_record(int include_optional);



item_delete_batch_record_t* instantiate_item_delete_batch_record(int include_optional) {
  item_delete_batch_record_t* item_delete_batch_record = NULL;
  if (include_optional) {
    item_delete_batch_record = item_delete_batch_record_create(
      "DS0294-M"
    );
  } else {
    item_delete_batch_record = item_delete_batch_record_create(
      "DS0294-M"
    );
  }

  return item_delete_batch_record;
}


#ifdef item_delete_batch_record_MAIN

void test_item_delete_batch_record(int include_optional) {
    item_delete_batch_record_t* item_delete_batch_record_1 = instantiate_item_delete_batch_record(include_optional);

	cJSON* jsonitem_delete_batch_record_1 = item_delete_batch_record_convertToJSON(item_delete_batch_record_1);
	printf("item_delete_batch_record :\n%s\n", cJSON_Print(jsonitem_delete_batch_record_1));
	item_delete_batch_record_t* item_delete_batch_record_2 = item_delete_batch_record_parseFromJSON(jsonitem_delete_batch_record_1);
	cJSON* jsonitem_delete_batch_record_2 = item_delete_batch_record_convertToJSON(item_delete_batch_record_2);
	printf("repeating item_delete_batch_record:\n%s\n", cJSON_Print(jsonitem_delete_batch_record_2));
}

int main() {
  test_item_delete_batch_record(1);
  test_item_delete_batch_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // item_delete_batch_record_MAIN
#endif // item_delete_batch_record_TEST
