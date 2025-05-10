#' Create a new TopPinsAnalyticsResponse
#'
#' @description
#' TopPinsAnalyticsResponse Class
#'
#' @docType class
#' @title TopPinsAnalyticsResponse
#' @description TopPinsAnalyticsResponse Class
#' @format An \code{R6Class} generator object
#' @field date_availability  \link{TopPinsAnalyticsResponseDateAvailability} [optional]
#' @field pins  list(\link{TopPinsAnalyticsResponsePinsInner}) [optional]
#' @field sort_by  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
TopPinsAnalyticsResponse <- R6::R6Class(
  "TopPinsAnalyticsResponse",
  public = list(
    `date_availability` = NULL,
    `pins` = NULL,
    `sort_by` = NULL,

    #' @description
    #' Initialize a new TopPinsAnalyticsResponse class.
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
        if (!(`sort_by` %in% c("ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK"))) {
          stop(paste("Error! \"", `sort_by`, "\" cannot be assigned to `sort_by`. Must be \"ENGAGEMENT\", \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"PIN_CLICK\".", sep = ""))
        }
        if (!(is.character(`sort_by`) && length(`sort_by`) == 1)) {
          stop(paste("Error! Invalid data for `sort_by`. Must be a string:", `sort_by`))
        }
        self$`sort_by` <- `sort_by`
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
    #' @return TopPinsAnalyticsResponse as a base R list.
    #' @examples
    #' # convert array of TopPinsAnalyticsResponse (x) to a data frame
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
    #' Convert TopPinsAnalyticsResponse to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      TopPinsAnalyticsResponseObject <- list()
      if (!is.null(self$`date_availability`)) {
        TopPinsAnalyticsResponseObject[["date_availability"]] <-
          self$`date_availability`$toSimpleType()
      }
      if (!is.null(self$`pins`)) {
        TopPinsAnalyticsResponseObject[["pins"]] <-
          lapply(self$`pins`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`sort_by`)) {
        TopPinsAnalyticsResponseObject[["sort_by"]] <-
          self$`sort_by`
      }
      return(TopPinsAnalyticsResponseObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponse
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`date_availability`)) {
        `date_availability_object` <- TopPinsAnalyticsResponseDateAvailability$new()
        `date_availability_object`$fromJSON(jsonlite::toJSON(this_object$`date_availability`, auto_unbox = TRUE, digits = NA))
        self$`date_availability` <- `date_availability_object`
      }
      if (!is.null(this_object$`pins`)) {
        self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TopPinsAnalyticsResponsePinsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`sort_by`)) {
        if (!is.null(this_object$`sort_by`) && !(this_object$`sort_by` %in% c("ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK"))) {
          stop(paste("Error! \"", this_object$`sort_by`, "\" cannot be assigned to `sort_by`. Must be \"ENGAGEMENT\", \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"PIN_CLICK\".", sep = ""))
        }
        self$`sort_by` <- this_object$`sort_by`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return TopPinsAnalyticsResponse in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of TopPinsAnalyticsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of TopPinsAnalyticsResponse
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`date_availability` <- TopPinsAnalyticsResponseDateAvailability$new()$fromJSON(jsonlite::toJSON(this_object$`date_availability`, auto_unbox = TRUE, digits = NA))
      self$`pins` <- ApiClient$new()$deserializeObj(this_object$`pins`, "array[TopPinsAnalyticsResponsePinsInner]", loadNamespace("openapi"))
      if (!is.null(this_object$`sort_by`) && !(this_object$`sort_by` %in% c("ENGAGEMENT", "SAVE", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK"))) {
        stop(paste("Error! \"", this_object$`sort_by`, "\" cannot be assigned to `sort_by`. Must be \"ENGAGEMENT\", \"SAVE\", \"IMPRESSION\", \"OUTBOUND_CLICK\", \"PIN_CLICK\".", sep = ""))
      }
      self$`sort_by` <- this_object$`sort_by`
      self
    },

    #' @description
    #' Validate JSON input with respect to TopPinsAnalyticsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of TopPinsAnalyticsResponse
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
# TopPinsAnalyticsResponse$unlock()
#
## Below is an example to define the print function
# TopPinsAnalyticsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# TopPinsAnalyticsResponse$lock()

