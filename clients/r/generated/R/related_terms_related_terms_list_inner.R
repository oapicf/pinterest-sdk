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
    #' Initialize a new RelatedTermsRelatedTermsListInner class.
    #'
    #' @description
    #' Initialize a new RelatedTermsRelatedTermsListInner class.
    #'
    #' @param term term
    #' @param related_terms related_terms
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RelatedTermsRelatedTermsListInner in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListInner
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RelatedTermsRelatedTermsListInner in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of RelatedTermsRelatedTermsListInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTermsRelatedTermsListInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`term` <- this_object$`term`
      self$`related_terms` <- ApiClient$new()$deserializeObj(this_object$`related_terms`, "array[character]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to RelatedTermsRelatedTermsListInner
    #'
    #' @description
    #' Validate JSON input with respect to RelatedTermsRelatedTermsListInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RelatedTermsRelatedTermsListInner
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
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

