#' Create a new CatalogsReportDistributionStats
#'
#' @description
#' CatalogsReportDistributionStats Class
#'
#' @docType class
#' @title CatalogsReportDistributionStats
#' @description CatalogsReportDistributionStats Class
#' @format An \code{R6Class} generator object
#' @field report_type  character [optional]
#' @field catalog_id ID of the catalog entity. character [optional]
#' @field code The event code that a diagnostics aggregated number references integer [optional]
#' @field code_label A human-friendly label for the event code (e.g, 'SPAM') character [optional]
#' @field message Title message describing the diagnostic issue character [optional]
#' @field occurrences Number of occurrences of the issue integer [optional]
#' @field ineligible_for_ads Indicates if issue makes items ineligible for ads distribution character [optional]
#' @field ineligible_for_organic Indicates if issue makes items ineligible for organic distribution character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReportDistributionStats <- R6::R6Class(
  "CatalogsReportDistributionStats",
  public = list(
    `report_type` = NULL,
    `catalog_id` = NULL,
    `code` = NULL,
    `code_label` = NULL,
    `message` = NULL,
    `occurrences` = NULL,
    `ineligible_for_ads` = NULL,
    `ineligible_for_organic` = NULL,

    #' @description
    #' Initialize a new CatalogsReportDistributionStats class.
    #'
    #' @param report_type report_type
    #' @param catalog_id ID of the catalog entity.
    #' @param code The event code that a diagnostics aggregated number references
    #' @param code_label A human-friendly label for the event code (e.g, 'SPAM')
    #' @param message Title message describing the diagnostic issue
    #' @param occurrences Number of occurrences of the issue
    #' @param ineligible_for_ads Indicates if issue makes items ineligible for ads distribution
    #' @param ineligible_for_organic Indicates if issue makes items ineligible for organic distribution
    #' @param ... Other optional arguments.
    initialize = function(`report_type` = NULL, `catalog_id` = NULL, `code` = NULL, `code_label` = NULL, `message` = NULL, `occurrences` = NULL, `ineligible_for_ads` = NULL, `ineligible_for_organic` = NULL, ...) {
      if (!is.null(`report_type`)) {
        if (!(`report_type` %in% c("DISTRIBUTION_ISSUES"))) {
          stop(paste("Error! \"", `report_type`, "\" cannot be assigned to `report_type`. Must be \"DISTRIBUTION_ISSUES\".", sep = ""))
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
      if (!is.null(`ineligible_for_ads`)) {
        if (!(is.logical(`ineligible_for_ads`) && length(`ineligible_for_ads`) == 1)) {
          stop(paste("Error! Invalid data for `ineligible_for_ads`. Must be a boolean:", `ineligible_for_ads`))
        }
        self$`ineligible_for_ads` <- `ineligible_for_ads`
      }
      if (!is.null(`ineligible_for_organic`)) {
        if (!(is.logical(`ineligible_for_organic`) && length(`ineligible_for_organic`) == 1)) {
          stop(paste("Error! Invalid data for `ineligible_for_organic`. Must be a boolean:", `ineligible_for_organic`))
        }
        self$`ineligible_for_organic` <- `ineligible_for_organic`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportDistributionStats in JSON format
    toJSON = function() {
      CatalogsReportDistributionStatsObject <- list()
      if (!is.null(self$`report_type`)) {
        CatalogsReportDistributionStatsObject[["report_type"]] <-
          self$`report_type`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsReportDistributionStatsObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`code`)) {
        CatalogsReportDistributionStatsObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`code_label`)) {
        CatalogsReportDistributionStatsObject[["code_label"]] <-
          self$`code_label`
      }
      if (!is.null(self$`message`)) {
        CatalogsReportDistributionStatsObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`occurrences`)) {
        CatalogsReportDistributionStatsObject[["occurrences"]] <-
          self$`occurrences`
      }
      if (!is.null(self$`ineligible_for_ads`)) {
        CatalogsReportDistributionStatsObject[["ineligible_for_ads"]] <-
          self$`ineligible_for_ads`
      }
      if (!is.null(self$`ineligible_for_organic`)) {
        CatalogsReportDistributionStatsObject[["ineligible_for_organic"]] <-
          self$`ineligible_for_organic`
      }
      CatalogsReportDistributionStatsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportDistributionStats
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportDistributionStats
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_type`)) {
        if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("DISTRIBUTION_ISSUES"))) {
          stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"DISTRIBUTION_ISSUES\".", sep = ""))
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
      if (!is.null(this_object$`ineligible_for_ads`)) {
        self$`ineligible_for_ads` <- this_object$`ineligible_for_ads`
      }
      if (!is.null(this_object$`ineligible_for_organic`)) {
        self$`ineligible_for_organic` <- this_object$`ineligible_for_organic`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportDistributionStats in JSON format
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
        if (!is.null(self$`ineligible_for_ads`)) {
          sprintf(
          '"ineligible_for_ads":
            %s
                    ',
          tolower(self$`ineligible_for_ads`)
          )
        },
        if (!is.null(self$`ineligible_for_organic`)) {
          sprintf(
          '"ineligible_for_organic":
            %s
                    ',
          tolower(self$`ineligible_for_organic`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportDistributionStats
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportDistributionStats
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("DISTRIBUTION_ISSUES"))) {
        stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"DISTRIBUTION_ISSUES\".", sep = ""))
      }
      self$`report_type` <- this_object$`report_type`
      self$`catalog_id` <- this_object$`catalog_id`
      self$`code` <- this_object$`code`
      self$`code_label` <- this_object$`code_label`
      self$`message` <- this_object$`message`
      self$`occurrences` <- this_object$`occurrences`
      self$`ineligible_for_ads` <- this_object$`ineligible_for_ads`
      self$`ineligible_for_organic` <- this_object$`ineligible_for_organic`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsReportDistributionStats and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsReportDistributionStats
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
# CatalogsReportDistributionStats$unlock()
#
## Below is an example to define the print function
# CatalogsReportDistributionStats$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsReportDistributionStats$lock()

