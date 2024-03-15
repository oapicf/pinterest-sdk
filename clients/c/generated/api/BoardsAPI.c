#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "BoardsAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum PRIVACY for BoardsAPI_boardsList

static char* boardsList_PRIVACY_ToString(pinterest_rest_api_boardsList_privacy_e PRIVACY){
    char *PRIVACYArray[] =  { "NULL", "ALL", "PROTECTED", "PUBLIC", "SECRET", "PUBLIC_AND_SECRET" };
    return PRIVACYArray[PRIVACY];
}

static pinterest_rest_api_boardsList_privacy_e boardsList_PRIVACY_FromString(char* PRIVACY){
    int stringToReturn = 0;
    char *PRIVACYArray[] =  { "NULL", "ALL", "PROTECTED", "PUBLIC", "SECRET", "PUBLIC_AND_SECRET" };
    size_t sizeofArray = sizeof(PRIVACYArray) / sizeof(PRIVACYArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(PRIVACY, PRIVACYArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function boardsList_PRIVACY_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *boardsList_PRIVACY_convertToJSON(pinterest_rest_api_boardsList_privacy_e PRIVACY) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "privacy", boardsList_PRIVACY_ToString(PRIVACY)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function boardsList_PRIVACY_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_boardsList_privacy_e boardsList_PRIVACY_parseFromJSON(cJSON* PRIVACYJSON) {
    pinterest_rest_api_boardsList_privacy_e PRIVACYVariable = 0;
    cJSON *PRIVACYVar = cJSON_GetObjectItemCaseSensitive(PRIVACYJSON, "privacy");
    if(!cJSON_IsString(PRIVACYVar) || (PRIVACYVar->valuestring == NULL))
    {
        goto end;
    }
    PRIVACYVariable = boardsList_PRIVACY_FromString(PRIVACYVar->valuestring);
    return PRIVACYVariable;
end:
    return 0;
}
*/

// Functions for enum CREATIVETYPES for BoardsAPI_boardsListPins

static char* boardsListPins_CREATIVETYPES_ToString(pinterest_rest_api_boardsListPins_creative_types_e CREATIVETYPES){
    char *CREATIVETYPESArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    return CREATIVETYPESArray[CREATIVETYPES];
}

static pinterest_rest_api_boardsListPins_creative_types_e boardsListPins_CREATIVETYPES_FromString(char* CREATIVETYPES){
    int stringToReturn = 0;
    char *CREATIVETYPESArray[] =  { "NULL", "REGULAR", "VIDEO", "SHOPPING", "CAROUSEL", "MAX_VIDEO", "SHOP_THE_PIN", "COLLECTION", "IDEA" };
    size_t sizeofArray = sizeof(CREATIVETYPESArray) / sizeof(CREATIVETYPESArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(CREATIVETYPES, CREATIVETYPESArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function boardsListPins_CREATIVETYPES_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *boardsListPins_CREATIVETYPES_convertToJSON(pinterest_rest_api_boardsListPins_creative_types_e CREATIVETYPES) {
    cJSON *item = cJSON_CreateObject();
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function boardsListPins_CREATIVETYPES_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static pinterest_rest_api_boardsListPins_creative_types_e boardsListPins_CREATIVETYPES_parseFromJSON(cJSON* CREATIVETYPESJSON) {
    pinterest_rest_api_boardsListPins_creative_types_e CREATIVETYPESVariable = 0;
    return CREATIVETYPESVariable;
end:
    return 0;
}
*/


// Create board section
//
// Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t*
BoardsAPI_boardSectionsCreate(apiClient_t *apiClient, char *board_id, board_section_t *board_section, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/sections")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/sections");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_board_section = NULL;
    if (board_section != NULL)
    {
        //string
        localVarSingleItemJSON_board_section = board_section_convertToJSON(board_section);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_board_section);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid board section parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to create board sections.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Could not get exclusive access to the board to create a new section.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 500) {
    //    printf("%s\n","Could not create a new board section.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_section_t *elementToReturn = board_section_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_board_id);
    if (localVarSingleItemJSON_board_section) {
        cJSON_Delete(localVarSingleItemJSON_board_section);
        localVarSingleItemJSON_board_section = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete board section
//
// Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void
BoardsAPI_boardSectionsDelete(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/sections/{section_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/sections/{section_id}");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);

    // Path Params
    long sizeOfPathParams_section_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ section_id }");
    if(section_id == NULL) {
        goto end;
    }
    char* localVarToReplace_section_id = malloc(sizeOfPathParams_section_id);
    sprintf(localVarToReplace_section_id, "{%s}", "section_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_section_id, section_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Board section deleted successfully");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to delete board section.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board section not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Board section conflict.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    free(localVarToReplace_section_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }

}

// List board sections
//
// Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_sections_list_200_response_t*
BoardsAPI_boardSectionsList(apiClient_t *apiClient, char *board_id, char *ad_account_id, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/sections")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/sections");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_sections_list_200_response_t *elementToReturn = board_sections_list_200_response_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List Pins on board section
//
// Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t*
BoardsAPI_boardSectionsListPins(apiClient_t *apiClient, char *board_id, char *section_id, char *ad_account_id, char *bookmark, int *page_size)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/sections/{section_id}/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/sections/{section_id}/pins");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);

    // Path Params
    long sizeOfPathParams_section_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ section_id }");
    if(section_id == NULL) {
        goto end;
    }
    char* localVarToReplace_section_id = malloc(sizeOfPathParams_section_id);
    sprintf(localVarToReplace_section_id, "{%s}", "section_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_section_id, section_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to access Pins on board section.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board or section not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Board section conflict.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    boards_list_pins_200_response_t *elementToReturn = boards_list_pins_200_response_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    free(localVarToReplace_section_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update board section
//
// Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_section_t*
BoardsAPI_boardSectionsUpdate(apiClient_t *apiClient, char *board_id, char *section_id, board_section_t *board_section, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/sections/{section_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/sections/{section_id}");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);

    // Path Params
    long sizeOfPathParams_section_id = strlen(board_id)+3 + strlen(section_id)+3 + strlen("{ section_id }");
    if(section_id == NULL) {
        goto end;
    }
    char* localVarToReplace_section_id = malloc(sizeOfPathParams_section_id);
    sprintf(localVarToReplace_section_id, "{%s}", "section_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_section_id, section_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_board_section = NULL;
    if (board_section != NULL)
    {
        //string
        localVarSingleItemJSON_board_section = board_section_convertToJSON(board_section);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_board_section);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid board section parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to update board section.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Board section conflict.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_section_t *elementToReturn = board_section_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_board_id);
    free(localVarToReplace_section_id);
    if (localVarSingleItemJSON_board_section) {
        cJSON_Delete(localVarSingleItemJSON_board_section);
        localVarSingleItemJSON_board_section = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Create board
//
// Create a board owned by the \"operation user_account\". Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsCreate(apiClient_t *apiClient, board_t *board, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_board = NULL;
    if (board != NULL)
    {
        //string
        localVarSingleItemJSON_board = board_convertToJSON(board);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_board);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 201) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","The board name is invalid or duplicated.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_t *elementToReturn = board_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    if (localVarSingleItemJSON_board) {
        cJSON_Delete(localVarSingleItemJSON_board);
        localVarSingleItemJSON_board = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Delete board
//
// Delete a board owned by the \"operation user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
void
BoardsAPI_boardsDelete(apiClient_t *apiClient, char *board_id, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "DELETE");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 204) {
    //    printf("%s\n","Board deleted successfully");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to delete the board.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 409) {
    //    printf("%s\n","Could not get exclusive access to delete the board.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //No return type
end:
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }

}

// Get board
//
// Get a board owned by the operation user_account - or a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsGet(apiClient_t *apiClient, char *board_id, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_t *elementToReturn = board_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List boards
//
// Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.
//
boards_list_200_response_t*
BoardsAPI_boardsList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size, pinterest_rest_api_boardsList_privacy_e privacy)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards");




    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    char *keyQuery_privacy = NULL;
    pinterest_rest_api_boardsList_privacy_e valueQuery_privacy ;
    keyValuePair_t *keyPairQuery_privacy = 0;
    if (privacy)
    {
        keyQuery_privacy = strdup("privacy");
        valueQuery_privacy = (privacy);
        keyPairQuery_privacy = keyValuePair_create(keyQuery_privacy, (void *)strdup(boardsList_PRIVACY_ToString(
        valueQuery_privacy)));
        list_addElement(localVarQueryParameters,keyPairQuery_privacy);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    boards_list_200_response_t *elementToReturn = boards_list_200_response_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_privacy){
        free(keyQuery_privacy);
        keyQuery_privacy = NULL;
    }
    if(keyPairQuery_privacy){
        keyValuePair_free(keyPairQuery_privacy);
        keyPairQuery_privacy = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// List Pins on board
//
// Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
boards_list_pins_200_response_t*
BoardsAPI_boardsListPins(apiClient_t *apiClient, char *board_id, char *bookmark, int *page_size, list_t *creative_types, char *ad_account_id, int *pin_metrics)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}/pins")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}/pins");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_bookmark = NULL;
    char * valueQuery_bookmark = NULL;
    keyValuePair_t *keyPairQuery_bookmark = 0;
    if (bookmark)
    {
        keyQuery_bookmark = strdup("bookmark");
        valueQuery_bookmark = strdup((bookmark));
        keyPairQuery_bookmark = keyValuePair_create(keyQuery_bookmark, valueQuery_bookmark);
        list_addElement(localVarQueryParameters,keyPairQuery_bookmark);
    }

    // query parameters
    char *keyQuery_page_size = NULL;
    char * valueQuery_page_size = NULL;
    keyValuePair_t *keyPairQuery_page_size = 0;
    if (page_size)
    {
        keyQuery_page_size = strdup("page_size");
        valueQuery_page_size = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_page_size, MAX_NUMBER_LENGTH, "%d", *page_size);
        keyPairQuery_page_size = keyValuePair_create(keyQuery_page_size, valueQuery_page_size);
        list_addElement(localVarQueryParameters,keyPairQuery_page_size);
    }

    // query parameters
    if (creative_types)
    {
        list_addElement(localVarQueryParameters,creative_types);
    }

    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // query parameters
    char *keyQuery_pin_metrics = NULL;
    char * valueQuery_pin_metrics = NULL;
    keyValuePair_t *keyPairQuery_pin_metrics = 0;
    if (pin_metrics)
    {
        keyQuery_pin_metrics = strdup("pin_metrics");
        valueQuery_pin_metrics = calloc(1,MAX_NUMBER_LENGTH);
        snprintf(valueQuery_pin_metrics, MAX_NUMBER_LENGTH, "%d", *pin_metrics);
        keyPairQuery_pin_metrics = keyValuePair_create(keyQuery_pin_metrics, valueQuery_pin_metrics);
        list_addElement(localVarQueryParameters,keyPairQuery_pin_metrics);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 404) {
    //    printf("%s\n","Board not found.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    boards_list_pins_200_response_t *elementToReturn = boards_list_pins_200_response_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_board_id);
    if(keyQuery_bookmark){
        free(keyQuery_bookmark);
        keyQuery_bookmark = NULL;
    }
    if(valueQuery_bookmark){
        free(valueQuery_bookmark);
        valueQuery_bookmark = NULL;
    }
    if(keyPairQuery_bookmark){
        keyValuePair_free(keyPairQuery_bookmark);
        keyPairQuery_bookmark = NULL;
    }
    if(keyQuery_page_size){
        free(keyQuery_page_size);
        keyQuery_page_size = NULL;
    }
    if(valueQuery_page_size){
        free(valueQuery_page_size);
        valueQuery_page_size = NULL;
    }
    if(keyPairQuery_page_size){
        keyValuePair_free(keyPairQuery_page_size);
        keyPairQuery_page_size = NULL;
    }
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    if(keyQuery_pin_metrics){
        free(keyQuery_pin_metrics);
        keyQuery_pin_metrics = NULL;
    }
    if(valueQuery_pin_metrics){
        free(valueQuery_pin_metrics);
        valueQuery_pin_metrics = NULL;
    }
    if(keyPairQuery_pin_metrics){
        keyValuePair_free(keyPairQuery_pin_metrics);
        keyPairQuery_pin_metrics = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

// Update board
//
// Update a board owned by the \"operating user_account\". - Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.
//
board_t*
BoardsAPI_boardsUpdate(apiClient_t *apiClient, char *board_id, board_update_t *board_update, char *ad_account_id)
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = list_createList();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/boards/{board_id}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/boards/{board_id}");


    // Path Params
    long sizeOfPathParams_board_id = strlen(board_id)+3 + strlen("{ board_id }");
    if(board_id == NULL) {
        goto end;
    }
    char* localVarToReplace_board_id = malloc(sizeOfPathParams_board_id);
    sprintf(localVarToReplace_board_id, "{%s}", "board_id");

    localVarPath = strReplace(localVarPath, localVarToReplace_board_id, board_id);



    // query parameters
    char *keyQuery_ad_account_id = NULL;
    char * valueQuery_ad_account_id = NULL;
    keyValuePair_t *keyPairQuery_ad_account_id = 0;
    if (ad_account_id)
    {
        keyQuery_ad_account_id = strdup("ad_account_id");
        valueQuery_ad_account_id = strdup((ad_account_id));
        keyPairQuery_ad_account_id = keyValuePair_create(keyQuery_ad_account_id, valueQuery_ad_account_id);
        list_addElement(localVarQueryParameters,keyPairQuery_ad_account_id);
    }

    // Body Param
    cJSON *localVarSingleItemJSON_board_update = NULL;
    if (board_update != NULL)
    {
        //string
        localVarSingleItemJSON_board_update = board_update_convertToJSON(board_update);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_board_update);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PATCH");

    // uncomment below to debug the error response
    //if (apiClient->response_code == 200) {
    //    printf("%s\n","response");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 400) {
    //    printf("%s\n","Invalid board parameters.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 403) {
    //    printf("%s\n","Not authorized to update the board.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 429) {
    //    printf("%s\n","This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits or if multiple write operations are applied to an object within a short time window.");
    //}
    // uncomment below to debug the error response
    //if (apiClient->response_code == 0) {
    //    printf("%s\n","Unexpected error");
    //}
    //nonprimitive not container
    cJSON *BoardsAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    board_t *elementToReturn = board_parseFromJSON(BoardsAPIlocalVarJSON);
    cJSON_Delete(BoardsAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    list_freeList(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_board_id);
    if (localVarSingleItemJSON_board_update) {
        cJSON_Delete(localVarSingleItemJSON_board_update);
        localVarSingleItemJSON_board_update = NULL;
    }
    free(localVarBodyParameters);
    if(keyQuery_ad_account_id){
        free(keyQuery_ad_account_id);
        keyQuery_ad_account_id = NULL;
    }
    if(valueQuery_ad_account_id){
        free(valueQuery_ad_account_id);
        valueQuery_ad_account_id = NULL;
    }
    if(keyPairQuery_ad_account_id){
        keyValuePair_free(keyPairQuery_ad_account_id);
        keyPairQuery_ad_account_id = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

