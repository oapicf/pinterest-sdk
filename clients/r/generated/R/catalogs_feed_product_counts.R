#' Create a new CatalogsFeedProductCounts
#'
#' @description
#' The counts can be null early in the process.
#'
#' @docType class
#' @title CatalogsFeedProductCounts
#' @description CatalogsFeedProductCounts Class
#' @format An \code{R6Class} generator object
#' @field original The number of products in the feed file. integer [optional]
#' @field ingested The number of products successfully ingested from the feed file. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedProductCounts <- R6::R6Class(
  "CatalogsFeedProductCounts",
  public = list(
    `original` = NULL,
    `ingested` = NULL,
    #' Initialize a new CatalogsFeedProductCounts class.
    #'
    #' @description
    #' Initialize a new CatalogsFeedProductCounts class.
    #'
    #' @param original The number of products in the feed file.
    #' @param ingested The number of products successfully ingested from the feed file.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`original` = NULL, `ingested` = NULL, ...) {
      if (!is.null(`original`)) {
        if (!(is.numeric(`original`) && length(`original`) == 1)) {
          stop(paste("Error! Invalid data for `original`. Must be an integer:", `original`))
        }
        self$`original` <- `original`
      }
      if (!is.null(`ingested`)) {
        if (!(is.numeric(`ingested`) && length(`ingested`) == 1)) {
          stop(paste("Error! Invalid data for `ingested`. Must be an integer:", `ingested`))
        }
        self$`ingested` <- `ingested`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedProductCounts in JSON format
    #' @export
    toJSON = function() {
      CatalogsFeedProductCountsObject <- list()
      if (!is.null(self$`original`)) {
        CatalogsFeedProductCountsObject[["original"]] <-
          self$`original`
      }
      if (!is.null(self$`ingested`)) {
        CatalogsFeedProductCountsObject[["ingested"]] <-
          self$`ingested`
      }
      CatalogsFeedProductCountsObject
    },
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProductCounts
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`original`)) {
        self$`original` <- this_object$`original`
      }
      if (!is.null(this_object$`ingested`)) {
        self$`ingested` <- this_object$`ingested`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedProductCounts in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`original`)) {
          sprintf(
          '"original":
            %d
                    ',
          self$`original`
          )
        },
        if (!is.null(self$`ingested`)) {
          sprintf(
          '"ingested":
            %d
                    ',
          self$`ingested`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProductCounts
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`original` <- this_object$`original`
      self$`ingested` <- this_object$`ingested`
      self
    },
    #' Validate JSON input with respect to CatalogsFeedProductCounts
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsFeedProductCounts and throw an exception if invalid
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
    #' @return String representation of CatalogsFeedProductCounts
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
# CatalogsFeedProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsFeedProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedProductCounts$lock()

