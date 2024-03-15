#' Create a new KeywordsResponse
#'
#' @description
#' KeywordsResponse Class
#'
#' @docType class
#' @title KeywordsResponse
#' @description KeywordsResponse Class
#' @format An \code{R6Class} generator object
#' @field errors  list(\link{KeywordError}) [optional]
#' @field keywords  list(\link{Keyword}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
KeywordsResponse <- R6::R6Class(
  "KeywordsResponse",
  public = list(
    `errors` = NULL,
    `keywords` = NULL,
    #' Initialize a new KeywordsResponse class.
    #'
    #' @description
    #' Initialize a new KeywordsResponse class.
    #'
    #' @param errors errors
    #' @param keywords keywords
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`errors` = NULL, `keywords` = NULL, ...) {
      if (!is.null(`errors`)) {
        stopifnot(is.vector(`errors`), length(`errors`) != 0)
        sapply(`errors`, function(x) stopifnot(R6::is.R6(x)))
        self$`errors` <- `errors`
      }
      if (!is.null(`keywords`)) {
        stopifnot(is.vector(`keywords`), length(`keywords`) != 0)
        sapply(`keywords`, function(x) stopifnot(R6::is.R6(x)))
        self$`keywords` <- `keywords`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordsResponse in JSON format
    #' @export
    toJSON = function() {
      KeywordsResponseObject <- list()
      if (!is.null(self$`errors`)) {
        KeywordsResponseObject[["errors"]] <-
          lapply(self$`errors`, function(x) x$toJSON())
      }
      if (!is.null(self$`keywords`)) {
        KeywordsResponseObject[["keywords"]] <-
          lapply(self$`keywords`, function(x) x$toJSON())
      }
      KeywordsResponseObject
    },
    #' Deserialize JSON string into an instance of KeywordsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`errors`)) {
        self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[KeywordError]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`keywords`)) {
        self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[Keyword]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return KeywordsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`errors`)) {
          sprintf(
          '"errors":
          [%s]
',
          paste(sapply(self$`errors`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`keywords`)) {
          sprintf(
          '"keywords":
          [%s]
',
          paste(sapply(self$`keywords`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of KeywordsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of KeywordsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of KeywordsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`errors` <- ApiClient$new()$deserializeObj(this_object$`errors`, "array[KeywordError]", loadNamespace("openapi"))
      self$`keywords` <- ApiClient$new()$deserializeObj(this_object$`keywords`, "array[Keyword]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to KeywordsResponse
    #'
    #' @description
    #' Validate JSON input with respect to KeywordsResponse and throw an exception if invalid
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
    #' @return String representation of KeywordsResponse
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
# KeywordsResponse$unlock()
#
## Below is an example to define the print function
# KeywordsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# KeywordsResponse$lock()

