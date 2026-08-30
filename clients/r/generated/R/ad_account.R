#' Create a new AdAccount
#'
#' @description
#' AdAccount Class
#'
#' @docType class
#' @title AdAccount
#' @description AdAccount Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country} [optional]
#' @field created_time Creation time. Unix timestamp in seconds. integer [optional]
#' @field currency  \link{Currency} [optional]
#' @field id  character
#' @field name Ad account name. character [optional]
#' @field owner Ad account owner \link{AdAccountOwner} [optional]
#' @field permissions  list(\link{BusinessAccessRole}) [optional]
#' @field time_zone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC. character [optional]
#' @field updated_time  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccount <- R6::R6Class(
  "AdAccount",
  public = list(
    `country` = NULL,
    `created_time` = NULL,
    `currency` = NULL,
    `id` = NULL,
    `name` = NULL,
    `owner` = NULL,
    `permissions` = NULL,
    `time_zone` = NULL,
    `updated_time` = NULL,

    #' @description
    #' Initialize a new AdAccount class.
    #'
    #' @param id id
    #' @param country country
    #' @param created_time Creation time. Unix timestamp in seconds.
    #' @param currency currency
    #' @param name Ad account name.
    #' @param owner Ad account owner
    #' @param permissions permissions
    #' @param time_zone The time zone of the ad account, in IANA format (e.g., \"America/Los_Angeles\"). Adding your local time zone lets you view your campaigns and ad reporting in your preferred time zone. Future reports will be available in both your local time zone and default UTC time zone. Historical data takes 1-2 months to backfill. Your billing and order lines will remain in UTC.
    #' @param updated_time updated_time
    #' @param ... Other optional arguments.
    initialize = function(`id`, `country` = NULL, `created_time` = NULL, `currency` = NULL, `name` = NULL, `owner` = NULL, `permissions` = NULL, `time_zone` = NULL, `updated_time` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
      }
      if (!is.null(`created_time`)) {
        if (!(is.numeric(`created_time`) && length(`created_time`) == 1)) {
          stop(paste("Error! Invalid data for `created_time`. Must be an integer:", `created_time`))
        }
        self$`created_time` <- `created_time`
      }
      if (!is.null(`currency`)) {
        if (!(`currency` %in% c())) {
          stop(paste("Error! \"", `currency`, "\" cannot be assigned to `currency`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`currency`))
        self$`currency` <- `currency`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`owner`)) {
        stopifnot(R6::is.R6(`owner`))
        self$`owner` <- `owner`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`permissions` <- `permissions`
      }
      if (!is.null(`time_zone`)) {
        if (!(is.character(`time_zone`) && length(`time_zone`) == 1)) {
          stop(paste("Error! Invalid data for `time_zone`. Must be a string:", `time_zone`))
        }
        self$`time_zone` <- `time_zone`
      }
      if (!is.null(`updated_time`)) {
        if (!(is.numeric(`updated_time`) && length(`updated_time`) == 1)) {
          stop(paste("Error! Invalid data for `updated_time`. Must be an integer:", `updated_time`))
        }
        self$`updated_time` <- `updated_time`
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
    #' @return AdAccount as a base R list.
    #' @examples
    #' # convert array of AdAccount (x) to a data frame
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
    #' Convert AdAccount to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdAccountObject <- list()
      if (!is.null(self$`country`)) {
        AdAccountObject[["country"]] <-
          self$extractSimpleType(self$`country`)
      }
      if (!is.null(self$`created_time`)) {
        AdAccountObject[["created_time"]] <-
          self$`created_time`
      }
      if (!is.null(self$`currency`)) {
        AdAccountObject[["currency"]] <-
          self$extractSimpleType(self$`currency`)
      }
      if (!is.null(self$`id`)) {
        AdAccountObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`name`)) {
        AdAccountObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`owner`)) {
        AdAccountObject[["owner"]] <-
          self$extractSimpleType(self$`owner`)
      }
      if (!is.null(self$`permissions`)) {
        AdAccountObject[["permissions"]] <-
          self$extractSimpleType(self$`permissions`)
      }
      if (!is.null(self$`time_zone`)) {
        AdAccountObject[["time_zone"]] <-
          self$`time_zone`
      }
      if (!is.null(self$`updated_time`)) {
        AdAccountObject[["updated_time"]] <-
          self$`updated_time`
      }
      return(AdAccountObject)
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
    #' Deserialize JSON string into an instance of AdAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccount
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`created_time`)) {
        self$`created_time` <- this_object$`created_time`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`owner`)) {
        `owner_object` <- AdAccountOwner$new()
        `owner_object`$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
        self$`owner` <- `owner_object`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[BusinessAccessRole]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`time_zone`)) {
        self$`time_zone` <- this_object$`time_zone`
      }
      if (!is.null(this_object$`updated_time`)) {
        self$`updated_time` <- this_object$`updated_time`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccount in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccount
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccount
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`created_time` <- this_object$`created_time`
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`id` <- this_object$`id`
      self$`name` <- this_object$`name`
      self$`owner` <- AdAccountOwner$new()$fromJSON(jsonlite::toJSON(this_object$`owner`, auto_unbox = TRUE, digits = NA))
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[BusinessAccessRole]", loadNamespace("openapi"))
      self$`time_zone` <- this_object$`time_zone`
      self$`updated_time` <- this_object$`updated_time`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccount and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for AdAccount: the required field `id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccount
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      if (nchar(self$`id`) > 18) {
        return(FALSE)
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        return(FALSE)
      }

      if (nchar(self$`name`) > 256) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      if (nchar(self$`id`) > 18) {
        invalid_fields["id"] <- "Invalid length for `id`, must be smaller than or equal to 18."
      }
      if (!str_detect(self$`id`, "^\\d+$")) {
        invalid_fields["id"] <- "Invalid value for `id`, must conform to the pattern ^\\d+$."
      }

      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
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
# AdAccount$unlock()
#
## Below is an example to define the print function
# AdAccount$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccount$lock()

