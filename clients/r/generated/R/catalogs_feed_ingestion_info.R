#' Create a new CatalogsFeedIngestionInfo
#'
#' @description
#' CatalogsFeedIngestionInfo Class
#'
#' @docType class
#' @title CatalogsFeedIngestionInfo
#' @description CatalogsFeedIngestionInfo Class
#' @format An \code{R6Class} generator object
#' @field IN_STOCK The number of ingested products that are in stock. integer [optional]
#' @field OUT_OF_STOCK The number of ingested products that are in out of stock. integer [optional]
#' @field PREORDER The number of ingested products that are in preorder. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedIngestionInfo <- R6::R6Class(
  "CatalogsFeedIngestionInfo",
  public = list(
    `IN_STOCK` = NULL,
    `OUT_OF_STOCK` = NULL,
    `PREORDER` = NULL,
    #' Initialize a new CatalogsFeedIngestionInfo class.
    #'
    #' @description
    #' Initialize a new CatalogsFeedIngestionInfo class.
    #'
    #' @param IN_STOCK The number of ingested products that are in stock.
    #' @param OUT_OF_STOCK The number of ingested products that are in out of stock.
    #' @param PREORDER The number of ingested products that are in preorder.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`IN_STOCK` = NULL, `OUT_OF_STOCK` = NULL, `PREORDER` = NULL, ...) {
      if (!is.null(`IN_STOCK`)) {
        if (!(is.numeric(`IN_STOCK`) && length(`IN_STOCK`) == 1)) {
          stop(paste("Error! Invalid data for `IN_STOCK`. Must be an integer:", `IN_STOCK`))
        }
        self$`IN_STOCK` <- `IN_STOCK`
      }
      if (!is.null(`OUT_OF_STOCK`)) {
        if (!(is.numeric(`OUT_OF_STOCK`) && length(`OUT_OF_STOCK`) == 1)) {
          stop(paste("Error! Invalid data for `OUT_OF_STOCK`. Must be an integer:", `OUT_OF_STOCK`))
        }
        self$`OUT_OF_STOCK` <- `OUT_OF_STOCK`
      }
      if (!is.null(`PREORDER`)) {
        if (!(is.numeric(`PREORDER`) && length(`PREORDER`) == 1)) {
          stop(paste("Error! Invalid data for `PREORDER`. Must be an integer:", `PREORDER`))
        }
        self$`PREORDER` <- `PREORDER`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionInfo in JSON format
    #' @export
    toJSON = function() {
      CatalogsFeedIngestionInfoObject <- list()
      if (!is.null(self$`IN_STOCK`)) {
        CatalogsFeedIngestionInfoObject[["IN_STOCK"]] <-
          self$`IN_STOCK`
      }
      if (!is.null(self$`OUT_OF_STOCK`)) {
        CatalogsFeedIngestionInfoObject[["OUT_OF_STOCK"]] <-
          self$`OUT_OF_STOCK`
      }
      if (!is.null(self$`PREORDER`)) {
        CatalogsFeedIngestionInfoObject[["PREORDER"]] <-
          self$`PREORDER`
      }
      CatalogsFeedIngestionInfoObject
    },
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionInfo
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionInfo
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`IN_STOCK`)) {
        self$`IN_STOCK` <- this_object$`IN_STOCK`
      }
      if (!is.null(this_object$`OUT_OF_STOCK`)) {
        self$`OUT_OF_STOCK` <- this_object$`OUT_OF_STOCK`
      }
      if (!is.null(this_object$`PREORDER`)) {
        self$`PREORDER` <- this_object$`PREORDER`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionInfo in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`IN_STOCK`)) {
          sprintf(
          '"IN_STOCK":
            %d
                    ',
          self$`IN_STOCK`
          )
        },
        if (!is.null(self$`OUT_OF_STOCK`)) {
          sprintf(
          '"OUT_OF_STOCK":
            %d
                    ',
          self$`OUT_OF_STOCK`
          )
        },
        if (!is.null(self$`PREORDER`)) {
          sprintf(
          '"PREORDER":
            %d
                    ',
          self$`PREORDER`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionInfo
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionInfo
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionInfo
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`IN_STOCK` <- this_object$`IN_STOCK`
      self$`OUT_OF_STOCK` <- this_object$`OUT_OF_STOCK`
      self$`PREORDER` <- this_object$`PREORDER`
      self
    },
    #' Validate JSON input with respect to CatalogsFeedIngestionInfo
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsFeedIngestionInfo and throw an exception if invalid
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
    #' @return String representation of CatalogsFeedIngestionInfo
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
# CatalogsFeedIngestionInfo$unlock()
#
## Below is an example to define the print function
# CatalogsFeedIngestionInfo$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedIngestionInfo$lock()

