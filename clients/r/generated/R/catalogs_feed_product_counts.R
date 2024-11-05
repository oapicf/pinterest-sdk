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

    #' @description
    #' Initialize a new CatalogsFeedProductCounts class.
    #'
    #' @param original The number of products in the feed file.
    #' @param ingested The number of products successfully ingested from the feed file.
    #' @param ... Other optional arguments.
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

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedProductCounts in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProductCounts
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

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedProductCounts in JSON format
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

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedProductCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedProductCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`original` <- this_object$`original`
      self$`ingested` <- this_object$`ingested`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedProductCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedProductCounts
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
# CatalogsFeedProductCounts$unlock()
#
## Below is an example to define the print function
# CatalogsFeedProductCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedProductCounts$lock()

