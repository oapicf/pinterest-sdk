#' Create a new LocalStoreCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title LocalStoreCreate
#' @description LocalStoreCreate Class
#' @format An \code{R6Class} generator object
#' @field address_primary Primary address line of the store. character [optional]
#' @field address_secondary Secondary address line of the store. character [optional]
#' @field city City where the store is located. character [optional]
#' @field country Country code where the store is located. \link{Country}
#' @field latitude Geographic latitude coordinate of the store. numeric [optional]
#' @field longitude Geographic longitude coordinate of the store. numeric [optional]
#' @field name The name of the local store. character
#' @field postal_code Postal or ZIP code of the store. character [optional]
#' @field region State or region code where the store is located. character [optional]
#' @field store_code Merchant provided code for the local store. Unique within the merchant's catalog. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
LocalStoreCreate <- R6::R6Class(
  "LocalStoreCreate",
  public = list(
    `address_primary` = NULL,
    `address_secondary` = NULL,
    `city` = NULL,
    `country` = NULL,
    `latitude` = NULL,
    `longitude` = NULL,
    `name` = NULL,
    `postal_code` = NULL,
    `region` = NULL,
    `store_code` = NULL,

    #' @description
    #' Initialize a new LocalStoreCreate class.
    #'
    #' @param country Country code where the store is located.
    #' @param name The name of the local store.
    #' @param store_code Merchant provided code for the local store. Unique within the merchant's catalog.
    #' @param address_primary Primary address line of the store.
    #' @param address_secondary Secondary address line of the store.
    #' @param city City where the store is located.
    #' @param latitude Geographic latitude coordinate of the store.
    #' @param longitude Geographic longitude coordinate of the store.
    #' @param postal_code Postal or ZIP code of the store.
    #' @param region State or region code where the store is located.
    #' @param ... Other optional arguments.
    initialize = function(`country`, `name`, `store_code`, `address_primary` = NULL, `address_secondary` = NULL, `city` = NULL, `latitude` = NULL, `longitude` = NULL, `postal_code` = NULL, `region` = NULL, ...) {
      if (!missing(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
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
    #' @return LocalStoreCreate as a base R list.
    #' @examples
    #' # convert array of LocalStoreCreate (x) to a data frame
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
    #' Convert LocalStoreCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      LocalStoreCreateObject <- list()
      if (!is.null(self$`address_primary`)) {
        LocalStoreCreateObject[["address_primary"]] <-
          self$`address_primary`
      }
      if (!is.null(self$`address_secondary`)) {
        LocalStoreCreateObject[["address_secondary"]] <-
          self$`address_secondary`
      }
      if (!is.null(self$`city`)) {
        LocalStoreCreateObject[["city"]] <-
          self$`city`
      }
      if (!is.null(self$`country`)) {
        LocalStoreCreateObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`latitude`)) {
        LocalStoreCreateObject[["latitude"]] <-
          self$`latitude`
      }
      if (!is.null(self$`longitude`)) {
        LocalStoreCreateObject[["longitude"]] <-
          self$`longitude`
      }
      if (!is.null(self$`name`)) {
        LocalStoreCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`postal_code`)) {
        LocalStoreCreateObject[["postal_code"]] <-
          self$`postal_code`
      }
      if (!is.null(self$`region`)) {
        LocalStoreCreateObject[["region"]] <-
          self$`region`
      }
      if (!is.null(self$`store_code`)) {
        LocalStoreCreateObject[["store_code"]] <-
          self$`store_code`
      }
      return(LocalStoreCreateObject)
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
    #' Deserialize JSON string into an instance of LocalStoreCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalStoreCreate
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
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return LocalStoreCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of LocalStoreCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of LocalStoreCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`address_primary` <- this_object$`address_primary`
      self$`address_secondary` <- this_object$`address_secondary`
      self$`city` <- this_object$`city`
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`latitude` <- this_object$`latitude`
      self$`longitude` <- this_object$`longitude`
      self$`name` <- this_object$`name`
      self$`postal_code` <- this_object$`postal_code`
      self$`region` <- this_object$`region`
      self$`store_code` <- this_object$`store_code`
      self
    },

    #' @description
    #' Validate JSON input with respect to LocalStoreCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `country`
      if (!is.null(input_json$`country`)) {
        stopifnot(R6::is.R6(input_json$`country`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStoreCreate: the required field `country` is missing."))
      }
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStoreCreate: the required field `name` is missing."))
      }
      # check the required field `store_code`
      if (!is.null(input_json$`store_code`)) {
        if (!(is.character(input_json$`store_code`) && length(input_json$`store_code`) == 1)) {
          stop(paste("Error! Invalid data for `store_code`. Must be a string:", input_json$`store_code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for LocalStoreCreate: the required field `store_code` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of LocalStoreCreate
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        return(FALSE)
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
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

      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
      }

      # check if the required `store_code` is null
      if (is.null(self$`store_code`)) {
        invalid_fields["store_code"] <- "Non-nullable required field `store_code` cannot be null."
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
# LocalStoreCreate$unlock()
#
## Below is an example to define the print function
# LocalStoreCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# LocalStoreCreate$lock()

