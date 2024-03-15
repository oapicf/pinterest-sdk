#ifndef user_website_verification_code_TEST
#define user_website_verification_code_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define user_website_verification_code_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/user_website_verification_code.h"
user_website_verification_code_t* instantiate_user_website_verification_code(int include_optional);



user_website_verification_code_t* instantiate_user_website_verification_code(int include_optional) {
  user_website_verification_code_t* user_website_verification_code = NULL;
  if (include_optional) {
    user_website_verification_code = user_website_verification_code_create(
      "e1edcc1a43976c646367e9c6c9a9b7b6",
      "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6",
      "<meta name="p:domain_verify" content="e1edcc1a43976c646367e9c6c9a9b7b6"/>",
      "pinterest-e1edc.html",
      "0"
    );
  } else {
    user_website_verification_code = user_website_verification_code_create(
      "e1edcc1a43976c646367e9c6c9a9b7b6",
      "pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6",
      "<meta name="p:domain_verify" content="e1edcc1a43976c646367e9c6c9a9b7b6"/>",
      "pinterest-e1edc.html",
      "0"
    );
  }

  return user_website_verification_code;
}


#ifdef user_website_verification_code_MAIN

void test_user_website_verification_code(int include_optional) {
    user_website_verification_code_t* user_website_verification_code_1 = instantiate_user_website_verification_code(include_optional);

	cJSON* jsonuser_website_verification_code_1 = user_website_verification_code_convertToJSON(user_website_verification_code_1);
	printf("user_website_verification_code :\n%s\n", cJSON_Print(jsonuser_website_verification_code_1));
	user_website_verification_code_t* user_website_verification_code_2 = user_website_verification_code_parseFromJSON(jsonuser_website_verification_code_1);
	cJSON* jsonuser_website_verification_code_2 = user_website_verification_code_convertToJSON(user_website_verification_code_2);
	printf("repeating user_website_verification_code:\n%s\n", cJSON_Print(jsonuser_website_verification_code_2));
}

int main() {
  test_user_website_verification_code(1);
  test_user_website_verification_code(0);

  printf("Hello world \n");
  return 0;
}

#endif // user_website_verification_code_MAIN
#endif // user_website_verification_code_TEST
