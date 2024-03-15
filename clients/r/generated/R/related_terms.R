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
#' @field related_terms_list The id of the advertiser. list(\link{RelatedTermsRelatedTermsListInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RelatedTerms <- R6::R6Class(
  "RelatedTerms",
  public = list(
    `id` = NULL,
    `related_term_count` = NULL,
    `related_terms_list` = NULL,
    #' Initialize a new RelatedTerms class.
    #'
    #' @description
    #' Initialize a new RelatedTerms class.
    #'
    #' @param id First input term. For example, if you pass \"?terms=clothes,workout\", then id will be \"clothes\"
    #' @param related_term_count Total number of related terms returned
    #' @param related_terms_list The id of the advertiser.
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RelatedTerms in JSON format
    #' @export
    toJSON = function() {
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
          lapply(self$`related_terms_list`, function(x) x$toJSON())
      }
      RelatedTermsObject
    },
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @description
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTerms
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`related_term_count`)) {
        self$`related_term_count` <- this_object$`related_term_count`
      }
      if (!is.null(this_object$`related_terms_list`)) {
        self$`related_terms_list` <- ApiClient$new()$deserializeObj(this_object$`related_terms_list`, "array[RelatedTermsRelatedTermsListInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RelatedTerms in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`related_term_count`)) {
          sprintf(
          '"related_term_count":
            %d
                    ',
          self$`related_term_count`
          )
        },
        if (!is.null(self$`related_terms_list`)) {
          sprintf(
          '"related_terms_list":
          [%s]
',
          paste(sapply(self$`related_terms_list`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @description
    #' Deserialize JSON string into an instance of RelatedTerms
    #'
    #' @param input_json the JSON input
    #' @return the instance of RelatedTerms
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`related_term_count` <- this_object$`related_term_count`
      self$`related_terms_list` <- ApiClient$new()$deserializeObj(this_object$`related_terms_list`, "array[RelatedTermsRelatedTermsListInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to RelatedTerms
    #'
    #' @description
    #' Validate JSON input with respect to RelatedTerms and throw an exception if invalid
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
    #' @return String representation of RelatedTerms
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
# RelatedTerms$unlock()
#
## Below is an example to define the print function
# RelatedTerms$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RelatedTerms$lock()

