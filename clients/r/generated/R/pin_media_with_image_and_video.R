#' Create a new PinMediaWithImageAndVideo
#'
#' @description
#' Pin with a mix of images and videos.
#'
#' @docType class
#' @title PinMediaWithImageAndVideo
#' @description PinMediaWithImageAndVideo Class
#' @format An \code{R6Class} generator object
#' @field media_type  character [optional]
#' @field items  list(\link{PinMediaMetadata}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
PinMediaWithImageAndVideo <- R6::R6Class(
  "PinMediaWithImageAndVideo",
  inherit = PinMedia,
  public = list(
    `media_type` = NULL,
    `items` = NULL,

    #' @description
    #' Initialize a new PinMediaWithImageAndVideo class.
    #'
    #' @param media_type media_type
    #' @param items items
    #' @param ... Other optional arguments.
    initialize = function(`media_type` = NULL, `items` = NULL, ...) {
      if (!is.null(`media_type`)) {
        if (!(is.character(`media_type`) && length(`media_type`) == 1)) {
          stop(paste("Error! Invalid data for `media_type`. Must be a string:", `media_type`))
        }
        self$`media_type` <- `media_type`
      }
      if (!is.null(`items`)) {
        stopifnot(is.vector(`items`), length(`items`) != 0)
        sapply(`items`, function(x) stopifnot(R6::is.R6(x)))
        self$`items` <- `items`
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
    #' @return PinMediaWithImageAndVideo as a base R list.
    #' @examples
    #' # convert array of PinMediaWithImageAndVideo (x) to a data frame
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
    #' Convert PinMediaWithImageAndVideo to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      PinMediaWithImageAndVideoObject <- list()
      if (!is.null(self$`media_type`)) {
        PinMediaWithImageAndVideoObject[["media_type"]] <-
          self$`media_type`
      }
      if (!is.null(self$`items`)) {
        PinMediaWithImageAndVideoObject[["items"]] <-
          lapply(self$`items`, function(x) x$toSimpleType())
      }
      return(PinMediaWithImageAndVideoObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAndVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAndVideo
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`media_type`)) {
        self$`media_type` <- this_object$`media_type`
      }
      if (!is.null(this_object$`items`)) {
        self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaMetadata]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return PinMediaWithImageAndVideo in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of PinMediaWithImageAndVideo
    #'
    #' @param input_json the JSON input
    #' @return the instance of PinMediaWithImageAndVideo
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`media_type` <- this_object$`media_type`
      self$`items` <- ApiClient$new()$deserializeObj(this_object$`items`, "array[PinMediaMetadata]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to PinMediaWithImageAndVideo and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of PinMediaWithImageAndVideo
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
# PinMediaWithImageAndVideo$unlock()
#
## Below is an example to define the print function
# PinMediaWithImageAndVideo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# PinMediaWithImageAndVideo$lock()

