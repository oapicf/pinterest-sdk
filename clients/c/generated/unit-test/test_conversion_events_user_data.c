#ifndef conversion_events_user_data_TEST
#define conversion_events_user_data_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define conversion_events_user_data_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/conversion_events_user_data.h"
conversion_events_user_data_t* instantiate_conversion_events_user_data(int include_optional);



conversion_events_user_data_t* instantiate_conversion_events_user_data(int include_optional) {
  conversion_events_user_data_t* conversion_events_user_data = NULL;
  if (include_optional) {
    conversion_events_user_data = conversion_events_user_data_create(
      ["45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d"],
      ["0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf"],
      ["d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739"],
      ["7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19"],
      ["ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2"],
      ["4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36"],
      ["49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34"],
      ["fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145"],
      ["9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d"],
      ["6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee"],
      "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv",
      "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc",
      [411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969],
      [0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46],
      "216.3.128.12",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    );
  } else {
    conversion_events_user_data = conversion_events_user_data_create(
      ["45df139772a81b6011bdc1c9cc3d1cb408fc0b10ec0c5cb9d4d4e107f0ddc49d"],
      ["0d248e82c62c9386878327d491c762a002152d42ab2c391a31c44d9f62675ddf"],
      ["d4426a0086d10f12ad265539ae8d54221dc67786053d511407204b76e99d7739"],
      ["7e546b3aa43f989dd359672e6c3409d4f9d4e8f155ae1e9b90ee060985468c19"],
      ["ec1e6a072231703f1bc41429052fff8c00a7e0c6aaec2e7107241ca8f3ceb6b2"],
      ["4ac01a129bfd10385c9278c2cf2c46fac5ab57350841234f587c8522a2e4ce36"],
      ["49a6d05b8e4b516656e464271d9dd38d0a7e0142f7f49546f4dabd2720cafc34"],
      ["fd5f56b40a79a385708428e7b32ab996a681080a166a2206e750eb4819186145"],
      ["9b202ecbc6d45c6d8901d989a918878397a3eb9d00e8f48022fc051b19d21a1d"],
      ["6a7a73766627eb611720883d5a11cc62b5bfee237b00a6658d78c50032ec4aee"],
      "dj0yJnU9b2JDcFFHekV4SHJNcmVrbFBkUEdqakh0akdUT1VjVVUmcD0yJm49cnNBQ3F2Q2dOVDBXWWhkWklrUGxBUSZ0PUFBQUFBR1BaY3Bv",
      "BUJrTlRRzGJmWhRXFZdkioV6wKPBve7Lom__GU9J74hq2NIQj4O3nOZJrp3mcUr5MptkXsI14juMOIM9mNZnM4zEUFT2JLVaFhcOfuuWz3IWEDtBf6I0DPc",
      [411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8, 09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969],
      [0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1, 837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46],
      "216.3.128.12",
      "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36"
    );
  }

  return conversion_events_user_data;
}


#ifdef conversion_events_user_data_MAIN

void test_conversion_events_user_data(int include_optional) {
    conversion_events_user_data_t* conversion_events_user_data_1 = instantiate_conversion_events_user_data(include_optional);

	cJSON* jsonconversion_events_user_data_1 = conversion_events_user_data_convertToJSON(conversion_events_user_data_1);
	printf("conversion_events_user_data :\n%s\n", cJSON_Print(jsonconversion_events_user_data_1));
	conversion_events_user_data_t* conversion_events_user_data_2 = conversion_events_user_data_parseFromJSON(jsonconversion_events_user_data_1);
	cJSON* jsonconversion_events_user_data_2 = conversion_events_user_data_convertToJSON(conversion_events_user_data_2);
	printf("repeating conversion_events_user_data:\n%s\n", cJSON_Print(jsonconversion_events_user_data_2));
}

int main() {
  test_conversion_events_user_data(1);
  test_conversion_events_user_data(0);

  printf("Hello world \n");
  return 0;
}

#endif // conversion_events_user_data_MAIN
#endif // conversion_events_user_data_TEST
