/*
 * item_attributes_request_all_of_image_link.h
 *
 * &lt;p&gt;&lt;&#x3D; 2000 characters&lt;/p&gt; &lt;p&gt;The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.&lt;/p&gt;
 */

#ifndef _item_attributes_request_all_of_image_link_H_
#define _item_attributes_request_all_of_image_link_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_attributes_request_all_of_image_link_t item_attributes_request_all_of_image_link_t;




typedef struct item_attributes_request_all_of_image_link_t {

} item_attributes_request_all_of_image_link_t;

item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_create(
);

void item_attributes_request_all_of_image_link_free(item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link);

item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link_parseFromJSON(cJSON *item_attributes_request_all_of_image_linkJSON);

cJSON *item_attributes_request_all_of_image_link_convertToJSON(item_attributes_request_all_of_image_link_t *item_attributes_request_all_of_image_link);

#endif /* _item_attributes_request_all_of_image_link_H_ */

