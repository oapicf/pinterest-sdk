#' Create a new RelatedTerms
#'
#' @description
#' RelatedTerms Class
#'
#' @docType class
#' @title RelatedTerms
#' @description RelatedTerms Class
#' @format An \code{R6Class} generator object
#' @field id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\" character [optional]
#' @field related_term_count Total number of related terms returned integer [optional]
#' @field related_terms_list The id of the advertiser. list(\link{RelatedTermsRelatedTermsListItems}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RelatedTerms <- R6::R6Class(
  "RelatedTerms",
  public = list(
    `id` = NULL,
    `related_term_count` = NULL,
    `related_terms_list` = NULL,

    #' @description
    #' Initialize a new RelatedTerms class.
    #'
    #' @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
    #' @param related_term_count Total number of related terms returned
    #' @param related_terms_list The id of the advertiser.
    #' @param ... Other optional arguments.
    initialize = function(`id` = NULL, `related_term_count` = NULL, `related_terms_list` = NULL, ...) {
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`related_term_count`)) {
        if (!(is.numeric(`related_term_count`) && length(`related_term_count`) == 1)) {
          stop(paste("Error! Invalid data for `related_term_count`. Must be an integer:", `related_term_count`))
        }
        self$`related_term_count` <- `related_term_count`
      }
      if (!is.null(`related_terms_list`)) {
        stopifnot(is.vector(`related_terms_list`), length(`related_terms_list`) != 0)
        sapply(`related_terms_list`, function(x) stopifnot(R6::is.R6(x)))
        self$`related_terms_list` <- `related_terms_list`
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
    #' @return RelatedTerms as a base R list.
    #' @examples
    #' # convert array of RelatedTerms (x) to a data frame
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
    #' Convert RelatedTerms to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RelatedTermsObject <- list()
      if (!is.null(self$`id`)) {
        RelatedTermsObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`related_term_count`)) {
        RelatedTermsObject[["related_term_count"]] <-
          self$`related_term_count`
      }
      if (!is.null(self$`related_terms_list`)) {
        RelatedTermsObject[["related_terms_list"]] <-
          self$extractSimpleType(self$`related_terms_list`)
      }
      return(RelatedTermsObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTerms
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`related_term_count`)) {
        self$`related_term_count` <- this_object$`related_term_count`
      }
      if (!is.null(this_object$`related_terms_list`)) {
        self$`related_terms_list` <- ApiClient$new()$deserializeObj(this_object$`related_terms_list`, "array[RelatedTermsRelatedTermsListItems]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RelatedTerms in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTerms
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`related_term_count` <- this_object$`related_term_count`
      self$`related_terms_list` <- ApiClient$new()$deserializeObj(this_object$`related_terms_list`, "array[RelatedTermsRelatedTermsListItems]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RelatedTerms and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RelatedTerms
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
# RelatedTerms$unlock()
#
## Below is an example to define the print function
# RelatedTerms$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RelatedTerms$lock()

