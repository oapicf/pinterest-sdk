/*
 * advanced_auction_key.h
 *
 * Object uniquely identifying a retail catalog item
 */

#ifndef _advanced_auction_key_H_
#define _advanced_auction_key_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct advanced_auction_key_t advanced_auction_key_t;

#include "country.h"
#include "language.h"



typedef struct advanced_auction_key_t {
    char *item_id; // string
    pinterest_rest_api_country__e country; //referenced enum
    pinterest_rest_api_language__e language; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} advanced_auction_key_t;

__attribute__((deprecated)) advanced_auction_key_t *advanced_auction_key_create(
    char *item_id,
    pinterest_rest_api_country__e country,
    pinterest_rest_api_language__e language
);

void advanced_auction_key_free(advanced_auction_key_t *advanced_auction_key);

advanced_auction_key_t *advanced_auction_key_parseFromJSON(cJSON *advanced_auction_keyJSON);

cJSON *advanced_auction_key_convertToJSON(advanced_auction_key_t *advanced_auction_key);

#endif /* _advanced_auction_key_H_ */

