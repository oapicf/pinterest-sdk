#' Create a new CatalogsReportDistributionIssueFilter
#'
#' @description
#' CatalogsReportDistributionIssueFilter Class
#'
#' @docType class
#' @title CatalogsReportDistributionIssueFilter
#' @description CatalogsReportDistributionIssueFilter Class
#' @format An \code{R6Class} generator object
#' @field report_type  character
#' @field catalog_id Unique identifier of a catalog. If not given, oldest catalog will be used character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReportDistributionIssueFilter <- R6::R6Class(
  "CatalogsReportDistributionIssueFilter",
  public = list(
    `report_type` = NULL,
    `catalog_id` = NULL,

    #' @description
    #' Initialize a new CatalogsReportDistributionIssueFilter class.
    #'
    #' @param report_type report_type
    #' @param catalog_id Unique identifier of a catalog. If not given, oldest catalog will be used
    #' @param ... Other optional arguments.
    initialize = function(`report_type`, `catalog_id` = NULL, ...) {
      if (!missing(`report_type`)) {
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportDistributionIssueFilter in JSON format
    toJSON = function() {
      CatalogsReportDistributionIssueFilterObject <- list()
      if (!is.null(self$`report_type`)) {
        CatalogsReportDistributionIssueFilterObject[["report_type"]] <-
          self$`report_type`
      }
      if (!is.null(self$`catalog_id`)) {
        CatalogsReportDistributionIssueFilterObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      CatalogsReportDistributionIssueFilterObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportDistributionIssueFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportDistributionIssueFilter
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
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CatalogsReportDistributionIssueFilter in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportDistributionIssueFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportDistributionIssueFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("DISTRIBUTION_ISSUES"))) {
        stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"DISTRIBUTION_ISSUES\".", sep = ""))
      }
      self$`report_type` <- this_object$`report_type`
      self$`catalog_id` <- this_object$`catalog_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsReportDistributionIssueFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `report_type`
      if (!is.null(input_json$`report_type`)) {
        if (!(is.character(input_json$`report_type`) && length(input_json$`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", input_json$`report_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsReportDistributionIssueFilter: the required field `report_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsReportDistributionIssueFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
        return(FALSE)
      }

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
      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
        invalid_fields["report_type"] <- "Non-nullable required field `report_type` cannot be null."
      }

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
# CatalogsReportDistributionIssueFilter$unlock()
#
## Below is an example to define the print function
# CatalogsReportDistributionIssueFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsReportDistributionIssueFilter$lock()

