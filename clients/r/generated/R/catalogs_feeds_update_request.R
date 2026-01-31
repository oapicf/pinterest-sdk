#' Create a new CatalogsFeedsUpdateRequest
#'
#' @description
#' Request object for updating a feed.
#'
#' @docType class
#' @title CatalogsFeedsUpdateRequest
#' @description CatalogsFeedsUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field credentials  \link{CatalogsFeedCredentials} [optional]
#' @field default_availability  \link{ProductAvailabilityType} [optional]
#' @field default_currency  \link{NullableCurrency} [optional]
#' @field format  \link{CatalogsFormat} [optional]
#' @field location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. character [optional]
#' @field name A human-friendly name associated to a given feed. character [optional]
#' @field preferred_processing_schedule  \link{CatalogsFeedProcessingSchedule} [optional]
#' @field status  \link{CatalogsStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedsUpdateRequest <- R6::R6Class(
  "CatalogsFeedsUpdateRequest",
  public = list(
    `credentials` = NULL,
    `default_availability` = NULL,
    `default_currency` = NULL,
    `format` = NULL,
    `location` = NULL,
    `name` = NULL,
    `preferred_processing_schedule` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CatalogsFeedsUpdateRequest class.
    #'
    #' @param credentials credentials
    #' @param default_availability default_availability
    #' @param default_currency default_currency
    #' @param format format
    #' @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    #' @param name A human-friendly name associated to a given feed.
    #' @param preferred_processing_schedule preferred_processing_schedule
    #' @param status status
    #' @param ... Other optional arguments.
    initialize = function(`credentials` = NULL, `default_availability` = NULL, `default_currency` = NULL, `format` = NULL, `location` = NULL, `name` = NULL, `preferred_processing_schedule` = NULL, `status` = NULL, ...) {
      if (!is.null(`credentials`)) {
        stopifnot(R6::is.R6(`credentials`))
        self$`credentials` <- `credentials`
      }
      if (!is.null(`default_availability`)) {
        if (!(`default_availability` %in% c())) {
          stop(paste("Error! \"", `default_availability`, "\" cannot be assigned to `default_availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_availability`))
        self$`default_availability` <- `default_availability`
      }
      if (!is.null(`default_currency`)) {
        if (!(`default_currency` %in% c())) {
          stop(paste("Error! \"", `default_currency`, "\" cannot be assigned to `default_currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_currency`))
        self$`default_currency` <- `default_currency`
      }
      if (!is.null(`format`)) {
        if (!(`format` %in% c())) {
          stop(paste("Error! \"", `format`, "\" cannot be assigned to `format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`format`))
        self$`format` <- `format`
      }
      if (!is.null(`location`)) {
        if (!(is.character(`location`) && length(`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", `location`))
        }
        self$`location` <- `location`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`preferred_processing_schedule`)) {
        stopifnot(R6::is.R6(`preferred_processing_schedule`))
        self$`preferred_processing_schedule` <- `preferred_processing_schedule`
      }
      if (!is.null(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
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
    #' @return CatalogsFeedsUpdateRequest as a base R list.
    #' @examples
    #' # convert array of CatalogsFeedsUpdateRequest (x) to a data frame
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
    #' Convert CatalogsFeedsUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsFeedsUpdateRequestObject <- list()
      if (!is.null(self$`credentials`)) {
        CatalogsFeedsUpdateRequestObject[["credentials"]] <-
          self$`credentials`$toSimpleType()
      }
      if (!is.null(self$`default_availability`)) {
        CatalogsFeedsUpdateRequestObject[["default_availability"]] <-
          self$`default_availability`$toSimpleType()
      }
      if (!is.null(self$`default_currency`)) {
        CatalogsFeedsUpdateRequestObject[["default_currency"]] <-
          self$`default_currency`$toSimpleType()
      }
      if (!is.null(self$`format`)) {
        CatalogsFeedsUpdateRequestObject[["format"]] <-
          self$`format`$toSimpleType()
      }
      if (!is.null(self$`location`)) {
        CatalogsFeedsUpdateRequestObject[["location"]] <-
          self$`location`
      }
      if (!is.null(self$`name`)) {
        CatalogsFeedsUpdateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`preferred_processing_schedule`)) {
        CatalogsFeedsUpdateRequestObject[["preferred_processing_schedule"]] <-
          self$`preferred_processing_schedule`$toSimpleType()
      }
      if (!is.null(self$`status`)) {
        CatalogsFeedsUpdateRequestObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(CatalogsFeedsUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedsUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`credentials`)) {
        `credentials_object` <- CatalogsFeedCredentials$new()
        `credentials_object`$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
        self$`credentials` <- `credentials_object`
      }
      if (!is.null(this_object$`default_availability`)) {
        `default_availability_object` <- ProductAvailabilityType$new()
        `default_availability_object`$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
        self$`default_availability` <- `default_availability_object`
      }
      if (!is.null(this_object$`default_currency`)) {
        `default_currency_object` <- NullableCurrency$new()
        `default_currency_object`$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
        self$`default_currency` <- `default_currency_object`
      }
      if (!is.null(this_object$`format`)) {
        `format_object` <- CatalogsFormat$new()
        `format_object`$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
        self$`format` <- `format_object`
      }
      if (!is.null(this_object$`location`)) {
        self$`location` <- this_object$`location`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`preferred_processing_schedule`)) {
        `preferred_processing_schedule_object` <- CatalogsFeedProcessingSchedule$new()
        `preferred_processing_schedule_object`$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
        self$`preferred_processing_schedule` <- `preferred_processing_schedule_object`
      }
      if (!is.null(this_object$`status`)) {
        `status_object` <- CatalogsStatus$new()
        `status_object`$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
        self$`status` <- `status_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CatalogsFeedsUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedsUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`credentials` <- CatalogsFeedCredentials$new()$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
      self$`default_availability` <- ProductAvailabilityType$new()$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
      self$`default_currency` <- NullableCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
      self$`format` <- CatalogsFormat$new()$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
      self$`location` <- this_object$`location`
      self$`name` <- this_object$`name`
      self$`preferred_processing_schedule` <- CatalogsFeedProcessingSchedule$new()$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
      self$`status` <- CatalogsStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsFeedsUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedsUpdateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`location`, "^(http|https|ftp|sftp):/")) {
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
      if (!str_detect(self$`location`, "^(http|https|ftp|sftp):/")) {
        invalid_fields["location"] <- "Invalid value for `location`, must conform to the pattern ^(http|https|ftp|sftp):/."
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
# CatalogsFeedsUpdateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsFeedsUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedsUpdateRequest$lock()

