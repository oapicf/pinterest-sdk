#' Create a new UpdateAssetGroupBody
#'
#' @description
#' UpdateAssetGroupBody Class
#'
#' @docType class
#' @title UpdateAssetGroupBody
#' @description UpdateAssetGroupBody Class
#' @format An \code{R6Class} generator object
#' @field asset_groups_to_update A list of asset groups and the data that will be used to update them. list(\link{UpdateAssetGroupBodyAssetGroupsToUpdateInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateAssetGroupBody <- R6::R6Class(
  "UpdateAssetGroupBody",
  public = list(
    `asset_groups_to_update` = NULL,

    #' @description
    #' Initialize a new UpdateAssetGroupBody class.
    #'
    #' @param asset_groups_to_update A list of asset groups and the data that will be used to update them.
    #' @param ... Other optional arguments.
    initialize = function(`asset_groups_to_update` = NULL, ...) {
      if (!is.null(`asset_groups_to_update`)) {
        stopifnot(is.vector(`asset_groups_to_update`), length(`asset_groups_to_update`) != 0)
        sapply(`asset_groups_to_update`, function(x) stopifnot(R6::is.R6(x)))
        self$`asset_groups_to_update` <- `asset_groups_to_update`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupBody in JSON format
    toJSON = function() {
      UpdateAssetGroupBodyObject <- list()
      if (!is.null(self$`asset_groups_to_update`)) {
        UpdateAssetGroupBodyObject[["asset_groups_to_update"]] <-
          lapply(self$`asset_groups_to_update`, function(x) x$toJSON())
      }
      UpdateAssetGroupBodyObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupBody
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_groups_to_update`)) {
        self$`asset_groups_to_update` <- ApiClient$new()$deserializeObj(this_object$`asset_groups_to_update`, "array[UpdateAssetGroupBodyAssetGroupsToUpdateInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupBody in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_groups_to_update`)) {
          sprintf(
          '"asset_groups_to_update":
          [%s]
',
          paste(sapply(self$`asset_groups_to_update`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupBody
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupBody
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_groups_to_update` <- ApiClient$new()$deserializeObj(this_object$`asset_groups_to_update`, "array[UpdateAssetGroupBodyAssetGroupsToUpdateInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateAssetGroupBody and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateAssetGroupBody
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# UpdateAssetGroupBody$unlock()
#
## Below is an example to define the print function
# UpdateAssetGroupBody$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateAssetGroupBody$lock()

