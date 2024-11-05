#' Create a new CatalogsReportFeedIngestionStats
#'
#' @description
#' CatalogsReportFeedIngestionStats Class
#'
#' @docType class
#' @title CatalogsReportFeedIngestionStats
#' @description CatalogsReportFeedIngestionStats Class
#' @format An \code{R6Class} generator object
#' @field report_type  character [optional]
#' @field catalog_id ID of the catalog entity. character [optional]
#' @field code The event code that a diagnostics aggregated number references integer [optional]
#' @field code_label A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID') character [optional]
#' @field message Title message describing the diagnostic issue character [optional]
#' @field occurrences Number of occurrences of the issue integer [optional]
#' @field severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReportFeedIngestionStats <- R6::R6Class(
  "CatalogsReportFeedIngestionStats",
  public = list(
    `report_type` = NULL,
    `catalog_id` = NULL,
    `code` = NULL,
    `code_label` = NULL,
    `message` = NULL,
    `occurrences` = NULL,
    `severity` = NULL,

    #' @description
    #' Initialize a new CatalogsReportFeedIngestionStats class.
    #'
    #' @param report_type report_type
    #' @param catalog_id ID of the catalog entity.
    #' @param code The event code that a diagnostics aggregated number references
    #' @param code_label A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
    #' @param message Title message describing the diagnostic issue
    #' @param occurrences Number of occurrences of the issue
    #' @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
    #' @param ... Other optional arguments.
    initialize = function(`report_type` = NULL, `catalog_id` = NULL, `code` = NULL, `code_label` = NULL, `message` = NULL, `occurrences` = NULL, `severity` = NULL, ...) {
      if (!is.null(`report_type`)) {
        if (!(`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
          stop(paste("Error! \"", `report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
        }
        if (!(is.character(`report_type`) && length(`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", `report_type`))
        }
        self$`report_type` <- `report_type`
      }
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
      if (!is.null(`code`)) {
        if (!(is.numeric(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be an integer:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`code_label`)) {
        if (!(is.character(`code_label`) && length(`code_label`) == 1)) {
          stop(paste("Error! Invalid data for `code_label`. Must be a string:", `code_label`))
        }
        self$`code_label` <- `code_label`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`occurrences`)) {
        if (!(is.numeric(`occurrences`) && length(`occurrences`) == 1)) {
          stop(paste("Error! Invalid data for `occurrences`. Must be an integer:", `occurrences`))
        }
        self$`occurrences` <- `occurrences`
      }
      if (!is.null(`severity`)) {
        if (!(`severity` %in% c("WARN", "ERROR"))) {
          stop(paste("Error! \"", `severity`, "\" cannot be assigned to `severity`. Must be \"WARN\", \"ERROR\".", sep = ""))
        }
        if (!(is.character(`severity`) && length(`severity`) == 1)) {
          stop(paste("Error! Invalid data for `severity`. Must be a string:", `severity`))
        }
        self$`severity` <- `severity`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportFeedIngestionStats in JSON format
    toJSON = function() {
      CatalogsReportFeedIngestionStatsObject <- list()
      if (!is.null(self$`report_type`)) {
        CatalogsReportFeedIngestionStatsObject[["report_type"]] <-
          self$`report_type`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsReportFeedIngestionStatsObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`code`)) {
        CatalogsReportFeedIngestionStatsObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`code_label`)) {
        CatalogsReportFeedIngestionStatsObject[["code_label"]] <-
          self$`code_label`
      }
      if (!is.null(self$`message`)) {
        CatalogsReportFeedIngestionStatsObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`occurrences`)) {
        CatalogsReportFeedIngestionStatsObject[["occurrences"]] <-
          self$`occurrences`
      }
      if (!is.null(self$`severity`)) {
        CatalogsReportFeedIngestionStatsObject[["severity"]] <-
          self$`severity`
      }
      CatalogsReportFeedIngestionStatsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportFeedIngestionStats
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportFeedIngestionStats
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_type`)) {
        if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
          stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
        }
        self$`report_type` <- this_object$`report_type`
      }
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`code_label`)) {
        self$`code_label` <- this_object$`code_label`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`occurrences`)) {
        self$`occurrences` <- this_object$`occurrences`
      }
      if (!is.null(this_object$`severity`)) {
        if (!is.null(this_object$`severity`) && !(this_object$`severity` %in% c("WARN", "ERROR"))) {
          stop(paste("Error! \"", this_object$`severity`, "\" cannot be assigned to `severity`. Must be \"WARN\", \"ERROR\".", sep = ""))
        }
        self$`severity` <- this_object$`severity`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportFeedIngestionStats in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`report_type`)) {
          sprintf(
          '"report_type":
            "%s"
                    ',
          self$`report_type`
          )
        },
        if (!is.null(self$`catalog_id`)) {
          sprintf(
          '"catalog_id":
            "%s"
                    ',
          self$`catalog_id`
          )
        },
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            %d
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`code_label`)) {
          sprintf(
          '"code_label":
            "%s"
                    ',
          self$`code_label`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`occurrences`)) {
          sprintf(
          '"occurrences":
            %d
                    ',
          self$`occurrences`
          )
        },
        if (!is.null(self$`severity`)) {
          sprintf(
          '"severity":
            "%s"
                    ',
          self$`severity`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportFeedIngestionStats
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportFeedIngestionStats
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
        stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
      }
      self$`report_type` <- this_object$`report_type`
      self$`catalog_id` <- this_object$`catalog_id`
      self$`code` <- this_object$`code`
      self$`code_label` <- this_object$`code_label`
      self$`message` <- this_object$`message`
      self$`occurrences` <- this_object$`occurrences`
      if (!is.null(this_object$`severity`) && !(this_object$`severity` %in% c("WARN", "ERROR"))) {
        stop(paste("Error! \"", this_object$`severity`, "\" cannot be assigned to `severity`. Must be \"WARN\", \"ERROR\".", sep = ""))
      }
      self$`severity` <- this_object$`severity`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsReportFeedIngestionStats and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsReportFeedIngestionStats
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      if (!str_detect(self$`catalog_id`, "^\\d+$")) {
        invalid_fields["catalog_id"] <- "Invalid value for `catalog_id`, must conform to the pattern ^\\d+$."
      }

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
# CatalogsReportFeedIngestionStats$unlock()
#
## Below is an example to define the print function
# CatalogsReportFeedIngestionStats$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsReportFeedIngestionStats$lock()

