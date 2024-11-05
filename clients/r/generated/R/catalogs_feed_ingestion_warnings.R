#' Create a new CatalogsFeedIngestionWarnings
#'
#' @description
#' CatalogsFeedIngestionWarnings Class
#'
#' @docType class
#' @title CatalogsFeedIngestionWarnings
#' @description CatalogsFeedIngestionWarnings Class
#' @format An \code{R6Class} generator object
#' @field ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. integer [optional]
#' @field ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue. integer [optional]
#' @field HOTEL_PRICE_HEADER_IS_PRESENT price is not a supported column. Use base_price and sale_price instead. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedIngestionWarnings <- R6::R6Class(
  "CatalogsFeedIngestionWarnings",
  public = list(
    `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` = NULL,
    `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` = NULL,
    `ADDITIONAL_IMAGE_MALFORMED_URL` = NULL,
    `ADDITIONAL_IMAGE_FILE_NOT_FOUND` = NULL,
    `ADDITIONAL_IMAGE_INVALID_FILE` = NULL,
    `HOTEL_PRICE_HEADER_IS_PRESENT` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedIngestionWarnings class.
    #'
    #' @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
    #' @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
    #' @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue.
    #' @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue.
    #' @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue.
    #' @param HOTEL_PRICE_HEADER_IS_PRESENT price is not a supported column. Use base_price and sale_price instead.
    #' @param ... Other optional arguments.
    initialize = function(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` = NULL, `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` = NULL, `ADDITIONAL_IMAGE_MALFORMED_URL` = NULL, `ADDITIONAL_IMAGE_FILE_NOT_FOUND` = NULL, `ADDITIONAL_IMAGE_INVALID_FILE` = NULL, `HOTEL_PRICE_HEADER_IS_PRESENT` = NULL, ...) {
      if (!is.null(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`) && length(`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`. Must be an integer:", `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`))
        }
        self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- `ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`) && length(`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`. Must be an integer:", `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`))
        }
        self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- `ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_MALFORMED_URL`) && length(`ADDITIONAL_IMAGE_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_MALFORMED_URL`. Must be an integer:", `ADDITIONAL_IMAGE_MALFORMED_URL`))
        }
        self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- `ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`) && length(`ADDITIONAL_IMAGE_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_FILE_NOT_FOUND`. Must be an integer:", `ADDITIONAL_IMAGE_FILE_NOT_FOUND`))
        }
        self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- `ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        if (!(is.numeric(`ADDITIONAL_IMAGE_INVALID_FILE`) && length(`ADDITIONAL_IMAGE_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `ADDITIONAL_IMAGE_INVALID_FILE`. Must be an integer:", `ADDITIONAL_IMAGE_INVALID_FILE`))
        }
        self$`ADDITIONAL_IMAGE_INVALID_FILE` <- `ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        if (!(is.numeric(`HOTEL_PRICE_HEADER_IS_PRESENT`) && length(`HOTEL_PRICE_HEADER_IS_PRESENT`) == 1)) {
          stop(paste("Error! Invalid data for `HOTEL_PRICE_HEADER_IS_PRESENT`. Must be an integer:", `HOTEL_PRICE_HEADER_IS_PRESENT`))
        }
        self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- `HOTEL_PRICE_HEADER_IS_PRESENT`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionWarnings in JSON format
    toJSON = function() {
      CatalogsFeedIngestionWarningsObject <- list()
      if (!is.null(self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR"]] <-
          self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE"]] <-
          self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_MALFORMED_URL"]] <-
          self$`ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_FILE_NOT_FOUND"]] <-
          self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(self$`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        CatalogsFeedIngestionWarningsObject[["ADDITIONAL_IMAGE_INVALID_FILE"]] <-
          self$`ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(self$`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        CatalogsFeedIngestionWarningsObject[["HOTEL_PRICE_HEADER_IS_PRESENT"]] <-
          self$`HOTEL_PRICE_HEADER_IS_PRESENT`
      }
      CatalogsFeedIngestionWarningsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionWarnings
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
        self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
        self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
        self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
        self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`ADDITIONAL_IMAGE_INVALID_FILE`)) {
        self$`ADDITIONAL_IMAGE_INVALID_FILE` <- this_object$`ADDITIONAL_IMAGE_INVALID_FILE`
      }
      if (!is.null(this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
        self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionWarnings in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_MALFORMED_URL`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_MALFORMED_URL":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_MALFORMED_URL`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_FILE_NOT_FOUND":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
          )
        },
        if (!is.null(self$`ADDITIONAL_IMAGE_INVALID_FILE`)) {
          sprintf(
          '"ADDITIONAL_IMAGE_INVALID_FILE":
            %d
                    ',
          self$`ADDITIONAL_IMAGE_INVALID_FILE`
          )
        },
        if (!is.null(self$`HOTEL_PRICE_HEADER_IS_PRESENT`)) {
          sprintf(
          '"HOTEL_PRICE_HEADER_IS_PRESENT":
            %d
                    ',
          self$`HOTEL_PRICE_HEADER_IS_PRESENT`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionWarnings
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionWarnings
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR`
      self$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE`
      self$`ADDITIONAL_IMAGE_MALFORMED_URL` <- this_object$`ADDITIONAL_IMAGE_MALFORMED_URL`
      self$`ADDITIONAL_IMAGE_FILE_NOT_FOUND` <- this_object$`ADDITIONAL_IMAGE_FILE_NOT_FOUND`
      self$`ADDITIONAL_IMAGE_INVALID_FILE` <- this_object$`ADDITIONAL_IMAGE_INVALID_FILE`
      self$`HOTEL_PRICE_HEADER_IS_PRESENT` <- this_object$`HOTEL_PRICE_HEADER_IS_PRESENT`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedIngestionWarnings and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedIngestionWarnings
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
# CatalogsFeedIngestionWarnings$unlock()
#
## Below is an example to define the print function
# CatalogsFeedIngestionWarnings$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedIngestionWarnings$lock()

