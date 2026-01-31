#ifndef s3_multipart_upload_data_TEST
#define s3_multipart_upload_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define s3_multipart_upload_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/s3_multipart_upload_data.h"
s3_multipart_upload_data_t* instantiate_s3_multipart_upload_data(int include_optional);



s3_multipart_upload_data_t* instantiate_s3_multipart_upload_data(int include_optional) {
  s3_multipart_upload_data_t* s3_multipart_upload_data = NULL;
  if (include_optional) {
    s3_multipart_upload_data = s3_multipart_upload_data_create(
      list_createList()
    );
  } else {
    s3_multipart_upload_data = s3_multipart_upload_data_create(
      list_createList()
    );
  }

  return s3_multipart_upload_data;
}


#ifdef s3_multipart_upload_data_MAIN

void test_s3_multipart_upload_data(int include_optional) {
    s3_multipart_upload_data_t* s3_multipart_upload_data_1 = instantiate_s3_multipart_upload_data(include_optional);

	cJSON* jsons3_multipart_upload_data_1 = s3_multipart_upload_data_convertToJSON(s3_multipart_upload_data_1);
	printf("s3_multipart_upload_data :\n%s\n", cJSON_Print(jsons3_multipart_upload_data_1));
	s3_multipart_upload_data_t* s3_multipart_upload_data_2 = s3_multipart_upload_data_parseFromJSON(jsons3_multipart_upload_data_1);
	cJSON* jsons3_multipart_upload_data_2 = s3_multipart_upload_data_convertToJSON(s3_multipart_upload_data_2);
	printf("repeating s3_multipart_upload_data:\n%s\n", cJSON_Print(jsons3_multipart_upload_data_2));
}

int main() {
  test_s3_multipart_upload_data(1);
  test_s3_multipart_upload_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // s3_multipart_upload_data_MAIN
#endif // s3_multipart_upload_data_TEST
