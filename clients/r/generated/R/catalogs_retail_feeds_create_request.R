#' Create a new CatalogsRetailFeedsCreateRequest
#'
#' @description
#' Request object for creating a retail feed.
#'
#' @docType class
#' @title CatalogsRetailFeedsCreateRequest
#' @description CatalogsRetailFeedsCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field catalog_id Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. character [optional]
#' @field catalog_type  \link{CatalogsType}
#' @field credentials  \link{CatalogsFeedCredentials} [optional]
#' @field default_availability  \link{ProductAvailabilityType} [optional]
#' @field default_country  \link{Country}
#' @field default_currency  \link{NullableCurrency} [optional]
#' @field default_locale  \link{CatalogsFeedsCreateRequestDefaultLocale}
#' @field format  \link{CatalogsFormat}
#' @field location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. character
#' @field name A human-friendly name associated to a given feed. character
#' @field preferred_processing_schedule  \link{CatalogsFeedProcessingSchedule} [optional]
#' @field status  \link{CatalogsStatus} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailFeedsCreateRequest <- R6::R6Class(
  "CatalogsRetailFeedsCreateRequest",
  public = list(
    `catalog_id` = NULL,
    `catalog_type` = NULL,
    `credentials` = NULL,
    `default_availability` = NULL,
    `default_country` = NULL,
    `default_currency` = NULL,
    `default_locale` = NULL,
    `format` = NULL,
    `location` = NULL,
    `name` = NULL,
    `preferred_processing_schedule` = NULL,
    `status` = NULL,

    #' @description
    #' Initialize a new CatalogsRetailFeedsCreateRequest class.
    #'
    #' @param catalog_type catalog_type
    #' @param default_country default_country
    #' @param default_locale default_locale
    #' @param format format
    #' @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    #' @param name A human-friendly name associated to a given feed.
    #' @param catalog_id Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect.
    #' @param credentials credentials
    #' @param default_availability default_availability
    #' @param default_currency default_currency
    #' @param preferred_processing_schedule preferred_processing_schedule
    #' @param status status. Default to "ACTIVE".
    #' @param ... Other optional arguments.
    initialize = function(`catalog_type`, `default_country`, `default_locale`, `format`, `location`, `name`, `catalog_id` = NULL, `credentials` = NULL, `default_availability` = NULL, `default_currency` = NULL, `preferred_processing_schedule` = NULL, `status` = "ACTIVE", ...) {
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`default_country`)) {
        if (!(`default_country` %in% c())) {
          stop(paste("Error! \"", `default_country`, "\" cannot be assigned to `default_country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_country`))
        self$`default_country` <- `default_country`
      }
      if (!missing(`default_locale`)) {
        stopifnot(R6::is.R6(`default_locale`))
        self$`default_locale` <- `default_locale`
      }
      if (!missing(`format`)) {
        if (!(`format` %in% c())) {
          stop(paste("Error! \"", `format`, "\" cannot be assigned to `format`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`format`))
        self$`format` <- `format`
      }
      if (!missing(`location`)) {
        if (!(is.character(`location`) && length(`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", `location`))
        }
        self$`location` <- `location`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`catalog_id`)) {
        if (!(is.character(`catalog_id`) && length(`catalog_id`) == 1)) {
          stop(paste("Error! Invalid data for `catalog_id`. Must be a string:", `catalog_id`))
        }
        self$`catalog_id` <- `catalog_id`
      }
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
    #' @return CatalogsRetailFeedsCreateRequest as a base R list.
    #' @examples
    #' # convert array of CatalogsRetailFeedsCreateRequest (x) to a data frame
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
    #' Convert CatalogsRetailFeedsCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CatalogsRetailFeedsCreateRequestObject <- list()
      if (!is.null(self$`catalog_id`)) {
        CatalogsRetailFeedsCreateRequestObject[["catalog_id"]] <-
          self$`catalog_id`
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailFeedsCreateRequestObject[["catalog_type"]] <-
          self$`catalog_type`$toSimpleType()
      }
      if (!is.null(self$`credentials`)) {
        CatalogsRetailFeedsCreateRequestObject[["credentials"]] <-
          self$`credentials`$toSimpleType()
      }
      if (!is.null(self$`default_availability`)) {
        CatalogsRetailFeedsCreateRequestObject[["default_availability"]] <-
          self$`default_availability`$toSimpleType()
      }
      if (!is.null(self$`default_country`)) {
        CatalogsRetailFeedsCreateRequestObject[["default_country"]] <-
          self$`default_country`$toSimpleType()
      }
      if (!is.null(self$`default_currency`)) {
        CatalogsRetailFeedsCreateRequestObject[["default_currency"]] <-
          self$`default_currency`$toSimpleType()
      }
      if (!is.null(self$`default_locale`)) {
        CatalogsRetailFeedsCreateRequestObject[["default_locale"]] <-
          self$`default_locale`$toSimpleType()
      }
      if (!is.null(self$`format`)) {
        CatalogsRetailFeedsCreateRequestObject[["format"]] <-
          self$`format`$toSimpleType()
      }
      if (!is.null(self$`location`)) {
        CatalogsRetailFeedsCreateRequestObject[["location"]] <-
          self$`location`
      }
      if (!is.null(self$`name`)) {
        CatalogsRetailFeedsCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`preferred_processing_schedule`)) {
        CatalogsRetailFeedsCreateRequestObject[["preferred_processing_schedule"]] <-
          self$`preferred_processing_schedule`$toSimpleType()
      }
      if (!is.null(self$`status`)) {
        CatalogsRetailFeedsCreateRequestObject[["status"]] <-
          self$`status`$toSimpleType()
      }
      return(CatalogsRetailFeedsCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFeedsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFeedsCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`catalog_id`)) {
        self$`catalog_id` <- this_object$`catalog_id`
      }
      if (!is.null(this_object$`catalog_type`)) {
        `catalog_type_object` <- CatalogsType$new()
        `catalog_type_object`$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
        self$`catalog_type` <- `catalog_type_object`
      }
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
      if (!is.null(this_object$`default_country`)) {
        `default_country_object` <- Country$new()
        `default_country_object`$fromJSON(jsonlite::toJSON(this_object$`default_country`, auto_unbox = TRUE, digits = NA))
        self$`default_country` <- `default_country_object`
      }
      if (!is.null(this_object$`default_currency`)) {
        `default_currency_object` <- NullableCurrency$new()
        `default_currency_object`$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
        self$`default_currency` <- `default_currency_object`
      }
      if (!is.null(this_object$`default_locale`)) {
        `default_locale_object` <- CatalogsFeedsCreateRequestDefaultLocale$new()
        `default_locale_object`$fromJSON(jsonlite::toJSON(this_object$`default_locale`, auto_unbox = TRUE, digits = NA))
        self$`default_locale` <- `default_locale_object`
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
    #' @return CatalogsRetailFeedsCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFeedsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFeedsCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`catalog_id` <- this_object$`catalog_id`
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`credentials` <- CatalogsFeedCredentials$new()$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
      self$`default_availability` <- ProductAvailabilityType$new()$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
      self$`default_country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`default_country`, auto_unbox = TRUE, digits = NA))
      self$`default_currency` <- NullableCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
      self$`default_locale` <- CatalogsFeedsCreateRequestDefaultLocale$new()$fromJSON(jsonlite::toJSON(this_object$`default_locale`, auto_unbox = TRUE, digits = NA))
      self$`format` <- CatalogsFormat$new()$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
      self$`location` <- this_object$`location`
      self$`name` <- this_object$`name`
      self$`preferred_processing_schedule` <- CatalogsFeedProcessingSchedule$new()$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
      self$`status` <- CatalogsStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CatalogsRetailFeedsCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `catalog_type` is missing."))
      }
      # check the required field `default_country`
      if (!is.null(input_json$`default_country`)) {
        stopifnot(R6::is.R6(input_json$`default_country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `default_country` is missing."))
      }
      # check the required field `default_locale`
      if (!is.null(input_json$`default_locale`)) {
        stopifnot(R6::is.R6(input_json$`default_locale`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `default_locale` is missing."))
      }
      # check the required field `format`
      if (!is.null(input_json$`format`)) {
        stopifnot(R6::is.R6(input_json$`format`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `format` is missing."))
      }
      # check the required field `location`
      if (!is.null(input_json$`location`)) {
        if (!(is.character(input_json$`location`) && length(input_json$`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", input_json$`location`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `location` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeedsCreateRequest: the required field `name` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailFeedsCreateRequest
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

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `default_country` is null
      if (is.null(self$`default_country`)) {
        return(FALSE)
      }

      # check if the required `default_locale` is null
      if (is.null(self$`default_locale`)) {
        return(FALSE)
      }

      # check if the required `format` is null
      if (is.null(self$`format`)) {
        return(FALSE)
      }

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        return(FALSE)
      }

      if (!str_detect(self$`location`, "^(http|https|ftp|sftp):/")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
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

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `default_country` is null
      if (is.null(self$`default_country`)) {
        invalid_fields["default_country"] <- "Non-nullable required field `default_country` cannot be null."
      }

      # check if the required `default_locale` is null
      if (is.null(self$`default_locale`)) {
        invalid_fields["default_locale"] <- "Non-nullable required field `default_locale` cannot be null."
      }

      # check if the required `format` is null
      if (is.null(self$`format`)) {
        invalid_fields["format"] <- "Non-nullable required field `format` cannot be null."
      }

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        invalid_fields["location"] <- "Non-nullable required field `location` cannot be null."
      }

      if (!str_detect(self$`location`, "^(http|https|ftp|sftp):/")) {
        invalid_fields["location"] <- "Invalid value for `location`, must conform to the pattern ^(http|https|ftp|sftp):/."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CatalogsRetailFeedsCreateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsRetailFeedsCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailFeedsCreateRequest$lock()

