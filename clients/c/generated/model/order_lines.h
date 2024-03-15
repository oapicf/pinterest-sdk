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

} order_lines_t;

order_lines_t *order_lines_create(
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
    order_line_paid_type_t *paid_type
);

void order_lines_free(order_lines_t *order_lines);

order_lines_t *order_lines_parseFromJSON(cJSON *order_linesJSON);

cJSON *order_lines_convertToJSON(order_lines_t *order_lines);

#endif /* _order_lines_H_ */

