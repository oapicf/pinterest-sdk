#' Create a new AdAccountCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title AdAccountCreate
#' @description AdAccountCreate Class
#' @format An \code{R6Class} generator object
#' @field country  \link{Country} [optional]
#' @field currency  \link{Currency} [optional]
#' @field name Ad account name. character [optional]
#' @field owner_user_id Advertiser's owning user ID. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountCreate <- R6::R6Class(
  "AdAccountCreate",
  public = list(
    `country` = NULL,
    `currency` = NULL,
    `name` = NULL,
    `owner_user_id` = NULL,

    #' @description
    #' Initialize a new AdAccountCreate class.
    #'
    #' @param country country
    #' @param currency currency
    #' @param name Ad account name.
    #' @param owner_user_id Advertiser's owning user ID.
    #' @param ... Other optional arguments.
    initialize = function(`country` = NULL, `currency` = NULL, `name` = NULL, `owner_user_id` = NULL, ...) {
      if (!is.null(`country`)) {
        if (!(`country` %in% c())) {
          stop(paste("Error! \"", `country`, "\" cannot be assigned to `country`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`country`))
        self$`country` <- `country`
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
      if (!is.null(`owner_user_id`)) {
        if (!(is.character(`owner_user_id`) && length(`owner_user_id`) == 1)) {
          stop(paste("Error! Invalid data for `owner_user_id`. Must be a string:", `owner_user_id`))
        }
        self$`owner_user_id` <- `owner_user_id`
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
    #' @return AdAccountCreate as a base R list.
    #' @examples
    #' # convert array of AdAccountCreate (x) to a data frame
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
    #' Convert AdAccountCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdAccountCreateObject <- list()
      if (!is.null(self$`country`)) {
        AdAccountCreateObject[["country"]] <-
          self$`country`$toSimpleType()
      }
      if (!is.null(self$`currency`)) {
        AdAccountCreateObject[["currency"]] <-
          self$`currency`$toSimpleType()
      }
      if (!is.null(self$`name`)) {
        AdAccountCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`owner_user_id`)) {
        AdAccountCreateObject[["owner_user_id"]] <-
          self$`owner_user_id`
      }
      return(AdAccountCreateObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`country`)) {
        `country_object` <- Country$new()
        `country_object`$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
        self$`country` <- `country_object`
      }
      if (!is.null(this_object$`currency`)) {
        `currency_object` <- Currency$new()
        `currency_object`$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
        self$`currency` <- `currency_object`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`owner_user_id`)) {
        self$`owner_user_id` <- this_object$`owner_user_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccountCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`country` <- Country$new()$fromJSON(jsonlite::toJSON(this_object$`country`, auto_unbox = TRUE, digits = NA))
      self$`currency` <- Currency$new()$fromJSON(jsonlite::toJSON(this_object$`currency`, auto_unbox = TRUE, digits = NA))
      self$`name` <- this_object$`name`
      self$`owner_user_id` <- this_object$`owner_user_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (nchar(self$`name`) > 256) {
        return(FALSE)
      }

      if (!str_detect(self$`owner_user_id`, "^\\d+$")) {
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
      if (nchar(self$`name`) > 256) {
        invalid_fields["name"] <- "Invalid length for `name`, must be smaller than or equal to 256."
      }

      if (!str_detect(self$`owner_user_id`, "^\\d+$")) {
        invalid_fields["owner_user_id"] <- "Invalid value for `owner_user_id`, must conform to the pattern ^\\d+$."
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
# AdAccountCreate$unlock()
#
## Below is an example to define the print function
# AdAccountCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountCreate$lock()

