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
    char *ad_account_id; // string
    double *budget; //numeric
    list_t *campaign_ids; //primitive container
    double *end_time; //numeric
    char *id; // string
    char *name; // string
    double *paid_budget; //numeric
    order_line_paid_type_t *paid_type; // custom
    char *purchase_order_id; // string
    double *start_time; //numeric
    order_line_status_t *status; // custom
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} order_line_t;

__attribute__((deprecated)) order_line_t *order_line_create(
    char *ad_account_id,
    double *budget,
    list_t *campaign_ids,
    double *end_time,
    char *id,
    char *name,
    double *paid_budget,
    order_line_paid_type_t *paid_type,
    char *purchase_order_id,
    double *start_time,
    order_line_status_t *status,
    char *type
);

void order_line_free(order_line_t *order_line);

order_line_t *order_line_parseFromJSON(cJSON *order_lineJSON);

cJSON *order_line_convertToJSON(order_line_t *order_line);

#endif /* _order_line_H_ */

