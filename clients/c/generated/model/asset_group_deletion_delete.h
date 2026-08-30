/*
 * asset_group_deletion_delete.h
 *
 * 
 */

#ifndef _asset_group_deletion_delete_H_
#define _asset_group_deletion_delete_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct asset_group_deletion_delete_t asset_group_deletion_delete_t;




typedef struct asset_group_deletion_delete_t {
    list_t *asset_groups_to_delete; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} asset_group_deletion_delete_t;

__attribute__((deprecated)) asset_group_deletion_delete_t *asset_group_deletion_delete_create(
    list_t *asset_groups_to_delete
);

void asset_group_deletion_delete_free(asset_group_deletion_delete_t *asset_group_deletion_delete);

asset_group_deletion_delete_t *asset_group_deletion_delete_parseFromJSON(cJSON *asset_group_deletion_deleteJSON);

cJSON *asset_group_deletion_delete_convertToJSON(asset_group_deletion_delete_t *asset_group_deletion_delete);

#endif /* _asset_group_deletion_delete_H_ */

