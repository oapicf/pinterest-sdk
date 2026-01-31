/*
 * order_lines.h
 *
 * Order Line
 */

#ifndef _order_lines_H_
#define _order_lines_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct order_lines_t order_lines_t;

#include "order_line_paid_type.h"
#include "order_line_status.h"



typedef struct order_lines_t {
    char *ad_account_id; // string
    double budget; //numeric
    double end_time; //numeric
    char *id; // string
    char *name; // string
    double paid_budget; //numeric
    order_line_paid_type_t *paid_type; // custom
    char *purchase_order_id; // string
    double start_time; //numeric
    order_line_status_t *status; // custom
    char *type; // string

    int _library_owned; // Is the library responsible for freeing this object?
} order_lines_t;

__attribute__((deprecated)) order_lines_t *order_lines_create(
    char *ad_account_id,
    double budget,
    double end_time,
    char *id,
    char *name,
    double paid_budget,
    order_line_paid_type_t *paid_type,
    char *purchase_order_id,
    double start_time,
    order_line_status_t *status,
    char *type
);

void order_lines_free(order_lines_t *order_lines);

order_lines_t *order_lines_parseFromJSON(cJSON *order_linesJSON);

cJSON *order_lines_convertToJSON(order_lines_t *order_lines);

#endif /* _order_lines_H_ */

