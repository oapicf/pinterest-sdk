/*
 * campaign_id.h
 *
 * 
 */

#ifndef _campaign_id_H_
#define _campaign_id_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct campaign_id_t campaign_id_t;




typedef struct campaign_id_t {
    char *id; // string

} campaign_id_t;

campaign_id_t *campaign_id_create(
    char *id
);

void campaign_id_free(campaign_id_t *campaign_id);

campaign_id_t *campaign_id_parseFromJSON(cJSON *campaign_idJSON);

cJSON *campaign_id_convertToJSON(campaign_id_t *campaign_id);

#endif /* _campaign_id_H_ */

