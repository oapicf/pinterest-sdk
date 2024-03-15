#' Create a new CatalogsRetailFeed
#'
#' @description
#' Catalogs Retail Feed object
#'
#' @docType class
#' @title CatalogsRetailFeed
#' @description CatalogsRetailFeed Class
#' @format An \code{R6Class} generator object
#' @field created_at  character [optional]
#' @field id  character [optional]
#' @field updated_at  character [optional]
#' @field name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. character
#' @field format  \link{CatalogsFormat}
#' @field catalog_type  \link{CatalogsType}
#' @field credentials  \link{CatalogsFeedCredentials}
#' @field location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. character
#' @field preferred_processing_schedule  \link{CatalogsFeedProcessingSchedule}
#' @field status  \link{CatalogsStatus}
#' @field default_currency  \link{NullableCurrency}
#' @field default_locale The locale used within a feed for product descriptions. character
#' @field default_country  \link{Country}
#' @field default_availability  \link{ProductAvailabilityType}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CatalogsRetailFeed <- R6::R6Class(
  "CatalogsRetailFeed",
  public = list(
    `created_at` = NULL,
    `id` = NULL,
    `updated_at` = NULL,
    `name` = NULL,
    `format` = NULL,
    `catalog_type` = NULL,
    `credentials` = NULL,
    `location` = NULL,
    `preferred_processing_schedule` = NULL,
    `status` = NULL,
    `default_currency` = NULL,
    `default_locale` = NULL,
    `default_country` = NULL,
    `default_availability` = NULL,
    #' Initialize a new CatalogsRetailFeed class.
    #'
    #' @description
    #' Initialize a new CatalogsRetailFeed class.
    #'
    #' @param name A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future.
    #' @param format format
    #' @param catalog_type catalog_type
    #' @param credentials credentials
    #' @param location The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    #' @param preferred_processing_schedule preferred_processing_schedule
    #' @param status status
    #' @param default_currency default_currency
    #' @param default_locale The locale used within a feed for product descriptions.
    #' @param default_country default_country
    #' @param default_availability default_availability
    #' @param created_at created_at
    #' @param id id
    #' @param updated_at updated_at
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, `format`, `catalog_type`, `credentials`, `location`, `preferred_processing_schedule`, `status`, `default_currency`, `default_locale`, `default_country`, `default_availability`, `created_at` = NULL, `id` = NULL, `updated_at` = NULL, ...) {
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
      if (!missing(`catalog_type`)) {
        if (!(`catalog_type` %in% c())) {
          stop(paste("Error! \"", `catalog_type`, "\" cannot be assigned to `catalog_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`catalog_type`))
        self$`catalog_type` <- `catalog_type`
      }
      if (!missing(`credentials`)) {
        stopifnot(R6::is.R6(`credentials`))
        self$`credentials` <- `credentials`
      }
      if (!missing(`location`)) {
        if (!(is.character(`location`) && length(`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", `location`))
        }
        self$`location` <- `location`
      }
      if (!missing(`preferred_processing_schedule`)) {
        stopifnot(R6::is.R6(`preferred_processing_schedule`))
        self$`preferred_processing_schedule` <- `preferred_processing_schedule`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c())) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`status`))
        self$`status` <- `status`
      }
      if (!missing(`default_currency`)) {
        if (!(`default_currency` %in% c())) {
          stop(paste("Error! \"", `default_currency`, "\" cannot be assigned to `default_currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_currency`))
        self$`default_currency` <- `default_currency`
      }
      if (!missing(`default_locale`)) {
        if (!(is.character(`default_locale`) && length(`default_locale`) == 1)) {
          stop(paste("Error! Invalid data for `default_locale`. Must be a string:", `default_locale`))
        }
        self$`default_locale` <- `default_locale`
      }
      if (!missing(`default_country`)) {
        if (!(`default_country` %in% c())) {
          stop(paste("Error! \"", `default_country`, "\" cannot be assigned to `default_country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_country`))
        self$`default_country` <- `default_country`
      }
      if (!missing(`default_availability`)) {
        if (!(`default_availability` %in% c())) {
          stop(paste("Error! \"", `default_availability`, "\" cannot be assigned to `default_availability`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`default_availability`))
        self$`default_availability` <- `default_availability`
      }
      if (!is.null(`created_at`)) {
        if (!is.character(`created_at`)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`updated_at`)) {
        if (!is.character(`updated_at`)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CatalogsRetailFeed in JSON format
    #' @export
    toJSON = function() {
      CatalogsRetailFeedObject <- list()
      if (!is.null(self$`created_at`)) {
        CatalogsRetailFeedObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        CatalogsRetailFeedObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`updated_at`)) {
        CatalogsRetailFeedObject[["updated_at"]] <-
          self$`updated_at`
      }
      if (!is.null(self$`name`)) {
        CatalogsRetailFeedObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`format`)) {
        CatalogsRetailFeedObject[["format"]] <-
          self$`format`$toJSON()
      }
      if (!is.null(self$`catalog_type`)) {
        CatalogsRetailFeedObject[["catalog_type"]] <-
          self$`catalog_type`$toJSON()
      }
      if (!is.null(self$`credentials`)) {
        CatalogsRetailFeedObject[["credentials"]] <-
          self$`credentials`$toJSON()
      }
      if (!is.null(self$`location`)) {
        CatalogsRetailFeedObject[["location"]] <-
          self$`location`
      }
      if (!is.null(self$`preferred_processing_schedule`)) {
        CatalogsRetailFeedObject[["preferred_processing_schedule"]] <-
          self$`preferred_processing_schedule`$toJSON()
      }
      if (!is.null(self$`status`)) {
        CatalogsRetailFeedObject[["status"]] <-
          self$`status`$toJSON()
      }
      if (!is.null(self$`default_currency`)) {
        CatalogsRetailFeedObject[["default_currency"]] <-
          self$`default_currency`$toJSON()
      }
      if (!is.null(self$`default_locale`)) {
        CatalogsRetailFeedObject[["default_locale"]] <-
          self$`default_locale`
      }
      if (!is.null(self$`default_country`)) {
        CatalogsRetailFeedObject[["default_country"]] <-
          self$`default_country`$toJSON()
      }
      if (!is.null(self$`default_availability`)) {
        CatalogsRetailFeedObject[["default_availability"]] <-
          self$`default_availability`$toJSON()
      }
      CatalogsRetailFeedObject
    },
    #' Deserialize JSON string into an instance of CatalogsRetailFeed
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFeed
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFeed
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`format`)) {
        `format_object` <- CatalogsFormat$new()
        `format_object`$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
        self$`format` <- `format_object`
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
      if (!is.null(this_object$`location`)) {
        self$`location` <- this_object$`location`
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
      if (!is.null(this_object$`default_currency`)) {
        `default_currency_object` <- NullableCurrency$new()
        `default_currency_object`$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
        self$`default_currency` <- `default_currency_object`
      }
      if (!is.null(this_object$`default_locale`)) {
        self$`default_locale` <- this_object$`default_locale`
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
    #' @return CatalogsRetailFeed in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            "%s"
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`updated_at`)) {
          sprintf(
          '"updated_at":
            "%s"
                    ',
          self$`updated_at`
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
        if (!is.null(self$`catalog_type`)) {
          sprintf(
          '"catalog_type":
          %s
          ',
          jsonlite::toJSON(self$`catalog_type`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
          %s
          ',
          jsonlite::toJSON(self$`status`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`default_currency`)) {
          sprintf(
          '"default_currency":
          %s
          ',
          jsonlite::toJSON(self$`default_currency`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`default_locale`)) {
          sprintf(
          '"default_locale":
            "%s"
                    ',
          self$`default_locale`
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
    #' Deserialize JSON string into an instance of CatalogsRetailFeed
    #'
    #' @description
    #' Deserialize JSON string into an instance of CatalogsRetailFeed
    #'
    #' @param input_json the JSON input
    #' @return the instance of CatalogsRetailFeed
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self$`updated_at` <- this_object$`updated_at`
      self$`name` <- this_object$`name`
      self$`format` <- CatalogsFormat$new()$fromJSON(jsonlite::toJSON(this_object$`format`, auto_unbox = TRUE, digits = NA))
      self$`catalog_type` <- CatalogsType$new()$fromJSON(jsonlite::toJSON(this_object$`catalog_type`, auto_unbox = TRUE, digits = NA))
      self$`credentials` <- CatalogsFeedCredentials$new()$fromJSON(jsonlite::toJSON(this_object$`credentials`, auto_unbox = TRUE, digits = NA))
      self$`location` <- this_object$`location`
      self$`preferred_processing_schedule` <- CatalogsFeedProcessingSchedule$new()$fromJSON(jsonlite::toJSON(this_object$`preferred_processing_schedule`, auto_unbox = TRUE, digits = NA))
      self$`status` <- CatalogsStatus$new()$fromJSON(jsonlite::toJSON(this_object$`status`, auto_unbox = TRUE, digits = NA))
      self$`default_currency` <- NullableCurrency$new()$fromJSON(jsonlite::toJSON(this_object$`default_currency`, auto_unbox = TRUE, digits = NA))
      self$`default_locale` <- this_object$`default_locale`
      self$`default_country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`default_country`, auto_unbox = TRUE, digits = NA))
      self$`default_availability` <- ProductAvailabilityType$new()$fromJSON(jsonlite::toJSON(this_object$`default_availability`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to CatalogsRetailFeed
    #'
    #' @description
    #' Validate JSON input with respect to CatalogsRetailFeed and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `name` is missing."))
      }
      # check the required field `format`
      if (!is.null(input_json$`format`)) {
        stopifnot(R6::is.R6(input_json$`format`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `format` is missing."))
      }
      # check the required field `catalog_type`
      if (!is.null(input_json$`catalog_type`)) {
        stopifnot(R6::is.R6(input_json$`catalog_type`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `catalog_type` is missing."))
      }
      # check the required field `credentials`
      if (!is.null(input_json$`credentials`)) {
        stopifnot(R6::is.R6(input_json$`credentials`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `credentials` is missing."))
      }
      # check the required field `location`
      if (!is.null(input_json$`location`)) {
        if (!(is.character(input_json$`location`) && length(input_json$`location`) == 1)) {
          stop(paste("Error! Invalid data for `location`. Must be a string:", input_json$`location`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `location` is missing."))
      }
      # check the required field `preferred_processing_schedule`
      if (!is.null(input_json$`preferred_processing_schedule`)) {
        stopifnot(R6::is.R6(input_json$`preferred_processing_schedule`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `preferred_processing_schedule` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        stopifnot(R6::is.R6(input_json$`status`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `status` is missing."))
      }
      # check the required field `default_currency`
      if (!is.null(input_json$`default_currency`)) {
        stopifnot(R6::is.R6(input_json$`default_currency`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `default_currency` is missing."))
      }
      # check the required field `default_locale`
      if (!is.null(input_json$`default_locale`)) {
        if (!(is.character(input_json$`default_locale`) && length(input_json$`default_locale`) == 1)) {
          stop(paste("Error! Invalid data for `default_locale`. Must be a string:", input_json$`default_locale`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `default_locale` is missing."))
      }
      # check the required field `default_country`
      if (!is.null(input_json$`default_country`)) {
        stopifnot(R6::is.R6(input_json$`default_country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `default_country` is missing."))
      }
      # check the required field `default_availability`
      if (!is.null(input_json$`default_availability`)) {
        stopifnot(R6::is.R6(input_json$`default_availability`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CatalogsRetailFeed: the required field `default_availability` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CatalogsRetailFeed
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
      # check if the required `format` is null
      if (is.null(self$`format`)) {
        return(FALSE)
      }

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        return(FALSE)
      }

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `default_locale` is null
      if (is.null(self$`default_locale`)) {
        return(FALSE)
      }

      # check if the required `default_country` is null
      if (is.null(self$`default_country`)) {
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
      # check if the required `format` is null
      if (is.null(self$`format`)) {
        invalid_fields["format"] <- "Non-nullable required field `format` cannot be null."
      }

      # check if the required `catalog_type` is null
      if (is.null(self$`catalog_type`)) {
        invalid_fields["catalog_type"] <- "Non-nullable required field `catalog_type` cannot be null."
      }

      # check if the required `location` is null
      if (is.null(self$`location`)) {
        invalid_fields["location"] <- "Non-nullable required field `location` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `default_locale` is null
      if (is.null(self$`default_locale`)) {
        invalid_fields["default_locale"] <- "Non-nullable required field `default_locale` cannot be null."
      }

      # check if the required `default_country` is null
      if (is.null(self$`default_country`)) {
        invalid_fields["default_country"] <- "Non-nullable required field `default_country` cannot be null."
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
# CatalogsRetailFeed$unlock()
#
## Below is an example to define the print function
# CatalogsRetailFeed$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CatalogsRetailFeed$lock()

