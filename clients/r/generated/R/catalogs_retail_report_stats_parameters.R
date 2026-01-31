#' Create a new CatalogsRetailReportStatsParameters
#'
#' @description
#' Parameters for retail report
#'
#' @docType class
#' @title CatalogsRetailReportStatsParameters
#' @description CatalogsRetailReportStatsParameters Class
#' @format An \code{R6Class} generator object
#' @field catalog_type  character
#' @field report  \link{CatalogsHotelReportStatsParametersReport}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailReportStatsParameters <- R6::R6Class(
  "CatalogsRetailReportStatsParameters",
  public = list(
    `catalog_type` = NULL,
    `report` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailReportStatsParameters class.
    #'
    #' @param catalog_type catalog_type
    #' @param report report
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `report`, ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        if (!(is.character(`catalog_type`) && length(`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", `catalog_type`))
        }
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`report`)) {
        stopifnot(R6::is.R6(`report`))
        self$`report` <- `report`
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
    #' @return CatalogsRetailReportStatsParameters as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailReportStatsParameters (x) to a data frame
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
    #' Convert CatalogsRetailReportStatsParameters to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailReportStatsParametersObject <- list()
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailReportStatsParametersObject[["catalog_type"]] <-
          self$`catalog_type`
      }
      if (!is.null(self$`report`)) {
        CatalogsRetailReportStatsParametersObject[["report"]] <-
          self$`report`$toSimpleType()
      }
      return(CatalogsRetailReportStatsParametersObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailReportStatsParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailReportStatsParameters
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`)) {
        if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
          stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
        }
        self$`catalog_type` <- this_object$`catalog_type`
      }
      if (!is.null(this_object$`report`)) {
        `report_object` <- CatalogsHotelReportStatsParametersReport$new()
        `report_object`$fromJSON(jsonlite::toJSON(this_object$`report`, auto_unbox = TRUE, digits = NA))
        self$`report` <- `report_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsRetailReportStatsParameters in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailReportStatsParameters
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailReportStatsParameters
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_type`) && !(this_object$`catalog_type` %in% c("RETAIL"))) {
        stop(paste("Error! \"", this_object$`catalog_type`, "\" cannot be assigned to `catalog_type`. Must be \"RETAIL\".", sep = ""))
      }
      self$`catalog_type` <- this_object$`catalog_type`
      self$`report` <- CatalogsHotelReportStatsParametersReport$new()$fromJSON(jsonlite::toJSON(this_object$`report`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailReportStatsParameters and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        if (!(is.character(input_json$`catalog_type`) && length(input_json$`catalog_type`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_type`. Must be a string:", input_json$`catalog_type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailReportStatsParameters: the required field `catalog_type` is missing."))
      }
      # check the required field `report`
      if (!is.null(input_json$`report`)) {
        stopifnot(R6::is.R6(input_json$`report`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailReportStatsParameters: the required field `report` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailReportStatsParameters
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `report` is null
      if (is.null(self$`report`)) {
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
      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `report` is null
      if (is.null(self$`report`)) {
        invalid_fields["report"] <- "Non-nullable required field `report` cannot be null."
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
# CatalogsRetailReportStatsParameters$unlock()
#
## Below is an example to define the print function
# CatalogsRetailReportStatsParameters$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailReportStatsParameters$lock()

