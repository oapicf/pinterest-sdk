#' Create a new UpdateAssetGroupResponse
#'
#' @description
#' UpdateAssetGroupResponse Class
#'
#' @docType class
#' @title UpdateAssetGroupResponse
#' @description UpdateAssetGroupResponse Class
#' @format An \code{R6Class} generator object
#' @field updated_asset_groups A list of successfully edited asset groups. list(\link{AssetGroupBinding}) [optional]
#' @field exceptions A list of errors associated with the asset groups. Will be returned if there is an error. list(\link{UpdateAssetGroupResponseExceptionsInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UpdateAssetGroupResponse <- R6::R6Class(
  "UpdateAssetGroupResponse",
  public = list(
    `updated_asset_groups` = NULL,
    `exceptions` = NULL,

    #' @description
    #' Initialize a new UpdateAssetGroupResponse class.
    #'
    #' @param updated_asset_groups A list of successfully edited asset groups.
    #' @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
    #' @param ... Other optional arguments.
    initialize = function(`updated_asset_groups` = NULL, `exceptions` = NULL, ...) {
      if (!is.null(`updated_asset_groups`)) {
        stopifnot(is.vector(`updated_asset_groups`), length(`updated_asset_groups`) != 0)
        sapply(`updated_asset_groups`, function(x) stopifnot(R6::is.R6(x)))
        self$`updated_asset_groups` <- `updated_asset_groups`
      }
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupResponse in JSON format
    toJSON = function() {
      UpdateAssetGroupResponseObject <- list()
      if (!is.null(self$`updated_asset_groups`)) {
        UpdateAssetGroupResponseObject[["updated_asset_groups"]] <-
          lapply(self$`updated_asset_groups`, function(x) x$toJSON())
      }
      if (!is.null(self$`exceptions`)) {
        UpdateAssetGroupResponseObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toJSON())
      }
      UpdateAssetGroupResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`updated_asset_groups`)) {
        self$`updated_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`updated_asset_groups`, "array[AssetGroupBinding]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[UpdateAssetGroupResponseExceptionsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return UpdateAssetGroupResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`updated_asset_groups`)) {
          sprintf(
          '"updated_asset_groups":
          [%s]
',
          paste(sapply(self$`updated_asset_groups`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`exceptions`)) {
          sprintf(
          '"exceptions":
          [%s]
',
          paste(sapply(self$`exceptions`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of UpdateAssetGroupResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of UpdateAssetGroupResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`updated_asset_groups` <- ApiClient$new()$deserializeObj(this_object$`updated_asset_groups`, "array[AssetGroupBinding]", loadNamespace("openapi"))
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[UpdateAssetGroupResponseExceptionsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to UpdateAssetGroupResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UpdateAssetGroupResponse
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
# UpdateAssetGroupResponse$unlock()
#
## Below is an example to define the print function
# UpdateAssetGroupResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UpdateAssetGroupResponse$lock()

