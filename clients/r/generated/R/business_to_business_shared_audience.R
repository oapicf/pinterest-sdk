#' Create a new BusinessToBusinessSharedAudience
#'
#' @description
#' BusinessToBusinessSharedAudience Class
#'
#' @docType class
#' @title BusinessToBusinessSharedAudience
#' @description BusinessToBusinessSharedAudience Class
#' @format An \code{R6Class} generator object
#' @field audience_id Unique identifier of an audience character
#' @field permissions Permissions granted to the recipients. list(\link{Role}) [optional]
#' @field recipient_business_ids Business IDs to share with or revoke from (request) / that received the audience (response). list(character)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BusinessToBusinessSharedAudience <- R6::R6Class(
  "BusinessToBusinessSharedAudience",
  public = list(
    `audience_id` = NULL,
    `permissions` = NULL,
    `recipient_business_ids` = NULL,

    #' @description
    #' Initialize a new BusinessToBusinessSharedAudience class.
    #'
    #' @param audience_id Unique identifier of an audience
    #' @param recipient_business_ids Business IDs to share with or revoke from (request) / that received the audience (response).
    #' @param permissions Permissions granted to the recipients.
    #' @param ... Other optional arguments.
    initialize = function(`audience_id`, `recipient_business_ids`, `permissions` = NULL, ...) {
      if (!missing(`audience_id`)) {
        if (!(is.character(`audience_id`) && length(`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", `audience_id`))
        }
        self$`audience_id` <- `audience_id`
      }
      if (!missing(`recipient_business_ids`)) {
        stopifnot(is.vector(`recipient_business_ids`), length(`recipient_business_ids`) != 0)
        sapply(`recipient_business_ids`, function(x) stopifnot(is.character(x)))
        self$`recipient_business_ids` <- `recipient_business_ids`
      }
      if (!is.null(`permissions`)) {
        stopifnot(is.vector(`permissions`), length(`permissions`) != 0)
        sapply(`permissions`, function(x) stopifnot(R6::is.R6(x)))
        self$`permissions` <- `permissions`
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
    #' @return BusinessToBusinessSharedAudience as a base R list.
    #' @examples
    #' # convert array of BusinessToBusinessSharedAudience (x) to a data frame
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
    #' Convert BusinessToBusinessSharedAudience to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BusinessToBusinessSharedAudienceObject <- list()
      if (!is.null(self$`audience_id`)) {
        BusinessToBusinessSharedAudienceObject[["audience_id"]] <-
          self$`audience_id`
      }
      if (!is.null(self$`permissions`)) {
        BusinessToBusinessSharedAudienceObject[["permissions"]] <-
          self$extractSimpleType(self$`permissions`)
      }
      if (!is.null(self$`recipient_business_ids`)) {
        BusinessToBusinessSharedAudienceObject[["recipient_business_ids"]] <-
          self$`recipient_business_ids`
      }
      return(BusinessToBusinessSharedAudienceObject)
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
    #' Deserialize JSON string into an instance of BusinessToBusinessSharedAudience
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessToBusinessSharedAudience
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`audience_id`)) {
        self$`audience_id` <- this_object$`audience_id`
      }
      if (!is.null(this_object$`permissions`)) {
        self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`recipient_business_ids`)) {
        self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BusinessToBusinessSharedAudience in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BusinessToBusinessSharedAudience
    #'
    #' @param input_json the JSON input
    #' @return the instance of BusinessToBusinessSharedAudience
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`audience_id` <- this_object$`audience_id`
      self$`permissions` <- ApiClient$new()$deserializeObj(this_object$`permissions`, "array[Role]", loadNamespace("openapi"))
      self$`recipient_business_ids` <- ApiClient$new()$deserializeObj(this_object$`recipient_business_ids`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to BusinessToBusinessSharedAudience and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `audience_id`
      if (!is.null(input_json$`audience_id`)) {
        if (!(is.character(input_json$`audience_id`) && length(input_json$`audience_id`) == 1)) {
          stop(paste("Error! Invalid data for `audience_id`. Must be a string:", input_json$`audience_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessToBusinessSharedAudience: the required field `audience_id` is missing."))
      }
      # check the required field `recipient_business_ids`
      if (!is.null(input_json$`recipient_business_ids`)) {
        stopifnot(is.vector(input_json$`recipient_business_ids`), length(input_json$`recipient_business_ids`) != 0)
        tmp <- sapply(input_json$`recipient_business_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BusinessToBusinessSharedAudience: the required field `recipient_business_ids` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BusinessToBusinessSharedAudience
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        return(FALSE)
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        return(FALSE)
      }

      # check if the required `recipient_business_ids` is null
      if (is.null(self$`recipient_business_ids`)) {
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
      # check if the required `audience_id` is null
      if (is.null(self$`audience_id`)) {
        invalid_fields["audience_id"] <- "Non-nullable required field `audience_id` cannot be null."
      }

      if (!str_detect(self$`audience_id`, "^\\d+$")) {
        invalid_fields["audience_id"] <- "Invalid value for `audience_id`, must conform to the pattern ^\\d+$."
      }

      # check if the required `recipient_business_ids` is null
      if (is.null(self$`recipient_business_ids`)) {
        invalid_fields["recipient_business_ids"] <- "Non-nullable required field `recipient_business_ids` cannot be null."
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
# BusinessToBusinessSharedAudience$unlock()
#
## Below is an example to define the print function
# BusinessToBusinessSharedAudience$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BusinessToBusinessSharedAudience$lock()

