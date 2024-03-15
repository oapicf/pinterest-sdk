#ifndef hotel_processing_record_TEST
#define hotel_processing_record_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define hotel_processing_record_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/hotel_processing_record.h"
hotel_processing_record_t* instantiate_hotel_processing_record(int include_optional);



hotel_processing_record_t* instantiate_hotel_processing_record(int include_optional) {
  hotel_processing_record_t* hotel_processing_record = NULL;
  if (include_optional) {
    hotel_processing_record = hotel_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_hotel_processing_record__"SUCCESS"
    );
  } else {
    hotel_processing_record = hotel_processing_record_create(
      "DS0294-M",
      list_createList(),
      list_createList(),
      pinterest_rest_api_hotel_processing_record__"SUCCESS"
    );
  }

  return hotel_processing_record;
}


#ifdef hotel_processing_record_MAIN

void test_hotel_processing_record(int include_optional) {
    hotel_processing_record_t* hotel_processing_record_1 = instantiate_hotel_processing_record(include_optional);

	cJSON* jsonhotel_processing_record_1 = hotel_processing_record_convertToJSON(hotel_processing_record_1);
	printf("hotel_processing_record :\n%s\n", cJSON_Print(jsonhotel_processing_record_1));
	hotel_processing_record_t* hotel_processing_record_2 = hotel_processing_record_parseFromJSON(jsonhotel_processing_record_1);
	cJSON* jsonhotel_processing_record_2 = hotel_processing_record_convertToJSON(hotel_processing_record_2);
	printf("repeating hotel_processing_record:\n%s\n", cJSON_Print(jsonhotel_processing_record_2));
}

int main() {
  test_hotel_processing_record(1);
  test_hotel_processing_record(0);

  printf("Hello world \n");
  return 0;
}

#endif // hotel_processing_record_MAIN
#endif // hotel_processing_record_TEST
