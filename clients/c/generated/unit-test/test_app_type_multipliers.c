#ifndef app_type_multipliers_TEST
#define app_type_multipliers_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define app_type_multipliers_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/app_type_multipliers.h"
app_type_multipliers_t* instantiate_app_type_multipliers(int include_optional);



app_type_multipliers_t* instantiate_app_type_multipliers(int include_optional) {
  app_type_multipliers_t* app_type_multipliers = NULL;
  if (include_optional) {
    app_type_multipliers = app_type_multipliers_create(
      pinterest_rest_api_app_type_multipliers__android_mobile
    );
  } else {
    app_type_multipliers = app_type_multipliers_create(
      pinterest_rest_api_app_type_multipliers__android_mobile
    );
  }

  return app_type_multipliers;
}


#ifdef app_type_multipliers_MAIN

void test_app_type_multipliers(int include_optional) {
    app_type_multipliers_t* app_type_multipliers_1 = instantiate_app_type_multipliers(include_optional);

	cJSON* jsonapp_type_multipliers_1 = app_type_multipliers_convertToJSON(app_type_multipliers_1);
	printf("app_type_multipliers :\n%s\n", cJSON_Print(jsonapp_type_multipliers_1));
	app_type_multipliers_t* app_type_multipliers_2 = app_type_multipliers_parseFromJSON(jsonapp_type_multipliers_1);
	cJSON* jsonapp_type_multipliers_2 = app_type_multipliers_convertToJSON(app_type_multipliers_2);
	printf("repeating app_type_multipliers:\n%s\n", cJSON_Print(jsonapp_type_multipliers_2));
}

int main() {
  test_app_type_multipliers(1);
  test_app_type_multipliers(0);

  printf("Hello world \n");
  return 0;
}

#endif // app_type_multipliers_MAIN
#endif // app_type_multipliers_TEST
