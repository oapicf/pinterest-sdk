#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_policy_link.h"



static lead_form_policy_link_t *lead_form_policy_link_create_internal(
    char *label,
    char *link
    ) {
    lead_form_policy_link_t *lead_form_policy_link_local_var = malloc(sizeof(lead_form_policy_link_t));
    if (!lead_form_policy_link_local_var) {
        return NULL;
    }
    memset(lead_form_policy_link_local_var, 0, sizeof(lead_form_policy_link_t));
    lead_form_policy_link_local_var->_library_owned = 1;
    lead_form_policy_link_local_var->label = label;
    lead_form_policy_link_local_var->link = link;
    return lead_form_policy_link_local_var;
}

__attribute__((deprecated)) lead_form_policy_link_t *lead_form_policy_link_create(
    char *label,
    char *link
    ) {
    lead_form_policy_link_t *result = lead_form_policy_link_create_internal (
        label,
        link
        );
    if (!result) {
    }
    return result;
}

void lead_form_policy_link_free(lead_form_policy_link_t *lead_form_policy_link) {
    if(NULL == lead_form_policy_link){
        return ;
    }
    if(lead_form_policy_link->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "lead_form_policy_link_free");
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_policy_link->label) {
        free(lead_form_policy_link->label);
        lead_form_policy_link->label = NULL;
    }
    if (lead_form_policy_link->link) {
        free(lead_form_policy_link->link);
        lead_form_policy_link->link = NULL;
    }
    free(lead_form_policy_link);
}

cJSON *lead_form_policy_link_convertToJSON(lead_form_policy_link_t *lead_form_policy_link) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_policy_link->label
    if(lead_form_policy_link->label) {
    if(cJSON_AddStringToObject(item, "label", lead_form_policy_link->label) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_policy_link->link
    if(lead_form_policy_link->link) {
    if(cJSON_AddStringToObject(item, "link", lead_form_policy_link->link) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

lead_form_policy_link_t *lead_form_policy_link_parseFromJSON(cJSON *lead_form_policy_linkJSON){

    lead_form_policy_link_t *lead_form_policy_link_local_var = NULL;

    char *label_local_str = NULL;

    char *link_local_str = NULL;

    // lead_form_policy_link->label
    cJSON *label = cJSON_GetObjectItemCaseSensitive(lead_form_policy_linkJSON, "label");
    if (cJSON_IsNull(label)) {
        label = NULL;
    }
    if (label) { 
    if(!cJSON_IsString(label) && !cJSON_IsNull(label))
    {
    goto end; //String
    }
    }

    // lead_form_policy_link->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(lead_form_policy_linkJSON, "link");
    if (cJSON_IsNull(link)) {
        link = NULL;
    }
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }


    if (label && !cJSON_IsNull(label)) label_local_str = strdup(label->valuestring);
    if (link && !cJSON_IsNull(link)) link_local_str = strdup(link->valuestring);

    lead_form_policy_link_local_var = lead_form_policy_link_create_internal (
        label_local_str,
        link_local_str
        );

    if (!lead_form_policy_link_local_var) {
        goto end;
    }

    return lead_form_policy_link_local_var;
end:
    if (label_local_str) {
        free(label_local_str);
        label_local_str = NULL;
    }
    if (link_local_str) {
        free(link_local_str);
        link_local_str = NULL;
    }
    return NULL;

}
