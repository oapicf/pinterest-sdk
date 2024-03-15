#ifndef book_closed_response_TEST
#define book_closed_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define book_closed_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/book_closed_response.h"
book_closed_response_t* instantiate_book_closed_response(int include_optional);



book_closed_response_t* instantiate_book_closed_response(int include_optional) {
  book_closed_response_t* book_closed_response = NULL;
  if (include_optional) {
    book_closed_response = book_closed_response_create(
      false,
      false
    );
  } else {
    book_closed_response = book_closed_response_create(
      false,
      false
    );
  }

  return book_closed_response;
}


#ifdef book_closed_response_MAIN

void test_book_closed_response(int include_optional) {
    book_closed_response_t* book_closed_response_1 = instantiate_book_closed_response(include_optional);

	cJSON* jsonbook_closed_response_1 = book_closed_response_convertToJSON(book_closed_response_1);
	printf("book_closed_response :\n%s\n", cJSON_Print(jsonbook_closed_response_1));
	book_closed_response_t* book_closed_response_2 = book_closed_response_parseFromJSON(jsonbook_closed_response_1);
	cJSON* jsonbook_closed_response_2 = book_closed_response_convertToJSON(book_closed_response_2);
	printf("repeating book_closed_response:\n%s\n", cJSON_Print(jsonbook_closed_response_2));
}

int main() {
  test_book_closed_response(1);
  test_book_closed_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // book_closed_response_MAIN
#endif // book_closed_response_TEST
