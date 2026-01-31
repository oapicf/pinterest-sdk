#' Create a new CatalogsReportFeedIngestionFilter
#'
#' @description
#' CatalogsReportFeedIngestionFilter Class
#'
#' @docType class
#' @title CatalogsReportFeedIngestionFilter
#' @description CatalogsReportFeedIngestionFilter Class
#' @format An \code{R6Class} generator object
#' @field feed_id ID of the feed entity. character
#' @field processing_result_id Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. character [optional]
#' @field report_type  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsReportFeedIngestionFilter <- R6::R6Class(
  "CatalogsReportFeedIngestionFilter",
  public = list(
    `feed_id` = NULL,
    `processing_result_id` = NULL,
    `report_type` = NULL,

    #' @description
    #' Initialize a new CatalogsReportFeedIngestionFilter class.
    #'
    #' @param feed_id ID of the feed entity.
    #' @param report_type report_type
    #' @param processing_result_id Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
    #' @param ... Other optional arguments.
    initialize = function(`feed_id`, `report_type`, `processing_result_id` = NULL, ...) {
      if (!missing(`feed_id`)) {
        if (!(is.character(`feed_id`) && length(`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", `feed_id`))
        }
        self$`feed_id` <- `feed_id`
      }
      if (!missing(`report_type`)) {
        if (!(`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
          stop(paste("Error! \"", `report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
        }
        if (!(is.character(`report_type`) && length(`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", `report_type`))
        }
        self$`report_type` <- `report_type`
      }
      if (!is.null(`processing_result_id`)) {
        if (!(is.character(`processing_result_id`) && length(`processing_result_id`) == 1)) {
          stop(paste("Error! Invalid data for `processing_result_id`. Must be a string:", `processing_result_id`))
        }
        self$`processing_result_id` <- `processing_result_id`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CatalogsReportFeedIngestionFilter as a base R list.
    #' @examples
    #' # convert array of CatalogsReportFeedIngestionFilter (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CatalogsReportFeedIngestionFilter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsReportFeedIngestionFilterObject <- list()
      if (!is.null(self$`feed_id`)) {
        CatalogsReportFeedIngestionFilterObject[["feed_id"]] <-
          self$`feed_id`
      }
      if (!is.null(self$`processing_result_id`)) {
        CatalogsReportFeedIngestionFilterObject[["processing_result_id"]] <-
          self$`processing_result_id`
      }
      if (!is.null(self$`report_type`)) {
        CatalogsReportFeedIngestionFilterObject[["report_type"]] <-
          self$`report_type`
      }
      return(CatalogsReportFeedIngestionFilterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportFeedIngestionFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportFeedIngestionFilter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`feed_id`)) {
        self$`feed_id` <- this_object$`feed_id`
      }
      if (!is.null(this_object$`processing_result_id`)) {
        self$`processing_result_id` <- this_object$`processing_result_id`
      }
      if (!is.null(this_object$`report_type`)) {
        if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
          stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
        }
        self$`report_type` <- this_object$`report_type`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsReportFeedIngestionFilter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsReportFeedIngestionFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsReportFeedIngestionFilter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`feed_id` <- this_object$`feed_id`
      self$`processing_result_id` <- this_object$`processing_result_id`
      if (!is.null(this_object$`report_type`) && !(this_object$`report_type` %in% c("FEED_INGESTION_ISSUES"))) {
        stop(paste("Error! \"", this_object$`report_type`, "\" cannot be assigned to `report_type`. Must be \"FEED_INGESTION_ISSUES\".", sep = ""))
      }
      self$`report_type` <- this_object$`report_type`
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsReportFeedIngestionFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `feed_id`
      if (!is.null(input_json$`feed_id`)) {
        if (!(is.character(input_json$`feed_id`) && length(input_json$`feed_id`) == 1)) {
          stop(paste("Error! Invalid data for `feed_id`. Must be a string:", input_json$`feed_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsReportFeedIngestionFilter: the required field `feed_id` is missing."))
      }
      # check the required field `report_type`
      if (!is.null(input_json$`report_type`)) {
        if (!(is.character(input_json$`report_type`) && length(input_json$`report_type`) == 1)) {
          stop(paste("Error! Invalid data for `report_type`. Must be a string:", input_json$`report_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsReportFeedIngestionFilter: the required field `report_type` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsReportFeedIngestionFilter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        return(FALSE)
      }

      if (!str_detect(self$`processing_result_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
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
      # check if the required `feed_id` is null
      if (is.null(self$`feed_id`)) {
        invalid_fields["feed_id"] <- "Non-nullable required field `feed_id` cannot be null."
      }

      if (!str_detect(self$`feed_id`, "^\\d+$")) {
        invalid_fields["feed_id"] <- "Invalid value for `feed_id`, must conform to the pattern ^\\d+$."
      }

      if (!str_detect(self$`processing_result_id`, "^\\d+$")) {
        invalid_fields["processing_result_id"] <- "Invalid value for `processing_result_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `report_type` is null
      if (is.null(self$`report_type`)) {
        invalid_fields["report_type"] <- "Non-nullable required field `report_type` cannot be null."
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
# CatalogsReportFeedIngestionFilter$unlock()
#
## Below is an example to define the print function
# CatalogsReportFeedIngestionFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsReportFeedIngestionFilter$lock()

