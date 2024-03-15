#ifndef language_TEST
#define language_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define language_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/language.h"
language_t* instantiate_language(int include_optional);



language_t* instantiate_language(int include_optional) {
  language_t* language = NULL;
  if (include_optional) {
    language = language_create(
    );
  } else {
    language = language_create(
    );
  }

  return language;
}


#ifdef language_MAIN

void test_language(int include_optional) {
    language_t* language_1 = instantiate_language(include_optional);

	cJSON* jsonlanguage_1 = language_convertToJSON(language_1);
	printf("language :\n%s\n", cJSON_Print(jsonlanguage_1));
	language_t* language_2 = language_parseFromJSON(jsonlanguage_1);
	cJSON* jsonlanguage_2 = language_convertToJSON(language_2);
	printf("repeating language:\n%s\n", cJSON_Print(jsonlanguage_2));
}

int main() {
  test_language(1);
  test_language(0);

  printf("Hello world \n");
  return 0;
}

#endif // language_MAIN
#endif // language_TEST
