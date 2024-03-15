#' Create a new CatalogsFeedIngestionErrors
#'
#' @description
#' CatalogsFeedIngestionErrors Class
#'
#' @docType class
#' @title CatalogsFeedIngestionErrors
#' @description CatalogsFeedIngestionErrors Class
#' @format An \code{R6Class} generator object
#' @field LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. integer [optional]
#' @field LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99\% compared to the last successful ingestion. integer [optional]
#' @field ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. integer [optional]
#' @field IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. integer [optional]
#' @field IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue. integer [optional]
#' @field IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue. integer [optional]
#' @field IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue. integer [optional]
#' @field IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedIngestionErrors <- R6::R6Class(
  "CatalogsFeedIngestionErrors",
  public = list(
    `LINE_LEVEL_INTERNAL_ERROR` = NULL,
    `LARGE_PRODUCT_COUNT_DECREASE` = NULL,
    `ACCOUNT_FLAGGED` = NULL,
    `IMAGE_LEVEL_INTERNAL_ERROR` = NULL,
    `IMAGE_FILE_NOT_ACCESSIBLE` = NULL,
    `IMAGE_MALFORMED_URL` = NULL,
    `IMAGE_FILE_NOT_FOUND` = NULL,
    `IMAGE_INVALID_FILE` = NULL,
    #' Initialize a new CatalogsFeedIngestionErrors class.
    #'
    #' @description
    #' Initialize a new CatalogsFeedIngestionErrors class.
    #'
    #' @param LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
    #' @param LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99\% compared to the last successful ingestion.
    #' @param ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
    #' @param IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
    #' @param IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue.
    #' @param IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue.
    #' @param IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue.
    #' @param IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`LINE_LEVEL_INTERNAL_ERROR` = NULL, `LARGE_PRODUCT_COUNT_DECREASE` = NULL, `ACCOUNT_FLAGGED` = NULL, `IMAGE_LEVEL_INTERNAL_ERROR` = NULL, `IMAGE_FILE_NOT_ACCESSIBLE` = NULL, `IMAGE_MALFORMED_URL` = NULL, `IMAGE_FILE_NOT_FOUND` = NULL, `IMAGE_INVALID_FILE` = NULL, ...) {
      if (!is.null(`LINE_LEVEL_INTERNAL_ERROR`)) {
        if (!(is.numeric(`LINE_LEVEL_INTERNAL_ERROR`) && length(`LINE_LEVEL_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `LINE_LEVEL_INTERNAL_ERROR`. Must be an integer:", `LINE_LEVEL_INTERNAL_ERROR`))
        }
        self$`LINE_LEVEL_INTERNAL_ERROR` <- `LINE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(`LARGE_PRODUCT_COUNT_DECREASE`)) {
        if (!(`LARGE_PRODUCT_COUNT_DECREASE` %in% c("1"))) {
          stop(paste("Error! \"", `LARGE_PRODUCT_COUNT_DECREASE`, "\" cannot be assigned to `LARGE_PRODUCT_COUNT_DECREASE`. Must be \"1\".", sep = ""))
        }
        if (!(is.numeric(`LARGE_PRODUCT_COUNT_DECREASE`) && length(`LARGE_PRODUCT_COUNT_DECREASE`) == 1)) {
          stop(paste("Error! Invalid data for `LARGE_PRODUCT_COUNT_DECREASE`. Must be an integer:", `LARGE_PRODUCT_COUNT_DECREASE`))
        }
        self$`LARGE_PRODUCT_COUNT_DECREASE` <- `LARGE_PRODUCT_COUNT_DECREASE`
      }
      if (!is.null(`ACCOUNT_FLAGGED`)) {
        if (!(is.numeric(`ACCOUNT_FLAGGED`) && length(`ACCOUNT_FLAGGED`) == 1)) {
          stop(paste("Error! Invalid data for `ACCOUNT_FLAGGED`. Must be an integer:", `ACCOUNT_FLAGGED`))
        }
        self$`ACCOUNT_FLAGGED` <- `ACCOUNT_FLAGGED`
      }
      if (!is.null(`IMAGE_LEVEL_INTERNAL_ERROR`)) {
        if (!(is.numeric(`IMAGE_LEVEL_INTERNAL_ERROR`) && length(`IMAGE_LEVEL_INTERNAL_ERROR`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_LEVEL_INTERNAL_ERROR`. Must be an integer:", `IMAGE_LEVEL_INTERNAL_ERROR`))
        }
        self$`IMAGE_LEVEL_INTERNAL_ERROR` <- `IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(`IMAGE_FILE_NOT_ACCESSIBLE`)) {
        if (!(is.numeric(`IMAGE_FILE_NOT_ACCESSIBLE`) && length(`IMAGE_FILE_NOT_ACCESSIBLE`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_FILE_NOT_ACCESSIBLE`. Must be an integer:", `IMAGE_FILE_NOT_ACCESSIBLE`))
        }
        self$`IMAGE_FILE_NOT_ACCESSIBLE` <- `IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(`IMAGE_MALFORMED_URL`)) {
        if (!(is.numeric(`IMAGE_MALFORMED_URL`) && length(`IMAGE_MALFORMED_URL`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_MALFORMED_URL`. Must be an integer:", `IMAGE_MALFORMED_URL`))
        }
        self$`IMAGE_MALFORMED_URL` <- `IMAGE_MALFORMED_URL`
      }
      if (!is.null(`IMAGE_FILE_NOT_FOUND`)) {
        if (!(is.numeric(`IMAGE_FILE_NOT_FOUND`) && length(`IMAGE_FILE_NOT_FOUND`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_FILE_NOT_FOUND`. Must be an integer:", `IMAGE_FILE_NOT_FOUND`))
        }
        self$`IMAGE_FILE_NOT_FOUND` <- `IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(`IMAGE_INVALID_FILE`)) {
        if (!(is.numeric(`IMAGE_INVALID_FILE`) && length(`IMAGE_INVALID_FILE`) == 1)) {
          stop(paste("Error! Invalid data for `IMAGE_INVALID_FILE`. Must be an integer:", `IMAGE_INVALID_FILE`))
        }
        self$`IMAGE_INVALID_FILE` <- `IMAGE_INVALID_FILE`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionErrors in JSON format
    #' @export
    toJSON = function() {
      CatalogsFeedIngestionErrorsObject <- list()
      if (!is.null(self$`LINE_LEVEL_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionErrorsObject[["LINE_LEVEL_INTERNAL_ERROR"]] <-
          self$`LINE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(self$`LARGE_PRODUCT_COUNT_DECREASE`)) {
        CatalogsFeedIngestionErrorsObject[["LARGE_PRODUCT_COUNT_DECREASE"]] <-
          self$`LARGE_PRODUCT_COUNT_DECREASE`
      }
      if (!is.null(self$`ACCOUNT_FLAGGED`)) {
        CatalogsFeedIngestionErrorsObject[["ACCOUNT_FLAGGED"]] <-
          self$`ACCOUNT_FLAGGED`
      }
      if (!is.null(self$`IMAGE_LEVEL_INTERNAL_ERROR`)) {
        CatalogsFeedIngestionErrorsObject[["IMAGE_LEVEL_INTERNAL_ERROR"]] <-
          self$`IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(self$`IMAGE_FILE_NOT_ACCESSIBLE`)) {
        CatalogsFeedIngestionErrorsObject[["IMAGE_FILE_NOT_ACCESSIBLE"]] <-
          self$`IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(self$`IMAGE_MALFORMED_URL`)) {
        CatalogsFeedIngestionErrorsObject[["IMAGE_MALFORMED_URL"]] <-
          self$`IMAGE_MALFORMED_URL`
      }
      if (!is.null(self$`IMAGE_FILE_NOT_FOUND`)) {
        CatalogsFeedIngestionErrorsObject[["IMAGE_FILE_NOT_FOUND"]] <-
          self$`IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(self$`IMAGE_INVALID_FILE`)) {
        CatalogsFeedIngestionErrorsObject[["IMAGE_INVALID_FILE"]] <-
          self$`IMAGE_INVALID_FILE`
      }
      CatalogsFeedIngestionErrorsObject
    },
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionErrors
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionErrors
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`LINE_LEVEL_INTERNAL_ERROR`)) {
        self$`LINE_LEVEL_INTERNAL_ERROR` <- this_object$`LINE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`LARGE_PRODUCT_COUNT_DECREASE`)) {
        if (!is.null(this_object$`LARGE_PRODUCT_COUNT_DECREASE`) && !(this_object$`LARGE_PRODUCT_COUNT_DECREASE` %in% c("1"))) {
          stop(paste("Error! \"", this_object$`LARGE_PRODUCT_COUNT_DECREASE`, "\" cannot be assigned to `LARGE_PRODUCT_COUNT_DECREASE`. Must be \"1\".", sep = ""))
        }
        self$`LARGE_PRODUCT_COUNT_DECREASE` <- this_object$`LARGE_PRODUCT_COUNT_DECREASE`
      }
      if (!is.null(this_object$`ACCOUNT_FLAGGED`)) {
        self$`ACCOUNT_FLAGGED` <- this_object$`ACCOUNT_FLAGGED`
      }
      if (!is.null(this_object$`IMAGE_LEVEL_INTERNAL_ERROR`)) {
        self$`IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`IMAGE_LEVEL_INTERNAL_ERROR`
      }
      if (!is.null(this_object$`IMAGE_FILE_NOT_ACCESSIBLE`)) {
        self$`IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`IMAGE_FILE_NOT_ACCESSIBLE`
      }
      if (!is.null(this_object$`IMAGE_MALFORMED_URL`)) {
        self$`IMAGE_MALFORMED_URL` <- this_object$`IMAGE_MALFORMED_URL`
      }
      if (!is.null(this_object$`IMAGE_FILE_NOT_FOUND`)) {
        self$`IMAGE_FILE_NOT_FOUND` <- this_object$`IMAGE_FILE_NOT_FOUND`
      }
      if (!is.null(this_object$`IMAGE_INVALID_FILE`)) {
        self$`IMAGE_INVALID_FILE` <- this_object$`IMAGE_INVALID_FILE`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedIngestionErrors in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`LINE_LEVEL_INTERNAL_ERROR`)) {
          sprintf(
          '"LINE_LEVEL_INTERNAL_ERROR":
            %d
                    ',
          self$`LINE_LEVEL_INTERNAL_ERROR`
          )
        },
        if (!is.null(self$`LARGE_PRODUCT_COUNT_DECREASE`)) {
          sprintf(
          '"LARGE_PRODUCT_COUNT_DECREASE":
            %d
                    ',
          self$`LARGE_PRODUCT_COUNT_DECREASE`
          )
        },
        if (!is.null(self$`ACCOUNT_FLAGGED`)) {
          sprintf(
          '"ACCOUNT_FLAGGED":
            %d
                    ',
          self$`ACCOUNT_FLAGGED`
          )
        },
        if (!is.null(self$`IMAGE_LEVEL_INTERNAL_ERROR`)) {
          sprintf(
          '"IMAGE_LEVEL_INTERNAL_ERROR":
            %d
                    ',
          self$`IMAGE_LEVEL_INTERNAL_ERROR`
          )
        },
        if (!is.null(self$`IMAGE_FILE_NOT_ACCESSIBLE`)) {
          sprintf(
          '"IMAGE_FILE_NOT_ACCESSIBLE":
            %d
                    ',
          self$`IMAGE_FILE_NOT_ACCESSIBLE`
          )
        },
        if (!is.null(self$`IMAGE_MALFORMED_URL`)) {
          sprintf(
          '"IMAGE_MALFORMED_URL":
            %d
                    ',
          self$`IMAGE_MALFORMED_URL`
          )
        },
        if (!is.null(self$`IMAGE_FILE_NOT_FOUND`)) {
          sprintf(
          '"IMAGE_FILE_NOT_FOUND":
            %d
                    ',
          self$`IMAGE_FILE_NOT_FOUND`
          )
        },
        if (!is.null(self$`IMAGE_INVALID_FILE`)) {
          sprintf(
          '"IMAGE_INVALID_FILE":
            %d
                    ',
          self$`IMAGE_INVALID_FILE`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionErrors
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedIngestionErrors
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedIngestionErrors
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`LINE_LEVEL_INTERNAL_ERROR` <- this_object$`LINE_LEVEL_INTERNAL_ERROR`
      if (!is.null(this_object$`LARGE_PRODUCT_COUNT_DECREASE`) && !(this_object$`LARGE_PRODUCT_COUNT_DECREASE` %in% c("1"))) {
        stop(paste("Error! \"", this_object$`LARGE_PRODUCT_COUNT_DECREASE`, "\" cannot be assigned to `LARGE_PRODUCT_COUNT_DECREASE`. Must be \"1\".", sep = ""))
      }
      self$`LARGE_PRODUCT_COUNT_DECREASE` <- this_object$`LARGE_PRODUCT_COUNT_DECREASE`
      self$`ACCOUNT_FLAGGED` <- this_object$`ACCOUNT_FLAGGED`
      self$`IMAGE_LEVEL_INTERNAL_ERROR` <- this_object$`IMAGE_LEVEL_INTERNAL_ERROR`
      self$`IMAGE_FILE_NOT_ACCESSIBLE` <- this_object$`IMAGE_FILE_NOT_ACCESSIBLE`
      self$`IMAGE_MALFORMED_URL` <- this_object$`IMAGE_MALFORMED_URL`
      self$`IMAGE_FILE_NOT_FOUND` <- this_object$`IMAGE_FILE_NOT_FOUND`
      self$`IMAGE_INVALID_FILE` <- this_object$`IMAGE_INVALID_FILE`
      self
    },
    #' Validate JSON input with respect to CatalogsFeedIngestionErrors
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsFeedIngestionErrors and throw an exception if invalid
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
    #' @return String representation of CatalogsFeedIngestionErrors
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
# CatalogsFeedIngestionErrors$unlock()
#
## Below is an example to define the print function
# CatalogsFeedIngestionErrors$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedIngestionErrors$lock()

