#' Create a new RelatedTermsRelatedTermsListInner
#'
#' @description
#' RelatedTermsRelatedTermsListInner Class
#'
#' @docType class
#' @title RelatedTermsRelatedTermsListInner
#' @description RelatedTermsRelatedTermsListInner Class
#' @format An \code{R6Class} generator object
#' @field term  character [optional]
#' @field related_terms  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RelatedTermsRelatedTermsListInner <- R6::R6Class(
  "RelatedTermsRelatedTermsListInner",
  public = list(
    `term` = NULL,
    `related_terms` = NULL,

    #' @description
    #' Initialize a new RelatedTermsRelatedTermsListInner class.
    #'
    #' @param term term
    #' @param related_terms related_terms
    #' @param ... Other optional arguments.
    initialize = function(`term` = NULL, `related_terms` = NULL, ...) {
      if (!is.null(`term`)) {
        if (!(is.character(`term`) && length(`term`) == 1)) {
          stop(paste("Error! Invalid data for `term`. Must be a string:", `term`))
        }
        self$`term` <- `term`
      }
      if (!is.null(`related_terms`)) {
        stopifnot(is.vector(`related_terms`), length(`related_terms`) != 0)
        sapply(`related_terms`, function(x) stopifnot(is.character(x)))
        self$`related_terms` <- `related_terms`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RelatedTermsRelatedTermsListInner in JSON format
    toJSON = function() {
      RelatedTermsRelatedTermsListInnerObject <- list()
      if (!is.null(self$`term`)) {
        RelatedTermsRelatedTermsListInnerObject[["term"]] <-
          self$`term`
      }
      if (!is.null(self$`related_terms`)) {
        RelatedTermsRelatedTermsListInnerObject[["related_terms"]] <-
          self$`related_terms`
      }
      RelatedTermsRelatedTermsListInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`term`)) {
        self$`term` <- this_object$`term`
      }
      if (!is.null(this_object$`related_terms`)) {
        self$`related_terms` <- ApiClient$new()$deserializeObj(this_object$`related_terms`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RelatedTermsRelatedTermsListInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`term`)) {
          sprintf(
          '"term":
            "%s"
                    ',
          self$`term`
          )
        },
        if (!is.null(self$`related_terms`)) {
          sprintf(
          '"related_terms":
             [%s]
          ',
          paste(unlist(lapply(self$`related_terms`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`term` <- this_object$`term`
      self$`related_terms` <- ApiClient$new()$deserializeObj(this_object$`related_terms`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RelatedTermsRelatedTermsListInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RelatedTermsRelatedTermsListInner
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
# RelatedTermsRelatedTermsListInner$unlock()
#
## Below is an example to define the print function
# RelatedTermsRelatedTermsListInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RelatedTermsRelatedTermsListInner$lock()

