/*
 * amazon_connect_response.h
 *
 * 
 */

#ifndef _amazon_connect_response_H_
#define _amazon_connect_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct amazon_connect_response_t amazon_connect_response_t;




typedef struct amazon_connect_response_t {
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} amazon_connect_response_t;

__attribute__((deprecated)) amazon_connect_response_t *amazon_connect_response_create(
    char *message
);

void amazon_connect_response_free(amazon_connect_response_t *amazon_connect_response);

amazon_connect_response_t *amazon_connect_response_parseFromJSON(cJSON *amazon_connect_responseJSON);

cJSON *amazon_connect_response_convertToJSON(amazon_connect_response_t *amazon_connect_response);

#endif /* _amazon_connect_response_H_ */

