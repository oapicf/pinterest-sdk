#' Create a new AdsAnalyticsMetricsFilter
#'
#' @description
#' AdsAnalyticsMetricsFilter Class
#'
#' @docType class
#' @title AdsAnalyticsMetricsFilter
#' @description AdsAnalyticsMetricsFilter Class
#' @format An \code{R6Class} generator object
#' @field field  \link{AdsAnalyticsFilterColumn}
#' @field operator  \link{AdsAnalyticsFilterOperator}
#' @field values List of values for filtering list(numeric)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdsAnalyticsMetricsFilter <- R6::R6Class(
  "AdsAnalyticsMetricsFilter",
  public = list(
    `field` = NULL,
    `operator` = NULL,
    `values` = NULL,
    #' Initialize a new AdsAnalyticsMetricsFilter class.
    #'
    #' @description
    #' Initialize a new AdsAnalyticsMetricsFilter class.
    #'
    #' @param field field
    #' @param operator operator
    #' @param values List of values for filtering
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`field`, `operator`, `values`, ...) {
      if (!missing(`field`)) {
        if (!(`field` %in% c())) {
          stop(paste("Error! \"", `field`, "\" cannot be assigned to `field`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`field`))
        self$`field` <- `field`
      }
      if (!missing(`operator`)) {
        if (!(`operator` %in% c())) {
          stop(paste("Error! \"", `operator`, "\" cannot be assigned to `operator`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`operator`))
        self$`operator` <- `operator`
      }
      if (!missing(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(is.character(x)))
        self$`values` <- `values`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsMetricsFilter in JSON format
    #' @export
    toJSON = function() {
      AdsAnalyticsMetricsFilterObject <- list()
      if (!is.null(self$`field`)) {
        AdsAnalyticsMetricsFilterObject[["field"]] <-
          self$`field`$toJSON()
      }
      if (!is.null(self$`operator`)) {
        AdsAnalyticsMetricsFilterObject[["operator"]] <-
          self$`operator`$toJSON()
      }
      if (!is.null(self$`values`)) {
        AdsAnalyticsMetricsFilterObject[["values"]] <-
          self$`values`
      }
      AdsAnalyticsMetricsFilterObject
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsMetricsFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsMetricsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsMetricsFilter
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`field`)) {
        `field_object` <- AdsAnalyticsFilterColumn$new()
        `field_object`$fromJSON(jsonlite::toJSON(this_object$`field`, auto_unbox = TRUE, digits = NA))
        self$`field` <- `field_object`
      }
      if (!is.null(this_object$`operator`)) {
        `operator_object` <- AdsAnalyticsFilterOperator$new()
        `operator_object`$fromJSON(jsonlite::toJSON(this_object$`operator`, auto_unbox = TRUE, digits = NA))
        self$`operator` <- `operator_object`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[numeric]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return AdsAnalyticsMetricsFilter in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`field`)) {
          sprintf(
          '"field":
          %s
          ',
          jsonlite::toJSON(self$`field`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`operator`)) {
          sprintf(
          '"operator":
          %s
          ',
          jsonlite::toJSON(self$`operator`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`values`)) {
          sprintf(
          '"values":
             [%s]
          ',
          paste(unlist(lapply(self$`values`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of AdsAnalyticsMetricsFilter
    #'
    #' @description
    #' Deserialize JSON string into an instance of AdsAnalyticsMetricsFilter
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdsAnalyticsMetricsFilter
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`field` <- AdsAnalyticsFilterColumn$new()$fromJSON(jsonlite::toJSON(this_object$`field`, auto_unbox = TRUE, digits = NA))
      self$`operator` <- AdsAnalyticsFilterOperator$new()$fromJSON(jsonlite::toJSON(this_object$`operator`, auto_unbox = TRUE, digits = NA))
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[numeric]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to AdsAnalyticsMetricsFilter
    #'
    #' @description
    #' Validate JSON input with respect to AdsAnalyticsMetricsFilter and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `field`
      if (!is.null(input_json$`field`)) {
        stopifnot(R6::is.R6(input_json$`field`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsMetricsFilter: the required field `field` is missing."))
      }
      # check the required field `operator`
      if (!is.null(input_json$`operator`)) {
        stopifnot(R6::is.R6(input_json$`operator`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsMetricsFilter: the required field `operator` is missing."))
      }
      # check the required field `values`
      if (!is.null(input_json$`values`)) {
        stopifnot(is.vector(input_json$`values`), length(input_json$`values`) != 0)
        tmp <- sapply(input_json$`values`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdsAnalyticsMetricsFilter: the required field `values` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdsAnalyticsMetricsFilter
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
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        return(FALSE)
      }

      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        return(FALSE)
      }

      # check if the required `values` is null
      if (is.null(self$`values`)) {
        return(FALSE)
      }

      if (length(self$`values`) < 1) {
        return(FALSE)
      }

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
      # check if the required `field` is null
      if (is.null(self$`field`)) {
        invalid_fields["field"] <- "Non-nullable required field `field` cannot be null."
      }

      # check if the required `operator` is null
      if (is.null(self$`operator`)) {
        invalid_fields["operator"] <- "Non-nullable required field `operator` cannot be null."
      }

      # check if the required `values` is null
      if (is.null(self$`values`)) {
        invalid_fields["values"] <- "Non-nullable required field `values` cannot be null."
      }

      if (length(self$`values`) < 1) {
        invalid_fields["values"] <- "Invalid length for ``, number of items must be greater than or equal to 1."
      }

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
# AdsAnalyticsMetricsFilter$unlock()
#
## Below is an example to define the print function
# AdsAnalyticsMetricsFilter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdsAnalyticsMetricsFilter$lock()

