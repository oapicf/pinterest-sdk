/*
 * order_line.h
 *
 * 
 */

#ifndef _order_line_H_
#define _order_line_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_line_t order_line_t;

#include "order_line_paid_type.h"
#include "order_line_status.h"



typedef struct order_line_t {
    char *id; // string
    char *type; // string
    char *ad_account_id; // string
    char *purchase_order_id; // string
    double start_time; //numeric
    double end_time; //numeric
    double budget; //numeric
    double paid_budget; //numeric
    order_line_status_t *status; // custom
    char *name; // string
    order_line_paid_type_t *paid_type; // custom
    list_t *campaign_ids; //primitive container

} order_line_t;

order_line_t *order_line_create(
    char *id,
    char *type,
    char *ad_account_id,
    char *purchase_order_id,
    double start_time,
    double end_time,
    double budget,
    double paid_budget,
    order_line_status_t *status,
    char *name,
    order_line_paid_type_t *paid_type,
    list_t *campaign_ids
);

void order_line_free(order_line_t *order_line);

order_line_t *order_line_parseFromJSON(cJSON *order_lineJSON);

cJSON *order_line_convertToJSON(order_line_t *order_line);

#endif /* _order_line_H_ */

