#' Create a new CreateAssetGroupResponse
#'
#' @description
#' CreateAssetGroupResponse Class
#'
#' @docType class
#' @title CreateAssetGroupResponse
#' @description CreateAssetGroupResponse Class
#' @format An \code{R6Class} generator object
#' @field asset_group  \link{AssetGroupBinding} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetGroupResponse <- R6::R6Class(
  "CreateAssetGroupResponse",
  public = list(
    `asset_group` = NULL,

    #' @description
    #' Initialize a new CreateAssetGroupResponse class.
    #'
    #' @param asset_group asset_group
    #' @param ... Other optional arguments.
    initialize = function(`asset_group` = NULL, ...) {
      if (!is.null(`asset_group`)) {
        stopifnot(R6::is.R6(`asset_group`))
        self$`asset_group` <- `asset_group`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetGroupResponse in JSON format
    toJSON = function() {
      CreateAssetGroupResponseObject <- list()
      if (!is.null(self$`asset_group`)) {
        CreateAssetGroupResponseObject[["asset_group"]] <-
          self$`asset_group`$toJSON()
      }
      CreateAssetGroupResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetGroupResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`asset_group`)) {
        `asset_group_object` <- AssetGroupBinding$new()
        `asset_group_object`$fromJSON(jsonlite::toJSON(this_object$`asset_group`, auto_unbox = TRUE, digits = NA))
        self$`asset_group` <- `asset_group_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateAssetGroupResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`asset_group`)) {
          sprintf(
          '"asset_group":
          %s
          ',
          jsonlite::toJSON(self$`asset_group`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetGroupResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`asset_group` <- AssetGroupBinding$new()$fromJSON(jsonlite::toJSON(this_object$`asset_group`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetGroupResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetGroupResponse
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
# CreateAssetGroupResponse$unlock()
#
## Below is an example to define the print function
# CreateAssetGroupResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetGroupResponse$lock()

