/*
 * invite_assets_summary_item.h
 *
 * 
 */

#ifndef _invite_assets_summary_item_H_
#define _invite_assets_summary_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct invite_assets_summary_item_t invite_assets_summary_item_t;




typedef struct invite_assets_summary_item_t {
    char *id; // string
    list_t *permissions; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} invite_assets_summary_item_t;

__attribute__((deprecated)) invite_assets_summary_item_t *invite_assets_summary_item_create(
    char *id,
    list_t *permissions
);

void invite_assets_summary_item_free(invite_assets_summary_item_t *invite_assets_summary_item);

invite_assets_summary_item_t *invite_assets_summary_item_parseFromJSON(cJSON *invite_assets_summary_itemJSON);

cJSON *invite_assets_summary_item_convertToJSON(invite_assets_summary_item_t *invite_assets_summary_item);

#endif /* _invite_assets_summary_item_H_ */

