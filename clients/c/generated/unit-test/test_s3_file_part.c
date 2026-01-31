#ifndef s3_file_part_TEST
#define s3_file_part_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define s3_file_part_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/s3_file_part.h"
s3_file_part_t* instantiate_s3_file_part(int include_optional);



s3_file_part_t* instantiate_s3_file_part(int include_optional) {
  s3_file_part_t* s3_file_part = NULL;
  if (include_optional) {
    s3_file_part = s3_file_part_create(
      1,
      "0"
    );
  } else {
    s3_file_part = s3_file_part_create(
      1,
      "0"
    );
  }

  return s3_file_part;
}


#ifdef s3_file_part_MAIN

void test_s3_file_part(int include_optional) {
    s3_file_part_t* s3_file_part_1 = instantiate_s3_file_part(include_optional);

	cJSON* jsons3_file_part_1 = s3_file_part_convertToJSON(s3_file_part_1);
	printf("s3_file_part :\n%s\n", cJSON_Print(jsons3_file_part_1));
	s3_file_part_t* s3_file_part_2 = s3_file_part_parseFromJSON(jsons3_file_part_1);
	cJSON* jsons3_file_part_2 = s3_file_part_convertToJSON(s3_file_part_2);
	printf("repeating s3_file_part:\n%s\n", cJSON_Print(jsons3_file_part_2));
}

int main() {
  test_s3_file_part(1);
  test_s3_file_part(0);

  printf("Hello world \n");
  return 0;
}

#endif // s3_file_part_MAIN
#endif // s3_file_part_TEST
