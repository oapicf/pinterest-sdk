#' Create a new LocalStore
#'
#' @description
#' Local store entity
#'
#' @docType class
#' @title LocalStore
#' @description LocalStore Class
#' @format An \code{R6Class} generator object
#' @field address_primary Primary address line of the store. character [optional]
#' @field address_secondary Secondary address line of the store. character [optional]
#' @field city City where the store is located. character [optional]
#' @field country Country code where the store is located. \link{Country}
#' @field created_at Creation timestamp character
#' @field id The ID of the local store. character
#' @field latitude Geographic latitude coordinate of the store. numeric [optional]
#' @field longitude Geographic longitude coordinate of the store. numeric [optional]
#' @field name The name of the local store. character
#' @field postal_code Postal or ZIP code of the store. character [optional]
#' @field region State or region code where the store is located. character [optional]
#' @field store_code Merchant provided code for the local store. Unique within the merchant's catalog. character
#' @field updated_at Last update timestamp character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalStore <- R6::R6Class(
  "LocalStore",
  public = list(
    `address_primary` = NULL,
    `address_secondary` = NULL,
    `city` = NULL,
    `country` = NULL,
    `created_at` = NULL,
    `id` = NULL,
    `latitude` = NULL,
    `longitude` = NULL,
    `name` = NULL,
    `postal_code` = NULL,
    `region` = NULL,
    `store_code` = NULL,
    `updated_at` = NULL,

    #' @description
    #' Initialize a new LocalStore class.
    #'
    #' @param country Country code where the store is located.
    #' @param created_at Creation timestamp
    #' @param id The ID of the local store.
    #' @param name The name of the local store.
    #' @param store_code Merchant provided code for the local store. Unique within the merchant's catalog.
    #' @param updated_at Last update timestamp
    #' @param address_primary Primary address line of the store.
    #' @param address_secondary Secondary address line of the store.
    #' @param city City where the store is located.
    #' @param latitude Geographic latitude coordinate of the store.
    #' @param longitude Geographic longitude coordinate of the store.
    #' @param postal_code Postal or ZIP code of the store.
    #' @param region State or region code where the store is located.
    #' @param ... Other optional arguments.
    initialize = function(`country`, `created_at`, `id`, `name`, `store_code`, `updated_at`, `address_primary` = NULL, `address_secondary` = NULL, `city` = NULL, `latitude` = NULL, `longitude` = NULL, `postal_code` = NULL, `region` = NULL, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!missing(`created_at`)) {
        if (!(is.character(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!missing(`store_code`)) {
        if (!(is.character(`store_code`) && length(`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", `store_code`))
        }
        self$`store_code` <- `store_code`
      }
      if (!missing(`updated_at`)) {
        if (!(is.character(`updated_at`) && length(`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
      if (!is.null(`address_primary`)) {
        if (!(is.character(`address_primary`) && length(`address_primary`) == 1)) {
          stop(paste("Error! Invalid data for `address_primary`. Must be a string:", `address_primary`))
        }
        self$`address_primary` <- `address_primary`
      }
      if (!is.null(`address_secondary`)) {
        if (!(is.character(`address_secondary`) && length(`address_secondary`) == 1)) {
          stop(paste("Error! Invalid data for `address_secondary`. Must be a string:", `address_secondary`))
        }
        self$`address_secondary` <- `address_secondary`
      }
      if (!is.null(`city`)) {
        if (!(is.character(`city`) && length(`city`) == 1)) {
          stop(paste("Error! Invalid data for `city`. Must be a string:", `city`))
        }
        self$`city` <- `city`
      }
      if (!is.null(`latitude`)) {
        if (!(is.numeric(`latitude`) && length(`latitude`) == 1)) {
          stop(paste("Error! Invalid data for `latitude`. Must be a number:", `latitude`))
        }
        self$`latitude` <- `latitude`
      }
      if (!is.null(`longitude`)) {
        if (!(is.numeric(`longitude`) && length(`longitude`) == 1)) {
          stop(paste("Error! Invalid data for `longitude`. Must be a number:", `longitude`))
        }
        self$`longitude` <- `longitude`
      }
      if (!is.null(`postal_code`)) {
        if (!(is.character(`postal_code`) && length(`postal_code`) == 1)) {
          stop(paste("Error! Invalid data for `postal_code`. Must be a string:", `postal_code`))
        }
        self$`postal_code` <- `postal_code`
      }
      if (!is.null(`region`)) {
        if (!(is.character(`region`) && length(`region`) == 1)) {
          stop(paste("Error! Invalid data for `region`. Must be a string:", `region`))
        }
        self$`region` <- `region`
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
    #' @return LocalStore as a base R list.
    #' @examples
    #' # convert array of LocalStore (x) to a data frame
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
    #' Convert LocalStore to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalStoreObject <- list()
      if (!is.null(self$`address_primary`)) {
        LocalStoreObject[["address_primary"]] <-
          self$`address_primary`
      }
      if (!is.null(self$`address_secondary`)) {
        LocalStoreObject[["address_secondary"]] <-
          self$`address_secondary`
      }
      if (!is.null(self$`city`)) {
        LocalStoreObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`country`)) {
        LocalStoreObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`created_at`)) {
        LocalStoreObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`id`)) {
        LocalStoreObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`latitude`)) {
        LocalStoreObject[["latitude"]] <-
          self$`latitude`
      }
      if (!is.null(self$`longitude`)) {
        LocalStoreObject[["longitude"]] <-
          self$`longitude`
      }
      if (!is.null(self$`name`)) {
        LocalStoreObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`postal_code`)) {
        LocalStoreObject[["postal_code"]] <-
          self$`postal_code`
      }
      if (!is.null(self$`region`)) {
        LocalStoreObject[["region"]] <-
          self$`region`
      }
      if (!is.null(self$`store_code`)) {
        LocalStoreObject[["store_code"]] <-
          self$`store_code`
      }
      if (!is.null(self$`updated_at`)) {
        LocalStoreObject[["updated_at"]] <-
          self$`updated_at`
      }
      return(LocalStoreObject)
    },

    extractSimpleType = function(x) {
      if (R6::is.R6(x)) {
        return(x$toSimpleType())
      } else if (!self$hasNestedR6(x)) {
        return(x)
      }
      lapply(x, self$extractSimpleType)
    },

    hasNestedR6 = function(x) {
      if (R6::is.R6(x)) {
        return(TRUE)
      }
      if (is.list(x)) {
        for (item in x) {
          if (self$hasNestedR6(item)) {
            return(TRUE)
          }
        }
      }
      FALSE
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalStore
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalStore
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`address_primary`)) {
        self$`address_primary` <- this_object$`address_primary`
      }
      if (!is.null(this_object$`address_secondary`)) {
        self$`address_secondary` <- this_object$`address_secondary`
      }
      if (!is.null(this_object$`city`)) {
        self$`city` <- this_object$`city`
      }
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`latitude`)) {
        self$`latitude` <- this_object$`latitude`
      }
      if (!is.null(this_object$`longitude`)) {
        self$`longitude` <- this_object$`longitude`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`postal_code`)) {
        self$`postal_code` <- this_object$`postal_code`
      }
      if (!is.null(this_object$`region`)) {
        self$`region` <- this_object$`region`
      }
      if (!is.null(this_object$`store_code`)) {
        self$`store_code` <- this_object$`store_code`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalStore in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalStore
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalStore
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`address_primary` <- this_object$`address_primary`
      self$`address_secondary` <- this_object$`address_secondary`
      self$`city` <- this_object$`city`
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`created_at` <- this_object$`created_at`
      self$`id` <- this_object$`id`
      self$`latitude` <- this_object$`latitude`
      self$`longitude` <- this_object$`longitude`
      self$`name` <- this_object$`name`
      self$`postal_code` <- this_object$`postal_code`
      self$`region` <- this_object$`region`
      self$`store_code` <- this_object$`store_code`
      self$`updated_at` <- this_object$`updated_at`
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalStore and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `country` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.character(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be a string:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `created_at` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `id` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `name` is missing."))
      }
      # check the required field `store_code`
      if (!is.null(input_json$`store_code`)) {
        if (!(is.character(input_json$`store_code`) && length(input_json$`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", input_json$`store_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `store_code` is missing."))
      }
      # check the required field `updated_at`
      if (!is.null(input_json$`updated_at`)) {
        if (!(is.character(input_json$`updated_at`) && length(input_json$`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be a string:", input_json$`updated_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStore: the required field `updated_at` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalStore
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        return(FALSE)
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
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
      # check if the required `country` is null
      if (is.null(self$`country`)) {
        invalid_fields["country"] <- "Non-nullable required field `country` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        invalid_fields["store_code"] <- "Non-nullable required field `store_code` cannot be null."
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
        invalid_fields["updated_at"] <- "Non-nullable required field `updated_at` cannot be null."
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
# LocalStore$unlock()
#
## Below is an example to define the print function
# LocalStore$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalStore$lock()

