#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "lead_form_common_policy_links_inner.h"



lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_create(
    char *label,
    char *link
    ) {
    lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_local_var = malloc(sizeof(lead_form_common_policy_links_inner_t));
    if (!lead_form_common_policy_links_inner_local_var) {
        return NULL;
    }
    lead_form_common_policy_links_inner_local_var->label = label;
    lead_form_common_policy_links_inner_local_var->link = link;

    return lead_form_common_policy_links_inner_local_var;
}


void lead_form_common_policy_links_inner_free(lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner) {
    if(NULL == lead_form_common_policy_links_inner){
        return ;
    }
    listEntry_t *listEntry;
    if (lead_form_common_policy_links_inner->label) {
        free(lead_form_common_policy_links_inner->label);
        lead_form_common_policy_links_inner->label = NULL;
    }
    if (lead_form_common_policy_links_inner->link) {
        free(lead_form_common_policy_links_inner->link);
        lead_form_common_policy_links_inner->link = NULL;
    }
    free(lead_form_common_policy_links_inner);
}

cJSON *lead_form_common_policy_links_inner_convertToJSON(lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner) {
    cJSON *item = cJSON_CreateObject();

    // lead_form_common_policy_links_inner->label
    if(lead_form_common_policy_links_inner->label) {
    if(cJSON_AddStringToObject(item, "label", lead_form_common_policy_links_inner->label) == NULL) {
    goto fail; //String
    }
    }


    // lead_form_common_policy_links_inner->link
    if(lead_form_common_policy_links_inner->link) {
    if(cJSON_AddStringToObject(item, "link", lead_form_common_policy_links_inner->link) == NULL) {
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

lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_parseFromJSON(cJSON *lead_form_common_policy_links_innerJSON){

    lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_local_var = NULL;

    // lead_form_common_policy_links_inner->label
    cJSON *label = cJSON_GetObjectItemCaseSensitive(lead_form_common_policy_links_innerJSON, "label");
    if (label) { 
    if(!cJSON_IsString(label) && !cJSON_IsNull(label))
    {
    goto end; //String
    }
    }

    // lead_form_common_policy_links_inner->link
    cJSON *link = cJSON_GetObjectItemCaseSensitive(lead_form_common_policy_links_innerJSON, "link");
    if (link) { 
    if(!cJSON_IsString(link) && !cJSON_IsNull(link))
    {
    goto end; //String
    }
    }


    lead_form_common_policy_links_inner_local_var = lead_form_common_policy_links_inner_create (
        label && !cJSON_IsNull(label) ? strdup(label->valuestring) : NULL,
        link && !cJSON_IsNull(link) ? strdup(link->valuestring) : NULL
        );

    return lead_form_common_policy_links_inner_local_var;
end:
    return NULL;

}
