#' Create a new RelatedTermsRelatedTermsListItems
#'
#' @description
#' RelatedTermsRelatedTermsListItems Class
#'
#' @docType class
#' @title RelatedTermsRelatedTermsListItems
#' @description RelatedTermsRelatedTermsListItems Class
#' @format An \code{R6Class} generator object
#' @field related_terms  list(character) [optional]
#' @field term  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RelatedTermsRelatedTermsListItems <- R6::R6Class(
  "RelatedTermsRelatedTermsListItems",
  public = list(
    `related_terms` = NULL,
    `term` = NULL,

    #' @description
    #' Initialize a new RelatedTermsRelatedTermsListItems class.
    #'
    #' @param related_terms related_terms
    #' @param term term
    #' @param ... Other optional arguments.
    initialize = function(`related_terms` = NULL, `term` = NULL, ...) {
      if (!is.null(`related_terms`)) {
        stopifnot(is.vector(`related_terms`), length(`related_terms`) != 0)
        sapply(`related_terms`, function(x) stopifnot(is.character(x)))
        self$`related_terms` <- `related_terms`
      }
      if (!is.null(`term`)) {
        if (!(is.character(`term`) && length(`term`) == 1)) {
          stop(paste("Error! Invalid data for `term`. Must be a string:", `term`))
        }
        self$`term` <- `term`
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
    #' @return RelatedTermsRelatedTermsListItems as a base R list.
    #' @examples
    #' # convert array of RelatedTermsRelatedTermsListItems (x) to a data frame
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
    #' Convert RelatedTermsRelatedTermsListItems to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RelatedTermsRelatedTermsListItemsObject <- list()
      if (!is.null(self$`related_terms`)) {
        RelatedTermsRelatedTermsListItemsObject[["related_terms"]] <-
          self$`related_terms`
      }
      if (!is.null(self$`term`)) {
        RelatedTermsRelatedTermsListItemsObject[["term"]] <-
          self$`term`
      }
      return(RelatedTermsRelatedTermsListItemsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListItems
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`related_terms`)) {
        self$`related_terms` <- ApiClient$new()$deserializeObj(this_object$`related_terms`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`term`)) {
        self$`term` <- this_object$`term`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RelatedTermsRelatedTermsListItems in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListItems
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListItems
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`related_terms` <- ApiClient$new()$deserializeObj(this_object$`related_terms`, "array[character]", loadNamespace("openapi"))
      self$`term` <- this_object$`term`
      self
    },

    #' @description
    #' Validate JSON input with respect to RelatedTermsRelatedTermsListItems and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RelatedTermsRelatedTermsListItems
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
# RelatedTermsRelatedTermsListItems$unlock()
#
## Below is an example to define the print function
# RelatedTermsRelatedTermsListItems$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RelatedTermsRelatedTermsListItems$lock()

