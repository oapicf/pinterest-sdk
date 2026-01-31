#ifndef ingestion_source_options_TEST
#define ingestion_source_options_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ingestion_source_options_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ingestion_source_options.h"
ingestion_source_options_t* instantiate_ingestion_source_options(int include_optional);



ingestion_source_options_t* instantiate_ingestion_source_options(int include_optional) {
  ingestion_source_options_t* ingestion_source_options = NULL;
  if (include_optional) {
    ingestion_source_options = ingestion_source_options_create(
    );
  } else {
    ingestion_source_options = ingestion_source_options_create(
    );
  }

  return ingestion_source_options;
}


#ifdef ingestion_source_options_MAIN

void test_ingestion_source_options(int include_optional) {
    ingestion_source_options_t* ingestion_source_options_1 = instantiate_ingestion_source_options(include_optional);

	cJSON* jsoningestion_source_options_1 = ingestion_source_options_convertToJSON(ingestion_source_options_1);
	printf("ingestion_source_options :\n%s\n", cJSON_Print(jsoningestion_source_options_1));
	ingestion_source_options_t* ingestion_source_options_2 = ingestion_source_options_parseFromJSON(jsoningestion_source_options_1);
	cJSON* jsoningestion_source_options_2 = ingestion_source_options_convertToJSON(ingestion_source_options_2);
	printf("repeating ingestion_source_options:\n%s\n", cJSON_Print(jsoningestion_source_options_2));
}

int main() {
  test_ingestion_source_options(1);
  test_ingestion_source_options(0);

  printf("Hello world \n");
  return 0;
}

#endif // ingestion_source_options_MAIN
#endif // ingestion_source_options_TEST
