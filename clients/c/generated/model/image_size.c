#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "image_size.h"



static image_size_t *image_size_create_internal(
    image_details_t *_1200x,
    image_details_t *_150x150,
    image_details_t *_400x300,
    image_details_t *_600x
    ) {
    image_size_t *image_size_local_var = malloc(sizeof(image_size_t));
    if (!image_size_local_var) {
        return NULL;
    }
    memset(image_size_local_var, 0, sizeof(image_size_t));
    image_size_local_var->_library_owned = 1;
    image_size_local_var->_1200x = _1200x;
    image_size_local_var->_150x150 = _150x150;
    image_size_local_var->_400x300 = _400x300;
    image_size_local_var->_600x = _600x;
    return image_size_local_var;
}

__attribute__((deprecated)) image_size_t *image_size_create(
    image_details_t *_1200x,
    image_details_t *_150x150,
    image_details_t *_400x300,
    image_details_t *_600x
    ) {
    image_size_t *result = image_size_create_internal (
        _1200x,
        _150x150,
        _400x300,
        _600x
        );
    if (!result) {
    }
    return result;
}

void image_size_free(image_size_t *image_size) {
    if(NULL == image_size){
        return ;
    }
    if(image_size->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "image_size_free");
        return ;
    }
    listEntry_t *listEntry;
    if (image_size->_1200x) {
        image_details_free(image_size->_1200x);
        image_size->_1200x = NULL;
    }
    if (image_size->_150x150) {
        image_details_free(image_size->_150x150);
        image_size->_150x150 = NULL;
    }
    if (image_size->_400x300) {
        image_details_free(image_size->_400x300);
        image_size->_400x300 = NULL;
    }
    if (image_size->_600x) {
        image_details_free(image_size->_600x);
        image_size->_600x = NULL;
    }
    free(image_size);
}

cJSON *image_size_convertToJSON(image_size_t *image_size) {
    cJSON *item = cJSON_CreateObject();

    // image_size->_1200x
    if(image_size->_1200x) {
    cJSON *_1200x_local_JSON = image_details_convertToJSON(image_size->_1200x);
    if(_1200x_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "1200x", _1200x_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_size->_150x150
    if(image_size->_150x150) {
    cJSON *_150x150_local_JSON = image_details_convertToJSON(image_size->_150x150);
    if(_150x150_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "150x150", _150x150_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_size->_400x300
    if(image_size->_400x300) {
    cJSON *_400x300_local_JSON = image_details_convertToJSON(image_size->_400x300);
    if(_400x300_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "400x300", _400x300_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }


    // image_size->_600x
    if(image_size->_600x) {
    cJSON *_600x_local_JSON = image_details_convertToJSON(image_size->_600x);
    if(_600x_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "600x", _600x_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

image_size_t *image_size_parseFromJSON(cJSON *image_sizeJSON){

    image_size_t *image_size_local_var = NULL;

    // define the local variable for image_size->_1200x
    image_details_t *_1200x_local_nonprim = NULL;

    // define the local variable for image_size->_150x150
    image_details_t *_150x150_local_nonprim = NULL;

    // define the local variable for image_size->_400x300
    image_details_t *_400x300_local_nonprim = NULL;

    // define the local variable for image_size->_600x
    image_details_t *_600x_local_nonprim = NULL;

    // image_size->_1200x
    cJSON *_1200x = cJSON_GetObjectItemCaseSensitive(image_sizeJSON, "1200x");
    if (cJSON_IsNull(_1200x)) {
        _1200x = NULL;
    }
    if (_1200x) { 
    _1200x_local_nonprim = image_details_parseFromJSON(_1200x); //nonprimitive
    }

    // image_size->_150x150
    cJSON *_150x150 = cJSON_GetObjectItemCaseSensitive(image_sizeJSON, "150x150");
    if (cJSON_IsNull(_150x150)) {
        _150x150 = NULL;
    }
    if (_150x150) { 
    _150x150_local_nonprim = image_details_parseFromJSON(_150x150); //nonprimitive
    }

    // image_size->_400x300
    cJSON *_400x300 = cJSON_GetObjectItemCaseSensitive(image_sizeJSON, "400x300");
    if (cJSON_IsNull(_400x300)) {
        _400x300 = NULL;
    }
    if (_400x300) { 
    _400x300_local_nonprim = image_details_parseFromJSON(_400x300); //nonprimitive
    }

    // image_size->_600x
    cJSON *_600x = cJSON_GetObjectItemCaseSensitive(image_sizeJSON, "600x");
    if (cJSON_IsNull(_600x)) {
        _600x = NULL;
    }
    if (_600x) { 
    _600x_local_nonprim = image_details_parseFromJSON(_600x); //nonprimitive
    }



    image_size_local_var = image_size_create_internal (
        _1200x ? _1200x_local_nonprim : NULL,
        _150x150 ? _150x150_local_nonprim : NULL,
        _400x300 ? _400x300_local_nonprim : NULL,
        _600x ? _600x_local_nonprim : NULL
        );

    if (!image_size_local_var) {
        goto end;
    }

    return image_size_local_var;
end:
    if (_1200x_local_nonprim) {
        image_details_free(_1200x_local_nonprim);
        _1200x_local_nonprim = NULL;
    }
    if (_150x150_local_nonprim) {
        image_details_free(_150x150_local_nonprim);
        _150x150_local_nonprim = NULL;
    }
    if (_400x300_local_nonprim) {
        image_details_free(_400x300_local_nonprim);
        _400x300_local_nonprim = NULL;
    }
    if (_600x_local_nonprim) {
        image_details_free(_600x_local_nonprim);
        _600x_local_nonprim = NULL;
    }
    return NULL;

}
