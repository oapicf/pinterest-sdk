#' Create a new CatalogsFeedsCreateRequest
#'
#' @description
#' Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
#'
#' @docType class
#' @title CatalogsFeedsCreateRequest
#' @description CatalogsFeedsCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field default_currency  \link{NullableCurrency} [optional]
#' @field name A human-friendly name associated to a given feed. character
#' @field format  \link{CatalogsFormat}
#' @field default_locale  \link{CatalogsFeedsCreateRequestDefaultLocale} [optional]
#' @field credentials  \link{CatalogsFeedCredentials} [optional]
#' @field location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. character
#' @field preferred_processing_schedule  \link{CatalogsFeedProcessingSchedule} [optional]
#' @field default_country  \link{Country} [optional]
#' @field default_availability  \link{ProductAvailabilityType} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsFeedsCreateRequest <- R6::R6Class(
  "CatalogsFeedsCreateRequest",
  public = list(
    `default_currency` = NULL,
    `name` = NULL,
    `format` = NULL,
    `default_locale` = NULL,
    `credentials` = NULL,
    `location` = NULL,
    `preferred_processing_schedule` = NULL,
    `default_country` = NULL,
    `default_availability` = NULL,
    #' Initialize a new CatalogsFeedsCreateRequest class.
    #'
    #' @description
    #' Initialize a new CatalogsFeedsCreateRequest class.
    #'
    #' @param name A human-friendly name associated to a given feed.
    #' @param format format
    #' @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    #' @param default_currency default_currency
    #' @param default_locale default_locale
    #' @param credentials credentials
    #' @param preferred_processing_schedule preferred_processing_schedule
    #' @param default_country default_country
    #' @param default_availability default_availability
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `format`, `location`, `default_currency` = NULL, `default_locale` = NULL, `credentials` = NULL, `preferred_processing_schedule` = NULL, `default_country` = NULL, `default_availability` = NULL, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
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
      if (!is.null(`default_currency`)) {
        if (!(`default_currency` %in% c())) {
          stop(paste("Error! \"", `default_currency`, "\" cannot be assigned to `default_currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_currency`))
        self$`default_currency` <- `default_currency`
      }
      if (!is.null(`default_locale`)) {
        stopifnot(R6::is.R6(`default_locale`))
        self$`default_locale` <- `default_locale`
      }
      if (!is.null(`credentials`)) {
        stopifnot(R6::is.R6(`credentials`))
        self$`credentials` <- `credentials`
      }
      if (!is.null(`preferred_processing_schedule`)) {
        stopifnot(R6::is.R6(`preferred_processing_schedule`))
        self$`preferred_processing_schedule` <- `preferred_processing_schedule`
      }
      if (!is.null(`default_country`)) {
        if (!(`default_country` %in% c())) {
          stop(paste("Error! \"", `default_country`, "\" cannot be assigned to `default_country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_country`))
        self$`default_country` <- `default_country`
      }
      if (!is.null(`default_availability`)) {
        if (!(`default_availability` %in% c())) {
          stop(paste("Error! \"", `default_availability`, "\" cannot be assigned to `default_availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_availability`))
        self$`default_availability` <- `default_availability`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedsCreateRequest in JSON format
    #' @export
    toJSON = function() {
      CatalogsFeedsCreateRequestObject <- list()
      if (!is.null(self$`default_currency`)) {
        CatalogsFeedsCreateRequestObject[["default_currency"]] <-
          self$`default_currency`$toJSON()
      }
      if (!is.null(self$`name`)) {
        CatalogsFeedsCreateRequestObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`format`)) {
        CatalogsFeedsCreateRequestObject[["format"]] <-
          self$`format`$toJSON()
      }
      if (!is.null(self$`default_locale`)) {
        CatalogsFeedsCreateRequestObject[["default_locale"]] <-
          self$`default_locale`$toJSON()
      }
      if (!is.null(self$`credentials`)) {
        CatalogsFeedsCreateRequestObject[["credentials"]] <-
          self$`credentials`$toJSON()
      }
      if (!is.null(self$`location`)) {
        CatalogsFeedsCreateRequestObject[["location"]] <-
          self$`location`
      }
      if (!is.null(self$`preferred_processing_schedule`)) {
        CatalogsFeedsCreateRequestObject[["preferred_processing_schedule"]] <-
          self$`preferred_processing_schedule`$toJSON()
      }
      if (!is.null(self$`default_country`)) {
        CatalogsFeedsCreateRequestObject[["default_country"]] <-
          self$`default_country`$toJSON()
      }
      if (!is.null(self$`default_availability`)) {
        CatalogsFeedsCreateRequestObject[["default_availability"]] <-
          self$`default_availability`$toJSON()
      }
      CatalogsFeedsCreateRequestObject
    },
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedsCreateRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`default_currency`)) {
        `default_currency_object` <- NullableCurrency$new()
        `default_currency_object`$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
        self$`default_currency` <- `default_currency_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`format`)) {
        `format_object` <- CatalogsFormat$new()
        `format_object`$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
        self$`format` <- `format_object`
      }
      if (!is.null(this_object$`default_locale`)) {
        `default_locale_object` <- CatalogsFeedsCreateRequestDefaultLocale$new()
        `default_locale_object`$fromJSON(jsonlite::toJSON(this_object$`default_locale`, auto_unbox = TRUE, digits = NA))
        self$`default_locale` <- `default_locale_object`
      }
      if (!is.null(this_object$`credentials`)) {
        `credentials_object` <- CatalogsFeedCredentials$new()
        `credentials_object`$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
        self$`credentials` <- `credentials_object`
      }
      if (!is.null(this_object$`location`)) {
        self$`location` <- this_object$`location`
      }
      if (!is.null(this_object$`preferred_processing_schedule`)) {
        `preferred_processing_schedule_object` <- CatalogsFeedProcessingSchedule$new()
        `preferred_processing_schedule_object`$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
        self$`preferred_processing_schedule` <- `preferred_processing_schedule_object`
      }
      if (!is.null(this_object$`default_country`)) {
        `default_country_object` <- Country$new()
        `default_country_object`$fromJSON(jsonlite::toJSON(this_object$`default_country`, auto_unbox = TRUE, digits = NA))
        self$`default_country` <- `default_country_object`
      }
      if (!is.null(this_object$`default_availability`)) {
        `default_availability_object` <- ProductAvailabilityType$new()
        `default_availability_object`$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
        self$`default_availability` <- `default_availability_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsFeedsCreateRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`default_currency`)) {
          sprintf(
          '"default_currency":
          %s
          ',
          jsonlite::toJSON(self$`default_currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`format`)) {
          sprintf(
          '"format":
          %s
          ',
          jsonlite::toJSON(self$`format`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`default_locale`)) {
          sprintf(
          '"default_locale":
          %s
          ',
          jsonlite::toJSON(self$`default_locale`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`credentials`)) {
          sprintf(
          '"credentials":
          %s
          ',
          jsonlite::toJSON(self$`credentials`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`location`)) {
          sprintf(
          '"location":
            "%s"
                    ',
          self$`location`
          )
        },
        if (!is.null(self$`preferred_processing_schedule`)) {
          sprintf(
          '"preferred_processing_schedule":
          %s
          ',
          jsonlite::toJSON(self$`preferred_processing_schedule`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`default_country`)) {
          sprintf(
          '"default_country":
          %s
          ',
          jsonlite::toJSON(self$`default_country`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`default_availability`)) {
          sprintf(
          '"default_availability":
          %s
          ',
          jsonlite::toJSON(self$`default_availability`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsFeedsCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsFeedsCreateRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`default_currency` <- NullableCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`format` <- CatalogsFormat$new()$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
      self$`default_locale` <- CatalogsFeedsCreateRequestDefaultLocale$new()$fromJSON(jsonlite::toJSON(this_object$`default_locale`, auto_unbox = TRUE, digits = NA))
      self$`credentials` <- CatalogsFeedCredentials$new()$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
      self$`location` <- this_object$`location`
      self$`preferred_processing_schedule` <- CatalogsFeedProcessingSchedule$new()$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
      self$`default_country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`default_country`, auto_unbox = TRUE, digits = NA))
      self$`default_availability` <- ProductAvailabilityType$new()$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsFeedsCreateRequest
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsFeedsCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedsCreateRequest: the required field `name` is missing."))
      }
      # check the required field `format`
      if (!is.null(input_json$`format`)) {
        stopifnot(R6::is.R6(input_json$`format`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedsCreateRequest: the required field `format` is missing."))
      }
      # check the required field `location`
      if (!is.null(input_json$`location`)) {
        if (!(is.character(input_json$`location`) && length(input_json$`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", input_json$`location`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsFeedsCreateRequest: the required field `location` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsFeedsCreateRequest
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# CatalogsFeedsCreateRequest$unlock()
#
## Below is an example to define the print function
# CatalogsFeedsCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsFeedsCreateRequest$lock()

