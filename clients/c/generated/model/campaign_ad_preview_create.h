/*
 * campaign_ad_preview_create.h
 *
 * Resource create operation model.
 */

#ifndef _campaign_ad_preview_create_H_
#define _campaign_ad_preview_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_ad_preview_create_t campaign_ad_preview_create_t;




typedef struct campaign_ad_preview_create_t {
    char *ad_group_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} campaign_ad_preview_create_t;

__attribute__((deprecated)) campaign_ad_preview_create_t *campaign_ad_preview_create_create(
    char *ad_group_id
);

void campaign_ad_preview_create_free(campaign_ad_preview_create_t *campaign_ad_preview_create);

campaign_ad_preview_create_t *campaign_ad_preview_create_parseFromJSON(cJSON *campaign_ad_preview_createJSON);

cJSON *campaign_ad_preview_create_convertToJSON(campaign_ad_preview_create_t *campaign_ad_preview_create);

#endif /* _campaign_ad_preview_create_H_ */

