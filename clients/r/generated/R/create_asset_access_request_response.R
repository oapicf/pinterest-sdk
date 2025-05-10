#' Create a new CreateAssetAccessRequestResponse
#'
#' @description
#' CreateAssetAccessRequestResponse Class
#'
#' @docType class
#' @title CreateAssetAccessRequestResponse
#' @description CreateAssetAccessRequestResponse Class
#' @format An \code{R6Class} generator object
#' @field exceptions A list of errors associated with the asset access requests. Will be returned if there is an error. list(\link{CreateAssetAccessRequestErrorMessageInner}) [optional]
#' @field invites  named list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssetAccessRequestResponse <- R6::R6Class(
  "CreateAssetAccessRequestResponse",
  public = list(
    `exceptions` = NULL,
    `invites` = NULL,

    #' @description
    #' Initialize a new CreateAssetAccessRequestResponse class.
    #'
    #' @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
    #' @param invites invites
    #' @param ... Other optional arguments.
    initialize = function(`exceptions` = NULL, `invites` = NULL, ...) {
      if (!is.null(`exceptions`)) {
        stopifnot(is.vector(`exceptions`), length(`exceptions`) != 0)
        sapply(`exceptions`, function(x) stopifnot(R6::is.R6(x)))
        self$`exceptions` <- `exceptions`
      }
      if (!is.null(`invites`)) {
        stopifnot(is.vector(`invites`), length(`invites`) != 0)
        sapply(`invites`, function(x) stopifnot(is.character(x)))
        self$`invites` <- `invites`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateAssetAccessRequestResponse as a base R list.
    #' @examples
    #' # convert array of CreateAssetAccessRequestResponse (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateAssetAccessRequestResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssetAccessRequestResponseObject <- list()
      if (!is.null(self$`exceptions`)) {
        CreateAssetAccessRequestResponseObject[["exceptions"]] <-
          lapply(self$`exceptions`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`invites`)) {
        CreateAssetAccessRequestResponseObject[["invites"]] <-
          self$`invites`
      }
      return(CreateAssetAccessRequestResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`exceptions`)) {
        self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[CreateAssetAccessRequestErrorMessageInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`invites`)) {
        self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "map(character)", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssetAccessRequestResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssetAccessRequestResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssetAccessRequestResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`exceptions` <- ApiClient$new()$deserializeObj(this_object$`exceptions`, "array[CreateAssetAccessRequestErrorMessageInner]", loadNamespace("openapi"))
      self$`invites` <- ApiClient$new()$deserializeObj(this_object$`invites`, "map(character)", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssetAccessRequestResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssetAccessRequestResponse
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
# CreateAssetAccessRequestResponse$unlock()
#
## Below is an example to define the print function
# CreateAssetAccessRequestResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssetAccessRequestResponse$lock()

