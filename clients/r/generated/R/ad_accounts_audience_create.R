#' Create a new AdAccountsAudienceCreate
#'
#' @description
#' Resource create operation model.
#'
#' @docType class
#' @title AdAccountsAudienceCreate
#' @description AdAccountsAudienceCreate Class
#' @format An \code{R6Class} generator object
#' @field ad_account_id Ad account ID. character [optional]
#' @field audience_type [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR \link{AudienceType} [optional]
#' @field description Audience description. character [optional]
#' @field name Audience name. character [optional]
#' @field rule  \link{AdAccountsAudienceRule} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
AdAccountsAudienceCreate <- R6::R6Class(
  "AdAccountsAudienceCreate",
  public = list(
    `ad_account_id` = NULL,
    `audience_type` = NULL,
    `description` = NULL,
    `name` = NULL,
    `rule` = NULL,

    #' @description
    #' Initialize a new AdAccountsAudienceCreate class.
    #'
    #' @param ad_account_id Ad account ID.
    #' @param audience_type [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
    #' @param description Audience description.
    #' @param name Audience name.
    #' @param rule rule
    #' @param ... Other optional arguments.
    initialize = function(`ad_account_id` = NULL, `audience_type` = NULL, `description` = NULL, `name` = NULL, `rule` = NULL, ...) {
      if (!is.null(`ad_account_id`)) {
        if (!(is.character(`ad_account_id`) && length(`ad_account_id`) == 1)) {
          stop(paste("Error! Invalid data for `ad_account_id`. Must be a string:", `ad_account_id`))
        }
        self$`ad_account_id` <- `ad_account_id`
      }
      if (!is.null(`audience_type`)) {
        if (!(`audience_type` %in% c())) {
          stop(paste("Error! \"", `audience_type`, "\" cannot be assigned to `audience_type`. Must be .", sep = ""))
        }
        stopifnot(R6::is.R6(`audience_type`))
        self$`audience_type` <- `audience_type`
      }
      if (!is.null(`description`)) {
        if (!(is.character(`description`) && length(`description`) == 1)) {
          stop(paste("Error! Invalid data for `description`. Must be a string:", `description`))
        }
        self$`description` <- `description`
      }
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`rule`)) {
        stopifnot(R6::is.R6(`rule`))
        self$`rule` <- `rule`
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
    #' @return AdAccountsAudienceCreate as a base R list.
    #' @examples
    #' # convert array of AdAccountsAudienceCreate (x) to a data frame
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
    #' Convert AdAccountsAudienceCreate to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      AdAccountsAudienceCreateObject <- list()
      if (!is.null(self$`ad_account_id`)) {
        AdAccountsAudienceCreateObject[["ad_account_id"]] <-
          self$`ad_account_id`
      }
      if (!is.null(self$`audience_type`)) {
        AdAccountsAudienceCreateObject[["audience_type"]] <-
          self$extractSimpleType(self$`audience_type`)
      }
      if (!is.null(self$`description`)) {
        AdAccountsAudienceCreateObject[["description"]] <-
          self$`description`
      }
      if (!is.null(self$`name`)) {
        AdAccountsAudienceCreateObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`rule`)) {
        AdAccountsAudienceCreateObject[["rule"]] <-
          self$extractSimpleType(self$`rule`)
      }
      return(AdAccountsAudienceCreateObject)
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
    #' Deserialize JSON string into an instance of AdAccountsAudienceCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsAudienceCreate
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ad_account_id`)) {
        self$`ad_account_id` <- this_object$`ad_account_id`
      }
      if (!is.null(this_object$`audience_type`)) {
        `audience_type_object` <- AudienceType$new()
        `audience_type_object`$fromJSON(jsonlite::toJSON(this_object$`audience_type`, auto_unbox = TRUE, digits = NA))
        self$`audience_type` <- `audience_type_object`
      }
      if (!is.null(this_object$`description`)) {
        self$`description` <- this_object$`description`
      }
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`rule`)) {
        `rule_object` <- AdAccountsAudienceRule$new()
        `rule_object`$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
        self$`rule` <- `rule_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return AdAccountsAudienceCreate in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of AdAccountsAudienceCreate
    #'
    #' @param input_json the JSON input
    #' @return the instance of AdAccountsAudienceCreate
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ad_account_id` <- this_object$`ad_account_id`
      self$`audience_type` <- AudienceType$new()$fromJSON(jsonlite::toJSON(this_object$`audience_type`, auto_unbox = TRUE, digits = NA))
      self$`description` <- this_object$`description`
      self$`name` <- this_object$`name`
      self$`rule` <- AdAccountsAudienceRule$new()$fromJSON(jsonlite::toJSON(this_object$`rule`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to AdAccountsAudienceCreate and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of AdAccountsAudienceCreate
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
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
      if (!str_detect(self$`ad_account_id`, "^\\d+$")) {
        invalid_fields["ad_account_id"] <- "Invalid value for `ad_account_id`, must conform to the pattern ^\\d+$."
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
# AdAccountsAudienceCreate$unlock()
#
## Below is an example to define the print function
# AdAccountsAudienceCreate$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# AdAccountsAudienceCreate$lock()

