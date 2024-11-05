#' Create a new TopVideoPinsAnalyticsResponse
#'
#' @description
#' TopVideoPinsAnalyticsResponse Class
#'
#' @docType class
#' @title TopVideoPinsAnalyticsResponse
#' @description TopVideoPinsAnalyticsResponse Class
#' @format An \code{R6Class} generator object
#' @field date_availability  \link{TopPinsAnalyticsResponseDateAvailability} [optional]
#' @field pins  list(\link{TopVideoPinsAnalyticsResponsePinsInner}) [optional]
#' @field sort_by  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopVideoPinsAnalyticsResponse <- R6::R6Class(
  "TopVideoPinsAnalyticsResponse",
  public = list(
    `date_availability` = NULL,
    `pins` = NULL,
    `sort_by` = NULL,

    #' @description
    #' Initialize a new TopVideoPinsAnalyticsResponse class.
    #'
    #' @param date_availability date_availability
    #' @param pins pins
    #' @param sort_by sort_by
    #' @param ... Other optional arguments.
    initialize = function(`date_availability` = NULL, `pins` = NULL, `sort_by` = NULL, ...) {
      if (!is.null(`date_availability`)) {
        stopifnot(R6::is.R6(`date_availability`))
        self$`date_availability` <- `date_availability`
      }
      if (!is.null(`pins`)) {
        stopifnot(is.vector(`pins`), length(`pins`) != 0)
        sapply(`pins`, function(x) stopifnot(R6::is.R6(x)))
        self$`pins` <- `pins`
      }
      if (!is.null(`sort_by`)) {
        if (!(`sort_by` %in% c("SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"))) {
          stop(paste("Error! \"", `sort_by`, "\" cannot be assigned to `sort_by`. Must be \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"VIDEO_MRC_VIEW\", \"VIDEO_AVG_WATCH_TIME\", \"VIDEO_V50_WATCH_TIME\", \"QUARTILE_95_PERCENT_VIEW\", \"VIDEO_10S_VIEW\", \"VIDEO_START\".", sep = ""))
        }
        if (!(is.character(`sort_by`) && length(`sort_by`) == 1)) {
          stop(paste("Error! Invalid data for `sort_by`. Must be a string:", `sort_by`))
        }
        self$`sort_by` <- `sort_by`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return TopVideoPinsAnalyticsResponse in JSON format
    toJSON = function() {
      TopVideoPinsAnalyticsResponseObject <- list()
      if (!is.null(self$`date_availability`)) {
        TopVideoPinsAnalyticsResponseObject[["date_availability"]] <-
          self$`date_availability`$toJSON()
      }
      if (!is.null(self$`pins`)) {
        TopVideoPinsAnalyticsResponseObject[["pins"]] <-
          lapply(self$`pins`, function(x) x$toJSON())
      }
      if (!is.null(self$`sort_by`)) {
        TopVideoPinsAnalyticsResponseObject[["sort_by"]] <-
          self$`sort_by`
      }
      TopVideoPinsAnalyticsResponseObject
    },

    #' @description
    #' Deserialize JSON string into an instance of TopVideoPinsAnalyticsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopVideoPinsAnalyticsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`date_availability`)) {
        `date_availability_object` <- TopPinsAnalyticsResponseDateAvailability$new()
        `date_availability_object`$fromJSON(jsonlite::toJSON(this_object$`date_availability`, auto_unbox = TRUE, digits = NA))
        self$`date_availability` <- `date_availability_object`
      }
      if (!is.null(this_object$`pins`)) {
        self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TopVideoPinsAnalyticsResponsePinsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sort_by`)) {
        if (!is.null(this_object$`sort_by`) && !(this_object$`sort_by` %in% c("SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"))) {
          stop(paste("Error! \"", this_object$`sort_by`, "\" cannot be assigned to `sort_by`. Must be \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"VIDEO_MRC_VIEW\", \"VIDEO_AVG_WATCH_TIME\", \"VIDEO_V50_WATCH_TIME\", \"QUARTILE_95_PERCENT_VIEW\", \"VIDEO_10S_VIEW\", \"VIDEO_START\".", sep = ""))
        }
        self$`sort_by` <- this_object$`sort_by`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return TopVideoPinsAnalyticsResponse in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`date_availability`)) {
          sprintf(
          '"date_availability":
          %s
          ',
          jsonlite::toJSON(self$`date_availability`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`pins`)) {
          sprintf(
          '"pins":
          [%s]
',
          paste(sapply(self$`pins`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`sort_by`)) {
          sprintf(
          '"sort_by":
            "%s"
                    ',
          self$`sort_by`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of TopVideoPinsAnalyticsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopVideoPinsAnalyticsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`date_availability` <- TopPinsAnalyticsResponseDateAvailability$new()$fromJSON(jsonlite::toJSON(this_object$`date_availability`, auto_unbox = TRUE, digits = NA))
      self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TopVideoPinsAnalyticsResponsePinsInner]", loadNamespace("openapi"))
      if (!is.null(this_object$`sort_by`) && !(this_object$`sort_by` %in% c("SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START"))) {
        stop(paste("Error! \"", this_object$`sort_by`, "\" cannot be assigned to `sort_by`. Must be \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"VIDEO_MRC_VIEW\", \"VIDEO_AVG_WATCH_TIME\", \"VIDEO_V50_WATCH_TIME\", \"QUARTILE_95_PERCENT_VIEW\", \"VIDEO_10S_VIEW\", \"VIDEO_START\".", sep = ""))
      }
      self$`sort_by` <- this_object$`sort_by`
      self
    },

    #' @description
    #' Validate JSON input with respect to TopVideoPinsAnalyticsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TopVideoPinsAnalyticsResponse
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
# TopVideoPinsAnalyticsResponse$unlock()
#
## Below is an example to define the print function
# TopVideoPinsAnalyticsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TopVideoPinsAnalyticsResponse$lock()

