/*
 * website_verification_method.h
 *
 * Method used to verify website ownership.
 */

#ifndef _website_verification_method_H_
#define _website_verification_method_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct website_verification_method_t website_verification_method_t;


// Enum  for website_verification_method

typedef enum { pinterest_rest_api_website_verification_method__NULL = 0, pinterest_rest_api_website_verification_method__FILENAME, pinterest_rest_api_website_verification_method__METATAG, pinterest_rest_api_website_verification_method__DNSTXT } pinterest_rest_api_website_verification_method__e;

char* website_verification_method_website_verification_method_ToString(pinterest_rest_api_website_verification_method__e website_verification_method);

pinterest_rest_api_website_verification_method__e website_verification_method_website_verification_method_FromString(char* website_verification_method);

cJSON *website_verification_method_convertToJSON(pinterest_rest_api_website_verification_method__e website_verification_method);

pinterest_rest_api_website_verification_method__e website_verification_method_parseFromJSON(cJSON *website_verification_methodJSON);

#endif /* _website_verification_method_H_ */

