#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/pinterest_lib_error.h"
#include "../model/product_tags_bulk_add_request.h"
#include "../model/product_tags_bulk_delete_request.h"
#include "../model/product_tags_error.h"
#include "../model/product_tags_response.h"


// Add product tags to pin
//
// Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.
//
product_tags_response_t*
ProductTagsAPI_productTagsBulkAdd(apiClient_t *apiClient, char *pin_id, product_tags_bulk_add_request_t *product_tags_bulk_add_request);


// Delete product tags from pin
//
// Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.
//
void
ProductTagsAPI_productTagsBulkDelete(apiClient_t *apiClient, char *pin_id, product_tags_bulk_delete_request_t *product_tags_bulk_delete_request);


// Get product tags for pin
//
// Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.
//
product_tags_response_t*
ProductTagsAPI_productTagsList(apiClient_t *apiClient, char *pin_id);


