#' Create a new DeleteBusinessPartners
#'
#' @description
#' DeleteBusinessPartners Class
#'
#' @docType class
#' @title DeleteBusinessPartners
#' @description DeleteBusinessPartners Class
#' @format An \code{R6Class} generator object
#' @field deleted_partners  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DeleteBusinessPartners <- R6::R6Class(
  "DeleteBusinessPartners",
  public = list(
    `deleted_partners` = NULL,

    #' @description
    #' Initialize a new DeleteBusinessPartners class.
    #'
    #' @param deleted_partners deleted_partners
    #' @param ... Other optional arguments.
    initialize = function(`deleted_partners` = NULL, ...) {
      if (!is.null(`deleted_partners`)) {
        stopifnot(is.vector(`deleted_partners`), length(`deleted_partners`) != 0)
        sapply(`deleted_partners`, function(x) stopifnot(is.character(x)))
        self$`deleted_partners` <- `deleted_partners`
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
    #' @return DeleteBusinessPartners as a base R list.
    #' @examples
    #' # convert array of DeleteBusinessPartners (x) to a data frame
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
    #' Convert DeleteBusinessPartners to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DeleteBusinessPartnersObject <- list()
      if (!is.null(self$`deleted_partners`)) {
        DeleteBusinessPartnersObject[["deleted_partners"]] <-
          self$`deleted_partners`
      }
      return(DeleteBusinessPartnersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteBusinessPartners
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessPartners
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`deleted_partners`)) {
        self$`deleted_partners` <- ApiClient$new()$deserializeObj(this_object$`deleted_partners`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DeleteBusinessPartners in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DeleteBusinessPartners
    #'
    #' @param input_json the JSON input
    #' @return the instance of DeleteBusinessPartners
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`deleted_partners` <- ApiClient$new()$deserializeObj(this_object$`deleted_partners`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to DeleteBusinessPartners and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DeleteBusinessPartners
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
# DeleteBusinessPartners$unlock()
#
## Below is an example to define the print function
# DeleteBusinessPartners$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DeleteBusinessPartners$lock()

