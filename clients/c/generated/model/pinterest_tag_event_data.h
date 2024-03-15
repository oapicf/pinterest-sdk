/*
 * pinterest_tag_event_data.h
 *
 * Optional for VISITOR &#x60;audience_type&#x60;. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’s &#x60;rule&#x60;; however, you **must** specify an &#x60;event&#x60; for the &#x60;event_data&#x60; fields to be evaluated. Besides what’s listed, you can also create your own set of &#x60;event_data&#x60; fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields&#39; data.&lt;br&gt;Examples per &#x60;event&#x60; type:&lt;br&gt;&#x60;pagevisit&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;page_name\&quot;: \&quot;My online store 123 | view items | shoe\&quot; }&lt;br&gt;&#x60;signup&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;New release promotion\&quot; }&lt;br&gt;&#x60;checkout&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 116, \&quot;order_quantity\&quot;: 2, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Pillows (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;11\&quot;, \&quot;product_price\&quot;: 48, \&quot;product_quantity\&quot;: 1 }, { \&quot;product_name\&quot;: \&quot;Pillows, Large (Set of 2)\&quot;, \&quot;product_id\&quot;: \&quot;15\&quot;, \&quot;product_price\&quot;: 68, \&quot;product_quantity\&quot;: 1 } ] }&lt;br&gt;&#x60;addtocart&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;value\&quot;: 499, \&quot;order_quantity\&quot;: 1, \&quot;currency\&quot;: \&quot;USD\&quot;, \&quot;line_items\&quot;: [ { \&quot;product_name\&quot;: \&quot;Red leather boots\&quot;, \&quot;product_id\&quot;: \&quot;3486\&quot;, \&quot;product_category\&quot;: \&quot;shoe\&quot;, \&quot;product_variant_id\&quot;: \&quot;JB11103000\&quot;, \&quot;product_price\&quot;: 499, \&quot;product_quantity\&quot;: \&quot;1\&quot;, \&quot;product_brand\&quot;: \&quot;My brand\&quot; }]}&lt;br&gt;&#x60;watchvideo&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;video_title\&quot;: \&quot;My Product Video 01\&quot; }&lt;br&gt;&#x60;lead&#x60;&lt;br&gt;\&quot;event_data\&quot;: { \&quot;lead_type\&quot;: \&quot;Newsletter\&quot; }
 */

#ifndef _pinterest_tag_event_data_H_
#define _pinterest_tag_event_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pinterest_tag_event_data_t pinterest_tag_event_data_t;

#include "currency.h"
#include "line_item.h"

// Enum  for pinterest_tag_event_data

typedef enum  { pinterest_rest_api_pinterest_tag_event_data__NULL = 0, pinterest_rest_api_pinterest_tag_event_data__UNK, pinterest_rest_api_pinterest_tag_event_data__USD, pinterest_rest_api_pinterest_tag_event_data__GBP, pinterest_rest_api_pinterest_tag_event_data__CAD, pinterest_rest_api_pinterest_tag_event_data__EUR, pinterest_rest_api_pinterest_tag_event_data__AUD, pinterest_rest_api_pinterest_tag_event_data__NZD, pinterest_rest_api_pinterest_tag_event_data__SEK, pinterest_rest_api_pinterest_tag_event_data__ILS, pinterest_rest_api_pinterest_tag_event_data__CHF, pinterest_rest_api_pinterest_tag_event_data__HKD, pinterest_rest_api_pinterest_tag_event_data__JPY, pinterest_rest_api_pinterest_tag_event_data__SGD, pinterest_rest_api_pinterest_tag_event_data__KRW, pinterest_rest_api_pinterest_tag_event_data__NOK, pinterest_rest_api_pinterest_tag_event_data__DKK, pinterest_rest_api_pinterest_tag_event_data__PLN, pinterest_rest_api_pinterest_tag_event_data__RON, pinterest_rest_api_pinterest_tag_event_data__HUF, pinterest_rest_api_pinterest_tag_event_data__CZK, pinterest_rest_api_pinterest_tag_event_data__BRL, pinterest_rest_api_pinterest_tag_event_data__MXN, pinterest_rest_api_pinterest_tag_event_data__ARS, pinterest_rest_api_pinterest_tag_event_data__CLP, pinterest_rest_api_pinterest_tag_event_data__COP } pinterest_rest_api_pinterest_tag_event_data__e;

char* pinterest_tag_event_data_currency_ToString(pinterest_rest_api_pinterest_tag_event_data__e currency);

pinterest_rest_api_pinterest_tag_event_data__e pinterest_tag_event_data_currency_FromString(char* currency);



typedef struct pinterest_tag_event_data_t {
    currency_t *currency; // custom
    char *lead_type; // string
    struct line_item_t *line_items; //model
    char *order_id; // string
    int order_quantity; //numeric
    char *page_name; // string
    char *promo_code; // string
    char *property; // string
    char *search_query; // string
    char *value; // string
    char *video_title; // string

} pinterest_tag_event_data_t;

pinterest_tag_event_data_t *pinterest_tag_event_data_create(
    currency_t *currency,
    char *lead_type,
    line_item_t *line_items,
    char *order_id,
    int order_quantity,
    char *page_name,
    char *promo_code,
    char *property,
    char *search_query,
    char *value,
    char *video_title
);

void pinterest_tag_event_data_free(pinterest_tag_event_data_t *pinterest_tag_event_data);

pinterest_tag_event_data_t *pinterest_tag_event_data_parseFromJSON(cJSON *pinterest_tag_event_dataJSON);

cJSON *pinterest_tag_event_data_convertToJSON(pinterest_tag_event_data_t *pinterest_tag_event_data);

#endif /* _pinterest_tag_event_data_H_ */

